/*
Copyright Härnösands kommun(C) 2014 

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    All rights reserved. This program and the accompanying materials
    are made available under the terms of the GNU Affero General Public License
    which accompanies this distribution, and is available at
    http://www.gnu.org/licenses/agpl-3.0.html
 */
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
