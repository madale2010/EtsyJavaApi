package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentAdjustment extends EtsyService {
	@JsonProperty("payment_adjustment_id")
	private Integer paymentAdjustmentId;
	@JsonProperty("payment_id")
	private Integer paymentId;
	@JsonProperty("status")
	private String status;
	@JsonProperty("is_success")
	private Boolean isSuccess;
	@JsonProperty("user_id")
	private Integer userId;
	@JsonProperty("reason_code")
	private String reasonCode;
	@JsonProperty("total_adjustment_amount")
	private Integer totalAdjustmentAmount;
	@JsonProperty("shop_total_adjustment_amount")
	private Integer shopTotalAdjustmentAmount;
	@JsonProperty("buyer_total_adjustment_amount")
	private Integer buyerTotalAdjustmentAmount;
	@JsonProperty("total_fee_adjustment_amount")
	private Integer totalFeeAdjustmentAmount;
	@JsonProperty("create_date")
	private Integer createDate;
	@JsonProperty("update_date")
	private Integer updateDate;
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
	public Boolean isSuccess() {
		return isSuccess;
	}
	/**
	 * @param isSuccess the isSuccess to set
	 */
	public void setSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
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
	public Integer getTotalAdjustmentAmount() {
		return totalAdjustmentAmount;
	}
	/**
	 * @param totalAdjustmentAmount the totalAdjustmentAmount to set
	 */
	public void setTotalAdjustmentAmount(Integer totalAdjustmentAmount) {
		this.totalAdjustmentAmount = totalAdjustmentAmount;
	}
	/**
	 * @return the shopTotalAdjustmentAmount
	 */
	public Integer getShopTotalAdjustmentAmount() {
		return shopTotalAdjustmentAmount;
	}
	/**
	 * @param shopTotalAdjustmentAmount the shopTotalAdjustmentAmount to set
	 */
	public void setShopTotalAdjustmentAmount(Integer shopTotalAdjustmentAmount) {
		this.shopTotalAdjustmentAmount = shopTotalAdjustmentAmount;
	}
	/**
	 * @return the buyerTotalAdjustmentAmount
	 */
	public Integer getBuyerTotalAdjustmentAmount() {
		return buyerTotalAdjustmentAmount;
	}
	/**
	 * @param buyerTotalAdjustmentAmount the buyerTotalAdjustmentAmount to set
	 */
	public void setBuyerTotalAdjustmentAmount(Integer buyerTotalAdjustmentAmount) {
		this.buyerTotalAdjustmentAmount = buyerTotalAdjustmentAmount;
	}
	/**
	 * @return the totalFeeAdjustmentAmount
	 */
	public Integer getTotalFeeAdjustmentAmount() {
		return totalFeeAdjustmentAmount;
	}
	/**
	 * @param totalFeeAdjustmentAmount the totalFeeAdjustmentAmount to set
	 */
	public void setTotalFeeAdjustmentAmount(Integer totalFeeAdjustmentAmount) {
		this.totalFeeAdjustmentAmount = totalFeeAdjustmentAmount;
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
	*Get a Payment Adjustments from a Payment Id
	*/
	@JsonIgnore
	public static void findPaymentAdjustments(Integer paymentId){EtsyService.getService("/payments/"+paymentId+"/adjustments");}
	/**
	*Get a Direct Checkout Payment Adjustment
	*/
	@JsonIgnore
	public static void findPaymentAdjustment(Integer paymentId, int paymentAdjustmentId){EtsyService.getService("/payments/"+paymentId+"/adjustments/"+paymentAdjustmentId);}
	/**
	*Get a Payment Adjustment from a Ledger Entry ID, if applicable
	*/
	@JsonIgnore
	public static void findPaymentAdjustmentForLedgerEntry(String shopId, int ledgerEntryId){EtsyService.getService("/shops/:shop_id/ledger/entries/"+ledgerEntryId+"/adjustment");}
}
