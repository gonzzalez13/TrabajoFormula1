package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Piloto extends JFrame {

	private JPanel contentPane;
	private JButton btnInicio,btnEscuderias,btnPilotos,btnGranPre,btnClasi,btnLogin,btnLogo;
	private JButton btnHAMILTON,btnBOTTAS,btnVERSTAPPEN,btnRICCIARDO,btnLECLERC,btnPEREZ,btnNORRIS,btnSAINZ,btnALBON,btnGASLY;
	private JButton btnSTROLL,btnOCON,btnKVYAT,btnVETTEL,btnMAGNUSSEN,btnRÄIKKÖNEN,btnGIOVINAZZI,btnGROSJEAN,btnLatifi,btnRussell;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Piloto frame = new Piloto();
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
	public Piloto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.background"));
		panel_1.setBounds(0, 66, 849, 545);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setPreferredSize(new Dimension(850, 430));
		
		JPanel panelHAMILTON = new JPanel();
		panelHAMILTON.setBackground(Color.WHITE);
		panelHAMILTON.setLayout(null);
		panelHAMILTON.setBounds(10, 23, 207, 60);
		panel_1.add(panelHAMILTON);
		
		btnHAMILTON = new JButton("  Lewis Hamilton  >");
		btnHAMILTON.setIcon(new ImageIcon("E:\\Users\\Usuaio\\Interfaces\\TrabajoFormula1\\src\\Imagenes\\N\u00BAHamil.png"));
		btnHAMILTON.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnHAMILTON.setBorder(null);
		btnHAMILTON.setBackground(Color.WHITE);
		btnHAMILTON.setBounds(0, 11, 207, 37);
		panelHAMILTON.add(btnHAMILTON);
		
		JSeparator separatorHAMILTON = new JSeparator();
		separatorHAMILTON.setBounds(0, 53, 207, 6);
		panelHAMILTON.add(separatorHAMILTON);
		
		JPanel panelBOTTAS = new JPanel();
		panelBOTTAS.setLayout(null);
		panelBOTTAS.setBackground(Color.WHITE);
		panelBOTTAS.setBounds(255, 23, 207, 60);
		panel_1.add(panelBOTTAS);
		
		btnBOTTAS = new JButton("  Valtteri Bottas  >");
		btnBOTTAS.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnBOTTAS.setBorder(null);
		btnBOTTAS.setBackground(Color.WHITE);
		btnBOTTAS.setBounds(0, 11, 207, 37);
		panelBOTTAS.add(btnBOTTAS);
		
		JSeparator separatorBOTTAS = new JSeparator();
		separatorBOTTAS.setBounds(0, 53, 207, 6);
		panelBOTTAS.add(separatorBOTTAS);
		
		JPanel panelVERSTAPPEN = new JPanel();
		panelVERSTAPPEN.setLayout(null);
		panelVERSTAPPEN.setBackground(Color.WHITE);
		panelVERSTAPPEN.setBounds(500, 23, 207, 60);
		panel_1.add(panelVERSTAPPEN);
		
		btnVERSTAPPEN = new JButton("  Max Verstappen  >");
		btnVERSTAPPEN.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnVERSTAPPEN.setBorder(null);
		btnVERSTAPPEN.setBackground(Color.WHITE);
		btnVERSTAPPEN.setBounds(0, 11, 207, 37);
		panelVERSTAPPEN.add(btnVERSTAPPEN);
		
		JSeparator separatorVERSTAPPEN = new JSeparator();
		separatorVERSTAPPEN.setBounds(0, 53, 207, 6);
		panelVERSTAPPEN.add(separatorVERSTAPPEN);
		
		JPanel panelRICCIARDO = new JPanel();
		panelRICCIARDO.setLayout(null);
		panelRICCIARDO.setBackground(Color.WHITE);
		panelRICCIARDO.setBounds(10, 89, 207, 60);
		panel_1.add(panelRICCIARDO);
		
		btnRICCIARDO = new JButton("Daniel Ricciardo  >");
		btnRICCIARDO.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnRICCIARDO.setBorder(null);
		btnRICCIARDO.setBackground(Color.WHITE);
		btnRICCIARDO.setBounds(0, 11, 207, 37);
		panelRICCIARDO.add(btnRICCIARDO);
		
		JSeparator separatorRICCIARDO = new JSeparator();
		separatorRICCIARDO.setBounds(0, 53, 207, 6);
		panelRICCIARDO.add(separatorRICCIARDO);
		
		JPanel panelLECLERC = new JPanel();
		panelLECLERC.setLayout(null);
		panelLECLERC.setBackground(Color.WHITE);
		panelLECLERC.setBounds(255, 89, 207, 60);
		panel_1.add(panelLECLERC);
		
		btnLECLERC = new JButton("  Charles Leclerc  >");
		btnLECLERC.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLECLERC.setBorder(null);
		btnLECLERC.setBackground(Color.WHITE);
		btnLECLERC.setBounds(0, 11, 207, 37);
		panelLECLERC.add(btnLECLERC);
		
		JSeparator separatorLECLERC = new JSeparator();
		separatorLECLERC.setBounds(0, 53, 207, 6);
		panelLECLERC.add(separatorLECLERC);
		
		JPanel panelPEREZ = new JPanel();
		panelPEREZ.setLayout(null);
		panelPEREZ.setBackground(Color.WHITE);
		panelPEREZ.setBounds(500, 89, 207, 60);
		panel_1.add(panelPEREZ);
		
		btnPEREZ = new JButton(" Sergio Perez  >");
		btnPEREZ.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnPEREZ.setBorder(null);
		btnPEREZ.setBackground(Color.WHITE);
		btnPEREZ.setBounds(0, 11, 207, 37);
		panelPEREZ.add(btnPEREZ);
		
		JSeparator separatorPEREZ = new JSeparator();
		separatorPEREZ.setBounds(0, 53, 207, 6);
		panelPEREZ.add(separatorPEREZ);
		
		JPanel panelNORRIS = new JPanel();
		panelNORRIS.setLayout(null);
		panelNORRIS.setBackground(Color.WHITE);
		panelNORRIS.setBounds(10, 155, 207, 60);
		panel_1.add(panelNORRIS);
		
		btnNORRIS = new JButton("  Lando Norris  >");
		btnNORRIS.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNORRIS.setBorder(null);
		btnNORRIS.setBackground(Color.WHITE);
		btnNORRIS.setBounds(0, 11, 207, 37);
		panelNORRIS.add(btnNORRIS);
		
		JSeparator separatorNORRIS = new JSeparator();
		separatorNORRIS.setBounds(0, 53, 207, 6);
		panelNORRIS.add(separatorNORRIS);
		
		JPanel panelSAINZ = new JPanel();
		panelSAINZ.setLayout(null);
		panelSAINZ.setBackground(Color.WHITE);
		panelSAINZ.setBounds(255, 155, 207, 60);
		panel_1.add(panelSAINZ);
		
		btnSAINZ = new JButton(" Carlos Sainz  >");
		btnSAINZ.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSAINZ.setBorder(null);
		btnSAINZ.setBackground(Color.WHITE);
		btnSAINZ.setBounds(0, 11, 207, 37);
		panelSAINZ.add(btnSAINZ);
		
		JSeparator separatorSAINZ = new JSeparator();
		separatorSAINZ.setBounds(0, 53, 207, 6);
		panelSAINZ.add(separatorSAINZ);
		
		JPanel panelALBON = new JPanel();
		panelALBON.setLayout(null);
		panelALBON.setBackground(Color.WHITE);
		panelALBON.setBounds(500, 155, 207, 60);
		panel_1.add(panelALBON);
		
		btnALBON = new JButton("  Alexander Albon  >");
		btnALBON.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnALBON.setBorder(null);
		btnALBON.setBackground(Color.WHITE);
		btnALBON.setBounds(0, 11, 207, 37);
		panelALBON.add(btnALBON);
		
		JSeparator separatorALBON = new JSeparator();
		separatorALBON.setBounds(0, 53, 207, 6);
		panelALBON.add(separatorALBON);
		
		JPanel panelGASLY = new JPanel();
		panelGASLY.setLayout(null);
		panelGASLY.setBackground(Color.WHITE);
		panelGASLY.setBounds(10, 217, 207, 60);
		panel_1.add(panelGASLY);
		
		btnGASLY = new JButton(" Pierre Gasly  >");
		btnGASLY.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGASLY.setBorder(null);
		btnGASLY.setBackground(Color.WHITE);
		btnGASLY.setBounds(0, 11, 207, 37);
		panelGASLY.add(btnGASLY);
		
		JSeparator separatorGASLY = new JSeparator();
		separatorGASLY.setBounds(0, 53, 207, 6);
		panelGASLY.add(separatorGASLY);
		
		JPanel panelSTROLL = new JPanel();
		panelSTROLL.setLayout(null);
		panelSTROLL.setBackground(Color.WHITE);
		panelSTROLL.setBounds(10, 279, 207, 60);
		panel_1.add(panelSTROLL);
		
		btnSTROLL = new JButton("  Lance Stroll  >");
		btnSTROLL.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSTROLL.setBorder(null);
		btnSTROLL.setBackground(Color.WHITE);
		btnSTROLL.setBounds(0, 11, 207, 37);
		panelSTROLL.add(btnSTROLL);
		
		JSeparator separatorSTROLL = new JSeparator();
		separatorSTROLL.setBounds(0, 53, 207, 6);
		panelSTROLL.add(separatorSTROLL);
		
		JPanel panelOCON = new JPanel();
		panelOCON.setLayout(null);
		panelOCON.setBackground(Color.WHITE);
		panelOCON.setBounds(500, 217, 207, 60);
		panel_1.add(panelOCON);
		
		btnOCON = new JButton("  Esteban Ocon  >");
		btnOCON.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnOCON.setBorder(null);
		btnOCON.setBackground(Color.WHITE);
		btnOCON.setBounds(0, 11, 207, 37);
		panelOCON.add(btnOCON);
		
		JSeparator separatorOCON = new JSeparator();
		separatorOCON.setBounds(0, 53, 207, 6);
		panelOCON.add(separatorOCON);
		
		JPanel panelKVYAT = new JPanel();
		panelKVYAT.setLayout(null);
		panelKVYAT.setBackground(Color.WHITE);
		panelKVYAT.setBounds(255, 217, 207, 60);
		panel_1.add(panelKVYAT);
		
		btnKVYAT = new JButton(" Daniil Kvyat  >");
		btnKVYAT.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnKVYAT.setBorder(null);
		btnKVYAT.setBackground(Color.WHITE);
		btnKVYAT.setBounds(0, 11, 207, 37);
		panelKVYAT.add(btnKVYAT);
		
		JSeparator separatorKVYAT = new JSeparator();
		separatorKVYAT.setBounds(0, 53, 207, 6);
		panelKVYAT.add(separatorKVYAT);
		
		JPanel panelVETTEL = new JPanel();
		panelVETTEL.setLayout(null);
		panelVETTEL.setBackground(Color.WHITE);
		panelVETTEL.setBounds(255, 279, 207, 60);
		panel_1.add(panelVETTEL);
		
		btnVETTEL = new JButton("  Sebastian Vettel  >");
		btnVETTEL.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnVETTEL.setBorder(null);
		btnVETTEL.setBackground(Color.WHITE);
		btnVETTEL.setBounds(0, 11, 207, 37);
		panelVETTEL.add(btnVETTEL);
		
		JSeparator separatorVETTEL = new JSeparator();
		separatorVETTEL.setBounds(0, 53, 207, 6);
		panelVETTEL.add(separatorVETTEL);
		
		JPanel panelMAGNUSSEN = new JPanel();
		panelMAGNUSSEN.setLayout(null);
		panelMAGNUSSEN.setBackground(Color.WHITE);
		panelMAGNUSSEN.setBounds(500, 279, 207, 60);
		panel_1.add(panelMAGNUSSEN);
		
		btnMAGNUSSEN = new JButton("  Kevin Magnussen  >");
		btnMAGNUSSEN.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnMAGNUSSEN.setBorder(null);
		btnMAGNUSSEN.setBackground(Color.WHITE);
		btnMAGNUSSEN.setBounds(0, 11, 207, 37);
		panelMAGNUSSEN.add(btnMAGNUSSEN);
		
		JSeparator separatorHULKENBERG = new JSeparator();
		separatorHULKENBERG.setBounds(0, 53, 207, 6);
		panelMAGNUSSEN.add(separatorHULKENBERG);
		
		JPanel panelRÄIKKÖNEN = new JPanel();
		panelRÄIKKÖNEN.setLayout(null);
		panelRÄIKKÖNEN.setBackground(Color.WHITE);
		panelRÄIKKÖNEN.setBounds(10, 336, 207, 60);
		panel_1.add(panelRÄIKKÖNEN);
		
		btnRÄIKKÖNEN = new JButton(" Kimi Raikkonen  >");
		btnRÄIKKÖNEN.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnRÄIKKÖNEN.setBorder(null);
		btnRÄIKKÖNEN.setBackground(Color.WHITE);
		btnRÄIKKÖNEN.setBounds(0, 11, 207, 37);
		panelRÄIKKÖNEN.add(btnRÄIKKÖNEN);
		
		JSeparator separatorRÄIKKÖNEN = new JSeparator();
		separatorRÄIKKÖNEN.setBounds(0, 53, 207, 6);
		panelRÄIKKÖNEN.add(separatorRÄIKKÖNEN);
		
		JPanel panelGIOVINAZZI = new JPanel();
		panelGIOVINAZZI.setLayout(null);
		panelGIOVINAZZI.setBackground(Color.WHITE);
		panelGIOVINAZZI.setBounds(255, 336, 207, 60);
		panel_1.add(panelGIOVINAZZI);
		
		btnGIOVINAZZI = new JButton("  Antonio Giovinazzi  >");
		btnGIOVINAZZI.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGIOVINAZZI.setBorder(null);
		btnGIOVINAZZI.setBackground(Color.WHITE);
		btnGIOVINAZZI.setBounds(0, 11, 207, 37);
		panelGIOVINAZZI.add(btnGIOVINAZZI);
		
		JSeparator separatorGIOVINAZZI = new JSeparator();
		separatorGIOVINAZZI.setBounds(0, 53, 207, 6);
		panelGIOVINAZZI.add(separatorGIOVINAZZI);
		
		JPanel panelGROSJEAN = new JPanel();
		panelGROSJEAN.setLayout(null);
		panelGROSJEAN.setBackground(Color.WHITE);
		panelGROSJEAN.setBounds(500, 336, 207, 60);
		panel_1.add(panelGROSJEAN);
		
		btnGROSJEAN = new JButton(" Romain Grosjean  >");
		btnGROSJEAN.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGROSJEAN.setBorder(null);
		btnGROSJEAN.setBackground(Color.WHITE);
		btnGROSJEAN.setBounds(0, 11, 207, 37);
		panelGROSJEAN.add(btnGROSJEAN);
		
		JSeparator separatorGROSJEAN = new JSeparator();
		separatorGROSJEAN.setBounds(0, 53, 207, 6);
		panelGROSJEAN.add(separatorGROSJEAN);
		
		JPanel panelLatifi = new JPanel();
		panelLatifi.setLayout(null);
		panelLatifi.setBackground(Color.WHITE);
		panelLatifi.setBounds(10, 401, 207, 60);
		panel_1.add(panelLatifi);
		
		btnLatifi = new JButton(" Nicholas Latifi  >");
		btnLatifi.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLatifi.setBorder(null);
		btnLatifi.setBackground(Color.WHITE);
		btnLatifi.setBounds(0, 11, 207, 37);
		panelLatifi.add(btnLatifi);
		
		JSeparator separatorLatifi = new JSeparator();
		separatorLatifi.setBounds(0, 53, 207, 6);
		panelLatifi.add(separatorLatifi);
		
		JPanel panelRussell = new JPanel();
		panelRussell.setLayout(null);
		panelRussell.setBackground(Color.WHITE);
		panelRussell.setBounds(255, 401, 207, 60);
		panel_1.add(panelRussell);
		
		btnRussell = new JButton(" George Russell  >");
		btnRussell.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnRussell.setBorder(null);
		btnRussell.setBackground(Color.WHITE);
		btnRussell.setBounds(0, 11, 207, 37);
		panelRussell.add(btnRussell);
		
		JSeparator separatorRussell = new JSeparator();
		separatorRussell.setBounds(0, 53, 207, 6);
		panelRussell.add(separatorRussell);
		
		
		
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
	
	public Piloto getPiloto() {
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

	public JButton getBtnHAMILTON() {
		return btnHAMILTON;
	}

	public void setBtnHAMILTON(JButton btnHAMILTON) {
		this.btnHAMILTON = btnHAMILTON;
	}

	public JButton getBtnBOTTAS() {
		return btnBOTTAS;
	}

	public void setBtnBOTTAS(JButton btnBOTTAS) {
		this.btnBOTTAS = btnBOTTAS;
	}

	public JButton getBtnVERSTAPPEN() {
		return btnVERSTAPPEN;
	}

	public void setBtnVERSTAPPEN(JButton btnVERSTAPPEN) {
		this.btnVERSTAPPEN = btnVERSTAPPEN;
	}

	public JButton getBtnRICCIARDO() {
		return btnRICCIARDO;
	}

	public void setBtnRICCIARDO(JButton btnRICCIARDO) {
		this.btnRICCIARDO = btnRICCIARDO;
	}

	public JButton getBtnLECLERC() {
		return btnLECLERC;
	}

	public void setBtnLECLERC(JButton btnLECLERC) {
		this.btnLECLERC = btnLECLERC;
	}

	public JButton getBtnPEREZ() {
		return btnPEREZ;
	}

	public void setBtnPEREZ(JButton btnPEREZ) {
		this.btnPEREZ = btnPEREZ;
	}

	public JButton getBtnNORRIS() {
		return btnNORRIS;
	}

	public void setBtnNORRIS(JButton btnNORRIS) {
		this.btnNORRIS = btnNORRIS;
	}

	public JButton getBtnSAINZ() {
		return btnSAINZ;
	}

	public void setBtnSAINZ(JButton btnSAINZ) {
		this.btnSAINZ = btnSAINZ;
	}

	public JButton getBtnALBON() {
		return btnALBON;
	}

	public void setBtnALBON(JButton btnALBON) {
		this.btnALBON = btnALBON;
	}

	public JButton getBtnGASLY() {
		return btnGASLY;
	}

	public void setBtnGASLY(JButton btnGASLY) {
		this.btnGASLY = btnGASLY;
	}

	public JButton getBtnSTROLL() {
		return btnSTROLL;
	}

	public void setBtnSTROLL(JButton btnSTROLL) {
		this.btnSTROLL = btnSTROLL;
	}

	public JButton getBtnOCON() {
		return btnOCON;
	}

	public void setBtnOCON(JButton btnOCON) {
		this.btnOCON = btnOCON;
	}

	public JButton getBtnKVYAT() {
		return btnKVYAT;
	}

	public void setBtnKVYAT(JButton btnKVYAT) {
		this.btnKVYAT = btnKVYAT;
	}

	public JButton getBtnVETTEL() {
		return btnVETTEL;
	}

	public void setBtnVETTEL(JButton btnVETTEL) {
		this.btnVETTEL = btnVETTEL;
	}

	public JButton getBtnMAGNUSSEN() {
		return btnMAGNUSSEN;
	}

	public void setBtnMAGNUSSEN(JButton btnMAGNUSSEN) {
		this.btnMAGNUSSEN = btnMAGNUSSEN;
	}

	public JButton getBtnRÄIKKÖNEN() {
		return btnRÄIKKÖNEN;
	}

	public void setBtnRÄIKKÖNEN(JButton btnRÄIKKÖNEN) {
		this.btnRÄIKKÖNEN = btnRÄIKKÖNEN;
	}

	public JButton getBtnGIOVINAZZI() {
		return btnGIOVINAZZI;
	}

	public void setBtnGIOVINAZZI(JButton btnGIOVINAZZI) {
		this.btnGIOVINAZZI = btnGIOVINAZZI;
	}

	public JButton getBtnGROSJEAN() {
		return btnGROSJEAN;
	}

	public void setBtnGROSJEAN(JButton btnGROSJEAN) {
		this.btnGROSJEAN = btnGROSJEAN;
	}

	public JButton getBtnLatifi() {
		return btnLatifi;
	}

	public void setBtnLatifi(JButton btnLatifi) {
		this.btnLatifi = btnLatifi;
	}

	public JButton getBtnRussell() {
		return btnRussell;
	}

	public void setBtnRussell(JButton btnRussell) {
		this.btnRussell = btnRussell;
	}
	
	
	
	
	
}
