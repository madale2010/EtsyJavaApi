package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Payment extends EtsyService {
	@JsonProperty("payment_id")
	private Integer paymentId;
	@JsonProperty("buyer_user_id")
	private Integer buyerUserId;
	@JsonProperty("shop_id")
	private Integer shopId;
	@JsonProperty("receipt_id")
	private Integer receiptId;
	@JsonProperty("amount_gross")
	private Integer amountGross;
	@JsonProperty("amount_fees")
	private Integer amountFees;
	@JsonProperty("amount_net")
	private Integer amountNet;
	@JsonProperty("posted_gross")
	private Integer postedGross;
	@JsonProperty("posted_fees")
	private Integer postedFees;
	@JsonProperty("posted_net")
	private Integer postedNet;
	@JsonProperty("adjusted_gross")
	private Integer adjustedGross;
	@JsonProperty("adjusted_fees")
	private Integer adjustedFees;
	@JsonProperty("adjusted_net")
	private Integer adjustedNet;
	@JsonProperty("currency")
	private String currency;
	@JsonProperty("shop_currency")
	private String shopCurrency;
	@JsonProperty("buyer_currency")
	private String buyerCurrency;
	@JsonProperty("shipping_user_id")
	private Integer shippingUserId;
	@JsonProperty("shipping_address_id")
	private Integer shippingAddressId;
	@JsonProperty("billing_address_id")
	private Integer billingAddressId;
	@JsonProperty("status")
	private String status;
	@JsonProperty("shipped_date")
	private Integer shippedDate;
	@JsonProperty("create_date")
	private Integer createDate;
	@JsonProperty("update_date")
	private Integer updateDate;
	/**
	 * @return the paymentId
	 */
	public Integer getPaymentId() {
		return paymentId;
	}
	/**
	 * @param paymentId the paymentId to set
	 */
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
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
	 * @return the amountGross
	 */
	public Integer getAmountGross() {
		return amountGross;
	}
	/**
	 * @param amountGross the amountGross to set
	 */
	public void setAmountGross(Integer amountGross) {
		this.amountGross = amountGross;
	}
	/**
	 * @return the amountFees
	 */
	public Integer getAmountFees() {
		return amountFees;
	}
	/**
	 * @param amountFees the amountFees to set
	 */
	public void setAmountFees(Integer amountFees) {
		this.amountFees = amountFees;
	}
	/**
	 * @return the amountNet
	 */
	public Integer getAmountNet() {
		return amountNet;
	}
	/**
	 * @param amountNet the amountNet to set
	 */
	public void setAmountNet(Integer amountNet) {
		this.amountNet = amountNet;
	}
	/**
	 * @return the postedGross
	 */
	public Integer getPostedGross() {
		return postedGross;
	}
	/**
	 * @param postedGross the postedGross to set
	 */
	public void setPostedGross(Integer postedGross) {
		this.postedGross = postedGross;
	}
	/**
	 * @return the postedFees
	 */
	public Integer getPostedFees() {
		return postedFees;
	}
	/**
	 * @param postedFees the postedFees to set
	 */
	public void setPostedFees(Integer postedFees) {
		this.postedFees = postedFees;
	}
	/**
	 * @return the postedNet
	 */
	public Integer getPostedNet() {
		return postedNet;
	}
	/**
	 * @param postedNet the postedNet to set
	 */
	public void setPostedNet(Integer postedNet) {
		this.postedNet = postedNet;
	}
	/**
	 * @return the adjustedGross
	 */
	public Integer getAdjustedGross() {
		return adjustedGross;
	}
	/**
	 * @param adjustedGross the adjustedGross to set
	 */
	public void setAdjustedGross(Integer adjustedGross) {
		this.adjustedGross = adjustedGross;
	}
	/**
	 * @return the adjustedFees
	 */
	public Integer getAdjustedFees() {
		return adjustedFees;
	}
	/**
	 * @param adjustedFees the adjustedFees to set
	 */
	public void setAdjustedFees(Integer adjustedFees) {
		this.adjustedFees = adjustedFees;
	}
	/**
	 * @return the adjustedNet
	 */
	public Integer getAdjustedNet() {
		return adjustedNet;
	}
	/**
	 * @param adjustedNet the adjustedNet to set
	 */
	public void setAdjustedNet(Integer adjustedNet) {
		this.adjustedNet = adjustedNet;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the shopCurrency
	 */
	public String getShopCurrency() {
		return shopCurrency;
	}
	/**
	 * @param shopCurrency the shopCurrency to set
	 */
	public void setShopCurrency(String shopCurrency) {
		this.shopCurrency = shopCurrency;
	}
	/**
	 * @return the buyerCurrency
	 */
	public String getBuyerCurrency() {
		return buyerCurrency;
	}
	/**
	 * @param buyerCurrency the buyerCurrency to set
	 */
	public void setBuyerCurrency(String buyerCurrency) {
		this.buyerCurrency = buyerCurrency;
	}
	/**
	 * @return the shippingUserId
	 */
	public Integer getShippingUserId() {
		return shippingUserId;
	}
	/**
	 * @param shippingUserId the shippingUserId to set
	 */
	public void setShippingUserId(Integer shippingUserId) {
		this.shippingUserId = shippingUserId;
	}
	/**
	 * @return the shippingAddressId
	 */
	public Integer getShippingAddressId() {
		return shippingAddressId;
	}
	/**
	 * @param shippingAddressId the shippingAddressId to set
	 */
	public void setShippingAddressId(Integer shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}
	/**
	 * @return the billingAddressId
	 */
	public Integer getBillingAddressId() {
		return billingAddressId;
	}
	/**
	 * @param billingAddressId the billingAddressId to set
	 */
	public void setBillingAddressId(Integer billingAddressId) {
		this.billingAddressId = billingAddressId;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the shippedDate
	 */
	public Integer getShippedDate() {
		return shippedDate;
	}
	/**
	 * @param shippedDate the shippedDate to set
	 */
	public void setShippedDate(Integer shippedDate) {
		this.shippedDate = shippedDate;
	}
	/**
	 * @return the createDate
	 */
	public Integer getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Integer createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the updateDate
	 */
	public Integer getUpdateDate() {
		return updateDate;
	}
	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Integer updateDate) {
		this.updateDate = updateDate;
	}
	/**
	*Get a Direct Checkout Payment
	*/
	@JsonIgnore
	public static void findPayment(Integer paymentId){EtsyService.getService("/payments/"+paymentId);}
	/**
	*	Get a Payment from a Ledger Entry ID, if applicable
	*/
	@JsonIgnore
	public static void findPaymentForLedgerEntry(String shopId, int ledgerEntryId){EtsyService.getService("/shops/"+shopId+"/ledger/entries/"+ledgerEntryId+"/payment");}
	/**
	*Get a Payment by Shop Receipt ID

	*/
	@JsonIgnore
	public static void findShopPaymentByReceipt(String shopId, int receiptId){EtsyService.getService("/shops/"+shopId+"/receipts/"+receiptId+"/payments");}
}
