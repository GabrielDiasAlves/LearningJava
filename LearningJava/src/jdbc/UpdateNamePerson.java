package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateNamePerson {

	public static void main(String[] args) throws SQLException {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the codigo: ");
		int cod = in.nextInt();

		Connection connection = ConnectionFactory.getConnection();
		String sqlSelect = "SELECT cod, name FROM people WHERE cod = ?";
		String sqlUpdate = "UPDATE people SET name = ? WHERE cod = ?";

		PreparedStatement stmt = connection.prepareStatement(sqlSelect);
		stmt.setInt(1, cod);

		ResultSet result = stmt.executeQuery();

		if (result.next()) {
			People p = new People(result.getString(2), result.getInt(1));

			System.out.println("The actual name is: " + p.getName());
			in.nextLine();

			System.out.print("Enter the new name: ");
			String newName = in.nextLine();

			stmt.close();

			if (newName.equals(p.getName())) {
				System.err.println("Error: It's the same name!");
			} else {
				stmt = connection.prepareStatement(sqlUpdate);
				stmt.setInt(2, cod);
				stmt.setString(1, newName);
				stmt.execute();

				System.out.println("The name has been successfully updated");
				stmt.close();
			}
		} else {
			System.out.println("Not found!");
		}

		connection.close();
		in.close();

	}

}
