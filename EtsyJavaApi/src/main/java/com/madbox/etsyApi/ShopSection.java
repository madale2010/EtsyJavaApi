package com.madbox.etsyApi;

public class ShopSection {
	private int shopSectionId;
	private String title;
	private int rank;
	private int userId;
	private int activeListingCount;
	/**
	 * @return the shopSectionId
	 */
	public int getShopSectionId() {
		return shopSectionId;
	}
	/**
	 * @param shopSectionId the shopSectionId to set
	 */
	public void setShopSectionId(int shopSectionId) {
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
	public int getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the activeListingCount
	 */
	public int getActiveListingCount() {
		return activeListingCount;
	}
	/**
	 * @param activeListingCount the activeListingCount to set
	 */
	public void setActiveListingCount(int activeListingCount) {
		this.activeListingCount = activeListingCount;
	}

	/**
	*Retrieves a set of ShopSection objects associated to a Shop.
	*/
	public static void findAllShopSections(String shopId){EtsyService.getService("/shops/"+shopId+"/sections");}
	/**
	*Creates a new ShopSection.
	*/
	public static void createShopSection(String shopId){EtsyService.postService("/shops/"+shopId+"/sections");}
	/**
	* Retrieves a ShopSection by id and shop_id
	*/
	public static void getShopSection(String shopId, int shopSectionId){EtsyService.getService("/shops/"+shopId+"/sections/"+shopSectionId);}
	/**
	*Updates a ShopSection with the given id.
	*/
	public static void updateShopSection(String shopId, int shopSectionId){EtsyService.putService("/shops/"+shopId+"/sections/"+shopSectionId);}
	/**
	*Deletes the ShopSection with the given id.
	*/
	public static void deleteShopSection(String shopId, int shopSectionId){EtsyService.deleteService("/shops/"+shopId+"/sections/"+shopSectionId);}
}
