package logica;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import vista.Clasificacion;
import vista.Escuderia;
import vista.FichaPilotos;
import vista.GrandesPremios;
import vista.Inicio;
import vista.Login;
import vista.Piloto;

public class ControladorFichaP implements ActionListener {
	private FichaPilotos Fp = new FichaPilotos();

	
	
	public ControladorFichaP(FichaPilotos fp) {
		super();
		this.Fp = fp;
		this.Fp.btnInicio.addActionListener(this);
		this.Fp.btnEscuderias.addActionListener(this);
		this.Fp.btnPilotos.addActionListener(this);
		this.Fp.btnGranPre.addActionListener(this);
		this.Fp.btnClasi.addActionListener(this);
		this.Fp.btnLogin.addActionListener(this);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == Fp.btnInicio) {
			Inicio inicio = new Inicio();
			inicio.setVisible(true);
			Fp.setVisible(false);
		}else if(e.getSource() == Fp.btnEscuderias) {
			Escuderia escuderia = new Escuderia(); 
			escuderia.setVisible(true);
			Fp.setVisible(false);
			
		}else if(e.getSource() == Fp.btnPilotos) {
			Piloto piloto = new Piloto();
			piloto.setVisible(true);
			Fp.setVisible(false);
		}else if(e.getSource() == Fp.btnGranPre) {
			GrandesPremios Gp = new GrandesPremios();
			Gp.setVisible(true);
			Fp.setVisible(false);
		}else if(e.getSource() == Fp.btnClasi) {
			Clasificacion clasi = new Clasificacion();
			clasi.setVisible(true);
			Fp.setVisible(false);
		}else if(e.getSource() == Fp.btnLogin) {
			Login login = new Login();
			login.setVisible(true);
			login.setVisible(false);
			
		}
		
	}
	
	
	

}
