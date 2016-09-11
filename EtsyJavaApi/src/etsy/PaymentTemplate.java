package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class PaymentTemplate {
	private int payment_templateId;
	private boolean allowBt;
	private boolean allowCheck;
	private boolean allowMo;
	private boolean allowOther;
	private boolean allowPaypal;
	private boolean allowCc;
	private String paypalEmail;
	private String name;
	private String firstLine;
	private String secondLine;
	private String city;
	private String state;
	private String zip;
	private int countryId;
	private int userId;
	private int listingPaymentId;
	/**
	 * @return the payment_templateId
	 */
	public int getPayment_templateId() {
		return payment_templateId;
	}
	/**
	 * @param payment_templateId the payment_templateId to set
	 */
	public void setPayment_templateId(int payment_templateId) {
		this.payment_templateId = payment_templateId;
	}
	/**
	 * @return the allowBt
	 */
	public boolean isAllowBt() {
		return allowBt;
	}
	/**
	 * @param allowBt the allowBt to set
	 */
	public void setAllowBt(boolean allowBt) {
		this.allowBt = allowBt;
	}
	/**
	 * @return the allowCheck
	 */
	public boolean isAllowCheck() {
		return allowCheck;
	}
	/**
	 * @param allowCheck the allowCheck to set
	 */
	public void setAllowCheck(boolean allowCheck) {
		this.allowCheck = allowCheck;
	}
	/**
	 * @return the allowMo
	 */
	public boolean isAllowMo() {
		return allowMo;
	}
	/**
	 * @param allowMo the allowMo to set
	 */
	public void setAllowMo(boolean allowMo) {
		this.allowMo = allowMo;
	}
	/**
	 * @return the allowOther
	 */
	public boolean isAllowOther() {
		return allowOther;
	}
	/**
	 * @param allowOther the allowOther to set
	 */
	public void setAllowOther(boolean allowOther) {
		this.allowOther = allowOther;
	}
	/**
	 * @return the allowPaypal
	 */
	public boolean isAllowPaypal() {
		return allowPaypal;
	}
	/**
	 * @param allowPaypal the allowPaypal to set
	 */
	public void setAllowPaypal(boolean allowPaypal) {
		this.allowPaypal = allowPaypal;
	}
	/**
	 * @return the allowCc
	 */
	public boolean isAllowCc() {
		return allowCc;
	}
	/**
	 * @param allowCc the allowCc to set
	 */
	public void setAllowCc(boolean allowCc) {
		this.allowCc = allowCc;
	}
	/**
	 * @return the paypalEmail
	 */
	public String getPaypalEmail() {
		return paypalEmail;
	}
	/**
	 * @param paypalEmail the paypalEmail to set
	 */
	public void setPaypalEmail(String paypalEmail) {
		this.paypalEmail = paypalEmail;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the firstLine
	 */
	public String getFirstLine() {
		return firstLine;
	}
	/**
	 * @param firstLine the firstLine to set
	 */
	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}
	/**
	 * @return the secondLine
	 */
	public String getSecondLine() {
		return secondLine;
	}
	/**
	 * @param secondLine the secondLine to set
	 */
	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	/**
	 * @return the countryId
	 */
	public int getCountryId() {
		return countryId;
	}
	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(int countryId) {
		this.countryId = countryId;
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
	 * @return the listingPaymentId
	 */
	public int getListingPaymentId() {
		return listingPaymentId;
	}
	/**
	 * @param listingPaymentId the listingPaymentId to set
	 */
	public void setListingPaymentId(int listingPaymentId) {
		this.listingPaymentId = listingPaymentId;
	}
	/**
	*Retrieves the PaymentTemplate associated with the Shop
	*/
	public static void findShopPaymentTemplates(String shopId){EtsyService.getService("/shops/"+shopId+"/payment_templates");}
	/**
	*Creates a new PaymentTemplate
	*/
	public void createShopPaymentTemplate(String shopId){EtsyService.postService("/shops/"+shopId+"/payment_templates", this);}
	/**
	*Updates a PaymentTemplate
	*/
	public void updateShopPaymentTemplate(String shopId, int paymentTemplateId){EtsyService.putService("/shops/"+shopId+"/payment_templates/"+paymentTemplateId, this);}
	/**
	*Retrieves a set of PaymentTemplate objects associated to a User.
	*/
	public static void getAllUserPaymentTemplates(String userId){EtsyService.getService("/users/"+userId+"/payments/templates");}
}
