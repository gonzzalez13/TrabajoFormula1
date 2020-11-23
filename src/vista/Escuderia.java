package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.SystemColor;

public class Escuderia extends JFrame {
	private JButton btnInicio,btnEscuderias,btnPilotos,btnGranPre,btnClasi,btnLogin,btnLogo;
	private JButton btnAlfaRomeo,btnAlphaTauri,btnNFerrari,btnHaas,btnMclaren,btnMercedes,btnRacingPonit,btnRedBull,btnRenault,btnWilliams;
	private JPanel contentPane;

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
	public Escuderia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 67, 849, 544);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panelAlfaRomeo = new JPanel();
		panelAlfaRomeo.setBackground(SystemColor.menu);
		panelAlfaRomeo.setBounds(30, 40, 180, 70);
		panel.add(panelAlfaRomeo);
		panelAlfaRomeo.setLayout(null);
		
		JLabel lblAlfaRomeo = new JLabel("Alfa Romeo");
		lblAlfaRomeo.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblAlfaRomeo.setBounds(0, 0, 120, 19);
		panelAlfaRomeo.add(lblAlfaRomeo);
		
		btnAlfaRomeo = new JButton("");
		btnAlfaRomeo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"AlfaRomeo.png"));
		btnAlfaRomeo.setBorder(null);
		btnAlfaRomeo.setBackground(Color.LIGHT_GRAY);
		btnAlfaRomeo.setBounds(0, 24, 180, 46);
		panelAlfaRomeo.add(btnAlfaRomeo);
		
		JPanel panelAlfaTauri = new JPanel();
		panelAlfaTauri.setLayout(null);
		panelAlfaTauri.setBounds(330, 40, 180, 70);
		panel.add(panelAlfaTauri);
		
		JLabel lblAlphaTauri = new JLabel("Alpha Tauri");
		lblAlphaTauri.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblAlphaTauri.setBounds(0, 0, 120, 19);
		panelAlfaTauri.add(lblAlphaTauri);
		
		btnAlphaTauri = new JButton("");
		btnAlphaTauri.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"AlphaTauri.png"));
		btnAlphaTauri.setBorder(null);
		btnAlphaTauri.setBackground(Color.WHITE);
		btnAlphaTauri.setBounds(0, 24, 180, 46);
		panelAlfaTauri.add(btnAlphaTauri);
		
		JPanel panelFerrari = new JPanel();
		panelFerrari.setLayout(null);
		panelFerrari.setBounds(640, 40, 180, 70);
		panel.add(panelFerrari);
		
		JLabel lblFerrari = new JLabel("Ferrari");
		lblFerrari.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblFerrari.setBounds(0, 0, 120, 19);
		panelFerrari.add(lblFerrari);
		
		btnNFerrari = new JButton("");
		btnNFerrari.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"ferrari.png"));
		btnNFerrari.setBorder(null);
		btnNFerrari.setBackground(Color.WHITE);
		btnNFerrari.setBounds(0, 24, 180, 46);
		panelFerrari.add(btnNFerrari);
		
		JPanel panelHaas = new JPanel();
		panelHaas.setLayout(null);
		panelHaas.setBounds(30, 170, 180, 70);
		panel.add(panelHaas);
		
		JLabel lblHaas = new JLabel("Haas");
		lblHaas.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblHaas.setBounds(0, 0, 120, 19);
		panelHaas.add(lblHaas);
		
		btnHaas = new JButton("");
		btnHaas.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"haas.png"));
		btnHaas.setBorder(null);
		btnHaas.setBackground(Color.WHITE);
		btnHaas.setBounds(0, 24, 180, 46);
		panelHaas.add(btnHaas);
		
		JPanel panelMclaren = new JPanel();
		panelMclaren.setLayout(null);
		panelMclaren.setBounds(330, 170, 180, 70);
		panel.add(panelMclaren);
		
		JLabel lblMclaren = new JLabel("Mclaren");
		lblMclaren.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblMclaren.setBounds(0, 0, 120, 19);
		panelMclaren.add(lblMclaren);
		
		btnMclaren = new JButton("");
		btnMclaren.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Mclaren.png"));
		btnMclaren.setBorder(null);
		btnMclaren.setBackground(Color.WHITE);
		btnMclaren.setBounds(0, 24, 180, 46);
		panelMclaren.add(btnMclaren);
		
		JPanel panelMercedes = new JPanel();
		panelMercedes.setLayout(null);
		panelMercedes.setBounds(640, 170, 180, 70);
		panel.add(panelMercedes);
		
		JLabel lblMercedes = new JLabel("Mercedes");
		lblMercedes.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblMercedes.setBounds(0, 0, 120, 19);
		panelMercedes.add(lblMercedes);
		
		btnMercedes = new JButton("");
		btnMercedes.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Mercedes.png"));
		btnMercedes.setBorder(null);
		btnMercedes.setBackground(Color.WHITE);
		btnMercedes.setBounds(0, 24, 180, 46);
		panelMercedes.add(btnMercedes);
		
		JPanel panelRacingPoint = new JPanel();
		panelRacingPoint.setLayout(null);
		panelRacingPoint.setBounds(30, 310, 180, 70);
		panel.add(panelRacingPoint);
		
		JLabel lblRacingPoint = new JLabel("Racing Point");
		lblRacingPoint.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblRacingPoint.setBounds(0, 0, 120, 19);
		panelRacingPoint.add(lblRacingPoint);
		
		btnRacingPonit = new JButton("");
		btnRacingPonit.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"RacingPoint.png"));
		btnRacingPonit.setBorder(null);
		btnRacingPonit.setBackground(Color.WHITE);
		btnRacingPonit.setBounds(0, 24, 180, 46);
		panelRacingPoint.add(btnRacingPonit);
		
		JPanel panelRedBull = new JPanel();
		panelRedBull.setLayout(null);
		panelRedBull.setBounds(330, 310, 180, 70);
		panel.add(panelRedBull);
		
		JLabel lblRedBull = new JLabel("Red Bull");
		lblRedBull.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblRedBull.setBounds(0, 0, 120, 19);
		panelRedBull.add(lblRedBull);
		
		btnRedBull = new JButton("");
		btnRedBull.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"RedBull.png"));
		btnRedBull.setBorder(null);
		btnRedBull.setBackground(Color.WHITE);
		btnRedBull.setBounds(0, 24, 180, 46);
		panelRedBull.add(btnRedBull);
		
		JPanel panelRenault = new JPanel();
		panelRenault.setLayout(null);
		panelRenault.setBounds(640, 300, 180, 70);
		panel.add(panelRenault);
		
		JLabel lblRenault = new JLabel("Renault");
		lblRenault.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblRenault.setBounds(0, 0, 120, 19);
		panelRenault.add(lblRenault);
		
		btnRenault = new JButton("");
		btnRenault.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Renault.png"));
		btnRenault.setBorder(null);
		btnRenault.setBackground(Color.WHITE);
		btnRenault.setBounds(0, 24, 180, 46);
		panelRenault.add(btnRenault);
		
		JPanel panelWilliams = new JPanel();
		panelWilliams.setLayout(null);
		panelWilliams.setBounds(30, 440, 180, 70);
		panel.add(panelWilliams);
		
		JLabel lblWilliams = new JLabel("Williams");
		lblWilliams.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblWilliams.setBounds(0, 0, 120, 19);
		panelWilliams.add(lblWilliams);
		
		btnWilliams = new JButton("");
		btnWilliams.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Williams.png"));
		btnWilliams.setBorder(null);
		btnWilliams.setBackground(Color.WHITE);
		btnWilliams.setBounds(0, 24, 180, 46);
		panelWilliams.add(btnWilliams);
		
		JPanel PanelMenu = new JPanel();
		PanelMenu.setLayout(null);
		PanelMenu.setBackground(Color.LIGHT_GRAY);
		PanelMenu.setBounds(0, 0, 849, 71);
		contentPane.add(PanelMenu);
		
		btnInicio = new JButton("Inicio");
		btnInicio.setForeground(Color.RED);
		btnInicio.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnInicio.setBackground(Color.DARK_GRAY);
		btnInicio.setBounds(144, 11, 74, 48);
		PanelMenu.add(btnInicio);
		
		btnEscuderias = new JButton("Escuderias");
		btnEscuderias.setForeground(Color.RED);
		btnEscuderias.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnEscuderias.setBackground(Color.DARK_GRAY);
		btnEscuderias.setBounds(226, 11, 112, 48);
		PanelMenu.add(btnEscuderias);
		
		btnPilotos = new JButton("Pilotos");
		btnPilotos.setForeground(Color.RED);
		btnPilotos.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnPilotos.setBackground(Color.DARK_GRAY);
		btnPilotos.setBounds(348, 11, 94, 48);
		PanelMenu.add(btnPilotos);
		
		btnGranPre = new JButton("Gran Premio");
		btnGranPre.setForeground(Color.RED);
		btnGranPre.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGranPre.setBackground(Color.DARK_GRAY);
		btnGranPre.setBounds(452, 11, 130, 48);
		PanelMenu.add(btnGranPre);
		
		btnClasi = new JButton("Clasificaciones");
		btnClasi.setForeground(Color.RED);
		btnClasi.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnClasi.setBackground(Color.DARK_GRAY);
		btnClasi.setBounds(592, 11, 145, 48);
		PanelMenu.add(btnClasi);
		
		btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.RED);
		btnLogin.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setBounds(747, 11, 92, 48);
		PanelMenu.add(btnLogin);
		
		btnLogo = new JButton("");
		btnLogo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"F1-logo.png"));
		btnLogo.setForeground(Color.LIGHT_GRAY);
		btnLogo.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogo.setBorder(null);
		btnLogo.setBackground(Color.LIGHT_GRAY);
		btnLogo.setBounds(10, 11, 124, 48);
		PanelMenu.add(btnLogo);
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
