package com.madbox.etsyApi;

public class BillingOverview extends EtsyService {
	private boolean isOverdue;
	private String currencyCode;
	private float overdueBalance;
	private float balanceDue;
	private float totalBalance;
	private String dateDue;
	/**
	 * @return the isOverdue
	 */
	public boolean isOverdue() {
		return isOverdue;
	}
	/**
	 * @param isOverdue the isOverdue to set
	 */
	public void setOverdue(boolean isOverdue) {
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
	public float getOverdueBalance() {
		return overdueBalance;
	}
	/**
	 * @param overdueBalance the overdueBalance to set
	 */
	public void setOverdueBalance(float overdueBalance) {
		this.overdueBalance = overdueBalance;
	}
	/**
	 * @return the balanceDue
	 */
	public float getBalanceDue() {
		return balanceDue;
	}
	/**
	 * @param balanceDue the balanceDue to set
	 */
	public void setBalanceDue(float balanceDue) {
		this.balanceDue = balanceDue;
	}
	/**
	 * @return the totalBalance
	 */
	public float getTotalBalance() {
		return totalBalance;
	}
	/**
	 * @param totalBalance the totalBalance to set
	 */
	public void setTotalBalance(float totalBalance) {
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
	public static String getUserBillingOverview(){
		return EtsyService.getService("/users/__SELF__/billing/overview");
	}
}
