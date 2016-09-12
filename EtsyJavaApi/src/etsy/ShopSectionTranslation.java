package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShopSectionTranslation extends EtsyService {
	@JsonProperty("shop_section_id")
	private Integer shopSectionId;
	@JsonProperty("language")
	private String language;
	@JsonProperty("title")
	private String title;
	/**
	 * @return the shopSectionId
	 */
	public Integer getShopSectionId() {
		return shopSectionId;
	}
	/**
	 * @param shopSectionId the shopSectionId to set
	 */
	public void setShopSectionId(Integer shopSectionId) {
		this.shopSectionId = shopSectionId;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	*Retrieves a ShopSectionTranslation by shop_id, shop_section_id and language
	*/
	@JsonIgnore
	public static void getShopSectionTranslation(String shopId, int shopSectionId, String language){EtsyService.getService("/shops/"+shopId+"/sections/"+shopSectionId+"/translations/"+language);}
	/**
	*Creates a ShopSectionTranslation by shop_id, shop_section_id and language
	*/
	@JsonIgnore
	public void createShopSectionTranslation(String shopId, int shopSectionId, String language){EtsyService.postService("/shops/"+shopId+"/sections/"+shopSectionId+"/translations/"+language, this);}
	/**
	*Updates a ShopSectionTranslation by shop_id, shop_section_id and language
	*/
	@JsonIgnore
	public void updateShopSectionTranslation(String shopId, int shopSectionId, String language){EtsyService.putService("/shops/"+shopId+"/sections/"+shopSectionId+"/translations/"+language, this);}
	/**
	*Deletes a ShopSectionTranslation by shop_id, shop_section_id and language
	*/
	@JsonIgnore
	public static void deleteShopSectionTranslation(String shopId, int shopSectionId, String language){EtsyService.deleteService("/shops/"+shopId+"/sections/"+shopSectionId+"/translations/"+language);}
}
