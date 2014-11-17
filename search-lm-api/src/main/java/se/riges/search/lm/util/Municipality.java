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
package se.riges.search.lm.util;
import java.util.HashMap;
import java.util.Map;

public class Municipality {
	private static Map<Integer,String> municipalityMap = new HashMap<Integer,String>();
	public Municipality() {
		this.init();
	}
	private void init() {
		municipalityMap.put(2260,"Ånge");
		municipalityMap.put(2262,"Timrå");
		municipalityMap.put(2280,"Härnösand");
		municipalityMap.put(2281,"Sundsvall");
		municipalityMap.put(2282,"Kramfors");
		municipalityMap.put(2283,"Sollefteå");
		municipalityMap.put(2284,"Örnsköldsvik");
	}

	public static Map<Integer,String> getMunicipalityMap() {
		return municipalityMap;
	} 
	
}
