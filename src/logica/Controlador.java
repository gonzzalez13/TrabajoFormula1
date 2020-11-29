package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
			case "Carlos Sainz":
				salida=e.getActionCommand();
				sacarPiloto("Carlos Sainz JR");
				
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
			default:
				
				break;
			}
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


	public Controlador(Inicio inicio,String s,ConectionHelper conection) {
		super();
		this.inicio = inicio;
		this.salida=s;
		this.concetion=conection;
		
	}

}
