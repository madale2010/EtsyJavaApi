package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Segment extends EtsyService {
	@JsonProperty("name")
	private String name;
	@JsonProperty("path")
	private String path;
	@JsonProperty("short_name")
	private String shortName;
	@JsonProperty("has_children")
	private Boolean hasChildren;
	@JsonProperty("image_url")
	private String imageUrl;
	@JsonProperty("shop_id")
	private Integer shopId;
	@JsonProperty("shop_name")
	private Integer shopName;
	@JsonProperty("listing_id")
	private Integer listingId;
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
	 * @return the path
	 */
	public String getPath() {
		return path;
	}
	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}
	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	/**
	 * @return the hasChildren
	 */
	public Boolean isHasChildren() {
		return hasChildren;
	}
	/**
	 * @param hasChildren the hasChildren to set
	 */
	public void setHasChildren(Boolean hasChildren) {
		this.hasChildren = hasChildren;
	}
	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}
	/**
	 * @param imageUrl the imageUrl to set
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
	 * @param shopId the shopId to set
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
	 * @param shopName the shopName to set
	 */
	public void setShopName(Integer shopName) {
		this.shopName = shopName;
	}
	/**
	 * @return the listingId
	 */
	public Integer getListingId() {
		return listingId;
	}
	/**
	 * @param listingId the listingId to set
	 */
	public void setListingId(Integer listingId) {
		this.listingId = listingId;
	}
	/**
	*Find all Browse Segments
	*/
	@JsonIgnore
	public static void findBrowseSegments(){EtsyService.getService("/segments");}
}
