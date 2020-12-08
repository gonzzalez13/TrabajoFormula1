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
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.SwingConstants;

public class PruebaInicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaInicio frame = new PruebaInicio();
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
	public PruebaInicio() {
		
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
		
		JPanel panelInicio = new JPanel();
		panelInicio.setBounds(0, 72, 974, 539);
		contentPane.add(panelInicio);
		panelInicio.setLayout(null);
		
		JPanel panelNoticia1 = new JPanel();
		panelNoticia1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelNoticia1.setBounds(27, 11, 328, 285);
		panelInicio.add(panelNoticia1);
		panelNoticia1.setLayout(null);
		
		JTextArea txtrNoticia1 = new JTextArea();
		txtrNoticia1.setEditable(false);
		txtrNoticia1.setFont(new Font("Consolas", Font.BOLD, 15));
		txtrNoticia1.setOpaque(false);
		txtrNoticia1.setLineWrap(true);
		txtrNoticia1.setWrapStyleWord(true);
		txtrNoticia1.setText("Bottas: \"Los que no saben de F1 podr\u00EDan pensar que he quedado como un completo idiota\"");
		txtrNoticia1.setBounds(31, 175, 270, 61);
		panelNoticia1.add(txtrNoticia1);
		
		JLabel lblNoticia1 = new JLabel("");
		lblNoticia1.setIcon(new ImageIcon(PruebaInicio.class.getResource("/Imagenes/Noticias/Noticia.jpg")));
		lblNoticia1.setBounds(31, 21, 270, 144);
		panelNoticia1.add(lblNoticia1);
		
		JButton btnLeerMas1 = new JButton("Leer m\u00E1s");
		btnLeerMas1.setBorder(new CompoundBorder());
		btnLeerMas1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLeerMas1.setBounds(223, 246, 95, 29);
		panelNoticia1.add(btnLeerMas1);
		
		JPanel panelNoticia2 = new JPanel();
		panelNoticia2.setLayout(null);
		panelNoticia2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelNoticia2.setBounds(370, 11, 319, 285);
		panelInicio.add(panelNoticia2);
		
		JTextArea txtrNoticia2 = new JTextArea();
		txtrNoticia2.setEditable(false);
		txtrNoticia2.setWrapStyleWord(true);
		txtrNoticia2.setText("McLaren reafirma su estrategia");
		txtrNoticia2.setOpaque(false);
		txtrNoticia2.setFont(new Font("Consolas", Font.BOLD, 17));
		txtrNoticia2.setBounds(16, 188, 293, 25);
		panelNoticia2.add(txtrNoticia2);
		
		JLabel lblNoticia2 = new JLabel("");
		lblNoticia2.setIcon(new ImageIcon(PruebaInicio.class.getResource("/Imagenes/Noticias/Noticia2.jpg")));
		lblNoticia2.setBounds(27, 26, 270, 152);
		panelNoticia2.add(lblNoticia2);
		
		JButton btnLeerMas2 = new JButton("Leer m\u00E1s");
		btnLeerMas2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLeerMas2.setBorder(new CompoundBorder());
		btnLeerMas2.setBounds(213, 238, 96, 32);
		panelNoticia2.add(btnLeerMas2);
		
		JPanel panel = new JPanel();
		panel.setBounds(699, 11, 265, 332);
		panelInicio.add(panel);
		panel.setLayout(null);
		
		JLabel lblGP = new JLabel("");
		lblGP.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Grandes Premios"+File.separator+"Portada"+File.separator+"Abudhabi.png"));
		lblGP.setBounds(10, 11, 245, 180);
		panel.add(lblGP);
		
		JPanel pC3 = new JPanel();
		pC3.setBackground(new Color(255, 159, 0));
		pC3.setBounds(10, 202, 15, 17);
		panel.add(pC3);
		
		JLabel lblTitulo = new JLabel("PR\u00D3XIMO GP DE F\u00D3RMULA 1");
		lblTitulo.setBounds(35, 202, 220, 17);
		panel.add(lblTitulo);
		
		JLabel lblNewLabel_2 = new JLabel("GP DE ABU DHABI");
		lblNewLabel_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 245, 245, 103);
		panel.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 311, 245, 10);
		panel.add(separator);
		
		JLabel lblFecha = new JLabel("13 DE DICIEMBRE");
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		lblFecha.setBounds(57, 230, 116, 14);
		panel.add(lblFecha);
		
		JPanel panelNoticia3 = new JPanel();
		panelNoticia3.setLayout(null);
		panelNoticia3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelNoticia3.setBounds(27, 305, 662, 224);
		panelInicio.add(panelNoticia3);
		
		JTextArea txtrNoticia3 = new JTextArea();
		txtrNoticia3.setWrapStyleWord(true);
		txtrNoticia3.setText("Mercedes se llena de dudas con Bottas y salpican a Hamilton");
		txtrNoticia3.setOpaque(false);
		txtrNoticia3.setLineWrap(true);
		txtrNoticia3.setFont(new Font("Consolas", Font.BOLD, 19));
		txtrNoticia3.setEditable(false);
		txtrNoticia3.setBounds(287, 23, 350, 52);
		panelNoticia3.add(txtrNoticia3);
		
		JLabel lblNoticia3 = new JLabel("");
		lblNoticia3.setIcon(new ImageIcon(PruebaInicio.class.getResource("/Imagenes/Noticias/Noticia3.jpg")));
		lblNoticia3.setBounds(21, 47, 241, 136);
		panelNoticia3.add(lblNoticia3);
		
		JTextArea txtNoticia3 = new JTextArea();
		txtNoticia3.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtNoticia3.setOpaque(false);
		txtNoticia3.setWrapStyleWord(true);
		txtNoticia3.setLineWrap(true);
		txtNoticia3.setText("El a\u00F1o de los r\u00E9cords termina repleto de dudas en el garaje de Mercedes, y eso que una concatenaci\u00F3n de errores dej\u00F3 sin victoria a Russell con el coche de Hamilton. ");
		txtNoticia3.setBounds(287, 81, 350, 102);
		panelNoticia3.add(txtNoticia3);
		
		JButton btnLeerMas3 = new JButton("Leer m\u00E1s");
		btnLeerMas3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLeerMas3.setBorder(new CompoundBorder());
		btnLeerMas3.setBounds(556, 182, 96, 32);
		panelNoticia3.add(btnLeerMas3);
	}
}
