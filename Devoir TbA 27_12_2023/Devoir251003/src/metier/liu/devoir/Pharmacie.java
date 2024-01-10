package metier.liu.devoir;

public class Pharmacie{
	
	//Les donnees
	private String Nom;
	private String Emplacement;
	
	//Constructeurs
	public Pharmacie() {
		super();
	}

	public Pharmacie(String nom, String emplacement) {
		super();
		Nom = nom;
		Emplacement = emplacement;
	}
	
	//Getters and Setters

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getEmplacement() {
		return Emplacement;
	}

	public void setEmplacement(String emplacement) {
		Emplacement = emplacement;
	}
	

	//Methode toString

	@Override
	public String toString() {
		return "Pharmacie [Nom=" + Nom + ", Emplacement=" + Emplacement + "]";
	}
	
	
	
	
}
