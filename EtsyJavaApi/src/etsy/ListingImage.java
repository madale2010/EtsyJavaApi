package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ListingImage {
	private int listing_fileId;
	private int listingId;
	private int rank;
	private String filename;
	private String filesize;
	private int sizeBytes;
	private String filetype;
	private int createDate;
/**
	 * @return the listing_fileId
	 */
	public int getListing_fileId() {
		return listing_fileId;
	}
/**
	 * @param listing_fileId the listing_fileId to set
	 */
	public void setListing_fileId(int listing_fileId) {
		this.listing_fileId = listing_fileId;
	}
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
	 * @return the rank
	 */
	public int getRank() {
		return rank;
	}
/**
	 * @param rank the rank to set
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}
/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}
/**
	 * @param filename the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}
/**
	 * @return the filesize
	 */
	public String getFilesize() {
		return filesize;
	}
/**
	 * @param filesize the filesize to set
	 */
	public void setFilesize(String filesize) {
		this.filesize = filesize;
	}
/**
	 * @return the sizeBytes
	 */
	public int getSizeBytes() {
		return sizeBytes;
	}
/**
	 * @param sizeBytes the sizeBytes to set
	 */
	public void setSizeBytes(int sizeBytes) {
		this.sizeBytes = sizeBytes;
	}
/**
	 * @return the filetype
	 */
	public String getFiletype() {
		return filetype;
	}
/**
	 * @param filetype the filetype to set
	 */
	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}
/**
	 * @return the createDate
	 */
	public int getCreateDate() {
		return createDate;
	}
/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(int createDate) {
		this.createDate = createDate;
	}
/**
	*Finds all ListingFiles on a Listing
	*/
	public static void getAllListingFiles(int listingId){EtsyService.getService("/listings/"+listingId+"/files");}
/**
	*	Upload a new listing file, or attach an existing file to this listing. You must either provide the listing_file_id of an existing listing file, or the name and file data of a new file that you are uploading. If you are attaching a file to a listing that is currently not digital, the listing will be converted to a digital listing. This will cause the listing to have free shipping and will remove any variations.
	*/
	public void uploadListingFile(int listingId){EtsyService.postService("/listings/"+listingId+"/files", this);}
/**
	*Finds a ListingFile by ID
	*/
	public static void findListingFile(int listingId,int listingFileId){EtsyService.getService("/listings/"+listingId+"/files/"+listingFileId);}
/**
	*	Removes the listing file from this listing. If this is the last file on a listing, the listing will no longer be considered a digital listing.
	*/
	public static void deleteListingFile(int listingId, int listingFileId){EtsyService.deleteService("/listings/"+listingId+"/files/"+listingFileId);}
}
