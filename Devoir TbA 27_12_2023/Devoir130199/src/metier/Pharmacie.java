package metier;

public class Pharmacie {
	
	private String NomPh ;
	private String emplacement ;
	
	
	public Pharmacie(String nomPh, String emplacement) {
		super();
		NomPh = nomPh;
		this.emplacement = emplacement;
	}


	public String getNomPh() {
		return NomPh;
	}


	public void setNomPh(String nomPh) {
		NomPh = nomPh;
	}


	public String getEmplacement() {
		return emplacement;
	}


	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}


	@Override
	public String toString() {
		return "Pharmacie [NomPh=" + NomPh + ", emplacement=" + emplacement + "]";
	}
	

}
