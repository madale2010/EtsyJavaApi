package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class UserProfile {
	private int userProfileId ;
	private int userId;
	private String loginName;
	private String bio;
	private String gender;
	private String birthMonth;
	private String birthDay;
	private String birthYear;
	private float joinTsz;
	private String materials;
	private int countryId;
	private String region;
	private String city;
	private String location ;
	private int avatarId;
	private float lat;
	private float lon;
	private int transaction_buyCount;
	private int transactionSoldCount;
	private boolean isSeller;
	private String imageUrl75x75;
	private String firstName;
	private String lastName;
	/**
	 * @return the userProfileId
	 */
	public int getUserProfileId() {
		return userProfileId;
	}
	/**
	 * @param userProfileId the userProfileId to set
	 */
	public void setUserProfileId(int userProfileId) {
		this.userProfileId = userProfileId;
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
	 * @return the bio
	 */
	public String getBio() {
		return bio;
	}
	/**
	 * @param bio the bio to set
	 */
	public void setBio(String bio) {
		this.bio = bio;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the birthMonth
	 */
	public String getBirthMonth() {
		return birthMonth;
	}
	/**
	 * @param birthMonth the birthMonth to set
	 */
	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}
	/**
	 * @return the birthDay
	 */
	public String getBirthDay() {
		return birthDay;
	}
	/**
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	/**
	 * @return the birthYear
	 */
	public String getBirthYear() {
		return birthYear;
	}
	/**
	 * @param birthYear the birthYear to set
	 */
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	/**
	 * @return the joinTsz
	 */
	public float getJoinTsz() {
		return joinTsz;
	}
	/**
	 * @param joinTsz the joinTsz to set
	 */
	public void setJoinTsz(float joinTsz) {
		this.joinTsz = joinTsz;
	}
	/**
	 * @return the materials
	 */
	public String getMaterials() {
		return materials;
	}
	/**
	 * @param materials the materials to set
	 */
	public void setMaterials(String materials) {
		this.materials = materials;
	}
	/**
	 * @return the countryId
	 */
	public int getCountryId() {
		return countryId;
	}
	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the avatarId
	 */
	public int getAvatarId() {
		return avatarId;
	}
	/**
	 * @param avatarId the avatarId to set
	 */
	public void setAvatarId(int avatarId) {
		this.avatarId = avatarId;
	}
	/**
	 * @return the lat
	 */
	public float getLat() {
		return lat;
	}
	/**
	 * @param lat the lat to set
	 */
	public void setLat(float lat) {
		this.lat = lat;
	}
	/**
	 * @return the lon
	 */
	public float getLon() {
		return lon;
	}
	/**
	 * @param lon the lon to set
	 */
	public void setLon(float lon) {
		this.lon = lon;
	}
	/**
	 * @return the transaction_buyCount
	 */
	public int getTransaction_buyCount() {
		return transaction_buyCount;
	}
	/**
	 * @param transaction_buyCount the transaction_buyCount to set
	 */
	public void setTransaction_buyCount(int transaction_buyCount) {
		this.transaction_buyCount = transaction_buyCount;
	}
	/**
	 * @return the transactionSoldCount
	 */
	public int getTransactionSoldCount() {
		return transactionSoldCount;
	}
	/**
	 * @param transactionSoldCount the transactionSoldCount to set
	 */
	public void setTransactionSoldCount(int transactionSoldCount) {
		this.transactionSoldCount = transactionSoldCount;
	}
	/**
	 * @return the isSeller
	 */
	public boolean isSeller() {
		return isSeller;
	}
	/**
	 * @param isSeller the isSeller to set
	 */
	public void setSeller(boolean isSeller) {
		this.isSeller = isSeller;
	}
	/**
	 * @return the imageUrl75x75
	 */
	public String getImageUrl75x75() {
		return imageUrl75x75;
	}
	/**
	 * @param imageUrl75x75 the imageUrl75x75 to set
	 */
	public void setImageUrl75x75(String imageUrl75x75) {
		this.imageUrl75x75 = imageUrl75x75;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	*Returns the UserProfile object associated with a User.
	*/
	public static void findUserProfile(String userId){EtsyService.getService("/users/"+userId+"/profile");}
	/**
	*	Updates the UserProfile object associated with a User. 
		Notes:
			Name changes are subject to admin review and therefore unavailable via the API.
			Materials must be provided as a period-separated list of ASCII words.
	*/
	public void updateUserProfile(String userId){EtsyService.putService("/users/"+userId+"/profile", this);}
}
