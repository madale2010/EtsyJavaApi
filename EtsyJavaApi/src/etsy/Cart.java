package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Cart extends EtsyService {
	private int cartId;
	private String shopName;
	private String messageToSeller;
	private int destinationCountryId;
	private String couponCode;
	private String currencyCode;
	private String total;
	private String subtotal;
	private String shippingCost;
	private String taxCost;
	private String discountAmount;
	private String shippingDiscountAmount;
	private String taxDiscountAmount;
	private String url;
	private ArrayList<CartListing> listings;
	private boolean isDownloadOnly;
	private boolean hasVat;
	private ShippingOption shippingOption;
	/**
	 * @return the cartId
	 */
	public int getCartId() {
		return cartId;
	}
	/**
	 * @param cartId the cartId to set
	 */
	public void setCartId(int cartId) {
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
	public int getDestinationCountryId() {
		return destinationCountryId;
	}
	/**
	 * @param destinationCountryId the destinationCountryId to set
	 */
	public void setDestinationCountryId(int destinationCountryId) {
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
	public boolean isDownloadOnly() {
		return isDownloadOnly;
	}
	/**
	 * @param isDownloadOnly the isDownloadOnly to set
	 */
	public void setDownloadOnly(boolean isDownloadOnly) {
		this.isDownloadOnly = isDownloadOnly;
	}
	/**
	 * @return the hasVat
	 */
	public boolean isHasVat() {
		return hasVat;
	}
	/**
	 * @param hasVat the hasVat to set
	 */
	public void setHasVat(boolean hasVat) {
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

	public static void getAllUserCarts() {
		EtsyService.getService("/users/__SELF__/carts");
	}

	public void addToCart() {
		EtsyService.postService("/users/__SELF__/carts", this);
	}

	public void updateCartListingQuantity() {
		EtsyService.putService("/users/__SELF__/carts", this);
	}

	public static void removeCartListing() {
		EtsyService.deleteService("/users/__SELF__/carts");
	}

	public static String getUserCart(String cartid) {
		return EtsyService.getService("/users/__SELF__/carts/"+cartid);
	}

	public void updateCart(String cartid) {
		EtsyService.putService("/users/__SELF__/carts/"+cartid, this);
	}

	public static void deleteCart(String cartid) {
		EtsyService.deleteService("/users/__SELF__/carts/"+cartid);
	}

	public void addAndSelectShippingForApplePay(String cartid) {
		EtsyService.postService("/users/__SELF__/carts/"+cartid+"/add_and_select_shipping_for_apple", this);
	}

	public static void saveListingForLater() {
		EtsyService.deleteService("/users/__SELF__/carts/save");
	}

	public static String getUserCartForShop(String shopId) {
		return EtsyService.getService("/users/__SELF__/carts/shop/"+shopId);
	}

	public void createSingleListingCart(){
		EtsyService.postService("/users/__SELF__/carts/single_listing", this);
	}
}
