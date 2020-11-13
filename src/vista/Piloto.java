package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JSeparator;
import java.awt.Font;

public class Piloto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Piloto frame = new Piloto();
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
	public Piloto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel PanelMenu = new JPanel();
		PanelMenu.setLayout(null);
		PanelMenu.setBackground(Color.WHITE);
		PanelMenu.setBounds(0, 0, 754, 35);
		contentPane.add(PanelMenu);
		
		JButton btnNewButton_4 = new JButton("Inicio");
		btnNewButton_4.setBounds(132, 0, 74, 35);
		PanelMenu.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("Escuderias");
		btnNewButton_3.setBounds(217, 0, 98, 35);
		PanelMenu.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Pilotos");
		btnNewButton_2.setBounds(325, 0, 74, 35);
		PanelMenu.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Gran Premio");
		btnNewButton_1.setBounds(409, 0, 112, 35);
		PanelMenu.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Clasificaciones");
		btnNewButton.setBounds(531, 0, 122, 35);
		PanelMenu.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("Login");
		btnNewButton_5.setBounds(663, 0, 89, 35);
		PanelMenu.add(btnNewButton_5);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("E:\\Users\\Usuaio\\Interfaces\\TrabajoFormula1\\src\\Imagenes\\F1-logo.png"));
		lblNewLabel_4.setBounds(0, 0, 133, 35);
		PanelMenu.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 34, 754, 357);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setPreferredSize(new Dimension(850, 430));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(10, 23, 207, 60);
		panel_1.add(panel_2);
		
		JButton btnNewButton_6 = new JButton("  Lewis Hamilton  >");
		btnNewButton_6.setIcon(new ImageIcon("E:\\Users\\Usuaio\\Interfaces\\TrabajoFormula1\\src\\Imagenes\\N\u00BAHamil.png"));
		btnNewButton_6.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6.setBorder(null);
		btnNewButton_6.setBackground(Color.WHITE);
		btnNewButton_6.setBounds(0, 11, 207, 37);
		panel_2.add(btnNewButton_6);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 53, 207, 6);
		panel_2.add(separator);
	}
}
