package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.TextArea;

public class Carrera extends JFrame {

	private JPanel contentPane;
	private JScrollPane scroll;
	private JButton btnInicio,btnEscuderias,btnPilotos,btnGranPre,btnClasi,btnLogin,btnLogo;
	private JButton btnGranPre_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carrera frame = new Carrera();
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
	public Carrera() {
		setBackground(Color.RED);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\alu01-dam2\\eclipse-workspace\\Formula1\\src\\img\\F1.png"));
		setTitle("Clasificaci\u00F3n Escuderia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblP1 = new JLabel("Fernando Alonso");
		lblP1.setBounds(110, 106, 105, 24);
		contentPane.add(lblP1);
		
		JPanel pP2 = new JPanel();
		pP2.setBounds(33, 130, 54, 24);
		contentPane.add(pP2);
		
		JLabel label_1 = new JLabel("2");
		pP2.add(label_1);
		
		JPanel pP3 = new JPanel();
		pP3.setBounds(33, 154, 54, 24);
		contentPane.add(pP3);
		
		JLabel label_1_1 = new JLabel("3");
		pP3.add(label_1_1);
		
		JPanel pP4 = new JPanel();
		pP4.setBounds(33, 177, 54, 24);
		contentPane.add(pP4);
		
		JLabel label_1_2 = new JLabel("4");
		pP4.add(label_1_2);
		
		JPanel pP5 = new JPanel();
		pP5.setBounds(33, 201, 54, 24);
		contentPane.add(pP5);
		
		JLabel label_1_3 = new JLabel("5");
		pP5.add(label_1_3);
		
		JPanel pP6 = new JPanel();
		pP6.setBounds(33, 225, 54, 24);
		contentPane.add(pP6);
		
		JLabel label_1_4 = new JLabel("6");
		pP6.add(label_1_4);
		
		JPanel pP7 = new JPanel();
		pP7.setBounds(33, 249, 54, 24);
		contentPane.add(pP7);
		
		JLabel label_1_5 = new JLabel("7");
		pP7.add(label_1_5);
		
		JPanel pP8 = new JPanel();
		pP8.setBounds(33, 273, 54, 24);
		contentPane.add(pP8);
		
		JLabel label_1_6 = new JLabel("8");
		pP8.add(label_1_6);
		
		JPanel pP9 = new JPanel();
		pP9.setBounds(33, 297, 54, 24);
		contentPane.add(pP9);
		
		JLabel label_1_7 = new JLabel("9");
		pP9.add(label_1_7);
		
		JPanel pPC2 = new JPanel();
		pPC2.setBackground(new Color(0, 206, 209));
		pPC2.setBounds(83, 130, 24, 24);
		contentPane.add(pPC2);
		
		JPanel pPC3 = new JPanel();
		pPC3.setBackground(new Color(0, 0, 128));
		pPC3.setBounds(83, 154, 24, 24);
		contentPane.add(pPC3);
		
		JPanel pPC4 = new JPanel();
		pPC4.setBackground(new Color(255, 0, 0));
		pPC4.setBounds(83, 177, 24, 24);
		contentPane.add(pPC4);
		
		JPanel pPC5 = new JPanel();
		pPC5.setBackground(Color.YELLOW);
		pPC5.setBounds(83, 201, 24, 24);
		contentPane.add(pPC5);
		
		JPanel pPC6 = new JPanel();
		pPC6.setBackground(new Color(0, 206, 209));
		pPC6.setBounds(83, 225, 24, 24);
		contentPane.add(pPC6);
		
		JPanel pPC7 = new JPanel();
		pPC7.setBackground(new Color(255, 20, 147));
		pPC7.setBounds(83, 249, 24, 24);
		contentPane.add(pPC7);
		
		JPanel pPC8 = new JPanel();
		pPC8.setBackground(new Color(255, 140, 0));
		pPC8.setBounds(83, 273, 24, 24);
		contentPane.add(pPC8);
		
		JPanel pPC9 = new JPanel();
		pPC9.setBackground(new Color(0, 0, 128));
		pPC9.setBounds(83, 297, 24, 24);
		contentPane.add(pPC9);
		
		JLabel lblP2 = new JLabel("Lewis Hamilton");
		lblP2.setBounds(110, 130, 105, 24);
		contentPane.add(lblP2);
		
		JLabel lblP3 = new JLabel("Marc Verstappen");
		lblP3.setBounds(110, 154, 105, 24);
		contentPane.add(lblP3);
		
		JLabel lblP4 = new JLabel("C. Leclerc");
		lblP4.setBounds(110, 177, 105, 24);
		contentPane.add(lblP4);
		
		JLabel lblP5 = new JLabel("D. Ricciardo");
		lblP5.setBounds(110, 201, 105, 24);
		contentPane.add(lblP5);
		
		JLabel lblP6 = new JLabel("V. Bottas");
		lblP6.setBounds(110, 225, 105, 24);
		contentPane.add(lblP6);
		
		JLabel lblP7 = new JLabel("S. Perez");
		lblP7.setBounds(110, 249, 105, 24);
		contentPane.add(lblP7);
		
		JLabel lblP8 = new JLabel("L. Norris");
		lblP8.setBounds(110, 274, 105, 24);
		contentPane.add(lblP8);
		
		JLabel lblP9 = new JLabel("A. Albon");
		lblP9.setBounds(110, 297, 105, 24);
		contentPane.add(lblP9);
		
		JPanel pP1 = new JPanel();
		pP1.setBounds(33, 106, 54, 24);
		contentPane.add(pP1);
		
		JLabel label_1_8 = new JLabel("1");
		pP1.add(label_1_8);
		
		JPanel pPC1 = new JPanel();
		pPC1.setBackground(Color.YELLOW);
		pPC1.setBounds(83, 106, 24, 24);
		contentPane.add(pPC1);
		
		JPanel pP10 = new JPanel();
		pP10.setBounds(33, 320, 54, 24);
		contentPane.add(pP10);
		
		JLabel label_1_7_1 = new JLabel("10");
		pP10.add(label_1_7_1);
		
		JPanel pPC10 = new JPanel();
		pPC10.setBackground(new Color(255, 140, 0));
		pPC10.setBounds(83, 320, 24, 24);
		contentPane.add(pPC10);
		
		JLabel lblP10 = new JLabel("C. Sainz");
		lblP10.setBounds(110, 320, 105, 24);
		contentPane.add(lblP10);
		
		JPanel pP1_1 = new JPanel();
		pP1_1.setBounds(33, 343, 54, 24);
		contentPane.add(pP1_1);
		
		JLabel label_1_8_1 = new JLabel("11");
		pP1_1.add(label_1_8_1);
		
		JPanel pP2_1 = new JPanel();
		pP2_1.setBounds(33, 367, 54, 24);
		contentPane.add(pP2_1);
		
		JLabel label_1_9 = new JLabel("12");
		pP2_1.add(label_1_9);
		
		JPanel pP3_1 = new JPanel();
		pP3_1.setBounds(33, 391, 54, 24);
		contentPane.add(pP3_1);
		
		JLabel label_1_1_1 = new JLabel("13");
		pP3_1.add(label_1_1_1);
		
		JPanel pP4_1 = new JPanel();
		pP4_1.setBounds(33, 414, 54, 24);
		contentPane.add(pP4_1);
		
		JLabel label_1_2_1 = new JLabel("14");
		pP4_1.add(label_1_2_1);
		
		JPanel pP5_1 = new JPanel();
		pP5_1.setBounds(33, 438, 54, 24);
		contentPane.add(pP5_1);
		
		JLabel label_1_3_1 = new JLabel("15");
		pP5_1.add(label_1_3_1);
		
		JPanel pP6_1 = new JPanel();
		pP6_1.setBounds(33, 462, 54, 24);
		contentPane.add(pP6_1);
		
		JLabel label_1_4_1 = new JLabel("16");
		pP6_1.add(label_1_4_1);
		
		JPanel pP7_1 = new JPanel();
		pP7_1.setBounds(33, 486, 54, 24);
		contentPane.add(pP7_1);
		
		JLabel label_1_5_1 = new JLabel("17");
		pP7_1.add(label_1_5_1);
		
		JPanel pP8_1 = new JPanel();
		pP8_1.setBounds(33, 510, 54, 24);
		contentPane.add(pP8_1);
		
		JLabel label_1_6_1 = new JLabel("18");
		pP8_1.add(label_1_6_1);
		
		JPanel pP9_1 = new JPanel();
		pP9_1.setBounds(33, 534, 54, 24);
		contentPane.add(pP9_1);
		
		JLabel label_1_7_2 = new JLabel("19");
		pP9_1.add(label_1_7_2);
		
		JPanel pP10_1 = new JPanel();
		pP10_1.setBounds(33, 557, 54, 24);
		contentPane.add(pP10_1);
		
		JLabel label_1_7_1_1 = new JLabel("20");
		pP10_1.add(label_1_7_1_1);
		
		JPanel pPC10_1 = new JPanel();
		pPC10_1.setBackground(new Color(255, 140, 0));
		pPC10_1.setBounds(83, 557, 24, 24);
		contentPane.add(pPC10_1);
		
		JPanel pPC9_1 = new JPanel();
		pPC9_1.setBackground(new Color(0, 0, 128));
		pPC9_1.setBounds(83, 534, 24, 24);
		contentPane.add(pPC9_1);
		
		JPanel pPC8_1 = new JPanel();
		pPC8_1.setBackground(new Color(255, 140, 0));
		pPC8_1.setBounds(83, 510, 24, 24);
		contentPane.add(pPC8_1);
		
		JPanel pPC7_1 = new JPanel();
		pPC7_1.setBackground(new Color(255, 20, 147));
		pPC7_1.setBounds(83, 486, 24, 24);
		contentPane.add(pPC7_1);
		
		JPanel pPC6_1 = new JPanel();
		pPC6_1.setBackground(new Color(0, 206, 209));
		pPC6_1.setBounds(83, 462, 24, 24);
		contentPane.add(pPC6_1);
		
		JPanel pPC5_1 = new JPanel();
		pPC5_1.setBackground(Color.YELLOW);
		pPC5_1.setBounds(83, 438, 24, 24);
		contentPane.add(pPC5_1);
		
		JPanel pPC4_1 = new JPanel();
		pPC4_1.setBackground(Color.RED);
		pPC4_1.setBounds(83, 414, 24, 24);
		contentPane.add(pPC4_1);
		
		JPanel pPC3_1 = new JPanel();
		pPC3_1.setBackground(new Color(0, 0, 128));
		pPC3_1.setBounds(83, 391, 24, 24);
		contentPane.add(pPC3_1);
		
		JPanel pPC2_1 = new JPanel();
		pPC2_1.setBackground(new Color(0, 206, 209));
		pPC2_1.setBounds(83, 367, 24, 24);
		contentPane.add(pPC2_1);
		
		JPanel pPC1_1 = new JPanel();
		pPC1_1.setBackground(Color.YELLOW);
		pPC1_1.setBounds(83, 343, 24, 24);
		contentPane.add(pPC1_1);
		
		JLabel lblP1_1 = new JLabel("Fernando Alonso");
		lblP1_1.setBounds(110, 343, 105, 24);
		contentPane.add(lblP1_1);
		
		JLabel lblP2_1 = new JLabel("Lewis Hamilton");
		lblP2_1.setBounds(110, 367, 105, 24);
		contentPane.add(lblP2_1);
		
		JLabel lblP3_1 = new JLabel("Marc Verstappen");
		lblP3_1.setBounds(110, 391, 105, 24);
		contentPane.add(lblP3_1);
		
		JLabel lblP4_1 = new JLabel("C. Leclerc");
		lblP4_1.setBounds(110, 414, 105, 24);
		contentPane.add(lblP4_1);
		
		JLabel lblP5_1 = new JLabel("D. Ricciardo");
		lblP5_1.setBounds(110, 438, 105, 24);
		contentPane.add(lblP5_1);
		
		JLabel lblP6_1 = new JLabel("V. Bottas");
		lblP6_1.setBounds(110, 462, 105, 24);
		contentPane.add(lblP6_1);
		
		JLabel lblP7_1 = new JLabel("S. Perez");
		lblP7_1.setBounds(110, 486, 105, 24);
		contentPane.add(lblP7_1);
		
		JLabel lblP8_1 = new JLabel("L. Norris");
		lblP8_1.setBounds(110, 511, 105, 24);
		contentPane.add(lblP8_1);
		
		JLabel lblP9_1 = new JLabel("A. Albon");
		lblP9_1.setBounds(110, 534, 105, 24);
		contentPane.add(lblP9_1);
		
		JLabel lblP10_1 = new JLabel("C. Sainz");
		lblP10_1.setBounds(110, 557, 105, 24);
		contentPane.add(lblP10_1);
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(33, 106, 289, 475);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(431, 106, 372, 160);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N/ Vueltas");
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(431, 284, 105, 37);
		contentPane.add(lblNewLabel_1);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setBounds(431, 343, 372, 160);
		contentPane.add(textArea_1);
		
		btnGranPre_1 = new JButton("Gran Premio");
		btnGranPre_1.setForeground(Color.RED);
		btnGranPre_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGranPre_1.setBackground(Color.DARK_GRAY);
		btnGranPre_1.setBounds(673, 534, 130, 48);
		contentPane.add(btnGranPre_1);
		
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

	public JButton getBtnGranPre_1() {
		return btnGranPre_1;
	}

	public void setBtnGranPre_1(JButton btnGranPre_1) {
		this.btnGranPre_1 = btnGranPre_1;
	}
	
	
	
	
}
