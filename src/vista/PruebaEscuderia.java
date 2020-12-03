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
		
		JPanel panelMercedes = new JPanel();
		panelMercedes.setBackground(Color.WHITE);
		panelMercedes.setBounds(10, 11, 270, 121);
		panel.add(panelMercedes);
		panelMercedes.setLayout(null);
		
		JButton btnMercedes = new JButton("New button");
		btnMercedes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMercedes.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Mercedes.png"));
		btnMercedes.setBounds(0, 0, 270, 121);
		panelMercedes.add(btnMercedes);
		
		JPanel panelRedBull = new JPanel();
		panelRedBull.setLayout(null);
		panelRedBull.setBackground(Color.WHITE);
		panelRedBull.setBounds(10, 143, 270, 121);
		panel.add(panelRedBull);
		
		JButton btnRedBull = new JButton();
		btnRedBull.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"RedBull.png"));
		btnRedBull.setBounds(0, 0, 270, 121);
		panelRedBull.add(btnRedBull);
		
		JPanel panelMclaren = new JPanel();
		panelMclaren.setLayout(null);
		panelMclaren.setBackground(Color.WHITE);
		panelMclaren.setBounds(10, 275, 270, 121);
		panel.add(panelMclaren);
		
		JButton btnMclaren = new JButton("New button");
		btnMclaren.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Mclaren.png"));
		btnMclaren.setBounds(0, 0, 270, 121);
		panelMclaren.add(btnMclaren);
		
		JPanel panelRacingPoint = new JPanel();
		panelRacingPoint.setLayout(null);
		panelRacingPoint.setBackground(Color.WHITE);
		panelRacingPoint.setBounds(10, 407, 270, 121);
		panel.add(panelRacingPoint);
		
		JButton btnRacingPoint = new JButton("New button");
		btnRacingPoint.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"RacingPoint.png"));
		btnRacingPoint.setBounds(0, 0, 270, 121);
		panelRacingPoint.add(btnRacingPoint);
		
		JPanel panelRenault = new JPanel();
		panelRenault.setLayout(null);
		panelRenault.setBackground(Color.WHITE);
		panelRenault.setBounds(355, 11, 270, 121);
		panel.add(panelRenault);
		
		JButton btnRenault = new JButton("New button");
		btnRenault.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Renault.png"));
		btnRenault.setBounds(0, 0, 270, 121);
		panelRenault.add(btnRenault);
		
		JPanel panelFerrari = new JPanel();
		panelFerrari.setLayout(null);
		panelFerrari.setBackground(Color.WHITE);
		panelFerrari.setBounds(355, 143, 270, 121);
		panel.add(panelFerrari);
		
		JButton btnFerrari = new JButton("New button");
		btnFerrari.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"ferrari.png"));
		btnFerrari.setBounds(0, 0, 270, 121);
		panelFerrari.add(btnFerrari);
		
		JPanel panelAlphatauri = new JPanel();
		panelAlphatauri.setLayout(null);
		panelAlphatauri.setBackground(Color.WHITE);
		panelAlphatauri.setBounds(355, 275, 270, 121);
		panel.add(panelAlphatauri);
		
		JButton btnAlphatauri = new JButton("New button");
		btnAlphatauri.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"AlphaTauri.png"));
		btnAlphatauri.setBounds(0, 0, 270, 121);
		panelAlphatauri.add(btnAlphatauri);
		
		JPanel panelAlfaRomeo = new JPanel();
		panelAlfaRomeo.setLayout(null);
		panelAlfaRomeo.setBackground(Color.WHITE);
		panelAlfaRomeo.setBounds(355, 407, 270, 121);
		panel.add(panelAlfaRomeo);
		
		JButton btnAlfaRomeo = new JButton("New button");
		btnAlfaRomeo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Alfa Romeo.PNG"));
		btnAlfaRomeo.setBounds(0, 0, 270, 121);
		panelAlfaRomeo.add(btnAlfaRomeo);
		
		JPanel panelHaas = new JPanel();
		panelHaas.setLayout(null);
		panelHaas.setBackground(Color.WHITE);
		panelHaas.setBounds(694, 11, 270, 121);
		panel.add(panelHaas);
		
		JButton btnHaas = new JButton("New button");
		btnHaas.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"haas.png"));
		btnHaas.setBounds(0, 0, 270, 121);
		panelHaas.add(btnHaas);
		
		JPanel panelWilliams = new JPanel();
		panelWilliams.setLayout(null);
		panelWilliams.setBackground(Color.WHITE);
		panelWilliams.setBounds(694, 143, 270, 121);
		panel.add(panelWilliams);
		
		JButton btnWilliams = new JButton("New button");
		btnWilliams.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Williams.png"));
		btnWilliams.setBounds(0, 0, 270, 121);
		panelWilliams.add(btnWilliams);
		
		JLabel lblFondo = new JLabel();
		lblFondo.setBounds(0, 72, 974, 539);
		contentPane.add(lblFondo);
		lblFondo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.PNG"));
	}
}
