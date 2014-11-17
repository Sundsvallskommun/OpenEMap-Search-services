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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.LinkedList;

import org.codehaus.jackson.JsonNode;
import org.junit.Test;

import se.riges.lm.rmi.exceptions.LMAccountException;
import se.riges.lm.rmi.exceptions.LMUnavailableException;
import se.riges.lm.rmi.interfaces.IAddress;
import se.riges.lm.rmi.interfaces.IEstate;
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
 */import se.riges.lm.rmi.interfaces.IPlacename;


import se.riges.search.lm.AddressServiceUtils;

public class TestRMI {
	
	/**
	 * 
	 * Test method for testing validating address
	 */
	@Test
	public void validateAdressRMI() throws MalformedURLException, RemoteException,NotBoundException, LMAccountException {
			
			try {
				TestClient client = new TestClient(null);
				se.riges.lm.rmi.beans.Address address = (se.riges.lm.rmi.beans.Address) client.validateAddress("sundsvall storgatan 11", "Sundsvall");
				
				boolean test1 = "SUNDSVALL VENUS 3".equals(address.getEstateName());
				boolean test2 = "Sundsvall".equals(address.getMunicipality());
				boolean test3 = "220085373".equals(address.getEstateID().toString());
				
				assertTrue("both are identical", test1);
				assertTrue("both are identical", test2);
				assertTrue("both are identical", test3);
			} catch (Exception e) {
				e.printStackTrace();
				fail("error in validateAddressRMI");
			}

		
	}

	@Test
	public void validateEstate() throws MalformedURLException, RemoteException, NotBoundException, LMAccountException {
		try {
			
			TestClient client = new TestClient(null);
			 
			
			se.riges.lm.rmi.beans.Estate validEstate = (se.riges.lm.rmi.beans.Estate)client.validateEstate("SUNDSVALL BACCHUS 11", "sundsvall");
			
			boolean test1 = "SUNDSVALL BACCHUS 11".equals(validEstate.getEstateName());
			boolean test2 = "220044242".equals(validEstate.getEstateID().toString());
			
			assertTrue("both are identical", test1);
			assertTrue("both are identical", test2);

		} catch (Exception e) {
			fail ("error in remote address call");
		}
	}
	
	@Test
	public void validateEstateWrongMunicipality() throws MalformedURLException, RemoteException,NotBoundException, LMAccountException {
		try {
			
			TestClient client = new TestClient(null);
			
			se.riges.lm.rmi.beans.Estate validEstate = (se.riges.lm.rmi.beans.Estate)client.validateEstate("SUNDSVALL BACCHUS 11, sundsvall", "Sundsvall42");

		} catch (LMAccountException | LMUnavailableException x) {
			boolean test1 = x instanceof LMAccountException;
			assertTrue("both are identical", test1);
		}
		
		
	}
	
	@Test
	public void validateManyEstates() throws MalformedURLException, RemoteException, NotBoundException, LMAccountException {
		try {
			
			TestClient client = new TestClient(null);
			 
			
			se.riges.lm.rmi.beans.Estate validEstate = (se.riges.lm.rmi.beans.Estate)client.validateEstate("GRANLO", "sundsvall");
			
			boolean test1 = validEstate == null;
			
			assertTrue("both are identical", test1);

		} catch (Exception e) {
			fail ("error in remote address call");
		}
	}
	
	@Test
	public void validateShortEstates() throws MalformedURLException, RemoteException, NotBoundException, LMAccountException {
		try {
			
			TestClient client = new TestClient(null);
			 
			
			se.riges.lm.rmi.beans.Estate validEstate = (se.riges.lm.rmi.beans.Estate)client.validateEstate("Fröst 8:", "sundsvall");
			
			boolean test1 = validEstate == null;
			
			assertTrue("both are identical", test1);

		} catch (Exception e) {
			fail ("error in remote address call");
		}
	}
	
	@Test
	public void validateShortAddresses() throws MalformedURLException, RemoteException, NotBoundException, LMAccountException {
		try {
			
			TestClient client = new TestClient(null);
			 
			
			se.riges.lm.rmi.beans.Address validAdress = (se.riges.lm.rmi.beans.Address)client.validateAddress("Sundsvall", "sundsvall");
			
			boolean test1 = validAdress == null;
			
			assertTrue("both are identical", test1);

		} catch (Exception e) {
			fail ("error in remote address call");
		}
	}
	
	@Test
	public void validateWrongEstate() throws MalformedURLException, RemoteException, NotBoundException, LMAccountException {
		try {
			
			TestClient client = new TestClient(null);
			 
			
			se.riges.lm.rmi.beans.Estate validEstate = (se.riges.lm.rmi.beans.Estate)client.validateEstate("Frössst 8:", "sundsvall");
			
			boolean test1 = validEstate == null;
			
			assertTrue("both are identical", test1);

		} catch (Exception e) {
			fail ("error in remote address call");
		}
	}
	
	@Test
	public void validateGetPlacename() throws MalformedURLException, RemoteException, NotBoundException, LMAccountException {
		try {
			
			TestClient client = new TestClient(1100);
			 
			LinkedList<IPlacename> place = client.getPlaceName(2281,"Ortvik","sundsvall");
						
			boolean test1 = place.size() == 1;
			
			assertTrue("size is 0", test1);

		} catch (Exception e) {
			fail ("error in remote address call");
		}
	}
	
	@Test
	public void validateGetAdress() {
		 try {
			 
			 TestClient client = new TestClient(1100);
			 
			 LinkedList<IAddress> address = client.getAddress("sundsvall Riddarga", "Sundsvall");
			
		
			 boolean test2 = "Riddargatan".equals(address.get(0).getAdress_area());
			 
				
				assertTrue("both are identical", test2);
				
			} catch (Exception e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				fail("Not yet implemented");
				
			}
	
	}
	@Test
	public void validateGetEstates() {
		 try {
			 
			 TestClient client = new TestClient(1100);
			 
			 LinkedList<IEstate> estates = client.getEstate("Sundsvall Fröst 8:", "sundsvall");
			
		
			 boolean test1 = "SUNDSVALL FRÖST 8:1".equals(estates.get(0).getEstateName());
			 
				
				assertTrue("both are identical", test1);
				
			} catch (Exception e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				fail("Not yet implemented");
			}
	
	}
}
