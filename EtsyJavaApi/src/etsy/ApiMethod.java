package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiMethod {
	@JsonProperty("name")
	private String name;
	@JsonProperty("uri")
	private String uri;
	@JsonProperty("params")
	private ArrayList<String> params;
	@JsonProperty("defaults")
	private ArrayList<String> defaults;
	@JsonProperty("type")
	private String type;
	@JsonProperty("visibility")
	private String visibility;
	@JsonProperty("http_method")
	private String httpMethod;
	/**
	 * Get a list of all methods available.
	 */
	public static String getMethodTable(){
		return EtsyService.getService("/");
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}
	/**
	 * @param uri the uri to set
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}
	/**
	 * @return the params
	 */
	public ArrayList<String> getParams() {
		return params;
	}
	/**
	 * @param params the params to set
	 */
	public void setParams(ArrayList<String> params) {
		this.params = params;
	}
	/**
	 * @return the defaults
	 */
	public ArrayList<String> getDefaults() {
		return defaults;
	}
	/**
	 * @param defaults the defaults to set
	 */
	public void setDefaults(ArrayList<String> defaults) {
		this.defaults = defaults;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the visibility
	 */
	public String getVisibility() {
		return visibility;
	}
	/**
	 * @param visibility the visibility to set
	 */
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	/**
	 * @return the http_method
	 */
	public String getHttp_method() {
		return httpMethod;
	}
	/**
	 * @param http_method the http_method to set
	 */
	public void setHttp_method(String httpMethod) {
		this.httpMethod = httpMethod;
	}
}
