import Abstract.BaseCampaignManager;
import Abstract.BaseCustomerManager;
import Abstract.BaseSellerManager;
import Adapters.EdevletServiceAdapters;
import Concrete.CampainingManager;
import Concrete.GamerCustomerManager;
import Concrete.SellerCustomerManager;
import Adapters.SellerServiceAdapters;
import Entities.Gamer;
import Entities.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        BaseCustomerManager baseCustomerManager=new GamerCustomerManager(new EdevletServiceAdapters());
        BaseCampaignManager baseCampaignManager=new CampainingManager(new SellerServiceAdapters());
        BaseSellerManager baseSellerManager=new SellerCustomerManager(new SellerServiceAdapters());
        Gamer gamer=new Gamer(1, "Semih" , "Alkan", "smhalkan89@gmail.com", "12345678901",LocalDate.of(1989,9,21), "smhalkan");
        Seller seller=new Seller(2, "Selim" , "Alkan", "slmalkan@gmail.com", "12345678902",LocalDate.of(1995,10,28),123);
        Games game1=new Games("Pubg", 100, 10);
        Games game2=new Games("GTA V", 250,20);
        baseCustomerManager.add(gamer);
        baseCustomerManager.delete(gamer);
        baseCustomerManager.update(gamer);
        baseSellerManager.sell(game1,gamer);
        baseSellerManager.sell(game2,gamer);
        baseCampaignManager.campaignAdd(game1,seller);
        baseCampaignManager.campaignUpdate(game1,seller);
        baseCampaignManager.campaignDelete(game1,seller);

    }
}