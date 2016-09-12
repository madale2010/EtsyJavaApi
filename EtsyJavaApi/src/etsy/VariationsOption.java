package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariationsOption extends EtsyService {
	@JsonProperty("value_id")
	private Integer valueId;
	@JsonProperty("value")
	private String value;
	@JsonProperty("formatted_value")
	private String formattedValue;
	@JsonProperty("is_available")
	private Boolean isAvailable;
	@JsonProperty("price_diff")
	private Integer priceDiff;
	@JsonProperty("price")
	private Integer price;
	/**
	 * @return the valueId
	 */
	public Integer getValueId() {
		return valueId;
	}
	/**
	 * @param valueId the valueId to set
	 */
	public void setValueId(Integer valueId) {
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
	public Boolean isAvailable() {
		return isAvailable;
	}
	/**
	 * @param isAvailable the isAvailable to set
	 */
	public void setAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	/**
	 * @return the priceDiff
	 */
	public Integer getPriceDiff() {
		return priceDiff;
	}
	/**
	 * @param priceDiff the priceDiff to set
	 */
	public void setPriceDiff(Integer priceDiff) {
		this.priceDiff = priceDiff;
	}
	/**
	 * @return the price
	 */
	public Integer getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}
	
}
