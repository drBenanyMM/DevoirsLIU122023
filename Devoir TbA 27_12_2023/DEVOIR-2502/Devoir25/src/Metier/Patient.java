package Metier;

public class Patient {


		
		private int id;
		private String nom;
		private String prenom;
		private String adresse;
		private int Tel;
		
		public Patient(int id, String nom, String prenom, String adresse, int Tel) {
			super();
			this.id = id;
			this.nom = nom;
			this.prenom = prenom;
			this.adresse = adresse;
			this.Tel = Tel;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}
		

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}


		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		public int getTel() {
			return Tel;
		}

		public void setTel(int Tel) {
			this.Tel = Tel;
		}

		@Override
		public String toString() {
			return "Patient [id=" + id + ", nom=" + nom + ",prenom=" + prenom + " adresse=" + adresse + ", Tel=" + Tel + "]";
		}

	}

