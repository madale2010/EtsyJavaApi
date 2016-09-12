package etsy;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Team extends EtsyService {
	@JsonProperty("group_id")
	private Integer groupId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("create_date")
	private Integer createDate;
	@JsonProperty("update_date")
	private Integer updateDate;
	@JsonProperty("tags")
	private ArrayList<String> tags;
	/**
	 * @return the group_id
	 */
	public Integer getGroupId() {
		return groupId;
	}
	/**
	 * @param group_id the group_id to set
	 */
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
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
	public Integer getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Integer createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the updateDate
	 */
	public Integer getUpdateDate() {
		return updateDate;
	}
	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Integer updateDate) {
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
	@JsonIgnore
	public static void getAllTeams(){EtsyService.getService("/teams");}
	/**
	*Returns specified team by ID or team name
	*/
	@JsonIgnore
	public static void findTeams(String teamIds){EtsyService.getService("/teams/"+teamIds+"/");}
	/**
	*Returns a list of teams for a specific user
	*/
	@JsonIgnore
	public static void getAllTeamsForUser(String userId){EtsyService.getService("/users/"+userId+"/teams");}
}
