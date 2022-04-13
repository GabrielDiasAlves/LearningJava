package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() {
		try {
			final String url = "jdbc:mysql://localhost:3307/mysql_db?allowPublicKeyRetrieval=true&useSSL=false";
			final String user = "root";
			final String pass = "TestDB@22#";

			return DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
