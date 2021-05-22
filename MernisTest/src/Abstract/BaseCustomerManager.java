package Abstract;

import Entities.Customer;

// Starbucks ve Nero ayn� metodu kullanac�� i�in bunu Class olarak yaz�yoruz.
// Bu s�n�f Customer Service'ten implemente ederek metodlar�n� alacak.
public abstract class BaseCustomerManager implements CustomerService{

    @Override
    public void save(Customer customer) {
        System.out.println("Save to Database: "+customer.getFirstName());
    }
}