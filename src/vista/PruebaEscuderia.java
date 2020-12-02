package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;

public class PruebaEscuderia extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaEscuderia frame = new PruebaEscuderia();
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
	public PruebaEscuderia() {
		Toolkit pantalla=Toolkit.getDefaultToolkit();
		Dimension  tamano=pantalla.getScreenSize();
		
		
		int alto=(int)tamano.height+100,ancho=(int)tamano.width+2000;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 990,650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel PanelMenu = new JPanel();
		PanelMenu.setLayout(null);
		PanelMenu.setBackground(new Color(178,29,28));
		PanelMenu.setBounds(0, 0, 974, 72);
		contentPane.add(PanelMenu);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"F1-logo.png"));
		lblLogo.setBounds(10, 11, 133, 48);
		PanelMenu.add(lblLogo);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.setForeground(new Color(255,255,255));
		btnInicio.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnInicio.setBackground(new Color(59,45,45));
		btnInicio.setBounds(144, 11, 74, 48);
		PanelMenu.add(btnInicio);
		
		JButton btnEscuderias = new JButton("Escuderias");
		btnEscuderias.setForeground(new Color(255,255,255));
		btnEscuderias.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnEscuderias.setBackground(new Color(59,45,45));
		btnEscuderias.setBounds(226, 11, 112, 48);
		PanelMenu.add(btnEscuderias);
		
		JButton btnPilotos = new JButton("Pilotos");
		btnPilotos.setForeground(new Color(255,255,255));
		btnPilotos.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnPilotos.setBackground(new Color(59,45,45));
		btnPilotos.setBounds(348, 11, 94, 48);
		PanelMenu.add(btnPilotos);
		
		JButton btnGranPre = new JButton("Gran Premio");
		btnGranPre.setForeground(new Color(255,255,255));
		btnGranPre.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGranPre.setBackground(new Color(59,45,45));
		btnGranPre.setBounds(452, 11, 130, 48);
		PanelMenu.add(btnGranPre);
		
		JButton btnClasi = new JButton("Clasificaciones");
		btnClasi.setForeground(new Color(255,255,255));
		btnClasi.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnClasi.setBackground(new Color(59,45,45));
		btnClasi.setBounds(592, 11, 145, 48);
		PanelMenu.add(btnClasi);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(255,255,255));
		btnLogin.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogin.setBackground(new Color(59,45,45));
		btnLogin.setBounds(872, 11, 92, 48);
		PanelMenu.add(btnLogin);
		
		JButton btnSimulacion = new JButton("Simulacion");
		btnSimulacion.setForeground(new Color(255,255,255));
		btnSimulacion.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSimulacion.setBackground(new Color(59,45,45));
		btnSimulacion.setBounds(747, 11, 115, 48);
		PanelMenu.add(btnSimulacion);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 72, 974, 539);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 11, 270, 121);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCoche = new JLabel("");
		lblCoche.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Interfaces\\TrabajoFormula1\\src\\Imagenes\\Cmercedes.png"));
		lblCoche.setBounds(0, 46, 270, 75);
		panel_1.add(lblCoche);
		
		JLabel lblFCoche = new JLabel("");
		lblFCoche.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Interfaces\\TrabajoFormula1\\src\\Imagenes\\fondco.png"));
		lblFCoche.setBounds(0, 47, 270, 74);
		panel_1.add(lblFCoche);
		
		JLabel lblNombre = new JLabel("MERCEDES\r\n\r\n");
		lblNombre.setFont(new Font("Bauhaus 93", Font.PLAIN, 23));
		lblNombre.setBounds(0, 0, 149, 47);
		panel_1.add(lblNombre);
		
		JLabel lblLogEsc = new JLabel("");
		lblLogEsc.setBounds(213, 0, 47, 47);
		panel_1.add(lblLogEsc);
		lblLogEsc.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Interfaces\\TrabajoFormula1\\src\\Imagenes\\Logo.png"));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 46, 270, 8);
		panel_1.add(separator);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(10, 143, 270, 121);
		panel.add(panel_1_1);
		
		JLabel lblCoche_1 = new JLabel("");
		lblCoche_1.setBounds(0, 46, 270, 75);
		panel_1_1.add(lblCoche_1);
		
		JLabel lblFCoche_1 = new JLabel("");
		lblFCoche_1.setBounds(0, 47, 270, 74);
		panel_1_1.add(lblFCoche_1);
		
		JLabel lblNombre_1 = new JLabel("MERCEDES\r\n\r\n");
		lblNombre_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 23));
		lblNombre_1.setBounds(0, 0, 149, 47);
		panel_1_1.add(lblNombre_1);
		
		JLabel lblLogEsc_1 = new JLabel("");
		lblLogEsc_1.setBounds(213, 0, 47, 47);
		panel_1_1.add(lblLogEsc_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 46, 270, 8);
		panel_1_1.add(separator_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBounds(10, 275, 270, 121);
		panel.add(panel_1_2);
		
		JLabel lblCoche_2 = new JLabel("");
		lblCoche_2.setBounds(0, 46, 270, 75);
		panel_1_2.add(lblCoche_2);
		
		JLabel lblFCoche_2 = new JLabel("");
		lblFCoche_2.setBounds(0, 47, 270, 74);
		panel_1_2.add(lblFCoche_2);
		
		JLabel lblNombre_2 = new JLabel("MERCEDES\r\n\r\n");
		lblNombre_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 23));
		lblNombre_2.setBounds(0, 0, 149, 47);
		panel_1_2.add(lblNombre_2);
		
		JLabel lblLogEsc_2 = new JLabel("");
		lblLogEsc_2.setBounds(213, 0, 47, 47);
		panel_1_2.add(lblLogEsc_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 46, 270, 8);
		panel_1_2.add(separator_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBackground(Color.WHITE);
		panel_1_3.setBounds(10, 407, 270, 121);
		panel.add(panel_1_3);
		
		JLabel lblCoche_3 = new JLabel("");
		lblCoche_3.setBounds(0, 46, 270, 75);
		panel_1_3.add(lblCoche_3);
		
		JLabel lblFCoche_3 = new JLabel("");
		lblFCoche_3.setBounds(0, 47, 270, 74);
		panel_1_3.add(lblFCoche_3);
		
		JLabel lblNombre_3 = new JLabel("MERCEDES\r\n\r\n");
		lblNombre_3.setFont(new Font("Bauhaus 93", Font.PLAIN, 23));
		lblNombre_3.setBounds(0, 0, 149, 47);
		panel_1_3.add(lblNombre_3);
		
		JLabel lblLogEsc_3 = new JLabel("");
		lblLogEsc_3.setBounds(213, 0, 47, 47);
		panel_1_3.add(lblLogEsc_3);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 46, 270, 8);
		panel_1_3.add(separator_3);
		
		JLabel lblFondo = new JLabel();
		lblFondo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.PNG"));
		
		lblFondo.setBounds(0, 0, 974, 539);
		panel.add(lblFondo);
	}
}
