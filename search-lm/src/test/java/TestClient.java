import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.LinkedList;

import se.riges.lm.rmi.Search;
import se.riges.lm.rmi.exceptions.LMAccountException;
import se.riges.lm.rmi.exceptions.LMUnavailableException;
import se.riges.lm.rmi.interfaces.*;

public class TestClient implements se.riges.lm.rmi.ValidateLM, Search {

	private se.riges.lm.rmi.ValidateLM validateLM;

	private Search searchLM;

	public TestClient(Integer port) throws RemoteException, NotBoundException {

		if (port == null) {
			Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1099);

			validateLM = (se.riges.lm.rmi.ValidateLM) registry.lookup("searchlm");
		}
		else{
			Registry registry = LocateRegistry.getRegistry("127.0.0.1", port);
			searchLM = (se.riges.lm.rmi.Search) registry.lookup("search");
		}
	}

	@Override
	public IAddress validateAddress(String address, String municipality)
			throws RemoteException, LMAccountException, LMUnavailableException {

		return validateLM.validateAddress(address, municipality);
	}

	@Override
	public IEstate validateEstate(String estateName, String municipality)
			throws RemoteException, LMAccountException, LMUnavailableException {

		return validateLM.validateEstate(estateName, municipality);
	}

	@Override
	public IEstate getEstateByCoordinate(double x, double y, String municipaliy)
			throws RemoteException, LMAccountException, LMUnavailableException {

		return validateLM.getEstateByCoordinate(x, y, municipaliy);
	}

	@Override
	public LinkedList<IPlacename> getPlaceName(int municaplityCode, String placename,
			String municaplity) throws RemoteException, LMAccountException,
			LMUnavailableException {
		return searchLM.getPlaceName(municaplityCode,placename, municaplity);
	}

	@Override
	public LinkedList<IEstate> getEstate(String estate, String municaplity)
			throws RemoteException, LMAccountException, LMUnavailableException {
		// TODO Auto-generated method stub
		
		return searchLM.getEstate(estate, municaplity);
	}

	@Override
	public LinkedList<IAddress> getAddress(String address, String municaplity)
			throws RemoteException, LMAccountException, LMUnavailableException {
		// TODO Auto-generated method stub
		return searchLM.getAddress(address,municaplity);
	}

}
