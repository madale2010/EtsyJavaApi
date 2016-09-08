package com.madbox.etsyApi;

import java.util.ArrayList;

public class Listing extends EtsyService {
	private int listing_id;
	private String state;
	private int user_id;
	private int category_id;
	private String title;
	private String description;
	private float creation_tsz;
	private float ending_tsz;
	private float original_creation_tsz;
	private float last_modified_tsz;
	private String price;
	private String currency_code;
	private int quantity;
	private ArrayList<String> tags;
	private ArrayList<String> category_path;
	private int[] category_path_ids;
	private int taxonomy_id;
	private int suggested_taxonomy_id;
	private ArrayList<String> taxonomy_path;
	private ArrayList<String> materials;
	private int shop_section_id;
	private String featured_rank;
	private float state_tsz;
	private String url;
	private int views;
	private int num_favorers;
	private Long shipping_template_id;
	private int processing_min;
	private int processing_max;
	private String who_made;
	private boolean is_supply;
	private String when_made;
	private double item_weight;
	private String item_weight_units;
	private double item_length;
	private double item_width;
	private double item_height;
	private String item_dimensions_unit;
	private boolean is_private;
	private String recipient;
	private String occasion;
	private ArrayList<String> style;
	private boolean non_taxable;
	private boolean is_customizable;
	private boolean is_digital;
	private String file_data;
	private boolean has_variations;
	private boolean should_auto_renew;
	private String language;
	private boolean used_manufacturer;
	
