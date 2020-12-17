package vista;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class Prueba9_Simulacion extends JFrame {

	protected JButton btnInicio, btnEscuderias, btnPilotos, btnGranPre, btnClasi, btnLogin, btnLogo;
	protected JPanel menu, contentPane;
	private JComboBox comboListaCircuitos, comboTiempo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba9_Simulacion frame = new Prueba9_Simulacion();
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
	public Prueba9_Simulacion() {
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
		
		
		//Jpanel de Simulacion
		
		
		JPanel panelSimulacion = new JPanel();
		panelSimulacion.setBounds(0, 71, 974, 540);
		contentPane.add(panelSimulacion);
		panelSimulacion.setLayout(null);

		comboListaCircuitos = new JComboBox();
		comboListaCircuitos.setBounds(634, 45, 200, 20);
		/*for (int i = 0; i < premios.size(); i++) {
			comboListaCircuitos.addItem(premios.get(i).getCircuito());
		}*/
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
		//vueltas = slider.getValue();
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
		lblFondo.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Fondos" + File.separator + "Fondo6.PNG"));
		panelSimulacion.add(lblFondo);
		
	
		
		
	}

}
