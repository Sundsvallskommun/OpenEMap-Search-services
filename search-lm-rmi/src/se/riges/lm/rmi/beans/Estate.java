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
/**
 * 
 */


import java.io.Serializable;
import java.rmi.RemoteException;


/**
 * @author Per Fahlén - Sweco Position AB
 *
 */
public class Estate implements se.riges.lm.rmi.interfaces.IEstate, Serializable{

	private static final long serialVersionUID = -8680154513611318582L;
	
	public Estate() throws RemoteException {
		
	}
	
	public Estate(String estateName, String geometry, String municipality, Integer estateID){
		this.estateName = estateName;
		this.geometry = geometry;
		this.municipality = municipality;
		this.estateID = estateID;
	}

	private String estateName, geometry, municipality;
	private Integer estateID;
	
	@Override
	public String getEstateName(){
		return this.estateName;
	}


	@Override
	public Integer getEstateID() {
		return this.estateID;
	}


	@Override
	public String getGeometry() {
		return this.geometry;
	}


	@Override
	public String getMunicipality() {
		return municipality;
	}
}