	public Listing() {
		is_supply=true;
		quantity=0;
		state="Draft";
		
	}
	public int getListing_id() {
		return listing_id;
	}
	public void setListing_id(int isting_id) {
		this.listing_id = isting_id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getCreation_tsz() {
		return creation_tsz;
	}
	public void setCreation_tsz(float creation_tsz) {
		this.creation_tsz = creation_tsz;
	}
	public float getEnding_tsz() {
		return ending_tsz;
	}
	public void setEnding_tsz(float ending_tsz) {
		this.ending_tsz = ending_tsz;
	}
	public float getOriginal_creation_tsz() {
		return original_creation_tsz;
	}
	public void setOriginal_creation_tsz(float original_creation_tsz) {
		this.original_creation_tsz = original_creation_tsz;
	}
	public float getLast_modified_tsz() {
		return last_modified_tsz;
	}
	public void setLast_modified_tsz(float last_modified_tsz) {
		this.last_modified_tsz = last_modified_tsz;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCurrency_code() {
		return currency_code;
	}
	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public ArrayList<String> getTags() {
		return tags;
	}
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	public ArrayList<String> getCategory_path() {
		return category_path;
	}
	public void setCategory_path(ArrayList<String> category_path) {
		this.category_path = category_path;
	}
	public int[] getCategory_path_ids() {
		return category_path_ids;
	}
	public void setCategory_path_ids(int[] category_path_ids) {
		this.category_path_ids = category_path_ids;
	}
	public int getTaxonomy_id() {
		return taxonomy_id;
	}
	public void setTaxonomy_id(int taxonomy_id) {
		this.taxonomy_id = taxonomy_id;
	}
	public int getSuggested_taxonomy_id() {
		return suggested_taxonomy_id;
	}
	public void setSuggested_taxonomy_id(int suggested_taxonomy_id) {
		this.suggested_taxonomy_id = suggested_taxonomy_id;
	}
	public ArrayList<String> getTaxonomy_path() {
		return taxonomy_path;
	}
	public void setTaxonomy_path(ArrayList<String> taxonomy_path) {
		this.taxonomy_path = taxonomy_path;
	}
	public ArrayList<String> getMaterials() {
		return materials;
	}
	public void setMaterials(ArrayList<String> materials) {
		this.materials = materials;
	}
	public int getShop_section_id() {
		return shop_section_id;
	}
	public void setShop_section_id(int shop_section_id) {
		this.shop_section_id = shop_section_id;
	}
	public String getFeatured_rank() {
		return featured_rank;
	}
	public void setFeatured_rank(String featured_rank) {
		this.featured_rank = featured_rank;
	}
	public float getState_tsz() {
		return state_tsz;
	}
	public void setState_tsz(float state_tsz) {
		this.state_tsz = state_tsz;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getNum_favorers() {
		return num_favorers;
	}
	public void setNum_favorers(int num_favorers) {
		this.num_favorers = num_favorers;
	}
	public Long getShipping_template_id() {
		return shipping_template_id;
	}
	public void setShipping_template_id(Long shipping_template_id) {
		this.shipping_template_id = shipping_template_id;
	}
	public int getProcessing_min() {
		return processing_min;
	}
	public void setProcessing_min(int processing_min) {
		this.processing_min = processing_min;
	}
	public int getProcessing_max() {
		return processing_max;
	}
	public void setProcessing_max(int processing_max) {
		this.processing_max = processing_max;
	}
	public String getWho_made() {
		return who_made;
	}
	public void setWho_made(String who_made) {
		this.who_made = who_made;
	}
	public boolean isIs_supply() {
		return is_supply;
	}
	public void setIs_supply(boolean is_supply) {
		this.is_supply = is_supply;
	}
	public String getWhen_made() {
		return when_made;
	}
	public void setWhen_made(String when_made) {
		this.when_made = when_made;
	}
	public double getItem_weight() {
		return item_weight;
	}
	public void setItem_weight(double item_weight) {
		this.item_weight = item_weight;
	}
	public String getItem_weight_units() {
		return item_weight_units;
	}
	public void setItem_weight_units(String item_weight_units) {
		this.item_weight_units = item_weight_units;
	}
	public double getItem_length() {
		return item_length;
	}
	public void setItem_length(double item_length) {
		this.item_length = item_length;
	}
	public double getItem_width() {
		return item_width;
	}
	public void setItem_width(double item_width) {
		this.item_width = item_width;
	}
	public double getItem_height() {
		return item_height;
	}
	public void setItem_height(int item_height) {
		this.item_height = item_height;
	}
	public String getItem_dimensions_unit() {
		return item_dimensions_unit;
	}
	public void setItem_dimensions_unit(String item_dimensions_unit) {
		this.item_dimensions_unit = item_dimensions_unit;
	}
	public boolean isIs_private() {
		return is_private;
	}
	public void setIs_private(boolean is_private) {
		this.is_private = is_private;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getOccasion() {
		return occasion;
	}
	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}
	public ArrayList<String> getStyle() {
		return style;
	}
	public void setStyle(ArrayList<String> style) {
		this.style = style;
	}
	public boolean isNon_taxable() {
		return non_taxable;
	}
	public void setNon_taxable(boolean non_taxable) {
		this.non_taxable = non_taxable;
	}
	public boolean isIs_customizable() {
		return is_customizable;
	}
	public void setIs_customizable(boolean is_customizable) {
		this.is_customizable = is_customizable;
	}
	public boolean isIs_digital() {
		return is_digital;
	}
	public void setIs_digital(boolean is_digital) {
		this.is_digital = is_digital;
	}
	public String getFile_data() {
		return file_data;
	}
	public void setFile_data(String file_data) {
		this.file_data = file_data;
	}
	public boolean isHas_variations() {
		return has_variations;
	}
	public void setHas_variations(boolean has_variations) {
		this.has_variations = has_variations;
	}
	public boolean isShould_auto_renew() {
		return should_auto_renew;
	}
	public void setShould_auto_renew(boolean should_auto_renew) {
		this.should_auto_renew = should_auto_renew;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public boolean isUsed_manufacturer() {
		return used_manufacturer;
	}
	public void setUsed_manufacturer(boolean used_manufacturer) {
		this.used_manufacturer = used_manufacturer;
	}
	public void createListing() throws EtsyException{
		//Check for required objects
		if(this.shipping_template_id==null){
			throw new EtsyException("A shipping_template_id is required when creating a listing.");
		}
		if(this.title==null || this.description==null || this.price==null || this.who_made==null){
			throw new EtsyException("Required field needed.");
		}
		
		EtsyService.postService("listing");
	}
	/**
	 * Gets all listings for current user.
	 * @return List of Listings
	 */
	public static ArrayList<Listing> getAllListings() {
		String results = EtsyService.getService("/shops/__SELF__/listings");
		return readResults(results);
	}
	/**
	 * Finds all active Listings. (Note: the sort_on and sort_order 
	 * options only work when combined with one of the search options: 
	 * keywords, color, tags, location, etc.)
	 * @return List of Listings
	 */
	public static ArrayList<Listing> findAllListingActive() {
		String results = EtsyService.getService("/shops/__SELF__/listings/active");
		return readResults(results);
		
	}
	
}
