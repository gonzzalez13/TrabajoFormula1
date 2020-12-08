package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
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
		
		JPanel panelSimulacion = new JPanel();
		panelSimulacion.setBounds(0, 71, 974, 540);
		contentPane.add(panelSimulacion);
		panelSimulacion.setLayout(null);
		
		JComboBox comboListaCircuitos = new JComboBox();
		comboListaCircuitos.setBounds(634, 45, 200, 20);
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
		
		JComboBox comboTiempo = new JComboBox();
		comboTiempo.setBounds(634, 157, 200, 20);
		panelSimulacion.add(comboTiempo);
		
		JLabel lblNewLabel_1 = new JLabel("X10");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(844, 269, 70, 26);
		panelSimulacion.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));
		lblNewLabel.setBounds(0, 0, 974, 540);
		panelSimulacion.add(lblNewLabel);
	}
}
