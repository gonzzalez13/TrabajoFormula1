package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class Simulacion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simulacion frame = new Simulacion();
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
	public Simulacion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\alu01-dam2\\eclipse-workspace\\Formula1\\src\\img\\F1.png"));
		setTitle("Simulaci\u00F3n");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboListaCircuitos = new JComboBox();
		comboListaCircuitos.setBounds(494, 115, 200, 20);
		contentPane.add(comboListaCircuitos);
		
		JLabel lblFotoCircuito = new JLabel("");
		lblFotoCircuito.setBounds(41, 112, 246, 254);
		contentPane.add(lblFotoCircuito);
		
		JLabel lblNVueltas = new JLabel("Numero de vueltas:");
		lblNVueltas.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		lblNVueltas.setForeground(Color.WHITE);
		lblNVueltas.setBounds(340, 340, 126, 26);
		contentPane.add(lblNVueltas);
		
		JSlider slider = new JSlider();
		slider.setMaximum(3);
		slider.setValue(2);
		slider.setBackground(new Color(153, 51, 51));
		slider.setForeground(Color.RED);
		slider.setBounds(494, 340, 200, 26);
		contentPane.add(slider);
		
		JLabel lblCircuito = new JLabel("Circuito:");
		lblCircuito.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		lblCircuito.setForeground(Color.WHITE);
		lblCircuito.setBackground(Color.WHITE);
		lblCircuito.setBounds(340, 112, 126, 26);
		contentPane.add(lblCircuito);
		
		JButton btnSimularCarrera = new JButton("Simular carrera");
		btnSimularCarrera.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnSimularCarrera.setBackground(Color.WHITE);
		btnSimularCarrera.setForeground(Color.RED);
		btnSimularCarrera.setBounds(816, 538, 135, 34);
		contentPane.add(btnSimularCarrera);
		
		JLabel lblTiempo = new JLabel("Tiempo:");
		lblTiempo.setForeground(Color.WHITE);
		lblTiempo.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		lblTiempo.setBackground(Color.WHITE);
		lblTiempo.setBounds(340, 224, 126, 26);
		contentPane.add(lblTiempo);
		
		JComboBox comboTiempo = new JComboBox();
		comboTiempo.setBounds(494, 227, 200, 20);
		contentPane.add(comboTiempo);
		
		JPanel PanelMenu = new JPanel();
		PanelMenu.setLayout(null);
		PanelMenu.setBackground(Color.LIGHT_GRAY);
		PanelMenu.setBounds(0, 0, 984, 71);
		contentPane.add(PanelMenu);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(10, 11, 133, 48);
		PanelMenu.add(lblLogo);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.setForeground(Color.RED);
		btnInicio.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnInicio.setBackground(Color.DARK_GRAY);
		btnInicio.setBounds(144, 11, 74, 48);
		PanelMenu.add(btnInicio);
		
		JButton btnEscuderias = new JButton("Escuderias");
		btnEscuderias.setForeground(Color.RED);
		btnEscuderias.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnEscuderias.setBackground(Color.DARK_GRAY);
		btnEscuderias.setBounds(226, 11, 112, 48);
		PanelMenu.add(btnEscuderias);
		
		JButton btnPilotos = new JButton("Pilotos");
		btnPilotos.setForeground(Color.RED);
		btnPilotos.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnPilotos.setBackground(Color.DARK_GRAY);
		btnPilotos.setBounds(348, 11, 94, 48);
		PanelMenu.add(btnPilotos);
		
		JButton btnGranPre = new JButton("Gran Premio");
		btnGranPre.setForeground(Color.RED);
		btnGranPre.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGranPre.setBackground(Color.DARK_GRAY);
		btnGranPre.setBounds(452, 11, 130, 48);
		PanelMenu.add(btnGranPre);
		
		JButton btnClasi = new JButton("Clasificaciones");
		btnClasi.setForeground(Color.RED);
		btnClasi.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnClasi.setBackground(Color.DARK_GRAY);
		btnClasi.setBounds(592, 11, 145, 48);
		PanelMenu.add(btnClasi);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.RED);
		btnLogin.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setBounds(872, 11, 92, 48);
		PanelMenu.add(btnLogin);
		
		JButton btnSimulacion = new JButton("Simulacion");
		btnSimulacion.setForeground(Color.RED);
		btnSimulacion.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSimulacion.setBackground(Color.DARK_GRAY);
		btnSimulacion.setBounds(747, 11, 115, 48);
		PanelMenu.add(btnSimulacion);
	}
}
