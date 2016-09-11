package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class FeaturedTreasury {
 private String treasuryKey;
 private int treasuryId;
 private int treasuryOwnerId;
 private String url;
 private String region;
 private float activeDate;
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
public int getTreasuryId() {
	return treasuryId;
}
/**
 * @param treasuryId the treasuryId to set
 */
public void setTreasuryId(int treasuryId) {
	this.treasuryId = treasuryId;
}
/**
 * @return the treasuryOwnerId
 */
public int getTreasuryOwnerId() {
	return treasuryOwnerId;
}
/**
 * @param treasuryOwnerId the treasuryOwnerId to set
 */
public void setTreasuryOwnerId(int treasuryOwnerId) {
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
public float getActiveDate() {
	return activeDate;
}
/**
 * @param activeDate the activeDate to set
 */
public void setActiveDate(float activeDate) {
	this.activeDate = activeDate;
}
//Finds all FeaturedTreasuries.
public static void getAllFeaturedTreasuries(){EtsyService.getService("/featured_treasuries");}
//Finds FeaturedTreasury by numeric ID.
public static void getFeaturedTreasuryById(String featuredTreasuryId){EtsyService.getService("/featured_treasuries/"+featuredTreasuryId);}
//Finds all FeaturedTreasury by numeric owner_id.
public static void getAllFeaturedTreasuriesByOwner(String ownerId){EtsyService.getService("/featured_treasuries/owner/"+ownerId);}
}
