package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FavoriteListing extends EtsyService {
	@JsonProperty("listing_id")
	private Integer listingId;
	@JsonProperty("user_id")
	private Integer userId;
	@JsonProperty("listing_state")
	private String listingState;
	@JsonProperty("create_date")
	private Integer createDae;

	/**
	 * @return the listingId
	 */
	public Integer getListingId() {
		return listingId;
	}

	/**
	 * @param listingId
	 *            the listingId to set
	 */
	public void setListingId(Integer listingId) {
		this.listingId = listingId;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Integer userId) {
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
	public Integer getCreateDae() {
		return createDae;
	}

	/**
	 * @param createDae
	 *            the createDae to set
	 */
	public void setCreateDae(Integer createDae) {
		this.createDae = createDae;
	}
	@JsonIgnore
	public static void getAllListingFavoredBy(String listingId) {
		EtsyService.getService("/listings/"+listingId+"/favored-by");
	}
	@JsonIgnore
	public static void getAllUserFavoriteListings(String userId) {
		EtsyService.getService("/users"+userId+"/favorites/listings");
	}
	@JsonIgnore
	public static void findUserFavoriteListings(String userId, String listingId) {
		EtsyService.getService("/users"+userId+"/favorites/listings/"+listingId);
	}
	@JsonIgnore
	public void createUserFavoriteListings(String userId, String listingId) {
		EtsyService.postService("/users"+userId+"/favorites/listings/"+listingId, this);
	}
	@JsonIgnore
	public static void deleteUserFavoriteListings(String userId, String listingId) {
		EtsyService.deleteService("/users"+userId+"/favorites/listings/"+listingId);
	}
}
