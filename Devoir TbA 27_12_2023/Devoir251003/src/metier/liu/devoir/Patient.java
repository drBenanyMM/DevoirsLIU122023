package metier.liu.devoir;

public class Patient {
	
	//Les donnees
	private int IdPatient;
	private String NomPatient;
	private String PrenomPatient;
	private String Adresse;
	private String TelPatient;
	
	//Constructeurs
	public Patient() {
		super();
	}

	public Patient(int idPatient, String nomPatient, String prenomPatient, String adresse, String telPatient) {
		super();
		IdPatient = idPatient;
		NomPatient = nomPatient;
		PrenomPatient = prenomPatient;
		Adresse = adresse;
		TelPatient = telPatient;
	}
	
	//Getters and Setters

	public int getIdPatient() {
		return IdPatient;
	}

	public void setIdPatient(int idPatient) {
		IdPatient = idPatient;
	}

	public String getNomPatient() {
		return NomPatient;
	}

	public void setNomPatient(String nomPatient) {
		NomPatient = nomPatient;
	}

	public String getPrenomPatient() {
		return PrenomPatient;
	}

	public void setPrenomPatient(String prenomPatient) {
		PrenomPatient = prenomPatient;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getTelPatient() {
		return TelPatient;
	}

	public void setTelPatient(String telPatient) {
		TelPatient = telPatient;
	}
	
	//Methode toString

	@Override
	public String toString() {
		return "Patient [IdPatient=" + IdPatient + ", NomPatient=" + NomPatient + ", PrenomPatient=" + PrenomPatient
				+ ", Adresse=" + Adresse + ", TelPatient=" + TelPatient + "]";
	}
	
	
	
	
	
	
	
	

}
