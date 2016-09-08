package com.madbox.etsyApi;

public class PaymentAdjustmentItem {
	private int paymentAdjustmentItemId;
	private int paymentAdjustmentId;
	private String adjustmentType;
	private int amount;
	private int transactionId;
	private int createDate;
	/**
	 * @return the paymentAdjustmentItemId
	 */
	public int getPaymentAdjustmentItemId() {
		return paymentAdjustmentItemId;
	}
	/**
	 * @param paymentAdjustmentItemId the paymentAdjustmentItemId to set
	 */
	public void setPaymentAdjustmentItemId(int paymentAdjustmentItemId) {
		this.paymentAdjustmentItemId = paymentAdjustmentItemId;
	}
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
	 * @return the adjustmentType
	 */
	public String getAdjustmentType() {
		return adjustmentType;
	}
	/**
	 * @param adjustmentType the adjustmentType to set
	 */
	public void setAdjustmentType(String adjustmentType) {
		this.adjustmentType = adjustmentType;
	}
	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	/**
	 * @return the transactionId
	 */
	public int getTransactionId() {
		return transactionId;
	}
	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
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
	*Get Direct Checkout Payment Adjustment Items
	*/
	public static void findPaymentAdjustmentItem(int paymentId, int paymentAdjustmentId){EtsyService.getService("/payments/"+paymentId+"/adjustments/"+paymentAdjustmentId+"/items");}
	/**
	*Get a Direct Checkout Payment Adjustment Item
	*/
	public static void findPaymentAdjustmentItem(int paymentId, int paymentAdjustmentId, int paymentAdjustmentItemId){EtsyService.getService("/payments/"+paymentId+"/adjustments/"+paymentAdjustmentId+"/items/"+paymentAdjustmentItemId);}
}
