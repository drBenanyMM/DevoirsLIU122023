package BDD;

import java.sql.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dbconnection {
	public static void main (String[]args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
			System.out.println("Connection etablie");
		
	
			
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Erreur de chargemnt de pilote");
			}
		catch(SQLException e) {
			System.err.println("Erreur de chargement du driver:"+ e);
			
		}
		
		
			
	}}
