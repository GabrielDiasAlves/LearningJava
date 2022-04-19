package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	private Connection connection;

	private Connection getConnection() {
		try {
			if (connection != null && !connection.isClosed()) {
				return connection;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		connection = ConnectionFactory.getConnection();
		return connection;
	}

	public int insert(String sql, Object... attributes) {
		try {
			PreparedStatement stmt = getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

			insertData(stmt, attributes);

			if (stmt.executeUpdate() > 0) {
				ResultSet result = stmt.getGeneratedKeys();

				if (result.next()) {
					return result.getInt(1);
				}
			}
			return -1;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	private void insertData(PreparedStatement stmt, Object[] attributes) throws SQLException {
		int index = 1;

		for (Object attribute : attributes) {
			if (attribute instanceof String) {
				stmt.setString(index, (String) attribute);
			} else if (attribute instanceof Integer) {
				stmt.setInt(index, (Integer) attribute);
			}

			index++;
		}
	}
	
	public void closeConnection() {
		try {
			getConnection().close();
		} catch (SQLException e) {
			// Nothing
		} finally {
			connection = null;
		}
	}
}
