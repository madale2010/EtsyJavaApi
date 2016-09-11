package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class StructuredPolicies {
 public int structured_policiesId;
 public Payment payments;
 public String refunds;
 public ShippingInfo shipping;
 public int createDate;
 public int updateDate;
 public String createDateFormatted;
 public String updateDateFormatted;
 public boolean hasUnstructuredPolicies;
 public String additionalTermsAndConditions;
 public boolean shopInGermany;

}
