package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Escuderia;
import vista.Inicio;
import vista.Piloto;

public class Controlador implements ActionListener {
	private Inicio inicio;
	private Piloto piloto=new Piloto();
	private Escuderia escuderia =new Escuderia();
	private String s;


	@Override
	public void actionPerformed(ActionEvent e) {
	
		inicio.setVisible(false);
		switch (s) {
		case "escuderia":
			escuderia.setVisible(true);
			
			
			break;
		case "piloto":
			piloto.setVisible(true);
			
			break;

		default:
			break;
		}
	
	}


	public Controlador(Inicio inicio,String s) {
		super();
		this.inicio = inicio;
		this.s=s;
		
	}

}
