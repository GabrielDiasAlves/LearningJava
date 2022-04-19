package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultPeopleV1 {

	public static void main(String[] args) throws SQLException {

		Connection connection = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM people";

		Statement stmt = connection.createStatement();

		ResultSet result = stmt.executeQuery(sql);

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
	}

}
