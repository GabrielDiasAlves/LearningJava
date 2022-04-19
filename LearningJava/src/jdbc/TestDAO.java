package jdbc;

public class TestDAO {
	
	public static void main(String[] args) {
		
	DAO dao = new DAO();
	
	String sql = "INSERT INTO people (name) VALUES (?) ";
	System.out.println(dao.insert(sql, "João Teste"));
	System.out.println(dao.insert(sql, "Pedro"));
	System.out.println(dao.insert(sql, "Thiago"));
	
	dao.closeConnection();
	
	}

}
