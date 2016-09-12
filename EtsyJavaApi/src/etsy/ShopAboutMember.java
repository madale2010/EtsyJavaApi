package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShopAboutMember extends EtsyService {
	@JsonProperty("shop_about_member_id")
	public Integer shopAboutMemberId;
	@JsonProperty("shop_id")
	public Integer shopId;
	@JsonProperty("name")
	public String name;
	@JsonProperty("role")
	public String role;
	@JsonProperty("bio")
	public String bio;
	@JsonProperty("rank")
	public Integer rank;
	@JsonProperty("is_owner")
	public Boolean isOwner;
	@JsonProperty("url_90x90")
	public String url90x90;
	@JsonProperty("url_190x190")
	public String url190x190;
	@JsonProperty("has_stale_translations")
	public Boolean hasStaleTranslations;
	
}
