package com.madbox.etsyApi;

import java.util.ArrayList;

public class Manufacturer {
	private String name;
	private ArrayList<String> description;
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
