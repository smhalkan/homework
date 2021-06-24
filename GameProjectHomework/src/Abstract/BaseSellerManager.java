package Abstract;

import Entities.Customer;
import Entities.Games;

public abstract class BaseSellerManager implements SellerService{

	@Override
	public void sell(Games games, Customer customer) {
		System.out.println(games.getGameName()+ " isimli oyunu" + customer.getFirstName() + " kiþisi" + games.getPrice() + " fiyatla satýn aldý..!" );		
	}
}
