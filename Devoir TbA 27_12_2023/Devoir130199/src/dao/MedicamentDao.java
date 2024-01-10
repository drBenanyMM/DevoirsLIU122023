package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import bdd.DbConnection;
import metier.Medicament;

public class MedicamentDao implements Dao<Medicament>{
	
	private Connection connection = null;
	//conteneur de requetes
	private Statement statement =null;
	//requete
	private String requete = null;
	//model
	private Medicament medicament= null;
	
	//initialisation des variables (constructeur)
	public MedicamentDao() {
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
	public Medicament get(long id) {
		return null;
				
	}

	@Override
	public List<Medicament> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Medicament t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Medicament t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Medicament t) {
		// TODO Auto-generated method stub
		
	}

}
