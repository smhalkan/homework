package Abstract;

import Entities.Customer;
import Entities.Games;

public interface CampaignService {
	public void campaignAdd(Games games, Customer customer);
	public void campaignUpdate(Games games, Customer customer);
	public void campaignDelete(Games games, Customer customer);
}
