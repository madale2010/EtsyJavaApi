package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeaturedTreasury extends EtsyService {
 @JsonProperty("treasury_key")
	private String treasuryKey;
 @JsonProperty("treasury_id")
	private Integer treasuryId;
 @JsonProperty("treasury_owner_id")
	private Integer treasuryOwnerId;
 @JsonProperty("url")
	private String url;
 @JsonProperty("region")
	private String region;
 @JsonProperty("active_date")
	private Float activeDate;
/**
 * @return the treasuryKey
 */
public String getTreasuryKey() {
	return treasuryKey;
}
/**
 * @param treasuryKey the treasuryKey to set
 */
public void setTreasuryKey(String treasuryKey) {
	this.treasuryKey = treasuryKey;
}
/**
 * @return the treasuryId
 */
public Integer getTreasuryId() {
	return treasuryId;
}
/**
 * @param treasuryId the treasuryId to set
 */
public void setTreasuryId(Integer treasuryId) {
	this.treasuryId = treasuryId;
}
/**
 * @return the treasuryOwnerId
 */
public Integer getTreasuryOwnerId() {
	return treasuryOwnerId;
}
/**
 * @param treasuryOwnerId the treasuryOwnerId to set
 */
public void setTreasuryOwnerId(Integer treasuryOwnerId) {
	this.treasuryOwnerId = treasuryOwnerId;
}
/**
 * @return the url
 */
public String getUrl() {
	return url;
}
/**
 * @param url the url to set
 */
public void setUrl(String url) {
	this.url = url;
}
/**
 * @return the region
 */
public String getRegion() {
	return region;
}
/**
 * @param region the region to set
 */
public void setRegion(String region) {
	this.region = region;
}
/**
 * @return the activeDate
 */
public Float getActiveDate() {
	return activeDate;
}
/**
 * @param activeDate the activeDate to set
 */
public void setActiveDate(Float activeDate) {
	this.activeDate = activeDate;
}
//Finds all FeaturedTreasuries.
@JsonIgnore
public static void getAllFeaturedTreasuries(){EtsyService.getService("/featured_treasuries");}
//Finds FeaturedTreasury by numeric ID.
@JsonIgnore
public static void getFeaturedTreasuryById(String featuredTreasuryId){EtsyService.getService("/featured_treasuries/"+featuredTreasuryId);}
//Finds all FeaturedTreasury by numeric owner_id.
@JsonIgnore
public static void getAllFeaturedTreasuriesByOwner(String ownerId){EtsyService.getService("/featured_treasuries/owner/"+ownerId);}
}
