package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Country extends EtsyService {
	@JsonProperty("country_id")
	private Integer countryId;
	@JsonProperty("iso_country_code")
	private String isoCountryCode;
	@JsonProperty("world_bank_country_code")
	private String worldBankCountryCode;
	@JsonProperty("name")
	private String name;
	@JsonProperty("slug")
	private String slug;
	@JsonProperty("lat")
	private Float lat;
	@JsonProperty("lon")
	private Float lon;
	/**
	 * @return the countryId
	 */
	public Integer getCountryId() {
		return countryId;
	}
	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	/**
	 * @return the isoCountryCode
	 */
	public String getIsoCountryCode() {
		return isoCountryCode;
	}
	/**
	 * @param isoCountryCode the isoCountryCode to set
	 */
	public void setIsoCountryCode(String isoCountryCode) {
		this.isoCountryCode = isoCountryCode;
	}
	/**
	 * @return the worldBankCountryCode
	 */
	public String getWorldBankCountryCode() {
		return worldBankCountryCode;
	}
	/**
	 * @param worldBankCountryCode the worldBankCountryCode to set
	 */
	public void setWorldBankCountryCode(String worldBankCountryCode) {
		this.worldBankCountryCode = worldBankCountryCode;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the slug
	 */
	public String getSlug() {
		return slug;
	}
	/**
	 * @param slug the slug to set
	 */
	public void setSlug(String slug) {
		this.slug = slug;
	}
	/**
	 * @return the lat
	 */
	public Float getLat() {
		return lat;
	}
	/**
	 * @param lat the lat to set
	 */
	public void setLat(Float lat) {
		this.lat = lat;
	}
	/**
	 * @return the lon
	 */
	public Float getLon() {
		return lon;
	}
	/**
	 * @param lon the lon to set
	 */
	public void setLon(Float lon) {
		this.lon = lon;
	}
}
