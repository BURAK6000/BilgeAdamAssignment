package odev19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	String adres = "jdbc:postgresql://localhost:5432/";
	String kullaniciAdi = "postgres";
	String sifre = "root";

	public Connection getConnection(String databaseName) throws SQLException {

		return DriverManager.getConnection(adres + databaseName, kullaniciAdi, sifre);
	}

}
