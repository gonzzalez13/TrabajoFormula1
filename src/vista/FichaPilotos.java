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
import javax.swing.JButton;

public class FichaPilotos extends JFrame {
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtNacionalidad;
	private JTextField txtEdad;
	private JTextField txtPalmares;
	private JTextField txtEscuderia;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FichaPilotos frame = new FichaPilotos();
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
	public FichaPilotos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 430);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
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
		lblNewLabel_4.setIcon(new ImageIcon("src/Imagenes/F1-logo.png"));
		lblNewLabel_4.setBounds(0, 0, 133, 35);
		PanelMenu.add(lblNewLabel_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 46, 288, 320);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 11, 268, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 82, 268, 2);
		panel.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Interfaces\\Formula1\\src\\Imagenes\\Logo.png"));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 17));
		lblNewLabel.setBounds(205, 11, 73, 73);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Interfaces\\Formula1\\src\\Imagenes\\piloto.png"));
		lblNewLabel_2.setBounds(43, 103, 206, 206);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Interfaces\\Formula1\\src\\Imagenes\\maxresdefault.jpg"));
		lblNewLabel_3.setBounds(10, 103, 268, 206);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Interfaces\\Formula1\\src\\Imagenes\\Casco.png"));
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 11, 100, 73);
		panel.add(lblNewLabel_1);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(400, 125, 60, 20);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBackground(Color.WHITE);
		txtNombre.setEditable(false);
		txtNombre.setBounds(500, 127, 170, 20);
		txtNombre.setBorder(null);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:");
		lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNacionalidad.setBounds(400, 158, 90, 20);
		contentPane.add(lblNacionalidad);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setBackground(Color.WHITE);
		txtNacionalidad.setEditable(false);
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBorder(null);
		txtNacionalidad.setBounds(500, 158, 170, 20);
		contentPane.add(txtNacionalidad);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEdad.setBounds(400, 189, 60, 20);
		contentPane.add(lblEdad);
		
		txtEdad = new JTextField();
		txtEdad.setBackground(Color.WHITE);
		txtEdad.setEditable(false);
		txtEdad.setColumns(10);
		txtEdad.setBorder(null);
		txtEdad.setBounds(500, 191, 170, 20);
		contentPane.add(txtEdad);
		
		JLabel lblPalmares = new JLabel("Palmares:");
		lblPalmares.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPalmares.setBounds(400, 222, 90, 20);
		contentPane.add(lblPalmares);
		
		txtPalmares = new JTextField();
		txtPalmares.setBackground(Color.WHITE);
		txtPalmares.setEditable(false);
		txtPalmares.setColumns(10);
		txtPalmares.setBorder(null);
		txtPalmares.setBounds(500, 222, 170, 20);
		contentPane.add(txtPalmares);
		
		JLabel lblEscuderia = new JLabel("Escuderia:");
		lblEscuderia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEscuderia.setBounds(400, 253, 90, 20);
		contentPane.add(lblEscuderia);
		
		txtEscuderia = new JTextField();
		txtEscuderia.setBackground(Color.WHITE);
		txtEscuderia.setEditable(false);
		txtEscuderia.setColumns(10);
		txtEscuderia.setBorder(null);
		txtEscuderia.setBounds(500, 253, 170, 20);
		contentPane.add(txtEscuderia);
	}
}
