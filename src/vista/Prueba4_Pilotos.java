package vista;


import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

public class Prueba4_Pilotos extends JFrame {

	protected JButton btnInicio, btnEscuderias, btnPilotos, btnGranPre, btnClasi, btnLogin, btnLogo;
	protected JPanel menu, contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba4_Pilotos frame = new Prueba4_Pilotos();
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
	public Prueba4_Pilotos() {
this.setIconImage(Toolkit.getDefaultToolkit().getImage(Noticia2.class.getResource("/Imagenes/F1-logo-ventana.png")));
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);

		menu = new JPanel();
		menu.setLayout(null);
		menu.setBackground(new Color(178, 29, 28));
		menu.setBounds(0, 0, 974, 72);
		contentPane.add(menu);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "F1-logo.png"));
		lblLogo.setBounds(10, 11, 133, 48);
		menu.add(lblLogo);

		JButton btnInicio = new JButton("Inicio");
		btnInicio.setForeground(new Color(255, 255, 255));
		btnInicio.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnInicio.setBackground(new Color(59, 45, 45));
		btnInicio.setBounds(144, 11, 74, 48);
		menu.add(btnInicio);

		JButton btnEscuderias = new JButton("Escuderias");
		btnEscuderias.setForeground(new Color(255, 255, 255));
		btnEscuderias.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnEscuderias.setBackground(new Color(59, 45, 45));
		btnEscuderias.setBounds(226, 11, 112, 48);
		menu.add(btnEscuderias);

		JButton btnPilotos = new JButton("Pilotos");
		btnPilotos.setForeground(new Color(255, 255, 255));
		btnPilotos.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnPilotos.setBackground(new Color(59, 45, 45));
		btnPilotos.setBounds(348, 11, 94, 48);
		menu.add(btnPilotos);

		JButton btnGranPre = new JButton("Gran Premio");
		btnGranPre.setForeground(new Color(255, 255, 255));
		btnGranPre.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGranPre.setBackground(new Color(59, 45, 45));
		btnGranPre.setBounds(452, 11, 130, 48);
		menu.add(btnGranPre);

		JButton btnClasi = new JButton("Clasificacion");
		btnClasi.setForeground(new Color(255, 255, 255));
		btnClasi.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnClasi.setBackground(new Color(59, 45, 45));
		btnClasi.setBounds(592, 11, 145, 48);
		menu.add(btnClasi);

		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogin.setBackground(new Color(59, 45, 45));
		btnLogin.setBounds(872, 11, 92, 48);
		menu.add(btnLogin);

		JButton btnSimulacion = new JButton("Simulacion");
		btnSimulacion.setForeground(new Color(255, 255, 255));
		btnSimulacion.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSimulacion.setBackground(new Color(59, 45, 45));
		btnSimulacion.setBounds(747, 11, 115, 48);
		menu.add(btnSimulacion);
		
		
		JPanel panelPilotos = new JPanel();
		panelPilotos.setLayout(null);
		panelPilotos.setPreferredSize(new Dimension(850, 430));
		panelPilotos.setBackground(SystemColor.menu);
		panelPilotos.setBounds(0, 72, 974, 539);
		contentPane.add(panelPilotos);

		JPanel panelHAMILTON = new JPanel();
		panelHAMILTON.setLayout(null);
		panelHAMILTON.setBackground(Color.WHITE);
		panelHAMILTON.setBounds(10, 23, 265, 60);
		panelPilotos.add(panelHAMILTON);

		JButton btnHAMILTON = new JButton("Lewis Hamilton");
		btnHAMILTON.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnHAMILTON.setBorder(null);
		btnHAMILTON.setBackground(Color.WHITE);
		btnHAMILTON.setBounds(0, 11, 178, 37);
		panelHAMILTON.add(btnHAMILTON);

		JSeparator separatorHamilton = new JSeparator();
		separatorHamilton.setBounds(10, 52, 245, 8);
		panelHAMILTON.add(separatorHamilton);

		JLabel lblNº = new JLabel("");
		lblNº.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Hamilton.png"));
		lblNº.setBounds(180, 1, 85, 59);
		panelHAMILTON.add(lblNº);

		JPanel panelBOTTAS = new JPanel();
		panelBOTTAS.setLayout(null);
		panelBOTTAS.setBackground(Color.WHITE);
		panelBOTTAS.setBounds(310, 23, 265, 60);
		panelPilotos.add(panelBOTTAS);

		JButton btnBOTTAS = new JButton("Valtteri Bottas");
		btnBOTTAS.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnBOTTAS.setBorder(null);
		btnBOTTAS.setBackground(Color.WHITE);
		btnBOTTAS.setBounds(0, 11, 178, 37);
		panelBOTTAS.add(btnBOTTAS);

		JSeparator separatorBOTTAS = new JSeparator();
		separatorBOTTAS.setBounds(10, 52, 245, 8);
		panelBOTTAS.add(separatorBOTTAS);

		JLabel lblNº_1 = new JLabel("");
		lblNº_1.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Bottas.png"));
		lblNº_1.setBounds(180, 0, 85, 59);
		panelBOTTAS.add(lblNº_1);

		JPanel panelVERSTAPPEN = new JPanel();
		panelVERSTAPPEN.setLayout(null);
		panelVERSTAPPEN.setBackground(Color.WHITE);
		panelVERSTAPPEN.setBounds(647, 23, 265, 60);
		panelPilotos.add(panelVERSTAPPEN);

		JButton btnVERSTAPPEN = new JButton("Max Verstappen");
		btnVERSTAPPEN.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnVERSTAPPEN.setBorder(null);
		btnVERSTAPPEN.setBackground(Color.WHITE);
		btnVERSTAPPEN.setBounds(0, 11, 178, 37);
		panelVERSTAPPEN.add(btnVERSTAPPEN);

		JSeparator separatorVERSTAPPEN = new JSeparator();
		separatorVERSTAPPEN.setBounds(10, 51, 245, 8);
		panelVERSTAPPEN.add(separatorVERSTAPPEN);

		JLabel lblNº_2 = new JLabel("");
		lblNº_2.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos"+ File.separator + "Verstappen.png"));
		lblNº_2.setBounds(180, 0, 85, 59);
		panelVERSTAPPEN.add(lblNº_2);

		JPanel panelRICCIARDO = new JPanel();
		panelRICCIARDO.setLayout(null);
		panelRICCIARDO.setBackground(Color.WHITE);
		panelRICCIARDO.setBounds(10, 94, 265, 60);
		panelPilotos.add(panelRICCIARDO);

		JButton btnRICCIARDO = new JButton("Daniel Ricciardo");
		btnRICCIARDO.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnRICCIARDO.setBorder(null);
		btnRICCIARDO.setBackground(Color.WHITE);
		btnRICCIARDO.setBounds(0, 11, 178, 37);
		panelRICCIARDO.add(btnRICCIARDO);

		JSeparator separatorRICCIARDO = new JSeparator();
		separatorRICCIARDO.setBounds(10, 51, 245, 8);
		panelRICCIARDO.add(separatorRICCIARDO);

		JLabel lblNº_3 = new JLabel("");
		lblNº_3.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos"+ File.separator + "Ricciardo.png"));
		lblNº_3.setBounds(180, 0, 85, 59);
		panelRICCIARDO.add(lblNº_3);

		JPanel panelLECLERC = new JPanel();
		panelLECLERC.setLayout(null);
		panelLECLERC.setBackground(Color.WHITE);
		panelLECLERC.setBounds(310, 94, 265, 60);
		panelPilotos.add(panelLECLERC);

		JButton btnLECLERC = new JButton("Charles Leclerc");
		btnLECLERC.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLECLERC.setBorder(null);
		btnLECLERC.setBackground(Color.WHITE);
		btnLECLERC.setBounds(0, 11, 178, 37);
		panelLECLERC.add(btnLECLERC);

		JSeparator separatorLECLERC = new JSeparator();
		separatorLECLERC.setBounds(10, 51, 245, 8);
		panelLECLERC.add(separatorLECLERC);

		JLabel lblNº_4 = new JLabel("");
		lblNº_4.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Leclrec.png"));
		lblNº_4.setBounds(180, 0, 85, 59);
		panelLECLERC.add(lblNº_4);

		JPanel panelPEREZ = new JPanel();
		panelPEREZ.setLayout(null);
		panelPEREZ.setBackground(Color.WHITE);
		panelPEREZ.setBounds(647, 94, 265, 60);
		panelPilotos.add(panelPEREZ);

		JButton btnPEREZ = new JButton("Sergio Perez");
		btnPEREZ.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnPEREZ.setBorder(null);
		btnPEREZ.setBackground(Color.WHITE);
		btnPEREZ.setBounds(0, 11, 178, 37);
		panelPEREZ.add(btnPEREZ);

		JSeparator separatorPEREZ = new JSeparator();
		separatorPEREZ.setBounds(10, 51, 245, 8);
		panelPEREZ.add(separatorPEREZ);

		JLabel lblNº_5 = new JLabel("");
		lblNº_5.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Perez.png"));
		lblNº_5.setBounds(180, 0, 85, 59);
		panelPEREZ.add(lblNº_5);

		JPanel panelNORRIS = new JPanel();
		panelNORRIS.setLayout(null);
		panelNORRIS.setBackground(Color.WHITE);
		panelNORRIS.setBounds(10, 165, 265, 60);
		panelPilotos.add(panelNORRIS);

		JButton btnNORRIS = new JButton("Lando Norris");
		btnNORRIS.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNORRIS.setBorder(null);
		btnNORRIS.setBackground(Color.WHITE);
		btnNORRIS.setBounds(0, 11, 178, 37);
		panelNORRIS.add(btnNORRIS);

		JSeparator separatorNORRIS = new JSeparator();
		separatorNORRIS.setBounds(10, 51, 245, 8);
		panelNORRIS.add(separatorNORRIS);

		JLabel lblNº_6 = new JLabel("");
		lblNº_6.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Norris.png"));
		lblNº_6.setBounds(180, 0, 85, 59);
		panelNORRIS.add(lblNº_6);

		JPanel panelSAINZ = new JPanel();
		panelSAINZ.setLayout(null);
		panelSAINZ.setBackground(Color.WHITE);
		panelSAINZ.setBounds(310, 165, 265, 60);
		panelPilotos.add(panelSAINZ);

		JButton btnSAINZ = new JButton("Carlos Sainz JR");
		btnSAINZ.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSAINZ.setBorder(null);
		btnSAINZ.setBackground(Color.WHITE);
		btnSAINZ.setBounds(0, 11, 178, 37);
		panelSAINZ.add(btnSAINZ);

		JSeparator separatorSAINZ = new JSeparator();
		separatorSAINZ.setBounds(10, 51, 245, 8);
		panelSAINZ.add(separatorSAINZ);

		JLabel lblNº_7 = new JLabel("");
		lblNº_7.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Sainz.png"));
		lblNº_7.setBounds(180, 0, 85, 59);
		panelSAINZ.add(lblNº_7);

		JPanel panelALBON = new JPanel();
		panelALBON.setLayout(null);
		panelALBON.setBackground(Color.WHITE);
		panelALBON.setBounds(647, 165, 265, 60);
		panelPilotos.add(panelALBON);

		JButton btnALBON = new JButton("Alexander Albon");
		btnALBON.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnALBON.setBorder(null);
		btnALBON.setBackground(Color.WHITE);
		btnALBON.setBounds(0, 11, 178, 37);
		panelALBON.add(btnALBON);

		JSeparator separatorALBON = new JSeparator();
		separatorALBON.setBounds(10, 51, 245, 8);
		panelALBON.add(separatorALBON);

		JLabel lblNº_8 = new JLabel("");
		lblNº_8.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Albon.png"));
		lblNº_8.setBounds(180, 0, 85, 59);
		panelALBON.add(lblNº_8);

		JPanel panelGASLY = new JPanel();
		panelGASLY.setLayout(null);
		panelGASLY.setBackground(Color.WHITE);
		panelGASLY.setBounds(10, 236, 265, 60);
		panelPilotos.add(panelGASLY);

		JButton btnGASLY = new JButton("Pierre Gasly");
		btnGASLY.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGASLY.setBorder(null);
		btnGASLY.setBackground(Color.WHITE);
		btnGASLY.setBounds(0, 11, 178, 37);
		panelGASLY.add(btnGASLY);

		JSeparator separatorGASLY = new JSeparator();
		separatorGASLY.setBounds(10, 51, 245, 8);
		panelGASLY.add(separatorGASLY);

		JLabel lblNº_16_1 = new JLabel("");
		lblNº_16_1.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Gasly.png"));
		lblNº_16_1.setBounds(180, 0, 85, 59);
		panelGASLY.add(lblNº_16_1);

		JPanel panelSTROLL = new JPanel();
		panelSTROLL.setLayout(null);
		panelSTROLL.setBackground(Color.WHITE);
		panelSTROLL.setBounds(647, 378, 265, 60);
		panelPilotos.add(panelSTROLL);

		JButton btnSTROLL = new JButton("Lance Stroll");
		btnSTROLL.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSTROLL.setBorder(null);
		btnSTROLL.setBackground(Color.WHITE);
		btnSTROLL.setBounds(0, 11, 178, 37);
		panelSTROLL.add(btnSTROLL);

		JSeparator separatorSTROLL = new JSeparator();
		separatorSTROLL.setBounds(10, 49, 245, 10);
		panelSTROLL.add(separatorSTROLL);

		JLabel lblNº_17 = new JLabel("");
		lblNº_17.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Stroll.png"));
		lblNº_17.setBounds(180, 0, 85, 49);
		panelSTROLL.add(lblNº_17);

		JPanel panelOCON = new JPanel();
		panelOCON.setLayout(null);
		panelOCON.setBackground(Color.WHITE);
		panelOCON.setBounds(310, 378, 265, 60);
		panelPilotos.add(panelOCON);

		JButton btnOCON = new JButton("Esteban Ocon");
		btnOCON.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnOCON.setBorder(null);
		btnOCON.setBackground(Color.WHITE);
		btnOCON.setBounds(0, 11, 178, 37);
		panelOCON.add(btnOCON);

		JSeparator separatorOCON = new JSeparator();
		separatorOCON.setBounds(10, 51, 245, 8);
		panelOCON.add(separatorOCON);

		JLabel lblNº_16 = new JLabel("");
		lblNº_16.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Ocon.png"));
		lblNº_16.setBounds(180, 0, 85, 59);
		panelOCON.add(lblNº_16);

		JPanel panelKVYAT = new JPanel();
		panelKVYAT.setLayout(null);
		panelKVYAT.setBackground(Color.WHITE);
		panelKVYAT.setBounds(310, 236, 265, 60);
		panelPilotos.add(panelKVYAT);

		JButton btnKVYAT = new JButton("Daniil Kvyat");
		btnKVYAT.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnKVYAT.setBorder(null);
		btnKVYAT.setBackground(Color.WHITE);
		btnKVYAT.setBounds(0, 11, 178, 37);
		panelKVYAT.add(btnKVYAT);

		JSeparator separatorKVYAT = new JSeparator();
		separatorKVYAT.setBounds(10, 51, 245, 8);
		panelKVYAT.add(separatorKVYAT);

		JLabel lblNº_10 = new JLabel("");
		lblNº_10.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Kvyat.png"));
		lblNº_10.setBounds(180, 0, 85, 59);
		panelKVYAT.add(lblNº_10);

		JPanel panelVETTEL = new JPanel();
		panelVETTEL.setLayout(null);
		panelVETTEL.setBackground(Color.WHITE);
		panelVETTEL.setBounds(647, 236, 265, 60);
		panelPilotos.add(panelVETTEL);

		JButton btnVETTEL = new JButton("Sebastian Vettel");
		btnVETTEL.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnVETTEL.setBorder(null);
		btnVETTEL.setBackground(Color.WHITE);
		btnVETTEL.setBounds(0, 11, 178, 37);
		panelVETTEL.add(btnVETTEL);

		JSeparator separatorVETTEL = new JSeparator();
		separatorVETTEL.setBounds(10, 51, 245, 8);
		panelVETTEL.add(separatorVETTEL);

		JLabel lblNº_11 = new JLabel("");
		lblNº_11.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Vettel.png"));
		lblNº_11.setBounds(180, 0, 85, 59);
		panelVETTEL.add(lblNº_11);

		JPanel panelMAGNUSSEN = new JPanel();
		panelMAGNUSSEN.setLayout(null);
		panelMAGNUSSEN.setBackground(Color.WHITE);
		panelMAGNUSSEN.setBounds(10, 307, 265, 60);
		panelPilotos.add(panelMAGNUSSEN);

		JButton btnMAGNUSSEN = new JButton("Kevin Magnussen");
		btnMAGNUSSEN.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnMAGNUSSEN.setBorder(null);
		btnMAGNUSSEN.setBackground(Color.WHITE);
		btnMAGNUSSEN.setBounds(0, 11, 178, 37);
		panelMAGNUSSEN.add(btnMAGNUSSEN);

		JSeparator separatorMagnussen = new JSeparator();
		separatorMagnussen.setBounds(10, 52, 245, 8);
		panelMAGNUSSEN.add(separatorMagnussen);

		JLabel lblNº_12 = new JLabel("");
		lblNº_12.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos"+ File.separator + "Magnussen.png"));
		lblNº_12.setBounds(180, 0, 85, 49);
		panelMAGNUSSEN.add(lblNº_12);

		JPanel panelRÄIKKÖNEN = new JPanel();
		panelRÄIKKÖNEN.setLayout(null);
		panelRÄIKKÖNEN.setBackground(Color.WHITE);
		panelRÄIKKÖNEN.setBounds(310, 307, 265, 60);
		panelPilotos.add(panelRÄIKKÖNEN);

		JButton btnRÄIKKÖNEN = new JButton("Kimi Raikkonen");
		btnRÄIKKÖNEN.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnRÄIKKÖNEN.setBorder(null);
		btnRÄIKKÖNEN.setBackground(Color.WHITE);
		btnRÄIKKÖNEN.setBounds(0, 11, 178, 37);
		panelRÄIKKÖNEN.add(btnRÄIKKÖNEN);

		JSeparator separatorRÄIKKÖNEN = new JSeparator();
		separatorRÄIKKÖNEN.setBounds(10, 50, 245, 9);
		panelRÄIKKÖNEN.add(separatorRÄIKKÖNEN);

		JLabel lblNº_13 = new JLabel("");
		lblNº_13.setBounds(190, -1, 75, 49);
		panelRÄIKKÖNEN.add(lblNº_13);
		lblNº_13.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos"+ File.separator + "Raikkonen.png"));

		JPanel panelGIOVINAZZI = new JPanel();
		panelGIOVINAZZI.setLayout(null);
		panelGIOVINAZZI.setBackground(Color.WHITE);
		panelGIOVINAZZI.setBounds(647, 307, 265, 60);
		panelPilotos.add(panelGIOVINAZZI);

		JButton btnGIOVINAZZI = new JButton("Antonio Giovinazzi");
		btnGIOVINAZZI.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGIOVINAZZI.setBorder(null);
		btnGIOVINAZZI.setBackground(Color.WHITE);
		btnGIOVINAZZI.setBounds(0, 11, 178, 37);
		panelGIOVINAZZI.add(btnGIOVINAZZI);

		JSeparator separatorGIOVINAZZI = new JSeparator();
		separatorGIOVINAZZI.setBounds(10, 51, 245, 8);
		panelGIOVINAZZI.add(separatorGIOVINAZZI);

		JLabel lblNº_14 = new JLabel("");
		lblNº_14.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos"+ File.separator + "Giovinnazzi.png"));
		lblNº_14.setBounds(180, 0, 85, 59);
		panelGIOVINAZZI.add(lblNº_14);

		JPanel panelGROSJEAN = new JPanel();
		panelGROSJEAN.setLayout(null);
		panelGROSJEAN.setBackground(Color.WHITE);
		panelGROSJEAN.setBounds(10, 378, 265, 60);
		panelPilotos.add(panelGROSJEAN);

		JButton btnGROSJEAN = new JButton("Romain Grosjean");
		btnGROSJEAN.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGROSJEAN.setBorder(null);
		btnGROSJEAN.setBackground(Color.WHITE);
		btnGROSJEAN.setBounds(0, 11, 178, 37);
		panelGROSJEAN.add(btnGROSJEAN);

		JSeparator separatorGROSJEAN = new JSeparator();
		separatorGROSJEAN.setBounds(10, 51, 245, 8);
		panelGROSJEAN.add(separatorGROSJEAN);

		JLabel lblNº_15 = new JLabel("");
		lblNº_15.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Grosjean.png"));
		lblNº_15.setBounds(180, 0, 85, 59);
		panelGROSJEAN.add(lblNº_15);

		JPanel panelLatifi = new JPanel();
		panelLatifi.setLayout(null);
		panelLatifi.setBackground(Color.WHITE);
		panelLatifi.setBounds(310, 449, 265, 60);
		panelPilotos.add(panelLatifi);

		JButton btnLatifi = new JButton("Nicholas Latifi");
		btnLatifi.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLatifi.setBorder(null);
		btnLatifi.setBackground(Color.WHITE);
		btnLatifi.setBounds(0, 11, 178, 37);
		panelLatifi.add(btnLatifi);

		JSeparator separatorLatifi = new JSeparator();
		separatorLatifi.setBounds(10, 50, 245, 9);
		panelLatifi.add(separatorLatifi);

		JLabel lblNº_19 = new JLabel("");
		lblNº_19.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Latifi.png"));
		lblNº_19.setBounds(180, 0, 85, 49);
		panelLatifi.add(lblNº_19);

		JPanel panelRussell = new JPanel();
		panelRussell.setLayout(null);
		panelRussell.setBackground(Color.WHITE);
		panelRussell.setBounds(10, 449, 265, 60);
		panelPilotos.add(panelRussell);

		JButton btnRussell = new JButton("George Russell");
		btnRussell.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnRussell.setBorder(null);
		btnRussell.setBackground(Color.WHITE);
		btnRussell.setBounds(0, 11, 178, 37);
		panelRussell.add(btnRussell);

		JSeparator separatorRussell = new JSeparator();
		separatorRussell.setBounds(10, 51, 245, 8);
		panelRussell.add(separatorRussell);

		JLabel lblNº_18 = new JLabel("");
		lblNº_18.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Russell.png"));
		lblNº_18.setBounds(180, 0, 85, 49);
		panelRussell.add(lblNº_18);

		JLabel lblFondo = new JLabel();
		lblFondo.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Fondos" + File.separator + "Fondo6.PNG"));
		lblFondo.setBounds(0, 0, 974, 539);
		panelPilotos.add(lblFondo);
	}

}
