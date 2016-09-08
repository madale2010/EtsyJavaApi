package com.madbox.etsyApi;

import java.util.ArrayList;

public class VariationsProperty {
	private int propertyId;
	private String formattedName;
	private ArrayList<VariationsOption> options;
	/**
	 * @return the propertyId
	 */
	public int getPropertyId() {
		return propertyId;
	}
	/**
	 * @param propertyId the propertyId to set
	 */
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	/**
	 * @return the formattedName
	 */
	public String getFormattedName() {
		return formattedName;
	}
	/**
	 * @param formattedName the formattedName to set
	 */
	public void setFormattedName(String formattedName) {
		this.formattedName = formattedName;
	}
	/**
	 * @return the options
	 */
	public ArrayList<VariationsOption> getOptions() {
		return options;
	}
	/**
	 * @param options the options to set
	 */
	public void setOptions(ArrayList<VariationsOption> options) {
		this.options = options;
	}
	/**
	*Get the listing variations available for a listing.
	*/
	public static void getListingVariations(int listingId){EtsyService.getService("/listings/"+listingId+"/variations");}
	/**
	*	Update all of the listing variations available for a listing; optionally set custom property names and property qualifiers. Expects a JSON array with a collection of objects of the form: [{"property_id":200, "value":"Black"}, {"property_id":200, "value":"White"}]
	*/
	public static void createListingVariations(int listingId){EtsyService.postService("/listings/"+listingId+"/variations");}
	/**
	*	Update all of the listing variations available for a listing. Expects a JSON array with a collection of objects of the form: [{"property_id":200, "value":"Black"}, {"property_id":200, "value":"White"}
	*/
	public static void updateListingVariations(int listingId){EtsyService.putService("/listings/"+listingId+"/variations");}
	/**
	*Add a new listing variation for a listing.
	*/
	public static void createListingVariation(int listingId, int propertyId){EtsyService.postService("/listings/"+listingId+"/variations/"+propertyId);}
	/**
	*Update a listing variation for a listing.
	*/
	public static void updateListingVariation(int listingId, int propertyId){EtsyService.putService("/listings/"+listingId+"/variations/"+propertyId);}
	/**
	*Remove a listing variation for a listing.
	*/
	public static void deleteListingVariation(int listingId, int propertyId){EtsyService.deleteService("/listings/"+listingId+"/variations/"+propertyId);}
	
}
