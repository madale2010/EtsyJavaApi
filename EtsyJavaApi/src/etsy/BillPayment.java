package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class BillPayment extends EtsyService {
	private int billPaymentId;
	private float creationTsz;
	private String type;
	private int typeId;
	private int userId;
	private float amount;
	private String currencyCode;
	private int creationMonth;
	private int creationYear;
	/**
	 * @return the billPaymentId
	 */
	public int getBillPaymentId() {
		return billPaymentId;
	}
	/**
	 * @param billPaymentId the billPaymentId to set
	 */
	public void setBillPaymentId(int billPaymentId) {
		this.billPaymentId = billPaymentId;
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
	public int getTypeId() {
		return typeId;
	}
	/**
	 * @param typeId the typeId to set
	 */
	public void setTypeId(int typeId) {
		this.typeId = typeId;
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
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(float amount) {
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
	public int getCreationMonth() {
		return creationMonth;
	}
	/**
	 * @param creationMonth the creationMonth to set
	 */
	public void setCreationMonth(int creationMonth) {
		this.creationMonth = creationMonth;
	}
	/**
	 * @return the creationYear
	 */
	public int getCreationYear() {
		return creationYear;
	}
	/**
	 * @param creationYear the creationYear to set
	 */
	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}
	/**
	 * Retrieves a set of BillPayment objects associated to a User.
	 * @return
	 */
	public static String getAllUserPayments(){
		return EtsyService.getService("/users/__SELF__/payments");
	}
}
