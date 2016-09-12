package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillPayment extends EtsyService {
	@JsonProperty("bill_payment_id")
	private Integer billPaymentId;
	@JsonProperty("creation_tsz")
	private Float creationTsz;
	@JsonProperty("type")
	private String type;
	@JsonProperty("type_id")
	private Integer typeId;
	@JsonProperty("user_id")
	private Integer userId;
	@JsonProperty("amount")
	private Float amount;
	@JsonProperty("currency_code")
	private String currencyCode;
	@JsonProperty("creation_month")
	private Integer creationMonth;
	@JsonProperty("creation_year")
	private Integer creationYear;
	/**
	 * @return the billPaymentId
	 */
	public Integer getBillPaymentId() {
		return billPaymentId;
	}
	/**
	 * @param billPaymentId the billPaymentId to set
	 */
	public void setBillPaymentId(Integer billPaymentId) {
		this.billPaymentId = billPaymentId;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the typeId
	 */
	public Integer getTypeId() {
		return typeId;
	}
	/**
	 * @param typeId the typeId to set
	 */
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
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
	 * @return the amount
	 */
	public Float getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Float amount) {
		this.amount = amount;
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
	 * @return the creationMonth
	 */
	public Integer getCreationMonth() {
		return creationMonth;
	}
	/**
	 * @param creationMonth the creationMonth to set
	 */
	public void setCreationMonth(Integer creationMonth) {
		this.creationMonth = creationMonth;
	}
	/**
	 * @return the creationYear
	 */
	public Integer getCreationYear() {
		return creationYear;
	}
	/**
	 * @param creationYear the creationYear to set
	 */
	public void setCreationYear(Integer creationYear) {
		this.creationYear = creationYear;
	}
	/**
	 * Retrieves a set of BillPayment objects associated to a User.
	 * @return
	 */
	@JsonIgnore
	public static String getAllUserPayments(){
		return EtsyService.getService("/users/__SELF__/payments");
	}
}
