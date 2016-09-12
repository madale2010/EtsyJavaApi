package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartListing extends EtsyService {
	@JsonProperty("listing_id")
	private Integer listingId;
	@JsonProperty("purchase_quantity")
	private Integer purchaseQuantity;
	@JsonProperty("purchase_state")
	private String purchaseState;
	@JsonProperty("is_digital")
	private Boolean isDigital;
	@JsonProperty("file_data")
	private String fileData;
	@JsonProperty("listing_customization_id")
	private Integer listingCustomizationId;
	@JsonProperty("variations_available")
	private Boolean variationsAvailable;
	@JsonProperty("has_variations")
	private Boolean hasVariations;
	@JsonProperty("selected_variations")
	private ArrayList<VariationsSelectedProperty> selectedVariations;
	@JsonProperty("offers_local_delivery")
	private Boolean offersLocalDelivery;
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
	 * @return the purchaseQuantity
	 */
	public Integer getPurchaseQuantity() {
		return purchaseQuantity;
	}
	/**
	 * @param purchaseQuantity the purchaseQuantity to set
	 */
	public void setPurchaseQuantity(Integer purchaseQuantity) {
		this.purchaseQuantity = purchaseQuantity;
	}
	/**
	 * @return the purchaseState
	 */
	public String getPurchaseState() {
		return purchaseState;
	}
	/**
	 * @param purchaseState the purchaseState to set
	 */
	public void setPurchaseState(String purchaseState) {
		this.purchaseState = purchaseState;
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
	 * @return the listingCustomizationId
	 */
	public Integer getListingCustomizationId() {
		return listingCustomizationId;
	}
	/**
	 * @param listingCustomizationId the listingCustomizationId to set
	 */
	public void setListingCustomizationId(Integer listingCustomizationId) {
		this.listingCustomizationId = listingCustomizationId;
	}
	/**
	 * @return the variationsAvailable
	 */
	public Boolean isVariationsAvailable() {
		return variationsAvailable;
	}
	/**
	 * @param variationsAvailable the variationsAvailable to set
	 */
	public void setVariationsAvailable(Boolean variationsAvailable) {
		this.variationsAvailable = variationsAvailable;
	}
	/**
	 * @return the hasVariations
	 */
	public Boolean isHasVariations() {
		return hasVariations;
	}
	/**
	 * @param hasVariations the hasVariations to set
	 */
	public void setHasVariations(Boolean hasVariations) {
		this.hasVariations = hasVariations;
	}
	/**
	 * @return the selectedVariations
	 */
	public ArrayList<VariationsSelectedProperty> getSelectedVariations() {
		return selectedVariations;
	}
	/**
	 * @param selectedVariations the selectedVariations to set
	 */
	public void setSelectedVariations(ArrayList<VariationsSelectedProperty> selectedVariations) {
		this.selectedVariations = selectedVariations;
	}
	/**
	 * @return the offersLocalDelivery
	 */
	public Boolean isOffersLocalDelivery() {
		return offersLocalDelivery;
	}
	/**
	 * @param offersLocalDelivery the offersLocalDelivery to set
	 */
	public void setOffersLocalDelivery(Boolean offersLocalDelivery) {
		this.offersLocalDelivery = offersLocalDelivery;
	}
}
