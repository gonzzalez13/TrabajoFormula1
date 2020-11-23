package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.sound.sampled.AudioInputStream;
import javax.swing.ImageIcon;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private  JButton btnInicio,btnEscuderias,btnPilotos,btnGranPre,btnClasi,btnLogin,btnLogo;
	

	/**
	 * Launch the application.
	 * @throws FileNotFoundException 
	 * @throws JavaLayerException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSlider slider = new JSlider();
		slider.setBounds(80, 364, 200, 26);
		contentPane.add(slider);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(24, 364, 46, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("imagen");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setBounds(24, 87, 277, 163);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Titulo");
		lblNewLabel_2.setBounds(24, 261, 244, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblDescripcion = new JLabel("descripcion");
		lblDescripcion.setBounds(25, 286, 253, 26);
		contentPane.add(lblDescripcion);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(545, 87, 200, 240);
		contentPane.add(lblNewLabel_3);
		
		JPanel PanelMenu = new JPanel();
		PanelMenu.setLayout(null);
		PanelMenu.setBackground(Color.LIGHT_GRAY);
		PanelMenu.setBounds(0, 0, 859, 71);
		contentPane.add(PanelMenu);
		
		JButton btnInicio_1 = new JButton("Inicio");
		btnInicio_1.setForeground(Color.RED);
		btnInicio_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnInicio_1.setBackground(Color.DARK_GRAY);
		btnInicio_1.setBounds(152, 11, 74, 48);
		PanelMenu.add(btnInicio_1);
		
		JButton btnEscuderias_1 = new JButton("Escuderias");
		btnEscuderias_1.setForeground(Color.RED);
		btnEscuderias_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnEscuderias_1.setBackground(Color.DARK_GRAY);
		btnEscuderias_1.setBounds(236, 11, 112, 48);
		PanelMenu.add(btnEscuderias_1);
		
		JButton btnPilotos_1 = new JButton("Pilotos");
		btnPilotos_1.setForeground(Color.RED);
		btnPilotos_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnPilotos_1.setBackground(Color.DARK_GRAY);
		btnPilotos_1.setBounds(358, 11, 94, 48);
		PanelMenu.add(btnPilotos_1);
		
		JButton btnGranPre_1 = new JButton("Gran Premio");
		btnGranPre_1.setForeground(Color.RED);
		btnGranPre_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGranPre_1.setBackground(Color.DARK_GRAY);
		btnGranPre_1.setBounds(462, 11, 130, 48);
		PanelMenu.add(btnGranPre_1);
		
		JButton btnClasi_1 = new JButton("Clasificaciones");
		btnClasi_1.setForeground(Color.RED);
		btnClasi_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnClasi_1.setBackground(Color.DARK_GRAY);
		btnClasi_1.setBounds(602, 11, 145, 48);
		PanelMenu.add(btnClasi_1);
		
		JButton btnLogin_1 = new JButton("Login");
		btnLogin_1.setForeground(Color.RED);
		btnLogin_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogin_1.setBackground(Color.DARK_GRAY);
		btnLogin_1.setBounds(757, 11, 92, 48);
		PanelMenu.add(btnLogin_1);
		
		btnLogo = new JButton("");
		btnLogo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"F1-logo.png"));
		btnLogo.setForeground(Color.LIGHT_GRAY);
		btnLogo.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogo.setBorder(null);
		btnLogo.setBackground(Color.LIGHT_GRAY);
		btnLogo.setBounds(10, 11, 124, 48);
		PanelMenu.add(btnLogo);
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
