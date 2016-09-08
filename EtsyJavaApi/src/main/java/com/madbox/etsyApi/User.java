package com.madbox.etsyApi;

public class User extends EtsyService {
	private int userId;
	private String loginName;
	private String primaryEmail;
	private float creationTsz;
	private String userPubKey;
	private int referredByUserId;
	private FeedbackInfo feedbackInfo;
	private int awaitingFeedbackCount;
	/**
	 * The user's numeric ID. This is also valid as the user's shop ID.
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
	public int getReferredByUserId() {
		return referredByUserId;
	}
	/**
	 * An associative array of feedback totals for the user.
	 * @param referredByUserId the referredByUserId to set
	 */
	public void setReferredByUserId(int referredByUserId) {
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
	public int getAwaitingFeedbackCount() {
		return awaitingFeedbackCount;
	}
	/**
	 * @param awaitingFeedbackCount the awaitingFeedbackCount to set
	 */
	public void setAwaitingFeedbackCount(int awaitingFeedbackCount) {
		this.awaitingFeedbackCount = awaitingFeedbackCount;
	}
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
	public String findAllUsers(String keywords, int limit, int offset, int page){
	return EtsyService.getService("/users");

	}
	public void findAllUsersForTeam() {
		EtsyService.getService("users//"+userId);
	
	}
	public void getCirclesContainingUser() {
	EtsyService.getService("users//"+userId);
	
	}
	public void getConnectedUser() {
	EtsyService.getService("users//"+userId);
	
	}
	public void unconnectUsers() {
		EtsyService.getService("users//"+userId);
	
	}
	public void getConnectedUsers() {
	EtsyService.getService("users//"+userId);

	}
	public void connectUsers() {
		EtsyService.getService("users//"+userId);
	
	}
}
