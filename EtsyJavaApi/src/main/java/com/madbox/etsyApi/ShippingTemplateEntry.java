package com.madbox.etsyApi;

public class ShippingTemplateEntry {
	private int shippingTemplateEntryId;
	private int shippingTemplateId;
	private String currencyCode;
	private int originCountryId;
	private int destinationCountryId;
	private int destinationRegionId;
	private float primaryCost;
	private float secondaryCost;
	/**
	 * @return the shippingTemplateEntryId
	 */
	public int getShippingTemplateEntryId() {
		return shippingTemplateEntryId;
	}
	/**
	 * @param shippingTemplateEntryId the shippingTemplateEntryId to set
	 */
	public void setShippingTemplateEntryId(int shippingTemplateEntryId) {
		this.shippingTemplateEntryId = shippingTemplateEntryId;
	}
	/**
	 * @return the shippingTemplateId
	 */
	public int getShippingTemplateId() {
		return shippingTemplateId;
	}
	/**
	 * @param shippingTemplateId the shippingTemplateId to set
	 */
	public void setShippingTemplateId(int shippingTemplateId) {
		this.shippingTemplateId = shippingTemplateId;
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
	 * @return the originCountryId
	 */
	public int getOriginCountryId() {
		return originCountryId;
	}
	/**
	 * @param originCountryId the originCountryId to set
	 */
	public void setOriginCountryId(int originCountryId) {
		this.originCountryId = originCountryId;
	}
	/**
	 * @return the destinationCountryId
	 */
	public int getDestinationCountryId() {
		return destinationCountryId;
	}
	/**
	 * @param destinationCountryId the destinationCountryId to set
	 */
	public void setDestinationCountryId(int destinationCountryId) {
		this.destinationCountryId = destinationCountryId;
	}
	/**
	 * @return the destinationRegionId
	 */
	public int getDestinationRegionId() {
		return destinationRegionId;
	}
	/**
	 * @param destinationRegionId the destinationRegionId to set
	 */
	public void setDestinationRegionId(int destinationRegionId) {
		this.destinationRegionId = destinationRegionId;
	}
	/**
	 * @return the primaryCost
	 */
	public float getPrimaryCost() {
		return primaryCost;
	}
	/**
	 * @param primaryCost the primaryCost to set
	 */
	public void setPrimaryCost(float primaryCost) {
		this.primaryCost = primaryCost;
	}
	/**
	 * @return the secondaryCost
	 */
	public float getSecondaryCost() {
		return secondaryCost;
	}
	/**
	 * @param secondaryCost the secondaryCost to set
	 */
	public void setSecondaryCost(float secondaryCost) {
		this.secondaryCost = secondaryCost;
	}
	/**
	*Creates a new ShippingTemplateEntry
	*/
	public static void createShippingTemplateEntry(){EtsyService.postService("/shipping/templates/entries");}
	/**
	*Retrieves a ShippingTemplateEntry by id.
	*/
	public static void getShippingTemplateEntry(int shippingTemplateEntryId){EtsyService.getService("/shipping/templates/entries/"+shippingTemplateEntryId);}
	/**
	*Updates a ShippingTemplateEntry
	*/
	public static void updateShippingTemplateEntry(int shippingTemplateEntryId){EtsyService.putService("/shipping/templates/entries/"+shippingTemplateEntryId);}
	/**
	*Deletes the ShippingTemplateEntry
	*/
	public static void deleteShippingTemplateEntry(int shippingTemplateEntryId){EtsyService.deleteService("/shipping/templates/entries/"+shippingTemplateEntryId);}
}
