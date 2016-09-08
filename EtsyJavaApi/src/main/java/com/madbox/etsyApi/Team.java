package com.madbox.etsyApi;

import java.util.ArrayList;

public class Team {
	private int group_id;
	private String name;
	private int createDate;
	private int updateDate;
	private ArrayList<String> tags;
	/**
	 * @return the group_id
	 */
	public int getGroup_id() {
		return group_id;
	}
	/**
	 * @param group_id the group_id to set
	 */
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the createDate
	 */
	public int getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(int createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the updateDate
	 */
	public int getUpdateDate() {
		return updateDate;
	}
	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(int updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * @return the tags
	 */
	public ArrayList<String> getTags() {
		return tags;
	}
	/**
	 * @param tags the tags to set
	 */
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	/**
	*Returns all Teams
	*/
	public static void findAllTeams(){EtsyService.getService("/teams");}
	/**
	*Returns specified team by ID or team name
	*/
	public static void findTeams(String teamIds){EtsyService.getService("/teams/"+teamIds+"/");}
	/**
	*Returns a list of teams for a specific user
	*/
	public static void findAllTeamsForUser(String userId){EtsyService.getService("/users/"+userId+"/teams");}
}
