package Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Storage {
	private final String url;
    private final String user;
    private final String password;
    Connection conn = null;
    
    
    public Storage(String url, String user, String password) {
    	this.url = url;
    	this.user = user;
    	this.password = password;
    	connect();
    }
    
	public void connect() {   
	    try {
	        conn = DriverManager.getConnection(url, user, password);
	        System.out.println("Connected to the PostgreSQL server successfully.");
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	public ResultSet query(String query) {
		ResultSet rs = null;
		try (Statement stmt = conn.createStatement()) {
			rs = stmt.executeQuery(query);
			System.out.println(rs.first());
		} catch (SQLException e) {
		      e.printStackTrace();
		      return null;
		}
		return rs;
	}
}


