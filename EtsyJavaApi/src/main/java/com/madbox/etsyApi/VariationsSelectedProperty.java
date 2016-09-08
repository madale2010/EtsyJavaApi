package com.madbox.etsyApi;

public class VariationsSelectedProperty {
	private int propertyId;
	private int valueId;
	private String formattedName;
	private String formattedValue;
	private boolean isValid;
	/**
	 * @return the propertyId
	 */
	public int getPropertyId() { 
		return propertyId;
	}
	/**
	 * @param propertyId the propertyId to set
	 */
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	/**
	 * @return the valueId
	 */
	public int getValueId() {
		return valueId;
	}
	/**
	 * @param valueId the valueId to set
	 */
	public void setValueId(int valueId) {
		this.valueId = valueId;
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
	 * @return the formattedValue
	 */
	public String getFormattedValue() {
		return formattedValue;
	}
	/**
	 * @param formattedValue the formattedValue to set
	 */
	public void setFormattedValue(String formattedValue) {
		this.formattedValue = formattedValue;
	}
	/**
	 * @return the isValid
	 */
	public boolean isValid() {
		return isValid;
	}
	/**
	 * @param isValid the isValid to set
	 */
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
}
