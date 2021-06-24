package Concrete;
import Abstract.BaseSellerManager;
import Adapters.SellerServiceAdapters;
import Entities.Customer;
import Entities.Games;

public class SellerCustomerManager extends BaseSellerManager {
    SellerServiceAdapters salesServiceAdapters;

    public SellerCustomerManager(SellerServiceAdapters salesServiceAdapters) {
        this.salesServiceAdapters = salesServiceAdapters;
    }

    @Override
    public void sell(Games games, Customer customer) {
        games.setPrice((int)this.salesServiceAdapters.discountedPrice(games));
        super.sell(games, customer);
    }
}