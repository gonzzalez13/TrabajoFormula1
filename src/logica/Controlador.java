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
				
			case "1":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"Mercedes.jpg";
				sacarEscuderia(1, ruta);
				
				break;
				
			case "2":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"Ferrari.jpg";
				sacarEscuderia(2, ruta);
				
				break;
				
			case "3":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"RedBull.jpg";
				sacarEscuderia(3, ruta);
				
				break;
				
			case "4":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"RacingPoint.jpg";
				sacarEscuderia(4, ruta);
				
				break;
				
			case "5":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"Mclaren.jpg";
				sacarEscuderia(5, ruta);
				
				break;
				
			case "6":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"Reanult.jpg";
				sacarEscuderia(6, ruta);
				
				break;
				
			case "7":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"AlphaTauri.jpg";
				sacarEscuderia(7, ruta);
				
				break;
				
			case "8":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"AlfaRomeo.jpg";
				sacarEscuderia(8, ruta);
				
				break;
				
			case "9":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"Haas.jpg";
				sacarEscuderia(9, ruta);
				
				break;
				
			case "10":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"Williams.jpg";
				sacarEscuderia(10, ruta);
				
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
				
			case "Clasificacion":
				
				salida="Clasificacion";
				inicio.clasificacion(this);;
				inicio.setVisible(true);
			
			
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

	private void sacarEscuderia(int id,String ruta) {
		try {
			escuderia = concetion.selectEscuderia(id);
			piloto= concetion.consultaPiloto(escuderia.getNombre());
			inicio.FichaEscuderia(this, escuderia, piloto, ruta);
			inicio.setVisible(true);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

	public Controlador(Inicio inicio,String s,ConectionHelper conection) {
		super();
		this.inicio = inicio;
		this.salida=s;
		this.concetion=conection;
		
	}

}
