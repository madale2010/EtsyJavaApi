package com.madbox.etsyApi;

import java.util.Map;

public class VariationsPropertySet {
	private int propertySetId;
	private Map<Integer, VariationsPropertySetProperty> properties;
	private Map<Integer, VariationsPropertySetProperty> qualifyingProperties;
	private Map<Integer, String> options;
	private Map<Integer, VariationsPropertyQualifier> qualifiers;
	/**
	 * @return the propertySetId
	 */
	public int getPropertySetId() {
		return propertySetId;
	}
	/**
	 * @param propertySetId the propertySetId to set
	 */
	public void setPropertySetId(int propertySetId) {
		this.propertySetId = propertySetId;
	}
	/**
	 * @return the properties
	 */
	public Map<Integer, VariationsPropertySetProperty> getProperties() {
		return properties;
	}
	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Map<Integer, VariationsPropertySetProperty> properties) {
		this.properties = properties;
	}
	/**
	 * @return the qualifyingProperties
	 */
	public Map<Integer, VariationsPropertySetProperty> getQualifyingProperties() {
		return qualifyingProperties;
	}
	/**
	 * @param qualifyingProperties the qualifyingProperties to set
	 */
	public void setQualifyingProperties(Map<Integer, VariationsPropertySetProperty> qualifyingProperties) {
		this.qualifyingProperties = qualifyingProperties;
	}
	/**
	 * @return the options
	 */
	public Map<Integer, String> getOptions() {
		return options;
	}
	/**
	 * @param options the options to set
	 */
	public void setOptions(Map<Integer, String> options) {
		this.options = options;
	}
	/**
	 * @return the qualifiers
	 */
	public Map<Integer, VariationsPropertyQualifier> getQualifiers() {
		return qualifiers;
	}
	/**
	 * @param qualifiers the qualifiers to set
	 */
	public void setQualifiers(Map<Integer, VariationsPropertyQualifier> qualifiers) {
		this.qualifiers = qualifiers;
	}
	/**
	*Find the property set for the category id
	*/
	public static void findPropertySet(){EtsyService.getService("/property_sets");}


}
