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
	private JTextField textFieldNombre;
	private JTextField textFieldLongitud;
	private JTextField textFieldCurvas;
	private JButton btnSimular;
	private JTextField textFieldPrimerAño;
	private JTextField textFieldDistanciaGp;
	private JTextField textFieldVueltas;
	private JLabel lblNewLabel;
	private JPanel PanelMenu;
	private JLabel lblLogo;
	private JButton btnInicio_1;
	private JButton btnEscuderias_1;
	private JButton btnPilotos_1;
	private JButton btnGranPre_1;
	private JButton btnClasi_1;
	private JButton btnLogin_1;
	private JButton btnSimulacion;

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
		
		JLabel lblFoto = new JLabel("Foto Gran Premio");
		lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblFoto.setBounds(25, 110, 245, 282);
		contentPane.add(lblFoto);
		
		btnSimular = new JButton("Simular");
		btnSimular.setForeground(Color.RED);
		btnSimular.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSimular.setBackground(Color.DARK_GRAY);
		btnSimular.setBounds(771, 541, 94, 48);
		contentPane.add(btnSimular);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblNombre.setBounds(572, 112, 65, 30);
		contentPane.add(lblNombre);
		
		JLabel label = new JLabel("");
		label.setBounds(545, 150, 46, 14);
		contentPane.add(label);
		
		JLabel lblLongitud = new JLabel("Longitud:");
		lblLongitud.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblLongitud.setBounds(572, 194, 65, 30);
		contentPane.add(lblLongitud);
		
		JLabel lblCurvas = new JLabel("Curvas:");
		lblCurvas.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblCurvas.setBounds(587, 276, 50, 30);
		contentPane.add(lblCurvas);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setEditable(false);
		textFieldNombre.setBackground(SystemColor.control);
		textFieldNombre.setBounds(680, 118, 185, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldLongitud = new JTextField();
		textFieldLongitud.setEditable(false);
		textFieldLongitud.setColumns(10);
		textFieldLongitud.setBackground(SystemColor.menu);
		textFieldLongitud.setBounds(680, 200, 185, 20);
		contentPane.add(textFieldLongitud);
		
		textFieldCurvas = new JTextField();
		textFieldCurvas.setEditable(false);
		textFieldCurvas.setColumns(10);
		textFieldCurvas.setBackground(SystemColor.menu);
		textFieldCurvas.setBounds(680, 282, 185, 20);
		contentPane.add(textFieldCurvas);
		
		JLabel lblPrimerAño = new JLabel("Primer a\u00F1o:");
		lblPrimerAño.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblPrimerAño.setBounds(554, 153, 83, 30);
		contentPane.add(lblPrimerAño);
		
		textFieldPrimerAño = new JTextField();
		textFieldPrimerAño.setEditable(false);
		textFieldPrimerAño.setColumns(10);
		textFieldPrimerAño.setBackground(SystemColor.menu);
		textFieldPrimerAño.setBounds(680, 159, 185, 20);
		contentPane.add(textFieldPrimerAño);
		
		JLabel lblDistanciaGp = new JLabel("Distancia GP:");
		lblDistanciaGp.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblDistanciaGp.setBounds(541, 235, 96, 30);
		contentPane.add(lblDistanciaGp);
		
		textFieldDistanciaGp = new JTextField();
		textFieldDistanciaGp.setEditable(false);
		textFieldDistanciaGp.setColumns(10);
		textFieldDistanciaGp.setBackground(SystemColor.menu);
		textFieldDistanciaGp.setBounds(680, 241, 185, 20);
		contentPane.add(textFieldDistanciaGp);
		
		JLabel lblVueltas = new JLabel("Vueltas:");
		lblVueltas.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblVueltas.setBounds(587, 317, 65, 30);
		contentPane.add(lblVueltas);
		
		textFieldVueltas = new JTextField();
		textFieldVueltas.setEditable(false);
		textFieldVueltas.setColumns(10);
		textFieldVueltas.setBackground(SystemColor.menu);
		textFieldVueltas.setBounds(680, 323, 185, 20);
		contentPane.add(textFieldVueltas);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.png"));
		lblNewLabel.setBounds(0, 63, 995, 548);
		contentPane.add(lblNewLabel);
		
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
	}

	public JButton getBtnSimular() {
		return btnSimular;
	}

	public void setBtnSimular(JButton btnSimular) {
		this.btnSimular = btnSimular;
	}
}
