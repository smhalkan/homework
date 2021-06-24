package Abstract;

import Entities.Customer;
import Entities.Games;

public abstract class BaseCampaignManager implements CampaignService {
	
	@Override
	public void campaignAdd(Games games, Customer customer) {
		System.out.println(games.getGameName()+ " adl� oyun" + customer.getFirstName() + " taraf�ndan % " + games.getDiscount() + "indirime sunuldu.");
	}
	
	@Override
	public void campaignUpdate(Games games, Customer customer) {
		System.out.println(games.getGameName()+ " adl� oyun" + customer.getFirstName() + " taraf�ndan % " + games.getDiscount() + "indirimi d�zenlendi");
	}
	
	@Override
	public void campaignDelete(Games games, Customer customer) {
		System.out.println(games.getGameName()+ " adl� oyun" + customer.getFirstName() + " taraf�ndan indirimine son verildi. " );
	}
}
