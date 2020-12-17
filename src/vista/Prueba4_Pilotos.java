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

		JLabel lblN� = new JLabel("");
		lblN�.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Hamilton.png"));
		lblN�.setBounds(180, 1, 85, 59);
		panelHAMILTON.add(lblN�);

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

		JLabel lblN�_1 = new JLabel("");
		lblN�_1.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Bottas.png"));
		lblN�_1.setBounds(180, 0, 85, 59);
		panelBOTTAS.add(lblN�_1);

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

		JLabel lblN�_2 = new JLabel("");
		lblN�_2.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos"+ File.separator + "Verstappen.png"));
		lblN�_2.setBounds(180, 0, 85, 59);
		panelVERSTAPPEN.add(lblN�_2);

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

		JLabel lblN�_3 = new JLabel("");
		lblN�_3.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos"+ File.separator + "Ricciardo.png"));
		lblN�_3.setBounds(180, 0, 85, 59);
		panelRICCIARDO.add(lblN�_3);

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

		JLabel lblN�_4 = new JLabel("");
		lblN�_4.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Leclrec.png"));
		lblN�_4.setBounds(180, 0, 85, 59);
		panelLECLERC.add(lblN�_4);

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

		JLabel lblN�_5 = new JLabel("");
		lblN�_5.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Perez.png"));
		lblN�_5.setBounds(180, 0, 85, 59);
		panelPEREZ.add(lblN�_5);

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

		JLabel lblN�_6 = new JLabel("");
		lblN�_6.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Norris.png"));
		lblN�_6.setBounds(180, 0, 85, 59);
		panelNORRIS.add(lblN�_6);

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

		JLabel lblN�_7 = new JLabel("");
		lblN�_7.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Sainz.png"));
		lblN�_7.setBounds(180, 0, 85, 59);
		panelSAINZ.add(lblN�_7);

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

		JLabel lblN�_8 = new JLabel("");
		lblN�_8.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Albon.png"));
		lblN�_8.setBounds(180, 0, 85, 59);
		panelALBON.add(lblN�_8);

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

		JLabel lblN�_16_1 = new JLabel("");
		lblN�_16_1.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Gasly.png"));
		lblN�_16_1.setBounds(180, 0, 85, 59);
		panelGASLY.add(lblN�_16_1);

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

		JLabel lblN�_17 = new JLabel("");
		lblN�_17.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Stroll.png"));
		lblN�_17.setBounds(180, 0, 85, 49);
		panelSTROLL.add(lblN�_17);

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

		JLabel lblN�_16 = new JLabel("");
		lblN�_16.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Ocon.png"));
		lblN�_16.setBounds(180, 0, 85, 59);
		panelOCON.add(lblN�_16);

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

		JLabel lblN�_10 = new JLabel("");
		lblN�_10.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Kvyat.png"));
		lblN�_10.setBounds(180, 0, 85, 59);
		panelKVYAT.add(lblN�_10);

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

		JLabel lblN�_11 = new JLabel("");
		lblN�_11.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Vettel.png"));
		lblN�_11.setBounds(180, 0, 85, 59);
		panelVETTEL.add(lblN�_11);

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

		JLabel lblN�_12 = new JLabel("");
		lblN�_12.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos"+ File.separator + "Magnussen.png"));
		lblN�_12.setBounds(180, 0, 85, 49);
		panelMAGNUSSEN.add(lblN�_12);

		JPanel panelR�IKK�NEN = new JPanel();
		panelR�IKK�NEN.setLayout(null);
		panelR�IKK�NEN.setBackground(Color.WHITE);
		panelR�IKK�NEN.setBounds(310, 307, 265, 60);
		panelPilotos.add(panelR�IKK�NEN);

		JButton btnR�IKK�NEN = new JButton("Kimi Raikkonen");
		btnR�IKK�NEN.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnR�IKK�NEN.setBorder(null);
		btnR�IKK�NEN.setBackground(Color.WHITE);
		btnR�IKK�NEN.setBounds(0, 11, 178, 37);
		panelR�IKK�NEN.add(btnR�IKK�NEN);

		JSeparator separatorR�IKK�NEN = new JSeparator();
		separatorR�IKK�NEN.setBounds(10, 50, 245, 9);
		panelR�IKK�NEN.add(separatorR�IKK�NEN);

		JLabel lblN�_13 = new JLabel("");
		lblN�_13.setBounds(190, -1, 75, 49);
		panelR�IKK�NEN.add(lblN�_13);
		lblN�_13.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos"+ File.separator + "Raikkonen.png"));

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

		JLabel lblN�_14 = new JLabel("");
		lblN�_14.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos"+ File.separator + "Giovinnazzi.png"));
		lblN�_14.setBounds(180, 0, 85, 59);
		panelGIOVINAZZI.add(lblN�_14);

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

		JLabel lblN�_15 = new JLabel("");
		lblN�_15.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Grosjean.png"));
		lblN�_15.setBounds(180, 0, 85, 59);
		panelGROSJEAN.add(lblN�_15);

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

		JLabel lblN�_19 = new JLabel("");
		lblN�_19.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Latifi.png"));
		lblN�_19.setBounds(180, 0, 85, 49);
		panelLatifi.add(lblN�_19);

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

		JLabel lblN�_18 = new JLabel("");
		lblN�_18.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Russell.png"));
		lblN�_18.setBounds(180, 0, 85, 49);
		panelRussell.add(lblN�_18);

		JLabel lblFondo = new JLabel();
		lblFondo.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Fondos" + File.separator + "Fondo6.PNG"));
		lblFondo.setBounds(0, 0, 974, 539);
		panelPilotos.add(lblFondo);
	}

}
