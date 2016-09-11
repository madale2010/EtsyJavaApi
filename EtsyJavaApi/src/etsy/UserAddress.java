package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class UserAddress {
	private int userAddressId;
	private int userId;
	private String name;
	private String firstLine;
	private String secondLine;
	private String city;
	private String state;
	private String zip;
	private int countryId;
	private String countryName;
	private boolean isDefaultShipping;
	/**
	 * @return the userAddressId
	 */
	public int getUserAddressId() {
		return userAddressId;
	}
	/**
	 * @param userAddressId the userAddressId to set
	 */
	public void setUserAddressId(int userAddressId) {
		this.userAddressId = userAddressId;
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
	 * @return the firstLine
	 */
	public String getFirstLine() {
		return firstLine;
	}
	/**
	 * @param firstLine the firstLine to set
	 */
	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}
	/**
	 * @return the secondLine
	 */
	public String getSecondLine() {
		return secondLine;
	}
	/**
	 * @param secondLine the secondLine to set
	 */
	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
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
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
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
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}
	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	/**
	 * @return the isDefaultShipping
	 */
	public boolean isDefaultShipping() {
		return isDefaultShipping;
	}
	/**
	 * @param isDefaultShipping the isDefaultShipping to set
	 */
	public void setDefaultShipping(boolean isDefaultShipping) {
		this.isDefaultShipping = isDefaultShipping;
	}
	/**
	*Retrieves a set of UserAddress objects associated to a User.
	*/
	public static void getAllUserAddresses(String userId){EtsyService.getService("/users/"+userId+"/addresses");}
	/**
	*	Creates a new UserAddress. Note: state is required when the country is US, Canada, or Australia. See section above about valid codes.
	*/
	public void createUserAddress(String userId){EtsyService.postService("/users/"+userId+"/addresses/", this);}
	/**
	*Retrieves a UserAddress by id.
	*/
	public static void getUserAddress(String userId, int userAddressId){EtsyService.getService("/users/"+userId+"/addresses/"+userAddressId);}
	/**
	*	Deletes the UserAddress with the given id.
	*/
	public static void deleteUserAddress(String userId, int userAddressId){EtsyService.deleteService("/users/"+userId+"/addresses/"+userAddressId);}
}
