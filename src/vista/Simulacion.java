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
		setBounds(100, 100, 770, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboListaCircuitos = new JComboBox();
		comboListaCircuitos.setBounds(494, 90, 200, 20);
		contentPane.add(comboListaCircuitos);
		
		JLabel lblFotoCircuito = new JLabel("");
		lblFotoCircuito.setBounds(45, 60, 246, 254);
		contentPane.add(lblFotoCircuito);
		
		JLabel lblNVueltas = new JLabel("Numero de vueltas:");
		lblNVueltas.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		lblNVueltas.setForeground(Color.WHITE);
		lblNVueltas.setBounds(340, 267, 126, 26);
		contentPane.add(lblNVueltas);
		
		JSlider slider = new JSlider();
		slider.setMaximum(3);
		slider.setValue(2);
		slider.setBackground(Color.RED);
		slider.setForeground(Color.RED);
		slider.setBounds(494, 267, 200, 26);
		contentPane.add(slider);
		
		JLabel lblCircuito = new JLabel("Circuito:");
		lblCircuito.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		lblCircuito.setForeground(Color.WHITE);
		lblCircuito.setBackground(Color.WHITE);
		lblCircuito.setBounds(340, 87, 126, 26);
		contentPane.add(lblCircuito);
		
		JButton btnSimularCarrera = new JButton("Simular carrera");
		btnSimularCarrera.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnSimularCarrera.setBackground(Color.WHITE);
		btnSimularCarrera.setForeground(Color.RED);
		btnSimularCarrera.setBounds(559, 396, 135, 34);
		contentPane.add(btnSimularCarrera);
		
		JLabel lblTiempo = new JLabel("Tiempo:");
		lblTiempo.setForeground(Color.WHITE);
		lblTiempo.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		lblTiempo.setBackground(Color.WHITE);
		lblTiempo.setBounds(340, 183, 126, 26);
		contentPane.add(lblTiempo);
		
		JComboBox comboTiempo = new JComboBox();
		comboTiempo.setBounds(494, 186, 200, 20);
		contentPane.add(comboTiempo);
	}
}
