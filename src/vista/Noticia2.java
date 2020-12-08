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
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Noticia2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Noticia2 frame = new Noticia2();
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
	public Noticia2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Noticia2.class.getResource("/Imagenes/F1-logo-ventana.png")));
		setTitle("Mclaren reafirma su estrat\u00E9gia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 668);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrMclarenReafirmaSu = new JTextArea();
		txtrMclarenReafirmaSu.setForeground(Color.WHITE);
		txtrMclarenReafirmaSu.setEditable(false);
		txtrMclarenReafirmaSu.setWrapStyleWord(true);
		txtrMclarenReafirmaSu.setText("McLaren reafirma su estrategia");
		txtrMclarenReafirmaSu.setOpaque(false);
		txtrMclarenReafirmaSu.setLineWrap(true);
		txtrMclarenReafirmaSu.setFont(new Font("Bauhaus 93", Font.PLAIN, 25));
		txtrMclarenReafirmaSu.setBounds(46, 21, 352, 41);
		contentPane.add(txtrMclarenReafirmaSu);
		
		JLabel lblImagen1 = new JLabel("");
		lblImagen1.setIcon(new ImageIcon(Noticia2.class.getResource("/Imagenes/Noticias/Noticia2.jpg")));
		lblImagen1.setBounds(79, 72, 270, 152);
		contentPane.add(lblImagen1);
		
		JTextArea txtrMclarenSeDespide = new JTextArea();
		txtrMclarenSeDespide.setEditable(false);
		txtrMclarenSeDespide.setWrapStyleWord(true);
		txtrMclarenSeDespide.setText("McLaren se despide, pr\u00E1cticamente, del tercer puesto en constructores despu\u00E9s de que P\u00E9rez (1\u00BA) y Stroll (3\u00BA) subieran al podio de Sakhir. Desde el muro de Woking fijaron su estrategia en contener a Kvyat y Ricciardo, pero a Carlos Sainz se le escaparon el mexicano, su compa\u00F1ero y Ocon, y otro podio que pudo ser y no fue. El madrile\u00F1o, aun as\u00ED, termin\u00F3 satisfecho con su carrera en Bahr\u00E9in. Pero da la sensaci\u00F3n de que, una vez m\u00E1s, no capitalizaron una carrera loca a su favor por no tomar ciertos riesgos a la hora de efectuar los pit stop.");
		txtrMclarenSeDespide.setOpaque(false);
		txtrMclarenSeDespide.setLineWrap(true);
		txtrMclarenSeDespide.setForeground(Color.WHITE);
		txtrMclarenSeDespide.setFont(new Font("Calibri", Font.PLAIN, 19));
		txtrMclarenSeDespide.setBounds(21, 235, 405, 292);
		contentPane.add(txtrMclarenSeDespide);
		
		JButton btnNewButton = new JButton("ATRAS");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
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
