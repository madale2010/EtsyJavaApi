package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Coupon extends EtsyService{
 @JsonProperty("coupon_id")
	private Integer couponId;
 @JsonProperty("coupon_code")
	private String couponCode;
 @JsonProperty("seller_active")
	private Boolean sellerActive;
 @JsonProperty("pct_discount")
	private Integer pctDiscount;
 @JsonProperty("free_shipping")
	private Boolean freeShipping;
 @JsonProperty("domestic_only")
	private Boolean domesticOnly;
 @JsonProperty("currency_code")
	private String currencyCode;
 @JsonProperty("fixed_discount")
	private String fixedDiscount;
 @JsonProperty("minimum_purchase_price")
	private String minimumPurchasePrice;
 @JsonProperty("expiration_date")
	private Integer expirationDate;
 @JsonProperty("coupon_type")
	private String couponType;
/**
 * @return the couponId
 */
public Integer getCouponId() {
	return couponId;
}
/**
 * @param couponId the couponId to set
 */
public void setCouponId(Integer couponId) {
	this.couponId = couponId;
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
 * @return the sellerActive
 */
public Boolean isSellerActive() {
	return sellerActive;
}
/**
 * @param sellerActive the sellerActive to set
 */
public void setSellerActive(Boolean sellerActive) {
	this.sellerActive = sellerActive;
}
/**
 * @return the pctDiscount
 */
public Integer getPctDiscount() {
	return pctDiscount;
}
/**
 * @param pctDiscount the pctDiscount to set
 */
public void setPctDiscount(Integer pctDiscount) {
	this.pctDiscount = pctDiscount;
}
/**
 * @return the freeShipping
 */
public Boolean isFreeShipping() {
	return freeShipping;
}
/**
 * @param freeShipping the freeShipping to set
 */
public void setFreeShipping(Boolean freeShipping) {
	this.freeShipping = freeShipping;
}
/**
 * @return the domesticOnly
 */
public Boolean isDomesticOnly() {
	return domesticOnly;
}
/**
 * @param domesticOnly the domesticOnly to set
 */
public void setDomesticOnly(Boolean domesticOnly) {
	this.domesticOnly = domesticOnly;
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
 * @return the fixedDiscount
 */
public String getFixedDiscount() {
	return fixedDiscount;
}
/**
 * @param fixedDiscount the fixedDiscount to set
 */
public void setFixedDiscount(String fixedDiscount) {
	this.fixedDiscount = fixedDiscount;
}
/**
 * @return the minimumPurchasePrice
 */
public String getMinimumPurchasePrice() {
	return minimumPurchasePrice;
}
/**
 * @param minimumPurchasePrice the minimumPurchasePrice to set
 */
public void setMinimumPurchasePrice(String minimumPurchasePrice) {
	this.minimumPurchasePrice = minimumPurchasePrice;
}
/**
 * @return the expirationDate
 */
public Integer getExpirationDate() {
	return expirationDate;
}
/**
 * @param expirationDate the expirationDate to set
 */
public void setExpirationDate(Integer expirationDate) {
	this.expirationDate = expirationDate;
}
/**
 * @return the couponType
 */
public String getCouponType() {
	return couponType;
}
/**
 * @param couponType the couponType to set
 */
public void setCouponType(String couponType) {
	this.couponType = couponType;
}

@JsonIgnore
	public static void getAllShopCoupons(String shopId) {
		EtsyService.getService("/shops/" + shopId + "/coupons");
	}
	/**
	 * Creates a new Coupon. May only have one of free_shipping, pct_discount or fixed_discount
	 * @param shopId
	 */
	@JsonIgnore
	public void createCoupon(String shopId) {
		EtsyService.postService("/shops/" + shopId + "/coupons", this);
	}
	@JsonIgnore
	public static void findCoupon(String shopId, String couponId) {
		EtsyService.getService("/shops/" + shopId + "/coupons/" + couponId);
	}
	@JsonIgnore
	public void updateCoupon(String shopId, String couponId) {
		EtsyService.putService("/shops/" + shopId + "/coupons/" + couponId, this);
	}
	@JsonIgnore
	public static void deleteCoupon(String shopId, String couponId) {
		EtsyService.deleteService("/shops/" + shopId + "/coupons/" + couponId);
	}
}
