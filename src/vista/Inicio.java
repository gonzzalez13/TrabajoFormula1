package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.ImageIcon;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 764, 35);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Inicio");
		btnNewButton_4.setBounds(132, 0, 74, 35);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("Escuderias");
		btnNewButton_3.setBounds(217, 0, 98, 35);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Pilotos");
		btnNewButton_2.setBounds(325, 0, 74, 35);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Gran Premio");
		btnNewButton_1.setBounds(409, 0, 112, 35);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Clasificaciones");
		btnNewButton.setBounds(531, 0, 122, 35);
		panel.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("Login");
		btnNewButton_5.setBounds(663, 0, 89, 35);
		panel.add(btnNewButton_5);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("src/Imagenes/F1-logo.png"));
		lblNewLabel_4.setBounds(0, 0, 133, 35);
		panel.add(lblNewLabel_4);
		
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
	}
}
