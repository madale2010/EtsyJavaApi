package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TreasuryListing extends EtsyService {
	private TreasuryListingData data;
	@JsonProperty("creation_tsz")
	private Float creationTsz;
	/**
	 * @return the data
	 */
	public TreasuryListingData getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(TreasuryListingData data) {
		this.data = data;
	}
	/**
	 * @return the creationTsz
	 */
	public Float getCreationTsz() {
		return creationTsz;
	}
	/**
	 * @param creationTsz the creationTsz to set
	 */
	public void setCreationTsz(Float creationTsz) {
		this.creationTsz = creationTsz;
	}
	/**
	*Add listing to a Treasury
	*/
	@JsonIgnore
	public void addTreasuryListing(String treasuryKey){EtsyService.postService("/treasuries/"+treasuryKey+"/listings", this);}
	/**
	*Remove listing from a Treasury
	*/
	@JsonIgnore
	public static void removeTreasuryListing(String treasuryKey, int listingId){EtsyService.deleteService("/treasuries/"+treasuryKey+"/listings/"+listingId);}
}
