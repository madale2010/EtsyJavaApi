package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Guest {
	private String guestId;
	private String checkoutUrl;
	/**
	*Get a guest by ID.
	*/
	public static void getGuest(String guestId){EtsyService.getService("/guests/"+guestId);}
	/**
	*	A helper method that generates a Guest ID to associate to this anonymous session. This method is not strictly necessary, as any sufficiently random guest ID that is 13 characters in length will suffice and automatically create a guest account on use if it does not yet exist.
	*/
	public static void generateGuest(){EtsyService.getService("/guests/generator");}
	/**
	*Claim this guest to the associated user. Merges the GuestCart's associated with this GuestId into the logged in User's Carts. Returns the number of listings merged in meta['listings_merged'].
	*/
	public void claimGuest(String guestId){EtsyService.postService("/guests/"+guestId+"/claim", this);}
	/**
	*	Merge this guest to a different guest. Merges the GuestCart's associated with this GuestId into the target guest's cart. Returns the number of listings merged in meta['listings_merged'].
	*/
	public void mergeGuest(String guestId){EtsyService.postService("/guests/"+guestId+"/merge", this);}
	public String getGuestId() {
		return guestId;
	}
	public void setGuestId(String guestId) {
		this.guestId = guestId;
	}
	public String getCheckoutUrl() {
		return checkoutUrl;
	}
	public void setCheckoutUrl(String checkoutUrl) {
		this.checkoutUrl = checkoutUrl;
	}
}
