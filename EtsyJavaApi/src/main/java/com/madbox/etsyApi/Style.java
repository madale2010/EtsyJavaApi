package com.madbox.etsyApi;

public class Style {
	private int styleId;
	private String style;
	/**
	 * @return the styleId
	 */
	public int getStyleId() {
		return styleId;
	}
	/**
	 * @param styleId the styleId to set
	 */
	public void setStyleId(int styleId) {
		this.styleId = styleId;
	}
	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}
	/**
	 * @param style the style to set
	 */
	public void setStyle(String style) {
		this.style = style;
	}
	/**
	*Retrieve all suggested styles.
	*/
	public static void findSuggestedStyles(){EtsyService.getService("/taxonomy/styles");}
}
