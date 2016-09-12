package etsy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ForumPost extends EtsyService {
	@JsonProperty("thread_id")	
 private Integer threadId;
	@JsonProperty("post_id")
 private Integer postId;
	@JsonProperty("post")
 private String post;
	@JsonProperty("user_id")
 private String userId;
	@JsonProperty("last_edit_time")
 private Integer lastEditTime;
	@JsonProperty("create_date")
 private Integer createDate;
 /**
 *Get a Treasury's Comments
 */
 @JsonIgnore
 public static void findTreasuryComments(String treasuryKey){EtsyService.getService("/treasuries/"+treasuryKey+"/comments");}
 /**
 *Leave a comment on a Treasury List
 */
 @JsonIgnore
 public void postTreasuryComment(String treasuryKey){EtsyService.postService("/treasuries/"+treasuryKey+"/comments", this);}
 /**
 *Delete a given comment on a Treasury List
 */
 @JsonIgnore
 public static void deleteTreasuryComment(String treasuryKey){EtsyService.deleteService("/treasuries/"+treasuryKey+"/comments/:comment_id");}
}
