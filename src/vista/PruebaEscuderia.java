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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Cpu\\Downloads\\Prueba.png"));
		btnNewButton.setBounds(0, 0, 270, 121);
		panel_1.add(btnNewButton);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(10, 143, 270, 121);
		panel.add(panel_1_1);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Cpu\\git\\TrabajoFormula1\\src\\Imagenes\\coches\\RedBull.png"));
		btnNewButton_1.setBounds(0, 0, 270, 121);
		panel_1_1.add(btnNewButton_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBounds(10, 275, 270, 121);
		panel.add(panel_1_2);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Cpu\\git\\TrabajoFormula1\\src\\Imagenes\\coches\\Mclaren.png"));
		btnNewButton_2.setBounds(0, 0, 270, 121);
		panel_1_2.add(btnNewButton_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBackground(Color.WHITE);
		panel_1_3.setBounds(10, 418, 270, 121);
		panel.add(panel_1_3);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Cpu\\git\\TrabajoFormula1\\src\\Imagenes\\coches\\RacingPoint.png"));
		btnNewButton_3.setBounds(0, 0, 270, 121);
		panel_1_3.add(btnNewButton_3);
		
		JLabel lblFondo = new JLabel();
		lblFondo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.PNG"));
		
		lblFondo.setBounds(0, 11, 974, 539);
		panel.add(lblFondo);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBackground(Color.WHITE);
		panel_1_4.setBounds(374, 11, 270, 121);
		panel.add(panel_1_4);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Cpu\\git\\TrabajoFormula1\\src\\Imagenes\\coches\\Renault.png"));
		btnNewButton_4.setBounds(0, 0, 270, 121);
		panel_1_4.add(btnNewButton_4);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setLayout(null);
		panel_1_5.setBackground(Color.WHITE);
		panel_1_5.setBounds(374, 143, 270, 121);
		panel.add(panel_1_5);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\Cpu\\git\\TrabajoFormula1\\src\\Imagenes\\coches\\ferrari.png"));
		btnNewButton_5.setBounds(0, 0, 270, 121);
		panel_1_5.add(btnNewButton_5);
		
		JPanel panel_1_6 = new JPanel();
		panel_1_6.setLayout(null);
		panel_1_6.setBackground(Color.WHITE);
		panel_1_6.setBounds(374, 275, 270, 121);
		panel.add(panel_1_6);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\Cpu\\git\\TrabajoFormula1\\src\\Imagenes\\coches\\AlphaTauri.png"));
		btnNewButton_6.setBounds(0, 0, 270, 121);
		panel_1_6.add(btnNewButton_6);
		
		JPanel panel_1_7 = new JPanel();
		panel_1_7.setLayout(null);
		panel_1_7.setBackground(Color.WHITE);
		panel_1_7.setBounds(374, 418, 270, 121);
		panel.add(panel_1_7);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setIcon(new ImageIcon("C:\\Users\\Cpu\\git\\TrabajoFormula1\\src\\Imagenes\\coches\\Alfa Romeo.PNG"));
		btnNewButton_7.setBounds(0, 0, 270, 121);
		panel_1_7.add(btnNewButton_7);
		
		JPanel panel_1_4_1 = new JPanel();
		panel_1_4_1.setLayout(null);
		panel_1_4_1.setBackground(Color.WHITE);
		panel_1_4_1.setBounds(682, 11, 270, 121);
		panel.add(panel_1_4_1);
		
		JButton btnNewButton_4_1 = new JButton("New button");
		btnNewButton_4_1.setIcon(new ImageIcon("C:\\Users\\Cpu\\git\\TrabajoFormula1\\src\\Imagenes\\coches\\haas.png"));
		btnNewButton_4_1.setBounds(0, 0, 270, 121);
		panel_1_4_1.add(btnNewButton_4_1);
		
		JPanel panel_1_4_1_1 = new JPanel();
		panel_1_4_1_1.setLayout(null);
		panel_1_4_1_1.setBackground(Color.WHITE);
		panel_1_4_1_1.setBounds(682, 143, 270, 121);
		panel.add(panel_1_4_1_1);
		
		JButton btnNewButton_4_1_1 = new JButton("New button");
		btnNewButton_4_1_1.setIcon(new ImageIcon("C:\\Users\\Cpu\\git\\TrabajoFormula1\\src\\Imagenes\\coches\\Williams.png"));
		btnNewButton_4_1_1.setBounds(0, 0, 270, 121);
		panel_1_4_1_1.add(btnNewButton_4_1_1);
	}
}
