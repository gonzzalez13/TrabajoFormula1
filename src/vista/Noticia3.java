package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Noticia3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Noticia3 frame = new Noticia3();
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
	public Noticia3() {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(Noticia2.class.getResource("/Imagenes/F1-logo-ventana.png")));
		setTitle("Mercedes se llena de dudas con Bottas ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 668);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrMercedesSeLlena = new JTextArea();
		txtrMercedesSeLlena.setForeground(Color.WHITE);
		txtrMercedesSeLlena.setEditable(false);
		txtrMercedesSeLlena.setWrapStyleWord(true);
		txtrMercedesSeLlena.setText("Mercedes se llena de dudas con Bottas y salpican a Hamilton");
		txtrMercedesSeLlena.setOpaque(false);
		txtrMercedesSeLlena.setLineWrap(true);
		txtrMercedesSeLlena.setFont(new Font("Bauhaus 93", Font.PLAIN, 25));
		txtrMercedesSeLlena.setBounds(39, 20, 368, 69);
		contentPane.add(txtrMercedesSeLlena);
		
		JLabel lblImagen1 = new JLabel("");
		lblImagen1.setIcon(new ImageIcon(Noticia3.class.getResource("/Imagenes/Noticias/Noticia3.jpg")));
		lblImagen1.setBounds(94, 108, 241, 136);
		contentPane.add(lblImagen1);
		
		JTextArea txtrElAoDe = new JTextArea();
		txtrElAoDe.setEditable(false);
		txtrElAoDe.setWrapStyleWord(true);
		txtrElAoDe.setText("El a\u00F1o de los r\u00E9cords termina repleto de dudas en el garaje de Mercedes, y eso que una concatenaci\u00F3n de errores dej\u00F3 sin victoria a Russell con el coche de Hamilton. Le pusieron las ruedas de Bottas (lo corrigieron en la vuelta siguiente, pero la multa es de 20.000 euros) y al finland\u00E9s no le cambiaron las suyas. El octavo y noveno final no representa lo que se vivi\u00F3 en el GP de Sakhir: el novato ingl\u00E9s fue m\u00E1s r\u00E1pido que el veterano finland\u00E9s en todas las situaciones y eso abre la caja de Pandora: \u00BFpor qu\u00E9 no est\u00E1 ya en Mercedes? \u00BFPodr\u00EDa hacer sombra a Hamilton?");
		txtrElAoDe.setOpaque(false);
		txtrElAoDe.setLineWrap(true);
		txtrElAoDe.setForeground(Color.WHITE);
		txtrElAoDe.setFont(new Font("Calibri", Font.PLAIN, 19));
		txtrElAoDe.setBounds(21, 254, 405, 292);
		contentPane.add(txtrElAoDe);
		
		JButton btnNewButton = new JButton("ATRAS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(21, 588, 93, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.PNG"));
		lblFondo.setBounds(0, 0, 445, 629);
		contentPane.add(lblFondo);
	}
	

}
