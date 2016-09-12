package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillCharge extends EtsyService {
	@JsonProperty("listing")
	private Integer listing;
	@JsonProperty("edit")
	private Integer edit;
	@JsonProperty("renew")
	private Integer renew;
	@JsonProperty("renew_sold")
	private Integer renewSold;
	@JsonProperty("renew_sold_auto")
	private Integer renewSoldAuto;
	@JsonProperty("transaction_quantity")
	private Integer transactionQuantity;
	@JsonProperty("renew_expired")
	private Integer renewExpired;
	@JsonProperty("transaction")
	private Integer transaction;
	@JsonProperty("wholesale_contract")
	private Integer wholesaleContract;
	@JsonProperty("wholesale_transaction")
	private Integer wholesaleTransaction;
	@JsonProperty("shipping_labels")
	private Integer shippingLabels;
	@JsonProperty("shipping_label_insurance")
	private Integer shippingLabelInsurance;
	@JsonProperty("shipping_label_coverage")
	private Integer shippingLabelCoverage;
	@JsonProperty("shipping_label_taxes")
	private Integer shippingLabelTaxes;
	@JsonProperty("shipping_label_adjustment")
	private Integer shippingLabelAdjustment;
	@JsonProperty("shipping_label_adjustment_taxes")
	private Integer shippingLabelAdjustment_taxes;
	@JsonProperty("etsy_asap")
	private Integer etsyAsap;
	@JsonProperty("search_ads")
	private Integer searchAds;
	@JsonProperty("listing_private")
	private Integer listingPrivate;
	@JsonProperty("showcase_category")
	private Integer showcaseCategory;
	@JsonProperty("prolist")
	private Integer prolist;
	@JsonProperty("wholesale_setup_fee")
	private Integer wholesaleSetupFee;
	@JsonProperty("vat_tax")
	private Integer vatTax;
	/**
	 * @return the listing
	 */
	public Integer getListing() {
		return listing;
	}
	/**
	 * @param listing the listing to set
	 */
	public void setListing(Integer listing) {
		this.listing = listing;
	}
	/**
	 * @return the edit
	 */
	public Integer getEdit() {
		return edit;
	}
	/**
	 * @param edit the edit to set
	 */
	public void setEdit(Integer edit) {
		this.edit = edit;
	}
	/**
	 * @return the renew
	 */
	public Integer getRenew() {
		return renew;
	}
	/**
	 * @param renew the renew to set
	 */
	public void setRenew(Integer renew) {
		this.renew = renew;
	}
	/**
	 * @return the renewSold
	 */
	public Integer getRenewSold() {
		return renewSold;
	}
	/**
	 * @param renewSold the renewSold to set
	 */
	public void setRenewSold(Integer renewSold) {
		this.renewSold = renewSold;
	}
	/**
	 * @return the renewSoldAuto
	 */
	public Integer getRenewSoldAuto() {
		return renewSoldAuto;
	}
	/**
	 * @param renewSoldAuto the renewSoldAuto to set
	 */
	public void setRenewSoldAuto(Integer renewSoldAuto) {
		this.renewSoldAuto = renewSoldAuto;
	}
	/**
	 * @return the transactionQuantity
	 */
	public Integer getTransactionQuantity() {
		return transactionQuantity;
	}
	/**
	 * @param transactionQuantity the transactionQuantity to set
	 */
	public void setTransactionQuantity(Integer transactionQuantity) {
		this.transactionQuantity = transactionQuantity;
	}
	/**
	 * @return the renewExpired
	 */
	public Integer getRenewExpired() {
		return renewExpired;
	}
	/**
	 * @param renewExpired the renewExpired to set
	 */
	public void setRenewExpired(Integer renewExpired) {
		this.renewExpired = renewExpired;
	}
	/**
	 * @return the transaction
	 */
	public Integer getTransaction() {
		return transaction;
	}
	/**
	 * @param transaction the transaction to set
	 */
	public void setTransaction(Integer transaction) {
		this.transaction = transaction;
	}
	/**
	 * @return the wholesaleContract
	 */
	public Integer getWholesaleContract() {
		return wholesaleContract;
	}
	/**
	 * @param wholesaleContract the wholesaleContract to set
	 */
	public void setWholesaleContract(Integer wholesaleContract) {
		this.wholesaleContract = wholesaleContract;
	}
	/**
	 * @return the wholesaleTransaction
	 */
	public Integer getWholesaleTransaction() {
		return wholesaleTransaction;
	}
	/**
	 * @param wholesaleTransaction the wholesaleTransaction to set
	 */
	public void setWholesaleTransaction(Integer wholesaleTransaction) {
		this.wholesaleTransaction = wholesaleTransaction;
	}
	/**
	 * @return the shippingLabels
	 */
	public Integer getShippingLabels() {
		return shippingLabels;
	}
	/**
	 * @param shippingLabels the shippingLabels to set
	 */
	public void setShippingLabels(Integer shippingLabels) {
		this.shippingLabels = shippingLabels;
	}
	/**
	 * @return the shippingLabelInsurance
	 */
	public Integer getShippingLabelInsurance() {
		return shippingLabelInsurance;
	}
	/**
	 * @param shippingLabelInsurance the shippingLabelInsurance to set
	 */
	public void setShippingLabelInsurance(Integer shippingLabelInsurance) {
		this.shippingLabelInsurance = shippingLabelInsurance;
	}
	/**
	 * @return the shippingLabelCoverage
	 */
	public Integer getShippingLabelCoverage() {
		return shippingLabelCoverage;
	}
	/**
	 * @param shippingLabelCoverage the shippingLabelCoverage to set
	 */
	public void setShippingLabelCoverage(Integer shippingLabelCoverage) {
		this.shippingLabelCoverage = shippingLabelCoverage;
	}
	/**
	 * @return the shippingLabelTaxes
	 */
	public Integer getShippingLabelTaxes() {
		return shippingLabelTaxes;
	}
	/**
	 * @param shippingLabelTaxes the shippingLabelTaxes to set
	 */
	public void setShippingLabelTaxes(Integer shippingLabelTaxes) {
		this.shippingLabelTaxes = shippingLabelTaxes;
	}
	/**
	 * @return the shippingLabelAdjustment
	 */
	public Integer getShippingLabelAdjustment() {
		return shippingLabelAdjustment;
	}
	/**
	 * @param shippingLabelAdjustment the shippingLabelAdjustment to set
	 */
	public void setShippingLabelAdjustment(Integer shippingLabelAdjustment) {
		this.shippingLabelAdjustment = shippingLabelAdjustment;
	}
	/**
	 * @return the shippingLabelAdjustment_taxes
	 */
	public Integer getShippingLabelAdjustment_taxes() {
		return shippingLabelAdjustment_taxes;
	}
	/**
	 * @param shippingLabelAdjustment_taxes the shippingLabelAdjustment_taxes to set
	 */
	public void setShippingLabelAdjustment_taxes(Integer shippingLabelAdjustment_taxes) {
		this.shippingLabelAdjustment_taxes = shippingLabelAdjustment_taxes;
	}
	/**
	 * @return the etsyAsap
	 */
	public Integer getEtsyAsap() {
		return etsyAsap;
	}
	/**
	 * @param etsyAsap the etsyAsap to set
	 */
	public void setEtsyAsap(Integer etsyAsap) {
		this.etsyAsap = etsyAsap;
	}
	/**
	 * @return the searchAds
	 */
	public Integer getSearchAds() {
		return searchAds;
	}
	/**
	 * @param searchAds the searchAds to set
	 */
	public void setSearchAds(Integer searchAds) {
		this.searchAds = searchAds;
	}
	/**
	 * @return the listingPrivate
	 */
	public Integer getListingPrivate() {
		return listingPrivate;
	}
	/**
	 * @param listingPrivate the listingPrivate to set
	 */
	public void setListingPrivate(Integer listingPrivate) {
		this.listingPrivate = listingPrivate;
	}
	/**
	 * @return the showcaseCategory
	 */
	public Integer getShowcaseCategory() {
		return showcaseCategory;
	}
	/**
	 * @param showcaseCategory the showcaseCategory to set
	 */
	public void setShowcaseCategory(Integer showcaseCategory) {
		this.showcaseCategory = showcaseCategory;
	}
	/**
	 * @return the prolist
	 */
	public Integer getProlist() {
		return prolist;
	}
	/**
	 * @param prolist the prolist to set
	 */
	public void setProlist(Integer prolist) {
		this.prolist = prolist;
	}
	/**
	 * @return the wholesaleSetupFee
	 */
	public Integer getWholesaleSetupFee() {
		return wholesaleSetupFee;
	}
	/**
	 * @param wholesaleSetupFee the wholesaleSetupFee to set
	 */
	public void setWholesaleSetupFee(Integer wholesaleSetupFee) {
		this.wholesaleSetupFee = wholesaleSetupFee;
	}
	/**
	 * @return the vatTax
	 */
	public Integer getVatTax() {
		return vatTax;
	}
	/**
	 * @param vatTax the vatTax to set
	 */
	public void setVatTax(Integer vatTax) {
		this.vatTax = vatTax;
	}
	
	/**
	 * Metadata for the set of BillCharges objects associated to a User
	 * @return
	 */
	@JsonIgnore
	public static String getUserChargesMetadata(){
		return EtsyService.getService("users/__SELF__/charges/meta");
	}
	/**
	 * 	Retrieves a set of BillCharge objects associated to a User. 
	 *  NOTE: from 8/8/12 the min_created and max_created arguments will be mandatory 
	 *  and can be no more than 31 days apart.
	 */
	@JsonIgnore
	public static String getAllUserCharges(){
		return EtsyService.getService("users/__SELF__/charges");
	}
}
