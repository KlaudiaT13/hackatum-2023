package Backend;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BackendTestMain {
	private static final String url = "jdbc:postgresql://localhost/postgres";
    private static final String user = "postgres";
    private static final String password = "721126";
    public static Connection conn = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		connect();
		String query = "select ID from service_provider_profile where city = 'Boscofort'";
		try (Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery(query);
			System.out.println(rs.first());
			
		} catch (SQLException e) {
		      System.out.println(e);
		    }
	}
	
	 public static Connection connect() {    
	        try {
	            conn = DriverManager.getConnection(url, user, password);
	            System.out.println("Connected to the PostgreSQL server successfully.");
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }

	        return conn;
	    }

}
