package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Noticia extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Noticia frame = new Noticia();
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
	public Noticia() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Users\\Usuaio\\Interfaces\\TrabajoFormula1\\src\\Imagenes\\F1-logo-ventana.png"));
		setTitle("Bottas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 668);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrTitulo1 = new JTextArea();
		txtrTitulo1.setForeground(Color.WHITE);
		txtrTitulo1.setEditable(false);
		txtrTitulo1.setWrapStyleWord(true);
		txtrTitulo1.setText("Bottas: \"Los que no saben de F1 podr\u00EDan pensar que he quedado como un completo idiota\"");
		txtrTitulo1.setOpaque(false);
		txtrTitulo1.setLineWrap(true);
		txtrTitulo1.setFont(new Font("Bauhaus 93", Font.PLAIN, 25));
		txtrTitulo1.setBounds(39, 10, 370, 115);
		contentPane.add(txtrTitulo1);
		
		JTextArea txtrValtteriBottasSaba = new JTextArea();
		txtrValtteriBottasSaba.setEditable(false);
		txtrValtteriBottasSaba.setForeground(new Color(255, 255, 255));
		txtrValtteriBottasSaba.setWrapStyleWord(true);
		txtrValtteriBottasSaba.setText("Valtteri Bottas sab\u00EDa que iba a tener mucha presi\u00F3n en el Gran Premio de Sakhir. Desde el mismo momento que se hizo oficial que Lewis Hamilton hab\u00EDa positivo por coronavirus, el finland\u00E9s era consciente de que se jugaba mucho en el trazado alternativo del Circuito Internacional de Bahr\u00E9in. \"Si Russell me supera, obviamente voy a quedar mal\", admiti\u00F3. A la postre, ha quedado mal el finland\u00E9s... y Mercedes. El que ha salido reforzado es un George Russell, que ha demostrado madera de campe\u00F3n.");
		txtrValtteriBottasSaba.setOpaque(false);
		txtrValtteriBottasSaba.setLineWrap(true);
		txtrValtteriBottasSaba.setFont(new Font("Calibri", Font.PLAIN, 19));
		txtrValtteriBottasSaba.setBounds(20, 307, 405, 274);
		contentPane.add(txtrValtteriBottasSaba);
		
		JLabel lblImagen1 = new JLabel("");
		lblImagen1.setIcon(new ImageIcon(Noticia.class.getResource("/Imagenes/Noticias/Noticia.jpg")));
		lblImagen1.setBounds(76, 129, 277, 156);
		contentPane.add(lblImagen1);
		
		JButton btnNewButton = new JButton("ATRAS");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));
		btnNewButton.setBounds(20, 591, 93, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.PNG"));
		lblFondo.setBounds(0, 0, 445, 629);
		contentPane.add(lblFondo);
	}
}
