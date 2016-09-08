package com.madbox.etsyApi;

import java.util.ArrayList;

public class ApiMethod {
	private String name;
	private String uri;
	private ArrayList<String> params;
	private ArrayList<String> defaults;
	private String type;
	private String visibility;
	private String http_method;
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
		return http_method;
	}
	/**
	 * @param http_method the http_method to set
	 */
	public void setHttp_method(String http_method) {
		this.http_method = http_method;
	}
}
