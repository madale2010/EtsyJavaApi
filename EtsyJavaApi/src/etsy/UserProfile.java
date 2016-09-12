package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserProfile extends EtsyService {
	@JsonProperty("user_profile_id")
	private Integer userProfileId ;
	@JsonProperty("user_id")
	private Integer userId;
	@JsonProperty("login_name")
	private String loginName;
	@JsonProperty("bio")
	private String bio;
	@JsonProperty("gender")
	private String gender;
	@JsonProperty("birth_month")
	private String birthMonth;
	@JsonProperty("birth_day")
	private String birthDay;
	@JsonProperty("birth_year")
	private String birthYear;
	@JsonProperty("join_tsz")
	private Float joinTsz;
	@JsonProperty("materials")
	private String materials;
	@JsonProperty("country_id")
	private Integer countryId;
	@JsonProperty("region")
	private String region;
	@JsonProperty("city")
	private String city;
	@JsonProperty("location")
	private String location;
	@JsonProperty("avatar_id")
	private Integer avatarId;
	@JsonProperty("lat")
	private Float lat;
	@JsonProperty("lon")
	private Float lon;
	@JsonProperty("transaction_buy_count")
	private Integer transaction_buyCount;
	@JsonProperty("transaction_sold_count")
	private Integer transactionSoldCount;
	@JsonProperty("is_seller")
	private Boolean isSeller;
	@JsonProperty("image_url_75x75")
	private String imageUrl75x75;
	@JsonProperty("first_name")
	private String firstName;
	@JsonProperty("last_name")
	private String lastName;
	/**
	 * @return the userProfileId
	 */
	public Integer getUserProfileId() {
		return userProfileId;
	}
	/**
	 * @param userProfileId the userProfileId to set
	 */
	public void setUserProfileId(Integer userProfileId) {
		this.userProfileId = userProfileId;
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
	public Float getJoinTsz() {
		return joinTsz;
	}
	/**
	 * @param joinTsz the joinTsz to set
	 */
	public void setJoinTsz(Float joinTsz) {
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
	public Integer getCountryId() {
		return countryId;
	}
	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(Integer countryId) {
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
	public Integer getAvatarId() {
		return avatarId;
	}
	/**
	 * @param avatarId the avatarId to set
	 */
	public void setAvatarId(Integer avatarId) {
		this.avatarId = avatarId;
	}
	/**
	 * @return the lat
	 */
	public Float getLat() {
		return lat;
	}
	/**
	 * @param lat the lat to set
	 */
	public void setLat(Float lat) {
		this.lat = lat;
	}
	/**
	 * @return the lon
	 */
	public Float getLon() {
		return lon;
	}
	/**
	 * @param lon the lon to set
	 */
	public void setLon(Float lon) {
		this.lon = lon;
	}
	/**
	 * @return the transaction_buyCount
	 */
	public Integer getTransaction_buyCount() {
		return transaction_buyCount;
	}
	/**
	 * @param transaction_buyCount the transaction_buyCount to set
	 */
	public void setTransaction_buyCount(Integer transaction_buyCount) {
		this.transaction_buyCount = transaction_buyCount;
	}
	/**
	 * @return the transactionSoldCount
	 */
	public Integer getTransactionSoldCount() {
		return transactionSoldCount;
	}
	/**
	 * @param transactionSoldCount the transactionSoldCount to set
	 */
	public void setTransactionSoldCount(Integer transactionSoldCount) {
		this.transactionSoldCount = transactionSoldCount;
	}
	/**
	 * @return the isSeller
	 */
	public Boolean isSeller() {
		return isSeller;
	}
	/**
	 * @param isSeller the isSeller to set
	 */
	public void setSeller(Boolean isSeller) {
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
	@JsonIgnore
	public static void findUserProfile(String userId){EtsyService.getService("/users/"+userId+"/profile");}
	/**
	*	Updates the UserProfile object associated with a User. 
		Notes:
			Name changes are subject to admin review and therefore unavailable via the API.
			Materials must be provided as a period-separated list of ASCII words.
	*/
	@JsonIgnore
	public void updateUserProfile(String userId){EtsyService.putService("/users/"+userId+"/profile", this);}
}
