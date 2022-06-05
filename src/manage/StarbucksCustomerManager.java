package manage;

import java.rmi.RemoteException;

import model.Customer;
import service.BaseCustomerManager;
import service.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		_customerCheckService=customerCheckService;
	}

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		if (_customerCheckService.checkIfRealPerson(customer)) {
			save(customer);
		} else {
			System.out.println("Not a valid Person");
		}

	}

}
