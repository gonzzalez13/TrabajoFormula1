package logica;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import modelo.Piloto;

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
	
	public Piloto consultaPiloto(String nombre) throws SQLException,ClassNotFoundException {
		String sql="SELECT P.NOMBRE,P.NACIONALIDAD,P.FECHA_NACIMIENTO,P.PALMARES,P.ESTADO,P.BIBLIOGRAFIA,P.PODIOS,P.ESCUDERIA_ID_ESCUDERIA FROM PILOTO P,ESCUDERIA E WHERE P.ESCUDERIA_ID_ESCUDERIA=E.ID_ESCUDERIA AND  P.NOMBRE=?";
		PreparedStatement sentencia=null;
		ResultSet resultado=null;
		Connection conexion=null;
		Piloto piloto=new Piloto();
		
		
		try {
			conexion = createConection();
			sentencia=conexion.prepareStatement(sql);
			sentencia.setString(1, nombre);
			resultado=sentencia.executeQuery();
			
			if (resultado.next()) {
				piloto.setNombre(resultado.getString(1));;
				piloto.setNacionalidad(resultado.getString(2));
				piloto.setFechaNacimiento(resultado.getDate(3));
				piloto.setPalmares(resultado.getString(4));
				piloto.setEstado(resultado.getString(5));
				piloto.setBibliografia(resultado.getString(6));
				piloto.setPodios(resultado.getInt(7));
				piloto.setIdEscuderia(resultado.getLong(8));
				
			}
			
			conexion.commit();
		} catch (SQLException | ClassNotFoundException e) {
			conexion.rollback();
			e.printStackTrace();
			throw e;
		}finally {
			if (resultado != null) {
				try {
						resultado.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
				if (sentencia != null) {
					try {
						sentencia.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			
			disconnect(conexion);
		}
		return piloto;
	}
		
}
