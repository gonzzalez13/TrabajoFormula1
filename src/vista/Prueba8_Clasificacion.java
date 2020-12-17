package vista;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Prueba8_Clasificacion extends JFrame {

	protected JButton btnInicio, btnEscuderias, btnPilotos, btnGranPre, btnClasi, btnLogin, btnLogo;
	protected JPanel menu, contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba8_Clasificacion frame = new Prueba8_Clasificacion();
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
	public Prueba8_Clasificacion() {
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
		lblFondo.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Fondos" + File.separator + "Fondo6.PNG"));

		
	}

}
