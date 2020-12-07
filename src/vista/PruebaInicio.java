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

public class PruebaInicio extends JFrame {

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
	public PruebaInicio() {
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
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(27, 25, 328, 285);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea txtrBottaslosQue = new JTextArea();
		txtrBottaslosQue.setFont(new Font("Consolas", Font.BOLD, 15));
		txtrBottaslosQue.setOpaque(false);
		txtrBottaslosQue.setLineWrap(true);
		txtrBottaslosQue.setWrapStyleWord(true);
		txtrBottaslosQue.setText("Bottas: \"Los que no saben de F1 podr\u00EDan pensar que he quedado como un completo idiota\"");
		txtrBottaslosQue.setBounds(31, 175, 270, 61);
		panel_1.add(txtrBottaslosQue);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PruebaInicio.class.getResource("/Imagenes/Noticias/Noticia.jpg")));
		lblNewLabel.setBounds(31, 21, 270, 144);
		panel_1.add(lblNewLabel);
		
		JButton btnLeerMas1 = new JButton("Leer m\u00E1s");
		btnLeerMas1.setBorder(new CompoundBorder());
		btnLeerMas1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLeerMas1.setBounds(223, 246, 95, 29);
		panel_1.add(btnLeerMas1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1.setBounds(384, 25, 319, 387);
		panel.add(panel_1_1);
		
		JTextArea txtrMclarenReafirmaSu = new JTextArea();
		txtrMclarenReafirmaSu.setWrapStyleWord(true);
		txtrMclarenReafirmaSu.setText("McLaren reafirma su estrategia");
		txtrMclarenReafirmaSu.setOpaque(false);
		txtrMclarenReafirmaSu.setFont(new Font("Consolas", Font.BOLD, 17));
		txtrMclarenReafirmaSu.setBounds(27, 207, 293, 25);
		panel_1_1.add(txtrMclarenReafirmaSu);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PruebaInicio.class.getResource("/Imagenes/Noticias/Noticia2.jpg")));
		lblNewLabel_1.setBounds(27, 26, 270, 152);
		panel_1_1.add(lblNewLabel_1);
		
		JButton btnLeerMas2 = new JButton("Leer m\u00E1s");
		btnLeerMas2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLeerMas2.setBorder(new CompoundBorder());
		btnLeerMas2.setBounds(223, 348, 95, 29);
		panel_1_1.add(btnLeerMas2);
		
		JTextArea txtrSeidlApoyaLa = new JTextArea();
		txtrSeidlApoyaLa.setWrapStyleWord(true);
		txtrSeidlApoyaLa.setText("Seidl apoya la doble parada en Sakhir que dej\u00F3 a Sainz cuarto, a un paso del podio. \"Checo estaba a otro nivel\", dice el jefe a AS. El MCL35 no puede con Racing Point.");
		txtrSeidlApoyaLa.setOpaque(false);
		txtrSeidlApoyaLa.setLineWrap(true);
		txtrSeidlApoyaLa.setFont(new Font("Consolas", Font.PLAIN, 15));
		txtrSeidlApoyaLa.setBounds(27, 234, 270, 118);
		panel_1_1.add(txtrSeidlApoyaLa);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1.setBounds(37, 326, 328, 203);
		panel.add(panel_1_1_1);
		
		JTextArea txtrMclarenReafirmaSu_1 = new JTextArea();
		txtrMclarenReafirmaSu_1.setWrapStyleWord(true);
		txtrMclarenReafirmaSu_1.setText("McLaren reafirma su estrategia");
		txtrMclarenReafirmaSu_1.setOpaque(false);
		txtrMclarenReafirmaSu_1.setFont(new Font("Consolas", Font.BOLD, 17));
		txtrMclarenReafirmaSu_1.setBounds(27, 207, 293, 25);
		panel_1_1_1.add(txtrMclarenReafirmaSu_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(10, 10, 270, 152);
		panel_1_1_1.add(lblNewLabel_1_1);
		
		JButton btnLeerMas2_1 = new JButton("Leer m\u00E1s");
		btnLeerMas2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLeerMas2_1.setBorder(new CompoundBorder());
		btnLeerMas2_1.setBounds(223, 348, 95, 29);
		panel_1_1_1.add(btnLeerMas2_1);
		
		JTextArea txtrSeidlApoyaLa_1 = new JTextArea();
		txtrSeidlApoyaLa_1.setWrapStyleWord(true);
		txtrSeidlApoyaLa_1.setText("Seidl apoya la doble parada en Sakhir que dej\u00F3 a Sainz cuarto, a un paso del podio. \"Checo estaba a otro nivel\", dice el jefe a AS. El MCL35 no puede con Racing Point.");
		txtrSeidlApoyaLa_1.setOpaque(false);
		txtrSeidlApoyaLa_1.setLineWrap(true);
		txtrSeidlApoyaLa_1.setFont(new Font("Consolas", Font.PLAIN, 15));
		txtrSeidlApoyaLa_1.setBounds(27, 234, 270, 118);
		panel_1_1_1.add(txtrSeidlApoyaLa_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(PruebaInicio.class.getResource("/Imagenes/Noticias/Circuito.jpg")));
		lblNewLabel_2.setBounds(713, 137, 238, 203);
		panel.add(lblNewLabel_2);
		
		JTextArea txtrFormulaDhl = new JTextArea();
		txtrFormulaDhl.setOpaque(false);
		txtrFormulaDhl.setWrapStyleWord(true);
		txtrFormulaDhl.setLineWrap(true);
		txtrFormulaDhl.setFont(new Font("Bauhaus 93", Font.PLAIN, 18));
		txtrFormulaDhl.setText("Formula 1 DHL Turkish Grand Prix 2020");
		txtrFormulaDhl.setBounds(713, 350, 238, 62);
		panel.add(txtrFormulaDhl);
	}
}
