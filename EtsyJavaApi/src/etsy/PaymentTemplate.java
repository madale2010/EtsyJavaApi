package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentTemplate extends EtsyService {
	@JsonProperty("payment_template_id")
	private Integer payment_templateId;
	@JsonProperty("allow_bt")
	private Boolean allowBt;
	@JsonProperty("allow_check")
	private Boolean allowCheck;
	@JsonProperty("allow_mo")
	private Boolean allowMo;
	@JsonProperty("allow_other")
	private Boolean allowOther;
	@JsonProperty("allow_paypal")
	private Boolean allowPaypal;
	@JsonProperty("allow_cc")
	private Boolean allowCc;
	@JsonProperty("paypal_email")
	private String paypalEmail;
	@JsonProperty("name")
	private String name;
	@JsonProperty("first_line")
	private String firstLine;
	@JsonProperty("second_line")
	private String secondLine;
	@JsonProperty("city")
	private String city;
	@JsonProperty("state")
	private String state;
	@JsonProperty("zip")
	private String zip;
	@JsonProperty("country_id")
	private Integer countryId;
	@JsonProperty("user_id")
	private Integer userId;
	@JsonProperty("listing_payment_id")
	private Integer listingPaymentId;
	/**
	 * @return the payment_templateId
	 */
	public Integer getPayment_templateId() {
		return payment_templateId;
	}
	/**
	 * @param payment_templateId the payment_templateId to set
	 */
	public void setPayment_templateId(Integer payment_templateId) {
		this.payment_templateId = payment_templateId;
	}
	/**
	 * @return the allowBt
	 */
	public Boolean isAllowBt() {
		return allowBt;
	}
	/**
	 * @param allowBt the allowBt to set
	 */
	public void setAllowBt(Boolean allowBt) {
		this.allowBt = allowBt;
	}
	/**
	 * @return the allowCheck
	 */
	public Boolean isAllowCheck() {
		return allowCheck;
	}
	/**
	 * @param allowCheck the allowCheck to set
	 */
	public void setAllowCheck(Boolean allowCheck) {
		this.allowCheck = allowCheck;
	}
	/**
	 * @return the allowMo
	 */
	public Boolean isAllowMo() {
		return allowMo;
	}
	/**
	 * @param allowMo the allowMo to set
	 */
	public void setAllowMo(Boolean allowMo) {
		this.allowMo = allowMo;
	}
	/**
	 * @return the allowOther
	 */
	public Boolean isAllowOther() {
		return allowOther;
	}
	/**
	 * @param allowOther the allowOther to set
	 */
	public void setAllowOther(Boolean allowOther) {
		this.allowOther = allowOther;
	}
	/**
	 * @return the allowPaypal
	 */
	public Boolean isAllowPaypal() {
		return allowPaypal;
	}
	/**
	 * @param allowPaypal the allowPaypal to set
	 */
	public void setAllowPaypal(Boolean allowPaypal) {
		this.allowPaypal = allowPaypal;
	}
	/**
	 * @return the allowCc
	 */
	public Boolean isAllowCc() {
		return allowCc;
	}
	/**
	 * @param allowCc the allowCc to set
	 */
	public void setAllowCc(Boolean allowCc) {
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
	public Integer getCountryId() {
		return countryId;
	}
	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
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
	 * @return the listingPaymentId
	 */
	public Integer getListingPaymentId() {
		return listingPaymentId;
	}
	/**
	 * @param listingPaymentId the listingPaymentId to set
	 */
	public void setListingPaymentId(Integer listingPaymentId) {
		this.listingPaymentId = listingPaymentId;
	}
	/**
	*Retrieves the PaymentTemplate associated with the Shop
	*/
	@JsonIgnore
	public static void findShopPaymentTemplates(String shopId){EtsyService.getService("/shops/"+shopId+"/payment_templates");}
	/**
	*Creates a new PaymentTemplate
	*/
	@JsonIgnore
	public void createShopPaymentTemplate(String shopId){EtsyService.postService("/shops/"+shopId+"/payment_templates", this);}
	/**
	*Updates a PaymentTemplate
	*/
	@JsonIgnore
	public void updateShopPaymentTemplate(String shopId, int paymentTemplateId){EtsyService.putService("/shops/"+shopId+"/payment_templates/"+paymentTemplateId, this);}
	/**
	*Retrieves a set of PaymentTemplate objects associated to a User.
	*/
	@JsonIgnore
	public static void getAllUserPaymentTemplates(String userId){EtsyService.getService("/users/"+userId+"/payments/templates");}
}
