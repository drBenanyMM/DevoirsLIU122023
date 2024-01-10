package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Bdd.DBConnection;
import metier.medicament;





public class medicamentDao implements Dao<medicament> {
	
	

	private Connection conn = null;

	public medicamentDao() {
		try {
			conn = DBConnection.getInstance().getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//get
@Override
public medicament get(long id) {
	medicament medicament = null;
String requet = "SELECT * FROM medicament WHERE code = " + (int) id;
System.out.println(requet);
try {
Statement pstm = conn.createStatement();
ResultSet rs = pstm.executeQuery(requet);
if (rs.next()) {
int code = rs.getInt("code");
String Nom = rs.getString("Nom");
String Dosage = rs.getString("Dosage");
String PrixParmite = rs.getString("PrixParmite");
String StockDisponible = rs.getString("StockDisponible");



medicament = new medicament(code, Nom, Dosage, PrixParmite, StockDisponible);
System.out.println(medicament.toString());
System.out.println();
}
else throw new SQLException();
} catch (SQLException e) {
System.out.println("Erreur SQL... element introuvable");
e.printStackTrace();
}
return medicament;	
}


//get all

@Override
public List<medicament> getAll() {
	// TODO Auto-generated method stub
	medicament medicament = null;
	ArrayList<medicament> arrayList = new ArrayList<>();
	String requet = "SELECT * FROM medicament";
	System.out.println(requet);
	try {
		Statement pstm = conn.createStatement();
		ResultSet rs = pstm.executeQuery(requet);
		if (rs.next())
			do {
				int code = rs.getInt("code");
				String Nom = rs.getString("Nom");
				String Dosage = rs.getString("Dosage");
				String PrixParmite = rs.getString("PrixParmite");
				String StockDisponible = rs.getString("StockDisponible");
				
				medicament = new medicament(code, Nom, Dosage, PrixParmite, StockDisponible);
				arrayList.add(medicament);
				System.out.println(medicament.toString());
			} while (rs.next());
		else throw new SQLException();
	} catch (SQLException e) {
		System.out.println("Erreur SQL... elements introuvables");
		e.printStackTrace();
	}
	return arrayList;
}
	
	//save

public void save(medicament medicament) {
	String requet = "INSERT INTO medicament(code, Nom, Dosage, PrixParmite, StockDisponible)"
			+ "VALUES('"+ medicament.getCode() + "', '" + medicament.getNom() +"', '"+ medicament.getDosage() + "','"+ medicament.getPrixParmite() + "','"
			+ medicament.getStockDisponible() +"')";
	System.out.println(requet);
	try {
		Statement pstm = conn.createStatement();
		int rs = pstm.executeUpdate(requet);
		if (rs > 0)
			System.out.println("\tmedicament enregistre !\n");
		else
			throw new SQLException();
	} catch (SQLException e) {
		System.out.println("Erreur SQL... enregistrement echoue");
		e.printStackTrace();
	}

}
	
	
	
// 
	
@Override
public void update(medicament medicament, String[] params) {
	String requet = "UPDATE medicament SET " + "Nom='" + params[0] + "' " + "WHERE code = "
			+ medicament.getCode() + ";";
	System.out.println(requet);
	try {
		Statement pstm = conn.createStatement();
		int rs = pstm.executeUpdate(requet);
		if (rs > 0)
			System.out.println("\tmedicament modifie !\n");
		else
			throw new SQLException();
	} catch (SQLException e) {
		System.out.println("Erreur SQL... modification echouee");
		e.printStackTrace();
	}

}
	

//delete
@Override
public void delete(medicament medicament) {
	String requet = "DELETE FROM medicament WHERE code = " + medicament.getCode() + "";
	System.out.println(requet);
	try {
		Statement pstm = conn.createStatement();
		int rs = pstm.executeUpdate(requet);
		if (rs > 0)
			System.out.println("\tmedicament supprime !\n");
		else
			throw new SQLException();
	} catch (SQLException e) {
		System.out.println("Erreur SQL... suppression echouee");
		e.printStackTrace();
	}

}
	
	//main

public static void main(String[] args) {
	System.out.println("Test de methode select by id");
	new medicamentDao().get(1);// get by id
	
	System.out.println("Test de methode insertion");
	new medicamentDao().save(new medicament( 2, "cliniqu", "dosage", "cinque cent Mru", "stock"));

	System.out.println("Test de methode update");
	String[] params= {"salima"};
	new medicamentDao().update(new medicamentDao().get(2), params);
	
	//System.out.println("Test de methode delete");
	//new medicamentDao().delete(new medicamentDao().get(1));
	
	System.out.println("Test de methode select * all ");
	new medicamentDao().getAll();
	
	
	
	
}}
