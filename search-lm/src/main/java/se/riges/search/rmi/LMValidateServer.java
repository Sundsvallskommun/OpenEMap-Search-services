package se.riges.search.rmi;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;
import java.util.List;

import se.lantmateriet.namespace.distribution.products.address.v2.AdressType;
import se.lantmateriet.namespace.distribution.products.address.v2.FindAdressResponse;
import se.lantmateriet.namespace.distribution.produkter.fastighet.v1.RegisterenhetResponseType;
import se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3.RegisterenhetsreferensType;
import se.riges.lm.rmi.Search;
import se.riges.lm.rmi.ValidateLM;
import se.riges.lm.rmi.beans.Estate;
import se.riges.lm.rmi.exceptions.LMAccountException;
import se.riges.lm.rmi.exceptions.LMUnavailableException;
import se.riges.lm.rmi.interfaces.IAddress;
import se.riges.lm.rmi.interfaces.IEstate;
import se.riges.lm.rmi.interfaces.IPlacename;
import se.riges.search.lm.AddressServiceUtils;
import se.riges.search.lm.FastighetServiceUtils;
import se.riges.search.lm.FreeTextSearch;
import se.riges.search.lm.RegisterServiceUtils;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.PrecisionModel;

/**
 * 
 * @author Per Fahlén - Sweco Position AB
 * 
 *         RMI Server
 */
public class LMValidateServer /*extends UnicastRemoteObject*/ implements ValidateLM, Search {

	public LMValidateServer() throws RemoteException {
//		super(0);
	}

	private static final long serialVersionUID = -6062091501040115160L;

	private GeometryFactory geometryFactory = new GeometryFactory(
			new PrecisionModel(PrecisionModel.FLOATING), 3006);

	private LMValidateServer server;
	private ValidateLM validateServer;
	public LMValidateServer startServer(int rmiPort, String host, String name) throws RemoteException, MalformedURLException, AlreadyBoundException {
		
		server = new LMValidateServer();
		
		validateServer = (ValidateLM)
		UnicastRemoteObject.exportObject(server, rmiPort);
		LocateRegistry.createRegistry(rmiPort).bind(name, validateServer);
		
		return server;
	}

	public void stopServer() throws RemoteException, MalformedURLException, NotBoundException {
		try{
		Naming.unbind("searchlm");
		} catch(Exception x){
		}
	}

	@Override
	public IAddress validateAddress(String address, String municipality) 
			throws RemoteException, LMAccountException, LMUnavailableException, LMAccountException {
		
		se.riges.lm.rmi.beans.Address retAddress = null;
		
		if (address.split(" ").length < 2)
			return retAddress;
		
		AddressServiceUtils adressService = new AddressServiceUtils();
		FastighetServiceUtils fastighetService = new FastighetServiceUtils();
		try {
			FindAdressResponse result = adressService.validateAdress(address, municipality);
			
			List<AdressType> addresses = result.getAdress();
			if (addresses.size() == 0){
				return retAddress;
			}
			else if (addresses.size() > 1){
				return retAddress;
			}
			String estateID = addresses.get(0).getFastighetsnyckel();
			
			RegisterenhetResponseType response = fastighetService.getRegisterenhetByFnr(estateID, municipality);
			
			String registerOmrade = response.getRegisterenhetMember().get(0).getRegisterenhet().getValue().getRegisterbeteckning().getRegisteromrade().trim();
			String trakt = response.getRegisterenhetMember().get(0).getRegisterenhet().getValue().getRegisterbeteckning().getTraktnamn().trim();
			String enhet = response.getRegisterenhetMember().get(0).getRegisterenhet().getValue().getRegisterbeteckning().getBlock().trim();
			String block = Integer.toString(response.getRegisterenhetMember().get(0).getRegisterenhet().getValue().getRegisterbeteckning().getEnhet());

			String estateName = registerOmrade + " " + trakt + " " + block + ("*".equals(enhet) ? "" : ":" + enhet);

			String kommun = addresses.get(0).getKommundelsnamn();

			//retAddress = new se.riges.lm.rmi.beans.Address(estateName, "", kommun, Integer.parseInt(estateID));
			retAddress = new se.riges.lm.rmi.beans.Address(estateName, "", kommun, Integer.parseInt(estateID), "","", "", "","");

		} catch (IOException | LMAccountException e) {
			System.out.println("fel");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return retAddress;
	}

	@Override
	public IEstate validateEstate(String estateName, String municipality) 
			throws RemoteException, LMAccountException, LMUnavailableException {
		Estate retEstate = null;
		
		RegisterServiceUtils registerService = new RegisterServiceUtils();
		FastighetServiceUtils fastighetService = new FastighetServiceUtils();

		try {

			List<RegisterenhetsreferensType> register = registerService.findRegisterbeteckning(estateName, municipality);
			
			if (register.size() == 0){
				return retEstate;
			}
			
			if (register.size() > 1){
				return retEstate;
			}
			String beteckning = register.get(0).getBeteckning();

			String nyckel = register.get(0).getFastighetsnyckel();

			RegisterenhetResponseType registerEnhet = fastighetService.getRegisterenhetByFnr(nyckel, municipality);

			retEstate = new Estate(beteckning, null, null, Integer.parseInt(nyckel));

		} catch (IOException e) {
			e.printStackTrace();
		}
		catch(LMAccountException e){
			e.printStackTrace();
			throw e;
		}
		
		return retEstate;
	}

	@Override
	public IEstate getEstateByCoordinate(double x, double y, String municipaliy) 
			throws RemoteException, LMAccountException, LMUnavailableException {
		com.vividsolutions.jts.geom.Point point = geometryFactory.createPoint(new Coordinate(x, y));

		Estate retEstate = null;
		
		se.lantmateriet.namespace.distribution.produkter.fastighet.v1.RegisterenhetsreferensType register;
		
		FastighetServiceUtils fastighetService = new FastighetServiceUtils();
		
		try {
			register = fastighetService.findRegisterenhet(point, municipaliy);

			String beteckning = register.getBeteckning();
			String nyckel = register.getFastighetsnyckel();
			retEstate = new Estate(beteckning, "", "", Integer.parseInt(nyckel));
			
//			return (Estate) UnicastRemoteObject.exportObject(retEstate, LMValidateServer.objectPort);
			
			return new Estate(beteckning, "", "", Integer.parseInt(nyckel));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public LinkedList<IPlacename> getPlaceName(int municaplityCode,String placename,
			String municaplity) throws RemoteException, LMAccountException,
			LMUnavailableException {
		
		se.riges.search.lm.FreeTextSearch search = new FreeTextSearch();
		return search.getPlaceName(municaplityCode,placename, municaplity);
	}

	@Override
	public LinkedList<IEstate> getEstate(String estate, String municaplity)
			throws RemoteException, LMAccountException, LMUnavailableException {
		se.riges.search.lm.FreeTextSearch search = new FreeTextSearch();
		return search.getEstate(estate, municaplity);
	}

	@Override
	public LinkedList<IAddress> getAddress(String address, String municaplity)
			throws RemoteException, LMAccountException, LMUnavailableException {
		se.riges.search.lm.FreeTextSearch search = new FreeTextSearch();
		return search.getAddress(address, municaplity);
	}
}
