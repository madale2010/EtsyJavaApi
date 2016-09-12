package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShopAbout extends EtsyService {
	@JsonProperty("shop_id")
	private Integer shopId;
	@JsonProperty("status")
	private String status;
	@JsonProperty("story_headline")
	private String storyHeadline;
	@JsonProperty("story_leading_paragraph")
	private String storyLeadingParagraph;
	@JsonProperty("story")
	private String story;
	@JsonProperty("related_links")
	private ArrayList<String> relatedLinks;
	@JsonProperty("url")
	private String url;
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the storyHeadline
	 */
	public String getStoryHeadline() {
		return storyHeadline;
	}
	/**
	 * @param storyHeadline the storyHeadline to set
	 */
	public void setStoryHeadline(String storyHeadline) {
		this.storyHeadline = storyHeadline;
	}
	/**
	 * @return the storyLeadingParagraph
	 */
	public String getStoryLeadingParagraph() {
		return storyLeadingParagraph;
	}
	/**
	 * @param storyLeadingParagraph the storyLeadingParagraph to set
	 */
	public void setStoryLeadingParagraph(String storyLeadingParagraph) {
		this.storyLeadingParagraph = storyLeadingParagraph;
	}
	/**
	 * @return the story
	 */
	public String getStory() {
		return story;
	}
	/**
	 * @param story the story to set
	 */
	public void setStory(String story) {
		this.story = story;
	}
	/**
	 * @return the relatedLinks
	 */
	public ArrayList<String> getRelatedLinks() {
		return relatedLinks;
	}
	/**
	 * @param relatedLinks the relatedLinks to set
	 */
	public void setRelatedLinks(ArrayList<String> relatedLinks) {
		this.relatedLinks = relatedLinks;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	*Retrieves a ShopAbout object associated to a Shop.
	*/
	@JsonIgnore
	public static void getShopAbout(String shopId){EtsyService.getService("/shops/"+shopId+"/about");}
}
