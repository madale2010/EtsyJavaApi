package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReceiptShipment extends EtsyService {
	@JsonProperty("carrier_name")
	private String carrierName;
	@JsonProperty("receipt_shipping_id")
	private Integer receiptShippingId;
	@JsonProperty("tracking_code")
	private String trackingCode;
	@JsonProperty("tracking_url")
	private String trackingUrl;
	@JsonProperty("buyer_note")
	private String buyerNote;
	@JsonProperty("notification_date")
	private Integer notificationDate;
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
	public Integer getReceiptShippingId() {
		return receiptShippingId;
	}
	/**
	 * @param receiptShippingId the receiptShippingId to set
	 */
	public void setReceiptShippingId(Integer receiptShippingId) {
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
	public Integer getNotificationDate() {
		return notificationDate;
	}
	/**
	 * @param notificationDate the notificationDate to set
	 */
	public void setNotificationDate(Integer notificationDate) {
		this.notificationDate = notificationDate;
	}
}
