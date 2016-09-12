package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListingTranslation extends EtsyService {
	@JsonProperty("listing_id")
	private Integer listingId;
	@JsonProperty("language")
	private String language;
	@JsonProperty("title")
	private String title;
	@JsonProperty("description")
	private String description;
	@JsonProperty("tags")
	private ArrayList<String> tags;

	/**
	 * @return the listingId
	 */
	public Integer getListingId() {
		return listingId;
	}

	/**
	 * @param listingId
	 *            the listingId to set
	 */
	public void setListingId(Integer listingId) {
		this.listingId = listingId;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language
	 *            the language to set
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
	 * @param title
	 *            the title to set
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
	 * @param description
	 *            the description to set
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
	 * @param tags
	 *            the tags to set
	 */
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}

	/**
	 * Retrieves a ListingTranslation by listing_id and language
	 * 
	 */
	@JsonIgnore
	public ListingTranslation  getListingTranslation(Integer listingId, String language) {
		return (ListingTranslation) readResult("/listings/" + listingId + "/translations/" + language);
	}

	/**
	 * Creates a ListingTranslation by listing_id and language
	 */
	@JsonIgnore
	public void createListingTranslation(Integer listingId, String language) {
		EtsyService.postService("/listings/" + listingId + "/translations/" + language, this);
	}

	/**
	 * Updates a ListingTranslation by listing_id and language
	 * 
	 */
	@JsonIgnore
	public void updateListingTranslation(Integer listingId, String language) {
		EtsyService.putService("/listings/" + listingId + "/translations/" + language, this);
	}

	/**
	 * Deletes a ListingTranslation by listing_id and language
	 */
	@JsonIgnore
	public static void deleteListingTranslation(Integer listingId, String language) {
		EtsyService.deleteService("/listings/" + listingId + "/translations/" + language);
	}
}
