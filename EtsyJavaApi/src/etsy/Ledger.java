package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Ledger extends EtsyService {
 @JsonProperty("ledger_id")
	private Integer ledgerId;
 @JsonProperty("shop_id")
	private String shopId;
 @JsonProperty("currency")
	private String currency;
 @JsonProperty("create_date")
	private Integer createDate;
 @JsonProperty("update_date")
	private Integer updateDate;
/**
 * @return the ledgerId
 */
public Integer getLedgerId() {
	return ledgerId;
}
/**
 * @param ledgerId the ledgerId to set
 */
public void setLedgerId(Integer ledgerId) {
	this.ledgerId = ledgerId;
}
/**
 * @return the shopId
 */
public String getShopId() {
	return shopId;
}
/**
 * @param shopId the shopId to set
 */
public void setShopId(String shopId) {
	this.shopId = shopId;
}
/**
 * @return the currency
 */
public String getCurrency() {
	return currency;
}
/**
 * @param currency the currency to set
 */
public void setCurrency(String currency) {
	this.currency = currency;
}
/**
 * @return the createDate
 */
public Integer getCreateDate() {
	return createDate;
}
/**
 * @param createDate the createDate to set
 */
public void setCreateDate(Integer createDate) {
	this.createDate = createDate;
}
/**
 * @return the updateDate
 */
public Integer getUpdateDate() {
	return updateDate;
}
/**
 * @param updateDate the updateDate to set
 */
public void setUpdateDate(Integer updateDate) {
	this.updateDate = updateDate;
}
/**
*Get a Shop Payment Account Ledger
*/
@JsonIgnore
public static void findLedger(String shopId){EtsyService.getService("/shops/"+shopId+"/ledger/");}
}
