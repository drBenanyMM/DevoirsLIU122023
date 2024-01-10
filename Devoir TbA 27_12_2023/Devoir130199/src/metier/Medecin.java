package metier;

public class Medecin {

	private int idM;
	private String nomM;
	private String prenomM;
	private String specialite;
	
	public Medecin(int idM, String nomM, String prenomM, String specialite) {
		super();
		this.idM = idM;
		this.nomM = nomM;
		this.prenomM = prenomM;
		this.specialite = specialite;
	}

	public int getIdM() {
		return idM;
	}

	public void setIdM(int idM) {
		this.idM = idM;
	}

	public String getNomM() {
		return nomM;
	}

	public void setNomM(String nomM) {
		this.nomM = nomM;
	}

	public String getPrenomM() {
		return prenomM;
	}

	public void setPrenomM(String prenomM) {
		this.prenomM = prenomM;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return "Medecin [idM=" + idM + ", nomM=" + nomM + ", prenomM=" + prenomM + ", specialite=" + specialite + "]";
	}
	
	
}
