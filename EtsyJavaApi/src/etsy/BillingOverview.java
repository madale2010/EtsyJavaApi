package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingOverview extends EtsyService {
	@JsonProperty("is_overdue")
	private Boolean isOverdue;
	@JsonProperty("currency_code")
	private String currencyCode;
	@JsonProperty("overdue_balance")
	private Float overdueBalance;
	@JsonProperty("balance_due")
	private Float balanceDue;
	@JsonProperty("total_balance")
	private Float totalBalance;
	@JsonProperty("date_due")
	private String dateDue;
	/**
	 * @return the isOverdue
	 */
	public Boolean isOverdue() {
		return isOverdue;
	}
	/**
	 * @param isOverdue the isOverdue to set
	 */
	public void setOverdue(Boolean isOverdue) {
		this.isOverdue = isOverdue;
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
	 * @return the overdueBalance
	 */
	public Float getOverdueBalance() {
		return overdueBalance;
	}
	/**
	 * @param overdueBalance the overdueBalance to set
	 */
	public void setOverdueBalance(Float overdueBalance) {
		this.overdueBalance = overdueBalance;
	}
	/**
	 * @return the balanceDue
	 */
	public Float getBalanceDue() {
		return balanceDue;
	}
	/**
	 * @param balanceDue the balanceDue to set
	 */
	public void setBalanceDue(Float balanceDue) {
		this.balanceDue = balanceDue;
	}
	/**
	 * @return the totalBalance
	 */
	public Float getTotalBalance() {
		return totalBalance;
	}
	/**
	 * @param totalBalance the totalBalance to set
	 */
	public void setTotalBalance(Float totalBalance) {
		this.totalBalance = totalBalance;
	}
	/**
	 * @return the dateDue
	 */
	public String getDateDue() {
		return dateDue;
	}
	/**
	 * @param dateDue the dateDue to set
	 */
	public void setDateDue(String dateDue) {
		this.dateDue = dateDue;
	}
	@JsonIgnore
	public static String getUserBillingOverview(){
		return EtsyService.getService("/users/__SELF__/billing/overview");
	}
}
