package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Receipt extends EtsyService {
	@JsonProperty("receipt_id")
	private Integer receiptId;
	@JsonProperty("receipt_type")
	private Integer receiptType;
	@JsonProperty("order_id")
	private Integer orderId;
	@JsonProperty("seller_user_id")
	private Integer sellerUserId;
	@JsonProperty("buyer_user_id")
	private Integer buyerUserId;
	@JsonProperty("creation_tsz")
	private Float creationTsz;
	@JsonProperty("last_modified_tsz")
	private Float lastModifiedTsz;
	@JsonProperty("name")
	private String name;
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
	@JsonProperty("payment_method")
	private String paymentMethod;
	@JsonProperty("payment_email")
	private String paymentEmail;
	@JsonProperty("message_from_seller")
	private String messageFromSeller;
	@JsonProperty("message_from_buyer")
	private String messageFrom_buyer;
	@JsonProperty("was_paid")
	private Boolean wasPaid;
	@JsonProperty("total_tax_cost")
	private Float totalTaxCost;
	@JsonProperty("total_vat_cost")
	private Float totalVatCost;
	@JsonProperty("total_price")
	private Float totalPrice;
	@JsonProperty("total_shipping_cost")
	private Float totalShippingCost;
	@JsonProperty("currency_code")
	private String currencyCode;
	@JsonProperty("message_from_payment")
	private String messageFromPayment;
	@JsonProperty("was_shipped")
	private Boolean wasShipped;
	@JsonProperty("buyer_email")
	private String buyerEmail;
	@JsonProperty("seller_email")
	private String sellerEmail;
	@JsonProperty("discount_amt")
	private Float discountAmt;
	@JsonProperty("subtotal")
	private Float subtotal;
	@JsonProperty("grandtotal")
	private Float grandtotal;
	@JsonProperty("adjusted_grandtotal")
	private Float adjustedGrandtotal;
	@JsonProperty("shipping")
	private ArrayList<ReceiptShipment> shipping;
	/**
	 * @return the shipping
	 */
	public ArrayList<ReceiptShipment> getShipping() {
		return shipping;
	}
	/**
	 * @param shipping the shipping to set
	 */
	public void setShipping(ArrayList<ReceiptShipment> shipping) {
		this.shipping = shipping;
	}
	/**
	 * @return the wasPaid
	 */
	public Boolean getWasPaid() {
		return wasPaid;
	}
	/**
	 * @return the wasShipped
	 */
	public Boolean getWasShipped() {
		return wasShipped;
	}
	/**
	 * @return the receiptId
	 */
	public Integer getReceiptId() {
		return receiptId;
	}
	/**
	 * @param receiptId the receiptId to set
	 */
	public void setReceiptId(Integer receiptId) {
		this.receiptId = receiptId;
	}
	/**
	 * @return the receiptType
	 */
	public Integer getReceiptType() {
		return receiptType;
	}
	/**
	 * @param receiptType the receiptType to set
	 */
	public void setReceiptType(Integer receiptType) {
		this.receiptType = receiptType;
	}
	/**
	 * @return the orderId
	 */
	public Integer getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the sellerUserId
	 */
	public Integer getSellerUserId() {
		return sellerUserId;
	}
	/**
	 * @param sellerUserId the sellerUserId to set
	 */
	public void setSellerUserId(Integer sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
	/**
	 * @return the buyerUserId
	 */
	public Integer getBuyerUserId() {
		return buyerUserId;
	}
	/**
	 * @param buyerUserId the buyerUserId to set
	 */
	public void setBuyerUserId(Integer buyerUserId) {
		this.buyerUserId = buyerUserId;
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
	 * @return the lastModifiedTsz
	 */
	public Float getLastModifiedTsz() {
		return lastModifiedTsz;
	}
	/**
	 * @param lastModifiedTsz the lastModifiedTsz to set
	 */
	public void setLastModifiedTsz(Float lastModifiedTsz) {
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
	public Boolean isWasPaid() {
		return wasPaid;
	}
	/**
	 * @param wasPaid the wasPaid to set
	 */
	public void setWasPaid(Boolean wasPaid) {
		this.wasPaid = wasPaid;
	}
	/**
	 * @return the totalTaxCost
	 */
	public Float getTotalTaxCost() {
		return totalTaxCost;
	}
	/**
	 * @param totalTaxCost the totalTaxCost to set
	 */
	public void setTotalTaxCost(Float totalTaxCost) {
		this.totalTaxCost = totalTaxCost;
	}
	/**
	 * @return the totalVatCost
	 */
	public Float getTotalVatCost() {
		return totalVatCost;
	}
	/**
	 * @param totalVatCost the totalVatCost to set
	 */
	public void setTotalVatCost(Float totalVatCost) {
		this.totalVatCost = totalVatCost;
	}
	/**
	 * @return the totalPrice
	 */
	public Float getTotalPrice() {
		return totalPrice;
	}
	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}
	/**
	 * @return the totalShippingCost
	 */
	public Float getTotalShippingCost() {
		return totalShippingCost;
	}
	/**
	 * @param totalShippingCost the totalShippingCost to set
	 */
	public void setTotalShippingCost(Float totalShippingCost) {
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
	public Boolean isWasShipped() {
		return wasShipped;
	}
	/**
	 * @param wasShipped the wasShipped to set
	 */
	public void setWasShipped(Boolean wasShipped) {
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
	public Float getDiscountAmt() {
		return discountAmt;
	}
	/**
	 * @param discountAmt the discountAmt to set
	 */
	public void setDiscountAmt(Float discountAmt) {
		this.discountAmt = discountAmt;
	}
	/**
	 * @return the subtotal
	 */
	public Float getSubtotal() {
		return subtotal;
	}
	/**
	 * @param subtotal the subtotal to set
	 */
	public void setSubtotal(Float subtotal) {
		this.subtotal = subtotal;
	}
	/**
	 * @return the grandtotal
	 */
	public Float getGrandtotal() {
		return grandtotal;
	}
	/**
	 * @param grandtotal the grandtotal to set
	 */
	public void setGrandtotal(Float grandtotal) {
		this.grandtotal = grandtotal;
	}
	/**
	 * @return the adjustedGrandtotal
	 */
	public Float getAdjustedGrandtotal() {
		return adjustedGrandtotal;
	}
	/**
	 * @param adjustedGrandtotal the adjustedGrandtotal to set
	 */
	public void setAdjustedGrandtotal(Float adjustedGrandtotal) {
		this.adjustedGrandtotal = adjustedGrandtotal;
	}

	/**
	*Retrieves a Shop_Receipt2 by id.
	*/
	@JsonIgnore
	public static void getShop_Receipt2(Integer receiptId){EtsyService.getService("/receipts/"+receiptId);}
	/**
	*Updates a Shop_Receipt2
	*/
	@JsonIgnore
	public void updateReceipt(Integer receiptId){EtsyService.putService("/receipts/"+receiptId, this);}
	/**
	*Retrieves a set of Receipt objects associated to a Shop.
	*/
	@JsonIgnore
	public void getAllShopReceipts(String shopId){EtsyService.putService("/shops/"+shopId+"/receipts", this);}
	/**
	*Submits tracking information and sends a shipping notification email to the buyer. If send_bcc is true, the shipping notification will be sent to the seller as well. Refer to additional documentation.
	*/
	@JsonIgnore
	public void submitTracking(String shopId, int receiptId){EtsyService.postService("/shops/"+shopId+"/receipts/"+receiptId+"/tracking", this);}
	/**
	*Retrieves a set of Receipt objects associated to a Shop based on the status.
	*/
	@JsonIgnore
	public static void getAllShopReceiptsByStatus(String shopId, String status){EtsyService.getService("/shops/"+shopId+"/receipts/"+status);}
	/**
	*Retrieves a set of open Local Delivery Receipt objects associated to a Shop.
	*/
	@JsonIgnore
	public static void getAllOpenLocalDeliveryReceipts(String shopId){EtsyService.getService("/shops/"+shopId+"/receipts/local-delivery");}
	/**
	*Searches the set of Receipt objects associated to a Shop by a query
	*/
	@JsonIgnore
	public static void searchAllShopReceipts(String shopId){EtsyService.getService("/shops/"+shopId+"/receipts/search");}
	/**
	*Retrieves a set of Receipt objects associated to a User.
	*/
	@JsonIgnore
	public static void getAllUserBuyerReceipts(String userId){EtsyService.getService("/users/"+userId+"/receipts");}

}
