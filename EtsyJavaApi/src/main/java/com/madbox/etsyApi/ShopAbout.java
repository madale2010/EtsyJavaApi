package com.madbox.etsyApi;

import java.util.ArrayList;

public class ShopAbout {
	public int shopId;
	public String status;
	public String storyHeadline;
	public String storyLeadingParagraph;
	public String story;
	public ArrayList<String> relatedLinks;
	public String url;
	/**
	*Retrieves a ShopAbout object associated to a Shop.
	*/
	public static void getShopAbout(String shopId){EtsyService.getService("/shops/"+shopId+"/about");}
}
