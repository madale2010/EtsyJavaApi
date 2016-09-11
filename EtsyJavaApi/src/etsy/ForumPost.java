package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ForumPost {
 public int threadId;
 public int postId;
 public String post;
 public String userId;
 public int lastEditTime;
 public int createDate;
 /**
 *Get a Treasury's Comments
 */
 public static void findTreasuryComments(String treasuryKey){EtsyService.getService("/treasuries/"+treasuryKey+"/comments");}
 /**
 *Leave a comment on a Treasury List
 */
 public void postTreasuryComment(String treasuryKey){EtsyService.postService("/treasuries/"+treasuryKey+"/comments", this);}
 /**
 *Delete a given comment on a Treasury List
 */
 public static void deleteTreasuryComment(String treasuryKey){EtsyService.deleteService("/treasuries/"+treasuryKey+"/comments/:comment_id");}
}
