package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListingFile extends EtsyService {
	@JsonProperty("listing_file_id")
	
	private Integer listingFileId;
	@JsonProperty("listing_id")
	
	private Integer listingId;
	@JsonProperty("rank")
	
	private Integer rank;
	@JsonProperty("filename")
	
	private String filename;
	@JsonProperty("filesize")
	
	private String filesize;
	@JsonProperty("size_bytes")
	
	private Integer sizeBytes;
	@JsonProperty("filetype")
	
	private String filetype;
	@JsonProperty("create_date")
	
	private Integer createDate;
	/**
	 * @return the listingFileId
	 */
	public Integer getListingFileId() {
		return listingFileId;
	}
	/**
	 * @param listingFileId the listingFileId to set
	 */
	public void setListingFileId(Integer listingFileId) {
		this.listingFileId = listingFileId;
	}
	/**
	 * @return the listingId
	 */
	public Integer getListingId() {
		return listingId;
	}
	/**
	 * @param listingId the listingId to set
	 */
	public void setListingId(Integer listingId) {
		this.listingId = listingId;
	}
	/**
	 * @return the rank
	 */
	public Integer getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(Integer rank) {
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
	public Integer getSizeBytes() {
		return sizeBytes;
	}
	/**
	 * @param sizeBytes the sizeBytes to set
	 */
	public void setSizeBytes(Integer sizeBytes) {
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
	public Integer getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Integer createDate) {
		this.createDate = createDate;
	}
	/**
	 * Finds all ListingFiles on a Listing
	 * @return 
	 */
	@JsonIgnore
	public ArrayList<ListingFile> findAllListingFiles(String listingId){
		String results = getService("/listings/"+listingId+"/files");
		return readResults(results);
	}
	/**
	 * 	Upload a new listing file, or attach an existing file to this listing. 
	 *  You must either provide the listing_file_id of an existing listing file, 
	 *  or the name and file data of a new file that you are uploading. 
	 *  If you are attaching a file to a listing that is currently not digital, 
	 *  the listing will be converted to a digital listing. 
	 *  This will cause the listing to have free shipping and will remove any variations.
	 */
	@JsonIgnore
	public void uploadListingFile(String listingId){
		postService("/listings/"+listingId+"/files");
		
	}
	@JsonIgnore
	public ListingFile findListingFile(String listingId, String listingFileId){
		String results = getService("/listings/"+listingId+"/files/"+listingFileId);
		return (ListingFile) readResult(results);
	}
	@JsonIgnore
	public void deleteListingFile(String listingId, String listingFileId){
		deleteService("/listings/"+listingId+"/files/"+listingFileId);
	}
}
