package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SegmentPoster extends EtsyService {
	@JsonProperty("name")
	private String name;
	@JsonProperty("path")
	private String path;
	@JsonProperty("image_url")
	private String imageUrl;
	@JsonProperty("shop_id")
	private Integer shopId;
	@JsonProperty("shop_name")
	private Integer shopName;
	@JsonProperty("weight")
	private Integer weight;
	@JsonProperty("listing_id")
	private Integer listingId;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path
	 *            the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * @param imageUrl
	 *            the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * @return the shopId
	 */
	public Integer getShopId() {
		return shopId;
	}

	/**
	 * @param shopId
	 *            the shopId to set
	 */
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	/**
	 * @return the shopName
	 */
	public Integer getShopName() {
		return shopName;
	}

	/**
	 * @param shopName
	 *            the shopName to set
	 */
	public void setShopName(Integer shopName) {
		this.shopName = shopName;
	}

	/**
	 * @return the weight
	 */
	public Integer getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
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
	 * Find Browse SegmentPosters by Segment slug
	 */
	@JsonIgnore
	public static void findBrowseSegmentPosters() {
		EtsyService.getService("/segments/posters");
	}
}
