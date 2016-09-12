package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariationsPropertySetOption extends EtsyService {
	@JsonProperty("property_option_id")
	private Integer propertyOptionId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("formatted_name")
	private String formattedName;
	/**
	 * @return the propertyOptionId
	 */
	public Integer getPropertyOptionId() {
		return propertyOptionId;
	}
	/**
	 * @param propertyOptionId the propertyOptionId to set
	 */
	public void setPropertyOptionId(Integer propertyOptionId) {
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
	@JsonIgnore
	public static void getAllSuggestedPropertyOptions(){EtsyService.getService("/property_options/suggested");}
}
