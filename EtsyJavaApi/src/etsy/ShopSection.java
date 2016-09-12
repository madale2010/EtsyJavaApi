package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShopSection extends EtsyService {
	@JsonProperty("shop_section_id")
	private Integer shopSectionId;
	@JsonProperty("title")
	private String title;
	@JsonProperty("rank")
	private Integer rank;
	@JsonProperty("user_id")
	private Integer userId;
	@JsonProperty("active_listing_count")
	private Integer activeListingCount;
	/**
	 * @return the shopSectionId
	 */
	public Integer getShopSectionId() {
		return shopSectionId;
	}
	/**
	 * @param shopSectionId the shopSectionId to set
	 */
	public void setShopSectionId(Integer shopSectionId) {
		this.shopSectionId = shopSectionId;
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
	 * @return the rank
	 */
	public Integer getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the activeListingCount
	 */
	public Integer getActiveListingCount() {
		return activeListingCount;
	}
	/**
	 * @param activeListingCount the activeListingCount to set
	 */
	public void setActiveListingCount(Integer activeListingCount) {
		this.activeListingCount = activeListingCount;
	}

	/**
	*Retrieves a set of ShopSection objects associated to a Shop.
	*/
	@JsonIgnore
	public static void getAllShopSections(String shopId){EtsyService.getService("/shops/"+shopId+"/sections");}
	/**
	*Creates a new ShopSection.
	*/
	@JsonIgnore
	public void createShopSection(String shopId){EtsyService.postService("/shops/"+shopId+"/sections", this);}
	/**
	* Retrieves a ShopSection by id and shop_id
	*/
	@JsonIgnore
	public static void getShopSection(String shopId, int shopSectionId){EtsyService.getService("/shops/"+shopId+"/sections/"+shopSectionId);}
	/**
	*Updates a ShopSection with the given id.
	*/
	@JsonIgnore
	public void updateShopSection(String shopId, int shopSectionId){EtsyService.putService("/shops/"+shopId+"/sections/"+shopSectionId, this);}
	/**
	*Deletes the ShopSection with the given id.
	*/
	@JsonIgnore
	public static void deleteShopSection(String shopId, int shopSectionId){EtsyService.deleteService("/shops/"+shopId+"/sections/"+shopSectionId);}
}
