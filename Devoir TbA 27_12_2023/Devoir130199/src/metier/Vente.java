package metier;

import java.sql.Date;

public class Vente {

	private int NumTransaction;
	private Date dateVente;
	private String montant;
	private String NomPh;
	
	
	public Vente(int numTransaction, Date dateVente, String montant, String nomPh) {
		super();
		NumTransaction = numTransaction;
		this.dateVente = dateVente;
		this.montant = montant;
		NomPh = nomPh;
	}


	public int getNumTransaction() {
		return NumTransaction;
	}


	public void setNumTransaction(int numTransaction) {
		NumTransaction = numTransaction;
	}


	public Date getDateVente() {
		return dateVente;
	}


	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}


	public String getMontant() {
		return montant;
	}


	public void setMontant(String montant) {
		this.montant = montant;
	}


	public String getNomPh() {
		return NomPh;
	}


	public void setNomPh(String nomPh) {
		NomPh = nomPh;
	}


	@Override
	public String toString() {
		return "Vente [NumTransaction=" + NumTransaction + ", dateVente=" + dateVente + ", montant=" + montant
				+ ", NomPh=" + NomPh + "]";
	}
	
	

}
