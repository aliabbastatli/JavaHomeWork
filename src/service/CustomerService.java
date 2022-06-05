package service;

import java.rmi.RemoteException;

import model.Customer;

public interface CustomerService {
		void save(Customer customer) throws NumberFormatException, RemoteException;
}
