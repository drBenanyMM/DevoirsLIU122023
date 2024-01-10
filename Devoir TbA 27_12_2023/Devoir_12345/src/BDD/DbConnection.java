package BDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	private static final String URL = "jdbc:mysql://localhost:3306/";
	private static final String bdd="gestionbibliotheque";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	private static Connection connection = null;

	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL+bdd, USER, PASSWORD);
			System.out.println("Connecté à la base de donnée ");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return connection;
	}

	public static void main(String[] args) throws SQLException {
		DbConnection.getConnection();
	}
}
