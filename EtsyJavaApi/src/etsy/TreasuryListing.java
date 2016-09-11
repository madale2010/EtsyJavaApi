package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class TreasuryListing {
	private TreasuryListingData data;
	private float creationTsz;
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
	public float getCreationTsz() {
		return creationTsz;
	}
	/**
	 * @param creationTsz the creationTsz to set
	 */
	public void setCreationTsz(float creationTsz) {
		this.creationTsz = creationTsz;
	}
	/**
	*Add listing to a Treasury
	*/
	public void addTreasuryListing(String treasuryKey){EtsyService.postService("/treasuries/"+treasuryKey+"/listings", this);}
	/**
	*Remove listing from a Treasury
	*/
	public static void removeTreasuryListing(String treasuryKey, int listingId){EtsyService.deleteService("/treasuries/"+treasuryKey+"/listings/"+listingId);}
}
