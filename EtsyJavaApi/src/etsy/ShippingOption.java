package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ShippingOption {
	public String optionId;
	public String name;
	public int optionType;
	public String cost;
	public String currencyCode;
}
