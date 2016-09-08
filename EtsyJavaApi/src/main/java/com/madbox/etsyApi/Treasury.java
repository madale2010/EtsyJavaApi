package com.madbox.etsyApi;

import java.util.ArrayList;

public class Treasury {
	private String id;
	private String title;
	private String description;
	private int homepage;
	private boolean mature;
	private boolean isPrivate;
	private String locale;
	private int comment_count;
	private ArrayList<String> tags;
	private TreasuryCounts counts;
	private float hotness;
	private String hotness_color;
	private int userId;
	private String userName;
	private int userAvatarId;
	private ArrayList<TreasuryListing> listings;
	private float creationTsz;
	private int becamePrivateDate;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the homepage
	 */
	public int getHomepage() {
		return homepage;
	}
	/**
	 * @param homepage the homepage to set
	 */
	public void setHomepage(int homepage) {
		this.homepage = homepage;
	}
	/**
	 * @return the mature
	 */
	public boolean isMature() {
		return mature;
	}
	/**
	 * @param mature the mature to set
	 */
	public void setMature(boolean mature) {
		this.mature = mature;
	}
	/**
	 * @return the isPrivate
	 */
	public boolean isPrivate() {
		return isPrivate;
	}
	/**
	 * @param isPrivate the isPrivate to set
	 */
	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
	/**
	 * @return the locale
	 */
	public String getLocale() {
		return locale;
	}
	/**
	 * @param locale the locale to set
	 */
	public void setLocale(String locale) {
		this.locale = locale;
	}
	/**
	 * @return the comment_count
	 */
	public int getComment_count() {
		return comment_count;
	}
	/**
	 * @param comment_count the comment_count to set
	 */
	public void setComment_count(int comment_count) {
		this.comment_count = comment_count;
	}
	/**
	 * @return the tags
	 */
	public ArrayList<String> getTags() {
		return tags;
	}
	/**
	 * @param tags the tags to set
	 */
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	/**
	 * @return the counts
	 */
	public TreasuryCounts getCounts() {
		return counts;
	}
	/**
	 * @param counts the counts to set
	 */
	public void setCounts(TreasuryCounts counts) {
		this.counts = counts;
	}
	/**
	 * @return the hotness
	 */
	public float getHotness() {
		return hotness;
	}
	/**
	 * @param hotness the hotness to set
	 */
	public void setHotness(float hotness) {
		this.hotness = hotness;
	}
	/**
	 * @return the hotness_color
	 */
	public String getHotness_color() {
		return hotness_color;
	}
	/**
	 * @param hotness_color the hotness_color to set
	 */
	public void setHotness_color(String hotness_color) {
		this.hotness_color = hotness_color;
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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userAvatarId
	 */
	public int getUserAvatarId() {
		return userAvatarId;
	}
	/**
	 * @param userAvatarId the userAvatarId to set
	 */
	public void setUserAvatarId(int userAvatarId) {
		this.userAvatarId = userAvatarId;
	}
	/**
	 * @return the listings
	 */
	public ArrayList<TreasuryListing> getListings() {
		return listings;
	}
	/**
	 * @param listings the listings to set
	 */
	public void setListings(ArrayList<TreasuryListing> listings) {
		this.listings = listings;
	}
	/**
	 * @return the creationTsz
	 */
	public float getCreationTsz() {
		return creationTsz;
	}
	/**
	 * @param creationTsz the creationTsz to set
	 */
	public void setCreationTsz(float creationTsz) {
		this.creationTsz = creationTsz;
	}
	/**
	 * @return the becamePrivateDate
	 */
	public int getBecamePrivateDate() {
		return becamePrivateDate;
	}
	/**
	 * @param becamePrivateDate the becamePrivateDate to set
	 */
	public void setBecamePrivateDate(int becamePrivateDate) {
		this.becamePrivateDate = becamePrivateDate;
	}
	/**
	*Search Treasuries or else List all Treasuries
	*/
	public static void findAllTreasuries(){EtsyService.getService("/treasuries");}
	/**
	*Create a Treasury
	*/
	public static void createTreasury(){EtsyService.postService("/treasuries");}
	/**
	*Get a Treasury
	*/
	public static void getTreasury(String treasuryKey){EtsyService.getService("/treasuries/"+treasuryKey);}
	/**
	*Delete a Treasury
	*/
	public static void deleteTreasury(String treasuryKey){EtsyService.deleteService("/treasuries/"+treasuryKey);}
	/**
	*Get a user's Treasuries. Note: The treasury_r permission scope is required in order to display private Treasuries for a user when the boolean parameter include_private is true.
	*/
	public static void findAllUserTreasuries(String userId){EtsyService.getService("/users/"+userId+"/treasuries");}
}
