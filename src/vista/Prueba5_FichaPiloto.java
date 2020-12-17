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
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class Prueba5_FichaPiloto extends JFrame {

	protected JButton btnInicio, btnEscuderias, btnPilotos, btnGranPre, btnClasi, btnLogin, btnLogo;
	protected JPanel menu, contentPane;
	private JTextField txtNombre, txtNacionalidad, txtNacimiento, txtPalmares, txtEscuderia, txtEstado, txtPodios;
	private JTextPane txtBiblio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba5_FichaPiloto frame = new Prueba5_FichaPiloto();
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
	public Prueba5_FichaPiloto() {

this.setIconImage(Toolkit.getDefaultToolkit().getImage(Noticia2.class.getResource("/Imagenes/F1-logo-ventana.png")));
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 640);
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
		
		
		//Jpanel de Ficha Piloto
		
		
		JPanel panel_FichaPiloto = new JPanel();
		panel_FichaPiloto.setBounds(0, 72, 974, 539);
		contentPane.add(panel_FichaPiloto);
		panel_FichaPiloto.setLayout(null);

		JLabel lblFtoFicha = new JLabel("");
		lblFtoFicha.setIcon(new ImageIcon());
		lblFtoFicha.setBounds(27, 21, 268, 298);
		panel_FichaPiloto.add(lblFtoFicha);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(443, 53, 175, 20);
		panel_FichaPiloto.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBorder(null);
		txtNombre.setBackground(Color.WHITE);
		txtNombre.setBounds(628, 55, 250, 20);
		panel_FichaPiloto.add(txtNombre);

		JLabel lblNacionalidad = new JLabel("Nacionalidad:");
		lblNacionalidad.setForeground(Color.WHITE);
		lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNacionalidad.setBounds(443, 86, 175, 20);
		panel_FichaPiloto.add(lblNacionalidad);

		txtNacionalidad = new JTextField();
		txtNacionalidad.setEditable(false);
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBorder(null);
		txtNacionalidad.setBackground(Color.WHITE);
		txtNacionalidad.setBounds(628, 88, 250, 20);
		panel_FichaPiloto.add(txtNacionalidad);

		JLabel lblNacimiento = new JLabel("Fecha de nacimiento:");
		lblNacimiento.setForeground(Color.WHITE);
		lblNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNacimiento.setBounds(443, 117, 175, 20);
		panel_FichaPiloto.add(lblNacimiento);

		txtNacimiento = new JTextField();
		txtNacimiento.setEditable(false);
		txtNacimiento.setColumns(10);
		txtNacimiento.setBorder(null);
		txtNacimiento.setBackground(Color.WHITE);
		txtNacimiento.setBounds(628, 117, 250, 20);
		panel_FichaPiloto.add(txtNacimiento);

		JLabel lblPalmares = new JLabel("Palmares:");
		lblPalmares.setForeground(Color.WHITE);
		lblPalmares.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPalmares.setBounds(443, 150, 175, 20);
		panel_FichaPiloto.add(lblPalmares);

		txtPalmares = new JTextField();
		txtPalmares.setEditable(false);
		txtPalmares.setColumns(10);
		txtPalmares.setBorder(null);
		txtPalmares.setBackground(Color.WHITE);
		txtPalmares.setBounds(628, 152, 250, 20);
		panel_FichaPiloto.add(txtPalmares);

		JLabel lblEscuderia = new JLabel("Escuderia:");
		lblEscuderia.setForeground(Color.WHITE);
		lblEscuderia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEscuderia.setBounds(443, 243, 175, 20);
		panel_FichaPiloto.add(lblEscuderia);

		txtEscuderia = new JTextField();
		txtEscuderia.setEditable(false);
		txtEscuderia.setColumns(10);
		txtEscuderia.setBorder(null);
		txtEscuderia.setBackground(Color.WHITE);
		txtEscuderia.setBounds(628, 245, 250, 20);
		panel_FichaPiloto.add(txtEscuderia);

		JLabel lblESTADO = new JLabel("Estado:");
		lblESTADO.setForeground(Color.WHITE);
		lblESTADO.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblESTADO.setBounds(443, 181, 175, 20);
		panel_FichaPiloto.add(lblESTADO);

		txtEstado = new JTextField();
		txtEstado.setEditable(false);
		txtEstado.setColumns(10);
		txtEstado.setBorder(null);
		txtEstado.setBackground(Color.WHITE);
		txtEstado.setBounds(628, 183, 250, 20);
		panel_FichaPiloto.add(txtEstado);

		JLabel lblPodios = new JLabel("Podios:");
		lblPodios.setForeground(Color.WHITE);
		lblPodios.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPodios.setBounds(443, 212, 175, 20);
		panel_FichaPiloto.add(lblPodios);

		txtPodios = new JTextField();
		txtPodios.setEditable(false);
		txtPodios.setColumns(10);
		txtPodios.setBorder(null);
		txtPodios.setBackground(Color.WHITE);
		txtPodios.setBounds(628, 214, 250, 20);
		panel_FichaPiloto.add(txtPodios);

		JLabel lblBiblo = new JLabel("Bibliografia");
		lblBiblo.setForeground(Color.WHITE);
		lblBiblo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBiblo.setBounds(27, 378, 209, 40);
		panel_FichaPiloto.add(lblBiblo);

		txtBiblio = new JTextPane();
		txtBiblio.setToolTipText("");
		txtBiblio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtBiblio.setEditable(false);
		txtBiblio.setBounds(27, 429, 771, 87);
		panel_FichaPiloto.add(txtBiblio);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Interfaces\\TrabajoFormula1\\src\\Imagenes\\Lmercedes - copia.png"));

	//	btnNewButton.addActionListener(controlador);
		btnNewButton.setBounds(850, 429, 110, 87);
		panel_FichaPiloto.add(btnNewButton);

		JLabel lblFondo = new JLabel();
		lblFondo.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "Fondos" + File.separator + "Fondo6.PNG"));
		lblFondo.setBounds(0, 0, 974, 539);
		panel_FichaPiloto.add(lblFondo);
	}
}
