package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import logica.Controlador;
import modelo.Escuderia;
import modelo.Piloto;

public class Inicio extends Cabecera {

	private JButton btnAlfaRomeo, btnAlphaTauri, btnNFerrari, btnHaas, btnMclaren, btnMercedes, btnRacingPonit,
			btnRedBull, btnRenault, btnWilliams;
	private JTextField txtNombre,txtNacionalidad,txtNacimiento,txtPalmares,txtEscuderia,txtEstado,txtPodios;
	private JTextPane txtBiblio;

	

	/**
	 * Launch the application.
	 * 
	 * @throws FileNotFoundException
	 * @throws JavaLayerException
	 */
//	public static void main(String[] args) throws FileNotFoundException {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Inicio frame = new Inicio();
//					frame.setVisible(true);
//
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */

	public void escuderia(Controlador controlador) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelEscuderia = new JPanel();
		panelEscuderia.setBounds(0, 72, 974, 539);
		contentPane.add(panelEscuderia);
		panelEscuderia.setLayout(null);
		
		JPanel panelMercedes = new JPanel();
		panelMercedes.setBackground(Color.WHITE);
		panelMercedes.setBounds(10, 11, 270, 121);
		panelEscuderia.add(panelMercedes);
		panelMercedes.setLayout(null);
		
		JButton btnMercedes = new JButton("1");
		btnMercedes.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Mercedes.png"));
		btnMercedes.setBounds(0, 0, 270, 121);
		panelMercedes.add(btnMercedes);
		
		JPanel panelRedBull = new JPanel();
		panelRedBull.setLayout(null);
		panelRedBull.setBackground(Color.WHITE);
		panelRedBull.setBounds(10, 143, 270, 121);
		panelEscuderia.add(panelRedBull);
		
