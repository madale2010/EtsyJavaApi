package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Shop extends EtsyService {
	@JsonProperty("shop_id")
	public Integer shopId;
	@JsonProperty("shop_name")
	public String shopName;
	@JsonProperty("first_line")
	private String firstLine;
	@JsonProperty("second_line")
	private String secondLine;
	@JsonProperty("city")
	private String city;
	@JsonProperty("state")
	private String state;
	@JsonProperty("zip")
	private String zip;
	@JsonProperty("country_id")
	private Integer countryId;
	@JsonProperty("user_id")
	public Integer userId;
	@JsonProperty("creation_tsz")
	public Float creationTsz;
	@JsonProperty("title")
	public String title;
	@JsonProperty("announcement")
	public String announcement;
	@JsonProperty("currency_code")
	public String currencyCode;
	@JsonProperty("is_vacation")
	public Boolean isVacation;
	@JsonProperty("vacation_message")
	public String vacationMessage;
	@JsonProperty("sale_message")
	public String saleMessage;
	@JsonProperty("digital_sale_message")
	public String digitalSaleMessage;
	@JsonProperty("last_updated_tsz")
	public Float lastUpdatedTsz;
	@JsonProperty("listing_active_count")
	public Integer listingActiveCount;
	@JsonProperty("digital_listing_count")
	public Integer digitalListingCount;
	@JsonProperty("login_name")
	public String loginName;
	@JsonProperty("lat")
	private Float lat;
	@JsonProperty("lon")
	private Float lon;
	@JsonProperty("accepts_custom_requests")
	public Boolean acceptsCustomRequests;
	@JsonProperty("policy_welcome")
	public String policyWelcome;
	@JsonProperty("policy_payment")
	public String policyPayment;
	@JsonProperty("policy_shipping")
	public String policyShipping;
	@JsonProperty("policy_refunds")
	public String policyRefunds;
	@JsonProperty("policy_additional")
	public String policyAdditional;
	@JsonProperty("policy_seller_info")
	public String policySellerInfo;
	@JsonProperty("policy_updated_tsz")
	public Float policyUpdatedTsz;
	@JsonProperty("policy_has_private_receipt_info")
	public Boolean policyHasPrivateReceiptInfo;
	@JsonProperty("vacation_autoreply")
	public String vacationAutoreply;
	@JsonProperty("ga_code")
	private String gaCode;
	@JsonProperty("name")
	private String name;
	@JsonProperty("url")
	public String url;
	@JsonProperty("image_url_760x100")
	public String imageUrl_760x100;
	@JsonProperty("num_favorers")
	public Integer numFavorers;
	@JsonProperty("languages")
	public ArrayList<String> languages;
	@JsonProperty("upcoming_local_event_id")
	public Integer upcomingLocalEventId;
	@JsonProperty("icon_url_fullxfull")
	public String iconUrlFullxfull;
	@JsonProperty("is_using_structured_policies")
	public Boolean isUsingStructuredPolicies;
	@JsonProperty("has_onboarded_structured_policies")
	public Boolean hasOnboardedStructuredPolicies;
	@JsonProperty("has_unstructured_policies")
	public Boolean hasUnStructuredPolicies;
	/**
	 * @return the shopId
	 */
	public Integer getShopId() {
		return shopId;
	}
	/**
	 * @param shopId the shopId to set
	 */
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
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
	 * @return the firstLine
	 */
	public String getFirstLine() {
		return firstLine;
	}
	/**
	 * @param firstLine the firstLine to set
	 */
	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}
	/**
	 * @return the secondLine
	 */
	public String getSecondLine() {
		return secondLine;
	}
	/**
	 * @param secondLine the secondLine to set
	 */
	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
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
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	/**
	 * @return the countryId
	 */
	public Integer getCountryId() {
		return countryId;
	}
	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
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
	 * @return the creationTsz
	 */
	public Float getCreationTsz() {
		return creationTsz;
	}
	/**
	 * @param creationTsz the creationTsz to set
	 */
	public void setCreationTsz(Float creationTsz) {
		this.creationTsz = creationTsz;
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
	 * @return the announcement
	 */
	public String getAnnouncement() {
		return announcement;
	}
	/**
	 * @param announcement the announcement to set
	 */
	public void setAnnouncement(String announcement) {
		this.announcement = announcement;
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
	 * @return the isVacation
	 */
	public Boolean isVacation() {
		return isVacation;
	}
	/**
	 * @param isVacation the isVacation to set
	 */
	public void setVacation(Boolean isVacation) {
		this.isVacation = isVacation;
	}
	/**
	 * @return the vacationMessage
	 */
	public String getVacationMessage() {
		return vacationMessage;
	}
	/**
	 * @param vacationMessage the vacationMessage to set
	 */
	public void setVacationMessage(String vacationMessage) {
		this.vacationMessage = vacationMessage;
	}
	/**
	 * @return the saleMessage
	 */
	public String getSaleMessage() {
		return saleMessage;
	}
	/**
	 * @param saleMessage the saleMessage to set
	 */
	public void setSaleMessage(String saleMessage) {
		this.saleMessage = saleMessage;
	}
	/**
	 * @return the digitalSaleMessage
	 */
	public String getDigitalSaleMessage() {
		return digitalSaleMessage;
	}
	/**
	 * @param digitalSaleMessage the digitalSaleMessage to set
	 */
	public void setDigitalSaleMessage(String digitalSaleMessage) {
		this.digitalSaleMessage = digitalSaleMessage;
	}
	/**
	 * @return the lastUpdatedTsz
	 */
	public Float getLastUpdatedTsz() {
		return lastUpdatedTsz;
	}
	/**
	 * @param lastUpdatedTsz the lastUpdatedTsz to set
	 */
	public void setLastUpdatedTsz(Float lastUpdatedTsz) {
		this.lastUpdatedTsz = lastUpdatedTsz;
	}
	/**
	 * @return the listingActiveCount
	 */
	public Integer getListingActiveCount() {
		return listingActiveCount;
	}
	/**
	 * @param listingActiveCount the listingActiveCount to set
	 */
	public void setListingActiveCount(Integer listingActiveCount) {
		this.listingActiveCount = listingActiveCount;
	}
	/**
	 * @return the digitalListingCount
	 */
	public Integer getDigitalListingCount() {
		return digitalListingCount;
	}
	/**
	 * @param digitalListingCount the digitalListingCount to set
	 */
	public void setDigitalListingCount(Integer digitalListingCount) {
		this.digitalListingCount = digitalListingCount;
	}
	/**
	 * @return the loginName
	 */
	public String getLoginName() {
		return loginName;
	}
	/**
	 * @param loginName the loginName to set
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	/**
	 * @return the lat
	 */
	public Float getLat() {
		return lat;
	}
	/**
	 * @param lat the lat to set
	 */
	public void setLat(Float lat) {
		this.lat = lat;
	}
	/**
	 * @return the lon
	 */
	public Float getLon() {
		return lon;
	}
	/**
	 * @param lon the lon to set
	 */
	public void setLon(Float lon) {
		this.lon = lon;
	}
	/**
	 * @return the acceptsCustomRequests
	 */
	public Boolean isAcceptsCustomRequests() {
		return acceptsCustomRequests;
	}
	/**
	 * @param acceptsCustomRequests the acceptsCustomRequests to set
	 */
	public void setAcceptsCustomRequests(Boolean acceptsCustomRequests) {
		this.acceptsCustomRequests = acceptsCustomRequests;
	}
	/**
	 * @return the policyWelcome
	 */
	public String getPolicyWelcome() {
		return policyWelcome;
	}
	/**
	 * @param policyWelcome the policyWelcome to set
	 */
	public void setPolicyWelcome(String policyWelcome) {
		this.policyWelcome = policyWelcome;
	}
	/**
	 * @return the policyPayment
	 */
	public String getPolicyPayment() {
		return policyPayment;
	}
	/**
	 * @param policyPayment the policyPayment to set
	 */
	public void setPolicyPayment(String policyPayment) {
		this.policyPayment = policyPayment;
	}
	/**
	 * @return the policyShipping
	 */
	public String getPolicyShipping() {
		return policyShipping;
	}
	/**
	 * @param policyShipping the policyShipping to set
	 */
	public void setPolicyShipping(String policyShipping) {
		this.policyShipping = policyShipping;
	}
	/**
	 * @return the policyRefunds
	 */
	public String getPolicyRefunds() {
		return policyRefunds;
	}
	/**
	 * @param policyRefunds the policyRefunds to set
	 */
	public void setPolicyRefunds(String policyRefunds) {
		this.policyRefunds = policyRefunds;
	}
	/**
	 * @return the policyAdditional
	 */
	public String getPolicyAdditional() {
		return policyAdditional;
	}
	/**
	 * @param policyAdditional the policyAdditional to set
	 */
	public void setPolicyAdditional(String policyAdditional) {
		this.policyAdditional = policyAdditional;
	}
	/**
	 * @return the policySellerInfo
	 */
	public String getPolicySellerInfo() {
		return policySellerInfo;
	}
	/**
	 * @param policySellerInfo the policySellerInfo to set
	 */
	public void setPolicySellerInfo(String policySellerInfo) {
		this.policySellerInfo = policySellerInfo;
	}
	/**
	 * @return the policyUpdatedTsz
	 */
	public Float getPolicyUpdatedTsz() {
		return policyUpdatedTsz;
	}
	/**
	 * @param policyUpdatedTsz the policyUpdatedTsz to set
	 */
	public void setPolicyUpdatedTsz(Float policyUpdatedTsz) {
		this.policyUpdatedTsz = policyUpdatedTsz;
	}
	/**
	 * @return the policyHasPrivateReceiptInfo
	 */
	public Boolean isPolicyHasPrivateReceiptInfo() {
		return policyHasPrivateReceiptInfo;
	}
	/**
	 * @param policyHasPrivateReceiptInfo the policyHasPrivateReceiptInfo to set
	 */
	public void setPolicyHasPrivateReceiptInfo(Boolean policyHasPrivateReceiptInfo) {
		this.policyHasPrivateReceiptInfo = policyHasPrivateReceiptInfo;
	}
	/**
	 * @return the vacationAutoreply
	 */
	public String getVacationAutoreply() {
		return vacationAutoreply;
	}
	/**
	 * @param vacationAutoreply the vacationAutoreply to set
	 */
	public void setVacationAutoreply(String vacationAutoreply) {
		this.vacationAutoreply = vacationAutoreply;
	}
	/**
	 * @return the gaCode
	 */
	public String getGaCode() {
		return gaCode;
	}
	/**
	 * @param gaCode the gaCode to set
	 */
	public void setGaCode(String gaCode) {
		this.gaCode = gaCode;
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
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the imageUrl_760x100
	 */
	public String getImageUrl_760x100() {
		return imageUrl_760x100;
	}
	/**
	 * @param imageUrl_760x100 the imageUrl_760x100 to set
	 */
	public void setImageUrl_760x100(String imageUrl_760x100) {
		this.imageUrl_760x100 = imageUrl_760x100;
	}
	/**
	 * @return the numFavorers
	 */
	public Integer getNumFavorers() {
		return numFavorers;
	}
	/**
	 * @param numFavorers the numFavorers to set
	 */
	public void setNumFavorers(Integer numFavorers) {
		this.numFavorers = numFavorers;
	}
	/**
	 * @return the languages
	 */
	public ArrayList<String> getLanguages() {
		return languages;
	}
	/**
	 * @param languages the languages to set
	 */
	public void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}
	/**
	 * @return the upcomingLocalEventId
	 */
	public Integer getUpcomingLocalEventId() {
		return upcomingLocalEventId;
	}
	/**
	 * @param upcomingLocalEventId the upcomingLocalEventId to set
	 */
	public void setUpcomingLocalEventId(Integer upcomingLocalEventId) {
		this.upcomingLocalEventId = upcomingLocalEventId;
	}
	/**
	 * @return the iconUrlFullxfull
	 */
	public String getIconUrlFullxfull() {
		return iconUrlFullxfull;
	}
	/**
	 * @param iconUrlFullxfull the iconUrlFullxfull to set
	 */
	public void setIconUrlFullxfull(String iconUrlFullxfull) {
		this.iconUrlFullxfull = iconUrlFullxfull;
	}
	/**
	 * @return the isUsingStructuredPolicies
	 */
	public Boolean isUsingStructuredPolicies() {
		return isUsingStructuredPolicies;
	}
	/**
	 * @param isUsingStructuredPolicies the isUsingStructuredPolicies to set
	 */
	public void setUsingStructuredPolicies(Boolean isUsingStructuredPolicies) {
		this.isUsingStructuredPolicies = isUsingStructuredPolicies;
	}
	/**
	 * @return the hasOnboardedStructuredPolicies
	 */
	public Boolean isHasOnboardedStructuredPolicies() {
		return hasOnboardedStructuredPolicies;
	}
	/**
	 * @param hasOnboardedStructuredPolicies the hasOnboardedStructuredPolicies to set
	 */
	public void setHasOnboardedStructuredPolicies(Boolean hasOnboardedStructuredPolicies) {
		this.hasOnboardedStructuredPolicies = hasOnboardedStructuredPolicies;
	}
	/**
	 * @return the hasUnStructuredPolicies
	 */
	public Boolean isHasUnStructuredPolicies() {
		return hasUnStructuredPolicies;
	}
	/**
	 * @param hasUnStructuredPolicies the hasUnStructuredPolicies to set
	 */
	public void setHasUnStructuredPolicies(Boolean hasUnStructuredPolicies) {
		this.hasUnStructuredPolicies = hasUnStructuredPolicies;
	}

	/**
	*Finds all Shops. If there is a keywords parameter, finds shops with shop_name starting with keywords.
	*/
	@JsonIgnore
	public static void getAllShops(){EtsyService.getService("/shops");}
	/**
	*Retrieves a Shop by id.
	*/
	@JsonIgnore
	public static void getShop(String shopId){EtsyService.getService("/shops/"+shopId);}
	/**
	*Updates a Shop
	*/
	@JsonIgnore
	public void updateShop(String shopId){EtsyService.putService("/shops/"+shopId, this);}
	/**
	*Upload a new shop banner image
	*/
	@JsonIgnore
	public void uploadShopBanner(String shopId){EtsyService.postService("/shops/"+shopId+"/appearance/banner", this);}
	/**
	*Deletes a shop banner image
	*/
	@JsonIgnore
	public static void deleteShopBanner(String shopId){EtsyService.deleteService("/shops/"+shopId+"/appearance/banner");}
	/**
	*Retrieves a shop by a listing id.
	*/
	@JsonIgnore
	public static void getListingShop(Integer listingId){EtsyService.getService("/shops/listing/"+listingId);}
	/**
	*Retrieves a set of Shop objects associated to a User.
	*/
	@JsonIgnore
	public static void getAllUserShops(String userId){EtsyService.getService("/users/"+userId+"/shops");}
}
