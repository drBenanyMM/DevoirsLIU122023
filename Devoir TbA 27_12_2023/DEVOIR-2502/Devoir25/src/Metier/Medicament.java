package Metier;

public class Medicament {





	
	private int idCode;
	private int Nom;
	private int Dosage;
	private int Stock;
	
	public Medicament(int idCode, int Nom,int Dosage,int Stock) {
		super();
		this.idCode = idCode;
		this.Nom = Nom;
		this.Dosage = Dosage;
		this.Stock = Stock;
	}

	public int getIdCode() {
		return idCode;
	}

	public void setIdCode(int idCode) {
		this.idCode = idCode;
	}

	public int getNom() {
		return Nom;
	}

	public void setNom(int Nom) {
		this.Nom = Nom;
	}

	public int getDosage() {
		return Dosage;
	}

	public void setDosage(int Dosage) {
		this.Dosage = Dosage;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int Stock) {
		this.Stock = Stock;
	}


	@Override
	public String toString() {
		return "Medicament [idCode=" + idCode + ", Nom=" + Nom + ", Dosage=" + Dosage +", Stock=" + Stock + "]";
	}
	
}
