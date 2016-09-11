package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ShippingUpgrade {
	public int shippingProfileId;
	public int valueId;
	public String value;
	public float price;
	public float secondaryPrice;
	public String currencyCode;
	public int type;
	public int order;
	public int language;

	/**
	 * Get the shipping upgrades available for a listing.
	 */
	public static void getListingShippingUpgrades(int listingId) {
		EtsyService.getService("/listings/" + listingId + "/shipping/upgrades");
	}

	/**
	 * Creates a new ShippingUpgrade for the listing. Will unlink the listing if
	 * linked to a ShippingTemplate.
	 */
	public void createListingShippingUpgrade(int listingId) {
		EtsyService.postService("/listings/" + listingId + "/shipping/upgrades", this);
	}

	/**
	 * Updates a ShippingUpgrade on a listing. Will unlink the listing if linked
	 * to a ShippingTemplate.
	 */
	public void updateListingShippingUpgrade(int listingId) {
		EtsyService.putService("/listings/" + listingId + "/shipping/upgrades", this);
	}

	/**
	 * Deletes the ShippingUpgrade from the listing. Will unlink the listing if
	 * linked to a ShippingTemplate.
	 */
	public static void deleteListingShippingUpgrade(int listingId) {
		EtsyService.deleteService("/listings/" + listingId + "/shipping/upgrades");
	}

	/**
	 * Retrieves a list of shipping upgrades for the parent ShippingTemplate
	 */
	public static void getAllShippingTemplateUpgrades(int shippingTemplateId) {
		EtsyService.getService("/shipping/templates/" + shippingTemplateId + "/upgrades");
	}

	/**
	 * Creates a new ShippingUpgrade for the parent ShippingTemplate. Updates
	 * any listings linked to the ShippingTemplate.
	 */
	public void createShippingTemplateUpgrade(int shippingTemplateId) {
		EtsyService.postService("/shipping/templates/" + shippingTemplateId + "/upgrades", this);
	}

	/**
	 * Updates a ShippingUpgrade of the parent ShippingTemplate. Updates any
	 * listings linked to the ShippingTemplate.
	 */
	public void updateShippingTemplateUpgrade(int shippingTemplateId) {
		EtsyService.putService("/shipping/templates/" + shippingTemplateId + "/upgrades", this);
	}

	/**
	 * Deletes the ShippingUpgrade from the parent ShippingTemplate. Updates any
	 * listings linked to the ShippingTemplate.
	 */
	public static void deleteShippingTemplateUpgrade(int shippingTemplateId) {
		EtsyService.deleteService("/shipping/templates/" + shippingTemplateId + "/upgrades");
	}
}
