package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User extends EtsyService {
	@JsonProperty("user_id")
	private Integer userId;
	@JsonProperty("login_name")
	private String loginName;
	@JsonProperty("primary_email")
	private String primaryEmail;
	@JsonProperty("creation_tsz")
	private Float creationTsz;
	@JsonProperty("user_pub_key")
	private String userPubKey;
	@JsonProperty("referred_by_user_id")
	private Integer referredByUserId;
	@JsonProperty("feedback_info")
	private FeedbackInfo feedbackInfo;
	@JsonProperty("awaiting_feedback_count")
	private Integer awaitingFeedbackCount;
	/**
	 * The user's numeric ID. This is also valid as the user's shop ID.
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
	 * The user's login name.
	 * @return the loginName
	 */
	public String getLoginName() {
		return loginName;
	}
	/**
	 * @param loginName the loginName to set
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	/**
	 * The user's primary email address.
	 * @return the primaryEmail
	 */
	public String getPrimaryEmail() {
		return primaryEmail;
	}
	/**
	 * @param primaryEmail the primaryEmail to set
	 */
	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}
	/**
	 * The date and time the user was created, in epoch seconds.
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
	 * Public key for user
	 * 
	 * @return the userPubKey
	 */
	public String getUserPubKey() {
		return userPubKey;
	}
	/**
	 * @param userPubKey the userPubKey to set
	 */
	public void setUserPubKey(String userPubKey) {
		this.userPubKey = userPubKey;
	}
	/**
	 * The numeric ID of the user that referred this user.
	 * @return the referredByUserId
	 */
	public Integer getReferredByUserId() {
		return referredByUserId;
	}
	/**
	 * An associative array of feedback totals for the user.
	 * @param referredByUserId the referredByUserId to set
	 */
	public void setReferredByUserId(Integer referredByUserId) {
		this.referredByUserId = referredByUserId;
	}
	/**
	 * The total number of transactions the user has available for a new review.
	 * @return the feedbackInfo
	 */
	public FeedbackInfo getFeedbackInfo() {
		return feedbackInfo;
	}
	/**
	 * @param feedbackInfo the feedbackInfo to set
	 */
	public void setFeedbackInfo(FeedbackInfo feedbackInfo) {
		this.feedbackInfo = feedbackInfo;
	}
	/**
	 * @return the awaitingFeedbackCount
	 */
	public Integer getAwaitingFeedbackCount() {
		return awaitingFeedbackCount;
	}
	/**
	 * @param awaitingFeedbackCount the awaitingFeedbackCount to set
	 */
	public void setAwaitingFeedbackCount(Integer awaitingFeedbackCount) {
		this.awaitingFeedbackCount = awaitingFeedbackCount;
	}
	@JsonIgnore
	public void getUser(String userId){
	EtsyService.getService("users//"+userId);
		
		
	}
	/**
	 * Finds all Users whose name or username match the keywords parameter.
	 * @param keywords
	 * @param limit
	 * @param offset
	 * @param page
	 * @return results
	 */
	@JsonIgnore
	public String getAllUsers(String keywords, int limit, int offset, int page){
	return EtsyService.getService("/users");

	}
	@JsonIgnore
	public void getAllUsersForTeam() {
		EtsyService.getService("users//"+userId);
	
	}
	@JsonIgnore
	public void getCirclesContainingUser() {
	EtsyService.getService("users//"+userId);
	
	}
	@JsonIgnore
	public void getConnectedUser() {
	EtsyService.getService("users//"+userId);
	
	}
	@JsonIgnore
	public void unconnectUsers() {
		EtsyService.getService("users//"+userId);
	
	}
	@JsonIgnore
	public void getConnectedUsers() {
	EtsyService.getService("users//"+userId);

	}
	@JsonIgnore
	public void connectUsers() {
		EtsyService.getService("users//"+userId);
	
	}
}
