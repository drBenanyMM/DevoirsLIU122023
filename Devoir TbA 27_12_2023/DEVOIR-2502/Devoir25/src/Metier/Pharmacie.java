package Metier;

public class Pharmacie {


		
		private int Nom;
		private int Emplacement;
		
		public Pharmacie(int Nom, int Emplacement) {
			super();
			this.Nom = Nom;
			this.Emplacement = Emplacement;
		}

		public int getNom() {
			return Nom;
		}

		public void setNom(int Nom) {
			this.Nom = Nom;
		}

		public int getEmplacement() {
			return Emplacement;
		}

		public void setEmplacement(int Emplacement) {
			this.Emplacement = Emplacement;
		}

		@Override
		public String toString() {
			return "Pharmacie [Nom=" + Nom+ ", Emplacement=" + Emplacement + "]";
		}
		
	}
