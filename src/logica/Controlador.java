package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Carrera;
import modelo.Escuderia;
import modelo.GranPremio;
import modelo.Piloto;
import vista.Inicio;
import vista.Login;
import vista.Noticia;
import vista.Noticia2;
import vista.Noticia3;

public class Controlador implements ActionListener {
	private Inicio inicio;
	private String salida;
	private ConectionHelper concetion;
	private Piloto piloto;
	private GranPremio premio;
	private ArrayList <Piloto> pilotos;
	private ArrayList <GranPremio> premios;
	private Escuderia escuderia;
	private Noticia noticia= new Noticia();
	private Noticia2 noticia2 = new Noticia2();
	private Noticia3 noticia3 = new Noticia3();
	private Login login = new Login();
	private String ruta,piloto1,piloto2,circuito;
	
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
				
				salida=e.getActionCommand();
				
				inicio.escuderia(this);
				inicio.setVisible(true);
				
				break;
			case "Inicio":
				
				salida=e.getActionCommand();
				
				inicio.inicio(this);
				inicio.setVisible(true);
			
			
				break;
				
			case "Leer mas I":
				salida=e.getActionCommand();
				noticia.setVisible(true);
				
				break;
			case "Leer mas II":
				salida=e.getActionCommand();
				noticia2.setVisible(true);
				
				break;
			case "Leer mas III":
				salida=e.getActionCommand();
				noticia3.setVisible(true);
				
				break;
				
			case "1":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"Mercedes.jpg";
				piloto1="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"LewisHamilton.jpg";
				piloto2="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"ValtteriBottas.jpg";
				sacarEscuderia(1, ruta,piloto1,piloto2);
				
				break;
				
			case "2":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"Ferrari.jpg";
				piloto1="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"CharlesLeclerc.jpg";
				piloto2="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"SebastianVettel.jpg";
				sacarEscuderia(2, ruta,piloto1,piloto2);
				
				break;
				
			case "3":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"RedBull.jpg";
				piloto1="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"MaxVerstappen.jpg";
				piloto2="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"AlexanderAlbon.jpg";
				sacarEscuderia(3, ruta,piloto1,piloto2);
				
				break;
				
			case "4":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"RacingPoint.jpg";
				piloto1="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"SergioPerez.jpg";
				piloto2="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"LanceStroll.jpg";
				sacarEscuderia(4, ruta,piloto1,piloto2);
				
				break;
				
			case "5":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"Mclaren.jpg";
				piloto1="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"CarlosSainz.jpg";
				piloto2="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"LandoNorris.jpg";
				sacarEscuderia(5, ruta,piloto1,piloto2);
				
				break;
				
			case "6":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"Reanult.jpg";
				piloto1="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"DanielRicciardo.jpg";
				piloto2="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"EstebanOcon.jpg";
				sacarEscuderia(6, ruta,piloto1,piloto2);
				
				break;
				
			case "7":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"AlphaTauri.jpg";
				piloto1="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"DaniilKvyat.jpg";
				piloto2="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"PierreGasly.jpg";
				sacarEscuderia(7, ruta,piloto1,piloto2);
				
				break;
				
			case "8":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"AlfaRomeo.jpg";
				piloto1="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"KimiRaikkonen.jpg";
				piloto2="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"AntonioGiovinazzi.jpg";
				sacarEscuderia(8, ruta,piloto1,piloto2);
				
				break;
				
			case "9":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"Haas.jpg";
				piloto1="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"RomainGrosjean.jpg";
				piloto2="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"KevinMagnussen.jpg";
				sacarEscuderia(9, ruta,piloto1,piloto2);
				
				break;
				
			case "10":
				salida =e.getActionCommand();
				ruta="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Logos"+File.separator+"Williams.jpg";
				piloto1="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"NicholasLatifi.jpg";
				piloto2="src"+File.separator+"Imagenes"+File.separator+"FichaEscuderia"+File.separator+"Pilotos"+File.separator+"GeorgeRussell.jpg";
				sacarEscuderia(10, ruta,piloto1,piloto2);
				
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
			case "Carlos Sainz JR":
				salida=e.getActionCommand();
				ruta ="src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"sainz.PNG";
				sacarPiloto(e.getActionCommand(),ruta);
				
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
				
				salida=e.getActionCommand();
				inicio.clasificacion(this);
				inicio.setVisible(true);
			
			
				break;
				
			case "Gran Premio":	
				salida=e.getActionCommand();
				inicio.GrandesPremios(this);
				inicio.setVisible(true);
				
				break;
				
			case"Red bull Ring I":	
				salida=e.getActionCommand();
				circuito ="src"+File.separator+"Imagenes"+File.separator+"Grandes Premios"+File.separator+"Circuitos"+File.separator+"Red Bull Ring.png";
				sacarPremio(e.getActionCommand(),circuito);
				break;
				
			case"Red bull Ring II":	
				salida=e.getActionCommand();
				circuito ="src"+File.separator+"Imagenes"+File.separator+"Grandes Premios"+File.separator+"Circuitos"+File.separator+"Red Bull Ring.png";
				sacarPremio(e.getActionCommand(),circuito);
				break;
				
			case"Hungaroring":	
				salida=e.getActionCommand();
				circuito ="src"+File.separator+"Imagenes"+File.separator+"Grandes Premios"+File.separator+"Circuitos"+File.separator+"Hungaroring.png";
				sacarPremio(e.getActionCommand(),circuito);
				break;
				
