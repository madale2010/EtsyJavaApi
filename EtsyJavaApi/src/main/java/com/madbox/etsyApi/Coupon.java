package com.madbox.etsyApi;

public class Coupon extends EtsyService{
 private int couponId;
 private String couponCode;
 private boolean sellerActive;
 private int pctDiscount;
 private boolean freeShipping;
 private boolean domesticOnly;
 private String currencyCode;
 private String fixedDiscount;
 private String minimumPurchasePrice;
 private int expirationDate;
 private String couponType;
/**
 * @return the couponId
 */
public int getCouponId() {
	return couponId;
}
/**
 * @param couponId the couponId to set
 */
public void setCouponId(int couponId) {
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
public boolean isSellerActive() {
	return sellerActive;
}
/**
 * @param sellerActive the sellerActive to set
 */
public void setSellerActive(boolean sellerActive) {
	this.sellerActive = sellerActive;
}
/**
 * @return the pctDiscount
 */
public int getPctDiscount() {
	return pctDiscount;
}
/**
 * @param pctDiscount the pctDiscount to set
 */
public void setPctDiscount(int pctDiscount) {
	this.pctDiscount = pctDiscount;
}
/**
 * @return the freeShipping
 */
public boolean isFreeShipping() {
	return freeShipping;
}
/**
 * @param freeShipping the freeShipping to set
 */
public void setFreeShipping(boolean freeShipping) {
	this.freeShipping = freeShipping;
}
/**
 * @return the domesticOnly
 */
public boolean isDomesticOnly() {
	return domesticOnly;
}
/**
 * @param domesticOnly the domesticOnly to set
 */
public void setDomesticOnly(boolean domesticOnly) {
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
public int getExpirationDate() {
	return expirationDate;
}
/**
 * @param expirationDate the expirationDate to set
 */
public void setExpirationDate(int expirationDate) {
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

	public static void findAllShopCoupons(String shopId) {
		EtsyService.getService("/shops/" + shopId + "/coupons");
	}
	/**
	 * Creates a new Coupon. May only have one of free_shipping, pct_discount or fixed_discount
	 * @param shopId
	 */
	public static void createCoupon(String shopId) {
		EtsyService.postService("/shops/" + shopId + "/coupons");
	}

	public static void findCoupon(String shopId, String couponId) {
		EtsyService.getService("/shops/" + shopId + "/coupons/" + couponId);
	}

	public static void updateCoupon(String shopId, String couponId) {
		EtsyService.putService("/shops/" + shopId + "/coupons/" + couponId);
	}

	public static void deleteCoupon(String shopId, String couponId) {
		EtsyService.deleteService("/shops/" + shopId + "/coupons/" + couponId);
	}
}
