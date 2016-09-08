package com.madbox.etsyApi;

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
 public static void postTreasuryComment(String treasuryKey){EtsyService.postService("/treasuries/"+treasuryKey+"/comments");}
 /**
 *Delete a given comment on a Treasury List
 */
 public static void deleteTreasuryComment(String treasuryKey){EtsyService.deleteService("/treasuries/"+treasuryKey+"/comments/:comment_id");}
}
