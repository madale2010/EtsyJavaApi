package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Feedback extends EtsyService {
 @JsonProperty("feedback_id")
	private Integer feedbackId;
 @JsonProperty("transaction_id")
	private Integer transactionId;
 @JsonProperty("creator_user_id")
	private Integer creatoruserId;
 @JsonProperty("target_user_id")
	private Integer targetuserId;
 @JsonProperty("seller_user_id")
	private Integer selleruserId;
 @JsonProperty("buyer_user_id")
	private Integer buyeruserId;
 @JsonProperty("creation_tsz")
	private Float creationTsz;
 @JsonProperty("message")
	private String message;
 @JsonProperty("value")
	private Integer value;
 @JsonProperty("image_feedback_id")
	private Integer imageFeedbackId;
 @JsonProperty("image_url_25x25")
	private String imageUrl25x25;
 @JsonProperty("image_url_155x125")
	private String imageUrl155x125;
 @JsonProperty("image_url_fullxfull")
	private String imageUrlFullxfull;
/**
 * @return the feedbackId
 */
public Integer getFeedbackId() {
	return feedbackId;
}
/**
 * @param feedbackId the feedbackId to set
 */
public void setFeedbackId(Integer feedbackId) {
	this.feedbackId = feedbackId;
}
/**
 * @return the transactionId
 */
public Integer getTransactionId() {
	return transactionId;
}
/**
 * @param transactionId the transactionId to set
 */
public void setTransactionId(Integer transactionId) {
	this.transactionId = transactionId;
}
/**
 * @return the creatoruserId
 */
public Integer getCreatoruserId() {
	return creatoruserId;
}
/**
 * @param creatoruserId the creatoruserId to set
 */
public void setCreatoruserId(Integer creatoruserId) {
	this.creatoruserId = creatoruserId;
}
/**
 * @return the targetuserId
 */
public Integer getTargetuserId() {
	return targetuserId;
}
/**
 * @param targetuserId the targetuserId to set
 */
public void setTargetuserId(Integer targetuserId) {
	this.targetuserId = targetuserId;
}
/**
 * @return the selleruserId
 */
public Integer getSelleruserId() {
	return selleruserId;
}
/**
 * @param selleruserId the selleruserId to set
 */
public void setSelleruserId(Integer selleruserId) {
	this.selleruserId = selleruserId;
}
/**
 * @return the buyeruserId
 */
public Integer getBuyeruserId() {
	return buyeruserId;
}
/**
 * @param buyeruserId the buyeruserId to set
 */
public void setBuyeruserId(Integer buyeruserId) {
	this.buyeruserId = buyeruserId;
}
/**
 * @return the creationTsz
 */
public Float getCreationTsz() {
	return creationTsz;
}
/**
 * @param creationTsz the creationTsz to set
 */
public void setCreationTsz(Float creationTsz) {
	this.creationTsz = creationTsz;
}
/**
 * @return the message
 */
public String getMessage() {
	return message;
}
/**
 * @param message the message to set
 */
public void setMessage(String message) {
	this.message = message;
}
/**
 * @return the value
 */
public Integer getValue() {
	return value;
}
/**
 * @param value the value to set
 */
public void setValue(Integer value) {
	this.value = value;
}
/**
 * @return the imageFeedbackId
 */
public Integer getImageFeedbackId() {
	return imageFeedbackId;
}
/**
 * @param imageFeedbackId the imageFeedbackId to set
 */
public void setImageFeedbackId(Integer imageFeedbackId) {
	this.imageFeedbackId = imageFeedbackId;
}
/**
 * @return the imageUrl25x25
 */
public String getImageUrl25x25() {
	return imageUrl25x25;
}
/**
 * @param imageUrl25x25 the imageUrl25x25 to set
 */
public void setImageUrl25x25(String imageUrl25x25) {
	this.imageUrl25x25 = imageUrl25x25;
}
/**
 * @return the imageUrl155x125
 */
public String getImageUrl155x125() {
	return imageUrl155x125;
}
/**
 * @param imageUrl155x125 the imageUrl155x125 to set
 */
public void setImageUrl155x125(String imageUrl155x125) {
	this.imageUrl155x125 = imageUrl155x125;
}
/**
 * @return the imageUrlFullxfull
 */
public String getImageUrlFullxfull() {
	return imageUrlFullxfull;
}
/**
 * @param imageUrlFullxfull the imageUrlFullxfull to set
 */
public void setImageUrlFullxfull(String imageUrlFullxfull) {
	this.imageUrlFullxfull = imageUrlFullxfull;
}
//Retrieves a set of Feedback objects associated to a User.
@JsonIgnore
public static void getAllUserFeedbackAsAuthor(String userId){EtsyService.getService("/users/"+userId+"/feedback/as-author");}
//Retrieves a set of Feedback objects associated to a User.
@JsonIgnore
public static void getAllUserFeedbackAsBuyer(String userId){EtsyService.getService("/users/"+userId+"/feedback/as-buyer");}
//Retrieves a set of Feedback objects associated to a User.
@JsonIgnore
public static void getAllUserFeedbackAsSeller(String userId){EtsyService.getService("/users/"+userId+"/feedback/as-seller");}
//Retrieves a set of Feedback objects associated to a User.
@JsonIgnore
public static void getAllUserFeedbackAsSubject(String userId){EtsyService.getService("/users/"+userId+"/feedback/as-subject");}
//	Returns a set of FeedBack objects associated to a User. This is essentially the union between the getAllUserFeedbackAsBuyer and getAllUserFeedbackAsSubject methods.
@JsonIgnore
public static void getAllFeedbackFromBuyers(String userId){EtsyService.getService("/users/"+userId+"/feedback/from-buyers");}
//	Returns a set of FeedBack objects associated to a User. This is essentially the union between the getAllUserFeedbackAsBuyer and getAllUserFeedbackAsSubject methods.
@JsonIgnore
public static void getAllFeedbackFromSellers(String userId){EtsyService.getService("/users/"+userId+"/feedback/from-sellers");}

}
