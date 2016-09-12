package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShippingOption extends EtsyService {
	@JsonProperty("option_id")
	private String optionId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("option_type")
	private Integer optionType;
	@JsonProperty("cost")
	private String cost;
	@JsonProperty("currency_code")
	private String currencyCode;
	/**
	 * @return the optionId
	 */
	public String getOptionId() {
		return optionId;
	}
	/**
	 * @param optionId the optionId to set
	 */
	public void setOptionId(String optionId) {
		this.optionId = optionId;
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
	 * @return the optionType
	 */
	public Integer getOptionType() {
		return optionType;
	}
	/**
	 * @param optionType the optionType to set
	 */
	public void setOptionType(Integer optionType) {
		this.optionType = optionType;
	}
	/**
	 * @return the cost
	 */
	public String getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(String cost) {
		this.cost = cost;
	}
	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}
	/**
	 * @param currencyCode the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
}
