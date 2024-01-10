package Metier;

public class Patient {

	private int ID;
	private String nom;
	private String prenom;
	private String adresse;
	private int numero;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Patient(int iD, String nom, String prenom, String adresse, int numero) {
		super();
		ID = iD;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Patient [ID=" + ID + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", numero="
				+ numero + ", getID()=" + getID() + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ ", getAdresse()=" + getAdresse() + ", getNumero()=" + getNumero() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
