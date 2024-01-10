package DAO;

	import BDD.Dbconnection;
	import Metier.Medicin;
	import Metier.Medicament;
	

	import java.sql.*;
	import java.util.ArrayList;
	import java.util.List;

import javax.xml.crypto.Data;

public class MedicamentDAO implements <Medicament> {
		
		private Connection conn;
		public Medicament() {
			try {
				conn = Dbconnection.getInstance().getConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@Override
		public void save(Medicament t) {
			String requet = "INSERT INTO MedicamentDAO(idCode, Nom,Dosage,Stock) VALUES("+t.getIdCode()+", '"+t.getNom()+",'"+t.getDosage()+", '"+t.getStock();
			System.out.println(requet);
			try {
				Statement pstm = conn.createStatement();
				int rs = pstm.executeUpdate(requet);
				if (rs>0)
					System.out.println("\tMedicament enregistre !\n");
				else
					throw new SQLException();
			} catch (SQLException e) {
				System.out.println("Erreur SQL... enregistrement echoue");
				e.printStackTrace();
			}
		}
		
		
		public void delete(Medicament t) {
			String requet = "DELETE FROM Associer WHERE idCode = " + t.getIdCode() + "AND Nom = " + t.getNom()+ "AND Dosage = " + t.getDosage()+ "AND Stock = " + t.getStock();
			System.out.println(requet);
			try {
				Statement pstm = conn.createStatement();
				int rs = pstm.executeUpdate(requet);
				if (rs>0)
					System.out.println("\tAssociation supprim�e !\n");
				else throw new SQLException();
			} catch (SQLException e) {
				System.out.println("Erreur SQL... suppression �chou�e");
				e.printStackTrace();
			}
			
		}

		private String getIdCode() {
			// TODO Auto-generated method stub
			return null;
		}

		public Medicament get(int idCode, int Nom, int Dosage, int Stock) {
			MedicamentDAO Medicament = null;
			String requet = "SELECT * FROM MedicamentDAO WHERE IdCode = "+idCode+" AND Nom = "+Nom +" AND Dosage = " +Dosage + " AND Stock = "+Stock;
			System.out.println(requet);
			try {
				Statement pstm = conn.createStatement();
				ResultSet rs = pstm.executeQuery(requet);
				if (rs.next()) {
					Medicament = new MedicamentDAO();
					System.out.println(MedicamentDAO.toString());
					System.out.println();
				}
				else throw new SQLException();
			} catch (SQLException e) {
				System.out.println("Erreur SQL... element introuvable");
				e.printStackTrace();
			}
			return Medicament;
		}
		
		public Medicament get(long id) {
			return null;
		}
		
		@Override
		public List<Medicament> getAll() {
			return null;
		}
		
	}
