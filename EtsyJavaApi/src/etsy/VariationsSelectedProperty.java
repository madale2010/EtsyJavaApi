package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariationsSelectedProperty extends EtsyService {
	@JsonProperty("property_id")
	private Integer propertyId;
	@JsonProperty("value_id")
	private Integer valueId;
	@JsonProperty("formatted_name")
	private String formattedName;
	@JsonProperty("formatted_value")
	private String formattedValue;
	@JsonProperty("is_valid")
	private Boolean isValid;
	/**
	 * @return the propertyId
	 */
	public Integer getPropertyId() { 
		return propertyId;
	}
	/**
	 * @param propertyId the propertyId to set
	 */
	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}
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
	public Boolean isValid() {
		return isValid;
	}
	/**
	 * @param isValid the isValid to set
	 */
	public void setValid(Boolean isValid) {
		this.isValid = isValid;
	}
}
