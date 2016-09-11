package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class PaymentAdjustment {
	private int paymentAdjustmentId;
	private int paymentId;
	private String status;
	private boolean isSuccess;
	private int userId;
	private String reasonCode;
	private int totalAdjustmentAmount;
	private int shopTotalAdjustmentAmount;
	private int buyerTotalAdjustmentAmount;
	private int totalFeeAdjustmentAmount;
	private int createDate;
	private int updateDate;
	/**
	 * @return the paymentAdjustmentId
	 */
	public int getPaymentAdjustmentId() {
		return paymentAdjustmentId;
	}
	/**
	 * @param paymentAdjustmentId the paymentAdjustmentId to set
	 */
	public void setPaymentAdjustmentId(int paymentAdjustmentId) {
		this.paymentAdjustmentId = paymentAdjustmentId;
	}
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
	 * @return the isSuccess
	 */
	public boolean isSuccess() {
		return isSuccess;
	}
	/**
	 * @param isSuccess the isSuccess to set
	 */
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the reasonCode
	 */
	public String getReasonCode() {
		return reasonCode;
	}
	/**
	 * @param reasonCode the reasonCode to set
	 */
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	/**
	 * @return the totalAdjustmentAmount
	 */
	public int getTotalAdjustmentAmount() {
		return totalAdjustmentAmount;
	}
	/**
	 * @param totalAdjustmentAmount the totalAdjustmentAmount to set
	 */
	public void setTotalAdjustmentAmount(int totalAdjustmentAmount) {
		this.totalAdjustmentAmount = totalAdjustmentAmount;
	}
	/**
	 * @return the shopTotalAdjustmentAmount
	 */
	public int getShopTotalAdjustmentAmount() {
		return shopTotalAdjustmentAmount;
	}
	/**
	 * @param shopTotalAdjustmentAmount the shopTotalAdjustmentAmount to set
	 */
	public void setShopTotalAdjustmentAmount(int shopTotalAdjustmentAmount) {
		this.shopTotalAdjustmentAmount = shopTotalAdjustmentAmount;
	}
	/**
	 * @return the buyerTotalAdjustmentAmount
	 */
	public int getBuyerTotalAdjustmentAmount() {
		return buyerTotalAdjustmentAmount;
	}
	/**
	 * @param buyerTotalAdjustmentAmount the buyerTotalAdjustmentAmount to set
	 */
	public void setBuyerTotalAdjustmentAmount(int buyerTotalAdjustmentAmount) {
		this.buyerTotalAdjustmentAmount = buyerTotalAdjustmentAmount;
	}
	/**
	 * @return the totalFeeAdjustmentAmount
	 */
	public int getTotalFeeAdjustmentAmount() {
		return totalFeeAdjustmentAmount;
	}
	/**
	 * @param totalFeeAdjustmentAmount the totalFeeAdjustmentAmount to set
	 */
	public void setTotalFeeAdjustmentAmount(int totalFeeAdjustmentAmount) {
		this.totalFeeAdjustmentAmount = totalFeeAdjustmentAmount;
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
	*Get a Payment Adjustments from a Payment Id
	*/
	public static void findPaymentAdjustments(int paymentId){EtsyService.getService("/payments/"+paymentId+"/adjustments");}
	/**
	*Get a Direct Checkout Payment Adjustment
	*/
	public static void findPaymentAdjustment(int paymentId, int paymentAdjustmentId){EtsyService.getService("/payments/"+paymentId+"/adjustments/"+paymentAdjustmentId);}
	/**
	*Get a Payment Adjustment from a Ledger Entry ID, if applicable
	*/
	public static void findPaymentAdjustmentForLedgerEntry(String shopId, int ledgerEntryId){EtsyService.getService("/shops/:shop_id/ledger/entries/"+ledgerEntryId+"/adjustment");}
}
