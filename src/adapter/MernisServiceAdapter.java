package adapter;

import java.rmi.RemoteException;

import model.Customer;
import service.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(
				Long.parseLong(customer.getNationalityId()), 
				customer. getFirstName(), 
				customer.getLastName(), 
				1995);
	}
		
}
