package etsy;

import com.google.api.client.util.Key;

public class OAuthAccessToken {
	 
	 private Key key; 
	  
	 
	private String service; 
	  
	 
	private String userId; 
	  
	 
	private String token; 
	  
	 
	private String secret; 
	  
	 public OAuthAccessToken(String service, String userId, String token, String secret) { 
	  this.service = service; 
	  this.userId = userId; 
	  this.token = token; 
	  this.secret = secret; 
	 } 
	  
	 public Key getKey() { 
	  return key; 
	 } 
	  
	 public String getService() { 
	  return service; 
	 } 
	  
	 public String getUserId() { 
	  return userId; 
	 } 
	 
	 public String getToken() { 
	  return token; 
	 } 
	  
	 public String getSecret() { 
	  return secret; 
	 } 
	}
