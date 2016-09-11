package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ReceiptShipment {
	private String carrierName;
	private int receiptShippingId;
	private String trackingCode;
	private String trackingUrl;
	private String buyerNote;
	private int notificationDate;
	/**
	 * @return the carrierName
	 */
	public String getCarrierName() {
		return carrierName;
	}
	/**
	 * @param carrierName the carrierName to set
	 */
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	/**
	 * @return the receiptShippingId
	 */
	public int getReceiptShippingId() {
		return receiptShippingId;
	}
	/**
	 * @param receiptShippingId the receiptShippingId to set
	 */
	public void setReceiptShippingId(int receiptShippingId) {
		this.receiptShippingId = receiptShippingId;
	}
	/**
	 * @return the trackingCode
	 */
	public String getTrackingCode() {
		return trackingCode;
	}
	/**
	 * @param trackingCode the trackingCode to set
	 */
	public void setTrackingCode(String trackingCode) {
		this.trackingCode = trackingCode;
	}
	/**
	 * @return the trackingUrl
	 */
	public String getTrackingUrl() {
		return trackingUrl;
	}
	/**
	 * @param trackingUrl the trackingUrl to set
	 */
	public void setTrackingUrl(String trackingUrl) {
		this.trackingUrl = trackingUrl;
	}
	/**
	 * @return the buyerNote
	 */
	public String getBuyerNote() {
		return buyerNote;
	}
	/**
	 * @param buyerNote the buyerNote to set
	 */
	public void setBuyerNote(String buyerNote) {
		this.buyerNote = buyerNote;
	}
	/**
	 * @return the notificationDate
	 */
	public int getNotificationDate() {
		return notificationDate;
	}
	/**
	 * @param notificationDate the notificationDate to set
	 */
	public void setNotificationDate(int notificationDate) {
		this.notificationDate = notificationDate;
	}
}
