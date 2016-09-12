package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TreasuryListingData extends EtsyService {
	@JsonProperty("user_id")
	private Integer userId;
	@JsonProperty("title")
	private String title;
	@JsonProperty("price")
	private Float price;
	@JsonProperty("currency_code")
	private String currencyCode;
	@JsonProperty("listing_id")
	private Integer listingId;
	@JsonProperty("state")
	private String state;
	@JsonProperty("shop_name")
	private String shopName;
	@JsonProperty("image_id")
	private Integer imageId;
	@JsonProperty("image_url_75x75")
	private String imageUrl75x75;
	@JsonProperty("image_url_170x135")
	private String imageUrl170x135;
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
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
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the shopName
	 */
	public String getShopName() {
		return shopName;
	}
	/**
	 * @param shopName the shopName to set
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * @return the imageId
	 */
	public Integer getImageId() {
		return imageId;
	}
	/**
	 * @param imageId the imageId to set
	 */
	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}
	/**
	 * @return the imageUrl75x75
	 */
	public String getImageUrl75x75() {
		return imageUrl75x75;
	}
	/**
	 * @param imageUrl75x75 the imageUrl75x75 to set
	 */
	public void setImageUrl75x75(String imageUrl75x75) {
		this.imageUrl75x75 = imageUrl75x75;
	}
	/**
	 * @return the imageUrl170x135
	 */
	public String getImageUrl170x135() {
		return imageUrl170x135;
	}
	/**
	 * @param imageUrl170x135 the imageUrl170x135 to set
	 */
	public void setImageUrl170x135(String imageUrl170x135) {
		this.imageUrl170x135 = imageUrl170x135;
	}
}
