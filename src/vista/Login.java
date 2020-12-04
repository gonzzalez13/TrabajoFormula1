package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField tFUsuario;
	private JTextField tFContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Log In\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tFContraseña = new JTextField();
		tFContraseña.setOpaque(false);
		tFContraseña.setColumns(10);
		tFContraseña.setBorder(new MatteBorder(0, 0, 3, 0, (Color) Color.WHITE));
		tFContraseña.setBounds(144, 304, 139, 19);
		contentPane.add(tFContraseña);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btnCancelar.setBackground(Color.DARK_GRAY);
		btnCancelar.setBounds(315, 487, 113, 42);
		contentPane.add(btnCancelar);
		
		JButton btIniciarSesion = new JButton("INICIAR SESION");
		btIniciarSesion.setForeground(Color.WHITE);
		btIniciarSesion.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btIniciarSesion.setBackground(Color.DARK_GRAY);
		btIniciarSesion.setBounds(10, 487, 139, 42);
		contentPane.add(btIniciarSesion);
		
		JLabel lblNewLabel_1_1 = new JLabel("CONTRASE\u00D1A");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 19));
		lblNewLabel_1_1.setBounds(144, 264, 139, 19);
		contentPane.add(lblNewLabel_1_1);
		
		tFUsuario = new JTextField();
		tFUsuario.setOpaque(false);
		tFUsuario.setBorder(new MatteBorder(0, 0, 3, 0, (Color) Color.WHITE));
		tFUsuario.setBounds(144, 202, 139, 19);
		contentPane.add(tFUsuario);
		tFUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("USUARIO");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(144, 173, 139, 19);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("AYUDA");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btnNewButton.setBounds(10, 10, 101, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/F1-logo.png")));
		lblLogo.setBounds(144, 59, 139, 104);
		contentPane.add(lblLogo);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFondo.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/Fondos/fondo3.jpg")));
		lblFondo.setBounds(-12, 0, 461, 549);
		contentPane.add(lblFondo);
	}
}
