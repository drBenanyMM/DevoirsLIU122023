package Metier;

public class Medicament {

	private int code;
	private String nom;
	private int dose;
	private int ptix;
	private int stock ;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getDose() {
		return dose;
	}
	public void setDose(int dose) {
		this.dose = dose;
	}
	public int getPtix() {
		return ptix;
	}
	public void setPtix(int ptix) {
		this.ptix = ptix;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Medicament(int code, String nom, int dose, int ptix, int stock) {
		super();
		this.code = code;
		this.nom = nom;
		this.dose = dose;
		this.ptix = ptix;
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Medicament [code=" + code + ", nom=" + nom + ", dose=" + dose + ", ptix=" + ptix + ", stock=" + stock
				+ ", getCode()=" + getCode() + ", getNom()=" + getNom() + ", getDose()=" + getDose() + ", getPtix()="
				+ getPtix() + ", getStock()=" + getStock() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
