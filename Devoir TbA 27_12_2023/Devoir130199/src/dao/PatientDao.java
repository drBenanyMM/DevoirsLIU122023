package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import bdd.DbConnection;
import metier.Patient;

public class PatientDao implements Dao<Patient>{
	
	private Connection connection = null;
	//conteneur de requetes
	private Statement statement =null;
	//requete
	private String requete = null;
	//model
	private Patient patient= null;
	
	//initialisation des variables (constructeur)
	public PatientDao() {
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
	public Patient get(long id) {
		return null;
				
	}

	@Override
	public List<Patient> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Patient t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Patient t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Patient t) {
		// TODO Auto-generated method stub
		
	}

}
