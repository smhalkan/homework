package Abstract;

import Entities.Customer;

// Interface i�inde default olarak public atand��� i�in "public" yazmaya gerek yoktur.
public interface CustomerService {

    void save(Customer customer);
}