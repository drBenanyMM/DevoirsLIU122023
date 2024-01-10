package metier;

public class medicament {
private int code;
private String Nom;
private String Dosage;
private String PrixParmite;
private String StockDisponible;
public medicament(int code, String nom, String dosage, String prixParmite, String stockDisponible) {
	super();
	this.code = code;
	Nom = nom;
	Dosage = dosage;
	PrixParmite = prixParmite;
	StockDisponible = stockDisponible;
}

public medicament() {
	
}


public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
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
public String getPrixParmite() {
	return PrixParmite;
}
public void setPrixParmite(String prixParmite) {
	PrixParmite = prixParmite;
}
public String getStockDisponible() {
	return StockDisponible;
}
public void setStockDisponible(String stockDisponible) {
	StockDisponible = stockDisponible;
}

@Override
public String toString() {
	return "medicament [code=" + code + ", Nom=" + Nom + ", Dosage=" + Dosage + ", PrixParmite=" + PrixParmite
			+ ", StockDisponible=" + StockDisponible + "]";
}
	
	
}
