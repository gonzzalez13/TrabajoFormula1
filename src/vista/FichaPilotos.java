package vista;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class FichaPilotos extends JFrame {
	private JPanel contentPane;

	private  JButton btnInicio,btnEscuderias,btnPilotos,btnGranPre,btnClasi,btnLogin;
	private String ruta;
	private JTextField txtNombre;
	private JTextField txtNacionalidad;
	private JTextField txtFecha;
	private JTextField txtPalmarres;
	private JTextField txtEscuderia;
	private JTextField txtEstado;
	private JTextField txtPodios;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FichaPilotos frame = new FichaPilotos();
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
	public FichaPilotos() {
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
		
		JPanel panel_FichaPiloto = new JPanel();
		panel_FichaPiloto.setBounds(0, 72, 974, 539);
		contentPane.add(panel_FichaPiloto);
		panel_FichaPiloto.setLayout(null);
		
		JLabel lblFtoFicha = new JLabel("");
		lblFtoFicha.setIcon(new ImageIcon("E:\\Users\\Usuaio\\Interfaces\\TrabajoFormula1\\src\\Imagenes\\FichasPilotos\\albon.PNG"));
		lblFtoFicha.setBounds(27, 21, 268, 298);
		panel_FichaPiloto.add(lblFtoFicha);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(443, 53, 175, 20);
		panel_FichaPiloto.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEnabled(false);
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
		
		txtFecha = new JTextField();
		txtFecha.setEditable(false);
		txtFecha.setColumns(10);
		txtFecha.setBorder(null);
		txtFecha.setBackground(Color.WHITE);
		txtFecha.setBounds(628, 117, 250, 20);
		panel_FichaPiloto.add(txtFecha);
		
		JLabel lblPalmares = new JLabel("Palmares:");
		lblPalmares.setForeground(Color.WHITE);
		lblPalmares.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPalmares.setBounds(443, 150, 175, 20);
		panel_FichaPiloto.add(lblPalmares);
		
		txtPalmarres = new JTextField();
		txtPalmarres.setEditable(false);
		txtPalmarres.setColumns(10);
		txtPalmarres.setBorder(null);
		txtPalmarres.setBackground(Color.WHITE);
		txtPalmarres.setBounds(628, 152, 250, 20);
		panel_FichaPiloto.add(txtPalmarres);
		
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
		
		JTextPane txtBiblio = new JTextPane();
		txtBiblio.setToolTipText("");
		txtBiblio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtBiblio.setEnabled(false);
		txtBiblio.setEditable(false);
		txtBiblio.setBounds(27, 429, 771, 87);
		panel_FichaPiloto.add(txtBiblio);
		
		JLabel lblFondo = new JLabel();
		lblFondo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.PNG"));
		lblFondo.setBounds(0, 0, 974, 539);
		panel_FichaPiloto.add(lblFondo);
		
		
	}
}
