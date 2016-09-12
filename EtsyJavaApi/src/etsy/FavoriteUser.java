package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FavoriteUser extends EtsyService {
 @JsonProperty("user_id")
	private Integer userId;
 @JsonProperty("target_user_id")
	private Integer targetUserId;
 @JsonProperty("creation_tsz")
	private Float creationTsz;
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
 * @return the targetUserId
 */
public Integer getTargetUserId() {
	return targetUserId;
}
/**
 * @param targetUserId the targetUserId to set
 */
public void setTargetUserId(Integer targetUserId) {
	this.targetUserId = targetUserId;
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
//Retrieves a set of FavoriteUser objects associated to a User.
@JsonIgnore
	public static void getAllUserFavoredBy(String userId) {
		EtsyService.getService("/users/" + userId + "/favored-by");
	}
//Finds all favorite users for a user
	@JsonIgnore
	public static void getAllUserFavoriteUsers(String userId) {
		EtsyService.getService("/users/" + userId + "/favorites/users");
	}
//Finds a favorite user for a user
	@JsonIgnore
	public static void findUserFavoriteUsers(String userId, int targetUserId) {
		EtsyService.getService("/users/" + userId + "/favorites/users/" + targetUserId);
	}
//Creates a new favorite listing for a user
	@JsonIgnore
	public void createUserFavoriteUsers(String userId, int targetUserId) {
		EtsyService.postService("/users/" + userId + "/favorites/users/" + targetUserId, this);
	}
	//Delete a favorite listing for a user
	@JsonIgnore
	public static void deleteUserFavoriteUsers(String userId, int targetUserId) {
		EtsyService.deleteService("/users/" + userId + "/favorites/users/" + targetUserId);
	}
}
