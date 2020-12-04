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
import java.io.File;
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
	
	
	private  JButton btnInicio,btnEscuderias,btnPilotos,btnGranPre,btnClasi,btnLogin,btnLogo;
	private  JButton btnPiloto1,btnPiloto2;

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
			panel.setBounds(0, 70, 974, 541);
			contentPane.add(panel);
			panel.setLayout(null);
			
			JLabel lblMarca = new JLabel("");
			lblMarca.setIcon(new ImageIcon());
			lblMarca.setBounds(26, 40, 359, 125);
			panel.add(lblMarca);
			
			JLabel lblNombre = new JLabel("Nombre completo");
			lblNombre.setBounds(26, 176, 160, 26);
			panel.add(lblNombre);
			
			textNombre = new JTextField();
			textNombre.setEnabled(false);
			textNombre.setEditable(false);
			textNombre.setBounds(185, 179, 200, 20);
			panel.add(textNombre);
			textNombre.setColumns(10);
			
			JLabel lblNacionalidad = new JLabel("Nacionalidad");
			lblNacionalidad.setBounds(26, 213, 160, 26);
			panel.add(lblNacionalidad);
			
			textNacionalidad = new JTextField();
			textNacionalidad.setEditable(false);
			textNacionalidad.setEnabled(false);
			textNacionalidad.setColumns(10);
			textNacionalidad.setBounds(185, 216, 200, 20);
			panel.add(textNacionalidad);
			
			JLabel lblBase = new JLabel("Base ");
			lblBase.setBounds(26, 250, 160, 26);
			panel.add(lblBase);
			
			textBase = new JTextField();
			textBase.setEditable(false);
			textBase.setEnabled(false);
			textBase.setColumns(10);
			textBase.setBounds(185, 253, 200, 20);
			panel.add(textBase);
			
			JLabel lblAño = new JLabel("Primer A\u00F1o de competici\u00F3n");
			lblAño.setBounds(26, 287, 160, 26);
			panel.add(lblAño);
			
			textAño = new JTextField();
			textAño.setEditable(false);
			textAño.setEnabled(false);
			textAño.setColumns(10);
			textAño.setBounds(185, 287, 200, 20);
			panel.add(textAño);
			
			JLabel lblPremios = new JLabel("Premios");
			lblPremios.setBounds(26, 324, 160, 26);
			panel.add(lblPremios);
			
			textPremios = new JTextField();
			textPremios.setEditable(false);
			textPremios.setEnabled(false);
			textPremios.setColumns(10);
			textPremios.setBounds(185, 327, 200, 20);
			panel.add(textPremios);
			
			JLabel lblJefeE = new JLabel("Jefe de Equipo");
			lblJefeE.setBounds(26, 361, 160, 26);
			panel.add(lblJefeE);
			
			textJefeE = new JTextField();
			textJefeE.setEditable(false);
			textJefeE.setEnabled(false);
			textJefeE.setColumns(10);
			textJefeE.setBounds(185, 364, 200, 20);
			panel.add(textJefeE);
			
			JLabel lblJefeT = new JLabel("Jefe T\u00E9cnico");
			lblJefeT.setBounds(26, 398, 160, 26);
			panel.add(lblJefeT);
			
			textJefeT = new JTextField();
			textJefeT.setEditable(false);
			textJefeT.setEnabled(false);
			textJefeT.setColumns(10);
			textJefeT.setBounds(185, 401, 200, 20);
			panel.add(textJefeT);
			
			btnPiloto1 = new JButton("");
			btnPiloto1.setIcon(new ImageIcon());
			btnPiloto1.setBounds(440, 40, 232, 232);
			panel.add(btnPiloto1);
			
			textField = new JTextField();
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(440, 283, 232, 30);
			panel.add(textField);
			textField.setColumns(10);
			
			btnPiloto2 = new JButton("");
			btnPiloto2.setIcon(new ImageIcon());
			btnPiloto2.setBounds(710, 40, 232, 232);
			panel.add(btnPiloto2);
			
			textField_1 = new JTextField();
			textField_1.setHorizontalAlignment(SwingConstants.CENTER);
			textField_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
			textField_1.setEnabled(false);
			textField_1.setEditable(false);
			textField_1.setColumns(10);
			textField_1.setBounds(710, 283, 232, 30);
			panel.add(textField_1);
			
			JLabel lblFondo = new JLabel();
			lblFondo.setBounds(0, 72, 974, 539);
			contentPane.add(lblFondo);
			lblFondo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.PNG"));
		
		
		
	}

	
	
	
	
	
}
