package com.madbox.etsyApi;

public class SegmentPoster {
 public String name;
 public String path;
 public String imageUrl;
 public int shopId;
 public int shopName;
 public int weight;
 public int listingId;
 /**
 *Find Browse SegmentPosters by Segment slug
 */
 public static void findBrowseSegmentPosters(){EtsyService.getService("/segments/posters");}
}
