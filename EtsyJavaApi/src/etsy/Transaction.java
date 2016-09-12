package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Transaction extends EtsyService {
	@JsonProperty("transaction_id")
	private Integer transactionId;
	@JsonProperty("title")
	private String title;
	@JsonProperty("description")
	private String description;
	@JsonProperty("seller_user_id")
	private Integer sellerUserId;
	@JsonProperty("buyer_user_id")
	private Integer buyerUserId;
	@JsonProperty("creation_tsz")
	private Float creationTsz;
	@JsonProperty("paid_tsz")
	private Float paidTsz;
	@JsonProperty("shipped_tsz")
	private Float shippedTsz;
	@JsonProperty("price")
	private Float price;
	@JsonProperty("currency_code")
	private String currencyCode;
	@JsonProperty("quantity")
	private Integer quantity;
	@JsonProperty("tags")
	private ArrayList<String> tags;
	@JsonProperty("materials")
	private ArrayList<String> materials;
	@JsonProperty("image_listing_id")
	private Integer imageListingId;
	@JsonProperty("receipt_id")
	private Integer receiptId;
	@JsonProperty("shipping_cost")
	private Float shippingCost;
	@JsonProperty("is_digital")
	private Boolean isDigital;
	@JsonProperty("file_data")
	private String fileData;
	@JsonProperty("listing_id")
	private Integer listingId;
	@JsonProperty("is_quick_sale")
	private Boolean isQuickSale;
	@JsonProperty("seller_feedback_id")
	private Integer sellerFeedbackId;
	@JsonProperty("buyer_feedback_id")
	private Integer buyerFeedbackId;
	@JsonProperty("transaction_type")
	private String transactionType;
	@JsonProperty("url")
	private String url;
	@JsonProperty("variations")
	private ArrayList<VariationsSelectedProperty> variations;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the sellerUserId
	 */
	public Integer getSellerUserId() {
		return sellerUserId;
	}
	/**
	 * @param sellerUserId the sellerUserId to set
	 */
	public void setSellerUserId(Integer sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
	/**
	 * @return the buyerUserId
	 */
	public Integer getBuyerUserId() {
		return buyerUserId;
	}
	/**
	 * @param buyerUserId the buyerUserId to set
	 */
	public void setBuyerUserId(Integer buyerUserId) {
		this.buyerUserId = buyerUserId;
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
	 * @return the paidTsz
	 */
	public Float getPaidTsz() {
		return paidTsz;
	}
	/**
	 * @param paidTsz the paidTsz to set
	 */
	public void setPaidTsz(Float paidTsz) {
		this.paidTsz = paidTsz;
	}
	/**
	 * @return the shippedTsz
	 */
	public Float getShippedTsz() {
		return shippedTsz;
	}
	/**
	 * @param shippedTsz the shippedTsz to set
	 */
	public void setShippedTsz(Float shippedTsz) {
		this.shippedTsz = shippedTsz;
	}
	/**
	 * @return the price
	 */
	public Float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Float price) {
		this.price = price;
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
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the tags
	 */
	public ArrayList<String> getTags() {
		return tags;
	}
	/**
	 * @param tags the tags to set
	 */
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	/**
	 * @return the materials
	 */
	public ArrayList<String> getMaterials() {
		return materials;
	}
	/**
	 * @param materials the materials to set
	 */
	public void setMaterials(ArrayList<String> materials) {
		this.materials = materials;
	}
	/**
	 * @return the imageListingId
	 */
	public Integer getImageListingId() {
		return imageListingId;
	}
	/**
	 * @param imageListingId the imageListingId to set
	 */
	public void setImageListingId(Integer imageListingId) {
		this.imageListingId = imageListingId;
	}
	/**
	 * @return the receiptId
	 */
	public Integer getReceiptId() {
		return receiptId;
	}
	/**
	 * @param receiptId the receiptId to set
	 */
	public void setReceiptId(Integer receiptId) {
		this.receiptId = receiptId;
	}
	/**
	 * @return the shippingCost
	 */
	public Float getShippingCost() {
		return shippingCost;
	}
	/**
	 * @param shippingCost the shippingCost to set
	 */
	public void setShippingCost(Float shippingCost) {
		this.shippingCost = shippingCost;
	}
	/**
	 * @return the isDigital
	 */
	public Boolean isDigital() {
		return isDigital;
	}
	/**
	 * @param isDigital the isDigital to set
	 */
	public void setDigital(Boolean isDigital) {
		this.isDigital = isDigital;
	}
	/**
	 * @return the fileData
	 */
	public String getFileData() {
		return fileData;
	}
	/**
	 * @param fileData the fileData to set
	 */
	public void setFileData(String fileData) {
		this.fileData = fileData;
	}
	/**
	 * @return the listingId
	 */
	public Integer getListingId() {
		return listingId;
	}
	/**
	 * @param listingId the listingId to set
	 */
	public void setListingId(Integer listingId) {
		this.listingId = listingId;
	}
	/**
	 * @return the isQuickSale
	 */
	public Boolean isQuickSale() {
		return isQuickSale;
	}
	/**
	 * @param isQuickSale the isQuickSale to set
	 */
	public void setQuickSale(Boolean isQuickSale) {
		this.isQuickSale = isQuickSale;
	}
	/**
	 * @return the sellerFeedbackId
	 */
	public Integer getSellerFeedbackId() {
		return sellerFeedbackId;
	}
	/**
	 * @param sellerFeedbackId the sellerFeedbackId to set
	 */
	public void setSellerFeedbackId(Integer sellerFeedbackId) {
		this.sellerFeedbackId = sellerFeedbackId;
	}
	/**
	 * @return the buyerFeedbackId
	 */
	public Integer getBuyerFeedbackId() {
		return buyerFeedbackId;
	}
	/**
	 * @param buyerFeedbackId the buyerFeedbackId to set
	 */
	public void setBuyerFeedbackId(Integer buyerFeedbackId) {
		this.buyerFeedbackId = buyerFeedbackId;
	}
	/**
	 * @return the transactionType
	 */
	public String getTransactionType() {
		return transactionType;
	}
	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the variations
	 */
	public ArrayList<VariationsSelectedProperty> getVariations() {
		return variations;
	}
	/**
	 * @param variations the variations to set
	 */
	public void setVariations(ArrayList<VariationsSelectedProperty> variations) {
		this.variations = variations;
	}
	/**
	*Retrieves a Shop_Transaction by id.
	*/
	@JsonIgnore
	public static void getShopTransaction(Integer transactionId ){EtsyService.getService("/transactions/"+transactionId);}
	/**
	*Retrieves a set of Transaction objects associated to a Listing.
	*/
	@JsonIgnore
	public static void getAllListingTransactions(Integer listingId){EtsyService.getService("/listings/"+listingId+"/transactions");}
	/**
	*Retrieves a set of Transaction objects associated to a Shop_Receipt2.
	*/
	@JsonIgnore
	public static void getAllShopReceipt2Transactions(Integer receiptId){EtsyService.getService("/receipts/"+receiptId+"/transactions");}
	/**
	*Retrieves a set of Transaction objects associated to a Shop.
	*/
	@JsonIgnore
	public static void getAllShopTransactions(String shopId){EtsyService.getService("/shops/"+shopId+"/transactions");}
	/**
	*Retrieves a set of Transaction objects associated to a User.
	*/
	@JsonIgnore
	public static void getAllUserBuyerTransactions(String userId){EtsyService.getService("/users/"+userId+"/transactions");}
}
