package vista;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Prueba7_FichaGrandesPremios extends JFrame {

	protected JButton btnInicio, btnEscuderias, btnPilotos, btnGranPre, btnClasi, btnLogin, btnLogo;
	protected JPanel menu, contentPane,panel;
	private JTextField textNombre,textLogitud,textCurvas,textPrimerAño,textDistanciaGP,textVueltas;
	private JComboBox comboListaCircuitos, comboTiempo;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba7_FichaGrandesPremios frame = new Prueba7_FichaGrandesPremios();
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
	public Prueba7_FichaGrandesPremios() {
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
		
		
		
		//Jpanel de Ficha Grandes Premios
		
		
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
		textNombre.setBackground(SystemColor.menu);
		textNombre.setBounds(680, 47, 185, 20);
		panelFichaPremio.add(textNombre);

		textLogitud = new JTextField();
		textLogitud.setEditable(false);
		textLogitud.setColumns(10);
		textLogitud.setBackground(SystemColor.menu);
		textLogitud.setBounds(680, 129, 185, 20);
		panelFichaPremio.add(textLogitud);

		textCurvas = new JTextField();
		textCurvas.setEditable(false);
		textCurvas.setColumns(10);
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
		textVueltas.setBackground(SystemColor.menu);
		textVueltas.setBounds(680, 252, 185, 20);
		panelFichaPremio.add(textVueltas);

		panel = new JPanel();
		panel.setBounds(35, 47, 355, 309);
		panelFichaPremio.add(panel);
		panel.setLayout(null);

		JLabel lblFoto = new JLabel("");
		lblFoto.setBounds(10, 11, 335, 282);
		lblFoto.setIcon(new ImageIcon());
		lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblFoto);

		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 974, 540);
		panelFichaPremio.add(lblFondo);
		lblFondo.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Fondos" + File.separator + "Fondo6.PNG"));
		
	}

}
