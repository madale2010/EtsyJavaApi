package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariationsPropertySetProperty extends EtsyService {
	@JsonProperty("property_id")
	private Integer propertyId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("input_name")
	private String inputName;
	@JsonProperty("label")
	private String label;
	@JsonProperty("param")
	private String param;
	@JsonProperty("default_option")
	private String defaultOption;
	@JsonProperty("description")
	private String description;
	@JsonProperty("is_custom")
	private Boolean isCustom;
	@JsonProperty("title")
	private String title;
	/**
	 * @return the isCustom
	 */
	public Boolean getIsCustom() {
		return isCustom;
	}
	/**
	 * @param isCustom the isCustom to set
	 */
	public void setIsCustom(Boolean isCustom) {
		this.isCustom = isCustom;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
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
	 * @return the inputName
	 */
	public String getInputName() {
		return inputName;
	}
	/**
	 * @param inputName the inputName to set
	 */
	public void setInputName(String inputName) {
		this.inputName = inputName;
	}
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	/**
	 * @return the param
	 */
	public String getParam() {
		return param;
	}
	/**
	 * @param param the param to set
	 */
	public void setParam(String param) {
		this.param = param;
	}
	/**
	 * @return the defaultOption
	 */
	public String getDefaultOption() {
		return defaultOption;
	}
	/**
	 * @param defaultOption the defaultOption to set
	 */
	public void setDefaultOption(String defaultOption) {
		this.defaultOption = defaultOption;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the isCustom
	 */
	public Boolean isCustom() {
		return isCustom;
	}
	/**
	 * @param isCustom the isCustom to set
	 */
	public void setCustom(Boolean isCustom) {
		this.isCustom = isCustom;
	}
}
