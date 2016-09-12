package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Manufacturer extends EtsyService {
	@JsonProperty("name")
	private String name;
	@JsonProperty("description")
	private ArrayList<String> description;
	@JsonProperty("location")
	private String location;
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
	 * @return the description
	 */
	public ArrayList<String> getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(ArrayList<String> description) {
		this.description = description;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
}
