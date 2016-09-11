package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class VariationsOption {
	private int valueId;
	private String value;
	private String formattedValue;
	private boolean isAvailable;
	private int priceDiff;
	private int price;
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
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
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
	 * @return the isAvailable
	 */
	public boolean isAvailable() {
		return isAvailable;
	}
	/**
	 * @param isAvailable the isAvailable to set
	 */
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	/**
	 * @return the priceDiff
	 */
	public int getPriceDiff() {
		return priceDiff;
	}
	/**
	 * @param priceDiff the priceDiff to set
	 */
	public void setPriceDiff(int priceDiff) {
		this.priceDiff = priceDiff;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
}
