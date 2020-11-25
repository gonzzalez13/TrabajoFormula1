package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
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
		setBounds(100, 100, 865, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(27, 95, 288, 320);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("src/Imagenes/piloto.png"));
		lblNewLabel_2_1.setBounds(39, 11, 206, 206);
		panel.add(lblNewLabel_2_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 236, 268, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 307, 268, 2);
		panel.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src/Imagenes/Logo.png"));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 17));
		lblNewLabel.setBounds(205, 236, 73, 73);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("src/Imagenes/Casco.png"));
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 236, 100, 73);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("src/Imagenes/maxresdefault.jpg"));
		lblNewLabel_3.setBounds(10, 11, 268, 206);
		panel.add(lblNewLabel_3);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(484, 125, 60, 20);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBackground(Color.WHITE);
		txtNombre.setEditable(false);
		txtNombre.setBounds(628, 127, 170, 20);
		txtNombre.setBorder(null);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:");
		lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNacionalidad.setBounds(484, 158, 90, 20);
		contentPane.add(lblNacionalidad);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setBackground(Color.WHITE);
		txtNacionalidad.setEditable(false);
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBorder(null);
		txtNacionalidad.setBounds(628, 160, 170, 20);
		contentPane.add(txtNacionalidad);
		
		JLabel lblNacimiento = new JLabel("Fecha de nacimiento");
		lblNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNacimiento.setBounds(484, 189, 134, 20);
		contentPane.add(lblNacimiento);
		
		txtNacimiento = new JTextField();
		txtNacimiento.setBackground(Color.WHITE);
		txtNacimiento.setEditable(false);
		txtNacimiento.setColumns(10);
		txtNacimiento.setBorder(null);
		txtNacimiento.setBounds(628, 189, 170, 20);
		contentPane.add(txtNacimiento);
		
		JLabel lblPalmares = new JLabel("Palmares:");
		lblPalmares.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPalmares.setBounds(484, 222, 90, 20);
		contentPane.add(lblPalmares);
		
		txtPalmares = new JTextField();
		txtPalmares.setBackground(Color.WHITE);
		txtPalmares.setEditable(false);
		txtPalmares.setColumns(10);
		txtPalmares.setBorder(null);
		txtPalmares.setBounds(628, 224, 170, 20);
		contentPane.add(txtPalmares);
		
		JLabel lblEscuderia = new JLabel("Escuderia:");
		lblEscuderia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEscuderia.setBounds(484, 315, 90, 20);
		contentPane.add(lblEscuderia);
		
		txtEscuderia = new JTextField();
		txtEscuderia.setBackground(Color.WHITE);
		txtEscuderia.setEditable(false);
		txtEscuderia.setColumns(10);
		txtEscuderia.setBorder(null);
		txtEscuderia.setBounds(628, 317, 170, 20);
		contentPane.add(txtEscuderia);
		
		JLabel lblESTADO = new JLabel("Estado");
		lblESTADO.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblESTADO.setBounds(484, 253, 90, 20);
		contentPane.add(lblESTADO);
		
		textEstado = new JTextField();
		textEstado.setEditable(false);
		textEstado.setColumns(10);
		textEstado.setBorder(null);
		textEstado.setBackground(Color.WHITE);
		textEstado.setBounds(628, 255, 170, 20);
		contentPane.add(textEstado);
		
		JLabel lblPodios = new JLabel("Podios");
		lblPodios.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPodios.setBounds(484, 284, 90, 20);
		contentPane.add(lblPodios);
		
		textPodios = new JTextField();
		textPodios.setEditable(false);
		textPodios.setColumns(10);
		textPodios.setBorder(null);
		textPodios.setBackground(Color.WHITE);
		textPodios.setBounds(628, 286, 170, 20);
		contentPane.add(textPodios);
		
		JPanel PanelMenu = new JPanel();
		PanelMenu.setLayout(null);
		PanelMenu.setBackground(Color.LIGHT_GRAY);
		PanelMenu.setBounds(0, 0, 849, 71);
		contentPane.add(PanelMenu);
		
		btnInicio = new JButton("Inicio");
		btnInicio.setForeground(Color.RED);
		btnInicio.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnInicio.setBackground(Color.DARK_GRAY);
		btnInicio.setBounds(144, 11, 74, 48);
		PanelMenu.add(btnInicio);
		
		btnEscuderias = new JButton("Escuderias");
		btnEscuderias.setForeground(Color.RED);
		btnEscuderias.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnEscuderias.setBackground(Color.DARK_GRAY);
		btnEscuderias.setBounds(226, 11, 112, 48);
		PanelMenu.add(btnEscuderias);
		
		btnPilotos = new JButton("Pilotos");
		btnPilotos.setForeground(Color.RED);
		btnPilotos.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnPilotos.setBackground(Color.DARK_GRAY);
		btnPilotos.setBounds(348, 11, 94, 48);
		PanelMenu.add(btnPilotos);
		
		btnGranPre = new JButton("Gran Premio");
		btnGranPre.setForeground(Color.RED);
		btnGranPre.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGranPre.setBackground(Color.DARK_GRAY);
		btnGranPre.setBounds(452, 11, 130, 48);
		PanelMenu.add(btnGranPre);
		
		btnClasi = new JButton("Clasificaciones");
		btnClasi.setForeground(Color.RED);
		btnClasi.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnClasi.setBackground(Color.DARK_GRAY);
		btnClasi.setBounds(592, 11, 145, 48);
		PanelMenu.add(btnClasi);
		
		btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.RED);
		btnLogin.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setBounds(747, 11, 92, 48);
		PanelMenu.add(btnLogin);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Interfaces\\TrabajoFormula1\\src\\Imagenes\\F1-logo.png"));
		lblNewLabel_2.setBounds(10, 11, 130, 48);
		PanelMenu.add(lblNewLabel_2);
		
		lblBiblo = new JLabel("Bibliografia");
		lblBiblo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBiblo.setBounds(27, 462, 209, 40);
		contentPane.add(lblBiblo);
		
		JTextPane txtBiblio = new JTextPane();
		txtBiblio.setBounds(27, 513, 591, 87);
		contentPane.add(txtBiblio);
	}

	public JButton getBtnInicio() {
		return btnInicio;
	}

	public void setBtnInicio(JButton btnInicio) {
		this.btnInicio = btnInicio;
	}

	public JButton getBtnEscuderias() {
		return btnEscuderias;
	}

	public void setBtnEscuderias(JButton btnEscuderias) {
		this.btnEscuderias = btnEscuderias;
	}

	public JButton getBtnPilotos() {
		return btnPilotos;
	}

	public void setBtnPilotos(JButton btnPilotos) {
		this.btnPilotos = btnPilotos;
	}

	public JButton getBtnGranPre() {
		return btnGranPre;
	}

	public void setBtnGranPre(JButton btnGranPre) {
		this.btnGranPre = btnGranPre;
	}

	public JButton getBtnClasi() {
		return btnClasi;
	}

	public void setBtnClasi(JButton btnClasi) {
		this.btnClasi = btnClasi;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}

	public JButton getBtnLogo() {
		return btnLogo;
	}

	public void setBtnLogo(JButton btnLogo) {
		this.btnLogo = btnLogo;
	}
}
