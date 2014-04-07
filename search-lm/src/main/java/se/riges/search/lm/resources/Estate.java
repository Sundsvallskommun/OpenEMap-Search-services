package se.riges.search.lm.resources;

public class Estate {
	
	private String estateId, estateName, adress;
	
	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Estate(){}

	public Estate(String estateId, String estateName, String adress) {
		super();
		this.estateId = estateId;
		this.estateName = estateName;
		this.adress = adress;
	}
	
	public String getEstateId() {
		return estateId;
	}

	public void setEstateId(String estateId) {
		this.estateId = estateId;
	}

	public String getEstateName() {
		return estateName;
	}

	public void setEstateName(String estateName) {
		this.estateName = estateName;
	}

}
