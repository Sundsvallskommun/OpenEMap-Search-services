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
package se.riges.lm.rmi.beans;
import java.io.Serializable;
import java.rmi.RemoteException;


/**
 * 
 * @author Per Fahlén - Sweco Position AB
 * Implementation class for transporting data from RMI server to test method
 */

public class Address implements se.riges.lm.rmi.interfaces.IAddress, Serializable {
	
	private static final long serialVersionUID = -7196675340577718594L;


	public Address() throws RemoteException {
		
	}
	
	public Address(String estateName, String address, String municipality, Integer estateID,String geometry, String sub_municipality,String adress_area,String zipcode, String postadress){
		this.estateID = estateID;
		this.address = address;
		this.municipality = municipality;
		this.estateName = estateName;
		this.geometry= geometry;
		this.sub_municipality = sub_municipality;
		this.adress_area = adress_area;
		this.zipcode= zipcode;
		this.postadress= postadress;
		this.municipality = municipality;
	}

	private String estateName,geometry,sub_municipality,postadress,adress_area, address, municipality,zipcode;
	private Integer estateID;
	
	
	@Override
	public String getEstateName() {
		return this.estateName;
	}


	@Override
	public String getAdress() {
		return this.address;
	}

	
	@Override
	public Integer getEstateID() {
		return this.estateID;
	}

	@Override
	public String getMunicipality() {
		return this.municipality;
	}

	@Override
	public String getPostAdress() {
		// TODO Auto-generated method stub
		return this.postadress;
	}

	@Override
	public String getZipCode() {
		// TODO Auto-generated method stub
		return this.zipcode;
	}

	@Override
	public String getSub_municipality() {
		// TODO Auto-generated method stub
		return this.sub_municipality;
	}
	@Override
	public String getAdress_area() {
		// TODO Auto-generated method stub
		return this.adress_area;
	}

	@Override
	public String getGeometry() {
		// TODO Auto-generated method stub
		return this.geometry;
	}
	

}
