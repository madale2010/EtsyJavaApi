package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Region {
	private int regionId;
	private String regionName;
	private boolean isDead;
	/**
	 * @return the regionId
	 */
	public int getRegionId() {
		return regionId;
	}
	/**
	 * @param regionId the regionId to set
	 */
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	/**
	 * @return the regionName
	 */
	public String getRegionName() {
		return regionName;
	}
	/**
	 * @param regionName the regionName to set
	 */
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	/**
	 * @return the isDead
	 */
	public boolean isDead() {
		return isDead;
	}
	/**
	 * @param isDead the isDead to set
	 */
	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	/**
	*Finds all Region.
	*/
	public static void getAllRegion(){EtsyService.getService("/regions");}
	/**
	*Retrieves a Region by id.
	*/
	public static void getRegion(String regionId){EtsyService.getService("/regions/"+regionId);}
	/**
	*
	*/
	public static void findEligibleRegions(){EtsyService.getService("/regions/eligible");}
}
