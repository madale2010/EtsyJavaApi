package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StructuredPolicies extends EtsyService {
	@JsonProperty("structured_policies_id")
	public Integer structured_policiesId;
	@JsonProperty("payments")
	public Payment payments;
	@JsonProperty("refunds")
	public String refunds;
	@JsonProperty("shipping")
	public ShippingInfo shipping;
	@JsonProperty("create_date")
	public Integer createDate;
	@JsonProperty("update_date")
	public Integer updateDate;
	@JsonProperty("create_date_formatted")
	public String createDateFormatted;
	@JsonProperty("update_date_formatted")
	public String updateDateFormatted;
	@JsonProperty("has_unstructured_policies")
	public Boolean hasUnstructuredPolicies;
	@JsonProperty("additional_terms_and_conditions")
	public String additionalTermsAndConditions;
	@JsonProperty("shop_in_germany")
	public Boolean shopInGermany;
	@JsonProperty("char_limits")
	public Integer charLimits;
	@JsonProperty("privacy")
	public String privacy;

}
