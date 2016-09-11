package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Feedback {
 private int feedbackId;
 private int transactionId;
 private int creatoruserId;
 private int targetuserId;
 private int selleruserId;
 private int buyeruserId;
 private float creationTsz;
 private String message;
 private int value;
 private int imageFeedbackId;
 private String imageUrl25x25;
 private String imageUrl155x125;
 private String imageUrlFullxfull;
/**
 * @return the feedbackId
 */
public int getFeedbackId() {
	return feedbackId;
}
/**
 * @param feedbackId the feedbackId to set
 */
public void setFeedbackId(int feedbackId) {
	this.feedbackId = feedbackId;
}
/**
 * @return the transactionId
 */
public int getTransactionId() {
	return transactionId;
}
/**
 * @param transactionId the transactionId to set
 */
public void setTransactionId(int transactionId) {
	this.transactionId = transactionId;
}
/**
 * @return the creatoruserId
 */
public int getCreatoruserId() {
	return creatoruserId;
}
/**
 * @param creatoruserId the creatoruserId to set
 */
public void setCreatoruserId(int creatoruserId) {
	this.creatoruserId = creatoruserId;
}
/**
 * @return the targetuserId
 */
public int getTargetuserId() {
	return targetuserId;
}
/**
 * @param targetuserId the targetuserId to set
 */
public void setTargetuserId(int targetuserId) {
	this.targetuserId = targetuserId;
}
/**
 * @return the selleruserId
 */
public int getSelleruserId() {
	return selleruserId;
}
/**
 * @param selleruserId the selleruserId to set
 */
public void setSelleruserId(int selleruserId) {
	this.selleruserId = selleruserId;
}
/**
 * @return the buyeruserId
 */
public int getBuyeruserId() {
	return buyeruserId;
}
/**
 * @param buyeruserId the buyeruserId to set
 */
public void setBuyeruserId(int buyeruserId) {
	this.buyeruserId = buyeruserId;
}
/**
 * @return the creationTsz
 */
public float getCreationTsz() {
	return creationTsz;
}
/**
 * @param creationTsz the creationTsz to set
 */
public void setCreationTsz(float creationTsz) {
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
public int getValue() {
	return value;
}
/**
 * @param value the value to set
 */
public void setValue(int value) {
	this.value = value;
}
/**
 * @return the imageFeedbackId
 */
public int getImageFeedbackId() {
	return imageFeedbackId;
}
/**
 * @param imageFeedbackId the imageFeedbackId to set
 */
public void setImageFeedbackId(int imageFeedbackId) {
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
public static void getAllUserFeedbackAsAuthor(String userId){EtsyService.getService("/users/"+userId+"/feedback/as-author");}
//Retrieves a set of Feedback objects associated to a User.
public static void getAllUserFeedbackAsBuyer(String userId){EtsyService.getService("/users/"+userId+"/feedback/as-buyer");}
//Retrieves a set of Feedback objects associated to a User.
public static void getAllUserFeedbackAsSeller(String userId){EtsyService.getService("/users/"+userId+"/feedback/as-seller");}
//Retrieves a set of Feedback objects associated to a User.
public static void getAllUserFeedbackAsSubject(String userId){EtsyService.getService("/users/"+userId+"/feedback/as-subject");}
//	Returns a set of FeedBack objects associated to a User. This is essentially the union between the getAllUserFeedbackAsBuyer and getAllUserFeedbackAsSubject methods.
public static void getAllFeedbackFromBuyers(String userId){EtsyService.getService("/users/"+userId+"/feedback/from-buyers");}
//	Returns a set of FeedBack objects associated to a User. This is essentially the union between the getAllUserFeedbackAsBuyer and getAllUserFeedbackAsSubject methods.
public static void getAllFeedbackFromSellers(String userId){EtsyService.getService("/users/"+userId+"/feedback/from-sellers");}

}
