package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class VariationsPropertySetProperty {
	private int propertyId;
	private String name;
	private String inputName;
	private String label;
	private String param;
	private String defaultOption;
	private String description;
	private boolean isCustom;
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
	public boolean isCustom() {
		return isCustom;
	}
	/**
	 * @param isCustom the isCustom to set
	 */
	public void setCustom(boolean isCustom) {
		this.isCustom = isCustom;
	}
}
