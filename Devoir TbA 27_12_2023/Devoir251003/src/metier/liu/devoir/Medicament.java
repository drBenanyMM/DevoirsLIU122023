package metier.liu.devoir;

public class Medicament {
	//Donnees
	private int Code;
	private String Nom;
	private String Dosage;
	private double PUnitaire;
	private String StockDispo;
	
	//Constructeurs
	public Medicament() {
		super();
	}

	public Medicament(int code, String nom, String dosage, double pUnitaire, String stockDispo) {
		super();
		this.Code = code;
		this.Nom = nom;
		this.Dosage = dosage;
		this.PUnitaire = pUnitaire;
		this.StockDispo = stockDispo;
	}
	
	//Getters and Setters

	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getDosage() {
		return Dosage;
	}

	public void setDosage(String dosage) {
		Dosage = dosage;
	}

	public double getPUnitaire() {
		return PUnitaire;
	}

	public void setPUnitaire(double pUnitaire) {
		PUnitaire = pUnitaire;
	}

	public String getStockDispo() {
		return StockDispo;
	}

	public void setStockDispo(String stockDispo) {
		StockDispo = stockDispo;
	}
	
	//Methode toString

	@Override
	public String toString() {
		return "Medicament [Code=" + Code + ", Nom=" + Nom + ", Dosage=" + Dosage + ", PUnitaire=" + PUnitaire
				+ ", StockDispo=" + StockDispo + "]";
	}
	
	
	
	
	
	
	
	
	

}
