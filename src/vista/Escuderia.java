package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Font;

public class Escuderia extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Escuderia frame = new Escuderia();
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
	public Escuderia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 67, 849, 544);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panelAlfaRomeo = new JPanel();
		panelAlfaRomeo.setBackground(Color.WHITE);
		panelAlfaRomeo.setBounds(10, 46, 180, 70);
		panel.add(panelAlfaRomeo);
		panelAlfaRomeo.setLayout(null);
		
		JLabel lblAlfaRomeo = new JLabel("Alfa Romeo");
		lblAlfaRomeo.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblAlfaRomeo.setBounds(0, 0, 120, 19);
		panelAlfaRomeo.add(lblAlfaRomeo);
		
		JButton btnAlfaRomeo = new JButton("");
		btnAlfaRomeo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlfaRomeo.setIcon(new ImageIcon("src/Imagenes/coches/AlfaRomeo.png"));
		btnAlfaRomeo.setBorder(null);
		btnAlfaRomeo.setBackground(Color.WHITE);
		btnAlfaRomeo.setBounds(0, 24, 180, 46);
		panelAlfaRomeo.add(btnAlfaRomeo);
		
		JPanel panelAlfaTauri = new JPanel();
		panelAlfaTauri.setLayout(null);
		panelAlfaTauri.setBounds(260, 46, 180, 70);
		panel.add(panelAlfaTauri);
		
		JLabel lblAlphaTauri = new JLabel("Alpha Tauri");
		lblAlphaTauri.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblAlphaTauri.setBounds(0, 0, 120, 19);
		panelAlfaTauri.add(lblAlphaTauri);
		
		JButton btnAlphaTauri = new JButton("");
		btnAlphaTauri.setIcon(new ImageIcon("src/Imagenes/coches/AlphaTauri.png"));
		btnAlphaTauri.setBorder(null);
		btnAlphaTauri.setBackground(Color.WHITE);
		btnAlphaTauri.setBounds(0, 24, 180, 46);
		panelAlfaTauri.add(btnAlphaTauri);
		
		JPanel panelFerrari = new JPanel();
		panelFerrari.setLayout(null);
		panelFerrari.setBounds(500, 46, 180, 70);
		panel.add(panelFerrari);
		
		JLabel lblFerrari = new JLabel("Ferrari");
		lblFerrari.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblFerrari.setBounds(0, 0, 120, 19);
		panelFerrari.add(lblFerrari);
		
		JButton btnNewButton_6_2 = new JButton("");
		btnNewButton_6_2.setIcon(new ImageIcon("src/Imagenes/coches/ferrari.png"));
		btnNewButton_6_2.setBorder(null);
		btnNewButton_6_2.setBackground(Color.WHITE);
		btnNewButton_6_2.setBounds(0, 24, 180, 46);
		panelFerrari.add(btnNewButton_6_2);
		
		JPanel panelHaas = new JPanel();
		panelHaas.setLayout(null);
		panelHaas.setBounds(10, 127, 180, 70);
		panel.add(panelHaas);
		
		JLabel lblHaas = new JLabel("Haas");
		lblHaas.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblHaas.setBounds(0, 0, 120, 19);
		panelHaas.add(lblHaas);
		
		JButton btnHaas = new JButton("");
		btnHaas.setIcon(new ImageIcon("src/Imagenes/coches/haas.png"));
		btnHaas.setBorder(null);
		btnHaas.setBackground(Color.WHITE);
		btnHaas.setBounds(0, 24, 180, 46);
		panelHaas.add(btnHaas);
		
		JPanel panelMclaren = new JPanel();
		panelMclaren.setLayout(null);
		panelMclaren.setBounds(260, 127, 180, 70);
		panel.add(panelMclaren);
		
		JLabel lblMclaren = new JLabel("Mclaren");
		lblMclaren.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblMclaren.setBounds(0, 0, 120, 19);
		panelMclaren.add(lblMclaren);
		
		JButton btnMclaren = new JButton("");
		btnMclaren.setIcon(new ImageIcon("src/Imagenes/coches/Mclaren.png"));
		btnMclaren.setBorder(null);
		btnMclaren.setBackground(Color.WHITE);
		btnMclaren.setBounds(0, 24, 180, 46);
		panelMclaren.add(btnMclaren);
		
		JPanel panelMercedes = new JPanel();
		panelMercedes.setLayout(null);
		panelMercedes.setBounds(500, 127, 180, 70);
		panel.add(panelMercedes);
		
		JLabel lblMercedes = new JLabel("Mercedes");
		lblMercedes.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblMercedes.setBounds(0, 0, 120, 19);
		panelMercedes.add(lblMercedes);
		
		JButton btnMercedes = new JButton("");
		btnMercedes.setIcon(new ImageIcon("src/Imagenes/coches/Mercedes.png"));
		btnMercedes.setBorder(null);
		btnMercedes.setBackground(Color.WHITE);
		btnMercedes.setBounds(0, 24, 180, 46);
		panelMercedes.add(btnMercedes);
		
		JPanel panelRacingPoint = new JPanel();
		panelRacingPoint.setLayout(null);
		panelRacingPoint.setBounds(10, 208, 180, 70);
		panel.add(panelRacingPoint);
		
		JLabel lblRacingPoint = new JLabel("Racing Point");
		lblRacingPoint.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblRacingPoint.setBounds(0, 0, 120, 19);
		panelRacingPoint.add(lblRacingPoint);
		
		JButton btnRacingPonit = new JButton("");
		btnRacingPonit.setIcon(new ImageIcon("src/Imagenes/coches/RacingPoint.png"));
		btnRacingPonit.setBorder(null);
		btnRacingPonit.setBackground(Color.WHITE);
		btnRacingPonit.setBounds(0, 24, 180, 46);
		panelRacingPoint.add(btnRacingPonit);
		
		JPanel panelRedBull = new JPanel();
		panelRedBull.setLayout(null);
		panelRedBull.setBounds(260, 208, 180, 70);
		panel.add(panelRedBull);
		
		JLabel lblRedBull = new JLabel("Red Bull");
		lblRedBull.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblRedBull.setBounds(0, 0, 120, 19);
		panelRedBull.add(lblRedBull);
		
		JButton btnRedBull = new JButton("");
		btnRedBull.setIcon(new ImageIcon("src/Imagenes/coches/RedBull.png"));
		btnRedBull.setBorder(null);
		btnRedBull.setBackground(Color.WHITE);
		btnRedBull.setBounds(0, 24, 180, 46);
		panelRedBull.add(btnRedBull);
		
		JPanel panelRenault = new JPanel();
		panelRenault.setLayout(null);
		panelRenault.setBounds(500, 208, 180, 70);
		panel.add(panelRenault);
		
		JLabel lblRenault = new JLabel("Renault");
		lblRenault.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblRenault.setBounds(0, 0, 120, 19);
		panelRenault.add(lblRenault);
		
		JButton btnRenault = new JButton("");
		btnRenault.setIcon(new ImageIcon("src/Imagenes/coches/Renault.png"));
		btnRenault.setBorder(null);
		btnRenault.setBackground(Color.WHITE);
		btnRenault.setBounds(0, 24, 180, 46);
		panelRenault.add(btnRenault);
		
		JPanel panelWilliams = new JPanel();
		panelWilliams.setLayout(null);
		panelWilliams.setBounds(10, 289, 180, 70);
		panel.add(panelWilliams);
		
		JLabel lblWilliams = new JLabel("Williams");
		lblWilliams.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblWilliams.setBounds(0, 0, 120, 19);
		panelWilliams.add(lblWilliams);
		
		JButton btnWilliams = new JButton("");
		btnWilliams.setIcon(new ImageIcon("src/Imagenes/coches/Williams.png"));
		btnWilliams.setBorder(null);
		btnWilliams.setBackground(Color.WHITE);
		btnWilliams.setBounds(0, 24, 180, 46);
		panelWilliams.add(btnWilliams);
		
		JPanel PanelMenu = new JPanel();
		PanelMenu.setLayout(null);
		PanelMenu.setBackground(Color.LIGHT_GRAY);
		PanelMenu.setBounds(0, 0, 849, 71);
		contentPane.add(PanelMenu);
		
		JButton btnNewButton_4 = new JButton("Inicio");
		btnNewButton_4.setForeground(Color.RED);
		btnNewButton_4.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_4.setBackground(Color.DARK_GRAY);
		btnNewButton_4.setBounds(144, 11, 74, 48);
		PanelMenu.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("Escuderias");
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setBounds(226, 11, 112, 48);
		PanelMenu.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Pilotos");
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setBounds(348, 11, 94, 48);
		PanelMenu.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Gran Premio");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(452, 11, 130, 48);
		PanelMenu.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Clasificaciones");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(592, 11, 145, 48);
		PanelMenu.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("Login");
		btnNewButton_5.setForeground(Color.RED);
		btnNewButton_5.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_5.setBackground(Color.DARK_GRAY);
		btnNewButton_5.setBounds(747, 11, 92, 48);
		PanelMenu.add(btnNewButton_5);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("E:\\Users\\Usuaio\\Interfaces\\TrabajoFormula1\\src\\Imagenes\\F1-logo.png"));
		lblNewLabel_4.setBounds(0, 11, 134, 48);
		PanelMenu.add(lblNewLabel_4);
	}
}