		JButton btnRedBull = new JButton("3");
		btnRedBull.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"RedBull.png"));
		btnRedBull.setBounds(0, 0, 270, 121);
		panelRedBull.add(btnRedBull);
		
		JPanel panelMclaren = new JPanel();
		panelMclaren.setLayout(null);
		panelMclaren.setBackground(Color.WHITE);
		panelMclaren.setBounds(10, 275, 270, 121);
		panelEscuderia.add(panelMclaren);
		
		JButton btnMclaren = new JButton("5");
		btnMclaren.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Mclaren.png"));
		btnMclaren.setBounds(0, 0, 270, 121);
		panelMclaren.add(btnMclaren);
		
		JPanel panelRacingPoint = new JPanel();
		panelRacingPoint.setLayout(null);
		panelRacingPoint.setBackground(Color.WHITE);
		panelRacingPoint.setBounds(10, 407, 270, 121);
		panelEscuderia.add(panelRacingPoint);
		
		JButton btnRacingPoint = new JButton("4");
		btnRacingPoint.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"RacingPoint.png"));
		btnRacingPoint.setBounds(0, 0, 270, 121);
		panelRacingPoint.add(btnRacingPoint);
		
		JPanel panelRenault = new JPanel();
		panelRenault.setLayout(null);
		panelRenault.setBackground(Color.WHITE);
		panelRenault.setBounds(355, 11, 270, 121);
		panelEscuderia.add(panelRenault);
		
		JButton btnRenault = new JButton("6");
		btnRenault.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Renault.png"));
		btnRenault.setBounds(0, 0, 270, 121);
		panelRenault.add(btnRenault);
		
		JPanel panelFerrari = new JPanel();
		panelFerrari.setLayout(null);
		panelFerrari.setBackground(Color.WHITE);
		panelFerrari.setBounds(355, 143, 270, 121);
		panelEscuderia.add(panelFerrari);
		
		JButton btnFerrari = new JButton("2");
		btnFerrari.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"ferrari.png"));
		btnFerrari.setBounds(0, 0, 270, 121);
		panelFerrari.add(btnFerrari);
		
		JPanel panelAlphatauri = new JPanel();
		panelAlphatauri.setLayout(null);
		panelAlphatauri.setBackground(Color.WHITE);
		panelAlphatauri.setBounds(355, 275, 270, 121);
		panelEscuderia.add(panelAlphatauri);
		
		JButton btnAlphatauri = new JButton("7");
		btnAlphatauri.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"AlphaTauri.png"));
		btnAlphatauri.setBounds(0, 0, 270, 121);
		panelAlphatauri.add(btnAlphatauri);
		
		JPanel panelAlfaRomeo = new JPanel();
		panelAlfaRomeo.setLayout(null);
		panelAlfaRomeo.setBackground(Color.WHITE);
		panelAlfaRomeo.setBounds(355, 407, 270, 121);
		panelEscuderia.add(panelAlfaRomeo);
		
		JButton btnAlfaRomeo = new JButton("8");
		btnAlfaRomeo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Alfa Romeo.PNG"));
		btnAlfaRomeo.setBounds(0, 0, 270, 121);
		panelAlfaRomeo.add(btnAlfaRomeo);
		
		JPanel panelHaas = new JPanel();
		panelHaas.setLayout(null);
		panelHaas.setBackground(Color.WHITE);
		panelHaas.setBounds(694, 11, 270, 121);
		panelEscuderia.add(panelHaas);
		
		JButton btnHaas = new JButton("9");
		btnHaas.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"haas.png"));
		btnHaas.setBounds(0, 0, 270, 121);
		panelHaas.add(btnHaas);
		
		JPanel panelWilliams = new JPanel();
		panelWilliams.setLayout(null);
		panelWilliams.setBackground(Color.WHITE);
		panelWilliams.setBounds(694, 143, 270, 121);
		panelEscuderia.add(panelWilliams);
		
		JButton btnWilliams = new JButton("10");
		btnWilliams.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Williams.png"));
		btnWilliams.setBounds(0, 0, 270, 121);
		panelWilliams.add(btnWilliams);
		
		JLabel lblFondo = new JLabel();
		lblFondo.setBounds(0, 0, 974, 539);
		panelEscuderia.add(lblFondo);
		lblFondo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.PNG"));
	

		menu(controlador);
	}

	public void inicio(Controlador controlador) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JSlider slider = new JSlider();
		slider.setBounds(80, 364, 200, 26);
		contentPane.add(slider);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(24, 364, 46, 26);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("imagen");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setBounds(24, 87, 277, 163);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Titulo");
		lblNewLabel_2.setBounds(24, 261, 244, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblDescripcion = new JLabel("descripcion");
		lblDescripcion.setBounds(25, 286, 253, 26);
		contentPane.add(lblDescripcion);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(545, 87, 200, 240);
		contentPane.add(lblNewLabel_3);
		menu(controlador);

	}

	public void piloto(Controlador controlador) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		menu(controlador);

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
		btnHAMILTON.addActionListener(controlador);
		btnHAMILTON.setBackground(Color.WHITE);
		btnHAMILTON.setBounds(0, 11, 178, 37);
		panelHAMILTON.add(btnHAMILTON);
		
		JSeparator separatorHamilton = new JSeparator();
		separatorHamilton.setBounds(10, 52, 245, 8);
		panelHAMILTON.add(separatorHamilton);
		
		JLabel lblNº = new JLabel("");
		lblNº.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Hamilton.png"));
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
		btnBOTTAS.addActionListener(controlador);
		btnBOTTAS.setBounds(0, 11, 178, 37);
		panelBOTTAS.add(btnBOTTAS);
		
		JSeparator separatorBOTTAS = new JSeparator();
		separatorBOTTAS.setBounds(10, 52, 245, 8);
		panelBOTTAS.add(separatorBOTTAS);
		
		JLabel lblNº_1 = new JLabel("");
		lblNº_1.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Bottas.png"));
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
		btnVERSTAPPEN.addActionListener(controlador);
		btnVERSTAPPEN.setBounds(0, 11, 178, 37);
		panelVERSTAPPEN.add(btnVERSTAPPEN);
		
		JSeparator separatorVERSTAPPEN = new JSeparator();
		separatorVERSTAPPEN.setBounds(10, 51, 245, 8);
		panelVERSTAPPEN.add(separatorVERSTAPPEN);
		
		JLabel lblNº_2 = new JLabel("");
		lblNº_2.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Verstappen.png"));
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
		btnRICCIARDO.addActionListener(controlador);
		btnRICCIARDO.setBounds(0, 11, 178, 37);
		panelRICCIARDO.add(btnRICCIARDO);
		
		JSeparator separatorRICCIARDO = new JSeparator();
		separatorRICCIARDO.setBounds(10, 51, 245, 8);
		panelRICCIARDO.add(separatorRICCIARDO);
		
		JLabel lblNº_3 = new JLabel("");
		lblNº_3.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Ricciardo.png"));
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
		btnLECLERC.addActionListener(controlador);
		btnLECLERC.setBounds(0, 11, 178, 37);
		panelLECLERC.add(btnLECLERC);
		
		JSeparator separatorLECLERC = new JSeparator();
		separatorLECLERC.setBounds(10, 51, 245, 8);
		panelLECLERC.add(separatorLECLERC);
		
		JLabel lblNº_4 = new JLabel("");
		lblNº_4.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Leclrec.png"));
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
		btnPEREZ.addActionListener(controlador);
		btnPEREZ.setBounds(0, 11, 178, 37);
		panelPEREZ.add(btnPEREZ);
		
		JSeparator separatorPEREZ = new JSeparator();
		separatorPEREZ.setBounds(10, 51, 245, 8);
		panelPEREZ.add(separatorPEREZ);
		
		JLabel lblNº_5 = new JLabel("");
		lblNº_5.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Perez.png"));
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
		btnNORRIS.addActionListener(controlador);
		btnNORRIS.setBounds(0, 11, 178, 37);
		panelNORRIS.add(btnNORRIS);
		
		JSeparator separatorNORRIS = new JSeparator();
		separatorNORRIS.setBounds(10, 51, 245, 8);
		panelNORRIS.add(separatorNORRIS);
		
		JLabel lblNº_6 = new JLabel("");
		lblNº_6.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Norris.png"));
		lblNº_6.setBounds(180, 0, 85, 59);
		panelNORRIS.add(lblNº_6);
		
		JPanel panelSAINZ = new JPanel();
		panelSAINZ.setLayout(null);
		panelSAINZ.setBackground(Color.WHITE);
		panelSAINZ.setBounds(310, 165, 265, 60);
		panelPilotos.add(panelSAINZ);
		
		JButton btnSAINZ = new JButton("Carlos Sainz");
		btnSAINZ.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSAINZ.setBorder(null);
		btnSAINZ.setBackground(Color.WHITE);
		btnSAINZ.addActionListener(controlador);
		btnSAINZ.setBounds(0, 11, 178, 37);
		panelSAINZ.add(btnSAINZ);
		
		JSeparator separatorSAINZ = new JSeparator();
		separatorSAINZ.setBounds(10, 51, 245, 8);
		panelSAINZ.add(separatorSAINZ);
		
		JLabel lblNº_7 = new JLabel("");
		lblNº_7.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Sainz.png"));
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
		btnALBON.addActionListener(controlador);
		btnALBON.setBounds(0, 11, 178, 37);
		panelALBON.add(btnALBON);
		
		JSeparator separatorALBON = new JSeparator();
		separatorALBON.setBounds(10, 51, 245, 8);
		panelALBON.add(separatorALBON);
		
		JLabel lblNº_8 = new JLabel("");
		lblNº_8.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Albon.png"));
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
		btnGASLY.addActionListener(controlador);
		btnGASLY.setBounds(0, 11, 178, 37);
		panelGASLY.add(btnGASLY);
		
		JSeparator separatorGASLY = new JSeparator();
		separatorGASLY.setBounds(10, 51, 245, 8);
		panelGASLY.add(separatorGASLY);
		
		JLabel lblNº_16_1 = new JLabel("");
		lblNº_16_1.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Gasly.png"));
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
		btnSTROLL.addActionListener(controlador);
		btnSTROLL.setBounds(0, 11, 178, 37);
		panelSTROLL.add(btnSTROLL);
		
		JSeparator separatorSTROLL = new JSeparator();
		separatorSTROLL.setBounds(10, 49, 245, 10);
		panelSTROLL.add(separatorSTROLL);
		
		JLabel lblNº_17 = new JLabel("");
		lblNº_17.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Stroll.png"));
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
		btnOCON.addActionListener(controlador);
		btnOCON.setBounds(0, 11, 178, 37);
		panelOCON.add(btnOCON);
		
		JSeparator separatorOCON = new JSeparator();
		separatorOCON.setBounds(10, 51, 245, 8);
		panelOCON.add(separatorOCON);
		
		JLabel lblNº_16 = new JLabel("");
		lblNº_16.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Ocon.png"));
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
		btnKVYAT.addActionListener(controlador);
		btnKVYAT.setBounds(0, 11, 178, 37);
		panelKVYAT.add(btnKVYAT);
		
		JSeparator separatorKVYAT = new JSeparator();
		separatorKVYAT.setBounds(10, 51, 245, 8);
		panelKVYAT.add(separatorKVYAT);
		
		JLabel lblNº_10 = new JLabel("");
		lblNº_10.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Kvyat.png"));
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
		btnVETTEL.addActionListener(controlador);
		btnVETTEL.setBounds(0, 11, 178, 37);
		panelVETTEL.add(btnVETTEL);
		
		JSeparator separatorVETTEL = new JSeparator();
		separatorVETTEL.setBounds(10, 51, 245, 8);
		panelVETTEL.add(separatorVETTEL);
		
		JLabel lblNº_11 = new JLabel("");
		lblNº_11.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Vettel.png"));
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
		btnMAGNUSSEN.addActionListener(controlador);
		btnMAGNUSSEN.setBounds(0, 11, 178, 37);
		panelMAGNUSSEN.add(btnMAGNUSSEN);
		
		JSeparator separatorMagnussen = new JSeparator();
		separatorMagnussen.setBounds(10, 52, 245, 8);
		panelMAGNUSSEN.add(separatorMagnussen);
		
		JLabel lblNº_12 = new JLabel("");
		lblNº_12.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Magnussen.png"));
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
		btnRÄIKKÖNEN.addActionListener(controlador);
		btnRÄIKKÖNEN.setBounds(0, 11, 178, 37);
		panelRÄIKKÖNEN.add(btnRÄIKKÖNEN);
		
		JSeparator separatorRÄIKKÖNEN = new JSeparator();
		separatorRÄIKKÖNEN.setBounds(10, 50, 245, 9);
		panelRÄIKKÖNEN.add(separatorRÄIKKÖNEN);
		
		JLabel lblNº_13 = new JLabel("");
		lblNº_13.setBounds(190, -1, 75, 49);
		panelRÄIKKÖNEN.add(lblNº_13);
		lblNº_13.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Raikkonen.png"));
		
		JPanel panelGIOVINAZZI = new JPanel();
		panelGIOVINAZZI.setLayout(null);
		panelGIOVINAZZI.setBackground(Color.WHITE);
		panelGIOVINAZZI.setBounds(647, 307, 265, 60);
		panelPilotos.add(panelGIOVINAZZI);
		
		JButton btnGIOVINAZZI = new JButton("Antonio Giovinazzi");
		btnGIOVINAZZI.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGIOVINAZZI.setBorder(null);
		btnGIOVINAZZI.setBackground(Color.WHITE);
		btnGIOVINAZZI.addActionListener(controlador);
		btnGIOVINAZZI.setBounds(0, 11, 178, 37);
		panelGIOVINAZZI.add(btnGIOVINAZZI);
		
		JSeparator separatorGIOVINAZZI = new JSeparator();
		separatorGIOVINAZZI.setBounds(10, 51, 245, 8);
		panelGIOVINAZZI.add(separatorGIOVINAZZI);
		
		JLabel lblNº_14 = new JLabel("");
		lblNº_14.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Giovinnazzi.png"));
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
		btnGROSJEAN.addActionListener(controlador);
		btnGROSJEAN.setBounds(0, 11, 178, 37);
		panelGROSJEAN.add(btnGROSJEAN);
		
		JSeparator separatorGROSJEAN = new JSeparator();
		separatorGROSJEAN.setBounds(10, 51, 245, 8);
		panelGROSJEAN.add(separatorGROSJEAN);
		
		JLabel lblNº_15 = new JLabel("");
		lblNº_15.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Grosjean.png"));
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
		btnLatifi.addActionListener(controlador);
		btnLatifi.setBounds(0, 11, 178, 37);
		panelLatifi.add(btnLatifi);
		
		JSeparator separatorLatifi = new JSeparator();
		separatorLatifi.setBounds(10, 50, 245, 9);
		panelLatifi.add(separatorLatifi);
		
		JLabel lblNº_19 = new JLabel("");
		lblNº_19.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Latifi.png"));
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
		btnRussell.addActionListener(controlador);
		btnRussell.setBounds(0, 11, 178, 37);
		panelRussell.add(btnRussell);
		
		JSeparator separatorRussell = new JSeparator();
		separatorRussell.setBounds(10, 51, 245, 8);
		panelRussell.add(separatorRussell);
		
		JLabel lblNº_18 = new JLabel("");
		lblNº_18.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Numpilotos"+File.separator+"Russell.png"));
		lblNº_18.setBounds(180, 0, 85, 49);
		panelRussell.add(lblNº_18);
		
		JLabel lblFondo = new JLabel();
		lblFondo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.PNG"));
		lblFondo.setBounds(0, 0, 974, 539);
		panelPilotos.add(lblFondo);
		/*
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setPreferredSize(new Dimension(850, 430));
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(0, 66, 974, 545);
		contentPane.add(panel_1);

		JPanel panelHAMILTON = new JPanel();
		panelHAMILTON.setLayout(null);
		panelHAMILTON.setBackground(Color.WHITE);
		panelHAMILTON.setBounds(10, 23, 265, 60);
		panel_1.add(panelHAMILTON);

		JButton btnHAMILTON = new JButton("Lewis Hamilton");
		btnHAMILTON.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnHAMILTON.setBorder(null);
		btnHAMILTON.setBackground(Color.WHITE);
		btnHAMILTON.setBounds(0, 11, 178, 37);
		btnHAMILTON.addActionListener(controlador);
		panelHAMILTON.add(btnHAMILTON);

		JSeparator separatorHamilton = new JSeparator();
		separatorHamilton.setBounds(10, 52, 245, 8);
		panelHAMILTON.add(separatorHamilton);

		JLabel lblNº = new JLabel("");
		lblNº.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1" + File.separator
				+ "Numpilotos" + File.separator + "Hamilton.png"));
		lblNº.setBounds(180, 1, 85, 59);
		panelHAMILTON.add(lblNº);

		JPanel panelBOTTAS = new JPanel();
		panelBOTTAS.setLayout(null);
		panelBOTTAS.setBackground(Color.WHITE);
		panelBOTTAS.setBounds(310, 23, 265, 60);
		panel_1.add(panelBOTTAS);

		JButton btnBOTTAS = new JButton("Valtteri Bottas");
		btnBOTTAS.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnBOTTAS.setBorder(null);
		btnBOTTAS.setBackground(Color.WHITE);
		btnBOTTAS.setBounds(0, 11, 178, 37);
		btnBOTTAS.addActionListener(controlador);
		panelBOTTAS.add(btnBOTTAS);

		JSeparator separatorBOTTAS = new JSeparator();
		separatorBOTTAS.setBounds(10, 52, 245, 8);
		panelBOTTAS.add(separatorBOTTAS);

		JLabel lblNº_1 = new JLabel("");
		lblNº_1.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Bottas.png"));
		lblNº_1.setBounds(180, 0, 85, 59);
		panelBOTTAS.add(lblNº_1);

		JPanel panelVERSTAPPEN = new JPanel();
		panelVERSTAPPEN.setLayout(null);
		panelVERSTAPPEN.setBackground(Color.WHITE);
		panelVERSTAPPEN.setBounds(647, 23, 265, 60);
		panel_1.add(panelVERSTAPPEN);

		JButton btnVERSTAPPEN = new JButton("Max Verstappen");
		btnVERSTAPPEN.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnVERSTAPPEN.setBorder(null);
		btnVERSTAPPEN.setBackground(Color.WHITE);
		btnVERSTAPPEN.setBounds(0, 11, 178, 37);
		btnVERSTAPPEN.addActionListener(controlador);
		panelVERSTAPPEN.add(btnVERSTAPPEN);

		JSeparator separatorVERSTAPPEN = new JSeparator();
		separatorVERSTAPPEN.setBounds(10, 51, 245, 8);
		panelVERSTAPPEN.add(separatorVERSTAPPEN);

		JLabel lblNº_2 = new JLabel("");
		lblNº_2.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Verstappen.png"));
		lblNº_2.setBounds(180, 0, 85, 59);
		panelVERSTAPPEN.add(lblNº_2);

		JPanel panelRICCIARDO = new JPanel();
		panelRICCIARDO.setLayout(null);
		panelRICCIARDO.setBackground(Color.WHITE);
		panelRICCIARDO.setBounds(10, 94, 265, 60);
		panel_1.add(panelRICCIARDO);

		JButton btnRICCIARDO = new JButton("Daniel Ricciardo");
		btnRICCIARDO.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnRICCIARDO.setBorder(null);
		btnRICCIARDO.setBackground(Color.WHITE);
		btnRICCIARDO.setBounds(0, 11, 178, 37);
		btnRICCIARDO.addActionListener(controlador);
		panelRICCIARDO.add(btnRICCIARDO);

		JSeparator separatorRICCIARDO = new JSeparator();
		separatorRICCIARDO.setBounds(10, 51, 245, 8);
		panelRICCIARDO.add(separatorRICCIARDO);

		JLabel lblNº_3 = new JLabel("");
		lblNº_3.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Ricciardo.png"));
		lblNº_3.setBounds(180, 0, 85, 59);
		panelRICCIARDO.add(lblNº_3);

		JPanel panelLECLERC = new JPanel();
		panelLECLERC.setLayout(null);
		panelLECLERC.setBackground(Color.WHITE);
		panelLECLERC.setBounds(310, 94, 265, 60);
		panel_1.add(panelLECLERC);

		JButton btnLECLERC = new JButton("Charles Leclerc");
		btnLECLERC.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLECLERC.setBorder(null);
		btnLECLERC.setBackground(Color.WHITE);
		btnLECLERC.setBounds(0, 11, 178, 37);
		btnLECLERC.addActionListener(controlador);
		panelLECLERC.add(btnLECLERC);

		JSeparator separatorLECLERC = new JSeparator();
		separatorLECLERC.setBounds(10, 51, 245, 8);
		panelLECLERC.add(separatorLECLERC);

		JLabel lblNº_4 = new JLabel("");
		lblNº_4.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Leclrec.png"));
		lblNº_4.setBounds(180, 0, 85, 59);
		panelLECLERC.add(lblNº_4);

		JPanel panelPEREZ = new JPanel();
		panelPEREZ.setLayout(null);
		panelPEREZ.setBackground(Color.WHITE);
		panelPEREZ.setBounds(647, 94, 265, 60);
		panel_1.add(panelPEREZ);

		JButton btnPEREZ = new JButton("Sergio Perez");
		btnPEREZ.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnPEREZ.setBorder(null);
		btnPEREZ.setBackground(Color.WHITE);
		btnPEREZ.setBounds(0, 11, 178, 37);
		btnPEREZ.addActionListener(controlador);
		panelPEREZ.add(btnPEREZ);

		JSeparator separatorPEREZ = new JSeparator();
		separatorPEREZ.setBounds(10, 51, 245, 8);
		panelPEREZ.add(separatorPEREZ);

		JLabel lblNº_5 = new JLabel("");
		lblNº_5.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Perez.png"));
		lblNº_5.setBounds(180, 0, 85, 59);
		panelPEREZ.add(lblNº_5);

		JPanel panelNORRIS = new JPanel();
		panelNORRIS.setLayout(null);
		panelNORRIS.setBackground(Color.WHITE);
		panelNORRIS.setBounds(10, 165, 265, 60);
		panel_1.add(panelNORRIS);

		JButton btnNORRIS = new JButton("Lando Norris");
		btnNORRIS.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNORRIS.setBorder(null);
		btnNORRIS.setBackground(Color.WHITE);
		btnNORRIS.setBounds(0, 11, 178, 37);
		btnNORRIS.addActionListener(controlador);
		panelNORRIS.add(btnNORRIS);

		JSeparator separatorNORRIS = new JSeparator();
		separatorNORRIS.setBounds(10, 51, 245, 8);
		panelNORRIS.add(separatorNORRIS);

		JLabel lblNº_6 = new JLabel("");
		lblNº_6.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Norris.png"));
		lblNº_6.setBounds(180, 0, 85, 59);
		panelNORRIS.add(lblNº_6);

		JPanel panelSAINZ = new JPanel();
		panelSAINZ.setLayout(null);
		panelSAINZ.setBackground(Color.WHITE);
		panelSAINZ.setBounds(310, 165, 265, 60);
		panel_1.add(panelSAINZ);

		JButton btnSAINZ = new JButton("Carlos Sainz");
		btnSAINZ.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSAINZ.setBorder(null);
		btnSAINZ.setBackground(Color.WHITE);
		btnSAINZ.setBounds(0, 11, 178, 37);
		btnSAINZ.addActionListener(controlador);
		panelSAINZ.add(btnSAINZ);

		JSeparator separatorSAINZ = new JSeparator();
		separatorSAINZ.setBounds(10, 51, 245, 8);
		panelSAINZ.add(separatorSAINZ);

		JLabel lblNº_7 = new JLabel("");
		lblNº_7.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Sainz.png"));
		lblNº_7.setBounds(180, 0, 85, 59);
		panelSAINZ.add(lblNº_7);

		JPanel panelALBON = new JPanel();
		panelALBON.setLayout(null);
		panelALBON.setBackground(Color.WHITE);
		panelALBON.setBounds(647, 165, 265, 60);
		panel_1.add(panelALBON);

		JButton btnALBON = new JButton("Alexander Albon");
		btnALBON.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnALBON.setBorder(null);
		btnALBON.setBackground(Color.WHITE);
		btnALBON.setBounds(0, 11, 178, 37);
		btnALBON.addActionListener(controlador);
		panelALBON.add(btnALBON);

		JSeparator separatorALBON = new JSeparator();
		separatorALBON.setBounds(10, 51, 245, 8);
		panelALBON.add(separatorALBON);

		JLabel lblNº_8 = new JLabel("");
		lblNº_8.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Albon.png"));
		lblNº_8.setBounds(180, 0, 85, 59);
		panelALBON.add(lblNº_8);

		JPanel panelGASLY = new JPanel();
		panelGASLY.setLayout(null);
		panelGASLY.setBackground(Color.WHITE);
		panelGASLY.setBounds(10, 236, 265, 60);
		panel_1.add(panelGASLY);

		JButton btnGASLY = new JButton("Pierre Gasly");
		btnGASLY.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGASLY.setBorder(null);
		btnGASLY.setBackground(Color.WHITE);
		btnGASLY.setBounds(0, 11, 178, 37);
		btnGASLY.addActionListener(controlador);
		panelGASLY.add(btnGASLY);

		JSeparator separatorGASLY = new JSeparator();
		separatorGASLY.setBounds(10, 51, 245, 8);
		panelGASLY.add(separatorGASLY);

		JLabel lblNº_16_1 = new JLabel("");
		lblNº_16_1.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Gasly.png"));
		lblNº_16_1.setBounds(180, 0, 85, 59);
		panelGASLY.add(lblNº_16_1);

		JPanel panelSTROLL = new JPanel();
		panelSTROLL.setLayout(null);
		panelSTROLL.setBackground(Color.WHITE);
		panelSTROLL.setBounds(647, 378, 265, 60);
		panel_1.add(panelSTROLL);

		JButton btnSTROLL = new JButton("Lance Stroll");
		btnSTROLL.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSTROLL.setBorder(null);
		btnSTROLL.setBackground(Color.WHITE);
		btnSTROLL.setBounds(0, 11, 178, 37);
		btnSTROLL.addActionListener(controlador);
		panelSTROLL.add(btnSTROLL);

		JSeparator separatorSTROLL = new JSeparator();
		separatorSTROLL.setBounds(10, 49, 245, 10);
		panelSTROLL.add(separatorSTROLL);

		JLabel lblNº_17 = new JLabel("");
		lblNº_17.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Stroll.png"));
		lblNº_17.setBounds(180, 0, 85, 49);
		panelSTROLL.add(lblNº_17);

		JPanel panelOCON = new JPanel();
		panelOCON.setLayout(null);
		panelOCON.setBackground(Color.WHITE);
		panelOCON.setBounds(310, 378, 265, 60);
		panel_1.add(panelOCON);

		JButton btnOCON = new JButton("Esteban Ocon");
		btnOCON.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnOCON.setBorder(null);
		btnOCON.setBackground(Color.WHITE);
		btnOCON.setBounds(0, 11, 178, 37);
		btnOCON.addActionListener(controlador);
		panelOCON.add(btnOCON);

		JSeparator separatorOCON = new JSeparator();
		separatorOCON.setBounds(10, 51, 245, 8);
		panelOCON.add(separatorOCON);

		JLabel lblNº_16 = new JLabel("");
		lblNº_16.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Ocon.png"));
		lblNº_16.setBounds(180, 0, 85, 59);
		panelOCON.add(lblNº_16);

		JPanel panelKVYAT = new JPanel();
		panelKVYAT.setLayout(null);
		panelKVYAT.setBackground(Color.WHITE);
		panelKVYAT.setBounds(310, 236, 265, 60);
		panel_1.add(panelKVYAT);

		JButton btnKVYAT = new JButton("Daniil Kvyat");
		btnKVYAT.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnKVYAT.setBorder(null);
		btnKVYAT.setBackground(Color.WHITE);
		btnKVYAT.setBounds(0, 11, 178, 37);
		btnKVYAT.addActionListener(controlador);
		panelKVYAT.add(btnKVYAT);

		JSeparator separatorKVYAT = new JSeparator();
		separatorKVYAT.setBounds(10, 51, 245, 8);
		panelKVYAT.add(separatorKVYAT);

		JLabel lblNº_10 = new JLabel("");
		lblNº_10.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Kvyat.png"));
		lblNº_10.setBounds(180, 0, 85, 59);
		panelKVYAT.add(lblNº_10);

		JPanel panelVETTEL = new JPanel();
		panelVETTEL.setLayout(null);
		panelVETTEL.setBackground(Color.WHITE);
		panelVETTEL.setBounds(647, 236, 265, 60);
		panel_1.add(panelVETTEL);

		JButton btnVETTEL = new JButton("Sebastian Vettel");
		btnVETTEL.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnVETTEL.setBorder(null);
		btnVETTEL.setBackground(Color.WHITE);
		btnVETTEL.setBounds(0, 11, 178, 37);
		btnVETTEL.addActionListener(controlador);
		panelVETTEL.add(btnVETTEL);

		JSeparator separatorVETTEL = new JSeparator();
		separatorVETTEL.setBounds(10, 51, 245, 8);
		panelVETTEL.add(separatorVETTEL);

		JLabel lblNº_11 = new JLabel("");
		lblNº_11.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Vettel.png"));
		lblNº_11.setBounds(180, 0, 85, 59);
		panelVETTEL.add(lblNº_11);

		JPanel panelMAGNUSSEN = new JPanel();
		panelMAGNUSSEN.setLayout(null);
		panelMAGNUSSEN.setBackground(Color.WHITE);
		panelMAGNUSSEN.setBounds(10, 307, 265, 60);
		panel_1.add(panelMAGNUSSEN);

		JButton btnMAGNUSSEN = new JButton("Kevin Magnussen");
		btnMAGNUSSEN.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnMAGNUSSEN.setBorder(null);
		btnMAGNUSSEN.setBackground(Color.WHITE);
		btnMAGNUSSEN.setBounds(0, 11, 178, 37);
		btnMAGNUSSEN.addActionListener(controlador);
		panelMAGNUSSEN.add(btnMAGNUSSEN);

		JSeparator separatorMagnussen = new JSeparator();
		separatorMagnussen.setBounds(10, 52, 245, 8);
		panelMAGNUSSEN.add(separatorMagnussen);

		JLabel lblNº_12 = new JLabel("");
		lblNº_12.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Magnussen.png"));
		lblNº_12.setBounds(180, 0, 85, 49);
		panelMAGNUSSEN.add(lblNº_12);

		JPanel panelRÄIKKÖNEN = new JPanel();
		panelRÄIKKÖNEN.setLayout(null);
		panelRÄIKKÖNEN.setBackground(Color.WHITE);
		panelRÄIKKÖNEN.setBounds(310, 307, 265, 60);
		panel_1.add(panelRÄIKKÖNEN);

		JButton btnRÄIKKÖNEN = new JButton("Kimi Raikkonen");
		btnRÄIKKÖNEN.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnRÄIKKÖNEN.setBorder(null);
		btnRÄIKKÖNEN.setBackground(Color.WHITE);
		btnRÄIKKÖNEN.setBounds(0, 11, 178, 37);
		btnRÄIKKÖNEN.addActionListener(controlador);
		panelRÄIKKÖNEN.add(btnRÄIKKÖNEN);

		JSeparator separatorRÄIKKÖNEN = new JSeparator();
		separatorRÄIKKÖNEN.setBounds(10, 50, 245, 9);
		panelRÄIKKÖNEN.add(separatorRÄIKKÖNEN);

		JLabel lblNº_13 = new JLabel("");
		lblNº_13.setBounds(190, -1, 75, 49);
		panelRÄIKKÖNEN.add(lblNº_13);
		lblNº_13.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Raikkonen.png"));

		JPanel panelGIOVINAZZI = new JPanel();
		panelGIOVINAZZI.setLayout(null);
		panelGIOVINAZZI.setBackground(Color.WHITE);
		panelGIOVINAZZI.setBounds(647, 307, 265, 60);
		panel_1.add(panelGIOVINAZZI);

		JButton btnGIOVINAZZI = new JButton("Antonio Giovinazzi");
		btnGIOVINAZZI.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGIOVINAZZI.setBorder(null);
		btnGIOVINAZZI.setBackground(Color.WHITE);
		btnGIOVINAZZI.setBounds(0, 11, 178, 37);
		btnGIOVINAZZI.addActionListener(controlador);
		panelGIOVINAZZI.add(btnGIOVINAZZI);

		JSeparator separatorGIOVINAZZI = new JSeparator();
		separatorGIOVINAZZI.setBounds(10, 51, 245, 8);
		panelGIOVINAZZI.add(separatorGIOVINAZZI);

		JLabel lblNº_14 = new JLabel("");
		lblNº_14.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Giovinnazzi.png"));
		lblNº_14.setBounds(180, 0, 85, 59);
		panelGIOVINAZZI.add(lblNº_14);

		JPanel panelGROSJEAN = new JPanel();
		panelGROSJEAN.setLayout(null);
		panelGROSJEAN.setBackground(Color.WHITE);
		panelGROSJEAN.setBounds(10, 378, 265, 60);
		panel_1.add(panelGROSJEAN);

		JButton btnGROSJEAN = new JButton("Romain Grosjean");
		btnGROSJEAN.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGROSJEAN.setBorder(null);
		btnGROSJEAN.setBackground(Color.WHITE);
		btnGROSJEAN.setBounds(0, 11, 178, 37);
		btnGROSJEAN.addActionListener(controlador);
		panelGROSJEAN.add(btnGROSJEAN);

		JSeparator separatorGROSJEAN = new JSeparator();
		separatorGROSJEAN.setBounds(10, 51, 245, 8);
		panelGROSJEAN.add(separatorGROSJEAN);

		JLabel lblNº_15 = new JLabel("");
		lblNº_15.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Grosjean.png"));
		lblNº_15.setBounds(180, 0, 85, 59);
		panelGROSJEAN.add(lblNº_15);

		JPanel panelLatifi = new JPanel();
		panelLatifi.setLayout(null);
		panelLatifi.setBackground(Color.WHITE);
		panelLatifi.setBounds(310, 449, 265, 60);
		panel_1.add(panelLatifi);

		JButton btnLatifi = new JButton("Nicholas Latifi");
		btnLatifi.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLatifi.setBorder(null);
		btnLatifi.setBackground(Color.WHITE);
		btnLatifi.setBounds(0, 11, 178, 37);
		btnLatifi.addActionListener(controlador);
		panelLatifi.add(btnLatifi);

		JSeparator separatorLatifi = new JSeparator();
		separatorLatifi.setBounds(10, 50, 245, 9);
		panelLatifi.add(separatorLatifi);

		JLabel lblNº_19 = new JLabel("");
		lblNº_19.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Latifi.png"));
		lblNº_19.setBounds(180, 0, 85, 49);
		panelLatifi.add(lblNº_19);

		JPanel panelRussell = new JPanel();
		panelRussell.setLayout(null);
		panelRussell.setBackground(Color.WHITE);
		panelRussell.setBounds(10, 449, 265, 60);
		panel_1.add(panelRussell);

		JButton btnRussell = new JButton("George Russell");
		btnRussell.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnRussell.setBorder(null);
		btnRussell.setBackground(Color.WHITE);
		btnRussell.setBounds(0, 11, 178, 37);
		btnRussell.addActionListener(controlador);
		panelRussell.add(btnRussell);

		JSeparator separatorRussell = new JSeparator();
		separatorRussell.setBounds(10, 51, 245, 8);
		panelRussell.add(separatorRussell);

		JLabel lblNº_18 = new JLabel("");
		lblNº_18.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numeros f1"
				+ File.separator + "Numpilotos" + File.separator + "Russell.png"));
		lblNº_18.setBounds(180, 0, 85, 49);
		panelRussell.add(lblNº_18);
		
		*/
	}

	public void fichaPilotos(Controlador controlador, Piloto piloto, Escuderia escuderia,String ruta) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990,650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_FichaPiloto = new JPanel();
		panel_FichaPiloto.setBounds(0, 72, 974, 539);
		contentPane.add(panel_FichaPiloto);
		panel_FichaPiloto.setLayout(null);
		
		JLabel lblFtoFicha = new JLabel("");
		lblFtoFicha.setIcon(new ImageIcon(ruta));
		lblFtoFicha.setBounds(27, 21, 268, 298);
		panel_FichaPiloto.add(lblFtoFicha);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(443, 53, 175, 20);
		panel_FichaPiloto.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBorder(null);
		txtNombre.setText(piloto.getNombre());
		txtNombre.setBackground(Color.WHITE);
		txtNombre.setBounds(628, 55, 250, 20);
		panel_FichaPiloto.add(txtNombre);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:");
		lblNacionalidad.setForeground(Color.WHITE);
		lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNacionalidad.setBounds(443, 86, 175, 20);
		panel_FichaPiloto.add(lblNacionalidad);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setEditable(false);
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBorder(null);
		txtNacionalidad.setText(piloto.getNacionalidad());
		txtNacionalidad.setBackground(Color.WHITE);
		txtNacionalidad.setBounds(628, 88, 250, 20);
		panel_FichaPiloto.add(txtNacionalidad);
		
		JLabel lblNacimiento = new JLabel("Fecha de nacimiento:");
		lblNacimiento.setForeground(Color.WHITE);
		lblNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNacimiento.setBounds(443, 117, 175, 20);
		panel_FichaPiloto.add(lblNacimiento);
		
		txtNacimiento = new JTextField();
		txtNacimiento.setEditable(false);
		txtNacimiento.setColumns(10);
		txtNacimiento.setBorder(null);
		txtNacimiento.setText(piloto.getFechaNacimiento()+ "");
		txtNacimiento.setBackground(Color.WHITE);
		txtNacimiento.setBounds(628, 117, 250, 20);
		panel_FichaPiloto.add(txtNacimiento);
		
		JLabel lblPalmares = new JLabel("Palmares:");
		lblPalmares.setForeground(Color.WHITE);
		lblPalmares.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPalmares.setBounds(443, 150, 175, 20);
		panel_FichaPiloto.add(lblPalmares);
		
		txtPalmares = new JTextField();
		txtPalmares.setEditable(false);
		txtPalmares.setColumns(10);
		txtPalmares.setBorder(null);
		txtPalmares.setText(piloto.getPalmares());
		txtPalmares.setBackground(Color.WHITE);
		txtPalmares.setBounds(628, 152, 250, 20);
		panel_FichaPiloto.add(txtPalmares);
		
		JLabel lblEscuderia = new JLabel("Escuderia:");
		lblEscuderia.setForeground(Color.WHITE);
		lblEscuderia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEscuderia.setBounds(443, 243, 175, 20);
		panel_FichaPiloto.add(lblEscuderia);
		
		txtEscuderia = new JTextField();
		txtEscuderia.setEditable(false);
		txtEscuderia.setColumns(10);
		txtEscuderia.setBorder(null);
		txtEscuderia.setText(escuderia.getNombre());
		txtEscuderia.setBackground(Color.WHITE);
		txtEscuderia.setBounds(628, 245, 250, 20);
		panel_FichaPiloto.add(txtEscuderia);
		
		JLabel lblESTADO = new JLabel("Estado:");
		lblESTADO.setForeground(Color.WHITE);
		lblESTADO.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblESTADO.setBounds(443, 181, 175, 20);
		panel_FichaPiloto.add(lblESTADO);
		
		txtEstado = new JTextField();
		txtEstado.setEditable(false);
		txtEstado.setColumns(10);
		txtEstado.setBorder(null);
		txtEstado.setText(piloto.getEstado());
		txtEstado.setBackground(Color.WHITE);
		txtEstado.setBounds(628, 183, 250, 20);
		panel_FichaPiloto.add(txtEstado);
		
		JLabel lblPodios = new JLabel("Podios:");
		lblPodios.setForeground(Color.WHITE);
		lblPodios.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPodios.setBounds(443, 212, 175, 20);
		panel_FichaPiloto.add(lblPodios);
		
		txtPodios = new JTextField();
		txtPodios.setEditable(false);
		txtPodios.setColumns(10);
		txtPodios.setBorder(null);
		txtPodios.setText(piloto.getPodios()+ "");
		txtPodios.setBackground(Color.WHITE);
		txtPodios.setBounds(628, 214, 250, 20);
		panel_FichaPiloto.add(txtPodios);
		
		JLabel lblBiblo = new JLabel("Bibliografia");
		lblBiblo.setForeground(Color.WHITE);
		lblBiblo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBiblo.setBounds(27, 378, 209, 40);
		panel_FichaPiloto.add(lblBiblo);
		
		txtBiblio = new JTextPane();
		txtBiblio.setToolTipText("");
		txtBiblio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtBiblio.setEditable(false);
		txtBiblio.setText(piloto.getBibliografia());
		txtBiblio.setBounds(27, 429, 771, 87);
		panel_FichaPiloto.add(txtBiblio);
		
		JLabel lblFondo = new JLabel();
		lblFondo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.PNG"));
		lblFondo.setBounds(0, 0, 974, 539);
		panel_FichaPiloto.add(lblFondo);
		menu(controlador);
	}

}
