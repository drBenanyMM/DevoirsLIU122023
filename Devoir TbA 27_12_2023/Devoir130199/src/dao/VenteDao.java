package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import bdd.DbConnection;
import metier.Vente;

public class VenteDao implements Dao<Vente>{
	
	private Connection connection = null;
	//conteneur de requetes
	private Statement statement =null;
	//requete
	private String requete = null;
	//model
	private Vente vente= null;
	
	//initialisation des variables (constructeur)
	public VenteDao() {
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
	public Vente get(long id) {
		
				return null;
				
	}

	@Override
	public List<Vente> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Vente t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Vente t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Vente t) {
		// TODO Auto-generated method stub
		
	}

}
