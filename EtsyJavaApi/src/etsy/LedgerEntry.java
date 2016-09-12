package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LedgerEntry extends EtsyService {
 @JsonProperty("ledger_entry_id")
	private Integer ledgerEntryId;
 @JsonProperty("ledger_id")
	private Integer ledgerId;
 @JsonProperty("sequence")
	private Integer sequence;
 @JsonProperty("credit_amount")
	private Integer creditAmount;
 @JsonProperty("debit_amount")
	private Integer debitAmount;
 @JsonProperty("entry_type")
	private String entryType;
 @JsonProperty("reference_id")
	private Integer referenceId;
 @JsonProperty("running_balance")
	private Integer runningBalance;
 @JsonProperty("create_date")
	private Integer createDate;
/**
 * @return the ledgerEntryId
 */
public Integer getLedgerEntryId() {
	return ledgerEntryId;
}
/**
 * @param ledgerEntryId the ledgerEntryId to set
 */
public void setLedgerEntryId(Integer ledgerEntryId) {
	this.ledgerEntryId = ledgerEntryId;
}
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
 * @return the sequence
 */
public Integer getSequence() {
	return sequence;
}
/**
 * @param sequence the sequence to set
 */
public void setSequence(Integer sequence) {
	this.sequence = sequence;
}
/**
 * @return the creditAmount
 */
public Integer getCreditAmount() {
	return creditAmount;
}
/**
 * @param creditAmount the creditAmount to set
 */
public void setCreditAmount(Integer creditAmount) {
	this.creditAmount = creditAmount;
}
/**
 * @return the debitAmount
 */
public Integer getDebitAmount() {
	return debitAmount;
}
/**
 * @param debitAmount the debitAmount to set
 */
public void setDebitAmount(Integer debitAmount) {
	this.debitAmount = debitAmount;
}
/**
 * @return the entryType
 */
public String getEntryType() {
	return entryType;
}
/**
 * @param entryType the entryType to set
 */
public void setEntryType(String entryType) {
	this.entryType = entryType;
}
/**
 * @return the referenceId
 */
public Integer getReferenceId() {
	return referenceId;
}
/**
 * @param referenceId the referenceId to set
 */
public void setReferenceId(Integer referenceId) {
	this.referenceId = referenceId;
}
/**
 * @return the runningBalance
 */
public Integer getRunningBalance() {
	return runningBalance;
}
/**
 * @param runningBalance the runningBalance to set
 */
public void setRunningBalance(Integer runningBalance) {
	this.runningBalance = runningBalance;
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
*Get a Shop Payment Account Ledger's Entries
*/
@JsonIgnore
public static void findLedgerEntries(String shopId){EtsyService.getService("/shops/"+shopId+"/ledger/entries");}
/**
*Get a Shop Payment Account Ledger Entry
*/
@JsonIgnore
public static void findLedgerEntry(String shopId, int ledgerEntryId){EtsyService.getService("/shops/"+shopId+"/ledger/entries/"+ledgerEntryId);}
}
