package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShopTranslation extends EtsyService {
	@JsonProperty("shop_id")
	public Integer shopId;
	@JsonProperty("language")
	public String language;
	@JsonProperty("announcement")
	public String announcement;
	@JsonProperty("policy_welcome")
	public String policyWelcome;
	@JsonProperty("policy_payment")
	public String policyPayment;
	@JsonProperty("policy_shipping")
	public String policyShipping;
	@JsonProperty("policy_refunds")
	public String policyRefunds;
	@JsonProperty("policy_additional")
	public String policyAdditional;
	@JsonProperty("policy_seller_info")
	public String policySellerInfo;
	@JsonProperty("sale_message")
	public String saleMessage;
	@JsonProperty("digital_sale_message")
	public String digitalSaleMessage;
	@JsonProperty("title")
	public String title;
	@JsonProperty("vacation_autoreply")
	public String vacationAutoreply;
	@JsonProperty("vacation_message")
	public String vacationMessage;
	/**
	*Retrieves a ShopTranslation by shop_id and language
	*/
	@JsonIgnore
	public static void getShopTranslation(String shopId, String language){EtsyService.getService("/shops/"+shopId+"/translations/"+language);}
	/**
	*Creates a ShopTranslation by shop_id and language
	*/
	@JsonIgnore
	public void createShopTranslation(String shopId, String language){EtsyService.postService("/shops/"+shopId+"/translations/"+language, this);}
	/**
	*Updates a ShopTranslation by shop_id and language
	*/
	@JsonIgnore
	public void updateShopTranslation(String shopId, String language){EtsyService.putService("/shops/"+shopId+"/translations/"+language, this);}
	/**
	*Deletes a ShopTranslation by shop_id and language
	*/
	@JsonIgnore
	public static void deleteShopTranslation(String shopId, String language){EtsyService.deleteService("/shops/"+shopId+"/translations/"+language);}
}
