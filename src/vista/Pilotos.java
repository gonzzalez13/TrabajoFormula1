package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Pilotos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pilotos frame = new Pilotos();
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
	public Pilotos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 413);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(23, 28, 288, 269);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 11, 268, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 49, 268, 2);
		panel.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("LEWIS HAMILTON");
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 17));
		lblNewLabel.setBounds(20, 24, 160, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Interfaces\\Formula1\\src\\Imagenes\\N\u00BAHamil.png"));
		lblNewLabel_1.setBounds(205, 11, 73, 40);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Interfaces\\Formula1\\src\\Imagenes\\piloto.png"));
		lblNewLabel_2.setBounds(44, 62, 206, 206);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Interfaces\\Formula1\\src\\Imagenes\\maxresdefault.jpg"));
		lblNewLabel_3.setBounds(10, 62, 268, 206);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(351, 28, 200, 200);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Interfaces\\Formula1\\src\\Imagenes\\Preba\\piloto.png"));
		lblNewLabel_2_1.setBounds(44, 62, 125, 127);
		panel_1.add(lblNewLabel_2_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 11, 268, 2);
		panel_1.add(separator_2);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 49, 268, 2);
		panel_1.add(separator_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("LEWIS HAMILTON");
		lblNewLabel_4.setFont(new Font("Bauhaus 93", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(20, 24, 112, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Interfaces\\Formula1\\src\\Imagenes\\Preba\\maxresdefault.jpg"));
		lblNewLabel_3_1.setBounds(10, 62, 180, 127);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Interfaces\\Formula1\\src\\Imagenes\\N\u00BAHamil.png"));
		lblNewLabel_1_1.setBounds(127, 11, 73, 40);
		panel_1.add(lblNewLabel_1_1);
	}
}
