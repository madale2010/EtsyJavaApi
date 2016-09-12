package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataType extends EtsyService {
	@JsonProperty("type")
	private String type;
	@JsonProperty("values")
	private ArrayList<String> values;

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the values
	 */
	public ArrayList<String> getValues() {
		return values;
	}

	/**
	 * @param values
	 *            the values to set
	 */
	public void setValues(ArrayList<String> values) {
		this.values = values;
	}
	@JsonIgnore
	public static void describeOccasionEnum() {
		EtsyService.getService("/types/enum/occasion");
	}
	@JsonIgnore
	public static void describeRecipientEnum() {
		EtsyService.getService("/types/enum/recipient");
	}
	@JsonIgnore
	public static void describeWhenMadeEnum() {
		EtsyService.getService("/types/enum/when_made");
	}
	@JsonIgnore
	public static void describeWhoMadeEnum() {
		EtsyService.getService("/types/enum/who_made");
	}
}
