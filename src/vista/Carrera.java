package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Carrera extends JFrame {

	private JPanel contentPane;

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
		
		JButton btnNPosicion = new JButton("1");
		btnNPosicion.setBackground(Color.WHITE);
		btnNPosicion.setForeground(Color.RED);
		btnNPosicion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNPosicion.setBounds(31, 44, 46, 50);
		contentPane.add(btnNPosicion);
		
		JLabel lblNombrePiloto = new JLabel("");
		lblNombrePiloto.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombrePiloto.setBounds(135, 44, 105, 50);
		contentPane.add(lblNombrePiloto);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alu01-dam2\\eclipse-workspace\\Formula1\\src\\img\\renault.jpg"));
		lblNewLabel.setBounds(79, 44, 46, 50);
		contentPane.add(lblNewLabel);
	}

}
