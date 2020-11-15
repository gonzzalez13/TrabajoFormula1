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
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Carrera extends JFrame {

	private JPanel contentPane;
	private JScrollPane scroll;

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
		setBounds(100, 100, 770, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblP1 = new JLabel("Fernando Alonso");
		lblP1.setBounds(111, 58, 105, 24);
		contentPane.add(lblP1);
		
		JPanel pP2 = new JPanel();
		pP2.setBounds(34, 82, 54, 24);
		contentPane.add(pP2);
		
		JLabel label_1 = new JLabel("2");
		pP2.add(label_1);
		
		JPanel pP3 = new JPanel();
		pP3.setBounds(34, 106, 54, 24);
		contentPane.add(pP3);
		
		JLabel label_1_1 = new JLabel("3");
		pP3.add(label_1_1);
		
		JPanel pP4 = new JPanel();
		pP4.setBounds(34, 129, 54, 24);
		contentPane.add(pP4);
		
		JLabel label_1_2 = new JLabel("4");
		pP4.add(label_1_2);
		
		JPanel pP5 = new JPanel();
		pP5.setBounds(34, 153, 54, 24);
		contentPane.add(pP5);
		
		JLabel label_1_3 = new JLabel("5");
		pP5.add(label_1_3);
		
		JPanel pP6 = new JPanel();
		pP6.setBounds(34, 177, 54, 24);
		contentPane.add(pP6);
		
		JLabel label_1_4 = new JLabel("6");
		pP6.add(label_1_4);
		
		JPanel pP7 = new JPanel();
		pP7.setBounds(34, 201, 54, 24);
		contentPane.add(pP7);
		
		JLabel label_1_5 = new JLabel("7");
		pP7.add(label_1_5);
		
		JPanel pP8 = new JPanel();
		pP8.setBounds(34, 225, 54, 24);
		contentPane.add(pP8);
		
		JLabel label_1_6 = new JLabel("8");
		pP8.add(label_1_6);
		
		JPanel pP9 = new JPanel();
		pP9.setBounds(34, 249, 54, 24);
		contentPane.add(pP9);
		
		JLabel label_1_7 = new JLabel("9");
		pP9.add(label_1_7);
		
		JPanel pPC2 = new JPanel();
		pPC2.setBackground(new Color(0, 206, 209));
		pPC2.setBounds(84, 82, 24, 24);
		contentPane.add(pPC2);
		
		JPanel pPC3 = new JPanel();
		pPC3.setBackground(new Color(0, 0, 128));
		pPC3.setBounds(84, 106, 24, 24);
		contentPane.add(pPC3);
		
		JPanel pPC4 = new JPanel();
		pPC4.setBackground(new Color(255, 0, 0));
		pPC4.setBounds(84, 129, 24, 24);
		contentPane.add(pPC4);
		
		JPanel pPC5 = new JPanel();
		pPC5.setBackground(Color.YELLOW);
		pPC5.setBounds(84, 153, 24, 24);
		contentPane.add(pPC5);
		
		JPanel pPC6 = new JPanel();
		pPC6.setBackground(new Color(0, 206, 209));
		pPC6.setBounds(84, 177, 24, 24);
		contentPane.add(pPC6);
		
		JPanel pPC7 = new JPanel();
		pPC7.setBackground(new Color(255, 20, 147));
		pPC7.setBounds(84, 201, 24, 24);
		contentPane.add(pPC7);
		
		JPanel pPC8 = new JPanel();
		pPC8.setBackground(new Color(255, 140, 0));
		pPC8.setBounds(84, 225, 24, 24);
		contentPane.add(pPC8);
		
		JPanel pPC9 = new JPanel();
		pPC9.setBackground(new Color(0, 0, 128));
		pPC9.setBounds(84, 249, 24, 24);
		contentPane.add(pPC9);
		
		JLabel lblP2 = new JLabel("Lewis Hamilton");
		lblP2.setBounds(111, 82, 105, 24);
		contentPane.add(lblP2);
		
		JLabel lblP3 = new JLabel("Marc Verstappen");
		lblP3.setBounds(111, 106, 105, 24);
		contentPane.add(lblP3);
		
		JLabel lblP4 = new JLabel("C. Leclerc");
		lblP4.setBounds(111, 129, 105, 24);
		contentPane.add(lblP4);
		
		JLabel lblP5 = new JLabel("D. Ricciardo");
		lblP5.setBounds(111, 153, 105, 24);
		contentPane.add(lblP5);
		
		JLabel lblP6 = new JLabel("V. Bottas");
		lblP6.setBounds(111, 177, 105, 24);
		contentPane.add(lblP6);
		
		JLabel lblP7 = new JLabel("S. Perez");
		lblP7.setBounds(111, 201, 105, 24);
		contentPane.add(lblP7);
		
		JLabel lblP8 = new JLabel("L. Norris");
		lblP8.setBounds(111, 226, 105, 24);
		contentPane.add(lblP8);
		
		JLabel lblP9 = new JLabel("A. Albon");
		lblP9.setBounds(111, 249, 105, 24);
		contentPane.add(lblP9);
		
		JPanel pP1 = new JPanel();
		pP1.setBounds(34, 58, 54, 24);
		contentPane.add(pP1);
		
		JLabel label_1_8 = new JLabel("1");
		pP1.add(label_1_8);
		
		JPanel pPC1 = new JPanel();
		pPC1.setBackground(Color.YELLOW);
		pPC1.setBounds(84, 58, 24, 24);
		contentPane.add(pPC1);
		
		JPanel pP10 = new JPanel();
		pP10.setBounds(34, 272, 54, 24);
		contentPane.add(pP10);
		
		JLabel label_1_7_1 = new JLabel("10");
		pP10.add(label_1_7_1);
		
		JPanel pPC10 = new JPanel();
		pPC10.setBackground(new Color(255, 140, 0));
		pPC10.setBounds(84, 272, 24, 24);
		contentPane.add(pPC10);
		
		JLabel lblP10 = new JLabel("C. Sainz");
		lblP10.setBounds(111, 272, 105, 24);
		contentPane.add(lblP10);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(306, 58, 17, 238);
		contentPane.add(scrollBar);
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(34, 58, 289, 238);
		contentPane.add(textArea);
		

		

	}
}
