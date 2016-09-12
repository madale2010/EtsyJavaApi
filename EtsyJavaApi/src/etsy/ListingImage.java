package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListingImage extends EtsyService {
	@JsonProperty("listing_image_id")
	private Integer listingImageId;
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
	@JsonProperty("listing_id")
	private Integer listingId;
	@JsonProperty("rank")
	private Integer rank;
	@JsonProperty("url_75x75")
	private String url75x75;
	@JsonProperty("url_170x135")
	private String url170x135;
	@JsonProperty("url_570xN")
	private String url570xN;
	@JsonProperty("url_fullxfull")
	private String urlFullxfull;
	@JsonProperty("full_height")
	private Integer fullHeight;
	@JsonProperty("full_width")
	private Integer fullWidth;

	/**
	 * @return the listingImageId
	 */
	public Integer getListingImageId() {
		return listingImageId;
	}

	/**
	 * @param listingImageId
	 *            the listingImageId to set
	 */
	public void setListingImageId(Integer listingImageId) {
		this.listingImageId = listingImageId;
	}

	/**
	 * @return the hexCode
	 */
	public String getHexCode() {
		return hexCode;
	}

	/**
	 * @param hexCode
	 *            the hexCode to set
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
	 * @param red
	 *            the red to set
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
	 * @param green
	 *            the green to set
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
	 * @param blue
	 *            the blue to set
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
	 * @param hue
	 *            the hue to set
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
	 * @param saturation
	 *            the saturation to set
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
	 * @param brightness
	 *            the brightness to set
	 */
	public void setBrightness(Integer brightness) {
		this.brightness = brightness;
	}

	/**
	 * @return the isBlackAndWhite
	 */
	public Boolean getIsBlackAndWhite() {
		return isBlackAndWhite;
	}

	/**
	 * @param isBlackAndWhite
	 *            the isBlackAndWhite to set
	 */
	public void setIsBlackAndWhite(Boolean isBlackAndWhite) {
		this.isBlackAndWhite = isBlackAndWhite;
	}

	/**
	 * @return the creationTsz
	 */
	public Float getCreationTsz() {
		return creationTsz;
	}

	/**
	 * @param creationTsz
	 *            the creationTsz to set
	 */
	public void setCreationTsz(Float creationTsz) {
		this.creationTsz = creationTsz;
	}

	/**
	 * @return the listingId
	 */
	public Integer getListingId() {
		return listingId;
	}

	/**
	 * @param listingId
	 *            the listingId to set
	 */
	public void setListingId(Integer listingId) {
		this.listingId = listingId;
	}

	/**
	 * @return the rank
	 */
	public Integer getRank() {
		return rank;
	}

	/**
	 * @param rank
	 *            the rank to set
	 */
	public void setRank(Integer rank) {
		this.rank = rank;
	}

	/**
	 * @return the url75x75
	 */
	public String getUrl75x75() {
		return url75x75;
	}

	/**
	 * @param url75x75
	 *            the url75x75 to set
	 */
	public void setUrl75x75(String url75x75) {
		this.url75x75 = url75x75;
	}

	/**
	 * @return the url170x135
	 */
	public String getUrl170x135() {
		return url170x135;
	}

	/**
	 * @param url170x135
	 *            the url170x135 to set
	 */
	public void setUrl170x135(String url170x135) {
		this.url170x135 = url170x135;
	}

	/**
	 * @return the url570xN
	 */
	public String getUrl570xN() {
		return url570xN;
	}

	/**
	 * @param url570xN
	 *            the url570xN to set
	 */
	public void setUrl570xN(String url570xN) {
		this.url570xN = url570xN;
	}

	/**
	 * @return the urlFullxfull
	 */
	public String getUrlFullxfull() {
		return urlFullxfull;
	}

	/**
	 * @param urlFullxfull
	 *            the urlFullxfull to set
	 */
	public void setUrlFullxfull(String urlFullxfull) {
		this.urlFullxfull = urlFullxfull;
	}

	/**
	 * @return the fullHeight
	 */
	public Integer getFullHeight() {
		return fullHeight;
	}

	/**
	 * @param fullHeight
	 *            the fullHeight to set
	 */
	public void setFullHeight(Integer fullHeight) {
		this.fullHeight = fullHeight;
	}

	/**
	 * @return the fullWidth
	 */
	public Integer getFullWidth() {
		return fullWidth;
	}

	/**
	 * @param fullWidth
	 *            the fullWidth to set
	 */
	public void setFullWidth(Integer fullWidth) {
		this.fullWidth = fullWidth;
	}

	/**
	 * Finds all ListingFiles on a Listing
	 * 
	 * @return
	 */
	@JsonIgnore
	public ArrayList<ListingImage> getAllListingFiles(Integer listingId) {
		return readResults("/listings/" + listingId + "/files");
	}

	/**
	 * Upload a new listing file, or attach an existing file to this listing.
	 * You must either provide the listing_file_id of an existing listing file,
	 * or the name and file data of a new file that you are uploading. If you
	 * are attaching a file to a listing that is currently not digital, the
	 * listing will be converted to a digital listing. This will cause the
	 * listing to have free shipping and will remove any variations.
	 */
	@JsonIgnore
	public void uploadListingFile(Integer listingId) {
		EtsyService.postService("/listings/" + listingId + "/files", this);
	}

	/**
	 * Finds a ListingFile by ID
	 * 
	 * @return
	 */
	@JsonIgnore
	public ListingImage findListingFile(Integer listingId, int listingFileId) {
		return (ListingImage) readResult("/listings/" + listingId + "/files/" + listingFileId);
	}

	/**
	 * Removes the listing file from this listing. If this is the last file on a
	 * listing, the listing will no longer be considered a digital listing.
	 */
	@JsonIgnore
	public static void deleteListingFile(Integer listingId, int listingFileId) {
		EtsyService.deleteService("/listings/" + listingId + "/files/" + listingFileId);
	}
}
