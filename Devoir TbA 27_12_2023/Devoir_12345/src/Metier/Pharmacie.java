package Metier;

public class Pharmacie {

	private String nom;
	private String emplacement;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmplacement() {
		return emplacement;
	}
	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}
	public Pharmacie(String nom, String emplacement) {
		super();
		this.nom = nom;
		this.emplacement = emplacement;
	}
	@Override
	public String toString() {
		return "Pharmacie [nom=" + nom + ", emplacement=" + emplacement + ", getNom()=" + getNom()
				+ ", getEmplacement()=" + getEmplacement() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
