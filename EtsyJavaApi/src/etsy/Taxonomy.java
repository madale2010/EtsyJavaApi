package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Taxonomy extends EtsyService {
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("level")
	private Integer level;
	@JsonProperty("name")
	private String name;
	@JsonProperty("parent")
	private String parent;
	@JsonProperty("parent_id")
	private Integer parentId;
	@JsonProperty("path")
	private String path;
	@JsonProperty("category_id")
	private Integer categoryId;
	@JsonProperty("children")
	private ArrayList<Taxonomy> children;
	@JsonProperty("children_ids")
	private ArrayList<Integer> childrenIds;
	@JsonProperty("full_path_taxonomy_ids")
	private ArrayList<Integer> fullPathTaxonomyIds;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the level
	 */
	public Integer getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(Integer level) {
		this.level = level;
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
	 * @return the parent
	 */
	public String getParent() {
		return parent;
	}
	/**
	 * @param parent the parent to set
	 */
	public void setParent(String parent) {
		this.parent = parent;
	}
	/**
	 * @return the parentId
	 */
	public Integer getParentId() {
		return parentId;
	}
	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}
	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
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
	 * @return the children
	 */
	public ArrayList<Taxonomy> getChildren() {
		return children;
	}
	/**
	 * @param children the children to set
	 */
	public void setChildren(ArrayList<Taxonomy> children) {
		this.children = children;
	}
	/**
	 * @return the childrenIds
	 */
	public ArrayList<Integer> getChildrenIds() {
		return childrenIds;
	}
	/**
	 * @param childrenIds the childrenIds to set
	 */
	public void setChildrenIds(ArrayList<Integer> childrenIds) {
		this.childrenIds = childrenIds;
	}
	/**
	 * @return the fullPathTaxonomyIds
	 */
	public ArrayList<Integer> getFullPathTaxonomyIds() {
		return fullPathTaxonomyIds;
	}
	/**
	 * @param fullPathTaxonomyIds the fullPathTaxonomyIds to set
	 */
	public void setFullPathTaxonomyIds(ArrayList<Integer> fullPathTaxonomyIds) {
		this.fullPathTaxonomyIds = fullPathTaxonomyIds;
	}
	/**
	*Retrieve the entire taxonomy as seen by buyers in search.
	*/
	@JsonIgnore
	public static void getBuyerTaxonomy(){EtsyService.getService("/taxonomy/buyer/get");}
	/**
	*Retrieve the entire taxonomy as used by sellers in the listing process.
	*/
	@JsonIgnore
	public static void getSellerTaxonomy(){EtsyService.getService("/taxonomy/seller/get");}
}
