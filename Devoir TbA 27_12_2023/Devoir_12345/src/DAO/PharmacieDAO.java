package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import BDD.DbConnection;
import Metier.Pharmacie;

public class PharmacieDAO implements Dao<Dao>{


	private Connection connection = null;
	private Statement Statement = null;
	private String requete;
	private Pharmacie associer = null;
	private List<Pharmacie> list;
	private  String requette ;
	
	public PharmacieDAO () {
	try {
		connection = DbConnection.getConnection();
		Statement = connection.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}

	@Override
	public Dao getByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	public Pharmacie get(String nom , String emplacement) {
		Pharmacie pharmacie = null;
	    requette = "SELECT * FROM Pharmacie WHERE nom = "+nom+" AND emplacement = "+emplacement;
		System.out.println(requette);
		try {
			
			ResultSet rsultSet = Statement.executeQuery(requette);
			if (rsultSet.next()) {
				pharmacie = new Pharmacie(nom, emplacement);
				System.out.println(pharmacie.toString());
				System.out.println();
			}
			else throw new SQLException();
		} catch (SQLException e) {
			System.out.println("Erreur");
			e.printStackTrace();
		}
		return pharmacie;
	}

	@Override
	public void save(Dao a) {
		 requette = "INSERT INTO Pharmacie(nom,emplacement) VALUES("+a.getnom()+", '"+a.getemplacement()+"')";
			System.out.println(requette);
			try {
				int resultat = Statement.executeUpdate(requette);
				if (resultat != 0) {
					System.out.println("Insertion de la pharmacie"); 

				} else {
					System.out.println("Ereur de l'insertion!!");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Override
	public ArrayList<Pharmacie> getAll() {
		Pharmacie pharmacie = null;
	    requette = "SELECT * FROM pharmacie";
		System.out.println(requette);
		ArrayList<Pharmacie> arrayList = new ArrayList<>();
		try {
			
			ResultSet resultSet = Statement.executeQuery(requette);
			while (resultSet.next()) {
				pharmacie = new Pharmacie(resultSet.getString("nom"), resultSet.getString("emplacement"));
				arrayList.add(associer);
				System.out.println(pharmacie.toString());
			}
		} catch (SQLException e) {
			System.out.println("Erreur !!");
			e.printStackTrace();
		}
		return arrayList;
	}

	@Override
	public void update(Dao a, String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Dao a) {
		requette = "DELETE FROM Pharmacie WHERE nom = " + a.getnom() + "AND idAuteur = " + a.getemplacement();
		System.out.println(requette);
		
		try {
			int resulat = Statement.executeUpdate(requette);
			if (resulat != 0)
				System.out.println("Supression effectuee. ");
			else {
				System.out.println("ERREUR de la supression !!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String getnom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getemplacement() {
		// TODO Auto-generated method stub
		return null;
	}
}