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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FichaPilotos extends JFrame {
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtNacionalidad;
	private JTextField txtEdad;
	private JTextField txtPalmares;
	private JTextField txtEscuderia;
	public  JButton btnInicio,btnEscuderias,btnPilotos,btnGranPre,btnClasi,btnLogin;

	
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
		setBounds(100, 100, 865, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(27, 95, 288, 320);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("src/Imagenes/piloto.png"));
		lblNewLabel_2_1.setBounds(39, 11, 206, 206);
		panel.add(lblNewLabel_2_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 236, 268, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 307, 268, 2);
		panel.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src/Imagenes/Logo.png"));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 17));
		lblNewLabel.setBounds(205, 236, 73, 73);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("src/Imagenes/Casco.png"));
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 236, 100, 73);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("src/Imagenes/maxresdefault.jpg"));
		lblNewLabel_3.setBounds(10, 11, 268, 206);
		panel.add(lblNewLabel_3);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(484, 125, 60, 20);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBackground(Color.WHITE);
		txtNombre.setEditable(false);
		txtNombre.setBounds(584, 127, 170, 20);
		txtNombre.setBorder(null);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:");
		lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNacionalidad.setBounds(484, 158, 90, 20);
		contentPane.add(lblNacionalidad);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setBackground(Color.WHITE);
		txtNacionalidad.setEditable(false);
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBorder(null);
		txtNacionalidad.setBounds(584, 158, 170, 20);
		contentPane.add(txtNacionalidad);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEdad.setBounds(484, 189, 60, 20);
		contentPane.add(lblEdad);
		
		txtEdad = new JTextField();
		txtEdad.setBackground(Color.WHITE);
		txtEdad.setEditable(false);
		txtEdad.setColumns(10);
		txtEdad.setBorder(null);
		txtEdad.setBounds(584, 191, 170, 20);
		contentPane.add(txtEdad);
		
		JLabel lblPalmares = new JLabel("Palmares:");
		lblPalmares.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPalmares.setBounds(484, 222, 90, 20);
		contentPane.add(lblPalmares);
		
		txtPalmares = new JTextField();
		txtPalmares.setBackground(Color.WHITE);
		txtPalmares.setEditable(false);
		txtPalmares.setColumns(10);
		txtPalmares.setBorder(null);
		txtPalmares.setBounds(584, 222, 170, 20);
		contentPane.add(txtPalmares);
		
		JLabel lblEscuderia = new JLabel("Escuderia:");
		lblEscuderia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEscuderia.setBounds(484, 253, 90, 20);
		contentPane.add(lblEscuderia);
		
		txtEscuderia = new JTextField();
		txtEscuderia.setBackground(Color.WHITE);
		txtEscuderia.setEditable(false);
		txtEscuderia.setColumns(10);
		txtEscuderia.setBorder(null);
		txtEscuderia.setBounds(584, 253, 170, 20);
		contentPane.add(txtEscuderia);
		
		JPanel PanelMenu = new JPanel();
		PanelMenu.setLayout(null);
		PanelMenu.setBackground(Color.LIGHT_GRAY);
		PanelMenu.setBounds(0, -2, 849, 71);
		contentPane.add(PanelMenu);
		
		btnInicio = new JButton("Inicio");
		btnInicio.setForeground(Color.RED);
		btnInicio.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnInicio.setBackground(Color.DARK_GRAY);
		btnInicio.setBounds(144, 11, 74, 48);
		PanelMenu.add(btnInicio);
		
		btnEscuderias = new JButton("Escuderias");
		btnEscuderias.setForeground(Color.RED);
		btnEscuderias.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnEscuderias.setBackground(Color.DARK_GRAY);
		btnEscuderias.setBounds(226, 11, 112, 48);
		PanelMenu.add(btnEscuderias);
		
		btnPilotos = new JButton("Pilotos");
		btnPilotos.setForeground(Color.RED);
		btnPilotos.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnPilotos.setBackground(Color.DARK_GRAY);
		btnPilotos.setBounds(348, 11, 94, 48);
		PanelMenu.add(btnPilotos);
		
		btnGranPre = new JButton("Gran Premio");
		btnGranPre.setForeground(Color.RED);
		btnGranPre.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGranPre.setBackground(Color.DARK_GRAY);
		btnGranPre.setBounds(452, 11, 130, 48);
		PanelMenu.add(btnGranPre);
		
		btnClasi = new JButton("Clasificaciones");
		btnClasi.setForeground(Color.RED);
		btnClasi.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnClasi.setBackground(Color.DARK_GRAY);
		btnClasi.setBounds(592, 11, 145, 48);
		PanelMenu.add(btnClasi);
		
		btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.RED);
		btnLogin.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setBounds(747, 11, 92, 48);
		PanelMenu.add(btnLogin);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("E:\\Users\\Usuaio\\Interfaces\\TrabajoFormula1\\src\\Imagenes\\F1-logo.png"));
		lblNewLabel_4.setBounds(0, 11, 134, 48);
		PanelMenu.add(lblNewLabel_4);
	}
}
