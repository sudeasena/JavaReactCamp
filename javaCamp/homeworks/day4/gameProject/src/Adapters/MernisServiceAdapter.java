package Adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = true;
		try {
			result = client.TCKimlikNoDogrula(gamer.getNationalityId(), 
					gamer.getFirstName().toUpperCase(new Locale("tr")), 
					gamer.getLastName().toUpperCase(new Locale("tr")), gamer.getDateOfBirth());
		}catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}