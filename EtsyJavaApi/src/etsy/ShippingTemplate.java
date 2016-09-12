package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShippingTemplate extends EtsyService {
	@JsonProperty("shipping_template_id")
	
	private Integer shippingTemplateId;
	
	
	private String title;
	@JsonProperty("user_id")
	
	private Integer userId;
	@JsonProperty("min_processing_days")
	
	private Integer minProcessingDays;
	@JsonProperty("max_processing_days")
	
	private String maxProcessingDays;
	@JsonProperty("processing_days_display_label")
	
	private String processingDaysDisplayLabel;
	@JsonProperty("origin_country_id")
	
	private Integer originCountryId;
	/**
	 * The numeric ID of this shipping template.
	 * @return the shippingTemplateId
	 */
	public Integer getShippingTemplateId() {
		return shippingTemplateId;
	}
	/**
	 * The numeric ID of this shipping template.
	 * @param shippingTemplateId the shippingTemplateId to set
	 */
	public void setShippingTemplateId(Integer shippingTemplateId) {
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
	public Integer getUserId() {
		return userId;
	}
	/**
	 * The numeric ID of the user who owns this shipping template.
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * The minimum number of days for processing the listing.
	 * @return the minProcessingDays
	 */
	public Integer getMinProcessingDays() {
		return minProcessingDays;
	}
	/**
	 * The minimum number of days for processing the listing.
	 * @param minProcessingDays the minProcessingDays to set
	 */
	public void setMinProcessingDays(Integer minProcessingDays) {
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
	public Integer getOriginCountryId() {
		return originCountryId;
	}
	/**
	 * The numeric ID of the country from which the listing ships.
	 * @param originCountryId the originCountryId to set
	 */
	public void setOriginCountryId(Integer originCountryId) {
		this.originCountryId = originCountryId;
	}
	/**
	 * Creates a new ShippingTemplate			
	 */
	@JsonIgnore
	public ArrayList<ShippingTemplate> createShippingTemplate() {
		String results = EtsyService.getService("/shipping/templates");
		return readResults(results);
	}	
	/**
	 * Retrieves a ShippingTemplate by id.			
	 */
	@JsonIgnore
	public ArrayList<ShippingTemplate> getShippingTemplate(String shippingTemplateId) {
		String results = EtsyService.getService("/shipping/templates/"+shippingTemplateId);
		return readResults(results);
	}
	/**
	 * Updates a ShippingTemplate			
	 */
	@JsonIgnore
	public ArrayList<ShippingTemplate> updateShippingTemplate(String shippingTemplateId) {
		String results = EtsyService.putService("/shipping/templates/"+shippingTemplateId);
		return readResults(results);
	}	
	/**
	 * Deletes the ShippingTemplate with the given id.			
	 */
	@JsonIgnore
	public ArrayList<ShippingTemplate> deleteShippingTemplate(String shippingTemplateId) {
		String results = EtsyService.deleteService("/shipping/templates/"+shippingTemplateId);
		return readResults(results);
	}	
	/**
	 * Retrieves a set of ShippingTemplateEntry objects associated to a ShippingTemplate.			
	 */
	@JsonIgnore
	public ArrayList<ShippingTemplate> getAllShippingTemplateEntries(String shippingTemplateId) {
		String results = EtsyService.getService("/shipping/templates/"+shippingTemplateId+"/entries");
		return readResults(results);
	}	
	/**
	 * Retrieves a set of ShippingTemplate objects associated to a User.
	 */
	@JsonIgnore
	public ArrayList<ShippingTemplate> getAllUserShippingProfiles() {
		String results = EtsyService.getService("/users/__SELF__/shipping/templates");
		return readResults(results);
		
	}		
}
