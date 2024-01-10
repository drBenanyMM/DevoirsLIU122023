package metier;

public class Patient {

	private int idP;
	private String nomP;
	private String prenomP;
	private String adresse;
	private int telephone;
	
	public Patient(int idP, String nomP, String prenomP, String adresse, int telephone) {
		super();
		this.idP = idP;
		this.nomP = nomP;
		this.prenomP = prenomP;
		this.adresse = adresse;
		this.telephone = telephone;
	}

	public int getIdP() {
		return idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}

	public String getNomP() {
		return nomP;
	}

	public void setNomP(String nomP) {
		this.nomP = nomP;
	}

	public String getPrenomP() {
		return prenomP;
	}

	public void setPrenomP(String prenomP) {
		this.prenomP = prenomP;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Patient [idP=" + idP + ", nomP=" + nomP + ", prenomP=" + prenomP + ", adresse=" + adresse
				+ ", telephone=" + telephone + "]";
	}
	
	
}
