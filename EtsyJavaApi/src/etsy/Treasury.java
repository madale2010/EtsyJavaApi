package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Treasury extends EtsyService {
	@JsonProperty("id")
	private String id;
	@JsonProperty("title")
	private String title;
	@JsonProperty("description")
	private String description;
	@JsonProperty("homepage")
	private Integer homepage;
	@JsonProperty("mature")
	private Boolean mature;
	@JsonProperty("private")
	private Boolean isPrivate;
	@JsonProperty("locale")
	private String locale;
	@JsonProperty("comment_count")
	private Integer comment_count;
	@JsonProperty("tags")
	private ArrayList<String> tags;
	@JsonProperty("counts")
	private TreasuryCounts counts;
	@JsonProperty("hotness")
	private Float hotness;
	@JsonProperty("hotness_color")
	private String hotness_color;
	@JsonProperty("user_id")
	private Integer userId;
	@JsonProperty("user_name")
	private String userName;
	@JsonProperty("user_avatar_id")
	private Integer userAvatarId;
	@JsonProperty("listings")
	private ArrayList<TreasuryListing> listings;
	@JsonProperty("creation_tsz")
	private Float creationTsz;
	@JsonProperty("became_public_date")
	private Integer becamePrivateDate;
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
	public Integer getHomepage() {
		return homepage;
	}
	/**
	 * @param homepage the homepage to set
	 */
	public void setHomepage(Integer homepage) {
		this.homepage = homepage;
	}
	/**
	 * @return the mature
	 */
	public Boolean isMature() {
		return mature;
	}
	/**
	 * @param mature the mature to set
	 */
	public void setMature(Boolean mature) {
		this.mature = mature;
	}
	/**
	 * @return the isPrivate
	 */
	public Boolean isPrivate() {
		return isPrivate;
	}
	/**
	 * @param isPrivate the isPrivate to set
	 */
	public void setPrivate(Boolean isPrivate) {
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
	public Integer getComment_count() {
		return comment_count;
	}
	/**
	 * @param comment_count the comment_count to set
	 */
	public void setComment_count(Integer comment_count) {
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
	public Float getHotness() {
		return hotness;
	}
	/**
	 * @param hotness the hotness to set
	 */
	public void setHotness(Float hotness) {
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
	public Integer getUserAvatarId() {
		return userAvatarId;
	}
	/**
	 * @param userAvatarId the userAvatarId to set
	 */
	public void setUserAvatarId(Integer userAvatarId) {
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
	public Float getCreationTsz() {
		return creationTsz;
	}
	/**
	 * @param creationTsz the creationTsz to set
	 */
	public void setCreationTsz(Float creationTsz) {
		this.creationTsz = creationTsz;
	}
	/**
	 * @return the becamePrivateDate
	 */
	public Integer getBecamePrivateDate() {
		return becamePrivateDate;
	}
	/**
	 * @param becamePrivateDate the becamePrivateDate to set
	 */
	public void setBecamePrivateDate(Integer becamePrivateDate) {
		this.becamePrivateDate = becamePrivateDate;
	}
	/**
	*Search Treasuries or else List all Treasuries
	*/
	@JsonIgnore
	public static void getAllTreasuries(){EtsyService.getService("/treasuries");}
	/**
	*Create a Treasury
	*/
	@JsonIgnore
	public void createTreasury(){EtsyService.postService("/treasuries", this);}
	/**
	*Get a Treasury
	*/
	@JsonIgnore
	public static void getTreasury(String treasuryKey){EtsyService.getService("/treasuries/"+treasuryKey);}
	/**
	*Delete a Treasury
	*/
	@JsonIgnore
	public static void deleteTreasury(String treasuryKey){EtsyService.deleteService("/treasuries/"+treasuryKey);}
	/**
	*Get a user's Treasuries. Note: The treasury_r permission scope is required in order to display private Treasuries for a user when the boolean parameter include_private is true.
	*/
	@JsonIgnore
	public static void getAllUserTreasuries(String userId){EtsyService.getService("/users/"+userId+"/treasuries");}
}
