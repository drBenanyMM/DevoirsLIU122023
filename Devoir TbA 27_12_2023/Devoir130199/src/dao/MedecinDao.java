package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bdd.DbConnection;
import metier.Medecin;

public class MedecinDao implements Dao<Medecin>{
	
	private Connection connection = null;
	//conteneur de requetes
	private Statement statement =null;
	//requete
	private String requete = null;
	//model
	private Medecin medecin= null;
	
	//initialisation des variables (constructeur)
	public MedecinDao() {
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
	public Medecin get(long id) {
		//requete
				requete ="Select * from Medecin where idM = " + id +";";
				//recuperer le resultat
				try {
					ResultSet rs = statement.executeQuery(requete);
					//stocker le resultat dans le model personne
					rs.next();
					int idM = rs.getInt(1);
					String nomM = rs.getString(2);
					String prenomM = rs.getString(3);
					String specialite = rs.getString(4);
					
					medecin = new Medecin(idM,nomM,prenomM,specialite);
					//afficher la personne
					System.out.println(medecin.toString());
				}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//retour de l'instance personne
				
				return medecin;
				
	}

	@Override
	public List<Medecin> getAll() {
		List<Medecin> liste = new ArrayList<Medecin>();
	      //requete
			requete ="Select * from Medecin";
			//recuperer le resultat
			try {
				ResultSet rs = statement.executeQuery(requete);
				//stocker le resultat dans le model personne
		while(rs.next()) {
			int idM = rs.getInt(1);
			String nomM = rs.getString(2);
			String prenomM = rs.getString(3);
			String specialite = rs.getString(4);
			
			medecin = new Medecin(idM,nomM,prenomM,specialite);
				//ajout de l'objet personne dans liste
				liste.add(medecin);
				System.out.println(medecin.toString());
			
					}
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//retour de l'instance personne
			
			return liste;
	}

	@Override
	public void save(Medecin t) {
		//requete
				requete = "insert into Medecin values(" + t.getIdM() + ",'" + t.getNomM() + "','" + t.getPrenomM() +"','" + t.getSpecialite() + "');";
				//recuperer le resultat
				try {
					int rs = statement.executeUpdate(requete);
					if(rs!=0)
						System.out.println("insertion reussie");
					else
						System.out.println("erreur d'insertion");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	@Override
	public void update(Medecin t, String[] params) {
		//requete
		requete = "update Medecin set idM = " + Integer.parseInt(params[0]) + ",nomM ='"+params[1]+"',prenomM ='"+params[2]+"',specialite ='"+params[3]+"'where idM ="+ t.getIdM()+";" ;
		//recuperer le resultat
		try {
			int rs = statement.executeUpdate(requete);
			if(rs!=0)
				System.out.println("modification reussie");
			else
				System.out.println("erreur de modification");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(Medecin t) {
		//requete
				requete = "delete from Medecin where idM ="+ t.getIdM();
				//recuperer le resultat
				try {
					int rs = statement.executeUpdate(requete);
					if(rs!=0)
						System.out.println("suppression reussie");
					else
						System.out.println("erreur de suppression");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}
	
	public static void main(String[] args) {
		MedecinDao Mdao = new MedecinDao();
		Mdao.save(new Medecin(555,"Ahmed","sidi","medecin general"));
		//Mdao.save(new Medecin(856,"Moctar","Aicha","cardiologue"));
		Mdao.get(555);
		Mdao.getAll();
		
		String[] params={"598","ali","med","neurologue"};
		Mdao.update(Mdao.get(555),params );
		Mdao.getAll();
		Mdao.delete(Mdao.get(598));
		Mdao.getAll();
	}


}
