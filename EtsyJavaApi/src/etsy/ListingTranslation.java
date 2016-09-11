package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ListingTranslation {
	private int listingId;
	private String language;
	private String title;
	private String description;
	private ArrayList<String> tags;
	/**
	 * @return the listingId
	 */
	public int getListingId() {
		return listingId;
	}
	/**
	 * @param listingId the listingId to set
	 */
	public void setListingId(int listingId) {
		this.listingId = listingId;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the tags
	 */
	public ArrayList<String> getTags() {
		return tags;
	}
	/**
	 * @param tags the tags to set
	 */
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	/**
	*Retrieves a ListingTranslation by listing_id and language

	*/
	public static void getListingTranslation(int listingId, String language){EtsyService.getService("/listings/"+listingId+"/translations/"+language);}
	/**
	*Creates a ListingTranslation by listing_id and language
	*/
	public void createListingTranslation(int listingId, String language){EtsyService.postService("/listings/"+listingId+"/translations/"+language, this);}
	/**
	*Updates a ListingTranslation by listing_id and language

	*/
	public void updateListingTranslation(int listingId, String language){EtsyService.putService("/listings/"+listingId+"/translations/"+language, this);}
	/**
	*Deletes a ListingTranslation by listing_id and language
	*/
	public static void deleteListingTranslation(int listingId, String language){EtsyService.deleteService("/listings/"+listingId+"/translations/"+language);}
}
