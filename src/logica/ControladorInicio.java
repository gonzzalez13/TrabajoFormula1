package logica;


import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import vista.Clasificacion;
import vista.Escuderia;
import vista.GrandesPremios;
import vista.Inicio;
import vista.Login;
import vista.Piloto;

public class ControladorInicio implements ActionListener {

private Inicio inicio = new Inicio();

	
	
	public ControladorInicio(Inicio inicio) {
	super();
	this.inicio = inicio;
	this.inicio.btnInicio.addActionListener(this);
	this.inicio.btnEscuderias.addActionListener(this);
	this.inicio.btnPilotos.addActionListener(this);
	this.inicio.btnGranPre.addActionListener(this);
	this.inicio.btnClasi.addActionListener(this);
	this.inicio.btnLogin.addActionListener(this);
}



	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == inicio.btnInicio) {
			Inicio inicio = new Inicio();
			inicio.setVisible(true);
			inicio.setVisible(false);
			
		}else if(e.getSource() == inicio.btnEscuderias) {
			Escuderia escuderia = new Escuderia();
			inicio.setVisible(false);
			escuderia.setVisible(true);
			
		}else if(e.getSource() == inicio.btnPilotos) {
			Piloto piloto = new Piloto();
			piloto.setVisible(true);
			inicio.setVisible(false);
			
		}else if(e.getSource() == inicio.btnGranPre) {
			GrandesPremios Gp = new GrandesPremios();
			Gp.setVisible(true);
			inicio.setVisible(false);
			
		}else if(e.getSource() == inicio.btnClasi) {
			Clasificacion clasi = new Clasificacion();
			clasi.setVisible(true);
			inicio.setVisible(false);
			
		}else if(e.getSource() == inicio.btnLogin) {
			Login login = new Login();
			login.setVisible(true);
			inicio.setVisible(false);
			
		}
		
	}
		
	
	
	

}
