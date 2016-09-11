package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ShippingTemplate extends EtsyService {
	private int shippingTemplateId;
	private String title;
	private int userId;
	private int minProcessingDays;
	private String maxProcessingDays;
	private String processingDaysDisplayLabel;
	private int originCountryId;
	/**
	 * The numeric ID of this shipping template.
	 * @return the shippingTemplateId
	 */
	public int getShippingTemplateId() {
		return shippingTemplateId;
	}
	/**
	 * The numeric ID of this shipping template.
	 * @param shippingTemplateId the shippingTemplateId to set
	 */
	public void setShippingTemplateId(int shippingTemplateId) {
		this.shippingTemplateId = shippingTemplateId;
	}
	/**
	 * The name of this shipping template.
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * The name of this shipping template.
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * The numeric ID of the user who owns this shipping template.
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * The numeric ID of the user who owns this shipping template.
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * The minimum number of days for processing the listing.
	 * @return the minProcessingDays
	 */
	public int getMinProcessingDays() {
		return minProcessingDays;
	}
	/**
	 * The minimum number of days for processing the listing.
	 * @param minProcessingDays the minProcessingDays to set
	 */
	public void setMinProcessingDays(int minProcessingDays) {
		this.minProcessingDays = minProcessingDays;
	}
	/**
	 * The maximum number of days for processing the listing.
	 * @return the maxProcessingDays
	 */
	public String getMaxProcessingDays() {
		return maxProcessingDays;
	}
	/**
	 * The maximum number of days for processing the listing.
	 * @param maxProcessingDays the maxProcessingDays to set
	 */
	public void setMaxProcessingDays(String maxProcessingDays) {
		this.maxProcessingDays = maxProcessingDays;
	}
	/**
	 * Translated display label for processing days.
	 * @return the processingDaysDisplayLabel
	 */
	public String getProcessingDaysDisplayLabel() {
		return processingDaysDisplayLabel;
	}
	/**
	 * Translated display label for processing days.
	 * @param processingDaysDisplayLabel the processingDaysDisplayLabel to set
	 */
	public void setProcessingDaysDisplayLabel(String processingDaysDisplayLabel) {
		this.processingDaysDisplayLabel = processingDaysDisplayLabel;
	}
	/**
	 * The numeric ID of the country from which the listing ships.
	 * @return the originCountryId
	 */
	public int getOriginCountryId() {
		return originCountryId;
	}
	/**
	 * The numeric ID of the country from which the listing ships.
	 * @param originCountryId the originCountryId to set
	 */
	public void setOriginCountryId(int originCountryId) {
		this.originCountryId = originCountryId;
	}
	/**
	 * Creates a new ShippingTemplate			
	 */
	public void createShippingTemplate() {}	
	/**
	 * Retrieves a ShippingTemplate by id.			
	 */
	public void getShippingTemplate() {}
	/**
	 * Updates a ShippingTemplate			
	 */
	public void updateShippingTemplate() {}	
	/**
	 * Deletes the ShippingTemplate with the given id.			
	 */
	public void deleteShippingTemplate() {}	
	/**
	 * Retrieves a set of ShippingTemplateEntry objects associated to a ShippingTemplate.			
	 */
	public void getAllShippingTemplateEntries() {}	
	/**
	 * Retrieves a set of ShippingTemplate objects associated to a User.
	 */
	public static ArrayList<ShippingTemplate> getAllUserShippingProfiles() {
		String results = EtsyService.getService("/users/__SELF__/shipping/templates");
		return readResults(results);
		
	}		
}
