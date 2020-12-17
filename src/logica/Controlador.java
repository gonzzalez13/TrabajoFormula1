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
import modelo.Noticia;
import vista.Inicio;
import vista.Login;

public class Controlador implements ActionListener {
	private Inicio inicio;
	private String salida;
	private ConectionHelper concetion;
	private Piloto piloto;
	private GranPremio premio;
	private ArrayList <Piloto> pilotos;
	private ArrayList <GranPremio> premios;
	private Escuderia escuderia;
	private ArrayList<Noticia> noticias;
	private Login login = new Login();
	private String circuito;
	
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
				sacarNoticias();
			
			
				break;
				
			case "1":
				salida =e.getActionCommand();
				sacarEscuderia(1);
				
				break;
				
			case "2":
				salida =e.getActionCommand();
				sacarEscuderia(2);
				
				break;
				
			case "3":
				salida =e.getActionCommand();
				sacarEscuderia(3);
				
				break;
				
			case "4":
				salida =e.getActionCommand();
				sacarEscuderia(4);
				
				break;
				
			case "5":
				salida =e.getActionCommand();
				sacarEscuderia(5);
				
				break;
				
			case "6":
				salida =e.getActionCommand();
				sacarEscuderia(6);
				
				break;
				
			case "7":
				salida =e.getActionCommand();
				sacarEscuderia(7);
				
				break;
				
			case "8":
				salida =e.getActionCommand();
				sacarEscuderia(8);
				
				break;
				
			case "9":
				salida =e.getActionCommand();
				sacarEscuderia(9);
				
				break;
				
			case "10":
				salida =e.getActionCommand();
				sacarEscuderia(10);
				
				break;
				
				
			case "Pilotos":
				salida="Pilotos";
				inicio.piloto(this);
				inicio.setVisible(true);
				break;
			case "Daniel Ricciardo":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				break;
			
			case "Lewis Hamilton":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
				
				break;
			case "Valtteri Bottas":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
				break;
				
			case "Max Verstappen":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
				break;
			case "Charles Leclerc":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
				break;
			case "Sergio Perez":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
				break;
			case "Lando Norris":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
				break;
			case "Carlos Sainz JR":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
				break;
				
			case "Alexander Albon":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
				break;
			case "Pierre Gasly":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
				break;
			case "Lance Stroll":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
				break;
			case "Esteban Ocon":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
				break;
			case "Daniil Kvyat":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
				break;
			case "Sebastian Vettel":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
				break;
			case "Kevin Magnussen":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
				break;
			case "Kimi Raikkonen":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
				break;
			case "Antonio Giovinazzi":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
				break;
			case "Romain Grosjean":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
				break;
			case "Nicholas Latifi":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
				break;
			case "George Russell":
				salida=e.getActionCommand();
				sacarPiloto(e.getActionCommand());
				
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
					e1.printStackTrace();
				} catch (SQLException e1) {
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


	private void sacarPiloto(String comando) {
		try {
			piloto=concetion.consultaPiloto(comando);
			escuderia =concetion.selectEscuderia(piloto.getIdEscuderia());
			inicio.fichaPilotos(this, piloto,escuderia);
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
	private void sacarEscuderia(int id) {
		try {
			escuderia = concetion.selectEscuderia(id);
			pilotos = concetion.consultaPilotoId(id);
			inicio.FichaEscuderia(this, escuderia, pilotos);
			inicio.setVisible(true);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	private void sacarNoticias() {
		try {
			
			noticias = concetion.consultaNoticia();
			inicio.inicio(this);
			inicio.setVisible(true);			
		} catch (Exception e) {
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