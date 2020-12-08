package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import logica.ConectionHelper;
import logica.Controlador;
import modelo.Escuderia;
import modelo.GranPremio;
import modelo.Piloto;

public class Inicio extends Cabecera {
	public Inicio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("src" + File.separator + "Imagenes" + File.separator
				+ "coches" + File.separator + "F1-logo-ventana.png"));
	}

	private JButton btnAlfaRomeo, btnAlphaTauri, btnNFerrari, btnHaas, btnMclaren, btnMercedes, btnRacingPonit,
			btnRedBull, btnRenault, btnWilliams;
	private JTextField txtNombre, txtNacionalidad, txtNacimiento, txtPalmares, txtEscuderia, txtEstado, txtPodios;
	private JTextPane txtBiblio;
	private JButton btnPiloto1, btnPiloto2;
	private JTextField textNombre, textNacionalidad, textBase, textAño, textPremios, textJefeE, textJefeT, textPiloto1,
			textPiloto2;
	private int vueltas;
	private JComboBox comboListaCircuitos, comboTiempo;
	private JTextField textLogitud;
	private JTextField textCurvas;
	private JTextField textPrimerAño;
	private JTextField textDistanciaGP;
	private JTextField textVueltas;
	private JPanel panel;

	private JTextField Fila1Pos;
	private JTextField Fila11;
	private JTextField Fila21;
	private JTextField Fila31;
	private JTextField Fila41;
	private JTextField Fila51;
	private JTextField Fila61;
	private JTextField Fila71;
	private JTextField Fila81;
	private JTextField Fila91;
	private JTextField Fila101;
	private JTextField Fila111;
	private JTextField Fila121;
	private JTextField Fila131;
	private JTextField Fila141;
	private JTextField Fila151;
	private JTextField Fila161;
	private JTextField Fila171;
	private JTextField Fila201;
	private JTextField Fila191;
	private JTextField Fila181;
	private JTextField txtPiloto;
	private JTextField Fila12;
	private JTextField Fila22;
	private JTextField Fila32;
	private JTextField Fila42;
	private JTextField Fila52;
	private JTextField Fila62;
	private JTextField Fila72;
	private JTextField Fila82;
	private JTextField Fila92;
	private JTextField Fila102;
	private JTextField Fila122;
	private JTextField Fila112;
	private JTextField Fila132;
	private JTextField Fila142;
	private JTextField Fila152;
	private JTextField Fila162;
	private JTextField Fila172;
	private JTextField Fila182;
	private JTextField Fila192;
	private JTextField Fila202;

	private JTextField Fila13;
	private JTextField Fila23;
	private JTextField Fila33;
	private JTextField Fila43;
	private JTextField Fila53;
	private JTextField Fila63;
	private JTextField Fila73;
	private JTextField Fila83;
	private JTextField Fila93;
	private JTextField Fila103;
	private JTextField Fila123;
	private JTextField Fila113;
	private JTextField Fila133;
	private JTextField Fila143;
	private JTextField Fila163;
	private JTextField Fila153;
	private JTextField Fila173;
	private JTextField Fila183;
	private JTextField Fila193;
	private JTextField Fila203;
	private JTextField txtVueltaRapida;
	private JTextField Fila14;
	private JTextField Fila24;
	private JTextField Fila34;
	private JTextField Fila44;
	private JTextField Fila54;
	private JTextField Fila64;
	private JTextField Fila74;
	private JTextField Fila84;
	private JTextField Fila94;
	private JTextField Fila104;
	private JTextField Fila114;
	private JTextField Fila124;
	private JTextField Fila134;
	private JTextField Fila144;
	private JTextField Fila154;
	private JTextField Fila164;
	private JTextField Fila174;
	private JTextField Fila184;
	private JTextField Fila204;
	private JTextField Fila194;

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
		btnMercedes.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "coches" + File.separator + "Mercedes.png"));
		btnMercedes.addActionListener(controlador);
		btnMercedes.setBounds(0, 0, 270, 121);
		panelMercedes.add(btnMercedes);

		JPanel panelRedBull = new JPanel();
		panelRedBull.setLayout(null);
		panelRedBull.setBackground(Color.WHITE);
		panelRedBull.setBounds(10, 143, 270, 121);
		panelEscuderia.add(panelRedBull);

		JButton btnRedBull = new JButton("3");
		btnRedBull.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "coches" + File.separator + "RedBull.png"));
		btnRedBull.addActionListener(controlador);
		btnRedBull.setBounds(0, 0, 270, 121);
		panelRedBull.add(btnRedBull);

		JPanel panelMclaren = new JPanel();
		panelMclaren.setLayout(null);
		panelMclaren.setBackground(Color.WHITE);
		panelMclaren.setBounds(10, 275, 270, 121);
		panelEscuderia.add(panelMclaren);

		JButton btnMclaren = new JButton("5");
		btnMclaren.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "coches" + File.separator + "Mclaren.png"));
		btnMclaren.addActionListener(controlador);
		btnMclaren.setBounds(0, 0, 270, 121);
		panelMclaren.add(btnMclaren);

		JPanel panelRacingPoint = new JPanel();
		panelRacingPoint.setLayout(null);
		panelRacingPoint.setBackground(Color.WHITE);
		panelRacingPoint.setBounds(10, 407, 270, 121);
		panelEscuderia.add(panelRacingPoint);

		JButton btnRacingPoint = new JButton("4");
		btnRacingPoint.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "coches" + File.separator + "RacingPoint.png"));
		btnRacingPoint.addActionListener(controlador);
		btnRacingPoint.setBounds(0, 0, 270, 121);
		panelRacingPoint.add(btnRacingPoint);

		JPanel panelRenault = new JPanel();
		panelRenault.setLayout(null);
		panelRenault.setBackground(Color.WHITE);
		panelRenault.setBounds(355, 11, 270, 121);
		panelEscuderia.add(panelRenault);

		JButton btnRenault = new JButton("6");
		btnRenault.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "coches" + File.separator + "Renault.png"));
		btnRenault.addActionListener(controlador);
		btnRenault.setBounds(0, 0, 270, 121);
		panelRenault.add(btnRenault);

		JPanel panelFerrari = new JPanel();
		panelFerrari.setLayout(null);
		panelFerrari.setBackground(Color.WHITE);
		panelFerrari.setBounds(355, 143, 270, 121);
		panelEscuderia.add(panelFerrari);

		JButton btnFerrari = new JButton("2");
		btnFerrari.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "coches" + File.separator + "ferrari.png"));
		btnFerrari.addActionListener(controlador);
		btnFerrari.setBounds(0, 0, 270, 121);
		panelFerrari.add(btnFerrari);

		JPanel panelAlphatauri = new JPanel();
		panelAlphatauri.setLayout(null);
		panelAlphatauri.setBackground(Color.WHITE);
		panelAlphatauri.setBounds(355, 275, 270, 121);
		panelEscuderia.add(panelAlphatauri);

		JButton btnAlphatauri = new JButton("7");
		btnAlphatauri.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "coches" + File.separator + "AlphaTauri.png"));
		btnAlphatauri.addActionListener(controlador);
		btnAlphatauri.setBounds(0, 0, 270, 121);
		panelAlphatauri.add(btnAlphatauri);

		JPanel panelAlfaRomeo = new JPanel();
		panelAlfaRomeo.setLayout(null);
		panelAlfaRomeo.setBackground(Color.WHITE);
		panelAlfaRomeo.setBounds(355, 407, 270, 121);
		panelEscuderia.add(panelAlfaRomeo);

		JButton btnAlfaRomeo = new JButton("8");
		btnAlfaRomeo.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "coches" + File.separator + "Alfa Romeo.PNG"));
		btnAlfaRomeo.addActionListener(controlador);
		btnAlfaRomeo.setBounds(0, 0, 270, 121);
		panelAlfaRomeo.add(btnAlfaRomeo);

		JPanel panelHaas = new JPanel();
		panelHaas.setLayout(null);
		panelHaas.setBackground(Color.WHITE);
		panelHaas.setBounds(694, 11, 270, 121);
		panelEscuderia.add(panelHaas);

		JButton btnHaas = new JButton("9");
		btnHaas.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "coches" + File.separator + "haas.png"));
		btnHaas.addActionListener(controlador);
		btnHaas.setBounds(0, 0, 270, 121);
		panelHaas.add(btnHaas);

		JPanel panelWilliams = new JPanel();
		panelWilliams.setLayout(null);
		panelWilliams.setBackground(Color.WHITE);
		panelWilliams.setBounds(694, 143, 270, 121);
		panelEscuderia.add(panelWilliams);

		JButton btnWilliams = new JButton("10");
		btnWilliams.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "coches" + File.separator + "Williams.png"));
		btnWilliams.addActionListener(controlador);
		btnWilliams.setBounds(0, 0, 270, 121);
		panelWilliams.add(btnWilliams);

		JLabel lblFondo = new JLabel();
		lblFondo.setBounds(0, 0, 974, 539);
		panelEscuderia.add(lblFondo);
		lblFondo.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Fondos" + File.separator + "Fondo6.PNG"));

		menu(controlador);
	}

	public void FichaEscuderia(Controlador controlador, Escuderia escuderia, ArrayList<Piloto> pilotos, String ruta,
			String piloto1, String piloto2) {
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

		btnPiloto1 = new JButton(pilotos.get(0).getNombre());
		btnPiloto1.setBounds(440, 40, 232, 232);
		btnPiloto1.setIcon(new ImageIcon(piloto1));
		btnPiloto1.addActionListener(controlador);
		panel_FichaEscuderia.add(btnPiloto1);

		textPiloto1 = new JTextField();
		textPiloto1.setHorizontalAlignment(SwingConstants.CENTER);
		textPiloto1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		textPiloto1.setText(pilotos.get(0).getNombre());
		textPiloto1.setEditable(false);
		textPiloto1.setBounds(440, 283, 232, 30);
		panel_FichaEscuderia.add(textPiloto1);
		textPiloto1.setColumns(10);

		btnPiloto2 = new JButton(pilotos.get(1).getNombre());
		btnPiloto2.setBounds(710, 40, 232, 232);
		btnPiloto2.setIcon(new ImageIcon(piloto2));
		btnPiloto2.addActionListener(controlador);
		panel_FichaEscuderia.add(btnPiloto2);

		textPiloto2 = new JTextField();
		textPiloto2.setHorizontalAlignment(SwingConstants.CENTER);
		textPiloto2.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		textPiloto2.setText(pilotos.get(1).getNombre());
		textPiloto2.setEditable(false);
		textPiloto2.setColumns(10);
		textPiloto2.setBounds(710, 283, 232, 30);
		panel_FichaEscuderia.add(textPiloto2);

		JLabel lblFondo = new JLabel();
		lblFondo.setBounds(0, 0, 974, 539);
		panel_FichaEscuderia.add(lblFondo);
		lblFondo.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Fondos" + File.separator + "Fondo6.PNG"));

		menu(controlador);
	}

	public void inicio(Controlador controlador) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelInicio = new JPanel();
		panelInicio.setBounds(0, 72, 974, 539);
		contentPane.add(panelInicio);
		panelInicio.setLayout(null);

		JPanel panelNoticia1 = new JPanel();
		panelNoticia1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelNoticia1.setBounds(27, 11, 328, 285);
		panelInicio.add(panelNoticia1);
		panelNoticia1.setLayout(null);

		JTextArea txtrNoticia1 = new JTextArea();
		txtrNoticia1.setEditable(false);
		txtrNoticia1.setFont(new Font("Consolas", Font.BOLD, 15));
		txtrNoticia1.setOpaque(false);
		txtrNoticia1.setLineWrap(true);
		txtrNoticia1.setWrapStyleWord(true);
		txtrNoticia1.setText(
				"Bottas: \"Los que no saben de F1 podr\u00EDan pensar que he quedado como un completo idiota\"");
		txtrNoticia1.setBounds(31, 175, 270, 61);
		panelNoticia1.add(txtrNoticia1);

		JLabel lblNoticia1 = new JLabel("");
		lblNoticia1.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Noticias" + File.separator + "Noticia.jpg"));
		lblNoticia1.setBounds(31, 21, 270, 144);
		panelNoticia1.add(lblNoticia1);

		JButton btnLeerMas1 = new JButton("Leer mas I");
		btnLeerMas1.setBorder(new CompoundBorder());
		btnLeerMas1.addActionListener(controlador);
		btnLeerMas1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLeerMas1.setBounds(223, 246, 95, 29);
		panelNoticia1.add(btnLeerMas1);

		JPanel panelNoticia2 = new JPanel();
		panelNoticia2.setLayout(null);
		panelNoticia2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelNoticia2.setBounds(370, 11, 319, 285);
		panelInicio.add(panelNoticia2);

		JTextArea txtrNoticia2 = new JTextArea();
		txtrNoticia2.setEditable(false);
		txtrNoticia2.setWrapStyleWord(true);
		txtrNoticia2.setText("McLaren reafirma su estrategia");
		txtrNoticia2.setOpaque(false);
		txtrNoticia2.setFont(new Font("Consolas", Font.BOLD, 17));
		txtrNoticia2.setBounds(16, 188, 293, 25);
		panelNoticia2.add(txtrNoticia2);

		JLabel lblNoticia2 = new JLabel("");
		lblNoticia2.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Noticias" + File.separator + "Noticia2.jpg"));
		lblNoticia2.setBounds(27, 26, 270, 152);
		panelNoticia2.add(lblNoticia2);

		JButton btnLeerMas2 = new JButton("Leer mas II");
		btnLeerMas2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLeerMas2.addActionListener(controlador);
		btnLeerMas2.setBorder(new CompoundBorder());
		btnLeerMas2.setBounds(213, 238, 96, 32);
		panelNoticia2.add(btnLeerMas2);

		JPanel panel = new JPanel();
		panel.setBounds(699, 11, 265, 332);
		panelInicio.add(panel);
		panel.setLayout(null);

		JLabel lblGP = new JLabel("");
		lblGP.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Grandes Premios"
				+ File.separator + "Portada" + File.separator + "Abudhabi.png"));
		lblGP.setBounds(10, 11, 245, 180);
		panel.add(lblGP);

		JPanel pC3 = new JPanel();
		pC3.setBackground(new Color(255, 159, 0));
		pC3.setBounds(10, 202, 15, 17);
		panel.add(pC3);

		JLabel lblTitulo = new JLabel("PR\u00D3XIMO GP DE F\u00D3RMULA 1");
		lblTitulo.setBounds(35, 202, 220, 17);
		panel.add(lblTitulo);

		JLabel lblNewLabel_2 = new JLabel("GP DE ABU DHABI");
		lblNewLabel_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 245, 245, 103);
		panel.add(lblNewLabel_2);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 311, 245, 10);
		panel.add(separator);

		JLabel lblFecha = new JLabel("13 DE DICIEMBRE");
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		lblFecha.setBounds(57, 230, 116, 14);
		panel.add(lblFecha);

		JPanel panelNoticia3 = new JPanel();
		panelNoticia3.setLayout(null);
		panelNoticia3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelNoticia3.setBounds(27, 305, 662, 224);
		panelInicio.add(panelNoticia3);

		JTextArea txtrNoticia3 = new JTextArea();
		txtrNoticia3.setWrapStyleWord(true);
		txtrNoticia3.setText("Mercedes se llena de dudas con Bottas y salpican a Hamilton");
		txtrNoticia3.setOpaque(false);
		txtrNoticia3.setLineWrap(true);
		txtrNoticia3.setFont(new Font("Consolas", Font.BOLD, 19));
		txtrNoticia3.setEditable(false);
		txtrNoticia3.setBounds(287, 23, 350, 52);
		panelNoticia3.add(txtrNoticia3);

		JLabel lblNoticia3 = new JLabel("");
		lblNoticia3.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Noticias" + File.separator + "Noticia3.jpg"));
		lblNoticia3.setBounds(21, 47, 241, 136);
		panelNoticia3.add(lblNoticia3);

		JTextArea txtNoticia3 = new JTextArea();
		txtNoticia3.setEditable(false);
		txtNoticia3.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtNoticia3.setOpaque(false);
		txtNoticia3.setWrapStyleWord(true);
		txtNoticia3.setLineWrap(true);
		txtNoticia3.setText(
				"El a\u00F1o de los r\u00E9cords termina repleto de dudas en el garaje de Mercedes, y eso que una concatenaci\u00F3n de errores dej\u00F3 sin victoria a Russell con el coche de Hamilton. ");
		txtNoticia3.setBounds(287, 81, 350, 102);
		panelNoticia3.add(txtNoticia3);

		JButton btnLeerMas3 = new JButton("Leer mas III");
		btnLeerMas3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLeerMas3.addActionListener(controlador);
		btnLeerMas3.setBorder(new CompoundBorder());
		btnLeerMas3.setBounds(556, 182, 96, 32);
		panelNoticia3.add(btnLeerMas3);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Fondos" + File.separator + "Fondo6.PNG"));
		lblNewLabel.setBounds(0, 0, 974, 539);
		panelInicio.add(lblNewLabel);
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
		lblNº.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Hamilton.png"));
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
		lblNº_1.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Bottas.png"));
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
		lblNº_2.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos"
				+ File.separator + "Verstappen.png"));
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
		lblNº_3.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos"
				+ File.separator + "Ricciardo.png"));
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
		lblNº_4.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Leclrec.png"));
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
		lblNº_5.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Perez.png"));
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
		lblNº_6.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Norris.png"));
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
		btnSAINZ.addActionListener(controlador);
		btnSAINZ.setBounds(0, 11, 178, 37);
		panelSAINZ.add(btnSAINZ);

		JSeparator separatorSAINZ = new JSeparator();
		separatorSAINZ.setBounds(10, 51, 245, 8);
		panelSAINZ.add(separatorSAINZ);

		JLabel lblNº_7 = new JLabel("");
		lblNº_7.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Sainz.png"));
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
		lblNº_8.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Albon.png"));
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
		lblNº_16_1.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Gasly.png"));
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
		lblNº_17.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Stroll.png"));
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
		lblNº_16.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Ocon.png"));
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
		lblNº_10.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Kvyat.png"));
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
		lblNº_11.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Vettel.png"));
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
		lblNº_12.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos"
				+ File.separator + "Magnussen.png"));
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
		lblNº_13.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos"
				+ File.separator + "Raikkonen.png"));

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
		lblNº_14.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Numpilotos"
				+ File.separator + "Giovinnazzi.png"));
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
		lblNº_15.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Grosjean.png"));
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
		lblNº_19.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Latifi.png"));
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
		lblNº_18.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Numpilotos" + File.separator + "Russell.png"));
		lblNº_18.setBounds(180, 0, 85, 49);
		panelRussell.add(lblNº_18);

		JLabel lblFondo = new JLabel();
		lblFondo.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Fondos" + File.separator + "Fondo6.PNG"));
		lblFondo.setBounds(0, 0, 974, 539);
		panelPilotos.add(lblFondo);
	}

	public void fichaPilotos(Controlador controlador, Piloto piloto, Escuderia escuderia, String ruta) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 650);
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
		txtNacimiento.setText(piloto.getFechaNacimiento() + "");
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
		txtPodios.setText(piloto.getPodios() + "");
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
		lblFondo.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Fondos" + File.separator + "Fondo6.PNG"));
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

		JLabel PTS2 = new JLabel("203");
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
		pPC4.setBounds(140, 146, 25, 24);
		panelClasi.add(pPC4);

		JLabel lblDanielRicciardo_1 = new JLabel(" Daniel Ricciardo");
		lblDanielRicciardo_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDanielRicciardo_1.setBounds(165, 146, 130, 24);
		panelClasi.add(lblDanielRicciardo_1);

		JLabel PTS4 = new JLabel("112");
		PTS4.setHorizontalAlignment(SwingConstants.CENTER);
		PTS4.setBounds(305, 146, 46, 24);
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
		pPC5.setBounds(140, 124, 25, 24);
		panelClasi.add(pPC5);

		JLabel lblDanielRicciardo = new JLabel(" Sergio Perez");
		lblDanielRicciardo.setHorizontalAlignment(SwingConstants.LEFT);
		lblDanielRicciardo.setBounds(165, 124, 130, 24);
		panelClasi.add(lblDanielRicciardo);

		JLabel PTS5 = new JLabel("125");
		PTS5.setHorizontalAlignment(SwingConstants.CENTER);
		PTS5.setBounds(305, 124, 46, 24);
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
		pPC7.setBounds(140, 237, 25, 24);
		panelClasi.add(pPC7);

		JLabel lblLandoNorris = new JLabel(" Lando Norris");
		lblLandoNorris.setHorizontalAlignment(SwingConstants.LEFT);
		lblLandoNorris.setBounds(165, 237, 130, 24);
		panelClasi.add(lblLandoNorris);

		JLabel PTS7 = new JLabel("87");
		PTS7.setHorizontalAlignment(SwingConstants.CENTER);
		PTS7.setBounds(305, 237, 46, 24);
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
		pPC8.setBounds(140, 194, 25, 24);
		panelClasi.add(pPC8);

		JLabel lblCarlosSainz = new JLabel(" Carlos Sainz");
		lblCarlosSainz.setHorizontalAlignment(SwingConstants.LEFT);
		lblCarlosSainz.setBounds(165, 194, 130, 24);
		panelClasi.add(lblCarlosSainz);

		JLabel PTS8 = new JLabel("97");
		PTS8.setHorizontalAlignment(SwingConstants.CENTER);
		PTS8.setBounds(305, 194, 46, 24);
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
		pPC9.setBounds(140, 216, 25, 24);
		panelClasi.add(pPC9);

		JLabel lblAlexanderAlbon = new JLabel(" Alexander Albon");
		lblAlexanderAlbon.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlexanderAlbon.setBounds(165, 216, 130, 24);
		panelClasi.add(lblAlexanderAlbon);

		JLabel PTS9 = new JLabel("93");
		PTS9.setHorizontalAlignment(SwingConstants.CENTER);
		PTS9.setBounds(305, 216, 46, 24);
		panelClasi.add(PTS9);

		JPanel pP10 = new JPanel();
		pP10.setBounds(101, 261, 40, 24);
		panelClasi.add(pP10);

		JLabel label_3_5_1 = new JLabel("10");
		label_3_5_1.setForeground(Color.BLACK);
		label_3_5_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pP10.add(label_3_5_1);

		JPanel pPC10 = new JPanel();
		pPC10.setBackground(new Color(255, 255, 255));
		pPC10.setBounds(140, 283, 25, 24);
		panelClasi.add(pPC10);

		JLabel lblPierreGasly = new JLabel(" Pierre Gasly");
		lblPierreGasly.setHorizontalAlignment(SwingConstants.LEFT);
		lblPierreGasly.setBounds(165, 283, 130, 24);
		panelClasi.add(lblPierreGasly);

		JLabel PTS10 = new JLabel("71");
		PTS10.setHorizontalAlignment(SwingConstants.CENTER);
		PTS10.setBounds(305, 283, 46, 24);
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
		pPC11.setBounds(140, 261, 25, 24);
		panelClasi.add(pPC11);

		JLabel lblLanceStroll = new JLabel(" Lance Stroll");
		lblLanceStroll.setHorizontalAlignment(SwingConstants.LEFT);
		lblLanceStroll.setBounds(165, 261, 130, 24);
		panelClasi.add(lblLanceStroll);

		JLabel PTS11 = new JLabel("74");
		PTS11.setHorizontalAlignment(SwingConstants.CENTER);
		PTS11.setBounds(305, 261, 46, 24);
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

		JLabel PTS12 = new JLabel("60");
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
		pPC14.setBackground(new Color(255, 255, 255));
		pPC14.setBounds(140, 350, 25, 24);
		panelClasi.add(pPC14);

		JLabel lblDaniilKvyat = new JLabel(" Daniil Kvyat");
		lblDaniilKvyat.setHorizontalAlignment(SwingConstants.LEFT);
		lblDaniilKvyat.setBounds(165, 350, 130, 24);
		panelClasi.add(lblDaniilKvyat);

		JLabel PTS14 = new JLabel("32");
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
		pPC17.setBounds(140, 443, 25, 24);
		panelClasi.add(pPC17);

		JLabel lblRomainGrosjean = new JLabel(" Romain Grosjean");
		lblRomainGrosjean.setHorizontalAlignment(SwingConstants.LEFT);
		lblRomainGrosjean.setBounds(165, 443, 130, 24);
		panelClasi.add(lblRomainGrosjean);

		JLabel PTS17 = new JLabel("2");
		PTS17.setHorizontalAlignment(SwingConstants.CENTER);
		PTS17.setBounds(305, 443, 46, 24);
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
		pPC18.setBounds(140, 466, 25, 24);
		panelClasi.add(pPC18);

		JLabel lblKevinMagnussen = new JLabel(" Kevin Magnussen");
		lblKevinMagnussen.setHorizontalAlignment(SwingConstants.LEFT);
		lblKevinMagnussen.setBounds(165, 466, 130, 24);
		panelClasi.add(lblKevinMagnussen);

		JLabel PTS18 = new JLabel("1");
		PTS18.setHorizontalAlignment(SwingConstants.CENTER);
		PTS18.setBounds(305, 466, 46, 24);
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
		pPC19.setBounds(140, 489, 25, 24);
		panelClasi.add(pPC19);

		JLabel lblNicholasLatifi = new JLabel(" Nicholas Latifi");
		lblNicholasLatifi.setHorizontalAlignment(SwingConstants.LEFT);
		lblNicholasLatifi.setBounds(165, 489, 130, 24);
		panelClasi.add(lblNicholasLatifi);

		JLabel PTS19 = new JLabel("0");
		PTS19.setHorizontalAlignment(SwingConstants.CENTER);
		PTS19.setBounds(305, 489, 46, 24);
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
		pPC20.setBounds(140, 420, 25, 24);
		panelClasi.add(pPC20);

		JLabel lblLewisHamilton_1 = new JLabel(" Geroge Russell");
		lblLewisHamilton_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblLewisHamilton_1.setBounds(165, 420, 130, 24);
		panelClasi.add(lblLewisHamilton_1);

		JLabel PTS20 = new JLabel("3");
		PTS20.setHorizontalAlignment(SwingConstants.CENTER);
		PTS20.setBounds(305, 420, 46, 24);
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

		JLabel PTSE1 = new JLabel("540");
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

		JLabel PTSE2 = new JLabel("282");
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
		pC3.setBounds(554, 124, 25, 24);
		panelClasi.add(pC3);

		JLabel lbl3 = new JLabel("  Mclaren");
		lbl3.setBounds(578, 124, 100, 24);
		panelClasi.add(lbl3);

		JLabel PTSE3 = new JLabel("184");
		PTSE3.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE3.setBounds(721, 124, 46, 24);
		panelClasi.add(PTSE3);

		JPanel p4 = new JPanel();
		p4.setBounds(517, 124, 40, 24);
		panelClasi.add(p4);

		JLabel label_4_3 = new JLabel("4");
		p4.add(label_4_3);

		JPanel pC4 = new JPanel();
		pC4.setBackground(new Color(245, 150, 200));
		pC4.setBounds(554, 101, 25, 24);
		panelClasi.add(pC4);

		JLabel lbl4 = new JLabel("  Racing Point");
		lbl4.setBounds(578, 101, 100, 24);
		panelClasi.add(lbl4);

		JLabel PTSE4 = new JLabel("194");
		PTSE4.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE4.setBounds(721, 101, 46, 24);
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

		JLabel PTSE5 = new JLabel("172");
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
		pC7.setBackground(new Color(255, 255, 255));
		pC7.setBounds(554, 194, 25, 24);
		panelClasi.add(pC7);

		JLabel lbl7 = new JLabel("  AlphaTauri");
		lbl7.setBounds(578, 194, 100, 24);
		panelClasi.add(lbl7);

		JLabel PTSE7 = new JLabel("103");
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
		lblFondo.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Fondos" + File.separator + "Fondo6.PNG"));

		menu(controlador);

	}

	public void GrandesPremios(Controlador controlador) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelGrandesPremios = new JPanel();
		panelGrandesPremios.setBounds(0, 71, 974, 540);
		contentPane.add(panelGrandesPremios);
		panelGrandesPremios.setLayout(null);

		JPanel panelReBull1 = new JPanel();
		panelReBull1.setBounds(53, 58, 207, 60);
		panelGrandesPremios.add(panelReBull1);
		panelReBull1.setLayout(null);

		JButton btnRedBull1 = new JButton("Red bull Ring I");
		btnRedBull1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnRedBull1.addActionListener(controlador);
		btnRedBull1.setBackground(Color.WHITE);
		btnRedBull1.setBounds(0, 0, 148, 49);
		panelReBull1.add(btnRedBull1);

		JLabel bandera1 = new JLabel("");
		bandera1.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Austria.png"));
		bandera1.setBounds(147, 0, 60, 49);
		panelReBull1.add(bandera1);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon());
		lblNewLabel_1.setBounds(0, 50, 207, 10);
		panelReBull1.add(lblNewLabel_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 50, 207, 10);
		panelReBull1.add(panel_1);
		panel_1.setLayout(null);

		JPanel panelRedBull2 = new JPanel();
		panelRedBull2.setBounds(375, 58, 207, 60);
		panelGrandesPremios.add(panelRedBull2);
		panelRedBull2.setLayout(null);

		JButton btnRedBull2 = new JButton("Red bull Ring II");
		btnRedBull2.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnRedBull2.addActionListener(controlador);
		btnRedBull2.setBackground(Color.WHITE);
		btnRedBull2.setBounds(0, 0, 148, 49);
		panelRedBull2.add(btnRedBull2);

		JLabel bandera2 = new JLabel("");
		bandera2.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Austria.png"));
		bandera2.setBounds(147, 0, 60, 49);
		panelRedBull2.add(bandera2);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "BahreinBarra.png"));
		lblNewLabel_1_1.setBounds(0, 50, 207, 10);
		panelRedBull2.add(lblNewLabel_1_1);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(0, 50, 207, 10);
		panelRedBull2.add(panel_1_1);
		panel_1_1.setLayout(null);

		JPanel panelHungaroring = new JPanel();
		panelHungaroring.setBounds(690, 58, 207, 60);
		panelGrandesPremios.add(panelHungaroring);
		panelHungaroring.setLayout(null);

		JButton btnHungaroring = new JButton("Hungaroring");
		btnHungaroring.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnHungaroring.addActionListener(controlador);
		btnHungaroring.setBackground(Color.WHITE);
		btnHungaroring.setBounds(0, 0, 148, 49);
		panelHungaroring.add(btnHungaroring);

		JLabel bandera3 = new JLabel("");
		bandera3.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Hungria.png"));
		bandera3.setBounds(147, 0, 60, 49);
		panelHungaroring.add(bandera3);

		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon());
		lblNewLabel_1_2.setBounds(0, 50, 207, 10);
		panelHungaroring.add(lblNewLabel_1_2);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(0, 50, 207, 10);
		panelHungaroring.add(panel_1_2);

		JPanel panelSilverstone = new JPanel();
		panelSilverstone.setBounds(53, 129, 207, 60);
		panelGrandesPremios.add(panelSilverstone);
		panelSilverstone.setLayout(null);

		JButton btnSilverstone = new JButton("Silverstone I");
		btnSilverstone.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSilverstone.addActionListener(controlador);
		btnSilverstone.setBackground(Color.WHITE);
		btnSilverstone.setBounds(0, 0, 148, 49);
		panelSilverstone.add(btnSilverstone);

		JLabel bandera4 = new JLabel("");
		bandera4.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Gran Bretaña.png"));
		bandera4.setBounds(147, 0, 60, 49);
		panelSilverstone.add(bandera4);

		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(0, 50, 207, 10);
		panelSilverstone.add(panel_1_3);

		JLabel lblNewLabel_1_2_2 = new JLabel("");
		lblNewLabel_1_2_2.setBounds(0, 0, 207, 10);
		panel_1_3.add(lblNewLabel_1_2_2);

		JPanel panelSilverstoner2 = new JPanel();
		panelSilverstoner2.setBounds(375, 129, 207, 60);
		panelGrandesPremios.add(panelSilverstoner2);
		panelSilverstoner2.setLayout(null);

		JButton btnSilverstone2 = new JButton("Silverstone II");
		btnSilverstone2.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSilverstone2.addActionListener(controlador);
		btnSilverstone2.setBackground(Color.WHITE);
		btnSilverstone2.setBounds(0, 0, 148, 49);
		panelSilverstoner2.add(btnSilverstone2);

		JLabel bandera5 = new JLabel("");
		bandera5.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Gran Bretaña.png"));
		bandera5.setBounds(147, 0, 60, 49);
		panelSilverstoner2.add(bandera5);

		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setBounds(0, 50, 207, 10);
		panelSilverstoner2.add(panel_1_3_1);
		panel_1_3_1.setLayout(null);

		JLabel lblNewLabel_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1.setIcon(new ImageIcon());
		lblNewLabel_1_2_1.setBounds(0, 0, 207, 10);
		panel_1_3_1.add(lblNewLabel_1_2_1);

		JPanel panelBarcelona = new JPanel();
		panelBarcelona.setBounds(690, 129, 207, 60);
		panelGrandesPremios.add(panelBarcelona);
		panelBarcelona.setLayout(null);

		JButton btnBarcelona = new JButton("Barcelona");
		btnBarcelona.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnBarcelona.addActionListener(controlador);
		btnBarcelona.setBackground(Color.WHITE);
		btnBarcelona.setBounds(0, 0, 148, 49);
		panelBarcelona.add(btnBarcelona);

		JLabel bandera6 = new JLabel("");
		bandera6.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "España.png"));
		bandera6.setBounds(147, 0, 60, 49);
		panelBarcelona.add(bandera6);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(0, 50, 207, 10);
		panelBarcelona.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);

		JLabel lblNewLabel_1_2_1_1 = new JLabel("");
		lblNewLabel_1_2_1_1.setIcon(new ImageIcon());
		lblNewLabel_1_2_1_1.setBounds(0, 0, 207, 10);
		panel_1_1_1.add(lblNewLabel_1_2_1_1);

		JPanel panelSpa = new JPanel();
		panelSpa.setBounds(53, 200, 207, 60);
		panelGrandesPremios.add(panelSpa);
		panelSpa.setLayout(null);

		JButton btnSpa = new JButton("Spa");
		btnSpa.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSpa.addActionListener(controlador);
		btnSpa.setBackground(Color.WHITE);
		btnSpa.setBounds(0, 0, 148, 49);
		panelSpa.add(btnSpa);

		JLabel bandera7 = new JLabel("");
		bandera7.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Belgica.png"));
		bandera7.setBounds(147, 0, 60, 49);
		panelSpa.add(bandera7);

		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBounds(0, 50, 207, 10);
		panelSpa.add(panel_1_1_1_1);
		panel_1_1_1_1.setLayout(null);

		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("");
		lblNewLabel_1_2_1_1_1.setIcon(new ImageIcon());
		lblNewLabel_1_2_1_1_1.setBounds(0, 0, 207, 10);
		panel_1_1_1_1.add(lblNewLabel_1_2_1_1_1);

		JPanel panelMonza = new JPanel();
		panelMonza.setBounds(375, 200, 207, 60);
		panelGrandesPremios.add(panelMonza);
		panelMonza.setLayout(null);

		JButton btnMonza = new JButton("Monza");
		btnMonza.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnMonza.addActionListener(controlador);
		btnMonza.addActionListener(controlador);
		btnMonza.setBackground(Color.WHITE);
		btnMonza.setBounds(0, 0, 148, 49);
		panelMonza.add(btnMonza);

		JLabel bandera8 = new JLabel("");
		bandera8.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Italia.png"));
		bandera8.setBounds(147, 0, 60, 49);
		panelMonza.add(bandera8);

		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setBounds(0, 50, 207, 10);
		panelMonza.add(panel_1_1_1_1_1);
		panel_1_1_1_1_1.setLayout(null);

		JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel("");
		lblNewLabel_1_2_1_1_1_1.setIcon(new ImageIcon());
		lblNewLabel_1_2_1_1_1_1.setBounds(0, 0, 207, 10);
		panel_1_1_1_1_1.add(lblNewLabel_1_2_1_1_1_1);

		JPanel panelTorcana = new JPanel();
		panelTorcana.setBounds(690, 200, 207, 60);
		panelGrandesPremios.add(panelTorcana);
		panelTorcana.setLayout(null);

		JButton btntoscana = new JButton("La toscana");
		btntoscana.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btntoscana.addActionListener(controlador);
		btntoscana.setBackground(Color.WHITE);
		btntoscana.setBounds(0, 0, 148, 49);
		panelTorcana.add(btntoscana);

		JLabel bandera9 = new JLabel("");
		bandera9.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Italia.png"));
		bandera9.setBounds(147, 0, 60, 49);
		panelTorcana.add(bandera9);

		JPanel panel_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1.setBounds(0, 50, 207, 10);
		panelTorcana.add(panel_1_1_1_1_1_1);

		JPanel panelSochi = new JPanel();
		panelSochi.setBounds(53, 271, 207, 60);
		panelGrandesPremios.add(panelSochi);
		panelSochi.setLayout(null);

		JButton btnSochi = new JButton("Sochi");
		btnSochi.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSochi.addActionListener(controlador);
		btnSochi.setBackground(Color.WHITE);
		btnSochi.setBounds(0, 0, 148, 49);
		panelSochi.add(btnSochi);

		JLabel bandera10 = new JLabel("");
		bandera10.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Rusia.png"));
		bandera10.setBounds(147, 0, 60, 49);
		panelSochi.add(bandera10);

		JPanel panel_1_1_1_1_2 = new JPanel();
		panel_1_1_1_1_2.setBounds(0, 50, 207, 10);
		panelSochi.add(panel_1_1_1_1_2);

		JPanel panelNurburgring = new JPanel();
		panelNurburgring.setBounds(375, 271, 207, 60);
		panelGrandesPremios.add(panelNurburgring);
		panelNurburgring.setLayout(null);

		JButton btnNurburgring = new JButton("Nurburgring");
		btnNurburgring.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNurburgring.addActionListener(controlador);
		btnNurburgring.setBackground(Color.WHITE);
		btnNurburgring.setBounds(0, 0, 148, 49);
		panelNurburgring.add(btnNurburgring);

		JLabel bandera11 = new JLabel("");
		bandera11.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Alemania.png"));
		bandera11.setBounds(147, 0, 60, 49);
		panelNurburgring.add(bandera11);

		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setBounds(0, 50, 207, 10);
		panelNurburgring.add(panel_1_2_1);

		JPanel panelPortimao = new JPanel();
		panelPortimao.setBounds(690, 271, 207, 60);
		panelGrandesPremios.add(panelPortimao);
		panelPortimao.setLayout(null);

		JButton btnPortimao = new JButton("Portimao");
		btnPortimao.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnPortimao.addActionListener(controlador);
		btnPortimao.setBackground(Color.WHITE);
		btnPortimao.setBounds(0, 0, 148, 49);
		panelPortimao.add(btnPortimao);

		JLabel bandera12 = new JLabel("");
		bandera12.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Portugal.png"));
		bandera12.setBounds(147, 0, 60, 49);
		panelPortimao.add(bandera12);

		JPanel panel_1_2_1_1 = new JPanel();
		panel_1_2_1_1.setBounds(0, 50, 207, 10);
		panelPortimao.add(panel_1_2_1_1);

		JPanel panelLmola = new JPanel();
		panelLmola.setBounds(53, 342, 207, 60);
		panelGrandesPremios.add(panelLmola);
		panelLmola.setLayout(null);

		JButton btnImola = new JButton("Imola");
		btnImola.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnImola.addActionListener(controlador);
		btnImola.setBackground(Color.WHITE);
		btnImola.setBounds(0, 0, 148, 49);
		panelLmola.add(btnImola);

		JLabel bandera13 = new JLabel("");
		bandera13.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Italia.png"));
		bandera13.setBounds(147, 0, 60, 49);
		panelLmola.add(bandera13);

		JPanel panel_1_1_1_1_2_1 = new JPanel();
		panel_1_1_1_1_2_1.setBounds(0, 50, 207, 10);
		panelLmola.add(panel_1_1_1_1_2_1);

		JPanel panelInstambulPark = new JPanel();
		panelInstambulPark.setBounds(375, 342, 207, 60);
		panelGrandesPremios.add(panelInstambulPark);
		panelInstambulPark.setLayout(null);

		JButton btnInstambul = new JButton("Instambul Park");
		btnInstambul.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnInstambul.addActionListener(controlador);
		btnInstambul.setBackground(Color.WHITE);
		btnInstambul.setBounds(0, 0, 148, 49);
		panelInstambulPark.add(btnInstambul);

		JLabel bandera14 = new JLabel("");
		bandera14.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Turquia.png"));
		bandera14.setBounds(147, 0, 60, 49);
		panelInstambulPark.add(bandera14);

		JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setBounds(0, 50, 207, 10);
		panelInstambulPark.add(panel_1_1_1_2);

		JPanel panelBahrain = new JPanel();
		panelBahrain.setBounds(690, 342, 207, 60);
		panelGrandesPremios.add(panelBahrain);
		panelBahrain.setLayout(null);

		JButton btnBahrain = new JButton("Bahrain I");
		btnBahrain.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnBahrain.addActionListener(controlador);
		btnBahrain.setBackground(Color.WHITE);
		btnBahrain.setBounds(0, 0, 148, 49);
		panelBahrain.add(btnBahrain);

		JLabel bandera15 = new JLabel("");
		bandera15.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Bahrein.png"));
		bandera15.setBounds(147, 0, 60, 49);
		panelBahrain.add(bandera15);

		JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setBounds(0, 50, 207, 10);
		panelBahrain.add(panel_1_2_2);

		JPanel panelBahrain1 = new JPanel();
		panelBahrain1.setBounds(53, 413, 207, 60);
		panelGrandesPremios.add(panelBahrain1);
		panelBahrain1.setLayout(null);

		JButton btnBahrain2 = new JButton("Bahrain II");
		btnBahrain2.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnBahrain2.addActionListener(controlador);
		btnBahrain2.setBackground(Color.WHITE);
		btnBahrain2.setBounds(0, 0, 148, 49);
		panelBahrain1.add(btnBahrain2);

		JLabel bandera16 = new JLabel("");
		bandera16.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Bahrein.png"));
		bandera16.setBounds(147, 0, 60, 49);
		panelBahrain1.add(bandera16);

		JPanel panel_1_2_2_1 = new JPanel();
		panel_1_2_2_1.setBounds(0, 50, 207, 10);
		panelBahrain1.add(panel_1_2_2_1);

		JPanel panelYasMarina = new JPanel();
		panelYasMarina.setBounds(375, 413, 207, 60);
		panelGrandesPremios.add(panelYasMarina);
		panelYasMarina.setLayout(null);

		JButton btnYasMarinas = new JButton("Yas Marinas");
		btnYasMarinas.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnYasMarinas.addActionListener(controlador);
		btnYasMarinas.setBackground(Color.WHITE);
		btnYasMarinas.setBounds(0, 0, 148, 49);
		panelYasMarina.add(btnYasMarinas);

		JLabel bandera17 = new JLabel("");
		bandera17.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "EAU.png"));
		bandera17.setBounds(147, 0, 60, 49);
		panelYasMarina.add(bandera17);

		JPanel panel_1_2_2_1_1 = new JPanel();
		panel_1_2_2_1_1.setBounds(0, 50, 207, 10);
		panelYasMarina.add(panel_1_2_2_1_1);

		JPanel panelEfaMoratalaz = new JPanel();
		panelEfaMoratalaz.setLayout(null);
		panelEfaMoratalaz.setBounds(690, 413, 207, 60);
		panelGrandesPremios.add(panelEfaMoratalaz);

		JButton btnEfaMoratalaz = new JButton("Efa Moratalaz");
		btnEfaMoratalaz.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnEfaMoratalaz.setBackground(Color.WHITE);
		btnEfaMoratalaz.setBounds(0, 0, 148, 49);
		panelEfaMoratalaz.add(btnEfaMoratalaz);

		JLabel bandera17_1 = new JLabel("");
		bandera17_1.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Manuel.png"));
		bandera17_1.setBounds(147, 0, 60, 49);
		panelEfaMoratalaz.add(bandera17_1);

		JPanel panel_1_2_2_1_1_1 = new JPanel();
		panel_1_2_2_1_1_1.setBounds(0, 50, 207, 10);
		panelEfaMoratalaz.add(panel_1_2_2_1_1_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Fondos" + File.separator + "Fondo6.PNG"));
		lblNewLabel.setBounds(0, 0, 974, 539);
		panelGrandesPremios.add(lblNewLabel);

		menu(controlador);
	}

	public void fichaGranPremio(GranPremio premio, Controlador controlador, String circuito) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelFichaPremio = new JPanel();
		panelFichaPremio.setBounds(0, 71, 974, 540);
		contentPane.add(panelFichaPremio);
		panelFichaPremio.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblNombre.setBounds(572, 41, 65, 30);
		panelFichaPremio.add(lblNombre);

		JLabel label = new JLabel("");
		label.setBounds(545, 79, 46, 14);
		panelFichaPremio.add(label);

		JLabel lblLongitud = new JLabel("Longitud:");
		lblLongitud.setForeground(Color.WHITE);
		lblLongitud.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblLongitud.setBounds(572, 123, 65, 30);
		panelFichaPremio.add(lblLongitud);

		JLabel lblCurvas = new JLabel("Curvas:");
		lblCurvas.setForeground(Color.WHITE);
		lblCurvas.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblCurvas.setBounds(587, 205, 50, 30);
		panelFichaPremio.add(lblCurvas);

		textNombre = new JTextField();
		textNombre.setEditable(false);
		textNombre.setColumns(10);
		textNombre.setText(premio.getNombre());
		textNombre.setBackground(SystemColor.menu);
		textNombre.setBounds(680, 47, 185, 20);
		panelFichaPremio.add(textNombre);

		textLogitud = new JTextField();
		textLogitud.setEditable(false);
		textLogitud.setColumns(10);
		textLogitud.setText(premio.getLongitud() + "");
		textLogitud.setBackground(SystemColor.menu);
		textLogitud.setBounds(680, 129, 185, 20);
		panelFichaPremio.add(textLogitud);

		textCurvas = new JTextField();
		textCurvas.setEditable(false);
		textCurvas.setColumns(10);
		textCurvas.setText(premio.getCurvas() + "");
		textCurvas.setBackground(SystemColor.menu);
		textCurvas.setBounds(680, 211, 185, 20);
		panelFichaPremio.add(textCurvas);

		JLabel lblPrimerAño = new JLabel("Primer a\u00F1o:");
		lblPrimerAño.setForeground(Color.WHITE);
		lblPrimerAño.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblPrimerAño.setBounds(554, 82, 83, 30);
		panelFichaPremio.add(lblPrimerAño);

		textPrimerAño = new JTextField();
		textPrimerAño.setEditable(false);
		textPrimerAño.setColumns(10);
		textPrimerAño.setText(premio.getAños_primer_gp() + "");
		textPrimerAño.setBackground(SystemColor.menu);
		textPrimerAño.setBounds(680, 88, 185, 20);
		panelFichaPremio.add(textPrimerAño);

		JLabel lblDistanciaGp = new JLabel("Distancia GP:");
		lblDistanciaGp.setForeground(Color.WHITE);
		lblDistanciaGp.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblDistanciaGp.setBounds(541, 164, 96, 30);
		panelFichaPremio.add(lblDistanciaGp);

		textDistanciaGP = new JTextField();
		textDistanciaGP.setEditable(false);
		textDistanciaGP.setColumns(10);
		textDistanciaGP.setText(premio.getDistancia_gp() + "");
		textDistanciaGP.setBackground(SystemColor.menu);
		textDistanciaGP.setBounds(680, 170, 185, 20);
		panelFichaPremio.add(textDistanciaGP);

		JLabel lblVueltas = new JLabel("Vueltas:");
		lblVueltas.setForeground(Color.WHITE);
		lblVueltas.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblVueltas.setBounds(587, 246, 65, 30);
		panelFichaPremio.add(lblVueltas);

		textVueltas = new JTextField();
		textVueltas.setEditable(false);
		textVueltas.setColumns(10);
		textVueltas.setText(premio.getVueltas() + "");
		textVueltas.setBackground(SystemColor.menu);
		textVueltas.setBounds(680, 252, 185, 20);
		panelFichaPremio.add(textVueltas);

		panel = new JPanel();
		panel.setBounds(35, 47, 355, 309);
		panelFichaPremio.add(panel);
		panel.setLayout(null);

		JLabel lblFoto = new JLabel("");
		lblFoto.setBounds(10, 11, 335, 282);
		lblFoto.setIcon(new ImageIcon(circuito));
		lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblFoto);

		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 974, 540);
		panelFichaPremio.add(lblFondo);
		lblFondo.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Fondos" + File.separator + "Fondo6.PNG"));
		menu(controlador);
	}

	public void simulacion(Controlador controlador, ArrayList<GranPremio> premios) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelSimulacion = new JPanel();
		panelSimulacion.setBounds(0, 71, 974, 540);
		contentPane.add(panelSimulacion);
		panelSimulacion.setLayout(null);

		comboListaCircuitos = new JComboBox();
		comboListaCircuitos.setBounds(634, 45, 200, 20);
		for (int i = 0; i < premios.size(); i++) {
			comboListaCircuitos.addItem(premios.get(i).getCircuito());
		}
		panelSimulacion.add(comboListaCircuitos);

		JLabel lblFotoCircuito = new JLabel("");
		lblFotoCircuito.setBounds(41, 41, 246, 254);
		panelSimulacion.add(lblFotoCircuito);

		JLabel lblNVueltas = new JLabel("Numero de vueltas:");
		lblNVueltas.setForeground(Color.WHITE);
		lblNVueltas.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		lblNVueltas.setBounds(494, 269, 126, 26);
		panelSimulacion.add(lblNVueltas);

		JSlider slider = new JSlider();
		slider.setValue(2);
		slider.setMaximum(3);
		slider.setForeground(Color.RED);
		slider.setBackground(new Color(119, 29, 28));
		slider.setBounds(634, 269, 200, 26);
		vueltas = slider.getValue();
		panelSimulacion.add(slider);

		JLabel lblCircuito = new JLabel("Gran Premio:");
		lblCircuito.setForeground(Color.WHITE);
		lblCircuito.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		lblCircuito.setBackground(Color.WHITE);
		lblCircuito.setBounds(494, 41, 126, 26);
		panelSimulacion.add(lblCircuito);

		JButton btnSimularCarrera = new JButton("Simular carrera");
		btnSimularCarrera.setForeground(Color.RED);
		btnSimularCarrera.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnSimularCarrera.addActionListener(controlador);
		btnSimularCarrera.setBackground(Color.WHITE);
		btnSimularCarrera.setBounds(816, 467, 135, 34);
		panelSimulacion.add(btnSimularCarrera);

		JLabel lblTiempo = new JLabel("Tiempo:");
		lblTiempo.setForeground(Color.WHITE);
		lblTiempo.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		lblTiempo.setBackground(Color.WHITE);
		lblTiempo.setBounds(494, 153, 126, 26);
		panelSimulacion.add(lblTiempo);

		comboTiempo = new JComboBox();
		comboTiempo.setBounds(634, 157, 200, 20);
		comboTiempo.addItem("Soleado");
		comboTiempo.addItem("Lluvioso");
		comboTiempo.addItem("Nublado");
		comboTiempo.addItem("Lluvia fina");
		panelSimulacion.add(comboTiempo);

		JLabel lblNewLabel_1 = new JLabel("X10");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(844, 269, 70, 26);
		panelSimulacion.add(lblNewLabel_1);

		JLabel lblFondo = new JLabel("");
		lblFondo.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));
		lblFondo.setBounds(0, 0, 974, 540);
		lblFondo.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Fondos" + File.separator + "Fondo6.PNG"));
		panelSimulacion.add(lblFondo);
		menu(controlador);

	}

	public void fichaSimulacion(Controlador controlador, ArrayList<Piloto> main, ConectionHelper concetion) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(0, 72, 974, 539);
		contentPane.add(panel);
		panel.setLayout(null);

		Fila1Pos = new JTextField();
		Fila1Pos.setBackground(Color.WHITE);
		Fila1Pos.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila1Pos.setEditable(false);
		Fila1Pos.setHorizontalAlignment(SwingConstants.CENTER);
		Fila1Pos.setText("POS.");
		Fila1Pos.setBounds(75, 48, 40, 20);
		panel.add(Fila1Pos);
		Fila1Pos.setColumns(10);

		Fila11 = new JTextField();
		Fila11.setBackground(Color.WHITE);
		Fila11.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila11.setEditable(false);
		Fila11.setColumns(10);
		Fila11.setBounds(75, 68, 40, 20);
		panel.add(Fila11);

		Fila21 = new JTextField();
		Fila21.setBackground(Color.WHITE);
		Fila21.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila21.setEditable(false);
		Fila21.setColumns(10);
		Fila21.setBounds(75, 88, 40, 20);
		panel.add(Fila21);

		Fila31 = new JTextField();
		Fila31.setBackground(Color.WHITE);
		Fila31.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila31.setEditable(false);
		Fila31.setColumns(10);
		Fila31.setBounds(75, 108, 40, 20);
		panel.add(Fila31);

		Fila41 = new JTextField();
		Fila41.setBackground(Color.WHITE);
		Fila41.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila41.setEditable(false);
		Fila41.setColumns(10);
		Fila41.setBounds(75, 128, 40, 20);
		panel.add(Fila41);

		Fila51 = new JTextField();
		Fila51.setBackground(Color.WHITE);
		Fila51.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila51.setEditable(false);
		Fila51.setColumns(10);
		Fila51.setBounds(75, 148, 40, 20);
		panel.add(Fila51);

		Fila61 = new JTextField();
		Fila61.setBackground(Color.WHITE);
		Fila61.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila61.setEditable(false);
		Fila61.setColumns(10);
		Fila61.setBounds(75, 168, 40, 20);
		panel.add(Fila61);

		Fila71 = new JTextField();
		Fila71.setBackground(Color.WHITE);
		Fila71.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila71.setEditable(false);
		Fila71.setColumns(10);
		Fila71.setBounds(75, 188, 40, 20);
		panel.add(Fila71);

		Fila81 = new JTextField();
		Fila81.setBackground(Color.WHITE);
		Fila81.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila81.setEditable(false);
		Fila81.setColumns(10);
		Fila81.setBounds(75, 208, 40, 20);
		panel.add(Fila81);

		Fila91 = new JTextField();
		Fila91.setBackground(Color.WHITE);
		Fila91.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila91.setEditable(false);
		Fila91.setColumns(10);
		Fila91.setBounds(75, 228, 40, 20);
		panel.add(Fila91);

		Fila101 = new JTextField();
		Fila101.setBackground(Color.WHITE);
		Fila101.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila101.setEditable(false);
		Fila101.setColumns(10);
		Fila101.setBounds(75, 248, 40, 20);
		panel.add(Fila101);

		Fila111 = new JTextField();
		Fila111.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila111.setEditable(false);
		Fila111.setBackground(Color.WHITE);
		Fila111.setColumns(10);
		Fila111.setBounds(75, 268, 40, 20);
		panel.add(Fila111);

		Fila121 = new JTextField();
		Fila121.setEditable(false);
		Fila121.setBackground(Color.WHITE);
		Fila121.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila121.setColumns(10);
		Fila121.setBounds(75, 288, 40, 20);
		panel.add(Fila121);

		Fila131 = new JTextField();
		Fila131.setEditable(false);
		Fila131.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila131.setBackground(Color.WHITE);
		Fila131.setColumns(10);
		Fila131.setBounds(75, 308, 40, 20);
		panel.add(Fila131);

		Fila141 = new JTextField();
		Fila141.setBackground(Color.WHITE);
		Fila141.setEditable(false);
		Fila141.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila141.setColumns(10);
		Fila141.setBounds(75, 328, 40, 20);
		panel.add(Fila141);

		Fila151 = new JTextField();
		Fila151.setBackground(Color.WHITE);
		Fila151.setEditable(false);
		Fila151.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila151.setColumns(10);
		Fila151.setBounds(75, 348, 40, 20);
		panel.add(Fila151);

		Fila161 = new JTextField();
		Fila161.setBackground(Color.WHITE);
		Fila161.setEditable(false);
		Fila161.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila161.setColumns(10);
		Fila161.setBounds(75, 368, 40, 20);
		panel.add(Fila161);

		Fila171 = new JTextField();
		Fila171.setBackground(Color.WHITE);
		Fila171.setEditable(false);
		Fila171.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila171.setColumns(10);
		Fila171.setBounds(75, 388, 40, 20);
		panel.add(Fila171);

		Fila201 = new JTextField();
		Fila201.setBackground(Color.WHITE);
		Fila201.setEditable(false);
		Fila201.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila201.setColumns(10);
		Fila201.setBounds(75, 448, 40, 20);
		panel.add(Fila201);

		Fila191 = new JTextField();
		Fila191.setBackground(Color.WHITE);
		Fila191.setEditable(false);
		Fila191.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila191.setColumns(10);
		Fila191.setBounds(75, 428, 40, 20);
		panel.add(Fila191);

		Fila181 = new JTextField();
		Fila181.setBackground(Color.WHITE);
		Fila181.setEditable(false);
		Fila181.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila181.setColumns(10);
		Fila181.setBounds(75, 408, 40, 20);
		panel.add(Fila181);

		txtPiloto = new JTextField();
		txtPiloto.setBackground(Color.WHITE);
		txtPiloto.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		txtPiloto.setEditable(false);
		txtPiloto.setHorizontalAlignment(SwingConstants.CENTER);
		txtPiloto.setText("PILOTO");
		txtPiloto.setColumns(10);
		txtPiloto.setBounds(115, 48, 124, 20);
		panel.add(txtPiloto);

		Fila12 = new JTextField();
		Fila12.setBackground(Color.WHITE);
		Fila12.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila12.setEditable(false);
		Fila12.setColumns(10);
		Fila12.setBounds(115, 68, 124, 20);
		panel.add(Fila12);

		Fila22 = new JTextField();
		Fila22.setBackground(Color.WHITE);
		Fila22.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila22.setEditable(false);
		Fila22.setColumns(10);
		Fila22.setBounds(115, 88, 124, 20);
		panel.add(Fila22);

		Fila32 = new JTextField();
		Fila32.setBackground(Color.WHITE);
		Fila32.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila32.setEditable(false);
		Fila32.setColumns(10);
		Fila32.setBounds(115, 108, 124, 20);
		panel.add(Fila32);

		Fila42 = new JTextField();
		Fila42.setBackground(Color.WHITE);
		Fila42.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila42.setEditable(false);
		Fila42.setColumns(10);
		Fila42.setBounds(115, 128, 124, 20);
		panel.add(Fila42);

		Fila52 = new JTextField();
		Fila52.setBackground(Color.WHITE);
		Fila52.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila52.setEditable(false);
		Fila52.setColumns(10);
		Fila52.setBounds(115, 148, 124, 20);
		panel.add(Fila52);

		Fila62 = new JTextField();
		Fila62.setBackground(Color.WHITE);
		Fila62.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila62.setEditable(false);
		Fila62.setColumns(10);
		Fila62.setBounds(115, 168, 124, 20);
		panel.add(Fila62);

		Fila72 = new JTextField();
		Fila72.setBackground(Color.WHITE);
		Fila72.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila72.setEditable(false);
		Fila72.setColumns(10);
		Fila72.setBounds(115, 188, 124, 20);
		panel.add(Fila72);

		Fila82 = new JTextField();
		Fila82.setBackground(Color.WHITE);
		Fila82.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila82.setEditable(false);
		Fila82.setColumns(10);
		Fila82.setBounds(115, 208, 124, 20);
		panel.add(Fila82);

		Fila92 = new JTextField();
		Fila92.setBackground(Color.WHITE);
		Fila92.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila92.setEditable(false);
		Fila92.setColumns(10);
		Fila92.setBounds(115, 228, 124, 20);
		panel.add(Fila92);

		Fila102 = new JTextField();
		Fila102.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila102.setBackground(Color.WHITE);
		Fila102.setEditable(false);
		Fila102.setColumns(10);
		Fila102.setBounds(115, 248, 124, 20);
		panel.add(Fila102);

		Fila122 = new JTextField();
		Fila122.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila122.setBackground(Color.WHITE);
		Fila122.setEditable(false);
		Fila122.setColumns(10);
		Fila122.setBounds(115, 288, 124, 20);
		panel.add(Fila122);

		Fila112 = new JTextField();
		Fila112.setBackground(Color.WHITE);
		Fila112.setEditable(false);
		Fila112.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila112.setColumns(10);
		Fila112.setBounds(115, 268, 124, 20);
		panel.add(Fila112);

		Fila132 = new JTextField();
		Fila132.setBackground(Color.WHITE);
		Fila132.setEditable(false);
		Fila132.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila132.setColumns(10);
		Fila132.setBounds(115, 308, 124, 20);
		panel.add(Fila132);

		Fila142 = new JTextField();
		Fila142.setBackground(Color.WHITE);
		Fila142.setEditable(false);
		Fila142.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila142.setColumns(10);
		Fila142.setBounds(115, 328, 124, 20);
		panel.add(Fila142);

		Fila152 = new JTextField();
		Fila152.setBackground(Color.WHITE);
		Fila152.setEditable(false);
		Fila152.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila152.setColumns(10);
		Fila152.setBounds(115, 348, 124, 20);
		panel.add(Fila152);

		Fila162 = new JTextField();
		Fila162.setBackground(Color.WHITE);
		Fila162.setEditable(false);
		Fila162.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila162.setColumns(10);
		Fila162.setBounds(115, 368, 124, 20);
		panel.add(Fila162);

		Fila172 = new JTextField();
		Fila172.setBackground(Color.WHITE);
		Fila172.setEditable(false);
		Fila172.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila172.setColumns(10);
		Fila172.setBounds(115, 388, 124, 20);
		panel.add(Fila172);

		Fila182 = new JTextField();
		Fila182.setBackground(Color.WHITE);
		Fila182.setEditable(false);
		Fila182.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila182.setColumns(10);
		Fila182.setBounds(115, 408, 124, 20);
		panel.add(Fila182);

		Fila192 = new JTextField();
		Fila192.setBackground(Color.WHITE);
		Fila192.setEditable(false);
		Fila192.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila192.setColumns(10);
		Fila192.setBounds(115, 428, 124, 20);
		panel.add(Fila192);

		Fila202 = new JTextField();
		Fila202.setBackground(Color.WHITE);
		Fila202.setEditable(false);
		Fila202.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila202.setColumns(10);
		Fila202.setBounds(115, 448, 124, 20);
		panel.add(Fila202);

		txtEscuderia = new JTextField();
		txtEscuderia.setBackground(Color.WHITE);
		txtEscuderia.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		txtEscuderia.setEditable(false);
		txtEscuderia.setText("ESCUDERIA");
		txtEscuderia.setHorizontalAlignment(SwingConstants.CENTER);
		txtEscuderia.setColumns(10);
		txtEscuderia.setBounds(239, 48, 124, 20);
		panel.add(txtEscuderia);

		Fila13 = new JTextField();
		Fila13.setBackground(Color.WHITE);
		Fila13.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila13.setEditable(false);
		Fila13.setColumns(10);
		Fila13.setBounds(239, 68, 124, 20);
		panel.add(Fila13);

		Fila23 = new JTextField();
		Fila23.setBackground(Color.WHITE);
		Fila23.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila23.setEditable(false);
		Fila23.setColumns(10);
		Fila23.setBounds(239, 88, 124, 20);
		panel.add(Fila23);

		Fila33 = new JTextField();
		Fila33.setBackground(Color.WHITE);
		Fila33.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila33.setEditable(false);
		Fila33.setColumns(10);
		Fila33.setBounds(239, 108, 124, 20);
		panel.add(Fila33);

		Fila43 = new JTextField();
		Fila43.setBackground(Color.WHITE);
		Fila43.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila43.setEditable(false);
		Fila43.setColumns(10);
		Fila43.setBounds(239, 128, 124, 20);
		panel.add(Fila43);

		Fila53 = new JTextField();
		Fila53.setBackground(Color.WHITE);
		Fila53.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila53.setEditable(false);
		Fila53.setColumns(10);
		Fila53.setBounds(239, 148, 124, 20);
		panel.add(Fila53);

		Fila63 = new JTextField();
		Fila63.setBackground(Color.WHITE);
		Fila63.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila63.setEditable(false);
		Fila63.setColumns(10);
		Fila63.setBounds(239, 168, 124, 20);
		panel.add(Fila63);

		Fila73 = new JTextField();
		Fila73.setBackground(Color.WHITE);
		Fila73.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila73.setEditable(false);
		Fila73.setColumns(10);
		Fila73.setBounds(239, 188, 124, 20);
		panel.add(Fila73);

		Fila83 = new JTextField();
		Fila83.setBackground(Color.WHITE);
		Fila83.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila83.setEditable(false);
		Fila83.setColumns(10);
		Fila83.setBounds(239, 208, 124, 20);
		panel.add(Fila83);

		Fila93 = new JTextField();
		Fila93.setBackground(Color.WHITE);
		Fila93.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila93.setEditable(false);
		Fila93.setColumns(10);
		Fila93.setBounds(239, 228, 124, 20);
		panel.add(Fila93);

		Fila103 = new JTextField();
		Fila103.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila103.setBackground(Color.WHITE);
		Fila103.setEditable(false);
		Fila103.setColumns(10);
		Fila103.setBounds(239, 248, 124, 20);
		panel.add(Fila103);

		Fila123 = new JTextField();
		Fila123.setBackground(Color.WHITE);
		Fila123.setEditable(false);
		Fila123.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila123.setColumns(10);
		Fila123.setBounds(239, 288, 124, 20);
		panel.add(Fila123);

		Fila113 = new JTextField();
		Fila113.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila113.setEditable(false);
		Fila113.setBackground(Color.WHITE);
		Fila113.setColumns(10);
		Fila113.setBounds(239, 268, 124, 20);
		panel.add(Fila113);

		Fila133 = new JTextField();
		Fila133.setBackground(Color.WHITE);
		Fila133.setEditable(false);
		Fila133.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila133.setColumns(10);
		Fila133.setBounds(239, 308, 124, 20);
		panel.add(Fila133);

		Fila143 = new JTextField();
		Fila143.setBackground(Color.WHITE);
		Fila143.setEditable(false);
		Fila143.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila143.setColumns(10);
		Fila143.setBounds(239, 328, 124, 20);
		panel.add(Fila143);

		Fila163 = new JTextField();
		Fila163.setBackground(Color.WHITE);
		Fila163.setEditable(false);
		Fila163.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila163.setColumns(10);
		Fila163.setBounds(239, 368, 124, 20);
		panel.add(Fila163);

		Fila153 = new JTextField();
		Fila153.setBackground(Color.WHITE);
		Fila153.setEditable(false);
		Fila153.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila153.setColumns(10);
		Fila153.setBounds(239, 348, 124, 20);
		panel.add(Fila153);

		Fila173 = new JTextField();
		Fila173.setBackground(Color.WHITE);
		Fila173.setEditable(false);
		Fila173.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila173.setColumns(10);
		Fila173.setBounds(239, 388, 124, 20);
		panel.add(Fila173);

		Fila183 = new JTextField();
		Fila183.setBackground(Color.WHITE);
		Fila183.setEditable(false);
		Fila183.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila183.setColumns(10);
		Fila183.setBounds(239, 408, 124, 20);
		panel.add(Fila183);

		Fila193 = new JTextField();
		Fila193.setBackground(Color.WHITE);
		Fila193.setEditable(false);
		Fila193.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila193.setColumns(10);
		Fila193.setBounds(239, 428, 124, 20);
		panel.add(Fila193);

		Fila203 = new JTextField();
		Fila203.setBackground(Color.WHITE);
		Fila203.setEditable(false);
		Fila203.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila203.setColumns(10);
		Fila203.setBounds(239, 448, 124, 20);
		panel.add(Fila203);

		txtVueltaRapida = new JTextField();
		txtVueltaRapida.setBackground(Color.WHITE);
		txtVueltaRapida.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		txtVueltaRapida.setEditable(false);
		txtVueltaRapida.setText("VUELTA RAPIDA");
		txtVueltaRapida.setHorizontalAlignment(SwingConstants.CENTER);
		txtVueltaRapida.setColumns(10);
		txtVueltaRapida.setBounds(363, 48, 100, 20);
		panel.add(txtVueltaRapida);

		Fila14 = new JTextField();
		Fila14.setBackground(Color.WHITE);
		Fila14.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila14.setEditable(false);
		Fila14.setColumns(10);
		Fila14.setBounds(363, 68, 100, 20);
		panel.add(Fila14);

		Fila24 = new JTextField();
		Fila24.setBackground(Color.WHITE);
		Fila24.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila24.setEditable(false);
		Fila24.setColumns(10);
		Fila24.setBounds(363, 88, 100, 20);
		panel.add(Fila24);

		Fila34 = new JTextField();
		Fila34.setBackground(Color.WHITE);
		Fila34.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila34.setEditable(false);
		Fila34.setColumns(10);
		Fila34.setBounds(363, 108, 100, 20);
		panel.add(Fila34);

		Fila44 = new JTextField();
		Fila44.setBackground(Color.WHITE);
		Fila44.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila44.setEditable(false);
		Fila44.setColumns(10);
		Fila44.setBounds(363, 128, 100, 20);
		panel.add(Fila44);

		Fila54 = new JTextField();
		Fila54.setBackground(Color.WHITE);
		Fila54.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila54.setEditable(false);
		Fila54.setColumns(10);
		Fila54.setBounds(363, 148, 100, 20);
		panel.add(Fila54);

		Fila64 = new JTextField();
		Fila64.setBackground(Color.WHITE);
		Fila64.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila64.setEditable(false);
		Fila64.setColumns(10);
		Fila64.setBounds(363, 168, 100, 20);
		panel.add(Fila64);

		Fila74 = new JTextField();
		Fila74.setBackground(Color.WHITE);
		Fila74.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila74.setEditable(false);
		Fila74.setColumns(10);
		Fila74.setBounds(363, 188, 100, 20);
		panel.add(Fila74);

		Fila84 = new JTextField();
		Fila84.setBackground(Color.WHITE);
		Fila84.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila84.setEditable(false);
		Fila84.setColumns(10);
		Fila84.setBounds(363, 208, 100, 20);
		panel.add(Fila84);

		Fila94 = new JTextField();
		Fila94.setBackground(Color.WHITE);
		Fila94.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila94.setEditable(false);
		Fila94.setColumns(10);
		Fila94.setBounds(363, 228, 100, 20);
		panel.add(Fila94);

		Fila104 = new JTextField();
		Fila104.setBackground(Color.WHITE);
		Fila104.setEditable(false);
		Fila104.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila104.setColumns(10);
		Fila104.setBounds(363, 248, 100, 20);
		panel.add(Fila104);

		Fila114 = new JTextField();
		Fila114.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila114.setEditable(false);
		Fila114.setBackground(Color.WHITE);
		Fila114.setColumns(10);
		Fila114.setBounds(363, 268, 100, 20);
		panel.add(Fila114);

		Fila124 = new JTextField();
		Fila124.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila124.setEditable(false);
		Fila124.setBackground(Color.WHITE);
		Fila124.setColumns(10);
		Fila124.setBounds(363, 288, 100, 20);
		panel.add(Fila124);

		Fila134 = new JTextField();
		Fila134.setBackground(Color.WHITE);
		Fila134.setEditable(false);
		Fila134.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila134.setColumns(10);
		Fila134.setBounds(363, 308, 100, 20);
		panel.add(Fila134);

		Fila144 = new JTextField();
		Fila144.setBackground(Color.WHITE);
		Fila144.setEditable(false);
		Fila144.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila144.setColumns(10);
		Fila144.setBounds(363, 328, 100, 20);
		panel.add(Fila144);

		Fila154 = new JTextField();
		Fila154.setBackground(Color.WHITE);
		Fila154.setEditable(false);
		Fila154.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila154.setColumns(10);
		Fila154.setBounds(363, 348, 100, 20);
		panel.add(Fila154);

		Fila164 = new JTextField();
		Fila164.setBackground(Color.WHITE);
		Fila164.setEditable(false);
		Fila164.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila164.setColumns(10);
		Fila164.setBounds(363, 368, 100, 20);
		panel.add(Fila164);

		Fila174 = new JTextField();
		Fila174.setBackground(Color.WHITE);
		Fila174.setEditable(false);
		Fila174.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila174.setColumns(10);
		Fila174.setBounds(363, 388, 100, 20);
		panel.add(Fila174);

		Fila184 = new JTextField();
		Fila184.setBackground(Color.WHITE);
		Fila184.setEditable(false);
		Fila184.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila184.setColumns(10);
		Fila184.setBounds(363, 408, 100, 20);
		panel.add(Fila184);

		Fila204 = new JTextField();
		Fila204.setBackground(Color.WHITE);
		Fila204.setEditable(false);
		Fila204.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila204.setColumns(10);
		Fila204.setBounds(363, 448, 100, 20);
		panel.add(Fila204);

		Fila194 = new JTextField();
		Fila194.setBackground(Color.WHITE);
		Fila194.setEditable(false);
		Fila194.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila194.setColumns(10);
		Fila194.setBounds(363, 428, 100, 20);
		panel.add(Fila194);
		ArrayList<JTextField> uno = new ArrayList<JTextField>();
		uno.add(Fila11);
		uno.add(Fila21);
		uno.add(Fila31);
		uno.add(Fila41);
		uno.add(Fila51);
		uno.add(Fila61);
		uno.add(Fila71);
		uno.add(Fila81);
		uno.add(Fila91);
		uno.add(Fila101);
		uno.add(Fila111);
		uno.add(Fila121);
		uno.add(Fila131);
		uno.add(Fila141);
		uno.add(Fila151);
		uno.add(Fila161);
		uno.add(Fila171);
		uno.add(Fila181);
		uno.add(Fila191);
		uno.add(Fila201);

		ArrayList<JTextField> dos = new ArrayList<JTextField>();
		dos.add(Fila12);
		dos.add(Fila22);
		dos.add(Fila32);
		dos.add(Fila42);
		dos.add(Fila52);
		dos.add(Fila62);
		dos.add(Fila72);
		dos.add(Fila82);
		dos.add(Fila92);
		dos.add(Fila102);
		dos.add(Fila112);
		dos.add(Fila122);
		dos.add(Fila132);
		dos.add(Fila142);
		dos.add(Fila152);
		dos.add(Fila162);
		dos.add(Fila172);
		dos.add(Fila182);
		dos.add(Fila192);
		dos.add(Fila202);
		ArrayList<JTextField> tres = new ArrayList<JTextField>();
		tres.add(Fila13);
		tres.add(Fila23);
		tres.add(Fila33);
		tres.add(Fila43);
		tres.add(Fila53);
		tres.add(Fila63);
		tres.add(Fila73);
		tres.add(Fila83);
		tres.add(Fila93);
		tres.add(Fila103);
		tres.add(Fila113);
		tres.add(Fila123);
		tres.add(Fila133);
		tres.add(Fila143);
		tres.add(Fila153);
		tres.add(Fila163);
		tres.add(Fila173);
		tres.add(Fila183);
		tres.add(Fila193);
		tres.add(Fila203);
		for (int i = 0; i < uno.size(); i++) {
			uno.get(i).setText(i + 1 + "");

		}
		for (int i = 0; i < dos.size(); i++) {
			dos.get(i).setText(main.get(i).getNombre());

		}
		for (int i = 0; i < tres.size(); i++) {
			try {
				tres.get(i).setText(concetion.selectEscuderia(main.get(i).getIdEscuderia()).getNombre());
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		JPanel PanelLabelCircuito = new JPanel();
		PanelLabelCircuito.setBounds(495, 48, 443, 290);
		panel.add(PanelLabelCircuito);

		JLabel LabelCircuito = new JLabel("");
		PanelLabelCircuito.add(LabelCircuito);

		JLabel lblPanel = new JLabel("");
		lblPanel.setBounds(0, 0, 974, 539);
		lblPanel.setIcon(new ImageIcon(
				"src" + File.separator + "Imagenes" + File.separator + "Fondos" + File.separator + "Fondo6.PNG"));
		panel.add(lblPanel);
		menu(controlador);

	}

	public JComboBox getComboListaCircuitos() {
		return comboListaCircuitos;
	}

	public JComboBox getComboTiempo() {
		return comboTiempo;
	}

	public int getVueltas() {
		return vueltas;
	}

}
