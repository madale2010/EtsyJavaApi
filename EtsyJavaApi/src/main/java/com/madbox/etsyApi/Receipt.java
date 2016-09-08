package com.madbox.etsyApi;

public class Receipt {
	private int receiptId;
	private int receiptType;
	private int orderId;
	private int sellerUserId;
	private int buyerUserId;
	private float creationTsz;
	private float lastModifiedTsz;
	private String name;
	private String first_line;
	private String second_line;
	private String city;
	private String state;
	private String zip;
	private int countryId;
	private String paymentMethod;
	private String paymentEmail;
	private String messageFromSeller;
	private String messageFrom_buyer;
	private boolean wasPaid;
	private float totalTaxCost;
	private float totalVatCost;
	private float totalPrice;
	private float totalShippingCost;
	private String currencyCode;
	private String messageFromPayment;
	private boolean wasShipped;
	private String buyerEmail;
	private String sellerEmail;
	private float discountAmt;
	private float subtotal;
	private float grandtotal;
	private float adjustedGrandtotal;
	private String shippingTrackingCode;
	/**
	 * @return the receiptId
	 */
	public int getReceiptId() {
		return receiptId;
	}
	/**
	 * @param receiptId the receiptId to set
	 */
	public void setReceiptId(int receiptId) {
		this.receiptId = receiptId;
	}
	/**
	 * @return the receiptType
	 */
	public int getReceiptType() {
		return receiptType;
	}
	/**
	 * @param receiptType the receiptType to set
	 */
	public void setReceiptType(int receiptType) {
		this.receiptType = receiptType;
	}
	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the sellerUserId
	 */
	public int getSellerUserId() {
		return sellerUserId;
	}
	/**
	 * @param sellerUserId the sellerUserId to set
	 */
	public void setSellerUserId(int sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
	/**
	 * @return the buyerUserId
	 */
	public int getBuyerUserId() {
		return buyerUserId;
	}
	/**
	 * @param buyerUserId the buyerUserId to set
	 */
	public void setBuyerUserId(int buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	/**
	 * @return the creationTsz
	 */
	public float getCreationTsz() {
		return creationTsz;
	}
	/**
	 * @param creationTsz the creationTsz to set
	 */
	public void setCreationTsz(float creationTsz) {
		this.creationTsz = creationTsz;
	}
	/**
	 * @return the lastModifiedTsz
	 */
	public float getLastModifiedTsz() {
		return lastModifiedTsz;
	}
	/**
	 * @param lastModifiedTsz the lastModifiedTsz to set
	 */
	public void setLastModifiedTsz(float lastModifiedTsz) {
		this.lastModifiedTsz = lastModifiedTsz;
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
	 * @return the first_line
	 */
	public String getFirst_line() {
		return first_line;
	}
	/**
	 * @param first_line the first_line to set
	 */
	public void setFirst_line(String first_line) {
		this.first_line = first_line;
	}
	/**
	 * @return the second_line
	 */
	public String getSecond_line() {
		return second_line;
	}
	/**
	 * @param second_line the second_line to set
	 */
	public void setSecond_line(String second_line) {
		this.second_line = second_line;
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
	public int getCountryId() {
		return countryId;
	}
	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	/**
	 * @return the paymentMethod
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}
	/**
	 * @param paymentMethod the paymentMethod to set
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	/**
	 * @return the paymentEmail
	 */
	public String getPaymentEmail() {
		return paymentEmail;
	}
	/**
	 * @param paymentEmail the paymentEmail to set
	 */
	public void setPaymentEmail(String paymentEmail) {
		this.paymentEmail = paymentEmail;
	}
	/**
	 * @return the messageFromSeller
	 */
	public String getMessageFromSeller() {
		return messageFromSeller;
	}
	/**
	 * @param messageFromSeller the messageFromSeller to set
	 */
	public void setMessageFromSeller(String messageFromSeller) {
		this.messageFromSeller = messageFromSeller;
	}
	/**
	 * @return the messageFrom_buyer
	 */
	public String getMessageFrom_buyer() {
		return messageFrom_buyer;
	}
	/**
	 * @param messageFrom_buyer the messageFrom_buyer to set
	 */
	public void setMessageFrom_buyer(String messageFrom_buyer) {
		this.messageFrom_buyer = messageFrom_buyer;
	}
	/**
	 * @return the wasPaid
	 */
	public boolean isWasPaid() {
		return wasPaid;
	}
	/**
	 * @param wasPaid the wasPaid to set
	 */
	public void setWasPaid(boolean wasPaid) {
		this.wasPaid = wasPaid;
	}
	/**
	 * @return the totalTaxCost
	 */
	public float getTotalTaxCost() {
		return totalTaxCost;
	}
	/**
	 * @param totalTaxCost the totalTaxCost to set
	 */
	public void setTotalTaxCost(float totalTaxCost) {
		this.totalTaxCost = totalTaxCost;
	}
	/**
	 * @return the totalVatCost
	 */
	public float getTotalVatCost() {
		return totalVatCost;
	}
	/**
	 * @param totalVatCost the totalVatCost to set
	 */
	public void setTotalVatCost(float totalVatCost) {
		this.totalVatCost = totalVatCost;
	}
	/**
	 * @return the totalPrice
	 */
	public float getTotalPrice() {
		return totalPrice;
	}
	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	/**
	 * @return the totalShippingCost
	 */
	public float getTotalShippingCost() {
		return totalShippingCost;
	}
	/**
	 * @param totalShippingCost the totalShippingCost to set
	 */
	public void setTotalShippingCost(float totalShippingCost) {
		this.totalShippingCost = totalShippingCost;
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
	 * @return the messageFromPayment
	 */
	public String getMessageFromPayment() {
		return messageFromPayment;
	}
	/**
	 * @param messageFromPayment the messageFromPayment to set
	 */
	public void setMessageFromPayment(String messageFromPayment) {
		this.messageFromPayment = messageFromPayment;
	}
	/**
	 * @return the wasShipped
	 */
	public boolean isWasShipped() {
		return wasShipped;
	}
	/**
	 * @param wasShipped the wasShipped to set
	 */
	public void setWasShipped(boolean wasShipped) {
		this.wasShipped = wasShipped;
	}
	/**
	 * @return the buyerEmail
	 */
	public String getBuyerEmail() {
		return buyerEmail;
	}
	/**
	 * @param buyerEmail the buyerEmail to set
	 */
	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}
	/**
	 * @return the sellerEmail
	 */
	public String getSellerEmail() {
		return sellerEmail;
	}
	/**
	 * @param sellerEmail the sellerEmail to set
	 */
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	/**
	 * @return the discountAmt
	 */
	public float getDiscountAmt() {
		return discountAmt;
	}
	/**
	 * @param discountAmt the discountAmt to set
	 */
	public void setDiscountAmt(float discountAmt) {
		this.discountAmt = discountAmt;
	}
	/**
	 * @return the subtotal
	 */
	public float getSubtotal() {
		return subtotal;
	}
	/**
	 * @param subtotal the subtotal to set
	 */
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	/**
	 * @return the grandtotal
	 */
	public float getGrandtotal() {
		return grandtotal;
	}
	/**
	 * @param grandtotal the grandtotal to set
	 */
	public void setGrandtotal(float grandtotal) {
		this.grandtotal = grandtotal;
	}
	/**
	 * @return the adjustedGrandtotal
	 */
	public float getAdjustedGrandtotal() {
		return adjustedGrandtotal;
	}
	/**
	 * @param adjustedGrandtotal the adjustedGrandtotal to set
	 */
	public void setAdjustedGrandtotal(float adjustedGrandtotal) {
		this.adjustedGrandtotal = adjustedGrandtotal;
	}
	/**
	 * @return the shippingTrackingCode
	 */
	public String getShippingTrackingCode() {
		return shippingTrackingCode;
	}
	/**
	 * @param shippingTrackingCode the shippingTrackingCode to set
	 */
	public void setShippingTrackingCode(String shippingTrackingCode) {
		this.shippingTrackingCode = shippingTrackingCode;
	}
	/**
	*Retrieves a Shop_Receipt2 by id.
	*/
	public static void getShop_Receipt2(int receiptId){EtsyService.getService("/receipts/"+receiptId);}
	/**
	*Updates a Shop_Receipt2
	*/
	public static void updateReceipt(int receiptId){EtsyService.putService("/receipts/"+receiptId);}
	/**
	*Retrieves a set of Receipt objects associated to a Shop.
	*/
	public static void findAllShopReceipts(String shopId){EtsyService.putService("/shops/"+shopId+"/receipts");}
	/**
	*Submits tracking information and sends a shipping notification email to the buyer. If send_bcc is true, the shipping notification will be sent to the seller as well. Refer to additional documentation.
	*/
	public static void submitTracking(String shopId, int receiptId){EtsyService.postService("/shops/"+shopId+"/receipts/"+receiptId+"/tracking");}
	/**
	*Retrieves a set of Receipt objects associated to a Shop based on the status.
	*/
	public static void findAllShopReceiptsByStatus(String shopId, String status){EtsyService.getService("/shops/"+shopId+"/receipts/"+status);}
	/**
	*Retrieves a set of open Local Delivery Receipt objects associated to a Shop.
	*/
	public static void findAllOpenLocalDeliveryReceipts(String shopId){EtsyService.getService("/shops/"+shopId+"/receipts/local-delivery");}
	/**
	*Searches the set of Receipt objects associated to a Shop by a query
	*/
	public static void searchAllShopReceipts(String shopId){EtsyService.getService("/shops/"+shopId+"/receipts/search");}
	/**
	*Retrieves a set of Receipt objects associated to a User.
	*/
	public static void findAllUserBuyerReceipts(String userId){EtsyService.getService("/users/"+userId+"/receipts");}

}
