package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class GranPremio extends JFrame {

	private JPanel contentPane;
	private JPanel PanelMenu;
	private JLabel lblLogo;
	private JButton btnInicio_1;
	private JButton btnEscuderias_1;
	private JButton btnPilotos_1;
	private JButton btnGranPre_1;
	private JButton btnClasi_1;
	private JButton btnLogin_1;
	private JButton btnSimulacion;
	private JTextField textNombre;
	private JTextField textLogitud;
	private JTextField textCurvas;
	private JTextField textPrimerAño;
	private JTextField textDistanciaGP;
	private JTextField textVueltas;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GranPremio frame = new GranPremio();
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
	public GranPremio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelMenu = new JPanel();
		PanelMenu.setLayout(null);
		PanelMenu.setBackground(new Color(178, 29, 28));
		PanelMenu.setBounds(0, 0, 974, 72);
		contentPane.add(PanelMenu);
		
		lblLogo = new JLabel("");
		lblLogo.setBounds(10, 11, 133, 48);
		PanelMenu.add(lblLogo);
		
		btnInicio_1 = new JButton("Inicio");
		btnInicio_1.setForeground(Color.WHITE);
		btnInicio_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnInicio_1.setBackground(new Color(59, 45, 45));
		btnInicio_1.setBounds(144, 11, 74, 48);
		PanelMenu.add(btnInicio_1);
		
		btnEscuderias_1 = new JButton("Escuderias");
		btnEscuderias_1.setForeground(Color.WHITE);
		btnEscuderias_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnEscuderias_1.setBackground(new Color(59, 45, 45));
		btnEscuderias_1.setBounds(226, 11, 112, 48);
		PanelMenu.add(btnEscuderias_1);
		
		btnPilotos_1 = new JButton("Pilotos");
		btnPilotos_1.setForeground(Color.WHITE);
		btnPilotos_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnPilotos_1.setBackground(new Color(59, 45, 45));
		btnPilotos_1.setBounds(348, 11, 94, 48);
		PanelMenu.add(btnPilotos_1);
		
		btnGranPre_1 = new JButton("Gran Premio");
		btnGranPre_1.setForeground(Color.WHITE);
		btnGranPre_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGranPre_1.setBackground(new Color(59, 45, 45));
		btnGranPre_1.setBounds(452, 11, 130, 48);
		PanelMenu.add(btnGranPre_1);
		
		btnClasi_1 = new JButton("Clasificaciones");
		btnClasi_1.setForeground(Color.WHITE);
		btnClasi_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnClasi_1.setBackground(new Color(59, 45, 45));
		btnClasi_1.setBounds(592, 11, 145, 48);
		PanelMenu.add(btnClasi_1);
		
		btnLogin_1 = new JButton("Login");
		btnLogin_1.setForeground(Color.WHITE);
		btnLogin_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogin_1.setBackground(new Color(59, 45, 45));
		btnLogin_1.setBounds(872, 11, 92, 48);
		PanelMenu.add(btnLogin_1);
		
		btnSimulacion = new JButton("Simulacion");
		btnSimulacion.setForeground(Color.WHITE);
		btnSimulacion.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSimulacion.setBackground(new Color(59, 45, 45));
		btnSimulacion.setBounds(747, 11, 115, 48);
		PanelMenu.add(btnSimulacion);
		
		JPanel panelFichaPremio = new JPanel();
		panelFichaPremio.setBounds(0, 71, 974, 540);
		contentPane.add(panelFichaPremio);
		panelFichaPremio.setLayout(null);
		
		JButton btnSimular = new JButton("Simular");
		btnSimular.setForeground(Color.RED);
		btnSimular.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSimular.setBackground(Color.DARK_GRAY);
		btnSimular.setBounds(771, 470, 94, 48);
		panelFichaPremio.add(btnSimular);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblNombre.setBounds(572, 41, 65, 30);
		panelFichaPremio.add(lblNombre);
		
		JLabel label = new JLabel("");
		label.setBounds(545, 79, 46, 14);
		panelFichaPremio.add(label);
		
		JLabel lblLongitud = new JLabel("Longitud:");
		lblLongitud.setForeground(Color.WHITE);
		lblLongitud.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblLongitud.setBounds(572, 123, 65, 30);
		panelFichaPremio.add(lblLongitud);
		
		JLabel lblCurvas = new JLabel("Curvas:");
		lblCurvas.setForeground(Color.WHITE);
		lblCurvas.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblCurvas.setBounds(587, 205, 50, 30);
		panelFichaPremio.add(lblCurvas);
		
		textNombre = new JTextField();
		textNombre.setEditable(false);
		textNombre.setColumns(10);
		textNombre.setBackground(SystemColor.menu);
		textNombre.setBounds(680, 47, 185, 20);
		panelFichaPremio.add(textNombre);
		
		textLogitud = new JTextField();
		textLogitud.setEditable(false);
		textLogitud.setColumns(10);
		textLogitud.setBackground(SystemColor.menu);
		textLogitud.setBounds(680, 129, 185, 20);
		panelFichaPremio.add(textLogitud);
		
		textCurvas = new JTextField();
		textCurvas.setEditable(false);
		textCurvas.setColumns(10);
		textCurvas.setBackground(SystemColor.menu);
		textCurvas.setBounds(680, 211, 185, 20);
		panelFichaPremio.add(textCurvas);
		
		JLabel lblPrimerAño = new JLabel("Primer a\u00F1o:");
		lblPrimerAño.setForeground(Color.WHITE);
		lblPrimerAño.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblPrimerAño.setBounds(554, 82, 83, 30);
		panelFichaPremio.add(lblPrimerAño);
		
		textPrimerAño = new JTextField();
		textPrimerAño.setEditable(false);
		textPrimerAño.setColumns(10);
		textPrimerAño.setBackground(SystemColor.menu);
		textPrimerAño.setBounds(680, 88, 185, 20);
		panelFichaPremio.add(textPrimerAño);
		
		JLabel lblDistanciaGp = new JLabel("Distancia GP:");
		lblDistanciaGp.setForeground(Color.WHITE);
		lblDistanciaGp.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblDistanciaGp.setBounds(541, 164, 96, 30);
		panelFichaPremio.add(lblDistanciaGp);
		
		textDistanciaGP = new JTextField();
		textDistanciaGP.setEditable(false);
		textDistanciaGP.setColumns(10);
		textDistanciaGP.setBackground(SystemColor.menu);
		textDistanciaGP.setBounds(680, 170, 185, 20);
		panelFichaPremio.add(textDistanciaGP);
		
		JLabel lblVueltas = new JLabel("Vueltas:");
		lblVueltas.setForeground(Color.WHITE);
		lblVueltas.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblVueltas.setBounds(587, 246, 65, 30);
		panelFichaPremio.add(lblVueltas);
		
		textVueltas = new JTextField();
		textVueltas.setEditable(false);
		textVueltas.setColumns(10);
		textVueltas.setBackground(SystemColor.menu);
		textVueltas.setBounds(680, 252, 185, 20);
		panelFichaPremio.add(textVueltas);
		
		panel = new JPanel();
		panel.setBounds(35, 47, 355, 309);
		panelFichaPremio.add(panel);
		panel.setLayout(null);
		
		JLabel lblFoto = new JLabel("");
		lblFoto.setBounds(10, 11, 335, 282);
		panel.add(lblFoto);
		lblFoto.setIcon(new ImageIcon());
		lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 974, 540);
		panelFichaPremio.add(lblFondo);
		lblFondo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.PNG"));
	}
	
}
