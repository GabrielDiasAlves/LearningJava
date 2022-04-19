package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultPeopleV2 {
	
	public static void main(String[] args) throws SQLException {
		Scanner in = new Scanner(System.in);
		
		Connection connection = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM people WHERE name like ?";

		System.out.print("Enter the name or letter: ");
		String personSearch = in.nextLine();
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, "%"+personSearch+"%");
		ResultSet result = stmt.executeQuery();

		List<People> person = new ArrayList<>();

		while (result.next()) {
			int cod = result.getInt("cod");
			String name = result.getString("name");
			person.add(new People(name, cod));
		}

		for (People p : person) {
			System.out.println(p.getCod() + " ==> " + p.getName());
		}

		stmt.close();
		connection.close();
		in.close();
	}

}
