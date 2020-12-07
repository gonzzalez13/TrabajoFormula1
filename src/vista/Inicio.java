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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import logica.Controlador;
import modelo.Escuderia;
import modelo.Piloto;

public class Inicio extends Cabecera {
	public Inicio() {
	}

	private JButton btnAlfaRomeo, btnAlphaTauri, btnNFerrari, btnHaas, btnMclaren, btnMercedes, btnRacingPonit,
			btnRedBull, btnRenault, btnWilliams;
	private JTextField txtNombre,txtNacionalidad,txtNacimiento,txtPalmares,txtEscuderia,txtEstado,txtPodios;
	private JTextPane txtBiblio;
	private JButton btnPiloto1,btnPiloto2;
	private JTextField textNombre,textNacionalidad,textBase,textAño,textPremios,textJefeE,textJefeT,textPiloto1,textPiloto2;
	

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
		btnMercedes.addActionListener(controlador);
		btnMercedes.setBounds(0, 0, 270, 121);
		panelMercedes.add(btnMercedes);
		
		JPanel panelRedBull = new JPanel();
		panelRedBull.setLayout(null);
		panelRedBull.setBackground(Color.WHITE);
		panelRedBull.setBounds(10, 143, 270, 121);
		panelEscuderia.add(panelRedBull);
		
