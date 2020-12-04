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
	private JTextField txtNombre;
	private JTextField txtNacionalidad;
	private JTextField txtNacimiento;
	private JTextField txtPalmares;
	private JTextField txtEscuderia;

	private  JButton btnInicio,btnEscuderias,btnPilotos,btnGranPre,btnClasi,btnLogin;
	private JTextField textEstado;
	private JTextField textPodios;
	private JLabel lblBiblo;
	private String ruta;
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 72, 974, 539);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel Ficha = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(27, 95, 288, 320);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"FichasPilotos"+File.separator+"Hamilton.PNG"));
		lblNewLabel_3.setBounds(10, 11, 268, 298);
		panel.add(lblNewLabel_3);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(443, 125, 175, 20);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEnabled(false);
		txtNombre.setBackground(Color.WHITE);
		txtNombre.setEditable(false);
		txtNombre.setBounds(628, 127, 250, 20);
		txtNombre.setBorder(null);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:");
		lblNacionalidad.setForeground(Color.WHITE);
		lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNacionalidad.setBounds(443, 158, 175, 20);
		contentPane.add(lblNacionalidad);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setBackground(Color.WHITE);
		txtNacionalidad.setEditable(false);
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBorder(null);
		txtNacionalidad.setBounds(628, 160, 250, 20);
		contentPane.add(txtNacionalidad);
		
		JLabel lblNacimiento = new JLabel("Fecha de nacimiento:");
		lblNacimiento.setForeground(Color.WHITE);
		lblNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNacimiento.setBounds(443, 189, 175, 20);
		contentPane.add(lblNacimiento);
		
		txtNacimiento = new JTextField();
		txtNacimiento.setBackground(Color.WHITE);
		txtNacimiento.setEditable(false);
		txtNacimiento.setColumns(10);
		txtNacimiento.setBorder(null);
		txtNacimiento.setBounds(628, 189, 250, 20);
		contentPane.add(txtNacimiento);
		
		JLabel lblPalmares = new JLabel("Palmares:");
		lblPalmares.setForeground(Color.WHITE);
		lblPalmares.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPalmares.setBounds(443, 222, 175, 20);
		contentPane.add(lblPalmares);
		
		txtPalmares = new JTextField();
		txtPalmares.setBackground(Color.WHITE);
		txtPalmares.setEditable(false);
		txtPalmares.setColumns(10);
		txtPalmares.setBorder(null);
		txtPalmares.setBounds(628, 224, 250, 20);
		contentPane.add(txtPalmares);
		
		JLabel lblEscuderia = new JLabel("Escuderia:");
		lblEscuderia.setForeground(Color.WHITE);
		lblEscuderia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEscuderia.setBounds(443, 315, 175, 20);
		contentPane.add(lblEscuderia);
		
		txtEscuderia = new JTextField();
		txtEscuderia.setBackground(Color.WHITE);
		txtEscuderia.setEditable(false);
		txtEscuderia.setColumns(10);
		txtEscuderia.setBorder(null);
		txtEscuderia.setBounds(628, 317, 250, 20);
		contentPane.add(txtEscuderia);
		
		JLabel lblESTADO = new JLabel("Estado:");
		lblESTADO.setForeground(Color.WHITE);
		lblESTADO.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblESTADO.setBounds(443, 253, 175, 20);
		contentPane.add(lblESTADO);
		
		textEstado = new JTextField();
		textEstado.setEditable(false);
		textEstado.setColumns(10);
		textEstado.setBorder(null);
		textEstado.setBackground(Color.WHITE);
		textEstado.setBounds(628, 255, 250, 20);
		contentPane.add(textEstado);
		
		JLabel lblPodios = new JLabel("Podios:");
		lblPodios.setForeground(Color.WHITE);
		lblPodios.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPodios.setBounds(443, 284, 175, 20);
		contentPane.add(lblPodios);
		
		textPodios = new JTextField();
		textPodios.setEditable(false);
		textPodios.setColumns(10);
		textPodios.setBorder(null);
		textPodios.setBackground(Color.WHITE);
		textPodios.setBounds(628, 286, 250, 20);
		contentPane.add(textPodios);
		
		lblBiblo = new JLabel("Bibliografia");
		lblBiblo.setForeground(Color.WHITE);
		lblBiblo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBiblo.setBounds(27, 450, 209, 40);
		contentPane.add(lblBiblo);
		
		JTextPane txtBiblio = new JTextPane();
		txtBiblio.setEnabled(false);
		txtBiblio.setToolTipText("");
		txtBiblio.setEditable(false);
		txtBiblio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtBiblio.setBounds(27, 501, 771, 87);
		
		contentPane.add(txtBiblio);
		
		JLabel lblFondo = new JLabel();
		lblFondo.setBounds(0, 72, 974, 539);
		contentPane.add(lblFondo);
		lblFondo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.PNG"));
	}

}
