package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import vista.Inicio;
import vista.Escuderia;
import vista.Piloto;
import vista.Clasificacion;
import vista.GrandesPremios;
import vista.Login;


public class ControladorEscuderia  implements ActionListener {

	
	private Escuderia escuderia = new Escuderia();

	public ControladorEscuderia(Escuderia escuderia) {
		super();
		this.escuderia = escuderia;
		this.escuderia.btnInicio.addActionListener(this);
		this.escuderia.btnEscuderias.addActionListener(this);
		this.escuderia.btnPilotos.addActionListener(this);
		this.escuderia.btnGranPre.addActionListener(this);
		this.escuderia.btnClasi.addActionListener(this);
		this.escuderia.btnLogin.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	
	
	
}
