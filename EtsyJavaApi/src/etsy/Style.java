package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Style extends EtsyService {
	@JsonProperty("style_id")
	private Integer styleId;
	@JsonProperty("style")
	private String style;
	/**
	 * @return the styleId
	 */
	public Integer getStyleId() {
		return styleId;
	}
	/**
	 * @param styleId the styleId to set
	 */
	public void setStyleId(Integer styleId) {
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
	@JsonIgnore
	public static void findSuggestedStyles(){EtsyService.getService("/taxonomy/styles");}
}
