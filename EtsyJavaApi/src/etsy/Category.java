package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Category extends EtsyService{
	@JsonProperty("category_id")
	private Integer categoryId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("meta_title")
	private String metaTitle;
	@JsonProperty("meta_keywords")
	private String metaKeywords;
	@JsonProperty("meta_description")
	private String metaDescription;
	@JsonProperty("page_description")
	private String pageDescription;
	@JsonProperty("page_title")
	private String pageTitle;
	@JsonProperty("category_name")
	private String categoryName;
	@JsonProperty("short_name")
	private String shortName;
	@JsonProperty("long_name")
	private String longName;
	@JsonProperty("num_children")
	private Integer numChildren;
	/**
	 * @return the categoryId
	 */
	public Integer getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
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
	 * @return the metaTitle
	 */
	public String getMetaTitle() {
		return metaTitle;
	}
	/**
	 * @param metaTitle the metaTitle to set
	 */
	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}
	/**
	 * @return the metaKeywords
	 */
	public String getMetaKeywords() {
		return metaKeywords;
	}
	/**
	 * @param metaKeywords the metaKeywords to set
	 */
	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}
	/**
	 * @return the metaDescription
	 */
	public String getMetaDescription() {
		return metaDescription;
	}
	/**
	 * @param metaDescription the metaDescription to set
	 */
	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}
	/**
	 * @return the pageDescription
	 */
	public String getPageDescription() {
		return pageDescription;
	}
	/**
	 * @param pageDescription the pageDescription to set
	 */
	public void setPageDescription(String pageDescription) {
		this.pageDescription = pageDescription;
	}
	/**
	 * @return the pageTitle
	 */
	public String getPageTitle() {
		return pageTitle;
	}
	/**
	 * @param pageTitle the pageTitle to set
	 */
	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}
	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}
	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}
	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	/**
	 * @return the longName
	 */
	public String getLongName() {
		return longName;
	}
	/**
	 * @param longName the longName to set
	 */
	public void setLongName(String longName) {
		this.longName = longName;
	}
	/**
	 * @return the numChildren
	 */
	public Integer getNumChildren() {
		return numChildren;
	}
	/**
	 * @param numChildren the numChildren to set
	 */
	public void setNumChildren(Integer numChildren) {
		this.numChildren = numChildren;
	}
	/**
	 * Retrieves a top-level Category by tag.
	 * @param tag
	 */
	@JsonIgnore
	public static void getCategory(String tag) {
		EtsyService.getService("categories/"+tag);
	}
	/**
	 * Retrieves all top-level Categories.
	 */
	@JsonIgnore
	public static void getAllTopCategory() {
		EtsyService.getService("taxonomy/categories");
	}
	/**
	 * Retrieves a second-level Category by tag and subtag.
	 * @param tag
	 * @param subtag
	 */
	@JsonIgnore
	public static void getSubCategory(String tag, String subtag) {
		EtsyService.getService("categories/"+tag+"/"+subtag);
	}
	/**
	 * Retrieves a third-level Category by tag, subtag and subsubtag.
	 * @param tag
	 * @param subtag
	 * @param subsubtag
	 */
	@JsonIgnore
	public static void getSubSubCategory(String tag, String subtag, String subsubtag) {
		EtsyService.getService("categories/"+tag+"/"+subtag+"/"+subsubtag);
	}
	/**
	 * Retrieves children of a top-level Category by tag.
	 * @param tag
	 */
	@JsonIgnore
	public static void getAllTopCategoryChildren(String tag) {
		EtsyService.getService("/taxonomy/categories/"+tag);
	}
	/**
	 * Retrieves children of a second-level Category by tag and subtag.
	 * @param tag
	 * @param subtag
	 */
	@JsonIgnore
	public static void getAllSubCategoryChildren(String tag, String subtag) {
		EtsyService.getService("taxonomy/categories/"+tag+"/"+subtag);
	}
}
