package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import bdd.DbConnection;
import metier.Pharmacie;

public class PharmacieDao implements Dao<Pharmacie>{
	
	private Connection connection = null;
	//conteneur de requetes
	private Statement statement =null;
	//requete
	private String requete = null;
	//model
	private Pharmacie pharmacie= null;
	
	//initialisation des variables (constructeur)
	public PharmacieDao() {
		try {
			//une connection a la base de donnees
			connection = DbConnection.getConnection();
			//un conteneur de requete
			statement = connection.createStatement();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Pharmacie get(long id) {
		return null;
				
	}

	@Override
	public List<Pharmacie> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Pharmacie t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Pharmacie t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Pharmacie t) {
		// TODO Auto-generated method stub
		
	}

}
