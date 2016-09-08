package com.madbox.etsyApi;

public class VariationsPropertySetOptionModifier {
	private String prefix;
	private String suffix;
	/**
	 * @return the prefix
	 */
	public String getPrefix() {
		return prefix;
	}
	/**
	 * @param prefix the prefix to set
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	/**
	 * @return the suffix
	 */
	public String getSuffix() {
		return suffix;
	}
	/**
	 * @param suffix the suffix to set
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	/**
	*Add a value for a given property.
	*/
	public static void getPropertyOptionModifier(){EtsyService.getService("/property_options/modifiers");}

}
