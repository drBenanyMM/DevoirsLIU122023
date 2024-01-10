package Metier;

public class Medecin {

	private int ID;
	private String nom;
	private String prenom;
	private String specialite;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public Medecin(int iD, String nom, String prenom, String specialite) {
		super();
		ID = iD;
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
	}
	@Override
	public String toString() {
		return "Medecin [ID=" + ID + ", nom=" + nom + ", prenom=" + prenom + ", specialite=" + specialite + ", getID()="
				+ getID() + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + ", getSpecialite()="
				+ getSpecialite() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
