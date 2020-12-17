package vista;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prueba1_Inicio extends JFrame {
	protected JButton btnInicio, btnEscuderias, btnPilotos, btnGranPre, btnClasi, btnLogin, btnLogo;
	protected JPanel menu, contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba1_Inicio frame = new Prueba1_Inicio();
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
	public Prueba1_Inicio() {	
		
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(Noticia2.class.getResource("/Imagenes/F1-logo-ventana.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);

		menu = new JPanel();
		menu.setLayout(null);
		menu.setBackground(new Color(178, 29, 28));
		menu.setBounds(0, 0, 974, 72);
		contentPane.add(menu);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "F1-logo.png"));
		lblLogo.setBounds(10, 11, 133, 48);
		menu.add(lblLogo);

		JButton btnInicio = new JButton("Inicio");
		btnInicio.setForeground(new Color(255, 255, 255));
		btnInicio.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnInicio.setBackground(new Color(59, 45, 45));
		btnInicio.setBounds(144, 11, 74, 48);
		menu.add(btnInicio);

		JButton btnEscuderias = new JButton("Escuderias");
		btnEscuderias.setForeground(new Color(255, 255, 255));
		btnEscuderias.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnEscuderias.setBackground(new Color(59, 45, 45));
		btnEscuderias.setBounds(226, 11, 112, 48);
		menu.add(btnEscuderias);

		JButton btnPilotos = new JButton("Pilotos");
		btnPilotos.setForeground(new Color(255, 255, 255));
		btnPilotos.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnPilotos.setBackground(new Color(59, 45, 45));
		btnPilotos.setBounds(348, 11, 94, 48);
		menu.add(btnPilotos);

		JButton btnGranPre = new JButton("Gran Premio");
		btnGranPre.setForeground(new Color(255, 255, 255));
		btnGranPre.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGranPre.setBackground(new Color(59, 45, 45));
		btnGranPre.setBounds(452, 11, 130, 48);
		menu.add(btnGranPre);

		JButton btnClasi = new JButton("Clasificacion");
		btnClasi.setForeground(new Color(255, 255, 255));
		btnClasi.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnClasi.setBackground(new Color(59, 45, 45));
		btnClasi.setBounds(592, 11, 145, 48);
		menu.add(btnClasi);

		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogin.setBackground(new Color(59, 45, 45));
		btnLogin.setBounds(872, 11, 92, 48);
		menu.add(btnLogin);

		JButton btnSimulacion = new JButton("Simulacion");
		btnSimulacion.setForeground(new Color(255, 255, 255));
		btnSimulacion.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSimulacion.setBackground(new Color(59, 45, 45));
		btnSimulacion.setBounds(747, 11, 115, 48);
		menu.add(btnSimulacion);
		
		//Jpanel de Inicio

		JPanel panelInicio = new JPanel();
		panelInicio.setBounds(0, 72, 974, 549);
		contentPane.add(panelInicio);
		panelInicio.setLayout(null);

		JPanel panelNoticia1 = new JPanel();
		panelNoticia1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelNoticia1.setBounds(10, 11, 662, 517);
		panelInicio.add(panelNoticia1);
		panelNoticia1.setLayout(null);
		
		JTextPane txtTituloNoticia = new JTextPane();
		txtTituloNoticia.setEditable(false);
		txtTituloNoticia.setFont(new Font("Bauhaus 93", Font.PLAIN, 25));
		txtTituloNoticia.setText("Bottas: Los que no saben de F1 podr\u00EDan pensar que he quedado como un completo idiota");
		txtTituloNoticia.setOpaque(false);
		txtTituloNoticia.setBounds(10, 11, 642, 160);
		panelNoticia1.add(txtTituloNoticia);
		
		JTextArea txtCuerpoNoticia = new JTextArea();
		txtCuerpoNoticia.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		txtCuerpoNoticia.setWrapStyleWord(true);
		txtCuerpoNoticia.setLineWrap(true);
		txtCuerpoNoticia.setText("Valtteri Bottas sab\u00EDa que iba a tener mucha presi\u00F3n en el Gran Premio de Sakhir. Desde el mismo momento que se hizo oficial que Lewis Hamilton hab\u00EDa positivo por coronavirus, el finland\u00E9s era consciente de que se jugaba mucho en el trazado alternativo del Circuito Internacional de Bahr\u00E9in. Si Russell me supera, obviamente voy a quedar mal, admiti\u00F3. A la postre, ha quedado mal el finland\u00E9s... y Mercedes. El que ha salido reforzado es un George Russell, que ha demostrado madera de campe\u00F3n.");
		txtCuerpoNoticia.setOpaque(false);
		txtCuerpoNoticia.setEditable(false);
		txtCuerpoNoticia.setBounds(10, 223, 642, 283);
		panelNoticia1.add(txtCuerpoNoticia);

		JPanel panel = new JPanel();
		panel.setBounds(682, 11, 282, 332);
		panelInicio.add(panel);
		panel.setLayout(null);
		
		JButton btnPremio = new JButton("Yas Marinas");
		btnPremio.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Grandes Premios"+ File.separator + "Portada" + File.separator + "Abudhabi.png"));
		btnPremio.setBounds(10, 11, 262, 310);
		panel.add(btnPremio);
		
		JButton btnNoticias = new JButton("Insertar");
		btnNoticias.setBounds(781, 363, 89, 23);
		panelInicio.add(btnNoticias);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setBounds(682, 484, 110, 44);
		panelInicio.add(btnAnterior);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(854, 484, 110, 44);
		panelInicio.add(btnSiguiente);
		
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon(
						"src" + File.separator + "Imagenes" + File.separator + "Fondos" + File.separator + "Fondo6.PNG"));
				lblNewLabel.setBounds(0, 0, 974, 550);
				panelInicio.add(lblNewLabel);
	}
}
