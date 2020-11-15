package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Clasificacion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clasificacion frame = new Clasificacion();
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
	public Clasificacion() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(25, 33, 40, 24);
		contentPane.add(panel);
		
		JLabel label = new JLabel("1");
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 206, 209));
		panel_1.setBounds(64, 33, 25, 24);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Lewis Hamilton");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(89, 33, 100, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("95");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(229, 33, 46, 24);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(25, 55, 40, 24);
		contentPane.add(panel_2);
		
		JLabel label_1 = new JLabel("2");
		panel_2.add(label_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0, 0, 128));
		panel_1_1.setBounds(64, 55, 25, 24);
		contentPane.add(panel_1_1);
		
		JLabel lblMVerstappen = new JLabel("M. Verstappen");
		lblMVerstappen.setHorizontalAlignment(SwingConstants.CENTER);
		lblMVerstappen.setBounds(89, 55, 100, 24);
		contentPane.add(lblMVerstappen);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(25, 79, 40, 24);
		contentPane.add(panel_3);
		
		JLabel label_2 = new JLabel("3");
		panel_3.add(label_2);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(255, 0, 0));
		panel_1_2.setBounds(64, 79, 25, 24);
		contentPane.add(panel_1_2);
		
		JLabel lblCLeclerc = new JLabel("C. Leclerc");
		lblCLeclerc.setHorizontalAlignment(SwingConstants.CENTER);
		lblCLeclerc.setBounds(89, 79, 100, 24);
		contentPane.add(lblCLeclerc);
		
		JLabel lblNewLabel_1_1 = new JLabel("82");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(229, 58, 46, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("79");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(229, 79, 46, 24);
		contentPane.add(lblNewLabel_1_1_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(25, 103, 40, 24);
		contentPane.add(panel_4);
		
		JLabel label_3 = new JLabel("4");
		panel_4.add(label_3);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(new Color(0, 206, 209));
		panel_1_3.setBounds(64, 103, 25, 24);
		contentPane.add(panel_1_3);
		
		JLabel lblVBottas = new JLabel("V. Bottas");
		lblVBottas.setHorizontalAlignment(SwingConstants.CENTER);
		lblVBottas.setBounds(89, 103, 100, 24);
		contentPane.add(lblVBottas);
		
		JLabel lblNewLabel_1_2 = new JLabel("72");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(229, 103, 46, 24);
		contentPane.add(lblNewLabel_1_2);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBounds(25, 126, 40, 24);
		contentPane.add(panel_4_1);
		
		JLabel label_3_1 = new JLabel("5");
		panel_4_1.add(label_3_1);
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setBackground(new Color(255, 255, 0));
		panel_1_3_1.setBounds(64, 126, 25, 24);
		contentPane.add(panel_1_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("D. Ricciardo");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(89, 126, 100, 24);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("69");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setBounds(229, 126, 46, 24);
		contentPane.add(lblNewLabel_1_2_1);
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setBounds(25, 150, 40, 24);
		contentPane.add(panel_4_2);
		
		JLabel label_3_2 = new JLabel("6");
		panel_4_2.add(label_3_2);
		
		JPanel panel_1_3_2 = new JPanel();
		panel_1_3_2.setBackground(new Color(0, 206, 209));
		panel_1_3_2.setBounds(64, 150, 25, 24);
		contentPane.add(panel_1_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setBounds(89, 150, 100, 24);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("95");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setBounds(229, 150, 46, 24);
		contentPane.add(lblNewLabel_1_2_2);
		
		JPanel panel_4_3 = new JPanel();
		panel_4_3.setBounds(25, 174, 40, 24);
		contentPane.add(panel_4_3);
		
		JLabel label_3_3 = new JLabel("7");
		panel_4_3.add(label_3_3);
		
		JPanel panel_1_3_3 = new JPanel();
		panel_1_3_3.setBackground(new Color(0, 206, 209));
		panel_1_3_3.setBounds(64, 174, 25, 24);
		contentPane.add(panel_1_3_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setBounds(89, 174, 100, 24);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("95");
		lblNewLabel_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_3.setBounds(229, 174, 46, 24);
		contentPane.add(lblNewLabel_1_2_3);
		
		JPanel panel_4_4 = new JPanel();
		panel_4_4.setBounds(25, 197, 40, 24);
		contentPane.add(panel_4_4);
		
		JLabel label_3_4 = new JLabel("8");
		panel_4_4.add(label_3_4);
		
		JPanel panel_1_3_4 = new JPanel();
		panel_1_3_4.setBackground(new Color(0, 206, 209));
		panel_1_3_4.setBounds(64, 197, 25, 24);
		contentPane.add(panel_1_3_4);
		
		JLabel lblNewLabel_4_4 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_4.setBounds(89, 197, 100, 24);
		contentPane.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("95");
		lblNewLabel_1_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_4.setBounds(229, 197, 46, 24);
		contentPane.add(lblNewLabel_1_2_4);
		
		JPanel panel_4_5 = new JPanel();
		panel_4_5.setBounds(25, 219, 40, 24);
		contentPane.add(panel_4_5);
		
		JLabel label_3_5 = new JLabel("9");
		panel_4_5.add(label_3_5);
		
		JPanel panel_1_3_5 = new JPanel();
		panel_1_3_5.setBackground(new Color(0, 206, 209));
		panel_1_3_5.setBounds(64, 219, 25, 24);
		contentPane.add(panel_1_3_5);
		
		JLabel lblNewLabel_4_5 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5.setBounds(89, 219, 100, 24);
		contentPane.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_1_2_5 = new JLabel("95");
		lblNewLabel_1_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5.setBounds(229, 219, 46, 24);
		contentPane.add(lblNewLabel_1_2_5);
		
		JPanel panel_4_5_1 = new JPanel();
		panel_4_5_1.setBounds(25, 243, 40, 24);
		contentPane.add(panel_4_5_1);
		
		JLabel label_3_5_1 = new JLabel("10");
		panel_4_5_1.add(label_3_5_1);
		
		JPanel panel_1_3_5_1 = new JPanel();
		panel_1_3_5_1.setBackground(new Color(0, 206, 209));
		panel_1_3_5_1.setBounds(64, 243, 25, 24);
		contentPane.add(panel_1_3_5_1);
		
		JLabel lblNewLabel_4_5_1 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1.setBounds(89, 243, 100, 24);
		contentPane.add(lblNewLabel_4_5_1);
		
		JLabel lblNewLabel_1_2_5_1 = new JLabel("95");
		lblNewLabel_1_2_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5_1.setBounds(229, 243, 46, 24);
		contentPane.add(lblNewLabel_1_2_5_1);
		
		JPanel panel_4_5_1_1 = new JPanel();
		panel_4_5_1_1.setBounds(25, 267, 40, 24);
		contentPane.add(panel_4_5_1_1);
		
		JLabel label_3_5_1_1 = new JLabel("11");
		panel_4_5_1_1.add(label_3_5_1_1);
		
		JPanel panel_4_5_1_2 = new JPanel();
		panel_4_5_1_2.setBounds(25, 291, 40, 24);
		contentPane.add(panel_4_5_1_2);
		
		JLabel label_3_5_1_2 = new JLabel("12");
		panel_4_5_1_2.add(label_3_5_1_2);
		
		JPanel panel_4_5_1_3 = new JPanel();
		panel_4_5_1_3.setBounds(25, 315, 40, 24);
		contentPane.add(panel_4_5_1_3);
		
		JLabel label_3_5_1_3 = new JLabel("13");
		panel_4_5_1_3.add(label_3_5_1_3);
		
		JPanel panel_4_5_1_4 = new JPanel();
		panel_4_5_1_4.setBounds(25, 339, 40, 24);
		contentPane.add(panel_4_5_1_4);
		
		JLabel label_3_5_1_4 = new JLabel("14");
		panel_4_5_1_4.add(label_3_5_1_4);
		
		JPanel panel_4_5_1_5 = new JPanel();
		panel_4_5_1_5.setBounds(25, 363, 40, 24);
		contentPane.add(panel_4_5_1_5);
		
		JLabel label_3_5_1_5 = new JLabel("15");
		panel_4_5_1_5.add(label_3_5_1_5);
		
		JPanel panel_4_5_1_6 = new JPanel();
		panel_4_5_1_6.setBounds(25, 387, 40, 24);
		contentPane.add(panel_4_5_1_6);
		
		JLabel label_3_5_1_6 = new JLabel("16");
		panel_4_5_1_6.add(label_3_5_1_6);
		
		JPanel panel_1_3_5_1_1 = new JPanel();
		panel_1_3_5_1_1.setBackground(new Color(0, 206, 209));
		panel_1_3_5_1_1.setBounds(64, 267, 25, 24);
		contentPane.add(panel_1_3_5_1_1);
		
		JPanel panel_1_3_5_1_2 = new JPanel();
		panel_1_3_5_1_2.setBackground(new Color(0, 206, 209));
		panel_1_3_5_1_2.setBounds(64, 291, 25, 24);
		contentPane.add(panel_1_3_5_1_2);
		
		JPanel panel_1_3_5_1_3 = new JPanel();
		panel_1_3_5_1_3.setBackground(new Color(0, 206, 209));
		panel_1_3_5_1_3.setBounds(64, 315, 25, 24);
		contentPane.add(panel_1_3_5_1_3);
		
		JPanel panel_1_3_5_1_4 = new JPanel();
		panel_1_3_5_1_4.setBackground(new Color(0, 206, 209));
		panel_1_3_5_1_4.setBounds(64, 339, 25, 24);
		contentPane.add(panel_1_3_5_1_4);
		
		JPanel panel_1_3_5_1_5 = new JPanel();
		panel_1_3_5_1_5.setBackground(new Color(0, 206, 209));
		panel_1_3_5_1_5.setBounds(64, 363, 25, 24);
		contentPane.add(panel_1_3_5_1_5);
		
		JPanel panel_1_3_5_1_6 = new JPanel();
		panel_1_3_5_1_6.setBackground(new Color(0, 206, 209));
		panel_1_3_5_1_6.setBounds(64, 387, 25, 24);
		contentPane.add(panel_1_3_5_1_6);
		
		JLabel lblNewLabel_4_5_1_1 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1_1.setBounds(89, 267, 100, 24);
		contentPane.add(lblNewLabel_4_5_1_1);
		
		JLabel lblNewLabel_4_5_1_2 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1_2.setBounds(89, 291, 100, 24);
		contentPane.add(lblNewLabel_4_5_1_2);
		
		JLabel lblNewLabel_4_5_1_3 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1_3.setBounds(89, 315, 100, 24);
		contentPane.add(lblNewLabel_4_5_1_3);
		
		JLabel lblNewLabel_4_5_1_4 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1_4.setBounds(89, 339, 100, 24);
		contentPane.add(lblNewLabel_4_5_1_4);
		
		JLabel lblNewLabel_4_5_1_5 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1_5.setBounds(89, 363, 100, 24);
		contentPane.add(lblNewLabel_4_5_1_5);
		
		JLabel lblNewLabel_4_5_1_6 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1_6.setBounds(89, 387, 100, 24);
		contentPane.add(lblNewLabel_4_5_1_6);
		
		JLabel lblNewLabel_1_2_5_1_1 = new JLabel("95");
		lblNewLabel_1_2_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5_1_1.setBounds(229, 267, 46, 24);
		contentPane.add(lblNewLabel_1_2_5_1_1);
		
		JLabel lblNewLabel_1_2_5_1_2 = new JLabel("95");
		lblNewLabel_1_2_5_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5_1_2.setBounds(229, 291, 46, 24);
		contentPane.add(lblNewLabel_1_2_5_1_2);
		
		JLabel lblNewLabel_1_2_5_1_3 = new JLabel("95");
		lblNewLabel_1_2_5_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5_1_3.setBounds(229, 315, 46, 24);
		contentPane.add(lblNewLabel_1_2_5_1_3);
		
		JLabel lblNewLabel_1_2_5_1_4 = new JLabel("95");
		lblNewLabel_1_2_5_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5_1_4.setBounds(229, 339, 46, 24);
		contentPane.add(lblNewLabel_1_2_5_1_4);
		
		JLabel lblNewLabel_1_2_5_1_5 = new JLabel("95");
		lblNewLabel_1_2_5_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5_1_5.setBounds(229, 363, 46, 24);
		contentPane.add(lblNewLabel_1_2_5_1_5);
		
		JLabel lblNewLabel_1_2_5_1_6 = new JLabel("95");
		lblNewLabel_1_2_5_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5_1_6.setBounds(229, 387, 46, 24);
		contentPane.add(lblNewLabel_1_2_5_1_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(25, 34, 250, 377);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_2 = new JLabel("P");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(25, 11, 40, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("NP");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(89, 16, 100, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblPts = new JLabel("PTS");
		lblPts.setHorizontalAlignment(SwingConstants.CENTER);
		lblPts.setBounds(229, 16, 46, 14);
		contentPane.add(lblPts);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(441, 33, 40, 24);
		contentPane.add(panel_5);
		
		JLabel label_4 = new JLabel("1");
		panel_5.add(label_4);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBackground(new Color(0, 206, 209));
		panel_1_4.setBounds(478, 33, 25, 24);
		contentPane.add(panel_1_4);
		
		JLabel lblAmgMercedes = new JLabel("AMG Mercedes");
		lblAmgMercedes.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes.setBounds(502, 33, 100, 24);
		contentPane.add(lblAmgMercedes);
		
		JLabel lblNewLabel_1_3 = new JLabel("95");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(645, 33, 46, 24);
		contentPane.add(lblNewLabel_1_3);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBounds(441, 55, 40, 24);
		contentPane.add(panel_5_1);
		
		JLabel label_4_1 = new JLabel("1");
		panel_5_1.add(label_4_1);
		
		JPanel panel_1_4_1 = new JPanel();
		panel_1_4_1.setBackground(new Color(0, 206, 209));
		panel_1_4_1.setBounds(478, 55, 25, 24);
		contentPane.add(panel_1_4_1);
		
		JLabel lblAmgMercedes_1 = new JLabel("AMG Mercedes");
		lblAmgMercedes_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_1.setBounds(502, 55, 100, 24);
		contentPane.add(lblAmgMercedes_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("95");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setBounds(645, 55, 46, 24);
		contentPane.add(lblNewLabel_1_3_1);
		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setBounds(441, 79, 40, 24);
		contentPane.add(panel_5_2);
		
		JLabel label_4_2 = new JLabel("1");
		panel_5_2.add(label_4_2);
		
		JPanel panel_1_4_2 = new JPanel();
		panel_1_4_2.setBackground(new Color(0, 206, 209));
		panel_1_4_2.setBounds(478, 79, 25, 24);
		contentPane.add(panel_1_4_2);
		
		JLabel lblAmgMercedes_2 = new JLabel("AMG Mercedes");
		lblAmgMercedes_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_2.setBounds(502, 79, 100, 24);
		contentPane.add(lblAmgMercedes_2);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("95");
		lblNewLabel_1_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_2.setBounds(645, 79, 46, 24);
		contentPane.add(lblNewLabel_1_3_2);
		
		JPanel panel_5_3 = new JPanel();
		panel_5_3.setBounds(441, 103, 40, 24);
		contentPane.add(panel_5_3);
		
		JLabel label_4_3 = new JLabel("1");
		panel_5_3.add(label_4_3);
		
		JPanel panel_1_4_3 = new JPanel();
		panel_1_4_3.setBackground(new Color(0, 206, 209));
		panel_1_4_3.setBounds(478, 103, 25, 24);
		contentPane.add(panel_1_4_3);
		
		JLabel lblAmgMercedes_3 = new JLabel("AMG Mercedes");
		lblAmgMercedes_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_3.setBounds(502, 103, 100, 24);
		contentPane.add(lblAmgMercedes_3);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("95");
		lblNewLabel_1_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_3.setBounds(645, 103, 46, 24);
		contentPane.add(lblNewLabel_1_3_3);
		
		JPanel panel_5_4 = new JPanel();
		panel_5_4.setBounds(441, 126, 40, 24);
		contentPane.add(panel_5_4);
		
		JLabel label_4_4 = new JLabel("1");
		panel_5_4.add(label_4_4);
		
		JPanel panel_1_4_4 = new JPanel();
		panel_1_4_4.setBackground(new Color(0, 206, 209));
		panel_1_4_4.setBounds(478, 126, 25, 24);
		contentPane.add(panel_1_4_4);
		
		JLabel lblAmgMercedes_4 = new JLabel("AMG Mercedes");
		lblAmgMercedes_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_4.setBounds(502, 126, 100, 24);
		contentPane.add(lblAmgMercedes_4);
		
		JLabel lblNewLabel_1_3_4 = new JLabel("95");
		lblNewLabel_1_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_4.setBounds(645, 126, 46, 24);
		contentPane.add(lblNewLabel_1_3_4);
		
		JPanel panel_5_4_1 = new JPanel();
		panel_5_4_1.setBounds(441, 150, 40, 24);
		contentPane.add(panel_5_4_1);
		
		JLabel label_4_4_1 = new JLabel("1");
		panel_5_4_1.add(label_4_4_1);
		
		JPanel panel_1_4_4_1 = new JPanel();
		panel_1_4_4_1.setBackground(new Color(0, 206, 209));
		panel_1_4_4_1.setBounds(478, 150, 25, 24);
		contentPane.add(panel_1_4_4_1);
		
		JLabel lblAmgMercedes_4_1 = new JLabel("AMG Mercedes");
		lblAmgMercedes_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_4_1.setBounds(502, 150, 100, 24);
		contentPane.add(lblAmgMercedes_4_1);
		
		JLabel lblNewLabel_1_3_4_1 = new JLabel("95");
		lblNewLabel_1_3_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_4_1.setBounds(645, 150, 46, 24);
		contentPane.add(lblNewLabel_1_3_4_1);
		
		JPanel panel_5_4_2 = new JPanel();
		panel_5_4_2.setBounds(441, 174, 40, 24);
		contentPane.add(panel_5_4_2);
		
		JLabel label_4_4_2 = new JLabel("1");
		panel_5_4_2.add(label_4_4_2);
		
		JPanel panel_1_4_4_2 = new JPanel();
		panel_1_4_4_2.setBackground(new Color(0, 206, 209));
		panel_1_4_4_2.setBounds(478, 174, 25, 24);
		contentPane.add(panel_1_4_4_2);
		
		JLabel lblAmgMercedes_4_2 = new JLabel("AMG Mercedes");
		lblAmgMercedes_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_4_2.setBounds(502, 174, 100, 24);
		contentPane.add(lblAmgMercedes_4_2);
		
		JLabel lblNewLabel_1_3_4_2 = new JLabel("95");
		lblNewLabel_1_3_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_4_2.setBounds(645, 174, 46, 24);
		contentPane.add(lblNewLabel_1_3_4_2);
		
		JPanel panel_5_4_3 = new JPanel();
		panel_5_4_3.setBounds(441, 197, 40, 24);
		contentPane.add(panel_5_4_3);
		
		JLabel label_4_4_3 = new JLabel("1");
		panel_5_4_3.add(label_4_4_3);
		
		JPanel panel_5_4_4 = new JPanel();
		panel_5_4_4.setBounds(441, 219, 40, 24);
		contentPane.add(panel_5_4_4);
		
		JLabel label_4_4_4 = new JLabel("1");
		panel_5_4_4.add(label_4_4_4);
		
		JPanel panel_5_4_5 = new JPanel();
		panel_5_4_5.setBounds(441, 243, 40, 24);
		contentPane.add(panel_5_4_5);
		
		JLabel label_4_4_5 = new JLabel("1");
		panel_5_4_5.add(label_4_4_5);
		
		JPanel panel_1_4_4_3 = new JPanel();
		panel_1_4_4_3.setBackground(new Color(0, 206, 209));
		panel_1_4_4_3.setBounds(478, 197, 25, 24);
		contentPane.add(panel_1_4_4_3);
		
		JPanel panel_1_4_4_4 = new JPanel();
		panel_1_4_4_4.setBackground(new Color(0, 206, 209));
		panel_1_4_4_4.setBounds(478, 219, 25, 24);
		contentPane.add(panel_1_4_4_4);
		
		JPanel panel_1_4_4_5 = new JPanel();
		panel_1_4_4_5.setBackground(new Color(0, 206, 209));
		panel_1_4_4_5.setBounds(478, 243, 25, 24);
		contentPane.add(panel_1_4_4_5);
		
		JLabel lblAmgMercedes_4_3 = new JLabel("AMG Mercedes");
		lblAmgMercedes_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_4_3.setBounds(502, 150, 100, 24);
		contentPane.add(lblAmgMercedes_4_3);
		
		JLabel lblAmgMercedes_4_4 = new JLabel("AMG Mercedes");
		lblAmgMercedes_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_4_4.setBounds(502, 174, 100, 24);
		contentPane.add(lblAmgMercedes_4_4);
		
		JLabel lblAmgMercedes_4_5 = new JLabel("AMG Mercedes");
		lblAmgMercedes_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_4_5.setBounds(502, 197, 100, 24);
		contentPane.add(lblAmgMercedes_4_5);
		
		JLabel lblAmgMercedes_4_6 = new JLabel("AMG Mercedes");
		lblAmgMercedes_4_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_4_6.setBounds(502, 219, 100, 24);
		contentPane.add(lblAmgMercedes_4_6);
		
		JLabel lblAmgMercedes_4_7 = new JLabel("AMG Mercedes");
		lblAmgMercedes_4_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_4_7.setBounds(502, 243, 100, 24);
		contentPane.add(lblAmgMercedes_4_7);
		
		JLabel lblNewLabel_1_3_4_2_1 = new JLabel("95");
		lblNewLabel_1_3_4_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_4_2_1.setBounds(645, 197, 46, 24);
		contentPane.add(lblNewLabel_1_3_4_2_1);
		
		JLabel lblNewLabel_1_3_4_2_1_1 = new JLabel("95");
		lblNewLabel_1_3_4_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_4_2_1_1.setBounds(645, 219, 46, 24);
		contentPane.add(lblNewLabel_1_3_4_2_1_1);
		
		JLabel lblNewLabel_1_3_4_2_1_2 = new JLabel("95");
		lblNewLabel_1_3_4_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_4_2_1_2.setBounds(645, 243, 46, 24);
		contentPane.add(lblNewLabel_1_3_4_2_1_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(441, 33, 250, 234);
		contentPane.add(textArea_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("P");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(441, 11, 40, 24);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("CE");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(478, 16, 25, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_6 = new JLabel("NE");
		lblNewLabel_4_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_6.setBounds(502, 16, 100, 14);
		contentPane.add(lblNewLabel_4_6);
		
		JLabel lblPts_1 = new JLabel("PTS");
		lblPts_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPts_1.setBounds(645, 16, 46, 14);
		contentPane.add(lblPts_1);
		
		JLabel lblNewLabel_5 = new JLabel("Siglas");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(441, 277, 250, 24);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("P = Puesto");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(441, 301, 250, 22);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("CE");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setBounds(64, 16, 25, 14);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("CE= Color Escuderia");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setBounds(441, 320, 250, 22);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("NE = Nombre Escuderia");
		lblNewLabel_6_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_1.setBounds(441, 368, 250, 22);
		contentPane.add(lblNewLabel_6_2_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("NP = Nombre Piloto");
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setBounds(441, 344, 250, 22);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_2_1_1 = new JLabel("PTS = Puntos");
		lblNewLabel_6_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_1_1.setBounds(441, 389, 250, 22);
		contentPane.add(lblNewLabel_6_2_1_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		textArea_2.setBounds(441, 278, 250, 133);
		contentPane.add(textArea_2);
	}
}
