package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletePerson {

	public static void main(String[] args) throws SQLException {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the cod: ");
		int cod = in.nextInt();

		Connection connection = ConnectionFactory.getConnection();
		//String sql = "DELETE FROM people WHERE cod = ?";
		String sql = "DELETE FROM people WHERE cod > ?";
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setInt(1, cod);

		int count = stmt.executeUpdate();

		if (count > 0) {
			System.out.println("The person was deleted with success!");
			System.out.println("Affected: " + count + " line(s)");
		} else {
			System.out.println("Error: Not found!!");
		}

		connection.close();
		in.close();
	}

}
