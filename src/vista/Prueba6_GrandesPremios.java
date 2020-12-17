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
import javax.swing.border.EmptyBorder;


public class Prueba6_GrandesPremios extends JFrame {

	protected JButton btnInicio, btnEscuderias, btnPilotos, btnGranPre, btnClasi, btnLogin, btnLogo;
	protected JPanel menu, contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba6_GrandesPremios frame = new Prueba6_GrandesPremios();
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
	public Prueba6_GrandesPremios() {
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
		
		
		//Jpanel Grandes Premios
		
		
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
		btnRedBull1.setBackground(Color.WHITE);
		btnRedBull1.setBounds(0, 0, 148, 49);
		panelReBull1.add(btnRedBull1);

		JLabel bandera1 = new JLabel("");
		bandera1.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Austria.png"));
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
		btnRedBull2.setBackground(Color.WHITE);
		btnRedBull2.setBounds(0, 0, 148, 49);
		panelRedBull2.add(btnRedBull2);

		JLabel bandera2 = new JLabel("");
		bandera2.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Austria.png"));
		bandera2.setBounds(147, 0, 60, 49);
		panelRedBull2.add(bandera2);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "BahreinBarra.png"));
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
		btnHungaroring.setBackground(Color.WHITE);
		btnHungaroring.setBounds(0, 0, 148, 49);
		panelHungaroring.add(btnHungaroring);

		JLabel bandera3 = new JLabel("");
		bandera3.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Hungria.png"));
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
		btnSilverstone.setBackground(Color.WHITE);
		btnSilverstone.setBounds(0, 0, 148, 49);
		panelSilverstone.add(btnSilverstone);

		JLabel bandera4 = new JLabel("");
		bandera4.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Gran Breta�a.png"));
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
		btnSilverstone2.setBackground(Color.WHITE);
		btnSilverstone2.setBounds(0, 0, 148, 49);
		panelSilverstoner2.add(btnSilverstone2);

		JLabel bandera5 = new JLabel("");
		bandera5.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Gran Breta�a.png"));
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
		btnBarcelona.setBackground(Color.WHITE);
		btnBarcelona.setBounds(0, 0, 148, 49);
		panelBarcelona.add(btnBarcelona);

		JLabel bandera6 = new JLabel("");
		bandera6.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Espa�a.png"));
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
		btnSpa.setBackground(Color.WHITE);
		btnSpa.setBounds(0, 0, 148, 49);
		panelSpa.add(btnSpa);

		JLabel bandera7 = new JLabel("");
		bandera7.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Belgica.png"));
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
		btnMonza.setBackground(Color.WHITE);
		btnMonza.setBounds(0, 0, 148, 49);
		panelMonza.add(btnMonza);

		JLabel bandera8 = new JLabel("");
		bandera8.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Italia.png"));
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
		btntoscana.setBackground(Color.WHITE);
		btntoscana.setBounds(0, 0, 148, 49);
		panelTorcana.add(btntoscana);

		JLabel bandera9 = new JLabel("");
		bandera9.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Italia.png"));
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
		btnNurburgring.setBackground(Color.WHITE);
		btnNurburgring.setBounds(0, 0, 148, 49);
		panelNurburgring.add(btnNurburgring);

		JLabel bandera11 = new JLabel("");
		bandera11.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Alemania.png"));
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
		btnPortimao.setBackground(Color.WHITE);
		btnPortimao.setBounds(0, 0, 148, 49);
		panelPortimao.add(btnPortimao);

		JLabel bandera12 = new JLabel("");
		bandera12.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Portugal.png"));
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
		btnImola.setBackground(Color.WHITE);
		btnImola.setBounds(0, 0, 148, 49);
		panelLmola.add(btnImola);

		JLabel bandera13 = new JLabel("");
		bandera13.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Italia.png"));
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
		btnInstambul.setBackground(Color.WHITE);
		btnInstambul.setBounds(0, 0, 148, 49);
		panelInstambulPark.add(btnInstambul);

		JLabel bandera14 = new JLabel("");
		bandera14.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Turquia.png"));
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
		btnBahrain.setBackground(Color.WHITE);
		btnBahrain.setBounds(0, 0, 148, 49);
		panelBahrain.add(btnBahrain);

		JLabel bandera15 = new JLabel("");
		bandera15.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Bahrein.png"));
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
		btnBahrain2.setBackground(Color.WHITE);
		btnBahrain2.setBounds(0, 0, 148, 49);
		panelBahrain1.add(btnBahrain2);

		JLabel bandera16 = new JLabel("");
		bandera16.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Bahrein.png"));
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
		btnYasMarinas.setBackground(Color.WHITE);
		btnYasMarinas.setBounds(0, 0, 148, 49);
		panelYasMarina.add(btnYasMarinas);

		JLabel bandera17 = new JLabel("");
		bandera17.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "EAU.png"));
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
		bandera17_1.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Paises" + File.separator + "Manuel.png"));
		bandera17_1.setBounds(147, 0, 60, 49);
		panelEfaMoratalaz.add(bandera17_1);

		JPanel panel_1_2_2_1_1_1 = new JPanel();
		panel_1_2_2_1_1_1.setBounds(0, 50, 207, 10);
		panelEfaMoratalaz.add(panel_1_2_2_1_1_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Fondos" + File.separator + "Fondo6.PNG"));
		lblNewLabel.setBounds(0, 0, 974, 539);
		panelGrandesPremios.add(lblNewLabel);
		
		
	}

}
