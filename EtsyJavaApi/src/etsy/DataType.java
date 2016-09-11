package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class DataType {
	private String type;
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

	public static void describeOccasionEnum() {
		EtsyService.getService("/types/enum/occasion");
	}

	public static void describeRecipientEnum() {
		EtsyService.getService("/types/enum/recipient");
	}

	public static void describeWhenMadeEnum() {
		EtsyService.getService("/types/enum/when_made");
	}

	public static void describeWhoMadeEnum() {
		EtsyService.getService("/types/enum/who_made");
	}
}
