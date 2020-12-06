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
			
			JPanel panel_FichaEscuderia = new JPanel();
			panel_FichaEscuderia.setBounds(0, 70, 974, 541);
			contentPane.add(panel_FichaEscuderia);
			panel_FichaEscuderia.setLayout(null);
			
			JLabel lblMarca = new JLabel("");
			lblMarca.setBounds(53, 17, 300, 191);
			panel_FichaEscuderia.add(lblMarca);
			
			JLabel lblNombre = new JLabel("Nombre completo");
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNombre.setForeground(Color.WHITE);
			lblNombre.setBounds(10, 213, 176, 26);
			panel_FichaEscuderia.add(lblNombre);
			
			textNombre = new JTextField();
			textNombre.setEnabled(false);
			textNombre.setEditable(false);
			textNombre.setBounds(205, 219, 200, 20);
			panel_FichaEscuderia.add(textNombre);
			textNombre.setColumns(10);
			
			JLabel lblNacionalidad = new JLabel("Nacionalidad");
			lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNacionalidad.setForeground(Color.WHITE);
			lblNacionalidad.setBounds(10, 250, 176, 26);
			panel_FichaEscuderia.add(lblNacionalidad);
			
			textNacionalidad = new JTextField();
			textNacionalidad.setEditable(false);
			textNacionalidad.setEnabled(false);
			textNacionalidad.setColumns(10);
			textNacionalidad.setBounds(205, 256, 200, 20);
			panel_FichaEscuderia.add(textNacionalidad);
			
			JLabel lblBase = new JLabel("Base ");
			lblBase.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblBase.setForeground(Color.WHITE);
			lblBase.setBounds(10, 287, 176, 26);
			panel_FichaEscuderia.add(lblBase);
			
			textBase = new JTextField();
			textBase.setEditable(false);
			textBase.setEnabled(false);
			textBase.setColumns(10);
			textBase.setBounds(205, 293, 200, 20);
			panel_FichaEscuderia.add(textBase);
			
			JLabel lblAño = new JLabel("Primer A\u00F1o de competici\u00F3n");
			lblAño.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblAño.setForeground(Color.WHITE);
			lblAño.setBounds(10, 324, 176, 26);
			panel_FichaEscuderia.add(lblAño);
			
			textAño = new JTextField();
			textAño.setEditable(false);
			textAño.setEnabled(false);
			textAño.setColumns(10);
			textAño.setBounds(205, 327, 200, 20);
			panel_FichaEscuderia.add(textAño);
			
			JLabel lblPremios = new JLabel("Premios");
			lblPremios.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblPremios.setForeground(Color.WHITE);
			lblPremios.setBounds(10, 361, 176, 26);
			panel_FichaEscuderia.add(lblPremios);
			
			textPremios = new JTextField();
			textPremios.setEditable(false);
			textPremios.setEnabled(false);
			textPremios.setColumns(10);
			textPremios.setBounds(205, 367, 200, 20);
			panel_FichaEscuderia.add(textPremios);
			
			JLabel lblJefeE = new JLabel("Jefe de Equipo");
			lblJefeE.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblJefeE.setForeground(Color.WHITE);
			lblJefeE.setBounds(10, 398, 176, 26);
			panel_FichaEscuderia.add(lblJefeE);
			
			textJefeE = new JTextField();
			textJefeE.setEditable(false);
			textJefeE.setEnabled(false);
			textJefeE.setColumns(10);
			textJefeE.setBounds(205, 404, 200, 20);
			panel_FichaEscuderia.add(textJefeE);
			
			JLabel lblJefeT = new JLabel("Jefe T\u00E9cnico");
			lblJefeT.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblJefeT.setForeground(Color.WHITE);
			lblJefeT.setBounds(10, 435, 176, 26);
			panel_FichaEscuderia.add(lblJefeT);
			
			textJefeT = new JTextField();
			textJefeT.setEditable(false);
			textJefeT.setEnabled(false);
			textJefeT.setColumns(10);
			textJefeT.setBounds(205, 441, 200, 20);
			panel_FichaEscuderia.add(textJefeT);
			
			btnPiloto1 = new JButton("");
			btnPiloto1.setBounds(440, 40, 232, 232);
			panel_FichaEscuderia.add(btnPiloto1);
			
			textField = new JTextField();
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(440, 283, 232, 30);
			panel_FichaEscuderia.add(textField);
			textField.setColumns(10);
			
			btnPiloto2 = new JButton("");
			btnPiloto2.setBounds(710, 40, 232, 232);
			panel_FichaEscuderia.add(btnPiloto2);
			
			textField_1 = new JTextField();
			textField_1.setHorizontalAlignment(SwingConstants.CENTER);
			textField_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
			textField_1.setEnabled(false);
			textField_1.setEditable(false);
			textField_1.setColumns(10);
			textField_1.setBounds(710, 283, 232, 30);
			panel_FichaEscuderia.add(textField_1);
			
			JLabel lblFondo = new JLabel();
			lblFondo.setBounds(0, 0, 974, 539);
			panel_FichaEscuderia.add(lblFondo);
			lblFondo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.PNG"));
		
		
		
	}

	
	
	
	
	
}
