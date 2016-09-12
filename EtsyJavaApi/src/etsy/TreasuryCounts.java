package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TreasuryCounts extends EtsyService {
	@JsonProperty("clicks")
	private Integer clicks;
	@JsonProperty("views")
	private Integer views;
	@JsonProperty("shares")
	private Integer shares;
	@JsonProperty("reports")
	private Integer reports;
	/**
	 * @return the clicks
	 */
	public Integer getClicks() {
		return clicks;
	}
	/**
	 * @param clicks the clicks to set
	 */
	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}
	/**
	 * @return the views
	 */
	public Integer getViews() {
		return views;
	}
	/**
	 * @param views the views to set
	 */
	public void setViews(Integer views) {
		this.views = views;
	}
	/**
	 * @return the shares
	 */
	public Integer getShares() {
		return shares;
	}
	/**
	 * @param shares the shares to set
	 */
	public void setShares(Integer shares) {
		this.shares = shares;
	}
	/**
	 * @return the reports
	 */
	public Integer getReports() {
		return reports;
	}
	/**
	 * @param reports the reports to set
	 */
	public void setReports(Integer reports) {
		this.reports = reports;
	}

}
