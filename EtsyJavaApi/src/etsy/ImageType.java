package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageType extends EtsyService {
 @JsonProperty("code")
	private String code;
 @JsonProperty("desc")
	private String desc;
 @JsonProperty("sizes")
 private ArrayList<String> sizes;
/**
 * @return the code
 */
public String getCode() {
	return code;
}
/**
 * @param code the code to set
 */
public void setCode(String code) {
	this.code = code;
}
/**
 * @return the desc
 */
public String getDesc() {
	return desc;
}
/**
 * @param desc the desc to set
 */
public void setDesc(String desc) {
	this.desc = desc;
}
/**
 * @return the sizes
 */
public ArrayList<String> getSizes() {
	return sizes;
}
/**
 * @param sizes the sizes to set
 */
public void setSizes(ArrayList<String> sizes) {
	this.sizes = sizes;
}
/**
*Lists available image types along with their supported sizes.

*/
@JsonIgnore
public static void listImageTypes(){EtsyService.getService("/image_types");}
}
