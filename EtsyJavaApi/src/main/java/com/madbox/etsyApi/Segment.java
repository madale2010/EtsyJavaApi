package com.madbox.etsyApi;

public class Segment {
	private String name;
	private String path;
	private String shortName;
	private boolean hasChildren;
	private String imageUrl;
	private int shopId;
	private int shopName;
	private int listingId;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}
	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}
	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	/**
	 * @return the hasChildren
	 */
	public boolean isHasChildren() {
		return hasChildren;
	}
	/**
	 * @param hasChildren the hasChildren to set
	 */
	public void setHasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}
	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}
	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	/**
	 * @return the shopId
	 */
	public int getShopId() {
		return shopId;
	}
	/**
	 * @param shopId the shopId to set
	 */
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	/**
	 * @return the shopName
	 */
	public int getShopName() {
		return shopName;
	}
	/**
	 * @param shopName the shopName to set
	 */
	public void setShopName(int shopName) {
		this.shopName = shopName;
	}
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
	*Find all Browse Segments
	*/
	public static void findBrowseSegments(){EtsyService.getService("/segments");}
}
