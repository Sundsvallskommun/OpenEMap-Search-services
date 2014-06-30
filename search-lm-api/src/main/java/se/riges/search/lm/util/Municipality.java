package se.riges.search.lm.util;
import java.util.HashMap;
import java.util.Map;

public class Municipality {
	private static Map<Integer,String> municipalityMap = new HashMap<Integer,String>();
	Municipality() {
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
