package com.madbox.etsyApi;

public class ShopSectionTranslation {
	private int shopSectionId;
	private String language;
	private String title;
	/**
	 * @return the shopSectionId
	 */
	public int getShopSectionId() {
		return shopSectionId;
	}
	/**
	 * @param shopSectionId the shopSectionId to set
	 */
	public void setShopSectionId(int shopSectionId) {
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
	public static void getShopSectionTranslation(String shopId, int shopSectionId, String language){EtsyService.getService("/shops/"+shopId+"/sections/"+shopSectionId+"/translations/"+language);}
	/**
	*Creates a ShopSectionTranslation by shop_id, shop_section_id and language
	*/
	public static void createShopSectionTranslation(String shopId, int shopSectionId, String language){EtsyService.postService("/shops/"+shopId+"/sections/"+shopSectionId+"/translations/"+language);}
	/**
	*Updates a ShopSectionTranslation by shop_id, shop_section_id and language
	*/
	public static void updateShopSectionTranslation(String shopId, int shopSectionId, String language){EtsyService.putService("/shops/"+shopId+"/sections/"+shopSectionId+"/translations/"+language);}
	/**
	*Deletes a ShopSectionTranslation by shop_id, shop_section_id and language
	*/
	public static void deleteShopSectionTranslation(String shopId, int shopSectionId, String language){EtsyService.deleteService("/shops/"+shopId+"/sections/"+shopSectionId+"/translations/"+language);}
}
