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

public class Piloto extends JFrame {

	private JPanel contentPane;
	public  JButton btnInicio,btnEscuderias,btnPilotos,btnGranPre,btnClasi,btnLogin;

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
		
		JButton btnHAMILTON = new JButton("  Lewis Hamilton  >");
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
		
		JButton btnBOTTAS = new JButton("  Valtteri Bottas  >");
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
		
		JButton btnVERSTAPPEN = new JButton("  Max Verstappen  >");
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
		
		JButton btnRICCIARDO = new JButton("Daniel Ricciardo  >");
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
		
		JButton btnLECLERC = new JButton("  Charles Leclerc  >");
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
		
		JButton btnPEREZ = new JButton(" Sergio Perez  >");
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
		
		JButton btnNORRIS = new JButton("  Lando Norris  >");
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
		
		JButton btnSAINZ = new JButton(" Carlos Sainz  >");
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
		
		JButton btnALBON = new JButton("  Alexander Albon  >");
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
		
		JButton btnGASLY = new JButton(" Pierre Gasly  >");
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
		
		JButton btnSTROLL = new JButton("  Lance Stroll  >");
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
		
		JButton btnOCON = new JButton("  Esteban Ocon  >");
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
		
		JButton btnKVYAT = new JButton(" Daniil Kvyat  >");
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
		
		JButton btnVETTEL = new JButton("  Sebastian Vettel  >");
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
		
		JButton btnMAGNUSSEN = new JButton("  Kevin Magnussen  >");
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
		
		JButton btnRÄIKKÖNEN = new JButton(" Kimi Raikkonen  >");
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
		
		JButton btnGIOVINAZZI = new JButton("  Antonio Giovinazzi  >");
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
		
		JButton btnGROSJEAN = new JButton(" Romain Grosjean  >");
		btnGROSJEAN.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGROSJEAN.setBorder(null);
		btnGROSJEAN.setBackground(Color.WHITE);
		btnGROSJEAN.setBounds(0, 11, 207, 37);
		panelGROSJEAN.add(btnGROSJEAN);
		
		JSeparator separatorGROSJEAN = new JSeparator();
		separatorGROSJEAN.setBounds(0, 53, 207, 6);
		panelGROSJEAN.add(separatorGROSJEAN);
		
		JPanel panelGROSJEAN_1 = new JPanel();
		panelGROSJEAN_1.setLayout(null);
		panelGROSJEAN_1.setBackground(Color.WHITE);
		panelGROSJEAN_1.setBounds(10, 401, 207, 60);
		panel_1.add(panelGROSJEAN_1);
		
		JButton btnGROSJEAN_1 = new JButton(" Romain Grosjean  >");
		btnGROSJEAN_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGROSJEAN_1.setBorder(null);
		btnGROSJEAN_1.setBackground(Color.WHITE);
		btnGROSJEAN_1.setBounds(0, 11, 207, 37);
		panelGROSJEAN_1.add(btnGROSJEAN_1);
		
		JSeparator separatorGROSJEAN_1 = new JSeparator();
		separatorGROSJEAN_1.setBounds(0, 53, 207, 6);
		panelGROSJEAN_1.add(separatorGROSJEAN_1);
		
		JPanel panelGROSJEAN_2 = new JPanel();
		panelGROSJEAN_2.setLayout(null);
		panelGROSJEAN_2.setBackground(Color.WHITE);
		panelGROSJEAN_2.setBounds(255, 401, 207, 60);
		panel_1.add(panelGROSJEAN_2);
		
		JButton btnGROSJEAN_2 = new JButton(" Romain Grosjean  >");
		btnGROSJEAN_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGROSJEAN_2.setBorder(null);
		btnGROSJEAN_2.setBackground(Color.WHITE);
		btnGROSJEAN_2.setBounds(0, 11, 207, 37);
		panelGROSJEAN_2.add(btnGROSJEAN_2);
		
		JSeparator separatorGROSJEAN_2 = new JSeparator();
		separatorGROSJEAN_2.setBounds(0, 53, 207, 6);
		panelGROSJEAN_2.add(separatorGROSJEAN_2);
		
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
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 11, 134, 48);
		PanelMenu.add(lblNewLabel_4);
	}
}
