package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShippingUpgrade extends EtsyService {
	@JsonProperty("shipping_profile_id")
	private Integer shippingProfileId;
	@JsonProperty("value_id")
	private Integer valueId;
	@JsonProperty("value")
	private String value;
	@JsonProperty("price")
	private Float price;
	@JsonProperty("secondary_price")
	private Float secondaryPrice;
	@JsonProperty("currency_code")
	private String currencyCode;
	@JsonProperty("type")
	private Integer type;
	@JsonProperty("order")
	private Integer order;
	@JsonProperty("language")
	private Integer language;

	/**
	 * @return the shippingProfileId
	 */
	public Integer getShippingProfileId() {
		return shippingProfileId;
	}

	/**
	 * @param shippingProfileId the shippingProfileId to set
	 */
	public void setShippingProfileId(Integer shippingProfileId) {
		this.shippingProfileId = shippingProfileId;
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
	 * @return the price
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Float price) {
		this.price = price;
	}

	/**
	 * @return the secondaryPrice
	 */
	public Float getSecondaryPrice() {
		return secondaryPrice;
	}

	/**
	 * @param secondaryPrice the secondaryPrice to set
	 */
	public void setSecondaryPrice(Float secondaryPrice) {
		this.secondaryPrice = secondaryPrice;
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

	/**
	 * @return the type
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * @return the order
	 */
	public Integer getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Integer order) {
		this.order = order;
	}

	/**
	 * @return the language
	 */
	public Integer getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(Integer language) {
		this.language = language;
	}

	/**
	 * Get the shipping upgrades available for a listing.
	 */
	@JsonIgnore
	public static void getListingShippingUpgrades(Integer listingId) {
		EtsyService.getService("/listings/" + listingId + "/shipping/upgrades");
	}

	/**
	 * Creates a new ShippingUpgrade for the listing. Will unlink the listing if
	 * linked to a ShippingTemplate.
	 */
	@JsonIgnore
	public void createListingShippingUpgrade(Integer listingId) {
		EtsyService.postService("/listings/" + listingId + "/shipping/upgrades", this);
	}

	/**
	 * Updates a ShippingUpgrade on a listing. Will unlink the listing if linked
	 * to a ShippingTemplate.
	 */
	@JsonIgnore
	public void updateListingShippingUpgrade(Integer listingId) {
		EtsyService.putService("/listings/" + listingId + "/shipping/upgrades", this);
	}

	/**
	 * Deletes the ShippingUpgrade from the listing. Will unlink the listing if
	 * linked to a ShippingTemplate.
	 */
	@JsonIgnore
	public static void deleteListingShippingUpgrade(Integer listingId) {
		EtsyService.deleteService("/listings/" + listingId + "/shipping/upgrades");
	}

	/**
	 * Retrieves a list of shipping upgrades for the parent ShippingTemplate
	 */
	@JsonIgnore
	public static void getAllShippingTemplateUpgrades(Integer shippingTemplateId) {
		EtsyService.getService("/shipping/templates/" + shippingTemplateId + "/upgrades");
	}

	/**
	 * Creates a new ShippingUpgrade for the parent ShippingTemplate. Updates
	 * any listings linked to the ShippingTemplate.
	 */
	@JsonIgnore
	public void createShippingTemplateUpgrade(Integer shippingTemplateId) {
		EtsyService.postService("/shipping/templates/" + shippingTemplateId + "/upgrades", this);
	}

	/**
	 * Updates a ShippingUpgrade of the parent ShippingTemplate. Updates any
	 * listings linked to the ShippingTemplate.
	 */
	@JsonIgnore
	public void updateShippingTemplateUpgrade(Integer shippingTemplateId) {
		EtsyService.putService("/shipping/templates/" + shippingTemplateId + "/upgrades", this);
	}

	/**
	 * Deletes the ShippingUpgrade from the parent ShippingTemplate. Updates any
	 * listings linked to the ShippingTemplate.
	 */
	@JsonIgnore
	public static void deleteShippingTemplateUpgrade(Integer shippingTemplateId) {
		EtsyService.deleteService("/shipping/templates/" + shippingTemplateId + "/upgrades");
	}
}
