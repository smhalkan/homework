package Entities;

public class Campaign  {
	private int campaignId;
	private String campaignName;
	
	public Campaign(Games games){

    }
	
	public Campaign(int campaignId, String campaignName, Games games) {
		this.campaignId = campaignId;
		this.campaignName = campaignName;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	

}
