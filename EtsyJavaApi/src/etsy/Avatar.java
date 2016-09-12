package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Avatar extends EtsyService {
	@JsonProperty("avatar_id")
	private Integer avatarId;
	@JsonProperty("hex_code")
	private String hexCode;
	@JsonProperty("red")
	private Integer red;
	@JsonProperty("green")
	private Integer green;
	@JsonProperty("blue")
	private Integer blue;
	@JsonProperty("hue")
	private Integer hue;
	@JsonProperty("saturation")
	private Integer saturation;
	@JsonProperty("brightness")
	private Integer brightness;
	@JsonProperty("is_black_and_white")
	private Boolean isBlackAndWhite;
	@JsonProperty("creation_tsz")
	private Float creationTsz;
	@JsonProperty("user_id")
	private Integer userId;
	/**
	 * Upload a new user avatar image
	 */
	@JsonIgnore
	public void uploadAvatar(){
		postService("/users/__SELF__/avatar/", this);
	}
	/**
	 * Get avatar image source
	 */
	@JsonIgnore
	public static String getAvatarImgSrc(){
		return EtsyService.getService("/users/__SELF__/avatar/src");
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
	 * @return the hexCode
	 */
	public String getHexCode() {
		return hexCode;
	}
	/**
	 * @param hexCode the hexCode to set
	 */
	public void setHexCode(String hexCode) {
		this.hexCode = hexCode;
	}
	/**
	 * @return the red
	 */
	public Integer getRed() {
		return red;
	}
	/**
	 * @param red the red to set
	 */
	public void setRed(Integer red) {
		this.red = red;
	}
	/**
	 * @return the green
	 */
	public Integer getGreen() {
		return green;
	}
	/**
	 * @param green the green to set
	 */
	public void setGreen(Integer green) {
		this.green = green;
	}
	/**
	 * @return the blue
	 */
	public Integer getBlue() {
		return blue;
	}
	/**
	 * @param blue the blue to set
	 */
	public void setBlue(Integer blue) {
		this.blue = blue;
	}
	/**
	 * @return the hue
	 */
	public Integer getHue() {
		return hue;
	}
	/**
	 * @param hue the hue to set
	 */
	public void setHue(Integer hue) {
		this.hue = hue;
	}
	/**
	 * @return the saturation
	 */
	public Integer getSaturation() {
		return saturation;
	}
	/**
	 * @param saturation the saturation to set
	 */
	public void setSaturation(Integer saturation) {
		this.saturation = saturation;
	}
	/**
	 * @return the brightness
	 */
	public Integer getBrightness() {
		return brightness;
	}
	/**
	 * @param brightness the brightness to set
	 */
	public void setBrightness(Integer brightness) {
		this.brightness = brightness;
	}
	/**
	 * @return the isBlackAndWhite
	 */
	public Boolean isBlackAndWhite() {
		return isBlackAndWhite;
	}
	/**
	 * @param isBlackAndWhite the isBlackAndWhite to set
	 */
	public void setBlackAndWhite(Boolean isBlackAndWhite) {
		this.isBlackAndWhite = isBlackAndWhite;
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
}
