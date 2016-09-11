package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class FavoriteListing {
	private int listingId;
	private int userId;
	private String listingState;
	private int createDae;

	/**
	 * @return the listingId
	 */
	public int getListingId() {
		return listingId;
	}

	/**
	 * @param listingId
	 *            the listingId to set
	 */
	public void setListingId(int listingId) {
		this.listingId = listingId;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the listingState
	 */
	public String getListingState() {
		return listingState;
	}

	/**
	 * @param listingState
	 *            the listingState to set
	 */
	public void setListingState(String listingState) {
		this.listingState = listingState;
	}

	/**
	 * @return the createDae
	 */
	public int getCreateDae() {
		return createDae;
	}

	/**
	 * @param createDae
	 *            the createDae to set
	 */
	public void setCreateDae(int createDae) {
		this.createDae = createDae;
	}

	public static void getAllListingFavoredBy(String listingId) {
		EtsyService.getService("/listings/"+listingId+"/favored-by");
	}

	public static void getAllUserFavoriteListings(String userId) {
		EtsyService.getService("/users"+userId+"/favorites/listings");
	}

	public static void findUserFavoriteListings(String userId, String listingId) {
		EtsyService.getService("/users"+userId+"/favorites/listings/"+listingId);
	}

	public void createUserFavoriteListings(String userId, String listingId) {
		EtsyService.postService("/users"+userId+"/favorites/listings/"+listingId, this);
	}

	public static void deleteUserFavoriteListings(String userId, String listingId) {
		EtsyService.deleteService("/users"+userId+"/favorites/listings/"+listingId);
	}
}
