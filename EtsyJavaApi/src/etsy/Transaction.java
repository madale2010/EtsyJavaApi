package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Transaction {
	private int transactionId;
	private String title;
	private String description;
	private int sellerUserId;
	private int buyerUserId;
	private float creationTsz;
	private float paidTsz;
	private float shippedTsz;
	private float price;
	private String currencyCode;
	private int quantity;
	private ArrayList<String> tags;
	private ArrayList<String> materials;
	private int imageListingId;
	private int receiptId;
	private float shippingCost;
	private boolean isDigital;
	private String fileData;
	private int listingId;
	private boolean isQuickSale;
	private int sellerFeedbackId;
	private int buyerFeedbackId;
	private String transactionType;
	private String url;
	private ArrayList<VariationsSelectedProperty> variations;
	/**
	 * @return the transactionId
	 */
	public int getTransactionId() {
		return transactionId;
	}
	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(int transactionId) {
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
	public int getSellerUserId() {
		return sellerUserId;
	}
	/**
	 * @param sellerUserId the sellerUserId to set
	 */
	public void setSellerUserId(int sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
	/**
	 * @return the buyerUserId
	 */
	public int getBuyerUserId() {
		return buyerUserId;
	}
	/**
	 * @param buyerUserId the buyerUserId to set
	 */
	public void setBuyerUserId(int buyerUserId) {
		this.buyerUserId = buyerUserId;
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
	 * @return the paidTsz
	 */
	public float getPaidTsz() {
		return paidTsz;
	}
	/**
	 * @param paidTsz the paidTsz to set
	 */
	public void setPaidTsz(float paidTsz) {
		this.paidTsz = paidTsz;
	}
	/**
	 * @return the shippedTsz
	 */
	public float getShippedTsz() {
		return shippedTsz;
	}
	/**
	 * @param shippedTsz the shippedTsz to set
	 */
	public void setShippedTsz(float shippedTsz) {
		this.shippedTsz = shippedTsz;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
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
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
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
	public int getImageListingId() {
		return imageListingId;
	}
	/**
	 * @param imageListingId the imageListingId to set
	 */
	public void setImageListingId(int imageListingId) {
		this.imageListingId = imageListingId;
	}
	/**
	 * @return the receiptId
	 */
	public int getReceiptId() {
		return receiptId;
	}
	/**
	 * @param receiptId the receiptId to set
	 */
	public void setReceiptId(int receiptId) {
		this.receiptId = receiptId;
	}
	/**
	 * @return the shippingCost
	 */
	public float getShippingCost() {
		return shippingCost;
	}
	/**
	 * @param shippingCost the shippingCost to set
	 */
	public void setShippingCost(float shippingCost) {
		this.shippingCost = shippingCost;
	}
	/**
	 * @return the isDigital
	 */
	public boolean isDigital() {
		return isDigital;
	}
	/**
	 * @param isDigital the isDigital to set
	 */
	public void setDigital(boolean isDigital) {
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
	public int getListingId() {
		return listingId;
	}
	/**
	 * @param listingId the listingId to set
	 */
	public void setListingId(int listingId) {
		this.listingId = listingId;
	}
	/**
	 * @return the isQuickSale
	 */
	public boolean isQuickSale() {
		return isQuickSale;
	}
	/**
	 * @param isQuickSale the isQuickSale to set
	 */
	public void setQuickSale(boolean isQuickSale) {
		this.isQuickSale = isQuickSale;
	}
	/**
	 * @return the sellerFeedbackId
	 */
	public int getSellerFeedbackId() {
		return sellerFeedbackId;
	}
	/**
	 * @param sellerFeedbackId the sellerFeedbackId to set
	 */
	public void setSellerFeedbackId(int sellerFeedbackId) {
		this.sellerFeedbackId = sellerFeedbackId;
	}
	/**
	 * @return the buyerFeedbackId
	 */
	public int getBuyerFeedbackId() {
		return buyerFeedbackId;
	}
	/**
	 * @param buyerFeedbackId the buyerFeedbackId to set
	 */
	public void setBuyerFeedbackId(int buyerFeedbackId) {
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
	public static void getShopTransaction(int transactionId ){EtsyService.getService("/transactions/"+transactionId);}
	/**
	*Retrieves a set of Transaction objects associated to a Listing.
	*/
	public static void getAllListingTransactions(int listingId){EtsyService.getService("/listings/"+listingId+"/transactions");}
	/**
	*Retrieves a set of Transaction objects associated to a Shop_Receipt2.
	*/
	public static void getAllShopReceipt2Transactions(int receiptId){EtsyService.getService("/receipts/"+receiptId+"/transactions");}
	/**
	*Retrieves a set of Transaction objects associated to a Shop.
	*/
	public static void getAllShopTransactions(String shopId){EtsyService.getService("/shops/"+shopId+"/transactions");}
	/**
	*Retrieves a set of Transaction objects associated to a User.
	*/
	public static void getAllUserBuyerTransactions(String userId){EtsyService.getService("/users/"+userId+"/transactions");}
}
