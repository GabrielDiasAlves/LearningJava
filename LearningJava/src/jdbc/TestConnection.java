package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//You'll have to download the .jar(connector) according to the database you need to work properly and import it into your libs. I used MySQL

public class TestConnection {

	public static void main(String[] args) throws SQLException {

		final String url = "jdbc:mysql://localhost:3307/test_db?useSSL=false"; 
			//"JavaDataBaseConnection:TypeDataBase:IPServer:Port/DataBaseName?useSSl=true/false" - In this case, i use localhost, and isn't necessary
		final String user = "root"; 	//Your DB user
		final String pass = "Siscobr4"; //Password

		Connection connection = DriverManager.getConnection(url, user, pass);
		
		System.out.println("Connection to the Database was successful");
		connection.close();
	} 
}
