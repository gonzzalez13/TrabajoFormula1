package logica;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import modelo.Escuderia;
import modelo.GranPremio;
import modelo.Noticia;
import modelo.Usuario;
import modelo.Piloto;

public class ConectionHelper {

	public ConectionHelper() {
	}

	@SuppressWarnings("finally")
	public Connection createConection() throws SQLException, ClassNotFoundException {

		Connection c = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/f1?serverTimezone=UTC", "root", "root");

			// set autocommit falseS
			c.setAutoCommit(false);
			System.out.println("Connection successful");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			return c;
		}

	}

	@SuppressWarnings("finally")
	public Connection createConnectionByProperties() throws SQLException, ClassNotFoundException {
		Connection c = null;
		try {
			// leer fichero propiedades
			Properties p = new Properties();
			p.load(new FileReader("properties" + File.separator + "db.properties"));
			String driver = p.getProperty("database.driver");
			String url = p.getProperty("database.url");
			String usuario = p.getProperty("database.user");
			String password = p.getProperty("database.password");
			Class.forName(driver);
			c = DriverManager.getConnection(url, usuario, password);

			// set autocommit false
			c.setAutoCommit(false);
			System.out.println("Connection successful");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			return c;
		}
	}

	public void disconnect(Connection c) throws SQLException {
		if (c != null) {
			try {
				c.close();
				c = null;
				System.out.println("Connection closed successful");
			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			}

		}
	}

	public Piloto  consultaPiloto(String nombre) throws SQLException,ClassNotFoundException {
		String sql="SELECT  P.NOMBRE,P.NACIONALIDAD,P.FECHA_NACIMIENTO,P.PALMARES,P.ESTADO,P.BIBLIOGRAFIA,P.PODIOS,P.FOTO_ESCUDERIA,P.FOTO_PERFIL,P.ESCUDERIA_ID_ESCUDERIA , P.ID_PILOTO FROM PILOTO P,ESCUDERIA E WHERE P.ESCUDERIA_ID_ESCUDERIA=E.ID_ESCUDERIA AND  P.NOMBRE=?";
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
				piloto.setNombre(resultado.getString("NOMBRE"));;
				piloto.setNacionalidad(resultado.getString("NACIONALIDAD"));
				piloto.setFechaNacimiento(resultado.getDate("FECHA_NACIMIENTO"));
				piloto.setPalmares(resultado.getString("PALMARES"));
				piloto.setEstado(resultado.getString("ESTADO"));
				piloto.setBibliografia(resultado.getString("BIBLIOGRAFIA"));
				piloto.setPodios(resultado.getInt("PODIOS"));
				piloto.setFoto_escuderia(resultado.getString("FOTO_ESCUDERIA"));
				piloto.setFoto_perfil(resultado.getString("FOTO_PERFIL"));
				piloto.setIdEscuderia(resultado.getLong("ESCUDERIA_ID_ESCUDERIA"));
				piloto.setIdPiloto(resultado.getLong("ID_PILOTO"));
				
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

	public ArrayList<Piloto> consultaPilotoId(long id) throws SQLException,ClassNotFoundException {
		String sql="SELECT  P.NOMBRE,P.NACIONALIDAD,P.FECHA_NACIMIENTO,P.PALMARES,P.ESTADO,P.BIBLIOGRAFIA,P.PODIOS,P.ESCUDERIA_ID_ESCUDERIA , P.ID_PILOTO FROM PILOTO P,ESCUDERIA E WHERE P.ESCUDERIA_ID_ESCUDERIA=E.ID_ESCUDERIA AND  E.ID_ESCUDERIA=?";
		PreparedStatement sentencia=null;
		ResultSet resultado=null;
		Connection conexion=null;
		ArrayList <Piloto> pilotos =new ArrayList<>();
		
		
		try {
			conexion = createConection();
			sentencia=conexion.prepareStatement(sql);
			sentencia.setLong(1, id);
			resultado=sentencia.executeQuery();
			
			while (resultado.next()) {
				Piloto piloto=new Piloto();
				piloto.setNombre(resultado.getString(1));;
				piloto.setNacionalidad(resultado.getString(2));
				piloto.setFechaNacimiento(resultado.getDate(3));
				piloto.setPalmares(resultado.getString(4));
				piloto.setEstado(resultado.getString(5));
				piloto.setBibliografia(resultado.getString(6));
				piloto.setPodios(resultado.getInt(7));
				piloto.setIdEscuderia(resultado.getLong(8));
				piloto.setIdPiloto(resultado.getLong(9));
				
				pilotos.add(piloto);
				
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
		return pilotos;
	}

	public ArrayList<Piloto> consultaTPiloto() throws SQLException, ClassNotFoundException {
		String sql = "SELECT  P.NOMBRE,P.NACIONALIDAD,P.FECHA_NACIMIENTO,P.PALMARES,P.ESTADO,P.BIBLIOGRAFIA,P.PODIOS,P.ESCUDERIA_ID_ESCUDERIA , P.ID_PILOTO ,P.MEDIA FROM PILOTO P";
		Statement sentencia = null;
		ResultSet resultado = null;
		Connection conexion = null;
		ArrayList<Piloto> pilotos = new ArrayList<>();

		try {
			conexion = createConection();
			sentencia = conexion.createStatement();
			resultado = sentencia.executeQuery(sql);

			while (resultado.next()) {
				Piloto piloto = new Piloto();
				piloto.setNombre(resultado.getString(1));
				piloto.setNacionalidad(resultado.getString(2));
				piloto.setFechaNacimiento(resultado.getDate(3));
				piloto.setPalmares(resultado.getString(4));
				piloto.setEstado(resultado.getString(5));
				piloto.setBibliografia(resultado.getString(6));
				piloto.setPodios(resultado.getInt(7));
				piloto.setIdEscuderia(resultado.getLong(8));
				piloto.setIdPiloto(resultado.getLong(9));
				piloto.setMedia(resultado.getInt(10));
				pilotos.add(piloto);

			}

			conexion.commit();
		} catch (SQLException | ClassNotFoundException e) {
			conexion.rollback();
			e.printStackTrace();
			throw e;
		} finally {
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
		return pilotos;
	}

	public Escuderia selectEscuderia(long id) throws SQLException, ClassNotFoundException {
		String sql = "SELECT E.ID_ESCUDERIA,E.NOMBRE,E.COLOR,E.NACIONALIDAD,E.PALMARES,E.SEDE,E.JEFE_EQUIPO,E.JEFE_TECNICO,E.ESTRENADA_F1,E.FOTO_ESCUDERIA,E.FOTO_PILOTO1,E.FOTO_PILOTO2 FROM ESCUDERIA E WHERE E.ID_ESCUDERIA=? ";

		PreparedStatement sentencia = null;
		ResultSet resultado = null;
		Escuderia escuderia = new Escuderia();
		Connection conexion = null;

		try {
			conexion = createConection();
			sentencia = conexion.prepareStatement(sql);
			sentencia.setLong(1, id);
			resultado = sentencia.executeQuery();

			if (resultado.next()) {
				escuderia.setIdEscuderia(resultado.getLong("ID_ESCUDERIA"));
				escuderia.setNombre(resultado.getString("NOMBRE"));
				escuderia.setColor(resultado.getString("COLOR"));
				escuderia.setNacionalidad(resultado.getString("NACIONALIDAD"));
				escuderia.setPalmares(resultado.getString("PALMARES"));
				escuderia.setSede(resultado.getString("SEDE"));
				escuderia.setjEquipo(resultado.getString("JEFE_EQUIPO"));
				escuderia.setjTecnico(resultado.getString("JEFE_TECNICO"));
				escuderia.setEstrenadaF1(resultado.getString("ESTRENADA_F1"));
				escuderia.setFoto_escuderia(resultado.getString("FOTO_ESCUDERIA"));
				escuderia.setFoto_piloto1(resultado.getString("FOTO_PILOTO1"));
				escuderia.setFoto_piloto2(resultado.getString("FOTO_PILOTO2"));

			}

			conexion.commit();
		} catch (SQLException | ClassNotFoundException e) {
			conexion.rollback();
			e.printStackTrace();
			throw e;
		} finally {
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
		return escuderia;
	}

	public GranPremio consultaGranPremio(String circuito) throws SQLException, ClassNotFoundException {
		String sql = "SELECT NOMBRE,CIRCUITO,A�O_PRIMER_GP,LONGITUD,DISTANCIA_GP,CURVAS,VUELTAS FROM GRAN_PREMIO WHERE CIRCUITO=?";
		PreparedStatement sentencia = null;
		ResultSet resultado = null;
		Connection conexion = null;
		GranPremio granpremio = new GranPremio();

		try {
			conexion = createConection();
			sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, circuito);
			resultado = sentencia.executeQuery();

			if (resultado.next()) {
				granpremio.setNombre(resultado.getString("NOMBRE"));
				granpremio.setCircuito(resultado.getString("CIRCUITO"));
				granpremio.setA�os_primer_gp(resultado.getInt("A�O_PRIMER_GP"));
				granpremio.setLongitud(resultado.getInt("LONGITUD"));
				granpremio.setDistancia_gp(resultado.getInt("DISTANCIA_GP"));
				granpremio.setCurvas(resultado.getInt("CURVAS"));
				granpremio.setVueltas(resultado.getInt("VUELTAS"));
			}

			conexion.commit();
		} catch (SQLException | ClassNotFoundException e) {
			conexion.rollback();
			e.printStackTrace();
			throw e;
		} finally {
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
		return granpremio;
	}

	public ArrayList<GranPremio> consultaPremios() throws SQLException, ClassNotFoundException {
		String sql = "SELECT NOMBRE,A�O_PRIMER_GP,CIRCUITO,LONGITUD,DISTANCIA_GP,CURVAS,VUELTAS FROM GRAN_PREMIO";
		Statement sentencia = null;
		ResultSet resultado = null;
		Connection conexion = null;
		ArrayList<GranPremio> premios = new ArrayList<GranPremio>();

		try {
			conexion = createConection();
			sentencia = conexion.createStatement();
			resultado = sentencia.executeQuery(sql);

			while (resultado.next()) {
				GranPremio granpremio = new GranPremio();
				granpremio.setNombre(resultado.getString("NOMBRE"));
				granpremio.setCircuito(resultado.getString("CIRCUITO"));
				granpremio.setA�os_primer_gp(resultado.getInt("A�O_PRIMER_GP"));
				granpremio.setLongitud(resultado.getInt("LONGITUD"));
				granpremio.setDistancia_gp(resultado.getInt("DISTANCIA_GP"));
				granpremio.setCurvas(resultado.getInt("CURVAS"));
				granpremio.setVueltas(resultado.getInt("VUELTAS"));

				premios.add(granpremio);

			}

			conexion.commit();
		} catch (SQLException | ClassNotFoundException e) {
			conexion.rollback();
			e.printStackTrace();
			throw e;
		} finally {
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
		return premios;
	}

	public ArrayList<Noticia> consultaNoticia() throws SQLException, ClassNotFoundException {
		String sql = "SELECT TITULO,CUERPO FROM NOTICIA";
		Statement sentencia = null;
		ResultSet resultado = null;
		Connection conexion = null;
		ArrayList<Noticia> noticias = new ArrayList<Noticia>();

		try {
			conexion = createConection();
			sentencia = conexion.createStatement();
			resultado = sentencia.executeQuery(sql);

			while (resultado.next()) {
				Noticia noticia = new Noticia();

				noticia.setTitulo(resultado.getString("TITULO"));
				noticia.setCuerpo(resultado.getString("CUERPO"));

				noticias.add(noticia);
			}

			conexion.commit();
		} catch (SQLException | ClassNotFoundException e) {
			conexion.rollback();
			e.printStackTrace();
			throw e;
		} finally {
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
		return noticias;
	}

	public Usuario consultaUser(String nombre,String pass) throws SQLException, ClassNotFoundException {
		String sql = "SELECT * FROM USUARIO WHERE NOMBRE=? AND PASSWORD=?";
		PreparedStatement sentencia = null;
		ResultSet resultado = null;
		Connection conexion = null;
		Usuario user=new Usuario();
		try {
			conexion = createConection();
			sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, nombre);
			sentencia.setString(2, pass);
			resultado = sentencia.executeQuery();

			if (resultado.next()) {
				user.setNombre(resultado.getString("NOMBRE"));
				user.setPassword(resultado.getString("PASSWORD"));
				user.setAdmin(resultado.getBoolean("ADMIN"));
			}

			conexion.commit();
		} catch (SQLException | ClassNotFoundException e) {
			conexion.rollback();
			e.printStackTrace();
			throw e;
		} finally {
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
		return user;
	}
	
	public void insertEmpleado(String TITULO,String CUERPO) throws SQLException, ClassNotFoundException {
		 String INSERT_Noticias = "INSERT INTO NOTICIA (TITULO,CUERPO) VALUES (?,?)";
		 
		Connection conexion = null; 
		PreparedStatement sentencia = null;
		try {
			conexion = createConection();
			
			sentencia = conexion.prepareStatement(INSERT_Noticias);
			sentencia.setString(1, TITULO);
			sentencia.setString(2, CUERPO);
			
			sentencia.executeUpdate();
			conexion.commit();
		} catch (SQLException  e) {
			conexion.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			if (sentencia != null) {
				try {
					sentencia.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

			disconnect(conexion);
		}
	}
	

}
