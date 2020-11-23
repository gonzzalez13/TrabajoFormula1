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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Clasificacion extends JFrame {

	private JPanel contentPane;
	private  JButton btnInicio,btnEscuderias,btnPilotos,btnGranPre,btnClasi,btnLogin,btnLogo;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(25, 138, 40, 24);
		contentPane.add(panel);
		
		JLabel label = new JLabel("1");
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 206, 209));
		panel_1.setBounds(64, 138, 25, 24);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Lewis Hamilton");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(89, 138, 100, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("95");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(229, 138, 46, 24);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(25, 161, 40, 24);
		contentPane.add(panel_2);
		
		JLabel label_1 = new JLabel("2");
		panel_2.add(label_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0, 0, 128));
		panel_1_1.setBounds(64, 161, 25, 24);
		contentPane.add(panel_1_1);
		
		JLabel lblMVerstappen = new JLabel("M. Verstappen");
		lblMVerstappen.setHorizontalAlignment(SwingConstants.CENTER);
		lblMVerstappen.setBounds(89, 161, 100, 24);
		contentPane.add(lblMVerstappen);
		
		JLabel lblNewLabel_1_1 = new JLabel("82");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(229, 161, 46, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(25, 184, 40, 24);
		contentPane.add(panel_3);
		
		JLabel label_2 = new JLabel("3");
		panel_3.add(label_2);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(255, 0, 0));
		panel_1_2.setBounds(64, 184, 25, 24);
		contentPane.add(panel_1_2);
		
		JLabel lblCLeclerc = new JLabel("C. Leclerc");
		lblCLeclerc.setHorizontalAlignment(SwingConstants.CENTER);
		lblCLeclerc.setBounds(89, 184, 100, 24);
		contentPane.add(lblCLeclerc);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("79");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(229, 184, 46, 24);
		contentPane.add(lblNewLabel_1_1_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(25, 207, 40, 24);
		contentPane.add(panel_4);
		
		JLabel label_3 = new JLabel("4");
		panel_4.add(label_3);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(new Color(0, 206, 209));
		panel_1_3.setBounds(64, 207, 25, 24);
		contentPane.add(panel_1_3);
		
		JLabel lblVBottas = new JLabel("V. Bottas");
		lblVBottas.setHorizontalAlignment(SwingConstants.CENTER);
		lblVBottas.setBounds(89, 207, 100, 24);
		contentPane.add(lblVBottas);
		
		JLabel lblNewLabel_1_2 = new JLabel("72");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(229, 207, 46, 24);
		contentPane.add(lblNewLabel_1_2);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBounds(25, 229, 40, 24);
		contentPane.add(panel_4_1);
		
		JLabel label_3_1 = new JLabel("5");
		panel_4_1.add(label_3_1);
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setBackground(new Color(255, 255, 0));
		panel_1_3_1.setBounds(64, 229, 25, 24);
		contentPane.add(panel_1_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("D. Ricciardo");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(89, 229, 100, 24);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("69");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setBounds(229, 229, 46, 24);
		contentPane.add(lblNewLabel_1_2_1);
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setBounds(25, 253, 40, 24);
		contentPane.add(panel_4_2);
		
		JLabel label_3_2 = new JLabel("6");
		panel_4_2.add(label_3_2);
		
		JPanel panel_1_3_2 = new JPanel();
		panel_1_3_2.setBackground(new Color(0, 206, 209));
		panel_1_3_2.setBounds(64, 253, 25, 24);
		contentPane.add(panel_1_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setBounds(89, 253, 100, 24);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("95");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setBounds(229, 253, 46, 24);
		contentPane.add(lblNewLabel_1_2_2);
		
		JPanel panel_4_3 = new JPanel();
		panel_4_3.setBounds(25, 277, 40, 24);
		contentPane.add(panel_4_3);
		
		JLabel label_3_3 = new JLabel("7");
		panel_4_3.add(label_3_3);
		
		JPanel panel_1_3_3 = new JPanel();
		panel_1_3_3.setBackground(new Color(0, 206, 209));
		panel_1_3_3.setBounds(64, 277, 25, 24);
		contentPane.add(panel_1_3_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setBounds(89, 277, 100, 24);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("95");
		lblNewLabel_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_3.setBounds(229, 277, 46, 24);
		contentPane.add(lblNewLabel_1_2_3);
		
		JPanel panel_4_4 = new JPanel();
		panel_4_4.setBounds(25, 299, 40, 24);
		contentPane.add(panel_4_4);
		
		JLabel label_3_4 = new JLabel("8");
		panel_4_4.add(label_3_4);
		
		JPanel panel_1_3_4 = new JPanel();
		panel_1_3_4.setBackground(new Color(0, 206, 209));
		panel_1_3_4.setBounds(64, 299, 25, 24);
		contentPane.add(panel_1_3_4);
		
		JLabel lblNewLabel_4_4 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_4.setBounds(89, 299, 100, 24);
		contentPane.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("95");
		lblNewLabel_1_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_4.setBounds(229, 299, 46, 24);
		contentPane.add(lblNewLabel_1_2_4);
		
		JPanel panel_4_5 = new JPanel();
		panel_4_5.setBounds(25, 320, 40, 24);
		contentPane.add(panel_4_5);
		
		JLabel label_3_5 = new JLabel("9");
		panel_4_5.add(label_3_5);
		
		JPanel panel_1_3_5 = new JPanel();
		panel_1_3_5.setBackground(new Color(0, 206, 209));
		panel_1_3_5.setBounds(64, 320, 25, 24);
		contentPane.add(panel_1_3_5);
		
		JLabel lblNewLabel_4_5 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5.setBounds(89, 320, 100, 24);
		contentPane.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_1_2_5 = new JLabel("95");
		lblNewLabel_1_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5.setBounds(229, 320, 46, 24);
		contentPane.add(lblNewLabel_1_2_5);
		
		JPanel panel_4_5_1 = new JPanel();
		panel_4_5_1.setBounds(25, 344, 40, 24);
		contentPane.add(panel_4_5_1);
		
		JLabel label_3_5_1 = new JLabel("10");
		panel_4_5_1.add(label_3_5_1);
		
		JPanel panel_1_3_5_1 = new JPanel();
		panel_1_3_5_1.setBackground(new Color(0, 206, 209));
		panel_1_3_5_1.setBounds(64, 344, 25, 24);
		contentPane.add(panel_1_3_5_1);
		
		JLabel lblNewLabel_4_5_1 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1.setBounds(89, 344, 100, 24);
		contentPane.add(lblNewLabel_4_5_1);
		
		JLabel lblNewLabel_1_2_5_1 = new JLabel("95");
		lblNewLabel_1_2_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5_1.setBounds(229, 344, 46, 24);
		contentPane.add(lblNewLabel_1_2_5_1);
		
		JPanel panel_4_5_1_1 = new JPanel();
		panel_4_5_1_1.setBounds(25, 366, 40, 24);
		contentPane.add(panel_4_5_1_1);
		
		JLabel label_3_5_1_1 = new JLabel("11");
		panel_4_5_1_1.add(label_3_5_1_1);
		
		JPanel panel_4_5_1_2 = new JPanel();
		panel_4_5_1_2.setBounds(25, 387, 40, 24);
		contentPane.add(panel_4_5_1_2);
		
		JLabel label_3_5_1_2 = new JLabel("12");
		panel_4_5_1_2.add(label_3_5_1_2);
		
		JPanel panel_4_5_1_3 = new JPanel();
		panel_4_5_1_3.setBounds(25, 409, 40, 24);
		contentPane.add(panel_4_5_1_3);
		
		JLabel label_3_5_1_3 = new JLabel("13");
		panel_4_5_1_3.add(label_3_5_1_3);
		
		JPanel panel_4_5_1_4 = new JPanel();
		panel_4_5_1_4.setBounds(25, 433, 40, 24);
		contentPane.add(panel_4_5_1_4);
		
		JLabel label_3_5_1_4 = new JLabel("14");
		panel_4_5_1_4.add(label_3_5_1_4);
		
		JPanel panel_4_5_1_5 = new JPanel();
		panel_4_5_1_5.setBounds(25, 456, 40, 24);
		contentPane.add(panel_4_5_1_5);
		
		JLabel label_3_5_1_5 = new JLabel("15");
		panel_4_5_1_5.add(label_3_5_1_5);
		
		JPanel panel_4_5_1_6 = new JPanel();
		panel_4_5_1_6.setBounds(25, 480, 40, 24);
		contentPane.add(panel_4_5_1_6);
		
		JLabel label_3_5_1_6 = new JLabel("16");
		panel_4_5_1_6.add(label_3_5_1_6);
		
		JPanel panel_1_3_5_1_1 = new JPanel();
		panel_1_3_5_1_1.setBackground(new Color(0, 206, 209));
		panel_1_3_5_1_1.setBounds(64, 366, 25, 24);
		contentPane.add(panel_1_3_5_1_1);
		
		JPanel panel_1_3_5_1_2 = new JPanel();
		panel_1_3_5_1_2.setBackground(new Color(0, 206, 209));
		panel_1_3_5_1_2.setBounds(64, 387, 25, 24);
		contentPane.add(panel_1_3_5_1_2);
		
		JPanel panel_1_3_5_1_3 = new JPanel();
		panel_1_3_5_1_3.setBackground(new Color(0, 206, 209));
		panel_1_3_5_1_3.setBounds(64, 409, 25, 24);
		contentPane.add(panel_1_3_5_1_3);
		
		JPanel panel_1_3_5_1_4 = new JPanel();
		panel_1_3_5_1_4.setBackground(new Color(0, 206, 209));
		panel_1_3_5_1_4.setBounds(64, 433, 25, 24);
		contentPane.add(panel_1_3_5_1_4);
		
		JPanel panel_1_3_5_1_5 = new JPanel();
		panel_1_3_5_1_5.setBackground(new Color(0, 206, 209));
		panel_1_3_5_1_5.setBounds(64, 456, 25, 24);
		contentPane.add(panel_1_3_5_1_5);
		
		JPanel panel_1_3_5_1_6 = new JPanel();
		panel_1_3_5_1_6.setBackground(new Color(0, 206, 209));
		panel_1_3_5_1_6.setBounds(64, 480, 25, 24);
		contentPane.add(panel_1_3_5_1_6);
		
		JLabel lblNewLabel_4_5_1_1 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1_1.setBounds(89, 366, 100, 24);
		contentPane.add(lblNewLabel_4_5_1_1);
		
		JLabel lblNewLabel_4_5_1_2 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1_2.setBounds(89, 387, 100, 24);
		contentPane.add(lblNewLabel_4_5_1_2);
		
		JLabel lblNewLabel_4_5_1_3 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1_3.setBounds(89, 409, 100, 24);
		contentPane.add(lblNewLabel_4_5_1_3);
		
		JLabel lblNewLabel_4_5_1_4 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1_4.setBounds(89, 433, 100, 24);
		contentPane.add(lblNewLabel_4_5_1_4);
		
		JLabel lblNewLabel_4_5_1_5 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1_5.setBounds(89, 456, 100, 24);
		contentPane.add(lblNewLabel_4_5_1_5);
		
		JLabel lblNewLabel_4_5_1_6 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1_6.setBounds(89, 480, 100, 24);
		contentPane.add(lblNewLabel_4_5_1_6);
		
		JLabel lblNewLabel_1_2_5_1_1 = new JLabel("95");
		lblNewLabel_1_2_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5_1_1.setBounds(229, 366, 46, 24);
		contentPane.add(lblNewLabel_1_2_5_1_1);
		
		JLabel lblNewLabel_1_2_5_1_2 = new JLabel("95");
		lblNewLabel_1_2_5_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5_1_2.setBounds(229, 387, 46, 24);
		contentPane.add(lblNewLabel_1_2_5_1_2);
		
		JLabel lblNewLabel_1_2_5_1_3 = new JLabel("95");
		lblNewLabel_1_2_5_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5_1_3.setBounds(229, 409, 46, 24);
		contentPane.add(lblNewLabel_1_2_5_1_3);
		
		JLabel lblNewLabel_1_2_5_1_4 = new JLabel("95");
		lblNewLabel_1_2_5_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5_1_4.setBounds(229, 433, 46, 24);
		contentPane.add(lblNewLabel_1_2_5_1_4);
		
		JLabel lblNewLabel_1_2_5_1_5 = new JLabel("95");
		lblNewLabel_1_2_5_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5_1_5.setBounds(229, 456, 46, 24);
		contentPane.add(lblNewLabel_1_2_5_1_5);
		
		JLabel lblNewLabel_1_2_5_1_6 = new JLabel("95");
		lblNewLabel_1_2_5_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5_1_6.setBounds(229, 480, 46, 24);
		contentPane.add(lblNewLabel_1_2_5_1_6);
		
		JLabel lblNewLabel_2 = new JLabel("P");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(25, 110, 40, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("NP");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(89, 108, 100, 29);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblPts = new JLabel("PTS");
		lblPts.setHorizontalAlignment(SwingConstants.CENTER);
		lblPts.setBounds(229, 108, 46, 29);
		contentPane.add(lblPts);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(441, 138, 40, 24);
		contentPane.add(panel_5);
		
		JLabel label_4 = new JLabel("1");
		panel_5.add(label_4);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBackground(new Color(0, 206, 209));
		panel_1_4.setBounds(478, 138, 25, 24);
		contentPane.add(panel_1_4);
		
		JLabel lblAmgMercedes = new JLabel("AMG Mercedes");
		lblAmgMercedes.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes.setBounds(502, 138, 100, 24);
		contentPane.add(lblAmgMercedes);
		
		JLabel lblNewLabel_1_3 = new JLabel("95");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(645, 138, 46, 24);
		contentPane.add(lblNewLabel_1_3);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBounds(441, 161, 40, 24);
		contentPane.add(panel_5_1);
		
		JLabel label_4_1 = new JLabel("1");
		panel_5_1.add(label_4_1);
		
		JPanel panel_1_4_1 = new JPanel();
		panel_1_4_1.setBackground(new Color(0, 206, 209));
		panel_1_4_1.setBounds(478, 161, 25, 24);
		contentPane.add(panel_1_4_1);
		
		JLabel lblAmgMercedes_1 = new JLabel("AMG Mercedes");
		lblAmgMercedes_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_1.setBounds(502, 161, 100, 24);
		contentPane.add(lblAmgMercedes_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("95");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setBounds(645, 161, 46, 24);
		contentPane.add(lblNewLabel_1_3_1);
		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setBounds(441, 184, 40, 24);
		contentPane.add(panel_5_2);
		
		JLabel label_4_2 = new JLabel("1");
		panel_5_2.add(label_4_2);
		
		JPanel panel_1_4_2 = new JPanel();
		panel_1_4_2.setBackground(new Color(0, 206, 209));
		panel_1_4_2.setBounds(478, 184, 25, 24);
		contentPane.add(panel_1_4_2);
		
		JLabel lblAmgMercedes_2 = new JLabel("AMG Mercedes");
		lblAmgMercedes_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_2.setBounds(502, 184, 100, 24);
		contentPane.add(lblAmgMercedes_2);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("95");
		lblNewLabel_1_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_2.setBounds(645, 184, 46, 24);
		contentPane.add(lblNewLabel_1_3_2);
		
		JPanel panel_5_3 = new JPanel();
		panel_5_3.setBounds(441, 207, 40, 24);
		contentPane.add(panel_5_3);
		
		JLabel label_4_3 = new JLabel("1");
		panel_5_3.add(label_4_3);
		
		JPanel panel_1_4_3 = new JPanel();
		panel_1_4_3.setBackground(new Color(0, 206, 209));
		panel_1_4_3.setBounds(478, 207, 25, 24);
		contentPane.add(panel_1_4_3);
		
		JLabel lblAmgMercedes_3 = new JLabel("AMG Mercedes");
		lblAmgMercedes_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_3.setBounds(502, 207, 100, 24);
		contentPane.add(lblAmgMercedes_3);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("95");
		lblNewLabel_1_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_3.setBounds(645, 207, 46, 24);
		contentPane.add(lblNewLabel_1_3_3);
		
		JPanel panel_5_4 = new JPanel();
		panel_5_4.setBounds(441, 229, 40, 24);
		contentPane.add(panel_5_4);
		
		JLabel label_4_4 = new JLabel("1");
		panel_5_4.add(label_4_4);
		
		JPanel panel_1_4_4 = new JPanel();
		panel_1_4_4.setBackground(new Color(0, 206, 209));
		panel_1_4_4.setBounds(478, 229, 25, 24);
		contentPane.add(panel_1_4_4);
		
		JLabel lblAmgMercedes_4 = new JLabel("AMG Mercedes");
		lblAmgMercedes_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_4.setBounds(502, 229, 100, 24);
		contentPane.add(lblAmgMercedes_4);
		
		JLabel lblNewLabel_1_3_4 = new JLabel("95");
		lblNewLabel_1_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_4.setBounds(645, 229, 46, 24);
		contentPane.add(lblNewLabel_1_3_4);
		
		JPanel panel_5_4_1 = new JPanel();
		panel_5_4_1.setBounds(441, 253, 40, 24);
		contentPane.add(panel_5_4_1);
		
		JLabel label_4_4_1 = new JLabel("1");
		panel_5_4_1.add(label_4_4_1);
		
		JPanel panel_1_4_4_1 = new JPanel();
		panel_1_4_4_1.setBackground(new Color(0, 206, 209));
		panel_1_4_4_1.setBounds(478, 253, 25, 24);
		contentPane.add(panel_1_4_4_1);
		
		JLabel lblAmgMercedes_4_1 = new JLabel("AMG Mercedes");
		lblAmgMercedes_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_4_1.setBounds(502, 253, 100, 24);
		contentPane.add(lblAmgMercedes_4_1);
		
		JLabel lblNewLabel_1_3_4_1 = new JLabel("95");
		lblNewLabel_1_3_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_4_1.setBounds(645, 253, 46, 24);
		contentPane.add(lblNewLabel_1_3_4_1);
		
		JPanel panel_5_4_2 = new JPanel();
		panel_5_4_2.setBounds(441, 277, 40, 24);
		contentPane.add(panel_5_4_2);
		
		JLabel label_4_4_2 = new JLabel("1");
		panel_5_4_2.add(label_4_4_2);
		
		JPanel panel_1_4_4_2 = new JPanel();
		panel_1_4_4_2.setBackground(new Color(0, 206, 209));
		panel_1_4_4_2.setBounds(478, 277, 25, 24);
		contentPane.add(panel_1_4_4_2);
		
		JLabel lblAmgMercedes_4_2 = new JLabel("AMG Mercedes");
		lblAmgMercedes_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_4_2.setBounds(502, 277, 100, 24);
		contentPane.add(lblAmgMercedes_4_2);
		
		JLabel lblNewLabel_1_3_4_2 = new JLabel("95");
		lblNewLabel_1_3_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_4_2.setBounds(645, 277, 46, 24);
		contentPane.add(lblNewLabel_1_3_4_2);
		
		JPanel panel_5_4_3 = new JPanel();
		panel_5_4_3.setBounds(441, 301, 40, 24);
		contentPane.add(panel_5_4_3);
		
		JLabel label_4_4_3 = new JLabel("1");
		panel_5_4_3.add(label_4_4_3);
		
		JPanel panel_5_4_4 = new JPanel();
		panel_5_4_4.setBounds(441, 325, 40, 24);
		contentPane.add(panel_5_4_4);
		
		JLabel label_4_4_4 = new JLabel("1");
		panel_5_4_4.add(label_4_4_4);
		
		JPanel panel_5_4_5 = new JPanel();
		panel_5_4_5.setBounds(441, 348, 40, 24);
		contentPane.add(panel_5_4_5);
		
		JLabel label_4_4_5 = new JLabel("1");
		panel_5_4_5.add(label_4_4_5);
		
		JPanel panel_1_4_4_3 = new JPanel();
		panel_1_4_4_3.setBackground(new Color(0, 206, 209));
		panel_1_4_4_3.setBounds(478, 301, 25, 24);
		contentPane.add(panel_1_4_4_3);
		
		JPanel panel_1_4_4_4 = new JPanel();
		panel_1_4_4_4.setBackground(new Color(0, 206, 209));
		panel_1_4_4_4.setBounds(478, 325, 25, 24);
		contentPane.add(panel_1_4_4_4);
		
		JPanel panel_1_4_4_5 = new JPanel();
		panel_1_4_4_5.setBackground(new Color(0, 206, 209));
		panel_1_4_4_5.setBounds(478, 348, 25, 24);
		contentPane.add(panel_1_4_4_5);
		
		JLabel lblAmgMercedes_4_5 = new JLabel("AMG Mercedes");
		lblAmgMercedes_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_4_5.setBounds(502, 301, 100, 24);
		contentPane.add(lblAmgMercedes_4_5);
		
		JLabel lblAmgMercedes_4_6 = new JLabel("AMG Mercedes");
		lblAmgMercedes_4_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_4_6.setBounds(502, 325, 100, 24);
		contentPane.add(lblAmgMercedes_4_6);
		
		JLabel lblAmgMercedes_4_7 = new JLabel("AMG Mercedes");
		lblAmgMercedes_4_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmgMercedes_4_7.setBounds(502, 348, 100, 24);
		contentPane.add(lblAmgMercedes_4_7);
		
		JLabel lblNewLabel_1_3_4_2_1 = new JLabel("95");
		lblNewLabel_1_3_4_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_4_2_1.setBounds(645, 299, 46, 24);
		contentPane.add(lblNewLabel_1_3_4_2_1);
		
		JLabel lblNewLabel_1_3_4_2_1_1 = new JLabel("95");
		lblNewLabel_1_3_4_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_4_2_1_1.setBounds(645, 325, 46, 24);
		contentPane.add(lblNewLabel_1_3_4_2_1_1);
		
		JLabel lblNewLabel_1_3_4_2_1_2 = new JLabel("95");
		lblNewLabel_1_3_4_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_4_2_1_2.setBounds(645, 348, 46, 24);
		contentPane.add(lblNewLabel_1_3_4_2_1_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(441, 138, 250, 234);
		contentPane.add(textArea_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("P");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(441, 110, 40, 24);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("CE");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(478, 115, 25, 19);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_6 = new JLabel("NE");
		lblNewLabel_4_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_6.setBounds(502, 115, 100, 19);
		contentPane.add(lblNewLabel_4_6);
		
		JLabel lblPts_1 = new JLabel("PTS");
		lblPts_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPts_1.setBounds(645, 115, 46, 19);
		contentPane.add(lblPts_1);
		
		JLabel lblNewLabel_5 = new JLabel("Siglas");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(441, 463, 250, 24);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("P = Puesto");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(441, 482, 250, 22);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("CE");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setBounds(64, 108, 25, 29);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("CE= Color Escuderia");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setBounds(441, 505, 250, 22);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("NE = Nombre Escuderia");
		lblNewLabel_6_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_1.setBounds(441, 551, 250, 22);
		contentPane.add(lblNewLabel_6_2_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("NP = Nombre Piloto");
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setBounds(441, 526, 250, 22);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_2_1_1 = new JLabel("PTS = Puntos");
		lblNewLabel_6_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_1_1.setBounds(441, 574, 250, 22);
		contentPane.add(lblNewLabel_6_2_1_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		textArea_2.setBounds(441, 463, 250, 133);
		contentPane.add(textArea_2);
		
		JPanel panel_4_5_1_6_1 = new JPanel();
		panel_4_5_1_6_1.setBounds(25, 572, 40, 24);
		contentPane.add(panel_4_5_1_6_1);
		
		JLabel label_3_5_1_6_1 = new JLabel("20");
		panel_4_5_1_6_1.add(label_3_5_1_6_1);
		
		JPanel panel_1_3_5_1_6_1 = new JPanel();
		panel_1_3_5_1_6_1.setBackground(new Color(0, 206, 209));
		panel_1_3_5_1_6_1.setBounds(64, 572, 25, 24);
		contentPane.add(panel_1_3_5_1_6_1);
		
		JLabel lblNewLabel_4_5_1_6_1 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5_1_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1_6_1.setBounds(89, 572, 100, 24);
		contentPane.add(lblNewLabel_4_5_1_6_1);
		
		JLabel lblNewLabel_1_2_5_1_6_1 = new JLabel("95");
		lblNewLabel_1_2_5_1_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5_1_6_1.setBounds(229, 572, 46, 24);
		contentPane.add(lblNewLabel_1_2_5_1_6_1);
		
		JPanel panel_4_5_1_6_2 = new JPanel();
		panel_4_5_1_6_2.setBounds(25, 549, 40, 24);
		contentPane.add(panel_4_5_1_6_2);
		
		JLabel label_3_5_1_6_2 = new JLabel("19");
		panel_4_5_1_6_2.add(label_3_5_1_6_2);
		
		JPanel panel_1_3_5_1_6_2 = new JPanel();
		panel_1_3_5_1_6_2.setBackground(new Color(0, 206, 209));
		panel_1_3_5_1_6_2.setBounds(64, 549, 25, 24);
		contentPane.add(panel_1_3_5_1_6_2);
		
		JLabel lblNewLabel_4_5_1_6_2 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5_1_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1_6_2.setBounds(89, 549, 100, 24);
		contentPane.add(lblNewLabel_4_5_1_6_2);
		
		JLabel lblNewLabel_1_2_5_1_6_2 = new JLabel("95");
		lblNewLabel_1_2_5_1_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5_1_6_2.setBounds(229, 549, 46, 24);
		contentPane.add(lblNewLabel_1_2_5_1_6_2);
		
		JPanel panel_4_5_1_6_3 = new JPanel();
		panel_4_5_1_6_3.setBounds(25, 526, 40, 24);
		contentPane.add(panel_4_5_1_6_3);
		
		JLabel label_3_5_1_6_3 = new JLabel("18");
		panel_4_5_1_6_3.add(label_3_5_1_6_3);
		
		JPanel panel_1_3_5_1_6_3 = new JPanel();
		panel_1_3_5_1_6_3.setBackground(new Color(0, 206, 209));
		panel_1_3_5_1_6_3.setBounds(64, 526, 25, 24);
		contentPane.add(panel_1_3_5_1_6_3);
		
		JLabel lblNewLabel_4_5_1_6_3 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5_1_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1_6_3.setBounds(89, 526, 100, 24);
		contentPane.add(lblNewLabel_4_5_1_6_3);
		
		JLabel lblNewLabel_1_2_5_1_6_3 = new JLabel("95");
		lblNewLabel_1_2_5_1_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5_1_6_3.setBounds(229, 526, 46, 24);
		contentPane.add(lblNewLabel_1_2_5_1_6_3);
		
		JPanel panel_4_5_1_6_4 = new JPanel();
		panel_4_5_1_6_4.setBounds(25, 503, 40, 24);
		contentPane.add(panel_4_5_1_6_4);
		
		JLabel label_3_5_1_6_4 = new JLabel("17");
		panel_4_5_1_6_4.add(label_3_5_1_6_4);
		
		JPanel panel_1_3_5_1_6_4 = new JPanel();
		panel_1_3_5_1_6_4.setBackground(new Color(0, 206, 209));
		panel_1_3_5_1_6_4.setBounds(64, 503, 25, 24);
		contentPane.add(panel_1_3_5_1_6_4);
		
		JLabel lblNewLabel_4_5_1_6_4 = new JLabel("Lewis Hamilton");
		lblNewLabel_4_5_1_6_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1_6_4.setBounds(89, 503, 100, 24);
		contentPane.add(lblNewLabel_4_5_1_6_4);
		
		JLabel lblNewLabel_1_2_5_1_6_4 = new JLabel("95");
		lblNewLabel_1_2_5_1_6_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5_1_6_4.setBounds(229, 503, 46, 24);
		contentPane.add(lblNewLabel_1_2_5_1_6_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(25, 138, 250, 458);
		contentPane.add(textArea);
		
		JPanel PanelMenu = new JPanel();
		PanelMenu.setLayout(null);
		PanelMenu.setBackground(Color.LIGHT_GRAY);
		PanelMenu.setBounds(0, 0, 849, 71);
		contentPane.add(PanelMenu);
		
		btnInicio = new JButton("Inicio");
		btnInicio.setForeground(Color.RED);
		btnInicio.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnInicio.setBackground(Color.DARK_GRAY);
		btnInicio.setBounds(144, 11, 74, 48);
		PanelMenu.add(btnInicio);
		
		btnEscuderias = new JButton("Escuderias");
		btnEscuderias.setForeground(Color.RED);
		btnEscuderias.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnEscuderias.setBackground(Color.DARK_GRAY);
		btnEscuderias.setBounds(226, 11, 112, 48);
		PanelMenu.add(btnEscuderias);
		
		btnPilotos = new JButton("Pilotos");
		btnPilotos.setForeground(Color.RED);
		btnPilotos.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnPilotos.setBackground(Color.DARK_GRAY);
		btnPilotos.setBounds(348, 11, 94, 48);
		PanelMenu.add(btnPilotos);
		
		btnGranPre = new JButton("Gran Premio");
		btnGranPre.setForeground(Color.RED);
		btnGranPre.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGranPre.setBackground(Color.DARK_GRAY);
		btnGranPre.setBounds(452, 11, 130, 48);
		PanelMenu.add(btnGranPre);
		
		btnClasi = new JButton("Clasificaciones");
		btnClasi.setForeground(Color.RED);
		btnClasi.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnClasi.setBackground(Color.DARK_GRAY);
		btnClasi.setBounds(592, 11, 145, 48);
		PanelMenu.add(btnClasi);
		
		btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.RED);
		btnLogin.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setBounds(747, 11, 92, 48);
		PanelMenu.add(btnLogin);
		
		btnLogo = new JButton("");
		btnLogo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"F1-logo.png"));
		btnLogo.setForeground(Color.LIGHT_GRAY);
		btnLogo.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogo.setBorder(null);
		btnLogo.setBackground(Color.LIGHT_GRAY);
		btnLogo.setBounds(10, 11, 124, 48);
		PanelMenu.add(btnLogo);
	}

	public JButton getBtnInicio() {
		return btnInicio;
	}

	public void setBtnInicio(JButton btnInicio) {
		this.btnInicio = btnInicio;
	}

	public JButton getBtnEscuderias() {
		return btnEscuderias;
	}

	public void setBtnEscuderias(JButton btnEscuderias) {
		this.btnEscuderias = btnEscuderias;
	}

	public JButton getBtnPilotos() {
		return btnPilotos;
	}

	public void setBtnPilotos(JButton btnPilotos) {
		this.btnPilotos = btnPilotos;
	}

	public JButton getBtnGranPre() {
		return btnGranPre;
	}

	public void setBtnGranPre(JButton btnGranPre) {
		this.btnGranPre = btnGranPre;
	}

	public JButton getBtnClasi() {
		return btnClasi;
	}

	public void setBtnClasi(JButton btnClasi) {
		this.btnClasi = btnClasi;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}

	public JButton getBtnLogo() {
		return btnLogo;
	}

	public void setBtnLogo(JButton btnLogo) {
		this.btnLogo = btnLogo;
	}
	
	
	
}
