package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;

import vista.Inicio;
import modelo.Escuderia;
import modelo.Piloto;

public class Controlador implements ActionListener {
	private Inicio inicio;
	private String salida;
	private ConectionHelper concetion;
	private Piloto piloto;
	private Escuderia escuderia;
	private String ruta;
	
	public Inicio getInicio() {
		return inicio;
	}


	public void setInicio(Inicio inicio) {
		this.inicio = inicio;
	}

	public String getS() {
		return salida;
	}





	@Override
	public void actionPerformed(ActionEvent e) {
	
		System.out.println(e.getActionCommand());
		
		if (salida.equals(e.getActionCommand())) {
			
			
		}else {
			
			switch (e.getActionCommand()) {
		
			case "Escuderias":
				
				salida="Escuderias";
				
				inicio.escuderia(this);
				inicio.setVisible(true);
				
				break;
				
			case "Inicio":
				
				salida="Inicio";
				
				inicio.inicio(this);
				inicio.setVisible(true);
			
			
				break;
			case "Pilotos":
				salida="Pilotos";
				inicio.piloto(this);
				inicio.setVisible(true);
				break;
			case "Daniel Ricciardo":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"ricciardo.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				break;
			
			case "Lewis Hamilton":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"Hamilton.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
				
				break;
			case "Valtteri Bottas":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"bottas.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
				break;
				
			case "Max Verstappen":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"verstappen.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
				break;
			case "Charles Leclerc":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"leclerc.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
				break;
			case "Sergio Perez":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"perez.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
				break;
			case "Lando Norris":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"norris.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
				break;
			case "Carlos Sainz":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"sainz.PNG";
				sacarPiloto("Carlos Sainz JR",ruta);
				
				break;
				
			case "Alexander Albon":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"albon.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
				break;
			case "Pierre Gasly":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"gasly.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
				break;
			case "Lance Stroll":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"stroll.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
				break;
			case "Esteban Ocon":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"ocon.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
				break;
			case "Daniil Kvyat":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"kvyat.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
				break;
			case "Sebastian Vettel":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"vettel.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
				break;
			case "Kevin Magnussen":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"magnussen.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
				break;
			case "Kimi Raikkonen":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"raikkonen.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
				break;
			case "Antonio Giovinazzi":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"giovinnazzi.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
				break;
			case "Romain Grosjean":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"grosjean.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
				break;
			case "Nicholas Latifi":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"latifi.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
				break;
			case "George Russell":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"russell.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
				break;
			default:
				
				break;
			}
		}
	
	}


	private void sacarPiloto(String comando,String ruta) {
		try {
			piloto=concetion.consultaPiloto(comando);
			escuderia =concetion.selectEscuderia(piloto.getIdEscuderia());
			inicio.fichaPilotos(this, piloto,escuderia,ruta);
			inicio.setVisible(true);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}


	public Controlador(Inicio inicio,String s,ConectionHelper conection) {
		super();
		this.inicio = inicio;
		this.salida=s;
		this.concetion=conection;
		
	}

}
