package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class CartListing {
	private int listingId;
	private int purchaseQuantity;
	private String purchaseState;
	private boolean isDigital;
	private String fileData;
	private int listingCustomizationId;
	private boolean variationsAvailable;
	private boolean hasVariations;
	private ArrayList<VariationsSelectedProperty> selectedVariations;
	private boolean offersLocalDelivery;
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
	 * @return the purchaseQuantity
	 */
	public int getPurchaseQuantity() {
		return purchaseQuantity;
	}
	/**
	 * @param purchaseQuantity the purchaseQuantity to set
	 */
	public void setPurchaseQuantity(int purchaseQuantity) {
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
	 * @return the listingCustomizationId
	 */
	public int getListingCustomizationId() {
		return listingCustomizationId;
	}
	/**
	 * @param listingCustomizationId the listingCustomizationId to set
	 */
	public void setListingCustomizationId(int listingCustomizationId) {
		this.listingCustomizationId = listingCustomizationId;
	}
	/**
	 * @return the variationsAvailable
	 */
	public boolean isVariationsAvailable() {
		return variationsAvailable;
	}
	/**
	 * @param variationsAvailable the variationsAvailable to set
	 */
	public void setVariationsAvailable(boolean variationsAvailable) {
		this.variationsAvailable = variationsAvailable;
	}
	/**
	 * @return the hasVariations
	 */
	public boolean isHasVariations() {
		return hasVariations;
	}
	/**
	 * @param hasVariations the hasVariations to set
	 */
	public void setHasVariations(boolean hasVariations) {
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
	public boolean isOffersLocalDelivery() {
		return offersLocalDelivery;
	}
	/**
	 * @param offersLocalDelivery the offersLocalDelivery to set
	 */
	public void setOffersLocalDelivery(boolean offersLocalDelivery) {
		this.offersLocalDelivery = offersLocalDelivery;
	}
}
