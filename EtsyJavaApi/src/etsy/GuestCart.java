package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GuestCart extends EtsyService {
 @JsonProperty("cart_id")
	private Integer cartId;
 @JsonProperty("shop_name")
	private String shopName;
 @JsonProperty("message_to_seller")
	private String messageToSeller;
 @JsonProperty("destination_country_id")
	private Integer destinationCountryId;
 @JsonProperty("coupon_code")
	private String couponCode;
 @JsonProperty("currency_code")
	private String currencyCode;
 @JsonProperty("total")
	private String total;
 @JsonProperty("subtotal")
	private String subtotal;
 @JsonProperty("shipping_cost")
	private String shippingCost;
 @JsonProperty("tax_cost")
	private String taxCost;
 @JsonProperty("discount_amount")
	private String discountAmount;
 @JsonProperty("shipping_discount_amount")
	private String shippingDiscountAmount;
 @JsonProperty("tax_discount_amount")
	private String taxDiscountAmount;
 @JsonProperty("url")
	private String url;
 @JsonProperty("listings")
 private ArrayList<CartListing> listings;
 @JsonProperty("is_download_only")
	private Boolean isDownloadOnly;
 @JsonProperty("has_vat")
	private Boolean hasVat;
 @JsonProperty("shipping_option")
 private ShippingOption shippingOption;
/**
 * @return the cartId
 */
public Integer getCartId() {
	return cartId;
}
/**
 * @param cartId the cartId to set
 */
public void setCartId(Integer cartId) {
	this.cartId = cartId;
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
 * @return the messageToSeller
 */
public String getMessageToSeller() {
	return messageToSeller;
}
/**
 * @param messageToSeller the messageToSeller to set
 */
public void setMessageToSeller(String messageToSeller) {
	this.messageToSeller = messageToSeller;
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
 * @return the couponCode
 */
public String getCouponCode() {
	return couponCode;
}
/**
 * @param couponCode the couponCode to set
 */
public void setCouponCode(String couponCode) {
	this.couponCode = couponCode;
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
 * @return the total
 */
public String getTotal() {
	return total;
}
/**
 * @param total the total to set
 */
public void setTotal(String total) {
	this.total = total;
}
/**
 * @return the subtotal
 */
public String getSubtotal() {
	return subtotal;
}
/**
 * @param subtotal the subtotal to set
 */
public void setSubtotal(String subtotal) {
	this.subtotal = subtotal;
}
/**
 * @return the shippingCost
 */
public String getShippingCost() {
	return shippingCost;
}
/**
 * @param shippingCost the shippingCost to set
 */
public void setShippingCost(String shippingCost) {
	this.shippingCost = shippingCost;
}
/**
 * @return the taxCost
 */
public String getTaxCost() {
	return taxCost;
}
/**
 * @param taxCost the taxCost to set
 */
public void setTaxCost(String taxCost) {
	this.taxCost = taxCost;
}
/**
 * @return the discountAmount
 */
public String getDiscountAmount() {
	return discountAmount;
}
/**
 * @param discountAmount the discountAmount to set
 */
public void setDiscountAmount(String discountAmount) {
	this.discountAmount = discountAmount;
}
/**
 * @return the shippingDiscountAmount
 */
public String getShippingDiscountAmount() {
	return shippingDiscountAmount;
}
/**
 * @param shippingDiscountAmount the shippingDiscountAmount to set
 */
public void setShippingDiscountAmount(String shippingDiscountAmount) {
	this.shippingDiscountAmount = shippingDiscountAmount;
}
/**
 * @return the taxDiscountAmount
 */
public String getTaxDiscountAmount() {
	return taxDiscountAmount;
}
/**
 * @param taxDiscountAmount the taxDiscountAmount to set
 */
public void setTaxDiscountAmount(String taxDiscountAmount) {
	this.taxDiscountAmount = taxDiscountAmount;
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
 * @return the listings
 */
public ArrayList<CartListing> getListings() {
	return listings;
}
/**
 * @param listings the listings to set
 */
public void setListings(ArrayList<CartListing> listings) {
	this.listings = listings;
}
/**
 * @return the isDownloadOnly
 */
public Boolean isDownloadOnly() {
	return isDownloadOnly;
}
/**
 * @param isDownloadOnly the isDownloadOnly to set
 */
public void setDownloadOnly(Boolean isDownloadOnly) {
	this.isDownloadOnly = isDownloadOnly;
}
/**
 * @return the hasVat
 */
public Boolean isHasVat() {
	return hasVat;
}
/**
 * @param hasVat the hasVat to set
 */
public void setHasVat(Boolean hasVat) {
	this.hasVat = hasVat;
}
/**
 * @return the shippingOption
 */
public ShippingOption getShippingOption() {
	return shippingOption;
}
/**
 * @param shippingOption the shippingOption to set
 */
public void setShippingOption(ShippingOption shippingOption) {
	this.shippingOption = shippingOption;
}
/**
*Get all guest's carts
*/
@JsonIgnore
public static void getAllGuestCarts(String guestId){EtsyService.getService("/guests/"+guestId+"/carts");}
/**
*	Add a listing to guest's cart
*
*/
@JsonIgnore
public void addToGuestCart(String guestId){EtsyService.postService("/guests/"+guestId+"/carts", this);}
/**
*	Update a guest's cart listing purchase quantity
*/
@JsonIgnore
public void updateGuestCartListingQuantity(String guestId){EtsyService.putService("/guests/"+guestId+"/carts", this);}
/**
*Remove a listing from a guest's cart

*/
@JsonIgnore
public static void removeGuestCartListing(String guestId){EtsyService.deleteService("/guests/"+guestId+"/carts");}
/**
*Get a guest's cart
*/
@JsonIgnore
public static void findGuestCart(String guestId,String cartId){EtsyService.getService("/guests/"+guestId+"/carts/"+cartId);}
/**
*Update a guest's cart
*/
@JsonIgnore
public void updateGuestCart(String guestId,String cartId){EtsyService.putService("/guests/"+guestId+"/carts/"+cartId, this);}
/**
*	Delete a guest's cart
*/
@JsonIgnore
public static void deleteGuestCart(String guestId, String cartId){EtsyService.deleteService("/guests/"+guestId+"/carts/"+cartId);}
}
