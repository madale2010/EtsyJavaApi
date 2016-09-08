package com.madbox.etsyApi;

public class LedgerEntry {
 private int ledgerEntryId;
 private int ledgerId;
 private int sequence;
 private int creditAmount;
 private int debitAmount;
 private String entryType;
 private int referenceId;
 private int runningBalance;
 private int createDate;
/**
 * @return the ledgerEntryId
 */
public int getLedgerEntryId() {
	return ledgerEntryId;
}
/**
 * @param ledgerEntryId the ledgerEntryId to set
 */
public void setLedgerEntryId(int ledgerEntryId) {
	this.ledgerEntryId = ledgerEntryId;
}
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
 * @return the sequence
 */
public int getSequence() {
	return sequence;
}
/**
 * @param sequence the sequence to set
 */
public void setSequence(int sequence) {
	this.sequence = sequence;
}
/**
 * @return the creditAmount
 */
public int getCreditAmount() {
	return creditAmount;
}
/**
 * @param creditAmount the creditAmount to set
 */
public void setCreditAmount(int creditAmount) {
	this.creditAmount = creditAmount;
}
/**
 * @return the debitAmount
 */
public int getDebitAmount() {
	return debitAmount;
}
/**
 * @param debitAmount the debitAmount to set
 */
public void setDebitAmount(int debitAmount) {
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
public int getReferenceId() {
	return referenceId;
}
/**
 * @param referenceId the referenceId to set
 */
public void setReferenceId(int referenceId) {
	this.referenceId = referenceId;
}
/**
 * @return the runningBalance
 */
public int getRunningBalance() {
	return runningBalance;
}
/**
 * @param runningBalance the runningBalance to set
 */
public void setRunningBalance(int runningBalance) {
	this.runningBalance = runningBalance;
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
*Get a Shop Payment Account Ledger's Entries
*/
public static void findLedgerEntries(String shopId){EtsyService.getService("/shops/"+shopId+"/ledger/entries");}
/**
*Get a Shop Payment Account Ledger Entry
*/
public static void findLedgerEntry(String shopId, int ledgerEntryId){EtsyService.getService("/shops/"+shopId+"/ledger/entries/"+ledgerEntryId);}
}
