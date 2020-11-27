package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;

import javazoom.jl.decoder.JavaLayerException;
import logica.Controlador;

public class Inicio extends Cabecera {

	private JButton btnAlfaRomeo,btnAlphaTauri,btnNFerrari,btnHaas,btnMclaren,btnMercedes,btnRacingPonit,btnRedBull,btnRenault,btnWilliams;
	

	

	/**
	 * Launch the application.
	 * 
	 * @throws FileNotFoundException
	 * @throws JavaLayerException
	 */
//	public static void main(String[] args) throws FileNotFoundException {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Inicio frame = new Inicio();
//					frame.setVisible(true);
//
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Inicio() {
		
	}
public void  escuderia(Controlador controlador) {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 67, 849, 544);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panelAlfaRomeo = new JPanel();
		panelAlfaRomeo.setBackground(SystemColor.menu);
		panelAlfaRomeo.setBounds(30, 40, 180, 70);
		panel.add(panelAlfaRomeo);
		panelAlfaRomeo.setLayout(null);
		
		JLabel lblAlfaRomeo = new JLabel("Alfa Romeo");
		lblAlfaRomeo.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblAlfaRomeo.setBounds(0, 0, 120, 19);
		panelAlfaRomeo.add(lblAlfaRomeo);
		
		btnAlfaRomeo = new JButton("");
		btnAlfaRomeo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"AlfaRomeo.png"));
		btnAlfaRomeo.setBorder(null);
		btnAlfaRomeo.setBackground(Color.LIGHT_GRAY);
		btnAlfaRomeo.setBounds(0, 24, 180, 46);
		panelAlfaRomeo.add(btnAlfaRomeo);
		
		JPanel panelAlfaTauri = new JPanel();
		panelAlfaTauri.setLayout(null);
		panelAlfaTauri.setBounds(330, 40, 180, 70);
		panel.add(panelAlfaTauri);
		
		JLabel lblAlphaTauri = new JLabel("Alpha Tauri");
		lblAlphaTauri.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblAlphaTauri.setBounds(0, 0, 120, 19);
		panelAlfaTauri.add(lblAlphaTauri);
		
		btnAlphaTauri = new JButton("alpa");
		btnAlphaTauri.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"AlphaTauri.png"));
		btnAlphaTauri.setBorder(null);
		btnAlphaTauri.setBackground(Color.WHITE);
		btnAlphaTauri.setBounds(0, 24, 180, 46);
		btnAlphaTauri.addActionListener(controlador);
		panelAlfaTauri.add(btnAlphaTauri);
		
		JPanel panelFerrari = new JPanel();
		panelFerrari.setLayout(null);
		panelFerrari.setBounds(640, 40, 180, 70);
		panel.add(panelFerrari);
		
		JLabel lblFerrari = new JLabel("Ferrari");
		lblFerrari.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblFerrari.setBounds(0, 0, 120, 19);
		panelFerrari.add(lblFerrari);
		
		btnNFerrari = new JButton("");
		btnNFerrari.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"ferrari.png"));
		btnNFerrari.setBorder(null);
		btnNFerrari.setBackground(Color.WHITE);
		btnNFerrari.setBounds(0, 24, 180, 46);
		panelFerrari.add(btnNFerrari);
		
		JPanel panelHaas = new JPanel();
		panelHaas.setLayout(null);
		panelHaas.setBounds(30, 170, 180, 70);
		panel.add(panelHaas);
		
		JLabel lblHaas = new JLabel("Haas");
		lblHaas.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblHaas.setBounds(0, 0, 120, 19);
		panelHaas.add(lblHaas);
		
		btnHaas = new JButton("");
		btnHaas.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"haas.png"));
		btnHaas.setBorder(null);
		btnHaas.setBackground(Color.WHITE);
		btnHaas.setBounds(0, 24, 180, 46);
		panelHaas.add(btnHaas);
		
		JPanel panelMclaren = new JPanel();
		panelMclaren.setLayout(null);
		panelMclaren.setBounds(330, 170, 180, 70);
		panel.add(panelMclaren);
		
		JLabel lblMclaren = new JLabel("Mclaren");
		lblMclaren.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblMclaren.setBounds(0, 0, 120, 19);
		panelMclaren.add(lblMclaren);
		
		btnMclaren = new JButton("");
		btnMclaren.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Mclaren.png"));
		btnMclaren.setBorder(null);
		btnMclaren.setBackground(Color.WHITE);
		btnMclaren.setBounds(0, 24, 180, 46);
		panelMclaren.add(btnMclaren);
		
		JPanel panelMercedes = new JPanel();
		panelMercedes.setLayout(null);
		panelMercedes.setBounds(640, 170, 180, 70);
		panel.add(panelMercedes);
		
		JLabel lblMercedes = new JLabel("Mercedes");
		lblMercedes.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblMercedes.setBounds(0, 0, 120, 19);
		panelMercedes.add(lblMercedes);
		
		btnMercedes = new JButton("");
		btnMercedes.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Mercedes.png"));
		btnMercedes.setBorder(null);
		btnMercedes.setBackground(Color.WHITE);
		btnMercedes.setBounds(0, 24, 180, 46);
		panelMercedes.add(btnMercedes);
		
		JPanel panelRacingPoint = new JPanel();
		panelRacingPoint.setLayout(null);
		panelRacingPoint.setBounds(30, 310, 180, 70);
		panel.add(panelRacingPoint);
		
		JLabel lblRacingPoint = new JLabel("Racing Point");
		lblRacingPoint.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblRacingPoint.setBounds(0, 0, 120, 19);
		panelRacingPoint.add(lblRacingPoint);
		
		btnRacingPonit = new JButton("");
		btnRacingPonit.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"RacingPoint.png"));
		btnRacingPonit.setBorder(null);
		btnRacingPonit.setBackground(Color.WHITE);
		btnRacingPonit.setBounds(0, 24, 180, 46);
		panelRacingPoint.add(btnRacingPonit);
		
		JPanel panelRedBull = new JPanel();
		panelRedBull.setLayout(null);
		panelRedBull.setBounds(330, 310, 180, 70);
		panel.add(panelRedBull);
		
		JLabel lblRedBull = new JLabel("Red Bull");
		lblRedBull.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblRedBull.setBounds(0, 0, 120, 19);
		panelRedBull.add(lblRedBull);
		
		btnRedBull = new JButton("");
		btnRedBull.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"RedBull.png"));
		btnRedBull.setBorder(null);
		btnRedBull.setBackground(Color.WHITE);
		btnRedBull.setBounds(0, 24, 180, 46);
		panelRedBull.add(btnRedBull);
		
		JPanel panelRenault = new JPanel();
		panelRenault.setLayout(null);
		panelRenault.setBounds(640, 300, 180, 70);
		panel.add(panelRenault);
		
		JLabel lblRenault = new JLabel("Renault");
		lblRenault.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblRenault.setBounds(0, 0, 120, 19);
		panelRenault.add(lblRenault);
		
		btnRenault = new JButton("");
		btnRenault.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Renault.png"));
		btnRenault.setBorder(null);
		btnRenault.setBackground(Color.WHITE);
		btnRenault.setBounds(0, 24, 180, 46);
		panelRenault.add(btnRenault);
		
		JPanel panelWilliams = new JPanel();
		panelWilliams.setLayout(null);
		panelWilliams.setBounds(30, 440, 180, 70);
		panel.add(panelWilliams);
		
		JLabel lblWilliams = new JLabel("Williams");
		lblWilliams.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblWilliams.setBounds(0, 0, 120, 19);
		panelWilliams.add(lblWilliams);
		
		btnWilliams = new JButton("");
		btnWilliams.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"coches"+File.separator+"Williams.png"));
		btnWilliams.setBorder(null);
		btnWilliams.setBackground(Color.WHITE);
		btnWilliams.setBounds(0, 24, 180, 46);
		panelWilliams.add(btnWilliams);
		
		menu(controlador);
	}

	public void  inicio(Controlador controlador) {
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
		menu(controlador);
		
	}


}
