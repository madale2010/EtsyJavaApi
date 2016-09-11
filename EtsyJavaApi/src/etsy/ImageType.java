package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ImageType {
 private String code;
 private String desc;
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
public static void listImageTypes(){EtsyService.getService("/image_types");}
}
