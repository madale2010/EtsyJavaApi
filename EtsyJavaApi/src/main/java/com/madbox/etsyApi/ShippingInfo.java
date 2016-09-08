package com.madbox.etsyApi;

public class ShippingInfo {
	public int shippingInfoId;
	public int originCountryId;
	public int destinationCountryId;
	public String currencyCode;
	public float primaryCost;
	public float secondaryCost;
	public int listingId;
	public int regionId;
	public String originCountryName;
	public String destinationCountryName;
	/**
	*Retrieves a set of ShippingProfileEntries objects associated to a Listing.
	*/
	public static void findAllListingShippingProfileEntries(int listingId){EtsyService.getService("/listings/"+listingId+"/shipping/info");}
	/**
	*Creates a new ShippingInfo.
	*/
	public static void createShippingInfo(int listingId){EtsyService.postService("/listings/"+listingId+"/shipping/info");}
	/**
	*Retrieves a ShippingInfo by id.
	*/
	public static void getShippingInfo(int shippingInfoId){EtsyService.getService("/shipping/info/"+shippingInfoId);}
	/**
	*Updates a ShippingInfo with the given id.
	*/
	public static void updateShippingInfo(int shippingInfoId){EtsyService.putService("/shipping/info/"+shippingInfoId);}
	/**
	*Deletes the ShippingInfo with the given id.
	*/
	public static void deleteShippingInfo(int shippingInfoId){EtsyService.deleteService("/shipping/info/"+shippingInfoId);}
}
