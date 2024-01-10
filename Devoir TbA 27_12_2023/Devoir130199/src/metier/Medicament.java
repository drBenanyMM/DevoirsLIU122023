package metier;

public class Medicament {
	
	private int code;
	private String nom;
	private String prix;
	private String stock;
	private String dosage;
	private int idP;
	private int idM;
	private String NomPh ;
	
	public Medicament(int code, String nom, String prix, String stock, String dosage, int idP, int idM, String nomPh) {
		super();
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		this.stock = stock;
		this.dosage = dosage;
		this.idP = idP;
		this.idM = idM;
		NomPh = nomPh;
	}

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

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public int getIdP() {
		return idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}

	public int getIdM() {
		return idM;
	}

	public void setIdM(int idM) {
		this.idM = idM;
	}

	public String getNomPh() {
		return NomPh;
	}

	public void setNomPh(String nomPh) {
		NomPh = nomPh;
	}

	@Override
	public String toString() {
		return "Medicament [code=" + code + ", nom=" + nom + ", prix=" + prix + ", stock=" + stock + ", dosage="
				+ dosage + ", idP=" + idP + ", idM=" + idM + ", NomPh=" + NomPh + "]";
	}
	
	

}
