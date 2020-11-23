package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import vista.Inicio;
import vista.Escuderia;
import vista.Piloto;
import vista.Clasificacion;
import vista.GrandesPremios;
import vista.Login;

/*
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
	
	public void llamar() {
		escuderia.setLocationRelativeTo(null);
		escuderia.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == escuderia.btnInicio) {
			Inicio inicio = new Inicio();
			ControladorInicio CInicio = new ControladorInicio(inicio);
			CInicio.llamar();
			escuderia.setVisible(false);
		}else if(e.getSource() == escuderia.btnEscuderias) {
			Escuderia escuderia = new Escuderia(); 
			ControladorEscuderia Cescuderia = new ControladorEscuderia(escuderia);
			Cescuderia.llamar();
			escuderia.setVisible(false);
			
		}else if(e.getSource() == escuderia.btnPilotos) {
			Piloto piloto = new Piloto();
			ControladorPiloto Cpiloto = new ControladorPiloto(piloto);
			Cpiloto.llamar();
			escuderia.setVisible(false);
		}else if(e.getSource() == escuderia.btnGranPre) {
			GrandesPremios Gp = new GrandesPremios();
			Gp.setVisible(true);
			escuderia.setVisible(false);
		}else if(e.getSource() == escuderia.btnClasi) {
			Clasificacion clasi = new Clasificacion();
			clasi.setVisible(true);
			escuderia.setVisible(false);
		}else if(e.getSource() == escuderia.btnLogin) {
			Login login = new Login();
			login.setVisible(true);
			escuderia.setVisible(false);
			
		}
		
	}
	
	
	

}
	*/
