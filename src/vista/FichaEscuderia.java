package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class FichaEscuderia extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textNacionalidad;
	private JTextField textBase;
	private JTextField textAño;
	private JTextField textPremios;
	private JTextField textJefeE;
	private JTextField textJefeT;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FichaEscuderia frame = new FichaEscuderia();
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
	public FichaEscuderia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel PanelMenu = new JPanel();
		PanelMenu.setLayout(null);
		PanelMenu.setBackground(Color.LIGHT_GRAY);
		PanelMenu.setBounds(0, 0, 849, 71);
		contentPane.add(PanelMenu);
		
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
		btnLogin.setBounds(747, 11, 92, 48);
		PanelMenu.add(btnLogin);
		
		JButton btnLogo = new JButton("");
		btnLogo.setIcon(new ImageIcon("src/Imagenes/F1-logo.png"));
		btnLogo.setForeground(new Color(192, 192, 192));
		btnLogo.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogo.setBackground(Color.LIGHT_GRAY);
		btnLogo.setBounds(10, 11, 124, 48);
		btnLogo.setBorder(null);
		PanelMenu.add(btnLogo);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 70, 849, 541);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("E:\\Users\\Usuaio\\Interfaces\\TrabajoFormula1\\src\\Imagenes\\Logos\\Mercedes.jpg"));
		lblLogo.setBounds(26, 40, 284, 125);
		panel.add(lblLogo);
		
		JLabel lblNombre = new JLabel("Nombre completo");
		lblNombre.setBounds(26, 176, 160, 26);
		panel.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setEnabled(false);
		textNombre.setEditable(false);
		textNombre.setBounds(185, 179, 125, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(26, 213, 160, 26);
		panel.add(lblNacionalidad);
		
		textNacionalidad = new JTextField();
		textNacionalidad.setEditable(false);
		textNacionalidad.setEnabled(false);
		textNacionalidad.setColumns(10);
		textNacionalidad.setBounds(185, 216, 125, 20);
		panel.add(textNacionalidad);
		
		JLabel lblBase = new JLabel("Base ");
		lblBase.setBounds(26, 250, 160, 26);
		panel.add(lblBase);
		
		textBase = new JTextField();
		textBase.setEditable(false);
		textBase.setEnabled(false);
		textBase.setColumns(10);
		textBase.setBounds(185, 253, 125, 20);
		panel.add(textBase);
		
		JLabel lblAño = new JLabel("Primer A\u00F1o de competicion");
		lblAño.setBounds(26, 287, 160, 26);
		panel.add(lblAño);
		
		textAño = new JTextField();
		textAño.setEditable(false);
		textAño.setEnabled(false);
		textAño.setColumns(10);
		textAño.setBounds(185, 287, 125, 20);
		panel.add(textAño);
		
		JLabel lblPremios = new JLabel("Premios");
		lblPremios.setBounds(26, 324, 160, 26);
		panel.add(lblPremios);
		
		textPremios = new JTextField();
		textPremios.setEditable(false);
		textPremios.setEnabled(false);
		textPremios.setColumns(10);
		textPremios.setBounds(185, 327, 125, 20);
		panel.add(textPremios);
		
		JLabel lblJefeE = new JLabel("Jefe de Equipo");
		lblJefeE.setBounds(26, 361, 160, 26);
		panel.add(lblJefeE);
		
		textJefeE = new JTextField();
		textJefeE.setEditable(false);
		textJefeE.setEnabled(false);
		textJefeE.setColumns(10);
		textJefeE.setBounds(185, 364, 125, 20);
		panel.add(textJefeE);
		
		JLabel lblJefeT = new JLabel("Jefe Tecnico");
		lblJefeT.setBounds(26, 398, 160, 26);
		panel.add(lblJefeT);
		
		textJefeT = new JTextField();
		textJefeT.setEditable(false);
		textJefeT.setEnabled(false);
		textJefeT.setColumns(10);
		textJefeT.setBounds(185, 401, 125, 20);
		panel.add(textJefeT);
		
		JButton btnPiloto1 = new JButton("");
		btnPiloto1.setIcon(new ImageIcon("E:\\Users\\Usuaio\\Interfaces\\TrabajoFormula1\\src\\Imagenes\\Logos\\H15.jpg"));
		btnPiloto1.setBounds(357, 40, 232, 232);
		panel.add(btnPiloto1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(357, 283, 232, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnPiloto2 = new JButton("");
		btnPiloto2.setIcon(new ImageIcon("E:\\Users\\Usuaio\\Interfaces\\TrabajoFormula1\\src\\Imagenes\\Logos\\H25.jpg"));
		btnPiloto2.setBounds(607, 40, 232, 232);
		panel.add(btnPiloto2);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(607, 283, 232, 30);
		panel.add(textField_1);
	}
}
