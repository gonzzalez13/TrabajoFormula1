package vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.io.File;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GrandesPremios extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GrandesPremios frame = new GrandesPremios();
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
	public GrandesPremios() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(322, 102, 207, 60);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Cpu\\git\\TrabajoFormula1\\src\\Imagenes\\Paises\\BahreinBarra.png"));
		lblNewLabel_1_1.setBounds(0, 50, 207, 10);
		panel_2.add(lblNewLabel_1_1);
		
		JButton btn2 = new JButton("Bahr\u00E9in >");
		btn2.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(0, 0, 148, 49);
		panel_2.add(btn2);
		
		JLabel bandera2 = new JLabel("");
		bandera2.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Bahrein.png"));
		bandera2.setBounds(147, 0, 60, 49);
		panel_2.add(bandera2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(0, 50, 207, 10);
		panel_2.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(50, 102, 207, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btn1 = new JButton("Albert Park >");
		btn1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(0, 0, 148, 49);
		panel.add(btn1);
		
		JLabel bandera1 = new JLabel("");
		bandera1.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Australia.png"));
		bandera1.setBounds(147, 0, 60, 49);
		panel.add(bandera1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Cpu\\git\\TrabajoFormula1\\src\\Imagenes\\Paises\\AustraliaBarra.PNG"));
		lblNewLabel_1.setBounds(0, 50, 207, 10);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 50, 207, 10);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(589, 102, 207, 60);
		contentPane.add(panel_2_1);
		
		JButton btn3 = new JButton("Hanoi >");
		btn3.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(0, 0, 148, 49);
		panel_2_1.add(btn3);
		
		JLabel bandera3 = new JLabel("");
		bandera3.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Vietnam.png"));
		bandera3.setBounds(147, 0, 60, 49);
		panel_2_1.add(bandera3);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\Cpu\\git\\TrabajoFormula1\\src\\Imagenes\\Paises\\VietnamBarra.png"));
		lblNewLabel_1_2.setBounds(0, 50, 207, 10);
		panel_2_1.add(lblNewLabel_1_2);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(0, 50, 207, 10);
		panel_2_1.add(panel_1_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(50, 173, 207, 60);
		contentPane.add(panel_3);
		
		JButton btn4 = new JButton("Shangh\u00E1i >");
		btn4.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(0, 0, 148, 49);
		panel_3.add(btn4);
		
		JLabel bandera4 = new JLabel("");
		bandera4.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"China.png"));
		bandera4.setBounds(147, 0, 60, 49);
		panel_3.add(bandera4);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(0, 50, 207, 10);
		panel_3.add(panel_1_3);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("");
		lblNewLabel_1_2_2.setBounds(0, 0, 207, 10);
		panel_1_3.add(lblNewLabel_1_2_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(322, 173, 207, 60);
		contentPane.add(panel_3_1);
		
		JButton btn5 = new JButton("Zandvoort >");
		btn5.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(0, 0, 148, 49);
		panel_3_1.add(btn5);
		
		JLabel bandera5 = new JLabel("");
		bandera5.setIcon(new ImageIcon("src/Imagenes/Paises/Paises Bajos.png"));
		bandera5.setBounds(147, 0, 60, 49);
		panel_3_1.add(bandera5);
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setBounds(0, 50, 207, 10);
		panel_3_1.add(panel_1_3_1);
		panel_1_3_1.setLayout(null);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1.setIcon(new ImageIcon("C:\\Users\\Cpu\\git\\TrabajoFormula1\\src\\Imagenes\\Paises\\Paises BajosBarra.png"));
		lblNewLabel_1_2_1.setBounds(0, 0, 207, 10);
		panel_1_3_1.add(lblNewLabel_1_2_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBounds(589, 173, 207, 60);
		contentPane.add(panel_2_2);
		
		JButton btn6 = new JButton("Barcelona >");
		btn6.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(0, 0, 148, 49);
		panel_2_2.add(btn6);
		
		JLabel bandera6 = new JLabel("");
		bandera6.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Espa\u00F1a.png"));
		bandera6.setBounds(147, 0, 60, 49);
		panel_2_2.add(bandera6);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(0, 50, 207, 10);
		panel_2_2.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("");
		lblNewLabel_1_2_1_1.setIcon(new ImageIcon("C:\\Users\\Cpu\\git\\TrabajoFormula1\\src\\Imagenes\\Paises\\Espa\u00F1aBarra.png"));
		lblNewLabel_1_2_1_1.setBounds(0, 0, 207, 10);
		panel_1_1_1.add(lblNewLabel_1_2_1_1);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setLayout(null);
		panel_2_2_1.setBounds(50, 244, 207, 60);
		contentPane.add(panel_2_2_1);
		
		JButton btn7 = new JButton("M\u00F3naco >");
		btn7.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(0, 0, 148, 49);
		panel_2_2_1.add(btn7);
		
		JLabel bandera7 = new JLabel("");
		bandera7.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Monaco.png"));
		bandera7.setBounds(147, 0, 60, 49);
		panel_2_2_1.add(bandera7);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBounds(0, 50, 207, 10);
		panel_2_2_1.add(panel_1_1_1_1);
		panel_1_1_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("");
		lblNewLabel_1_2_1_1_1.setIcon(new ImageIcon("C:\\Users\\Cpu\\git\\TrabajoFormula1\\src\\Imagenes\\Paises\\MonacoBarra.png"));
		lblNewLabel_1_2_1_1_1.setBounds(0, 0, 207, 10);
		panel_1_1_1_1.add(lblNewLabel_1_2_1_1_1);
		
		JPanel panel_2_2_1_1 = new JPanel();
		panel_2_2_1_1.setLayout(null);
		panel_2_2_1_1.setBounds(322, 244, 207, 60);
		contentPane.add(panel_2_2_1_1);
		
		JButton btn8 = new JButton("Bak\u00FA >");
		btn8.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn8.setBackground(Color.WHITE);
		btn8.setBounds(0, 0, 148, 49);
		panel_2_2_1_1.add(btn8);
		
		JLabel bandera8 = new JLabel("");
		bandera8.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Azerbaiy\u00E1n.png"));
		bandera8.setBounds(147, 0, 60, 49);
		panel_2_2_1_1.add(bandera8);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setBounds(0, 50, 207, 10);
		panel_2_2_1_1.add(panel_1_1_1_1_1);
		panel_1_1_1_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel("");
		lblNewLabel_1_2_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\Cpu\\git\\TrabajoFormula1\\src\\Imagenes\\Paises\\Azerbaiy\u00E1nBarra.png"));
		lblNewLabel_1_2_1_1_1_1.setBounds(0, 0, 207, 10);
		panel_1_1_1_1_1.add(lblNewLabel_1_2_1_1_1_1);
		
		JPanel panel_2_2_1_1_1 = new JPanel();
		panel_2_2_1_1_1.setLayout(null);
		panel_2_2_1_1_1.setBounds(589, 244, 207, 60);
		contentPane.add(panel_2_2_1_1_1);
		
		JButton btn9 = new JButton("Gilles Villeneuve >");
		btn9.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn9.setBackground(Color.WHITE);
		btn9.setBounds(0, 0, 148, 49);
		panel_2_2_1_1_1.add(btn9);
		
		JLabel bandera9 = new JLabel("");
		bandera9.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Canada.png"));
		bandera9.setBounds(147, 0, 60, 49);
		panel_2_2_1_1_1.add(bandera9);
		
		JPanel panel_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1.setBounds(0, 50, 207, 10);
		panel_2_2_1_1_1.add(panel_1_1_1_1_1_1);
		
		JPanel panel_2_2_1_2 = new JPanel();
		panel_2_2_1_2.setLayout(null);
		panel_2_2_1_2.setBounds(50, 315, 207, 60);
		contentPane.add(panel_2_2_1_2);
		
		JButton btn10 = new JButton("Paul Ricard >");
		btn10.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn10.setBackground(Color.WHITE);
		btn10.setBounds(0, 0, 148, 49);
		panel_2_2_1_2.add(btn10);
		
		JLabel bandera10 = new JLabel("");
		bandera10.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Francia.png"));
		bandera10.setBounds(147, 0, 60, 49);
		panel_2_2_1_2.add(bandera10);
		
		JPanel panel_1_1_1_1_2 = new JPanel();
		panel_1_1_1_1_2.setBounds(0, 50, 207, 10);
		panel_2_2_1_2.add(panel_1_1_1_1_2);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBounds(322, 315, 207, 60);
		contentPane.add(panel_2_1_1);
		
		JButton btn11 = new JButton("Red Bull Ring >");
		btn11.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn11.setBackground(Color.WHITE);
		btn11.setBounds(0, 0, 148, 49);
		panel_2_1_1.add(btn11);
		
		JLabel bandera11 = new JLabel("");
		bandera11.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Austria.png"));
		bandera11.setBounds(147, 0, 60, 49);
		panel_2_1_1.add(bandera11);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setBounds(0, 50, 207, 10);
		panel_2_1_1.add(panel_1_2_1);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBounds(589, 315, 207, 60);
		contentPane.add(panel_2_1_1_1);
		
		JButton btn12 = new JButton("Hungaroring >");
		btn12.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn12.setBackground(Color.WHITE);
		btn12.setBounds(0, 0, 148, 49);
		panel_2_1_1_1.add(btn12);
		
		JLabel bandera12 = new JLabel("");
		bandera12.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Hungria.png"));
		bandera12.setBounds(147, 0, 60, 49);
		panel_2_1_1_1.add(bandera12);
		
		JPanel panel_1_2_1_1 = new JPanel();
		panel_1_2_1_1.setBounds(0, 50, 207, 10);
		panel_2_1_1_1.add(panel_1_2_1_1);
		
		JPanel panel_2_2_1_2_1 = new JPanel();
		panel_2_2_1_2_1.setLayout(null);
		panel_2_2_1_2_1.setBounds(50, 386, 207, 60);
		contentPane.add(panel_2_2_1_2_1);
		
		JButton btn13 = new JButton("Silverstone >");
		btn13.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn13.setBackground(Color.WHITE);
		btn13.setBounds(0, 0, 148, 49);
		panel_2_2_1_2_1.add(btn13);
		
		JLabel bandera13 = new JLabel("");
		bandera13.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Inglaterra.png"));
		bandera13.setBounds(147, 0, 60, 49);
		panel_2_2_1_2_1.add(bandera13);
		
		JPanel panel_1_1_1_1_2_1 = new JPanel();
		panel_1_1_1_1_2_1.setBounds(0, 50, 207, 10);
		panel_2_2_1_2_1.add(panel_1_1_1_1_2_1);
		
		JPanel panel_2_2_2 = new JPanel();
		panel_2_2_2.setLayout(null);
		panel_2_2_2.setBounds(322, 386, 207, 60);
		contentPane.add(panel_2_2_2);
		
		JButton btn14 = new JButton("Spa >");
		btn14.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn14.setBackground(Color.WHITE);
		btn14.setBounds(0, 0, 148, 49);
		panel_2_2_2.add(btn14);
		
		JLabel bandera14 = new JLabel("");
		bandera14.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Belgica.png"));
		bandera14.setBounds(147, 0, 60, 49);
		panel_2_2_2.add(bandera14);
		
		JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setBounds(0, 50, 207, 10);
		panel_2_2_2.add(panel_1_1_1_2);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBounds(589, 386, 207, 60);
		contentPane.add(panel_2_1_2);
		
		JButton btn15 = new JButton("Monza >");
		btn15.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn15.setBackground(Color.WHITE);
		btn15.setBounds(0, 0, 148, 49);
		panel_2_1_2.add(btn15);
		
		JLabel bandera15 = new JLabel("");
		bandera15.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Italia.png"));
		bandera15.setBounds(147, 0, 60, 49);
		panel_2_1_2.add(bandera15);
		
		JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setBounds(0, 50, 207, 10);
		panel_2_1_2.add(panel_1_2_2);
		
		JPanel panel_2_1_2_1 = new JPanel();
		panel_2_1_2_1.setLayout(null);
		panel_2_1_2_1.setBounds(50, 457, 207, 60);
		contentPane.add(panel_2_1_2_1);
		
		JButton btn16 = new JButton("Marina Bay >");
		btn16.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn16.setBackground(Color.WHITE);
		btn16.setBounds(0, 0, 148, 49);
		panel_2_1_2_1.add(btn16);
		
		JLabel bandera16 = new JLabel("");
		bandera16.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Singapur.png"));
		bandera16.setBounds(147, 0, 60, 49);
		panel_2_1_2_1.add(bandera16);
		
		JPanel panel_1_2_2_1 = new JPanel();
		panel_1_2_2_1.setBounds(0, 50, 207, 10);
		panel_2_1_2_1.add(panel_1_2_2_1);
		
		JPanel panel_2_1_2_1_1 = new JPanel();
		panel_2_1_2_1_1.setLayout(null);
		panel_2_1_2_1_1.setBounds(322, 457, 207, 60);
		contentPane.add(panel_2_1_2_1_1);
		
		JButton btn17 = new JButton("Sochi >");
		btn17.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn17.setBackground(Color.WHITE);
		btn17.setBounds(0, 0, 148, 49);
		panel_2_1_2_1_1.add(btn17);
		
		JLabel bandera17 = new JLabel("");
		bandera17.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Rusia.png"));
		bandera17.setBounds(147, 0, 60, 49);
		panel_2_1_2_1_1.add(bandera17);
		
		JPanel panel_1_2_2_1_1 = new JPanel();
		panel_1_2_2_1_1.setBounds(0, 50, 207, 10);
		panel_2_1_2_1_1.add(panel_1_2_2_1_1);
		
		JPanel panel_2_1_2_1_2 = new JPanel();
		panel_2_1_2_1_2.setLayout(null);
		panel_2_1_2_1_2.setBounds(589, 457, 207, 60);
		contentPane.add(panel_2_1_2_1_2);
		
		JButton btn18 = new JButton("Suzuka >");
		btn18.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn18.setBackground(Color.WHITE);
		btn18.setBounds(0, 0, 148, 49);
		panel_2_1_2_1_2.add(btn18);
		
		JLabel bandera18 = new JLabel("");
		bandera18.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Japon.png"));
		bandera18.setBounds(147, 0, 60, 49);
		panel_2_1_2_1_2.add(bandera18);
		
		JPanel panel_1_2_2_1_2 = new JPanel();
		panel_1_2_2_1_2.setBounds(0, 50, 207, 10);
		panel_2_1_2_1_2.add(panel_1_2_2_1_2);
		
		JPanel panel_2_1_2_1_3 = new JPanel();
		panel_2_1_2_1_3.setLayout(null);
		panel_2_1_2_1_3.setBounds(50, 528, 207, 60);
		contentPane.add(panel_2_1_2_1_3);
		
		JButton btn19 = new JButton(" Las Am\u00E9ricas >");
		btn19.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn19.setBackground(Color.WHITE);
		btn19.setBounds(0, 0, 148, 49);
		panel_2_1_2_1_3.add(btn19);
		
		JLabel bandera19 = new JLabel("");
		bandera19.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"EEUU.png"));
		bandera19.setBounds(147, 0, 60, 49);
		panel_2_1_2_1_3.add(bandera19);
		
		JPanel panel_1_2_2_1_3 = new JPanel();
		panel_1_2_2_1_3.setBounds(0, 50, 207, 10);
		panel_2_1_2_1_3.add(panel_1_2_2_1_3);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBounds(322, 528, 207, 60);
		contentPane.add(panel_2_3);
		
		JButton btn20 = new JButton("M\u00E9xico >");
		btn20.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn20.setBackground(Color.WHITE);
		btn20.setBounds(0, 0, 148, 49);
		panel_2_3.add(btn20);
		
		JLabel bandera20 = new JLabel("");
		bandera20.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Mexico.png"));
		bandera20.setBounds(147, 0, 60, 49);
		panel_2_3.add(bandera20);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(0, 50, 207, 10);
		panel_2_3.add(panel_1_1_2);
		
		JPanel panel_2_1_3 = new JPanel();
		panel_2_1_3.setLayout(null);
		panel_2_1_3.setBounds(589, 528, 207, 60);
		contentPane.add(panel_2_1_3);
		
		JButton btn21 = new JButton("Brasil >");
		btn21.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btn21.setBackground(Color.WHITE);
		btn21.setBounds(0, 0, 148, 49);
		panel_2_1_3.add(btn21);
		
		JLabel bandera21 = new JLabel("");
		bandera21.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Brasil.png"));
		bandera21.setBounds(147, 0, 60, 49);
		panel_2_1_3.add(bandera21);
		
		JPanel panel_1_2_3 = new JPanel();
		panel_1_2_3.setBounds(0, 50, 207, 10);
		panel_2_1_3.add(panel_1_2_3);
		
		JPanel PanelMenu = new JPanel();
		PanelMenu.setLayout(null);
		PanelMenu.setBackground(Color.LIGHT_GRAY);
		PanelMenu.setBounds(0, 0, 849, 71);
		contentPane.add(PanelMenu);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.setForeground(Color.RED);
		btnInicio.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnInicio.setBackground(Color.DARK_GRAY);
		btnInicio.setBounds(144, 11, 74, 48);
		PanelMenu.add(btnInicio);
		
		JButton btnEscuderias = new JButton("Escuderias");
		btnEscuderias.setForeground(Color.RED);
		btnEscuderias.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnEscuderias.setBackground(Color.DARK_GRAY);
		btnEscuderias.setBounds(226, 11, 112, 48);
		PanelMenu.add(btnEscuderias);
		
		JButton btnPilotos = new JButton("Pilotos");
		btnPilotos.setForeground(Color.RED);
		btnPilotos.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnPilotos.setBackground(Color.DARK_GRAY);
		btnPilotos.setBounds(348, 11, 94, 48);
		PanelMenu.add(btnPilotos);
		
		JButton btnGranPre = new JButton("Gran Premio");
		btnGranPre.setForeground(Color.RED);
		btnGranPre.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGranPre.setBackground(Color.DARK_GRAY);
		btnGranPre.setBounds(452, 11, 130, 48);
		PanelMenu.add(btnGranPre);
		
		JButton btnClasi = new JButton("Clasificaciones");
		btnClasi.setForeground(Color.RED);
		btnClasi.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnClasi.setBackground(Color.DARK_GRAY);
		btnClasi.setBounds(592, 11, 145, 48);
		PanelMenu.add(btnClasi);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.RED);
		btnLogin.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setBounds(747, 11, 92, 48);
		PanelMenu.add(btnLogin);
		
		JButton btnLogo = new JButton("");
		btnLogo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"F1-logo.png"));
		btnLogo.setForeground(Color.LIGHT_GRAY);
		btnLogo.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogo.setBorder(null);
		btnLogo.setBackground(Color.LIGHT_GRAY);
		btnLogo.setBounds(10, 11, 124, 48);
		PanelMenu.add(btnLogo);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 71, 849, 529);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Cpu\\git\\TrabajoFormula1\\src\\Imagenes\\Fondos\\Fondo6.PNG"));
		lblNewLabel.setBounds(0, 0, 849, 529);
		panel_4.add(lblNewLabel);
	}
}