		JButton btnRedBull = new JButton("3");
		btnRedBull.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"RedBull.png"));
		btnRedBull.addActionListener(controlador);
		btnRedBull.setBounds(0, 0, 270, 121);
		panelRedBull.add(btnRedBull);
		
		JPanel panelMclaren = new JPanel();
		panelMclaren.setLayout(null);
		panelMclaren.setBackground(Color.WHITE);
		panelMclaren.setBounds(10, 275, 270, 121);
		panelEscuderia.add(panelMclaren);
		
		JButton btnMclaren = new JButton("5");
		btnMclaren.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Mclaren.png"));
		btnMclaren.addActionListener(controlador);
		btnMclaren.setBounds(0, 0, 270, 121);
		panelMclaren.add(btnMclaren);
		
		JPanel panelRacingPoint = new JPanel();
		panelRacingPoint.setLayout(null);
		panelRacingPoint.setBackground(Color.WHITE);
		panelRacingPoint.setBounds(10, 407, 270, 121);
		panelEscuderia.add(panelRacingPoint);
		
		JButton btnRacingPoint = new JButton("4");
		btnRacingPoint.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"RacingPoint.png"));
		btnRacingPoint.addActionListener(controlador);
		btnRacingPoint.setBounds(0, 0, 270, 121);
		panelRacingPoint.add(btnRacingPoint);
		
		JPanel panelRenault = new JPanel();
		panelRenault.setLayout(null);
		panelRenault.setBackground(Color.WHITE);
		panelRenault.setBounds(355, 11, 270, 121);
		panelEscuderia.add(panelRenault);
		
		JButton btnRenault = new JButton("6");
		btnRenault.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Renault.png"));
		btnRenault.addActionListener(controlador);
		btnRenault.setBounds(0, 0, 270, 121);
		panelRenault.add(btnRenault);
		
		JPanel panelFerrari = new JPanel();
		panelFerrari.setLayout(null);
		panelFerrari.setBackground(Color.WHITE);
		panelFerrari.setBounds(355, 143, 270, 121);
		panelEscuderia.add(panelFerrari);
		
		JButton btnFerrari = new JButton("2");
		btnFerrari.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"ferrari.png"));
		btnFerrari.addActionListener(controlador);
		btnFerrari.setBounds(0, 0, 270, 121);
		panelFerrari.add(btnFerrari);
		
		JPanel panelAlphatauri = new JPanel();
		panelAlphatauri.setLayout(null);
		panelAlphatauri.setBackground(Color.WHITE);
		panelAlphatauri.setBounds(355, 275, 270, 121);
		panelEscuderia.add(panelAlphatauri);
		
		JButton btnAlphatauri = new JButton("7");
		btnAlphatauri.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"AlphaTauri.png"));
		btnAlphatauri.addActionListener(controlador);
		btnAlphatauri.setBounds(0, 0, 270, 121);
		panelAlphatauri.add(btnAlphatauri);
		
		JPanel panelAlfaRomeo = new JPanel();
		panelAlfaRomeo.setLayout(null);
		panelAlfaRomeo.setBackground(Color.WHITE);
		panelAlfaRomeo.setBounds(355, 407, 270, 121);
		panelEscuderia.add(panelAlfaRomeo);
		
		JButton btnAlfaRomeo = new JButton("8");
		btnAlfaRomeo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Alfa Romeo.PNG"));
		btnAlfaRomeo.addActionListener(controlador);
		btnAlfaRomeo.setBounds(0, 0, 270, 121);
		panelAlfaRomeo.add(btnAlfaRomeo);
		
		JPanel panelHaas = new JPanel();
		panelHaas.setLayout(null);
		panelHaas.setBackground(Color.WHITE);
		panelHaas.setBounds(694, 11, 270, 121);
		panelEscuderia.add(panelHaas);
		
		JButton btnHaas = new JButton("9");
		btnHaas.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"haas.png"));
		btnHaas.addActionListener(controlador);
		btnHaas.setBounds(0, 0, 270, 121);
		panelHaas.add(btnHaas);
		
		JPanel panelWilliams = new JPanel();
		panelWilliams.setLayout(null);
		panelWilliams.setBackground(Color.WHITE);
		panelWilliams.setBounds(694, 143, 270, 121);
		panelEscuderia.add(panelWilliams);
		
		JButton btnWilliams = new JButton("10");
		btnWilliams.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Williams.png"));
		btnWilliams.addActionListener(controlador);
		btnWilliams.setBounds(0, 0, 270, 121);
		panelWilliams.add(btnWilliams);
		
		JLabel lblFondo = new JLabel();
		lblFondo.setBounds(0, 0, 974, 539);
		panelEscuderia.add(lblFondo);
		lblFondo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.PNG"));
	

		menu(controlador);
	}
	
	public void FichaEscuderia(Controlador controlador, Escuderia escuderia, Piloto piloto, String ruta) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel_FichaEscuderia = new JPanel();
		panel_FichaEscuderia.setBounds(0, 70, 974, 541);
		contentPane.add(panel_FichaEscuderia);
		panel_FichaEscuderia.setLayout(null);
		
		JLabel lblMarca = new JLabel("");
		lblMarca.setIcon(new ImageIcon(ruta));
		lblMarca.setBounds(53, 17, 300, 191);
		panel_FichaEscuderia.add(lblMarca);
		
		JLabel lblNombre = new JLabel("Nombre completo");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(10, 213, 176, 26);
		panel_FichaEscuderia.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setEditable(false);
		textNombre.setText(escuderia.getNombre());
		textNombre.setBounds(205, 219, 200, 20);
		panel_FichaEscuderia.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNacionalidad.setForeground(Color.WHITE);
		lblNacionalidad.setBounds(10, 250, 176, 26);
		panel_FichaEscuderia.add(lblNacionalidad);
		
		textNacionalidad = new JTextField();
		textNacionalidad.setEditable(false);
		textNacionalidad.setColumns(10);
		textNacionalidad.setText(escuderia.getNacionalidad());
		textNacionalidad.setBounds(205, 256, 200, 20);
		panel_FichaEscuderia.add(textNacionalidad);
		
		JLabel lblBase = new JLabel("Base ");
		lblBase.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBase.setForeground(Color.WHITE);
		lblBase.setBounds(10, 287, 176, 26);
		panel_FichaEscuderia.add(lblBase);
		
		textBase = new JTextField();
		textBase.setEditable(false);
		textBase.setText(escuderia.getSede());
		textBase.setColumns(10);
		textBase.setBounds(205, 293, 200, 20);
		panel_FichaEscuderia.add(textBase);
		
		JLabel lblAño = new JLabel("Primer A\u00F1o de competici\u00F3n");
		lblAño.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAño.setForeground(Color.WHITE);
		lblAño.setBounds(10, 324, 176, 26);
		panel_FichaEscuderia.add(lblAño);
		
		textAño = new JTextField();
		textAño.setEditable(false);
		textAño.setText(escuderia.getEstrenadaF1());
		textAño.setColumns(10);
		textAño.setBounds(205, 327, 200, 20);
		panel_FichaEscuderia.add(textAño);
		
		JLabel lblPremios = new JLabel("Premios");
		lblPremios.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPremios.setForeground(Color.WHITE);
		lblPremios.setBounds(10, 361, 176, 26);
		panel_FichaEscuderia.add(lblPremios);
		
		textPremios = new JTextField();
		textPremios.setEditable(false);
		textPremios.setText(escuderia.getPalmares());
		textPremios.setColumns(10);
		textPremios.setBounds(205, 367, 200, 20);
		panel_FichaEscuderia.add(textPremios);
		
		JLabel lblJefeE = new JLabel("Jefe de Equipo");
		lblJefeE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJefeE.setForeground(Color.WHITE);
		lblJefeE.setBounds(10, 398, 176, 26);
		panel_FichaEscuderia.add(lblJefeE);
		
		textJefeE = new JTextField();
		textJefeE.setEditable(false);
		textJefeE.setText(escuderia.getjEquipo());
		textJefeE.setColumns(10);
		textJefeE.setBounds(205, 404, 200, 20);
		panel_FichaEscuderia.add(textJefeE);
		
		JLabel lblJefeT = new JLabel("Jefe T\u00E9cnico");
		lblJefeT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJefeT.setForeground(Color.WHITE);
		lblJefeT.setBounds(10, 435, 176, 26);
		panel_FichaEscuderia.add(lblJefeT);
		
		textJefeT = new JTextField();
		textJefeT.setEditable(false);
		textJefeT.setText(escuderia.getjTecnico());
		textJefeT.setColumns(10);
		textJefeT.setBounds(205, 441, 200, 20);
		panel_FichaEscuderia.add(textJefeT);
		
		btnPiloto1 = new JButton("");
		btnPiloto1.setBounds(440, 40, 232, 232);
		panel_FichaEscuderia.add(btnPiloto1);
		
		textPiloto1 = new JTextField();
		textPiloto1.setHorizontalAlignment(SwingConstants.CENTER);
		textPiloto1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		textPiloto1.setText(piloto.getNombre());
		textPiloto1.setEditable(false);
		textPiloto1.setBounds(440, 283, 232, 30);
		panel_FichaEscuderia.add(textPiloto1);
		textPiloto1.setColumns(10);
		
		btnPiloto2 = new JButton("");
		btnPiloto2.setBounds(710, 40, 232, 232);
		panel_FichaEscuderia.add(btnPiloto2);
		
		textPiloto2 = new JTextField();
		textPiloto2.setHorizontalAlignment(SwingConstants.CENTER);
		textPiloto2.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		textPiloto2.setText(piloto.getNombre());
		textPiloto2.setEditable(false);
		textPiloto2.setColumns(10);
		textPiloto2.setBounds(710, 283, 232, 30);
		panel_FichaEscuderia.add(textPiloto2);
		
		JLabel lblFondo = new JLabel();
		lblFondo.setBounds(0, 0, 974, 539);
		panel_FichaEscuderia.add(lblFondo);
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
	
	public void clasificacion(Controlador controlador) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panelClasi = new JPanel();
		panelClasi.setBounds(0, 70, 974, 541);
		contentPane.add(panelClasi);
		panelClasi.setLayout(null);
		
		JPanel pP1 = new JPanel();
		pP1.setBounds(101, 55, 40, 24);
		panelClasi.add(pP1);
		
		JLabel label = new JLabel("1");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP1.add(label);
		
		JPanel pPC1 = new JPanel();
		pPC1.setBackground(new Color(0, 206, 209));
		pPC1.setBounds(140, 55, 25, 24);
		panelClasi.add(pPC1);
		
		JLabel lblLewisHamilton = new JLabel(" Lewis Hamilton");
		lblLewisHamilton.setHorizontalAlignment(SwingConstants.LEFT);
		lblLewisHamilton.setBounds(165, 55, 130, 24);
		panelClasi.add(lblLewisHamilton);
		
		JLabel PTS1 = new JLabel("332");
		PTS1.setHorizontalAlignment(SwingConstants.CENTER);
		PTS1.setBounds(305, 55, 46, 24);
		panelClasi.add(PTS1);
		
		JPanel pP2 = new JPanel();
		pP2.setBounds(101, 78, 40, 24);
		panelClasi.add(pP2);
		
		JLabel label_1 = new JLabel("2");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP2.add(label_1);
		
		JPanel pPC2 = new JPanel();
		pPC2.setBackground(new Color(0, 206, 209));
		pPC2.setBounds(140, 78, 25, 24);
		panelClasi.add(pPC2);
		
		JLabel lblMaxVerstappen = new JLabel(" Valtteri Bottas");
		lblMaxVerstappen.setHorizontalAlignment(SwingConstants.LEFT);
		lblMaxVerstappen.setBounds(165, 78, 130, 24);
		panelClasi.add(lblMaxVerstappen);
		
		JLabel PTS2 = new JLabel("201");
		PTS2.setHorizontalAlignment(SwingConstants.CENTER);
		PTS2.setBounds(305, 78, 46, 24);
		panelClasi.add(PTS2);
		
		JPanel pP3 = new JPanel();
		pP3.setBounds(101, 101, 40, 24);
		panelClasi.add(pP3);
		
		JLabel label_2 = new JLabel("3");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP3.add(label_2);
		
		JPanel pPC3 = new JPanel();
		pPC3.setBackground(new Color(0, 0, 128));
		pPC3.setBounds(140, 101, 25, 24);
		panelClasi.add(pPC3);
		
		JLabel lblMaxVerstappen_1 = new JLabel(" Max Verstappen");
		lblMaxVerstappen_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblMaxVerstappen_1.setBounds(165, 101, 130, 24);
		panelClasi.add(lblMaxVerstappen_1);
		
		JLabel PTS3 = new JLabel("189");
		PTS3.setHorizontalAlignment(SwingConstants.CENTER);
		PTS3.setBounds(305, 101, 46, 24);
		panelClasi.add(PTS3);
		
		JPanel pP4 = new JPanel();
		pP4.setBounds(101, 124, 40, 24);
		panelClasi.add(pP4);
		
		JLabel label_3 = new JLabel("4");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP4.add(label_3);
		
		JPanel pPC4 = new JPanel();
		pPC4.setBackground(new Color(255, 245, 0));
		pPC4.setBounds(140, 124, 25, 24);
		panelClasi.add(pPC4);
		
		JLabel lblDanielRicciardo_1 = new JLabel(" Daniel Ricciardo");
		lblDanielRicciardo_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDanielRicciardo_1.setBounds(165, 124, 130, 24);
		panelClasi.add(lblDanielRicciardo_1);
		
		JLabel PTS4 = new JLabel("102");
		PTS4.setHorizontalAlignment(SwingConstants.CENTER);
		PTS4.setBounds(305, 124, 46, 24);
		panelClasi.add(PTS4);
		
		JPanel pP5 = new JPanel();
		pP5.setBounds(101, 146, 40, 24);
		panelClasi.add(pP5);
		
		JLabel label_3_1 = new JLabel("5");
		label_3_1.setForeground(Color.BLACK);
		label_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP5.add(label_3_1);
		
		JPanel pPC5 = new JPanel();
		pPC5.setBackground(new Color(245, 150, 200));
		pPC5.setBounds(140, 146, 25, 24);
		panelClasi.add(pPC5);
		
		JLabel lblDanielRicciardo = new JLabel(" Sergio Perez");
		lblDanielRicciardo.setHorizontalAlignment(SwingConstants.LEFT);
		lblDanielRicciardo.setBounds(165, 146, 130, 24);
		panelClasi.add(lblDanielRicciardo);
		
		JLabel PTS5 = new JLabel("100");
		PTS5.setHorizontalAlignment(SwingConstants.CENTER);
		PTS5.setBounds(305, 146, 46, 24);
		panelClasi.add(PTS5);
		
		JPanel pP6 = new JPanel();
		pP6.setBounds(101, 170, 40, 24);
		panelClasi.add(pP6);
		
		JLabel label_3_2 = new JLabel("6");
		label_3_2.setForeground(Color.BLACK);
		label_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP6.add(label_3_2);
		
		JPanel pPC6 = new JPanel();
		pPC6.setBackground(new Color(220, 0, 0));
		pPC6.setBounds(140, 170, 25, 24);
		panelClasi.add(pPC6);
		
		JLabel lblCharle = new JLabel(" Charles Leclerc");
		lblCharle.setHorizontalAlignment(SwingConstants.LEFT);
		lblCharle.setBounds(165, 170, 130, 24);
		panelClasi.add(lblCharle);
		
		JLabel PTS6 = new JLabel("98");
		PTS6.setHorizontalAlignment(SwingConstants.CENTER);
		PTS6.setBounds(305, 170, 46, 24);
		panelClasi.add(PTS6);
		
		JPanel pP7 = new JPanel();
		pP7.setBounds(101, 194, 40, 24);
		panelClasi.add(pP7);
		
		JLabel label_3_3 = new JLabel("7");
		label_3_3.setForeground(Color.BLACK);
		label_3_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP7.add(label_3_3);
		
		JPanel pPC7 = new JPanel();
		pPC7.setBackground(new Color(255, 135, 0));
		pPC7.setBounds(140, 194, 25, 24);
		panelClasi.add(pPC7);
		
		JLabel lblLandoNorris = new JLabel(" Lando Norris");
		lblLandoNorris.setHorizontalAlignment(SwingConstants.LEFT);
		lblLandoNorris.setBounds(165, 194, 130, 24);
		panelClasi.add(lblLandoNorris);
		
		JLabel PTS7 = new JLabel("86");
		PTS7.setHorizontalAlignment(SwingConstants.CENTER);
		PTS7.setBounds(305, 194, 46, 24);
		panelClasi.add(PTS7);
		
		JPanel pP8 = new JPanel();
		pP8.setBounds(101, 216, 40, 24);
		panelClasi.add(pP8);
		
		JLabel label_3_4 = new JLabel("8");
		label_3_4.setForeground(Color.BLACK);
		label_3_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP8.add(label_3_4);
		
		JPanel pPC8 = new JPanel();
		pPC8.setBackground(new Color(255, 135, 0));
		pPC8.setBounds(140, 216, 25, 24);
		panelClasi.add(pPC8);
		
		JLabel lblCarlosSainz = new JLabel(" Carlos Sainz");
		lblCarlosSainz.setHorizontalAlignment(SwingConstants.LEFT);
		lblCarlosSainz.setBounds(165, 216, 130, 24);
		panelClasi.add(lblCarlosSainz);
		
		JLabel PTS8 = new JLabel("85");
		PTS8.setHorizontalAlignment(SwingConstants.CENTER);
		PTS8.setBounds(305, 216, 46, 24);
		panelClasi.add(PTS8);
		
		JPanel pP9 = new JPanel();
		pP9.setBounds(101, 237, 40, 24);
		panelClasi.add(pP9);
		
		JLabel label_3_5 = new JLabel("9");
		label_3_5.setForeground(Color.BLACK);
		label_3_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP9.add(label_3_5);
		
		JPanel pPC9 = new JPanel();
		pPC9.setBackground(new Color(0, 0, 128));
		pPC9.setBounds(140, 237, 25, 24);
		panelClasi.add(pPC9);
		
		JLabel lblAlexanderAlbon = new JLabel(" Alexander Albon");
		lblAlexanderAlbon.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlexanderAlbon.setBounds(165, 237, 130, 24);
		panelClasi.add(lblAlexanderAlbon);
		
		JLabel PTS9 = new JLabel("85");
		PTS9.setHorizontalAlignment(SwingConstants.CENTER);
		PTS9.setBounds(305, 237, 46, 24);
		panelClasi.add(PTS9);
		
		JPanel pP10 = new JPanel();
		pP10.setBounds(101, 261, 40, 24);
		panelClasi.add(pP10);
		
		JLabel label_3_5_1 = new JLabel("10");
		label_3_5_1.setForeground(Color.BLACK);
		label_3_5_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP10.add(label_3_5_1);
		
		JPanel pPC10 = new JPanel();
		pPC10.setBackground(new Color(255,255,255));
		pPC10.setBounds(140, 261, 25, 24);
		panelClasi.add(pPC10);
		
		JLabel lblPierreGasly = new JLabel(" Pierre Gasly");
		lblPierreGasly.setHorizontalAlignment(SwingConstants.LEFT);
		lblPierreGasly.setBounds(165, 261, 130, 24);
		panelClasi.add(lblPierreGasly);
		
		JLabel PTS10 = new JLabel("71");
		PTS10.setHorizontalAlignment(SwingConstants.CENTER);
		PTS10.setBounds(305, 261, 46, 24);
		panelClasi.add(PTS10);
		
		JPanel pP11 = new JPanel();
		pP11.setBounds(101, 283, 40, 24);
		panelClasi.add(pP11);
		
		JLabel label_3_5_1_1 = new JLabel("11");
		label_3_5_1_1.setForeground(Color.BLACK);
		label_3_5_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP11.add(label_3_5_1_1);
		
		JPanel pPC11 = new JPanel();
		pPC11.setBackground(new Color(245, 150, 200));
		pPC11.setBounds(140, 283, 25, 24);
		panelClasi.add(pPC11);
		
		JLabel lblLanceStroll = new JLabel(" Lance Stroll");
		lblLanceStroll.setHorizontalAlignment(SwingConstants.LEFT);
		lblLanceStroll.setBounds(165, 283, 130, 24);
		panelClasi.add(lblLanceStroll);
		
		JLabel PTS11 = new JLabel("59");
		PTS11.setHorizontalAlignment(SwingConstants.CENTER);
		PTS11.setBounds(305, 283, 46, 24);
		panelClasi.add(PTS11);
		
		JPanel pP12 = new JPanel();
		pP12.setBounds(101, 304, 40, 24);
		panelClasi.add(pP12);
		
		JLabel label_3_5_1_2 = new JLabel("12");
		label_3_5_1_2.setForeground(Color.BLACK);
		label_3_5_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP12.add(label_3_5_1_2);
		
		JPanel pPC12 = new JPanel();
		pPC12.setBackground(new Color(255, 245, 0));
		pPC12.setBounds(140, 304, 25, 24);
		panelClasi.add(pPC12);
		
		JLabel lblEstebanOcon = new JLabel(" Esteban Ocon");
		lblEstebanOcon.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstebanOcon.setBounds(165, 304, 130, 24);
		panelClasi.add(lblEstebanOcon);
		
		JLabel PTS12 = new JLabel("42");
		PTS12.setHorizontalAlignment(SwingConstants.CENTER);
		PTS12.setBounds(305, 304, 46, 24);
		panelClasi.add(PTS12);
		
		JPanel pP13 = new JPanel();
		pP13.setBounds(101, 326, 40, 24);
		panelClasi.add(pP13);
		
		JLabel label_3_5_1_3 = new JLabel("13");
		label_3_5_1_3.setForeground(Color.BLACK);
		label_3_5_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP13.add(label_3_5_1_3);
		
		JPanel pPC13 = new JPanel();
		pPC13.setBackground(new Color(220, 0, 0));
		pPC13.setBounds(140, 326, 25, 24);
		panelClasi.add(pPC13);
		
		JLabel lblSebastianVettel = new JLabel(" Sebastian Vettel");
		lblSebastianVettel.setHorizontalAlignment(SwingConstants.LEFT);
		lblSebastianVettel.setBounds(165, 326, 130, 24);
		panelClasi.add(lblSebastianVettel);
		
		JLabel PTS13 = new JLabel("33");
		PTS13.setHorizontalAlignment(SwingConstants.CENTER);
		PTS13.setBounds(305, 326, 46, 24);
		panelClasi.add(PTS13);
		
		JPanel pP14 = new JPanel();
		pP14.setBounds(101, 350, 40, 24);
		panelClasi.add(pP14);
		
		JLabel label_3_5_1_4 = new JLabel("14");
		label_3_5_1_4.setForeground(Color.BLACK);
		label_3_5_1_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP14.add(label_3_5_1_4);
		
		JPanel pPC14 = new JPanel();
		pPC14.setBackground(new Color(255,255,255));
		pPC14.setBounds(140, 350, 25, 24);
		panelClasi.add(pPC14);
		
		JLabel lblDaniilKvyat = new JLabel(" Daniil Kvyat");
		lblDaniilKvyat.setHorizontalAlignment(SwingConstants.LEFT);
		lblDaniilKvyat.setBounds(165, 350, 130, 24);
		panelClasi.add(lblDaniilKvyat);
		
		JLabel PTS14 = new JLabel("26");
		PTS14.setHorizontalAlignment(SwingConstants.CENTER);
		PTS14.setBounds(305, 350, 46, 24);
		panelClasi.add(PTS14);
		
		JPanel pP15 = new JPanel();
		pP15.setBounds(101, 373, 40, 24);
		panelClasi.add(pP15);
		
		JLabel label_3_5_1_5 = new JLabel("15");
		label_3_5_1_5.setForeground(Color.BLACK);
		label_3_5_1_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP15.add(label_3_5_1_5);
		
		JPanel pPC15 = new JPanel();
		pPC15.setBackground(new Color(150, 0, 0));
		pPC15.setBounds(140, 373, 25, 24);
		panelClasi.add(pPC15);
		
		JLabel lblKimiRaikkonen = new JLabel(" Kimi Raikkonen");
		lblKimiRaikkonen.setHorizontalAlignment(SwingConstants.LEFT);
		lblKimiRaikkonen.setBounds(165, 373, 130, 24);
		panelClasi.add(lblKimiRaikkonen);
		
		JLabel PTS15 = new JLabel("4");
		PTS15.setHorizontalAlignment(SwingConstants.CENTER);
		PTS15.setBounds(305, 373, 46, 24);
		panelClasi.add(PTS15);
		
		JPanel pP16 = new JPanel();
		pP16.setBounds(101, 397, 40, 24);
		panelClasi.add(pP16);
		
		JLabel label_3_5_1_6 = new JLabel("16");
		label_3_5_1_6.setForeground(Color.BLACK);
		label_3_5_1_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP16.add(label_3_5_1_6);
		
		JPanel pPC16 = new JPanel();
		pPC16.setBackground(new Color(150, 0, 0));
		pPC16.setBounds(140, 397, 25, 24);
		panelClasi.add(pPC16);
		
		JLabel lblAntonioGiovinazzi = new JLabel(" Antonio Giovinazzi");
		lblAntonioGiovinazzi.setHorizontalAlignment(SwingConstants.LEFT);
		lblAntonioGiovinazzi.setBounds(165, 397, 130, 24);
		panelClasi.add(lblAntonioGiovinazzi);
		
		JLabel PTS16 = new JLabel("4");
		PTS16.setHorizontalAlignment(SwingConstants.CENTER);
		PTS16.setBounds(305, 397, 46, 24);
		panelClasi.add(PTS16);
		
		JPanel pP17 = new JPanel();
		pP17.setBounds(101, 420, 40, 24);
		panelClasi.add(pP17);
		
		JLabel label_3_5_1_6_4 = new JLabel("17");
		label_3_5_1_6_4.setForeground(Color.BLACK);
		label_3_5_1_6_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP17.add(label_3_5_1_6_4);
		
		JPanel pPC17 = new JPanel();
		pPC17.setBackground(new Color(120, 120, 120));
		pPC17.setBounds(140, 420, 25, 24);
		panelClasi.add(pPC17);
		
		JLabel lblRomainGrosjean = new JLabel(" Romain Grosjean");
		lblRomainGrosjean.setHorizontalAlignment(SwingConstants.LEFT);
		lblRomainGrosjean.setBounds(165, 420, 130, 24);
		panelClasi.add(lblRomainGrosjean);
		
		JLabel PTS17 = new JLabel("2");
		PTS17.setHorizontalAlignment(SwingConstants.CENTER);
		PTS17.setBounds(305, 420, 46, 24);
		panelClasi.add(PTS17);
		
		JPanel pP18 = new JPanel();
		pP18.setBounds(101, 443, 40, 24);
		panelClasi.add(pP18);
		
		JLabel label_3_5_1_6_3 = new JLabel("18");
		label_3_5_1_6_3.setForeground(Color.BLACK);
		label_3_5_1_6_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP18.add(label_3_5_1_6_3);
		
		JPanel pPC18 = new JPanel();
		pPC18.setBackground(new Color(120, 120, 120));
		pPC18.setBounds(140, 443, 25, 24);
		panelClasi.add(pPC18);
		
		JLabel lblKevinMagnussen = new JLabel(" Kevin Magnussen");
		lblKevinMagnussen.setHorizontalAlignment(SwingConstants.LEFT);
		lblKevinMagnussen.setBounds(165, 443, 130, 24);
		panelClasi.add(lblKevinMagnussen);
		
		JLabel PTS18 = new JLabel("1");
		PTS18.setHorizontalAlignment(SwingConstants.CENTER);
		PTS18.setBounds(305, 443, 46, 24);
		panelClasi.add(PTS18);
		
		JPanel pP19 = new JPanel();
		pP19.setBounds(101, 466, 40, 24);
		panelClasi.add(pP19);
		
		JLabel label_3_5_1_6_2 = new JLabel("19");
		label_3_5_1_6_2.setForeground(Color.BLACK);
		label_3_5_1_6_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP19.add(label_3_5_1_6_2);
		
		JPanel pPC19 = new JPanel();
		pPC19.setBackground(new Color(0, 130, 250));
		pPC19.setBounds(140, 466, 25, 24);
		panelClasi.add(pPC19);
		
		JLabel lblNicholasLatifi = new JLabel(" Nicholas Latifi");
		lblNicholasLatifi.setHorizontalAlignment(SwingConstants.LEFT);
		lblNicholasLatifi.setBounds(165, 466, 130, 24);
		panelClasi.add(lblNicholasLatifi);
		
		JLabel PTS19 = new JLabel("0");
		PTS19.setHorizontalAlignment(SwingConstants.CENTER);
		PTS19.setBounds(305, 466, 46, 24);
		panelClasi.add(PTS19);
		
		JPanel pP20 = new JPanel();
		pP20.setBounds(101, 489, 40, 24);
		panelClasi.add(pP20);
		
		JLabel label_3_5_1_6_1 = new JLabel("20");
		label_3_5_1_6_1.setForeground(Color.BLACK);
		label_3_5_1_6_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP20.add(label_3_5_1_6_1);
		
		JPanel pPC20 = new JPanel();
		pPC20.setBackground(new Color(0, 130, 250));
		pPC20.setBounds(140, 489, 25, 24);
		panelClasi.add(pPC20);
		
		JLabel lblLewisHamilton_1 = new JLabel(" Geroge Russell");
		lblLewisHamilton_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblLewisHamilton_1.setBounds(165, 489, 130, 24);
		panelClasi.add(lblLewisHamilton_1);
		
		JLabel PTS20 = new JLabel("0");
		PTS20.setHorizontalAlignment(SwingConstants.CENTER);
		PTS20.setBounds(305, 489, 46, 24);
		panelClasi.add(PTS20);
		
		JLabel lblNewLabel_2 = new JLabel("P");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(101, 27, 40, 24);
		panelClasi.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("NP");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(165, 25, 100, 29);
		panelClasi.add(lblNewLabel_4);
		
		JLabel lblPts = new JLabel("PTS");
		lblPts.setForeground(Color.WHITE);
		lblPts.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPts.setHorizontalAlignment(SwingConstants.CENTER);
		lblPts.setBounds(305, 25, 46, 29);
		panelClasi.add(lblPts);
		
		JPanel p1 = new JPanel();
		p1.setBounds(517, 55, 40, 24);
		panelClasi.add(p1);
		
		JLabel label_4 = new JLabel("1");
		p1.add(label_4);
		
		JPanel pC1 = new JPanel();
		pC1.setBackground(new Color(0, 206, 209));
		pC1.setBounds(554, 55, 25, 24);
		panelClasi.add(pC1);
		
		JLabel lbl1 = new JLabel("  AMG Mercedes");
		lbl1.setBounds(578, 55, 100, 24);
		panelClasi.add(lbl1);
		
		JLabel PTSE1 = new JLabel("533");
		PTSE1.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE1.setBounds(721, 55, 46, 24);
		panelClasi.add(PTSE1);
		
		JPanel p2 = new JPanel();
		p2.setBounds(517, 78, 40, 24);
		panelClasi.add(p2);
		
		JLabel label_4_1 = new JLabel("2");
		p2.add(label_4_1);
		
		JPanel pC2 = new JPanel();
		pC2.setBackground(new Color(0, 0, 128));
		pC2.setBounds(554, 78, 25, 24);
		panelClasi.add(pC2);
		
		JLabel lbl2 = new JLabel("  Red Bull Racing");
		lbl2.setBounds(578, 78, 100, 24);
		panelClasi.add(lbl2);
		
		JLabel PTSE2 = new JLabel("274");
		PTSE2.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE2.setBounds(721, 78, 46, 24);
		panelClasi.add(PTSE2);
		
		JPanel p3 = new JPanel();
		p3.setBounds(517, 101, 40, 24);
		panelClasi.add(p3);
		
		JLabel label_4_2 = new JLabel("3");
		p3.add(label_4_2);
		
		JPanel pC3 = new JPanel();
		pC3.setBackground(new Color(255, 135, 0));
		pC3.setBounds(554, 101, 25, 24);
		panelClasi.add(pC3);
		
		JLabel lbl3 = new JLabel("  Mclaren");
		lbl3.setBounds(578, 101, 100, 24);
		panelClasi.add(lbl3);
		
		JLabel PTSE3 = new JLabel("171");
		PTSE3.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE3.setBounds(721, 101, 46, 24);
		panelClasi.add(PTSE3);
		
		JPanel p4 = new JPanel();
		p4.setBounds(517, 124, 40, 24);
		panelClasi.add(p4);
		
		JLabel label_4_3 = new JLabel("4");
		p4.add(label_4_3);
		
		JPanel pC4 = new JPanel();
		pC4.setBackground(new Color(245, 150, 200));
		pC4.setBounds(554, 124, 25, 24);
		panelClasi.add(pC4);
		
		JLabel lbl4 = new JLabel("  Racing Point");
		lbl4.setBounds(578, 124, 100, 24);
		panelClasi.add(lbl4);
		
		JLabel PTSE4 = new JLabel("154");
		PTSE4.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE4.setBounds(721, 124, 46, 24);
		panelClasi.add(PTSE4);
		
		JPanel p5 = new JPanel();
		p5.setBounds(517, 146, 40, 24);
		panelClasi.add(p5);
		
		JLabel label_4_4 = new JLabel("5");
		p5.add(label_4_4);
		
		JPanel pC5 = new JPanel();
		pC5.setBackground(new Color(255, 245, 0));
		pC5.setBounds(554, 146, 25, 24);
		panelClasi.add(pC5);
		
		JLabel lbl5 = new JLabel("  Renault");
		lbl5.setBounds(578, 146, 100, 24);
		panelClasi.add(lbl5);
		
		JLabel PTSE5 = new JLabel("144");
		PTSE5.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE5.setBounds(721, 146, 46, 24);
		panelClasi.add(PTSE5);
		
		JPanel p6 = new JPanel();
		p6.setBounds(517, 170, 40, 24);
		panelClasi.add(p6);
		
		JLabel label_4_4_1 = new JLabel("6");
		p6.add(label_4_4_1);
		
		JPanel pC6 = new JPanel();
		pC6.setBackground(new Color(220, 0, 0));
		pC6.setBounds(554, 170, 25, 24);
		panelClasi.add(pC6);
		
		JLabel lbl6 = new JLabel("  Ferrari");
		lbl6.setBounds(578, 170, 100, 24);
		panelClasi.add(lbl6);
		
		JLabel PTSE6 = new JLabel("131");
		PTSE6.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE6.setBounds(721, 170, 46, 24);
		panelClasi.add(PTSE6);
		
		JPanel p7 = new JPanel();
		p7.setBounds(517, 194, 40, 24);
		panelClasi.add(p7);
		
		JLabel label_4_4_2 = new JLabel("7");
		p7.add(label_4_4_2);
		
		JPanel pC7 = new JPanel();
		pC7.setBackground(new Color(255,255,255));
		pC7.setBounds(554, 194, 25, 24);
		panelClasi.add(pC7);
		
		JLabel lbl7 = new JLabel("  AlphaTauri");
		lbl7.setBounds(578, 194, 100, 24);
		panelClasi.add(lbl7);
		
		JLabel PTSE7 = new JLabel("97");
		PTSE7.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE7.setBounds(721, 194, 46, 24);
		panelClasi.add(PTSE7);
		
		JPanel p8 = new JPanel();
		p8.setBounds(517, 218, 40, 24);
		panelClasi.add(p8);
		
		JLabel label_4_4_3 = new JLabel("8");
		p8.add(label_4_4_3);
		
		JPanel pC8 = new JPanel();
		pC8.setBackground(new Color(150, 0, 0));
		pC8.setBounds(554, 218, 25, 24);
		panelClasi.add(pC8);
		
		JLabel lbl8 = new JLabel("  Alfa Romeo Racing");
		lbl8.setBounds(578, 218, 100, 24);
		panelClasi.add(lbl8);
		
		JLabel PTSE8 = new JLabel("8");
		PTSE8.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE8.setBounds(721, 216, 46, 24);
		panelClasi.add(PTSE8);
		
		JPanel p9 = new JPanel();
		p9.setBounds(517, 242, 40, 24);
		panelClasi.add(p9);
		
		JLabel label_4_4_4 = new JLabel("9");
		p9.add(label_4_4_4);
		
		JPanel pC9 = new JPanel();
		pC9.setBackground(new Color(120, 120, 120));
		pC9.setBounds(554, 242, 25, 24);
		panelClasi.add(pC9);
		
		JLabel lbl9 = new JLabel("  Haas F1 Team");
		lbl9.setBounds(578, 242, 100, 24);
		panelClasi.add(lbl9);
		
		JLabel PTSE9 = new JLabel("3");
		PTSE9.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE9.setBounds(721, 242, 46, 24);
		panelClasi.add(PTSE9);
		
		JPanel p10 = new JPanel();
		p10.setBounds(517, 265, 40, 24);
		panelClasi.add(p10);
		
		JLabel label_4_4_5 = new JLabel("10");
		p10.add(label_4_4_5);
		
		JPanel pC10 = new JPanel();
		pC10.setBackground(new Color(0, 130, 250));
		pC10.setBounds(554, 265, 25, 24);
		panelClasi.add(pC10);
		
		JLabel lbl10 = new JLabel("  Williams");
		lbl10.setBounds(578, 265, 100, 24);
		panelClasi.add(lbl10);
		
		JLabel PTSE10 = new JLabel("0");
		PTSE10.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE10.setBounds(721, 265, 46, 24);
		panelClasi.add(PTSE10);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(517, 55, 250, 234);
		panelClasi.add(textArea_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("P");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(517, 27, 40, 24);
		panelClasi.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("CE");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(554, 30, 25, 19);
		panelClasi.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_6 = new JLabel("NE");
		lblNewLabel_4_6.setForeground(Color.WHITE);
		lblNewLabel_4_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_6.setBounds(578, 30, 100, 19);
		panelClasi.add(lblNewLabel_4_6);
		
		JLabel lblPts_1 = new JLabel("PTS");
		lblPts_1.setForeground(Color.WHITE);
		lblPts_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPts_1.setBounds(721, 30, 46, 19);
		panelClasi.add(lblPts_1);
		
		JLabel Siglas = new JLabel("Siglas");
		Siglas.setHorizontalAlignment(SwingConstants.CENTER);
		Siglas.setBounds(517, 380, 250, 24);
		panelClasi.add(Siglas);
		
		JLabel Puesto = new JLabel("P = Puesto");
		Puesto.setHorizontalAlignment(SwingConstants.CENTER);
		Puesto.setBounds(517, 399, 250, 22);
		panelClasi.add(Puesto);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("CE");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setBounds(140, 25, 25, 29);
		panelClasi.add(lblNewLabel_3_1_1);
		
		JLabel CE = new JLabel("CE= Color Escuderia");
		CE.setHorizontalAlignment(SwingConstants.CENTER);
		CE.setBounds(517, 422, 250, 22);
		panelClasi.add(CE);
		
		JLabel NE = new JLabel("NE = Nombre Escuderia");
		NE.setHorizontalAlignment(SwingConstants.CENTER);
		NE.setBounds(517, 468, 250, 22);
		panelClasi.add(NE);
		
		JLabel NP = new JLabel("NP = Nombre Piloto");
		NP.setHorizontalAlignment(SwingConstants.CENTER);
		NP.setBounds(517, 443, 250, 22);
		panelClasi.add(NP);
		
		JLabel PTS = new JLabel("PTS = Puntos");
		PTS.setHorizontalAlignment(SwingConstants.CENTER);
		PTS.setBounds(517, 491, 250, 22);
		panelClasi.add(PTS);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		textArea_2.setBounds(517, 380, 250, 133);
		panelClasi.add(textArea_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(101, 55, 250, 458);
		panelClasi.add(textArea);
		
		JLabel lblFondo = new JLabel();
		lblFondo.setBounds(0, 0, 974, 541);
		panelClasi.add(lblFondo);
		lblFondo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.PNG"));
		
		menu(controlador);
		
		
	}

}
