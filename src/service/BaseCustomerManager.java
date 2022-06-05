package service;

import java.rmi.RemoteException;

import model.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		System.out.println("Saved to db: " + customer.getFirstName());
		
	}
	
}
