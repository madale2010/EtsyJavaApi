package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShopAboutImage extends EtsyService {
	@JsonProperty("shop_id")
	private Integer shopId;
	@JsonProperty("image_id")
	private Integer imageId;
	@JsonProperty("caption")
	private String caption;
	@JsonProperty("rank")
	private Integer rank;
	@JsonProperty("url_178x178")
	private String url178x178;
	@JsonProperty("url_545xN")
	private String url545xN;
	@JsonProperty("url_760xN")
	private String url760xN;
	@JsonProperty("url_fullxfull")
	private String urlFullxfull;
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
	 * @return the imageId
	 */
	public Integer getImageId() {
		return imageId;
	}
	/**
	 * @param imageId the imageId to set
	 */
	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}
	/**
	 * @return the caption
	 */
	public String getCaption() {
		return caption;
	}
	/**
	 * @param caption the caption to set
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}
	/**
	 * @return the rank
	 */
	public Integer getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	/**
	 * @return the url178x178
	 */
	public String getUrl178x178() {
		return url178x178;
	}
	/**
	 * @param url178x178 the url178x178 to set
	 */
	public void setUrl178x178(String url178x178) {
		this.url178x178 = url178x178;
	}
	/**
	 * @return the url545xN
	 */
	public String getUrl545xN() {
		return url545xN;
	}
	/**
	 * @param url545xN the url545xN to set
	 */
	public void setUrl545xN(String url545xN) {
		this.url545xN = url545xN;
	}
	/**
	 * @return the url760xN
	 */
	public String getUrl760xN() {
		return url760xN;
	}
	/**
	 * @param url760xN the url760xN to set
	 */
	public void setUrl760xN(String url760xN) {
		this.url760xN = url760xN;
	}
	/**
	 * @return the urlFullxfull
	 */
	public String getUrlFullxfull() {
		return urlFullxfull;
	}
	/**
	 * @param urlFullxfull the urlFullxfull to set
	 */
	public void setUrlFullxfull(String urlFullxfull) {
		this.urlFullxfull = urlFullxfull;
	}
}
