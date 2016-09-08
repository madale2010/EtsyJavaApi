package com.madbox.etsyApi;

import java.util.ArrayList;
import java.util.Map;

public class VariationsPropertyQualifier {
	private int propertyId;
	private ArrayList<Integer> options;
	private Map<String, VariationsPropertyQualifier> results;
	private Map<String, Integer> aliases;
	/**
	 * @return the propertyId
	 */
	public int getPropertyId() {
		return propertyId;
	}
	/**
	 * @param propertyId the propertyId to set
	 */
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	/**
	 * @return the options
	 */
	public ArrayList<Integer> getOptions() {
		return options;
	}
	/**
	 * @param options the options to set
	 */
	public void setOptions(ArrayList<Integer> options) {
		this.options = options;
	}
	/**
	 * @return the results
	 */
	public Map<String, VariationsPropertyQualifier> getResults() {
		return results;
	}
	/**
	 * @param results the results to set
	 */
	public void setResults(Map<String, VariationsPropertyQualifier> results) {
		this.results = results;
	}
	/**
	 * @return the aliases
	 */
	public Map<String, Integer> getAliases() {
		return aliases;
	}
	/**
	 * @param aliases the aliases to set
	 */
	public void setAliases(Map<String, Integer> aliases) {
		this.aliases = aliases;
	}
}
