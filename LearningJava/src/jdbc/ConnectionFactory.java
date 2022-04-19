package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	public static Connection getConnection() {
		try {
			Properties prop = getProperties();
			final String url = prop.getProperty("database.url");
			final String user = prop.getProperty("database.user");
			final String pass = prop.getProperty("database.pass");

//			final String url = "jdbc:mysql://localhost:3307/course_of_java?allowPublicKeyRetrieval=true&useSSL=false";
//			final String user = "root";
//			final String pass = "TestDB@22#";

			return DriverManager.getConnection(url, user, pass);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}

	private static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String path = "/connection.properties";

		prop.load(ConnectionFactory.class.getResourceAsStream(path));
		return prop;
	}
}
