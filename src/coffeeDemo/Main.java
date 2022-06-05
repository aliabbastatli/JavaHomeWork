package coffeeDemo;



import java.rmi.RemoteException;

import adapter.MernisServiceAdapter;
import manage.NeroCustomerManager;
import manage.StarbucksCustomerManager;
import model.Customer;
import service.BaseCustomerManager;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"--","--","1995","12345678911"));
	}

}
