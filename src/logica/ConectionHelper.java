package logica;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConectionHelper {

	public ConectionHelper() {
	}
	
	

	@SuppressWarnings("finally")
	public Connection createConection() throws SQLException, ClassNotFoundException {
		
		Connection c = null ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/f1?serverTimezone=UTC","root","root");
			
			// set autocommit false
			c.setAutoCommit(false);
			System.out.println("Connection successful");
			
		} catch (ClassNotFoundException |SQLException   e) {
			e.printStackTrace();
			throw e;
		}finally {
			return c;
		}
		
	}
	@SuppressWarnings("finally")
	public Connection createConnectionByProperties() throws SQLException, ClassNotFoundException {
		Connection c = null ;
		try {
			//leer fichero propiedades 
			Properties p =new Properties();
			p.load(new FileReader("properties"+File.separator+"db.properties"));
			String driver = p.getProperty("database.driver");
			String url = p.getProperty("database.url");
			String usuario = p.getProperty("database.user");
			String password = p.getProperty("database.password");
			Class.forName(driver);
			c=DriverManager.getConnection(url,usuario,password);
			
			// set autocommit false
			c.setAutoCommit(false);
			System.out.println("Connection successful");
			
		} catch (ClassNotFoundException |SQLException   e) {
			e.printStackTrace();
			throw e;
		}finally {
			return c;
		}
	}
	public void disconnect(Connection c) throws SQLException {
		if (c!=null) {
			try {
				c.close();
				c=null;
				System.out.println("Connection closed successful");
			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			}
			
		}
	}
		
}
