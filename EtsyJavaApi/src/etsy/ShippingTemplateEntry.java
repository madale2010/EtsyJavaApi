package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShippingTemplateEntry {
	@JsonProperty("shipping_template_entry_id")
	private Integer shippingTemplateEntryId;
	@JsonProperty("shipping_template_id")
	private Integer shippingTemplateId;
	@JsonProperty("currency_code")
	private String currencyCode;
	@JsonProperty("origin_country_id")
	private Integer originCountryId;
	@JsonProperty("destination_country_id")
	private Integer destinationCountryId;
	@JsonProperty("destination_region_id")
	private Integer destinationRegionId;
	@JsonProperty("primary_cost")
	private Float primaryCost;
	@JsonProperty("secondary_cost")
	private Float secondaryCost;

	/**
	 * @return the shippingTemplateEntryId
	 */
	public Integer getShippingTemplateEntryId() {
		return shippingTemplateEntryId;
	}

	/**
	 * @param shippingTemplateEntryId
	 *            the shippingTemplateEntryId to set
	 */
	public void setShippingTemplateEntryId(Integer shippingTemplateEntryId) {
		this.shippingTemplateEntryId = shippingTemplateEntryId;
	}

	/**
	 * @return the shippingTemplateId
	 */
	public Integer getShippingTemplateId() {
		return shippingTemplateId;
	}

	/**
	 * @param shippingTemplateId
	 *            the shippingTemplateId to set
	 */
	public void setShippingTemplateId(Integer shippingTemplateId) {
		this.shippingTemplateId = shippingTemplateId;
	}

	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * @param currencyCode
	 *            the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * @return the originCountryId
	 */
	public Integer getOriginCountryId() {
		return originCountryId;
	}

	/**
	 * @param originCountryId
	 *            the originCountryId to set
	 */
	public void setOriginCountryId(Integer originCountryId) {
		this.originCountryId = originCountryId;
	}

	/**
	 * @return the destinationCountryId
	 */
	public Integer getDestinationCountryId() {
		return destinationCountryId;
	}

	/**
	 * @param destinationCountryId
	 *            the destinationCountryId to set
	 */
	public void setDestinationCountryId(Integer destinationCountryId) {
		this.destinationCountryId = destinationCountryId;
	}

	/**
	 * @return the destinationRegionId
	 */
	public Integer getDestinationRegionId() {
		return destinationRegionId;
	}

	/**
	 * @param destinationRegionId
	 *            the destinationRegionId to set
	 */
	public void setDestinationRegionId(Integer destinationRegionId) {
		this.destinationRegionId = destinationRegionId;
	}

	/**
	 * @return the primaryCost
	 */
	public Float getPrimaryCost() {
		return primaryCost;
	}

	/**
	 * @param primaryCost
	 *            the primaryCost to set
	 */
	public void setPrimaryCost(Float primaryCost) {
		this.primaryCost = primaryCost;
	}

	/**
	 * @return the secondaryCost
	 */
	public Float getSecondaryCost() {
		return secondaryCost;
	}

	/**
	 * @param secondaryCost
	 *            the secondaryCost to set
	 */
	public void setSecondaryCost(Float secondaryCost) {
		this.secondaryCost = secondaryCost;
	}

	/**
	 * Creates a new ShippingTemplateEntry
	 *  Parameters needed
	 *  	shipping_template_id
	 *  	destination_country_id
	 *		primary_cost
	 *		secondary_cost
	 *		destination_region_id
	 * @throws EtsyException 
	 */
	@JsonIgnore
	public void createShippingTemplateEntry() throws EtsyException {
		if(this.shippingTemplateId>0){
			throw new EtsyException("A shipping_template_id is required when creating template.");
		}
		if(this.destinationCountryId>0 || this.primaryCost>0 || this.secondaryCost>0 || this.destinationRegionId>0){
			throw new EtsyException("Required field needed.");
		}
		EtsyService.postService("/shipping/templates/entries", this);
	}

	/**
	 * Retrieves a ShippingTemplateEntry by id.
	 */
	@JsonIgnore
	public static void getShippingTemplateEntry(Integer shippingTemplateEntryId) {
		EtsyService.getService("/shipping/templates/entries/" + shippingTemplateEntryId);
	}

	/**
	 * Updates a ShippingTemplateEntry
	 */
	@JsonIgnore
	public void updateShippingTemplateEntry(Integer shippingTemplateEntryId) {
		EtsyService.putService("/shipping/templates/entries/" + shippingTemplateEntryId, this);
	}

	/**
	 * Deletes the ShippingTemplateEntry
	 */
	@JsonIgnore
	public static void deleteShippingTemplateEntry(Integer shippingTemplateEntryId) {
		EtsyService.deleteService("/shipping/templates/entries/" + shippingTemplateEntryId);
	}
}
