package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentAdjustmentItem extends EtsyService {
	@JsonProperty("payment_adjustment_item_id")
	private Integer paymentAdjustmentItemId;
	@JsonProperty("payment_adjustment_id")
	private Integer paymentAdjustmentId;
	@JsonProperty("adjustment_type")
	private String adjustmentType;
	@JsonProperty("amount")
	private Integer amount;
	@JsonProperty("transaction_id")
	private Integer transactionId;
	@JsonProperty("create_date")
	private Integer createDate;
	/**
	 * @return the paymentAdjustmentItemId
	 */
	public Integer getPaymentAdjustmentItemId() {
		return paymentAdjustmentItemId;
	}
	/**
	 * @param paymentAdjustmentItemId the paymentAdjustmentItemId to set
	 */
	public void setPaymentAdjustmentItemId(Integer paymentAdjustmentItemId) {
		this.paymentAdjustmentItemId = paymentAdjustmentItemId;
	}
	/**
	 * @return the paymentAdjustmentId
	 */
	public Integer getPaymentAdjustmentId() {
		return paymentAdjustmentId;
	}
	/**
	 * @param paymentAdjustmentId the paymentAdjustmentId to set
	 */
	public void setPaymentAdjustmentId(Integer paymentAdjustmentId) {
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
	public Integer getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	/**
	 * @return the transactionId
	 */
	public Integer getTransactionId() {
		return transactionId;
	}
	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
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
	*Get Direct Checkout Payment Adjustment Items
	*/
	@JsonIgnore
	public static void findPaymentAdjustmentItem(Integer paymentId, int paymentAdjustmentId){EtsyService.getService("/payments/"+paymentId+"/adjustments/"+paymentAdjustmentId+"/items");}
	/**
	*Get a Direct Checkout Payment Adjustment Item
	*/
	@JsonIgnore
	public static void findPaymentAdjustmentItem(Integer paymentId, int paymentAdjustmentId, int paymentAdjustmentItemId){EtsyService.getService("/payments/"+paymentId+"/adjustments/"+paymentAdjustmentId+"/items/"+paymentAdjustmentItemId);}
}
