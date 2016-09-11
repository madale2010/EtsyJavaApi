package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ShopAboutImage {
	public int shopId;
	public int imageId;
	public String caption;
	public int rank;
	public String url178x178;
	public String url545xN;
	public String url760xN;
	public String urlFullxfull;
}
