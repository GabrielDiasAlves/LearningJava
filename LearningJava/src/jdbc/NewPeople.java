package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NewPeople {

	public static void main(String[] args) throws SQLException {
		Connection connection = ConnectionFactory.getConnection();
		Scanner in = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = in.nextLine();

		// Don't use insertion in this way, to avoid SQL Injection attacks
		// String sql = "INSERT INTO people (name) VALUES('" + name + "')";

		String sql = "INSERT INTO people (name) VALUES(?)";

		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, name);
		stmt.execute();

		System.out.println("The data was inserted with successful");

		in.close();
	}

}
