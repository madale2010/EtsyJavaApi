package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Taxonomy {
	private int id;
	private int level;
	private String name;
	private String parent;
	private int parentId;
	private String path;
	private int categoryId;
	private ArrayList<Taxonomy> children;
	private ArrayList<Integer> childrenIds;
	private ArrayList<Integer> fullPathTaxonomyIds;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
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
	public int getParentId() {
		return parentId;
	}
	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(int parentId) {
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
	public int getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
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
	public static void getBuyerTaxonomy(){EtsyService.getService("/taxonomy/buyer/get");}
	/**
	*Retrieve the entire taxonomy as used by sellers in the listing process.
	*/
	public static void getSellerTaxonomy(){EtsyService.getService("/taxonomy/seller/get");}
}
