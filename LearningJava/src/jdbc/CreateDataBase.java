package jdbc;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDataBase {

	public static void main(String[] args) throws SQLException {

		/* First example In this case, you can to repeat the same code of class TestConnection
		 * 
		 * Second example For the second case, you can to use the other class to
		 * "fabricate" your connection with the database
		 */
//	#1
//	final String url = "jdbc:mysql://localhost:3307/mysql_db?allowPublicKeyRetrieval=true&useSSL=false";
//	final String user = "root";
//	final String pass = "TestDB@22#";
//	Connection connection = DriverManager.getConnection(url, user, pass);
//
//	#2
		Connection connection = ConnectionFactory.getConnection();

		Statement stmt = connection.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS course_of_java");

		System.out.println("The DataBase was created with successful");
		connection.close();
	}
}
