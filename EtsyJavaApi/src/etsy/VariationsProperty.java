package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariationsProperty extends EtsyService {
	@JsonProperty("property_id")
	private Integer propertyId;
	@JsonProperty("formatted_name")
	private String formattedName;
	@JsonProperty("options")
	private ArrayList<VariationsOption> options;
	/**
	 * @return the propertyId
	 */
	public Integer getPropertyId() {
		return propertyId;
	}
	/**
	 * @param propertyId the propertyId to set
	 */
	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}
	/**
	 * @return the formattedName
	 */
	public String getFormattedName() {
		return formattedName;
	}
	/**
	 * @param formattedName the formattedName to set
	 */
	public void setFormattedName(String formattedName) {
		this.formattedName = formattedName;
	}
	/**
	 * @return the options
	 */
	public ArrayList<VariationsOption> getOptions() {
		return options;
	}
	/**
	 * @param options the options to set
	 */
	public void setOptions(ArrayList<VariationsOption> options) {
		this.options = options;
	}
	/**
	*Get the listing variations available for a listing.
	*/
	@JsonIgnore
	public static void getListingVariations(Integer listingId){EtsyService.getService("/listings/"+listingId+"/variations");}
	/**
	*	Update all of the listing variations available for a listing; optionally set custom property names and property qualifiers. Expects a JSON array with a collection of objects of the form: [{"property_id":200, "value":"Black"}, {"property_id":200, "value":"White"}]
	*/
	@JsonIgnore
	public void createListingVariations(Integer listingId){EtsyService.postService("/listings/"+listingId+"/variations", this);}
	/**
	*	Update all of the listing variations available for a listing. Expects a JSON array with a collection of objects of the form: [{"property_id":200, "value":"Black"}, {"property_id":200, "value":"White"}
	*/
	@JsonIgnore
	public void updateListingVariations(Integer listingId){EtsyService.putService("/listings/"+listingId+"/variations", this);}
	/**
	*Add a new listing variation for a listing.
	*/
	@JsonIgnore
	public void createListingVariation(Integer listingId, int propertyId){EtsyService.postService("/listings/"+listingId+"/variations/"+propertyId, this);}
	/**
	*Update a listing variation for a listing.
	*/
	@JsonIgnore
	public void updateListingVariation(Integer listingId, int propertyId){EtsyService.putService("/listings/"+listingId+"/variations/"+propertyId, this);}
	/**
	*Remove a listing variation for a listing.
	*/
	@JsonIgnore
	public static void deleteListingVariation(Integer listingId, int propertyId){EtsyService.deleteService("/listings/"+listingId+"/variations/"+propertyId);}
	
}
