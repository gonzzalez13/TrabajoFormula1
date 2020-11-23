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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(50, 102, 207, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("Albert Park >");
		btnNewButton_6.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6.setBackground(Color.WHITE);
		btnNewButton_6.setBounds(0, 0, 148, 49);
		panel.add(btnNewButton_6);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Australia.png"));
		lblNewLabel.setBounds(147, 0, 60, 49);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 50, 207, 10);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(322, 102, 207, 60);
		contentPane.add(panel_2);
		
		JButton btnNewButton_6_1 = new JButton("Bahr\u00E9in >");
		btnNewButton_6_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_1.setBackground(Color.WHITE);
		btnNewButton_6_1.setBounds(0, 0, 148, 49);
		panel_2.add(btnNewButton_6_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Bahrein.png"));
		lblNewLabel_1.setBounds(147, 0, 60, 49);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(0, 50, 207, 10);
		panel_2.add(panel_1_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(589, 102, 207, 60);
		contentPane.add(panel_2_1);
		
		JButton btnNewButton_6_1_1 = new JButton("Hanoi >");
		btnNewButton_6_1_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_1_1.setBackground(Color.WHITE);
		btnNewButton_6_1_1.setBounds(0, 0, 148, 49);
		panel_2_1.add(btnNewButton_6_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Vietnam.png"));
		lblNewLabel_1_1.setBounds(147, 0, 60, 49);
		panel_2_1.add(lblNewLabel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(0, 50, 207, 10);
		panel_2_1.add(panel_1_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(50, 173, 207, 60);
		contentPane.add(panel_3);
		
		JButton btnNewButton_6_2 = new JButton("Shangh\u00E1i >");
		btnNewButton_6_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_2.setBackground(Color.WHITE);
		btnNewButton_6_2.setBounds(0, 0, 148, 49);
		panel_3.add(btnNewButton_6_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"China.png"));
		lblNewLabel_2.setBounds(147, 0, 60, 49);
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBounds(0, 50, 207, 10);
		panel_3.add(panel_1_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(322, 173, 207, 60);
		contentPane.add(panel_3_1);
		
		JButton btnNewButton_6_2_1 = new JButton("Zandvoort >");
		btnNewButton_6_2_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_2_1.setBackground(Color.WHITE);
		btnNewButton_6_2_1.setBounds(0, 0, 148, 49);
		panel_3_1.add(btnNewButton_6_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("src/Imagenes/Paises/Paises Bajos.png"));
		lblNewLabel_2_1.setBounds(147, 0, 60, 49);
		panel_3_1.add(lblNewLabel_2_1);
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setBounds(0, 50, 207, 10);
		panel_3_1.add(panel_1_3_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBounds(589, 173, 207, 60);
		contentPane.add(panel_2_2);
		
		JButton btnNewButton_6_1_2 = new JButton("Barcelona >");
		btnNewButton_6_1_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_1_2.setBackground(Color.WHITE);
		btnNewButton_6_1_2.setBounds(0, 0, 148, 49);
		panel_2_2.add(btnNewButton_6_1_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Espa\u00F1a.png"));
		lblNewLabel_1_2.setBounds(147, 0, 60, 49);
		panel_2_2.add(lblNewLabel_1_2);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(0, 50, 207, 10);
		panel_2_2.add(panel_1_1_1);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setLayout(null);
		panel_2_2_1.setBounds(50, 244, 207, 60);
		contentPane.add(panel_2_2_1);
		
		JButton btnNewButton_6_1_2_1 = new JButton("M\u00F3naco >");
		btnNewButton_6_1_2_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_1_2_1.setBackground(Color.WHITE);
		btnNewButton_6_1_2_1.setBounds(0, 0, 148, 49);
		panel_2_2_1.add(btnNewButton_6_1_2_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Monaco.png"));
		lblNewLabel_1_2_1.setBounds(147, 0, 60, 49);
		panel_2_2_1.add(lblNewLabel_1_2_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBounds(0, 50, 207, 10);
		panel_2_2_1.add(panel_1_1_1_1);
		
		JPanel panel_2_2_1_1 = new JPanel();
		panel_2_2_1_1.setLayout(null);
		panel_2_2_1_1.setBounds(322, 244, 207, 60);
		contentPane.add(panel_2_2_1_1);
		
		JButton btnNewButton_6_1_2_1_1 = new JButton("Bak\u00FA >");
		btnNewButton_6_1_2_1_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_1_2_1_1.setBackground(Color.WHITE);
		btnNewButton_6_1_2_1_1.setBounds(0, 0, 148, 49);
		panel_2_2_1_1.add(btnNewButton_6_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("");
		lblNewLabel_1_2_1_1.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Azerbaiy\u00E1n.png"));
		lblNewLabel_1_2_1_1.setBounds(147, 0, 60, 49);
		panel_2_2_1_1.add(lblNewLabel_1_2_1_1);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setBounds(0, 50, 207, 10);
		panel_2_2_1_1.add(panel_1_1_1_1_1);
		
		JPanel panel_2_2_1_1_1 = new JPanel();
		panel_2_2_1_1_1.setLayout(null);
		panel_2_2_1_1_1.setBounds(589, 244, 207, 60);
		contentPane.add(panel_2_2_1_1_1);
		
		JButton btnNewButton_6_1_2_1_1_1 = new JButton("Gilles Villeneuve >");
		btnNewButton_6_1_2_1_1_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_1_2_1_1_1.setBackground(Color.WHITE);
		btnNewButton_6_1_2_1_1_1.setBounds(0, 0, 148, 49);
		panel_2_2_1_1_1.add(btnNewButton_6_1_2_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("");
		lblNewLabel_1_2_1_1_1.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Canada.png"));
		lblNewLabel_1_2_1_1_1.setBounds(147, 0, 60, 49);
		panel_2_2_1_1_1.add(lblNewLabel_1_2_1_1_1);
		
		JPanel panel_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1.setBounds(0, 50, 207, 10);
		panel_2_2_1_1_1.add(panel_1_1_1_1_1_1);
		
		JPanel panel_2_2_1_2 = new JPanel();
		panel_2_2_1_2.setLayout(null);
		panel_2_2_1_2.setBounds(50, 315, 207, 60);
		contentPane.add(panel_2_2_1_2);
		
		JButton btnNewButton_6_1_2_1_2 = new JButton("Paul Ricard >");
		btnNewButton_6_1_2_1_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_1_2_1_2.setBackground(Color.WHITE);
		btnNewButton_6_1_2_1_2.setBounds(0, 0, 148, 49);
		panel_2_2_1_2.add(btnNewButton_6_1_2_1_2);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("");
		lblNewLabel_1_2_1_2.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Francia.png"));
		lblNewLabel_1_2_1_2.setBounds(147, 0, 60, 49);
		panel_2_2_1_2.add(lblNewLabel_1_2_1_2);
		
		JPanel panel_1_1_1_1_2 = new JPanel();
		panel_1_1_1_1_2.setBounds(0, 50, 207, 10);
		panel_2_2_1_2.add(panel_1_1_1_1_2);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBounds(322, 315, 207, 60);
		contentPane.add(panel_2_1_1);
		
		JButton btnNewButton_6_1_1_1 = new JButton("Red Bull Ring >");
		btnNewButton_6_1_1_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_1_1_1.setBackground(Color.WHITE);
		btnNewButton_6_1_1_1.setBounds(0, 0, 148, 49);
		panel_2_1_1.add(btnNewButton_6_1_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Austria.png"));
		lblNewLabel_1_1_1.setBounds(147, 0, 60, 49);
		panel_2_1_1.add(lblNewLabel_1_1_1);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setBounds(0, 50, 207, 10);
		panel_2_1_1.add(panel_1_2_1);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBounds(589, 315, 207, 60);
		contentPane.add(panel_2_1_1_1);
		
		JButton btnNewButton_6_1_1_1_1 = new JButton("Hungaroring >");
		btnNewButton_6_1_1_1_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_6_1_1_1_1.setBounds(0, 0, 148, 49);
		panel_2_1_1_1.add(btnNewButton_6_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Hungria.png"));
		lblNewLabel_1_1_1_1.setBounds(147, 0, 60, 49);
		panel_2_1_1_1.add(lblNewLabel_1_1_1_1);
		
		JPanel panel_1_2_1_1 = new JPanel();
		panel_1_2_1_1.setBounds(0, 50, 207, 10);
		panel_2_1_1_1.add(panel_1_2_1_1);
		
		JPanel panel_2_2_1_2_1 = new JPanel();
		panel_2_2_1_2_1.setLayout(null);
		panel_2_2_1_2_1.setBounds(50, 386, 207, 60);
		contentPane.add(panel_2_2_1_2_1);
		
		JButton btnNewButton_6_1_2_1_2_1 = new JButton("Silverstone >");
		btnNewButton_6_1_2_1_2_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_1_2_1_2_1.setBackground(Color.WHITE);
		btnNewButton_6_1_2_1_2_1.setBounds(0, 0, 148, 49);
		panel_2_2_1_2_1.add(btnNewButton_6_1_2_1_2_1);
		
		JLabel lblNewLabel_1_2_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1_2_1.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Inglaterra.png"));
		lblNewLabel_1_2_1_2_1.setBounds(147, 0, 60, 49);
		panel_2_2_1_2_1.add(lblNewLabel_1_2_1_2_1);
		
		JPanel panel_1_1_1_1_2_1 = new JPanel();
		panel_1_1_1_1_2_1.setBounds(0, 50, 207, 10);
		panel_2_2_1_2_1.add(panel_1_1_1_1_2_1);
		
		JPanel panel_2_2_2 = new JPanel();
		panel_2_2_2.setLayout(null);
		panel_2_2_2.setBounds(322, 386, 207, 60);
		contentPane.add(panel_2_2_2);
		
		JButton btnNewButton_6_1_2_2 = new JButton("Spa >");
		btnNewButton_6_1_2_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_1_2_2.setBackground(Color.WHITE);
		btnNewButton_6_1_2_2.setBounds(0, 0, 148, 49);
		panel_2_2_2.add(btnNewButton_6_1_2_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("");
		lblNewLabel_1_2_2.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Belgica.png"));
		lblNewLabel_1_2_2.setBounds(147, 0, 60, 49);
		panel_2_2_2.add(lblNewLabel_1_2_2);
		
		JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setBounds(0, 50, 207, 10);
		panel_2_2_2.add(panel_1_1_1_2);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBounds(589, 386, 207, 60);
		contentPane.add(panel_2_1_2);
		
		JButton btnNewButton_6_1_1_2 = new JButton("Monza >");
		btnNewButton_6_1_1_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_1_1_2.setBackground(Color.WHITE);
		btnNewButton_6_1_1_2.setBounds(0, 0, 148, 49);
		panel_2_1_2.add(btnNewButton_6_1_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("");
		lblNewLabel_1_1_2.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Italia.png"));
		lblNewLabel_1_1_2.setBounds(147, 0, 60, 49);
		panel_2_1_2.add(lblNewLabel_1_1_2);
		
		JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setBounds(0, 50, 207, 10);
		panel_2_1_2.add(panel_1_2_2);
		
		JPanel panel_2_1_2_1 = new JPanel();
		panel_2_1_2_1.setLayout(null);
		panel_2_1_2_1.setBounds(50, 457, 207, 60);
		contentPane.add(panel_2_1_2_1);
		
		JButton btnNewButton_6_1_1_2_1 = new JButton("Marina Bay >");
		btnNewButton_6_1_1_2_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_1_1_2_1.setBackground(Color.WHITE);
		btnNewButton_6_1_1_2_1.setBounds(0, 0, 148, 49);
		panel_2_1_2_1.add(btnNewButton_6_1_1_2_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("");
		lblNewLabel_1_1_2_1.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Singapur.png"));
		lblNewLabel_1_1_2_1.setBounds(147, 0, 60, 49);
		panel_2_1_2_1.add(lblNewLabel_1_1_2_1);
		
		JPanel panel_1_2_2_1 = new JPanel();
		panel_1_2_2_1.setBounds(0, 50, 207, 10);
		panel_2_1_2_1.add(panel_1_2_2_1);
		
		JPanel panel_2_1_2_1_1 = new JPanel();
		panel_2_1_2_1_1.setLayout(null);
		panel_2_1_2_1_1.setBounds(322, 457, 207, 60);
		contentPane.add(panel_2_1_2_1_1);
		
		JButton btnNewButton_6_1_1_2_1_1 = new JButton("Sochi >");
		btnNewButton_6_1_1_2_1_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_1_1_2_1_1.setBackground(Color.WHITE);
		btnNewButton_6_1_1_2_1_1.setBounds(0, 0, 148, 49);
		panel_2_1_2_1_1.add(btnNewButton_6_1_1_2_1_1);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("");
		lblNewLabel_1_1_2_1_1.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Rusia.png"));
		lblNewLabel_1_1_2_1_1.setBounds(147, 0, 60, 49);
		panel_2_1_2_1_1.add(lblNewLabel_1_1_2_1_1);
		
		JPanel panel_1_2_2_1_1 = new JPanel();
		panel_1_2_2_1_1.setBounds(0, 50, 207, 10);
		panel_2_1_2_1_1.add(panel_1_2_2_1_1);
		
		JPanel panel_2_1_2_1_2 = new JPanel();
		panel_2_1_2_1_2.setLayout(null);
		panel_2_1_2_1_2.setBounds(589, 457, 207, 60);
		contentPane.add(panel_2_1_2_1_2);
		
		JButton btnNewButton_6_1_1_2_1_2 = new JButton("Suzuka >");
		btnNewButton_6_1_1_2_1_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_1_1_2_1_2.setBackground(Color.WHITE);
		btnNewButton_6_1_1_2_1_2.setBounds(0, 0, 148, 49);
		panel_2_1_2_1_2.add(btnNewButton_6_1_1_2_1_2);
		
		JLabel lblNewLabel_1_1_2_1_2 = new JLabel("");
		lblNewLabel_1_1_2_1_2.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Japon.png"));
		lblNewLabel_1_1_2_1_2.setBounds(147, 0, 60, 49);
		panel_2_1_2_1_2.add(lblNewLabel_1_1_2_1_2);
		
		JPanel panel_1_2_2_1_2 = new JPanel();
		panel_1_2_2_1_2.setBounds(0, 50, 207, 10);
		panel_2_1_2_1_2.add(panel_1_2_2_1_2);
		
		JPanel panel_2_1_2_1_3 = new JPanel();
		panel_2_1_2_1_3.setLayout(null);
		panel_2_1_2_1_3.setBounds(50, 528, 207, 60);
		contentPane.add(panel_2_1_2_1_3);
		
		JButton btnNewButton_6_1_1_2_1_3 = new JButton(" Las Am\u00E9ricas >");
		btnNewButton_6_1_1_2_1_3.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_1_1_2_1_3.setBackground(Color.WHITE);
		btnNewButton_6_1_1_2_1_3.setBounds(0, 0, 148, 49);
		panel_2_1_2_1_3.add(btnNewButton_6_1_1_2_1_3);
		
		JLabel lblNewLabel_1_1_2_1_3 = new JLabel("");
		lblNewLabel_1_1_2_1_3.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"EEUU.png"));
		lblNewLabel_1_1_2_1_3.setBounds(147, 0, 60, 49);
		panel_2_1_2_1_3.add(lblNewLabel_1_1_2_1_3);
		
		JPanel panel_1_2_2_1_3 = new JPanel();
		panel_1_2_2_1_3.setBounds(0, 50, 207, 10);
		panel_2_1_2_1_3.add(panel_1_2_2_1_3);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBounds(322, 528, 207, 60);
		contentPane.add(panel_2_3);
		
		JButton btnNewButton_6_1_3 = new JButton("M\u00E9xico >");
		btnNewButton_6_1_3.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_1_3.setBackground(Color.WHITE);
		btnNewButton_6_1_3.setBounds(0, 0, 148, 49);
		panel_2_3.add(btnNewButton_6_1_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Mexico.png"));
		lblNewLabel_1_3.setBounds(147, 0, 60, 49);
		panel_2_3.add(lblNewLabel_1_3);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(0, 50, 207, 10);
		panel_2_3.add(panel_1_1_2);
		
		JPanel panel_2_1_3 = new JPanel();
		panel_2_1_3.setLayout(null);
		panel_2_1_3.setBounds(589, 528, 207, 60);
		contentPane.add(panel_2_1_3);
		
		JButton btnNewButton_6_1_1_3 = new JButton("Brasil >");
		btnNewButton_6_1_1_3.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_6_1_1_3.setBackground(Color.WHITE);
		btnNewButton_6_1_1_3.setBounds(0, 0, 148, 49);
		panel_2_1_3.add(btnNewButton_6_1_1_3);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("");
		lblNewLabel_1_1_3.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Paises"+File.separator+"Brasil.png"));
		lblNewLabel_1_1_3.setBounds(147, 0, 60, 49);
		panel_2_1_3.add(lblNewLabel_1_1_3);
		
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
	}
}
