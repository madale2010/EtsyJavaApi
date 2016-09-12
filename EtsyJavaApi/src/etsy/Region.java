package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Region extends EtsyService {
	@JsonProperty("region_id")
	private Integer regionId;
	@JsonProperty("region_name")
	private String regionName;
	@JsonProperty("is_dead")
	private Boolean isDead;
	/**
	 * @return the regionId
	 */
	public Integer getRegionId() {
		return regionId;
	}
	/**
	 * @param regionId the regionId to set
	 */
	public void setRegionId(Integer regionId) {
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
	public Boolean isDead() {
		return isDead;
	}
	/**
	 * @param isDead the isDead to set
	 */
	public void setDead(Boolean isDead) {
		this.isDead = isDead;
	}
	/**
	*Finds all Region.
	*/
	@JsonIgnore
	public static void getAllRegion(){EtsyService.getService("/regions");}
	/**
	*Retrieves a Region by id.
	*/
	@JsonIgnore
	public static void getRegion(String regionId){EtsyService.getService("/regions/"+regionId);}
	/**
	*
	*/
	@JsonIgnore
	public static void findEligibleRegions(){EtsyService.getService("/regions/eligible");}
}
