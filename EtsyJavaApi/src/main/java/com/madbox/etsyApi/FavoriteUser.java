package com.madbox.etsyApi;

public class FavoriteUser {
 private int userId;
 private int targetUserId;
 private float creationTsz;
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
 * @return the targetUserId
 */
public int getTargetUserId() {
	return targetUserId;
}
/**
 * @param targetUserId the targetUserId to set
 */
public void setTargetUserId(int targetUserId) {
	this.targetUserId = targetUserId;
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
//Retrieves a set of FavoriteUser objects associated to a User.
	public static void findAllUserFavoredBy(String userId) {
		EtsyService.getService("/users/" + userId + "/favored-by");
	}
//Finds all favorite users for a user
	public static void findAllUserFavoriteUsers(String userId) {
		EtsyService.getService("/users/" + userId + "/favorites/users");
	}
//Finds a favorite user for a user
	public static void findUserFavoriteUsers(String userId, int targetUserId) {
		EtsyService.getService("/users/" + userId + "/favorites/users/" + targetUserId);
	}
//Creates a new favorite listing for a user
	public static void createUserFavoriteUsers(String userId, int targetUserId) {
		EtsyService.postService("/users/" + userId + "/favorites/users/" + targetUserId);
	}
	//Delete a favorite listing for a user
	public static void deleteUserFavoriteUsers(String userId, int targetUserId) {
		EtsyService.deleteService("/users/" + userId + "/favorites/users/" + targetUserId);
	}
}
