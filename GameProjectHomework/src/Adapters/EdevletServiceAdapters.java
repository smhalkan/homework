package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class EdevletServiceAdapters implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return customer.getNationlityId().length()==11;
	}

}
