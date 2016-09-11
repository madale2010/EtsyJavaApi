package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Payment {
	private int paymentId;
	private int buyerUserId;
	private int shopId;
	private int receiptId;
	private int amountGross;
	private int amountFees;
	private int amountNet;
	private int postedGross;
	private int postedFees;
	private int postedNet;
	private int adjustedGross;
	private int adjustedFees;
	private int adjustedNet;
	private String currency;
	private String shopCurrency;
	private String buyerCurrency;
	private int shippingUserId;
	private int shippingAddressId;
	private int billingAddressId;
	private String status;
	private int shippedDate;
	private int createDate;
	private int updateDate;
	/**
	 * @return the paymentId
	 */
	public int getPaymentId() {
		return paymentId;
	}
	/**
	 * @param paymentId the paymentId to set
	 */
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
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
	 * @return the shopId
	 */
	public int getShopId() {
		return shopId;
	}
	/**
	 * @param shopId the shopId to set
	 */
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
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
	 * @return the amountGross
	 */
	public int getAmountGross() {
		return amountGross;
	}
	/**
	 * @param amountGross the amountGross to set
	 */
	public void setAmountGross(int amountGross) {
		this.amountGross = amountGross;
	}
	/**
	 * @return the amountFees
	 */
	public int getAmountFees() {
		return amountFees;
	}
	/**
	 * @param amountFees the amountFees to set
	 */
	public void setAmountFees(int amountFees) {
		this.amountFees = amountFees;
	}
	/**
	 * @return the amountNet
	 */
	public int getAmountNet() {
		return amountNet;
	}
	/**
	 * @param amountNet the amountNet to set
	 */
	public void setAmountNet(int amountNet) {
		this.amountNet = amountNet;
	}
	/**
	 * @return the postedGross
	 */
	public int getPostedGross() {
		return postedGross;
	}
	/**
	 * @param postedGross the postedGross to set
	 */
	public void setPostedGross(int postedGross) {
		this.postedGross = postedGross;
	}
	/**
	 * @return the postedFees
	 */
	public int getPostedFees() {
		return postedFees;
	}
	/**
	 * @param postedFees the postedFees to set
	 */
	public void setPostedFees(int postedFees) {
		this.postedFees = postedFees;
	}
	/**
	 * @return the postedNet
	 */
	public int getPostedNet() {
		return postedNet;
	}
	/**
	 * @param postedNet the postedNet to set
	 */
	public void setPostedNet(int postedNet) {
		this.postedNet = postedNet;
	}
	/**
	 * @return the adjustedGross
	 */
	public int getAdjustedGross() {
		return adjustedGross;
	}
	/**
	 * @param adjustedGross the adjustedGross to set
	 */
	public void setAdjustedGross(int adjustedGross) {
		this.adjustedGross = adjustedGross;
	}
	/**
	 * @return the adjustedFees
	 */
	public int getAdjustedFees() {
		return adjustedFees;
	}
	/**
	 * @param adjustedFees the adjustedFees to set
	 */
	public void setAdjustedFees(int adjustedFees) {
		this.adjustedFees = adjustedFees;
	}
	/**
	 * @return the adjustedNet
	 */
	public int getAdjustedNet() {
		return adjustedNet;
	}
	/**
	 * @param adjustedNet the adjustedNet to set
	 */
	public void setAdjustedNet(int adjustedNet) {
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
	public int getShippingUserId() {
		return shippingUserId;
	}
	/**
	 * @param shippingUserId the shippingUserId to set
	 */
	public void setShippingUserId(int shippingUserId) {
		this.shippingUserId = shippingUserId;
	}
	/**
	 * @return the shippingAddressId
	 */
	public int getShippingAddressId() {
		return shippingAddressId;
	}
	/**
	 * @param shippingAddressId the shippingAddressId to set
	 */
	public void setShippingAddressId(int shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}
	/**
	 * @return the billingAddressId
	 */
	public int getBillingAddressId() {
		return billingAddressId;
	}
	/**
	 * @param billingAddressId the billingAddressId to set
	 */
	public void setBillingAddressId(int billingAddressId) {
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
	public int getShippedDate() {
		return shippedDate;
	}
	/**
	 * @param shippedDate the shippedDate to set
	 */
	public void setShippedDate(int shippedDate) {
		this.shippedDate = shippedDate;
	}
	/**
	 * @return the createDate
	 */
	public int getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(int createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the updateDate
	 */
	public int getUpdateDate() {
		return updateDate;
	}
	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(int updateDate) {
		this.updateDate = updateDate;
	}
	/**
	*Get a Direct Checkout Payment
	*/
	public static void findPayment(int paymentId){EtsyService.getService("/payments/"+paymentId);}
	/**
	*	Get a Payment from a Ledger Entry ID, if applicable
	*/
	public static void findPaymentForLedgerEntry(String shopId, int ledgerEntryId){EtsyService.getService("/shops/"+shopId+"/ledger/entries/"+ledgerEntryId+"/payment");}
	/**
	*Get a Payment by Shop Receipt ID

	*/
	public static void findShopPaymentByReceipt(String shopId, int receiptId){EtsyService.getService("/shops/"+shopId+"/receipts/"+receiptId+"/payments");}
}
