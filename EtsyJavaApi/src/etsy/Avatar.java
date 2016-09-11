package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Avatar extends EtsyService {
	private int avatarId;
	private String hexCode;
	private int red;
	private int green;
	private int blue;
	private int hue;
	private int saturation;
	private int brightness;
	private boolean isBlackAndWhite;
	private float creationTsz;
	private int userId;
	/**
	 * Upload a new user avatar image
	 */
	public void uploadAvatar(){
		EtsyService.postService("/users/__SELF__/avatar/", this);
	}
	/**
	 * Get avatar image source
	 */
	public static String getAvatarImgSrc(){
		return EtsyService.getService("/users/__SELF__/avatar/src");
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
	public int getRed() {
		return red;
	}
	/**
	 * @param red the red to set
	 */
	public void setRed(int red) {
		this.red = red;
	}
	/**
	 * @return the green
	 */
	public int getGreen() {
		return green;
	}
	/**
	 * @param green the green to set
	 */
	public void setGreen(int green) {
		this.green = green;
	}
	/**
	 * @return the blue
	 */
	public int getBlue() {
		return blue;
	}
	/**
	 * @param blue the blue to set
	 */
	public void setBlue(int blue) {
		this.blue = blue;
	}
	/**
	 * @return the hue
	 */
	public int getHue() {
		return hue;
	}
	/**
	 * @param hue the hue to set
	 */
	public void setHue(int hue) {
		this.hue = hue;
	}
	/**
	 * @return the saturation
	 */
	public int getSaturation() {
		return saturation;
	}
	/**
	 * @param saturation the saturation to set
	 */
	public void setSaturation(int saturation) {
		this.saturation = saturation;
	}
	/**
	 * @return the brightness
	 */
	public int getBrightness() {
		return brightness;
	}
	/**
	 * @param brightness the brightness to set
	 */
	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}
	/**
	 * @return the isBlackAndWhite
	 */
	public boolean isBlackAndWhite() {
		return isBlackAndWhite;
	}
	/**
	 * @param isBlackAndWhite the isBlackAndWhite to set
	 */
	public void setBlackAndWhite(boolean isBlackAndWhite) {
		this.isBlackAndWhite = isBlackAndWhite;
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
}
