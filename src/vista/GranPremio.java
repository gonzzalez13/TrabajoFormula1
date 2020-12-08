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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnSimular;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
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
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(572, 112, 65, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("");
		label.setBounds(545, 150, 46, 14);
		contentPane.add(label);
		
		JLabel lblNewLabel_2_1 = new JLabel("Longitud:");
		lblNewLabel_2_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(572, 194, 65, 30);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Curvas:");
		lblNewLabel_2_1_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(587, 276, 50, 30);
		contentPane.add(lblNewLabel_2_1_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(SystemColor.control);
		textField.setBounds(680, 118, 185, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.menu);
		textField_1.setBounds(680, 200, 185, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.menu);
		textField_2.setBounds(680, 282, 185, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Primer a\u00F1o:");
		lblNewLabel_2_1_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblNewLabel_2_1_2.setBounds(554, 153, 83, 30);
		contentPane.add(lblNewLabel_2_1_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(SystemColor.menu);
		textField_3.setBounds(680, 159, 185, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Distancia GP:");
		lblNewLabel_2_1_3.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblNewLabel_2_1_3.setBounds(541, 235, 96, 30);
		contentPane.add(lblNewLabel_2_1_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(SystemColor.menu);
		textField_4.setBounds(680, 241, 185, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Vueltas:");
		lblNewLabel_2_1_1_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1.setBounds(587, 317, 65, 30);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(SystemColor.menu);
		textField_5.setBounds(680, 323, 185, 20);
		contentPane.add(textField_5);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.png"));
		lblNewLabel.setBounds(0, 71, 974, 540);
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
