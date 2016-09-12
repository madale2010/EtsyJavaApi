package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShippingInfo extends EtsyService {
	@JsonProperty("shipping_info_id")
	private Integer shippingInfoId;
	@JsonProperty("origin_country_id")
	private Integer originCountryId;
	@JsonProperty("destination_country_id")
	private Integer destinationCountryId;
	@JsonProperty("currency_code")
	private String currencyCode;
	@JsonProperty("primary_cost")
	private Float primaryCost;
	@JsonProperty("secondary_cost")
	private Float secondaryCost;
	@JsonProperty("listing_id")
	private Integer listingId;
	@JsonProperty("region_id")
	private Integer regionId;
	@JsonProperty("origin_country_name")
	private String originCountryName;
	@JsonProperty("destination_country_name")
	private String destinationCountryName;
	/**
	 * @return the shippingInfoId
	 */
	public Integer getShippingInfoId() {
		return shippingInfoId;
	}
	/**
	 * @param shippingInfoId the shippingInfoId to set
	 */
	public void setShippingInfoId(Integer shippingInfoId) {
		this.shippingInfoId = shippingInfoId;
	}
	/**
	 * @return the originCountryId
	 */
	public Integer getOriginCountryId() {
		return originCountryId;
	}
	/**
	 * @param originCountryId the originCountryId to set
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
	 * @param destinationCountryId the destinationCountryId to set
	 */
	public void setDestinationCountryId(Integer destinationCountryId) {
		this.destinationCountryId = destinationCountryId;
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
	 * @return the primaryCost
	 */
	public Float getPrimaryCost() {
		return primaryCost;
	}
	/**
	 * @param primaryCost the primaryCost to set
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
	 * @param secondaryCost the secondaryCost to set
	 */
	public void setSecondaryCost(Float secondaryCost) {
		this.secondaryCost = secondaryCost;
	}
	/**
	 * @return the listingId
	 */
	public Integer getListingId() {
		return listingId;
	}
	/**
	 * @param listingId the listingId to set
	 */
	public void setListingId(Integer listingId) {
		this.listingId = listingId;
	}
	/**
	 * @return the regionId
	 */
	public Integer getRegionId() {
		return regionId;
	}
	/**
	 * @param regionId the regionId to set
	 */
	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}
	/**
	 * @return the originCountryName
	 */
	public String getOriginCountryName() {
		return originCountryName;
	}
	/**
	 * @param originCountryName the originCountryName to set
	 */
	public void setOriginCountryName(String originCountryName) {
		this.originCountryName = originCountryName;
	}
	/**
	 * @return the destinationCountryName
	 */
	public String getDestinationCountryName() {
		return destinationCountryName;
	}
	/**
	 * @param destinationCountryName the destinationCountryName to set
	 */
	public void setDestinationCountryName(String destinationCountryName) {
		this.destinationCountryName = destinationCountryName;
	}
	/**
	*Retrieves a set of ShippingProfileEntries objects associated to a Listing.
	*/
	@JsonIgnore
	public static void getAllListingShippingProfileEntries(Integer listingId){EtsyService.getService("/listings/"+listingId+"/shipping/info");}
	/**
	*Creates a new ShippingInfo.
	*/
	@JsonIgnore
	public void createShippingInfo(Integer listingId){EtsyService.postService("/listings/"+listingId+"/shipping/info", this);}
	/**
	*Retrieves a ShippingInfo by id.
	*/
	@JsonIgnore
	public static void getShippingInfo(Integer shippingInfoId){EtsyService.getService("/shipping/info/"+shippingInfoId);}
	/**
	*Updates a ShippingInfo with the given id.
	*/
	@JsonIgnore
	public void updateShippingInfo(Integer shippingInfoId){EtsyService.putService("/shipping/info/"+shippingInfoId, this);}
	/**
	*Deletes the ShippingInfo with the given id.
	*/
	@JsonIgnore
	public static void deleteShippingInfo(Integer shippingInfoId){EtsyService.deleteService("/shipping/info/"+shippingInfoId);}
}
