package metier.liu.devoir;

public class Medecin {
	
	//Les donnees
	private int IDMedecin;
	private String NomMedecin;
	private String PrenomMedecin;
	private String Specialite;
	private int IdPatient;
	
	//Constructeurs
	public Medecin() {
		super();
	}

	public Medecin(int iDMedecin, String nomMedecin, String prenomMedecin, String specialite, int idPatient) {
		super();
		this.IDMedecin = iDMedecin;
		this.NomMedecin = nomMedecin;
		this.PrenomMedecin = prenomMedecin;
		this.Specialite = specialite;
		this.IdPatient = idPatient;
	}
	
	//Getters and Setters

	public int getIDMedecin() {
		return IDMedecin;
	}

	public void setIDMedecin(int iDMedecin) {
		IDMedecin = iDMedecin;
	}

	public String getNomMedecin() {
		return NomMedecin;
	}

	public void setNomMedecin(String nomMedecin) {
		NomMedecin = nomMedecin;
	}

	public String getPrenomMedecin() {
		return PrenomMedecin;
	}

	public void setPrenomMedecin(String prenomMedecin) {
		PrenomMedecin = prenomMedecin;
	}

	public String getSpecialite() {
		return Specialite;
	}

	public void setSpecialite(String specialite) {
		Specialite = specialite;
	}

	public int getIdPatient() {
		return IdPatient;
	}

	public void setIdPatient(int idPatient) {
		IdPatient = idPatient;
	}
	
	//Methode toString

	@Override
	public String toString() {
		return "Medecin [IDMedecin=" + IDMedecin + ", NomMedecin=" + NomMedecin + ", PrenomMedecin=" + PrenomMedecin
				+ ", Specialite=" + Specialite + ", IdPatient=" + IdPatient + "]";
	}
	
	
	
	
	
	

}
