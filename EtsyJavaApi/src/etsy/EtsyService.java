package etsy;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth1AccessToken;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth10aService;

import oauth.signpost.OAuth;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.basic.DefaultOAuthConsumer;
import oauth.signpost.basic.DefaultOAuthProvider;

public class EtsyService  {
	
	private static final String client_id = "";
	private static final String client_secret = "";
	private static final String access_token = "";
	private static final String token_secret = "";
	private static OAuth10aService service = new ServiceBuilder().apiKey(client_id).apiSecret(client_secret).build(EtsyApi.instance());
	private static OAuth1AccessToken accessToken = new OAuth1AccessToken(access_token, token_secret);
	private static String currentUser="__SELF__";
	public EtsyService(){
		currentUser="__SELF__";
	}
		/**
	 * @return the service
	 */
	public static OAuth10aService getService() {
		return service;
	}
	/**
	 * @param service the service to set
	 */
	public static void setService(OAuth10aService service) {
		EtsyService.service = service;
	}
	/**
	 * @return the accessToken
	 */
	public static OAuth1AccessToken getToken() {
		return accessToken;
	}
	/**
	 * @param accessToken the accessToken to set
	 */
	public static void setAccessToken(OAuth1AccessToken accessToken) {
		EtsyService.accessToken = accessToken;
	}
	/**
	 * @return the clientId
	 */
	public static String getClientId() {
		return client_id;
	}
	/**
	 * @return the clientSecret
	 */
	public static String getClientSecret() {
		return client_secret;
	}
	/**
	 * @return the accessToken
	 */
	public static String getAccessToken() {
		return access_token;
	}
	/**
	 * @return the tokenSecret
	 */
	public static String getTokenSecret() {
		return token_secret;
	}
	public static void accessEtsyAccount(String consumer_key, String consumer_secret, String requestToken, String tokenSecret, String shopName) throws Throwable{

	    OAuthConsumer consumer = new DefaultOAuthConsumer( consumer_key, consumer_secret
	            );
	    if(requestToken==null || tokenSecret==null ){
	        OAuthProvider provider = new DefaultOAuthProvider(
	                "https://openapi.etsy.com/v2/oauth/request_token?scope=email_r%20listings_r%20listings_w%20listings_d%20transactions_r%20billing_r%20profile_r",
	                "https://openapi.etsy.com/v2/oauth/access_token",
	                "https://www.etsy.com/oauth/signin");

	        System.out.println("Fetching request token from Etsy...");
	        
	        // we do not support callbacks, thus pass OOB
	        String authUrl = provider.retrieveRequestToken(consumer, OAuth.OUT_OF_BAND);
	        System.out.println("Request token: " + consumer.getToken());
	        System.out.println("Token secret: " + consumer.getTokenSecret());
	        System.out.println("Now visit:\n" + authUrl
	                + "\n... and grant this app authorization");
	        if(Desktop.isDesktopSupported()){
	            Desktop desktop = Desktop.getDesktop();
	            try {
	                desktop.browse(new URI(authUrl));
	            } catch (IOException | URISyntaxException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }else{
	            Runtime runtime = Runtime.getRuntime();
	            try {
	                runtime.exec("xdg-open " + authUrl);
	            } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }
	        System.out.println("Enter the PIN code and hit ENTER when you're done:");

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String pin = br.readLine();

	        System.out.println("Fetching access token from Etsy...");

	        provider.retrieveAccessToken(consumer, pin);
	    } else {
	        consumer.setTokenWithSecret(requestToken, tokenSecret);

	    }
	        System.out.println("Access token: " + consumer.getToken());
	        System.out.println("Token secret: " + consumer.getTokenSecret());

	        URL url = new URL("https://openapi.etsy.com/v2/private/shops/"+shopName+"/transactions");

	        HttpURLConnection request = (HttpURLConnection) url.openConnection();

	        consumer.sign(request);

	        System.out.println("Sending request to Etsy...");
	        request.connect();

	        System.out.println("Response: " + request.getResponseCode() + " "
	                + request.getResponseMessage());

	        System.out.println("Payload:");
	        InputStream stream = request.getInputStream();
	        String stringbuff = "";
	        byte[] buffer = new byte[4096];

	        while (stream.read(buffer) > 0) {
	            for (byte b: buffer) {
	                stringbuff += (char)b;
	            }
	        }

	        System.out.print(stringbuff);
	}
	/**
	 * Reads the results given back from a response and loads them into List
	 * object.
	 * @param <T>
	 * @param results
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> ArrayList<T> readResults(String results){
		ArrayList<Listing> resultsList = new ArrayList<Listing>();
		ObjectMapper mapper = new ObjectMapper();
		try {
			JsonNode readTree = mapper.readTree(results);
			JsonNode listingTree = readTree.get("results");
			Iterator<JsonNode> iter = listingTree.iterator();
			while(iter.hasNext()){
				JsonNode modules = iter.next();
				
				resultsList.add(mapper.convertValue(modules, Listing.class));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (ArrayList<T>) resultsList;
	}
	/**
	 * @return the currentUser
	 */
	public static String getCurrentUser() {
		return currentUser;
	}
	/**
	 * @param currentUser the currentUser to set
	 */
	public static void setCurrentUser(String currentUser) {
		EtsyService.currentUser = currentUser;
	}	
	/**
	 * Method for calling get to etsy API. Results are returned in string format.
	 * @param method
	 * @param param
	 * @return results
	 */
	public static String getService(String method){
		 OAuthRequest callRequest = new OAuthRequest(Verb.GET, "https://openapi.etsy.com/v2/"+method, service);
		 service.signRequest(accessToken, callRequest);
		 return sendRequest(callRequest);
	}
	/**
	 * Method for calling get to etsy API without any parameters added. Results are returned in string format.
	 * @param method
	 * @param param
	 * @return results
	 */
	public static String getService(String method, Object param){
		 OAuthRequest callRequest = new OAuthRequest(Verb.GET, "https://openapi.etsy.com/v2/"+method, service);
		 callRequest = addParameterMap(callRequest, param);
		 service.signRequest(accessToken, callRequest);
		 return sendRequest(callRequest);
	}
	/**
	 * Method for calling post to etsy API. Results are returned in string format.
	 * @param method
	 * @param param
	 * @return results
	 */
	public static String postService(String method){
		 OAuthRequest callRequest = new OAuthRequest(Verb.POST, "https://openapi.etsy.com/v2/"+method, service);
		 service.signRequest(accessToken, callRequest);
		 return sendRequest(callRequest);
	}
	/**
	 * Method for calling post to etsy API. Results are returned in string format.
	 * @param method
	 * @param param
	 * @return results
	 */
	public static String postService(String method, Object param){
		 OAuthRequest callRequest = new OAuthRequest(Verb.POST, "https://openapi.etsy.com/v2/"+method, service);
		 callRequest = addParameterMap(callRequest, param);
		 service.signRequest(accessToken, callRequest);
		 return sendRequest(callRequest);
	}
	/**
	 * Method for calling delete to etsy API. Results are returned in string format.
	 * @param method
	 * @param param
	 * @return results
	 */
	public static String deleteService(String method){
		 OAuthRequest callRequest = new OAuthRequest(Verb.DELETE, "https://openapi.etsy.com/v2/"+method, service);
		 service.signRequest(accessToken, callRequest);
		 return sendRequest(callRequest);
	}
	/**
	 * Method for calling delete to etsy API. Results are returned in string format.
	 * @param method
	 * @param param
	 * @return results
	 */
	public static String deleteService(String method, Object param){
		 OAuthRequest callRequest = new OAuthRequest(Verb.DELETE, "https://openapi.etsy.com/v2/"+method, service);
		 callRequest = addParameterMap(callRequest, param);
		 service.signRequest(accessToken, callRequest);
		 return sendRequest(callRequest);
	}
	/**
	 * Method for calling put to etsy API. Results are returned in string format.
	 * @param method
	 * @param param
	 * @return results
	 */
	public static String putService(String method){
		 OAuthRequest callRequest = new OAuthRequest(Verb.PUT, "https://openapi.etsy.com/v2/"+method, service);
		 service.signRequest(accessToken, callRequest);
		 return sendRequest(callRequest);
	}
	/**
	 * Method for calling put to etsy API. Results are returned in string format.
	 * @param method
	 * @param param
	 * @return results
	 */
	public static String putService(String method, Object param){
		 OAuthRequest callRequest = new OAuthRequest(Verb.PUT, "https://openapi.etsy.com/v2/"+method, service);
		 callRequest = addParameterMap(callRequest, param);
		 service.signRequest(accessToken, callRequest);
		 return sendRequest(callRequest);
	}
	/**
	 * Method to take object and parse into a map, from there add each key
	 * to the auth request parameter list.
	 * @param authRequest
	 * @param obj
	 * @return callRequest
	 */
	public static OAuthRequest addParameterMap(OAuthRequest authRequest, Object obj){
		OAuthRequest callRequest = authRequest;
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String temp;
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			temp = mapper.writeValueAsString(obj);		
			map = mapper.readValue(temp, new TypeReference<Map<String, String>>(){});
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		for (Entry<String, Object> entry : map.entrySet()) {
			callRequest.addParameter(entry.getKey(), String.valueOf(entry.getValue()));
			System.out.println("Adding this : "+entry.getKey()+" and "+String.valueOf(entry.getValue()));
		}
		return callRequest;
	}
	/**
	 * This method preps the response of the call request based on the
	 * results returned in the response call.
	 * 
	 * @param callRequest
	 * @return results
	 */
	public static String sendRequest(OAuthRequest callRequest){
		 Response resp= callRequest.send();
		 
		 String results="";
		try {
			if(!resp.isSuccessful()) {
				 throw new EtsyException("\n"+resp.getMessage()+"\n "+resp.getHeader("X-Error-Detail")+"\n");
			 }
			results=resp.getBody();
		} catch (IOException | EtsyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return results;
	}
	/**
	 * Print json format of object
	 */
	public void printJSON() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
