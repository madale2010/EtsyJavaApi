package com.madbox.etsyApi;

public class VariationsPropertySetOption {
	private int propertyOptionId;
	private String name;
	private String formattedName;
	/**
	 * @return the propertyOptionId
	 */
	public int getPropertyOptionId() {
		return propertyOptionId;
	}
	/**
	 * @param propertyOptionId the propertyOptionId to set
	 */
	public void setPropertyOptionId(int propertyOptionId) {
		this.propertyOptionId = propertyOptionId;
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
	 * @return the formattedName
	 */
	public String getFormattedName() {
		return formattedName;
	}
	/**
	 * @param formattedName the formattedName to set
	 */
	public void setFormattedName(String formattedName) {
		this.formattedName = formattedName;
	}
	/**
	*Finds all suggested property options for a given property.
	*/
	public static void findAllSuggestedPropertyOptions(){EtsyService.getService("/property_options/suggested");}
}
