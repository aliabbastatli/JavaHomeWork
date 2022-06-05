package manage;

import model.Customer;
import service.CustomerCheckService;


public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
