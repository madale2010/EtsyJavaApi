package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Ledger {
 private int ledgerId;
 private String shopId;
 private String currency;
 private int createDate;
 private int updateDate;
/**
 * @return the ledgerId
 */
public int getLedgerId() {
	return ledgerId;
}
/**
 * @param ledgerId the ledgerId to set
 */
public void setLedgerId(int ledgerId) {
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
public int getCreateDate() {
	return createDate;
}
/**
 * @param createDate the createDate to set
 */
public void setCreateDate(int createDate) {
	this.createDate = createDate;
}
/**
 * @return the updateDate
 */
public int getUpdateDate() {
	return updateDate;
}
/**
 * @param updateDate the updateDate to set
 */
public void setUpdateDate(int updateDate) {
	this.updateDate = updateDate;
}
/**
*Get a Shop Payment Account Ledger
*/
public static void findLedger(String shopId){EtsyService.getService("/shops/"+shopId+"/ledger/");}
}
