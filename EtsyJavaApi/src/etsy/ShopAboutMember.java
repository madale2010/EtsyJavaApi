package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ShopAboutMember {
	public int shopAboutMemberId;
	public int shopId;
	public String name;
	public String role;
	public String bio;
	public int rank;
	public boolean isOwner;
	public String url90x90;
	public String url190x190;
	public boolean hasStaleTranslations;
}