			case"Silverstone I":	
				salida=e.getActionCommand();
				circuito ="src"+File.separator+"Imagenes"+File.separator+"Grandes Premios"+File.separator+"Circuitos"+File.separator+"Silverstone.png";
				sacarPremio(e.getActionCommand(),circuito);
				break;
				
			case"Silverstone II":	
				salida=e.getActionCommand();
				circuito ="src"+File.separator+"Imagenes"+File.separator+"Grandes Premios"+File.separator+"Circuitos"+File.separator+"Silverstone.png";
				sacarPremio(e.getActionCommand(),circuito);
				break;
				
			case"Barcelona":	
				salida=e.getActionCommand();
				circuito ="src"+File.separator+"Imagenes"+File.separator+"Grandes Premios"+File.separator+"Circuitos"+File.separator+"Barcelona.png";
				sacarPremio(e.getActionCommand(),circuito);
				break;
				
			case"Spa":	
				salida=e.getActionCommand();
				circuito ="src"+File.separator+"Imagenes"+File.separator+"Grandes Premios"+File.separator+"Circuitos"+File.separator+"span.png";
				sacarPremio(e.getActionCommand(),circuito);
				break;
				
			case"Monza":
				salida=e.getActionCommand();
				circuito ="src"+File.separator+"Imagenes"+File.separator+"Grandes Premios"+File.separator+"Circuitos"+File.separator+"monza.png";
				sacarPremio(e.getActionCommand(),circuito);
				break;
				
				
			case"Sochi":	
				salida=e.getActionCommand();
				circuito ="src"+File.separator+"Imagenes"+File.separator+"Grandes Premios"+File.separator+"Circuitos"+File.separator+"sochi.png";
				sacarPremio(e.getActionCommand(),circuito);
				break;
				
			case"Nurburgring":	
				salida=e.getActionCommand();
				circuito ="src"+File.separator+"Imagenes"+File.separator+"Grandes Premios"+File.separator+"Circuitos"+File.separator+"nurburgring.png";
				sacarPremio(e.getActionCommand(),circuito);
				break;
				
			case"Portimao":	
				salida=e.getActionCommand();
				circuito ="src"+File.separator+"Imagenes"+File.separator+"Grandes Premios"+File.separator+"Circuitos"+File.separator+"portimao.png";
				sacarPremio(e.getActionCommand(),circuito);
				break;
				
			case"La toscana":	
				salida=e.getActionCommand();
				circuito ="src"+File.separator+"Imagenes"+File.separator+"Grandes Premios"+File.separator+"Circuitos"+File.separator+"mugello.png";
				sacarPremio(e.getActionCommand(),circuito);
				break;
				
			case"Imola":	
				salida=e.getActionCommand();
				circuito ="src"+File.separator+"Imagenes"+File.separator+"Grandes Premios"+File.separator+"Circuitos"+File.separator+"lmola.png";
				sacarPremio(e.getActionCommand(),circuito);
				break;
				
			case"Instambul Park":	
				salida=e.getActionCommand();
				circuito ="src"+File.separator+"Imagenes"+File.separator+"Grandes Premios"+File.separator+"Circuitos"+File.separator+"istanbul.png";
				sacarPremio(e.getActionCommand(),circuito);
				break;
				
			case"Bahrain I":	
				salida=e.getActionCommand();
				circuito ="src"+File.separator+"Imagenes"+File.separator+"Grandes Premios"+File.separator+"Circuitos"+File.separator+"sakhir.png";
				sacarPremio(e.getActionCommand(),circuito);
				break;
				
			case"Bahrain II":	
				salida=e.getActionCommand();
				circuito ="src"+File.separator+"Imagenes"+File.separator+"Grandes Premios"+File.separator+"Circuitos"+File.separator+"sakhir2.png";
				sacarPremio(e.getActionCommand(),circuito);
				break;
				
			case"Yas Marinas":	
				salida=e.getActionCommand();
				circuito ="src"+File.separator+"Imagenes"+File.separator+"Grandes Premios"+File.separator+"Circuitos"+File.separator+"abudhabi.png";
				sacarPremio(e.getActionCommand(),circuito);
				break;
				
			case "Simulacion":	
				salida=e.getActionCommand();
				sacarTPremios();
				
				break;
				
			case "Simular carrera":	
				salida=e.getActionCommand();
				Carrera carrera = new Carrera(inicio.getVueltas(),inicio.getComboListaCircuitos().getSelectedItem().toString(),inicio.getComboTiempo().getSelectedItem().toString());
				Simulacion sim=null;
				try {
					sim=new Simulacion(concetion.consultaTPiloto(),carrera);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				inicio.fichaSimulacion(this,sim.main(),concetion);
				inicio.setVisible(true);
				break;
			
				
			case "Login":
				salida=e.getActionCommand();
				login.setVisible(true);

				break;	
				
			default:
				
				break;
			}
		}
	
	}


	private void sacarTPremios() {
		try {
			premios = concetion.consultaPremios();
			inicio.simulacion(this, premios);
			inicio.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
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
	private void sacarPremio(String comando,String circuito) {
		try {
			premio=concetion.consultaGranPremio(comando);
			inicio.fichaGranPremio(premio,this,circuito);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	private void sacarEscuderia(int id,String ruta,String piloto1,String piloto2) {
		try {
			escuderia = concetion.selectEscuderia(id);
			pilotos = concetion.consultaPilotoId(id);
			inicio.FichaEscuderia(this, escuderia, pilotos, ruta,piloto1,piloto2);
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