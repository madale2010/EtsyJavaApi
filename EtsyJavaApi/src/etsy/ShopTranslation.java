package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ShopTranslation {
	public int shopId;
	public String language;
	public String announcement;
	public String policyWelcome;
	public String policyPayment;
	public String policyShipping;
	public String policyRefunds;
	public String policyAdditional;
	public String policySellerInfo;
	public String saleMessage;
	public String digitalSaleMessage;
	public String title;
	public String vacationAutoreply;
	public String vacationMessage;
	/**
	*Retrieves a ShopTranslation by shop_id and language
	*/
	public static void getShopTranslation(String shopId, String language){EtsyService.getService("/shops/"+shopId+"/translations/"+language);}
	/**
	*Creates a ShopTranslation by shop_id and language
	*/
	public void createShopTranslation(String shopId, String language){EtsyService.postService("/shops/"+shopId+"/translations/"+language, this);}
	/**
	*Updates a ShopTranslation by shop_id and language
	*/
	public void updateShopTranslation(String shopId, String language){EtsyService.putService("/shops/"+shopId+"/translations/"+language, this);}
	/**
	*Deletes a ShopTranslation by shop_id and language
	*/
	public static void deleteShopTranslation(String shopId, String language){EtsyService.deleteService("/shops/"+shopId+"/translations/"+language);}
}
