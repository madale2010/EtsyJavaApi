package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class TreasuryCounts {
	private int clicks;
	private int views;
	private int shares;
	private int reports;
	/**
	 * @return the clicks
	 */
	public int getClicks() {
		return clicks;
	}
	/**
	 * @param clicks the clicks to set
	 */
	public void setClicks(int clicks) {
		this.clicks = clicks;
	}
	/**
	 * @return the views
	 */
	public int getViews() {
		return views;
	}
	/**
	 * @param views the views to set
	 */
	public void setViews(int views) {
		this.views = views;
	}
	/**
	 * @return the shares
	 */
	public int getShares() {
		return shares;
	}
	/**
	 * @param shares the shares to set
	 */
	public void setShares(int shares) {
		this.shares = shares;
	}
	/**
	 * @return the reports
	 */
	public int getReports() {
		return reports;
	}
	/**
	 * @param reports the reports to set
	 */
	public void setReports(int reports) {
		this.reports = reports;
	}

}
