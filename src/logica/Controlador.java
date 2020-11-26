package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Escuderia;
import vista.Inicio;
import vista.Piloto;

public class Controlador implements ActionListener {
	private Inicio inicio;
	public Inicio getInicio() {
		return inicio;
	}


	public void setInicio(Inicio inicio) {
		this.inicio = inicio;
	}




	
	private String salida;
	


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
			

			default:
				break;
			}
		}
	
	}


	public Controlador(Inicio inicio,String s) {
		super();
		this.inicio = inicio;
		this.salida=s;
		
	}

}
