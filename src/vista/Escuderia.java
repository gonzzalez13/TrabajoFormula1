package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Controlador;

public class Escuderia extends Cabecera {
	
	private JButton btnAlfaRomeo,btnAlphaTauri,btnNFerrari,btnHaas,btnMclaren,btnMercedes,btnRacingPonit,btnRedBull,btnRenault,btnWilliams;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Escuderia frame = new Escuderia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Escuderia getEscuderia() {
		return this;
	}

	public JButton getBtnInicio() {
		return btnInicio;
	}

	public void setBtnInicio(JButton btnInicio) {
		this.btnInicio = btnInicio;
	}

	public JButton getBtnEscuderias() {
		return btnEscuderias;
	}

	public void setBtnEscuderias(JButton btnEscuderias) {
		this.btnEscuderias = btnEscuderias;
	}

	public JButton getBtnPilotos() {
		return btnPilotos;
	}

	public void setBtnPilotos(JButton btnPilotos) {
		this.btnPilotos = btnPilotos;
	}

	public JButton getBtnGranPre() {
		return btnGranPre;
	}

	public void setBtnGranPre(JButton btnGranPre) {
		this.btnGranPre = btnGranPre;
	}

	public JButton getBtnClasi() {
		return btnClasi;
	}

	public void setBtnClasi(JButton btnClasi) {
		this.btnClasi = btnClasi;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}

	public JButton getBtnLogo() {
		return btnLogo;
	}

	public void setBtnLogo(JButton btnLogo) {
		this.btnLogo = btnLogo;
	}

	public JButton getBtnAlfaRomeo() {
		return btnAlfaRomeo;
	}

	public void setBtnAlfaRomeo(JButton btnAlfaRomeo) {
		this.btnAlfaRomeo = btnAlfaRomeo;
	}

	public JButton getBtnAlphaTauri() {
		return btnAlphaTauri;
	}

	public void setBtnAlphaTauri(JButton btnAlphaTauri) {
		this.btnAlphaTauri = btnAlphaTauri;
	}

	public JButton getBtnNFerrari() {
		return btnNFerrari;
	}

	public void setBtnNFerrari(JButton btnNFerrari) {
		this.btnNFerrari = btnNFerrari;
	}

	public JButton getBtnHaas() {
		return btnHaas;
	}

	public void setBtnHaas(JButton btnHaas) {
		this.btnHaas = btnHaas;
	}

	public JButton getBtnMclaren() {
		return btnMclaren;
	}

	public void setBtnMclaren(JButton btnMclaren) {
		this.btnMclaren = btnMclaren;
	}

	public JButton getBtnMercedes() {
		return btnMercedes;
	}

	public void setBtnMercedes(JButton btnMercedes) {
		this.btnMercedes = btnMercedes;
	}

	public JButton getBtnRacingPonit() {
		return btnRacingPonit;
	}

	public void setBtnRacingPonit(JButton btnRacingPonit) {
		this.btnRacingPonit = btnRacingPonit;
	}

	public JButton getBtnRedBull() {
		return btnRedBull;
	}

	public void setBtnRedBull(JButton btnRedBull) {
		this.btnRedBull = btnRedBull;
	}

	public JButton getBtnRenault() {
		return btnRenault;
	}

	public void setBtnRenault(JButton btnRenault) {
		this.btnRenault = btnRenault;
	}

	public JButton getBtnWilliams() {
		return btnWilliams;
	}

	public void setBtnWilliams(JButton btnWilliams) {
		this.btnWilliams = btnWilliams;
	}
	
	
	
	
}
