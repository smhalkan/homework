package Abstract;

import Entities.Customer;
import Entities.Games;

public abstract class BaseCampaignManager implements CampaignService {
	
	@Override
	public void campaignAdd(Games games, Customer customer) {
		System.out.println(games.getGameName()+ " adlý oyun" + customer.getFirstName() + " tarafýndan % " + games.getDiscount() + "indirime sunuldu.");
	}
	
	@Override
	public void campaignUpdate(Games games, Customer customer) {
		System.out.println(games.getGameName()+ " adlý oyun" + customer.getFirstName() + " tarafýndan % " + games.getDiscount() + "indirimi düzenlendi");
	}
	
	@Override
	public void campaignDelete(Games games, Customer customer) {
		System.out.println(games.getGameName()+ " adlý oyun" + customer.getFirstName() + " tarafýndan indirimine son verildi. " );
	}
}
