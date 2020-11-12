package logica;

import java.sql.Connection;
import java.sql.SQLException;

public class Launcher {

	public static void main(String[] args) {
		ConectionHelper connection = new ConectionHelper();
		try {
			Connection c=connection.createConection();
			connection.createConnectionByProperties();
			connection.disconnect(c);
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		} 
	}

}
