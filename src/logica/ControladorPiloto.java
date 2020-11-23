package logica;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;

import vista.Clasificacion;
import vista.Escuderia;
import vista.GrandesPremios;
import vista.Inicio;
import vista.Login;
import vista.Piloto;
/*
public class ControladorPiloto implements ActionListener {
	private Piloto pilotos = new Piloto();

	
	
	public ControladorPiloto(Piloto pilotos) {
		super();
		this.pilotos = pilotos;
		this.pilotos.btnInicio.addActionListener(this);
		this.pilotos.btnEscuderias.addActionListener(this);
		this.pilotos.btnPilotos.addActionListener(this);
		this.pilotos.btnGranPre.addActionListener(this);
		this.pilotos.btnClasi.addActionListener(this);
		this.pilotos.btnLogin.addActionListener(this);
	}

	public void llamar() {
		pilotos.setLocationRelativeTo(null);
		pilotos.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == pilotos.btnInicio) {
			Inicio inicio = new Inicio();
			ControladorInicio CInicio = new ControladorInicio(inicio);
			CInicio.llamar();
			pilotos.setVisible(false);
		}else if(e.getSource() == pilotos.btnEscuderias) {
			Escuderia escuderia = new Escuderia(); 
			ControladorEscuderia Cescuderia = new ControladorEscuderia(escuderia);
			Cescuderia.llamar();
			pilotos.setVisible(false);
			
		}else if(e.getSource() == pilotos.btnPilotos) {
			Piloto piloto = new Piloto();
			ControladorPiloto Cpiloto = new ControladorPiloto(piloto);
			Cpiloto.llamar();
			pilotos.setVisible(false);
		}else if(e.getSource() == pilotos.btnGranPre) {
			GrandesPremios Gp = new GrandesPremios();
			Gp.setVisible(true);
			pilotos.setVisible(false);
		}else if(e.getSource() == pilotos.btnClasi) {
			Clasificacion clasi = new Clasificacion();
			clasi.setVisible(true);
			pilotos.setVisible(false);
		}else if(e.getSource() == pilotos.btnLogin) {
			Login login = new Login();
			login.setVisible(true);
			login.setVisible(false);
			
		}
		
	}
	
	
	

}
*/
