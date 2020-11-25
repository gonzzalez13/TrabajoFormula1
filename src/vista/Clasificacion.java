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
		
		JPanel pP1 = new JPanel();
		pP1.setBounds(25, 138, 40, 24);
		contentPane.add(pP1);
		
		JLabel label = new JLabel("1");
		pP1.add(label);
		
		JPanel pPC1 = new JPanel();
		pPC1.setBackground(new Color(0, 206, 209));
		pPC1.setBounds(64, 138, 25, 24);
		contentPane.add(pPC1);
		
		JLabel lblP1 = new JLabel("Lewis Hamilton");
		lblP1.setHorizontalAlignment(SwingConstants.CENTER);
		lblP1.setBounds(89, 138, 100, 24);
		contentPane.add(lblP1);
		
		JLabel PTS1 = new JLabel("95");
		PTS1.setHorizontalAlignment(SwingConstants.CENTER);
		PTS1.setBounds(229, 138, 46, 24);
		contentPane.add(PTS1);
		
		JPanel pP2 = new JPanel();
		pP2.setBounds(25, 161, 40, 24);
		contentPane.add(pP2);
		
		JLabel label_1 = new JLabel("2");
		pP2.add(label_1);
		
		JPanel pPC2 = new JPanel();
		pPC2.setBackground(new Color(0, 0, 128));
		pPC2.setBounds(64, 161, 25, 24);
		contentPane.add(pPC2);
		
		JLabel lblP2 = new JLabel("M. Verstappen");
		lblP2.setHorizontalAlignment(SwingConstants.CENTER);
		lblP2.setBounds(89, 161, 100, 24);
		contentPane.add(lblP2);
		
		JLabel PTS2 = new JLabel("82");
		PTS2.setHorizontalAlignment(SwingConstants.CENTER);
		PTS2.setBounds(229, 161, 46, 24);
		contentPane.add(PTS2);
		
		JPanel pP3 = new JPanel();
		pP3.setBounds(25, 184, 40, 24);
		contentPane.add(pP3);
		
		JLabel label_2 = new JLabel("3");
		pP3.add(label_2);
		
		JPanel pPC3 = new JPanel();
		pPC3.setBackground(new Color(255, 0, 0));
		pPC3.setBounds(64, 184, 25, 24);
		contentPane.add(pPC3);
		
		JLabel lblP3 = new JLabel("C. Leclerc");
		lblP3.setHorizontalAlignment(SwingConstants.CENTER);
		lblP3.setBounds(89, 184, 100, 24);
		contentPane.add(lblP3);
		
		JLabel PTS3 = new JLabel("79");
		PTS3.setHorizontalAlignment(SwingConstants.CENTER);
		PTS3.setBounds(229, 184, 46, 24);
		contentPane.add(PTS3);
		
		JPanel pP4 = new JPanel();
		pP4.setBounds(25, 207, 40, 24);
		contentPane.add(pP4);
		
		JLabel label_3 = new JLabel("4");
		pP4.add(label_3);
		
		JPanel pPC4 = new JPanel();
		pPC4.setBackground(new Color(0, 206, 209));
		pPC4.setBounds(64, 207, 25, 24);
		contentPane.add(pPC4);
		
		JLabel lblP4 = new JLabel("V. Bottas");
		lblP4.setHorizontalAlignment(SwingConstants.CENTER);
		lblP4.setBounds(89, 207, 100, 24);
		contentPane.add(lblP4);
		
		JLabel PTS4 = new JLabel("72");
		PTS4.setHorizontalAlignment(SwingConstants.CENTER);
		PTS4.setBounds(229, 207, 46, 24);
		contentPane.add(PTS4);
		
		JPanel pP5 = new JPanel();
		pP5.setBounds(25, 229, 40, 24);
		contentPane.add(pP5);
		
		JLabel label_3_1 = new JLabel("5");
		pP5.add(label_3_1);
		
		JPanel pPC5 = new JPanel();
		pPC5.setBackground(new Color(255, 255, 0));
		pPC5.setBounds(64, 229, 25, 24);
		contentPane.add(pPC5);
		
		JLabel lblP5 = new JLabel("D. Ricciardo");
		lblP5.setHorizontalAlignment(SwingConstants.CENTER);
		lblP5.setBounds(89, 229, 100, 24);
		contentPane.add(lblP5);
		
		JLabel PTS5 = new JLabel("69");
		PTS5.setHorizontalAlignment(SwingConstants.CENTER);
		PTS5.setBounds(229, 229, 46, 24);
		contentPane.add(PTS5);
		
		JPanel pP6 = new JPanel();
		pP6.setBounds(25, 253, 40, 24);
		contentPane.add(pP6);
		
		JLabel label_3_2 = new JLabel("6");
		pP6.add(label_3_2);
		
		JPanel pPC6 = new JPanel();
		pPC6.setBackground(new Color(0, 206, 209));
		pPC6.setBounds(64, 253, 25, 24);
		contentPane.add(pPC6);
		
		JLabel lblP6 = new JLabel("Lewis Hamilton");
		lblP6.setHorizontalAlignment(SwingConstants.CENTER);
		lblP6.setBounds(89, 253, 100, 24);
		contentPane.add(lblP6);
		
		JLabel PTS6 = new JLabel("95");
		PTS6.setHorizontalAlignment(SwingConstants.CENTER);
		PTS6.setBounds(229, 253, 46, 24);
		contentPane.add(PTS6);
		
		JPanel pP7 = new JPanel();
		pP7.setBounds(25, 277, 40, 24);
		contentPane.add(pP7);
		
		JLabel label_3_3 = new JLabel("7");
		pP7.add(label_3_3);
		
		JPanel pPC7 = new JPanel();
		pPC7.setBackground(new Color(0, 206, 209));
		pPC7.setBounds(64, 277, 25, 24);
		contentPane.add(pPC7);
		
		JLabel lblP7 = new JLabel("Lewis Hamilton");
		lblP7.setHorizontalAlignment(SwingConstants.CENTER);
		lblP7.setBounds(89, 277, 100, 24);
		contentPane.add(lblP7);
		
		JLabel PTS7 = new JLabel("95");
		PTS7.setHorizontalAlignment(SwingConstants.CENTER);
		PTS7.setBounds(229, 277, 46, 24);
		contentPane.add(PTS7);
		
		JPanel pP8 = new JPanel();
		pP8.setBounds(25, 299, 40, 24);
		contentPane.add(pP8);
		
		JLabel label_3_4 = new JLabel("8");
		pP8.add(label_3_4);
		
		JPanel pPC8 = new JPanel();
		pPC8.setBackground(new Color(0, 206, 209));
		pPC8.setBounds(64, 299, 25, 24);
		contentPane.add(pPC8);
		
		JLabel lblP8 = new JLabel("Lewis Hamilton");
		lblP8.setHorizontalAlignment(SwingConstants.CENTER);
		lblP8.setBounds(89, 299, 100, 24);
		contentPane.add(lblP8);
		
		JLabel PTS8 = new JLabel("95");
		PTS8.setHorizontalAlignment(SwingConstants.CENTER);
		PTS8.setBounds(229, 299, 46, 24);
		contentPane.add(PTS8);
		
		JPanel pP9 = new JPanel();
		pP9.setBounds(25, 320, 40, 24);
		contentPane.add(pP9);
		
		JLabel label_3_5 = new JLabel("9");
		pP9.add(label_3_5);
		
		JPanel pPC9 = new JPanel();
		pPC9.setBackground(new Color(0, 206, 209));
		pPC9.setBounds(64, 320, 25, 24);
		contentPane.add(pPC9);
		
		JLabel lblP9 = new JLabel("Lewis Hamilton");
		lblP9.setHorizontalAlignment(SwingConstants.CENTER);
		lblP9.setBounds(89, 320, 100, 24);
		contentPane.add(lblP9);
		
		JLabel PTS9 = new JLabel("95");
		PTS9.setHorizontalAlignment(SwingConstants.CENTER);
		PTS9.setBounds(229, 320, 46, 24);
		contentPane.add(PTS9);
		
		JPanel pP10 = new JPanel();
		pP10.setBounds(25, 344, 40, 24);
		contentPane.add(pP10);
		
		JLabel label_3_5_1 = new JLabel("10");
		pP10.add(label_3_5_1);
		
		JPanel pPC10 = new JPanel();
		pPC10.setBackground(new Color(0, 206, 209));
		pPC10.setBounds(64, 344, 25, 24);
		contentPane.add(pPC10);
		
		JLabel lblP10 = new JLabel("Lewis Hamilton");
		lblP10.setHorizontalAlignment(SwingConstants.CENTER);
		lblP10.setBounds(89, 344, 100, 24);
		contentPane.add(lblP10);
		
		JLabel PTS10 = new JLabel("95");
		PTS10.setHorizontalAlignment(SwingConstants.CENTER);
		PTS10.setBounds(229, 344, 46, 24);
		contentPane.add(PTS10);
		
		JPanel pP11 = new JPanel();
		pP11.setBounds(25, 366, 40, 24);
		contentPane.add(pP11);
		
		JLabel label_3_5_1_1 = new JLabel("11");
		pP11.add(label_3_5_1_1);
		
		JPanel pP12 = new JPanel();
		pP12.setBounds(25, 387, 40, 24);
		contentPane.add(pP12);
		
		JLabel label_3_5_1_2 = new JLabel("12");
		pP12.add(label_3_5_1_2);
		
		JPanel pP13 = new JPanel();
		pP13.setBounds(25, 409, 40, 24);
		contentPane.add(pP13);
		
		JLabel label_3_5_1_3 = new JLabel("13");
		pP13.add(label_3_5_1_3);
		
		JPanel pP14 = new JPanel();
		pP14.setBounds(25, 433, 40, 24);
		contentPane.add(pP14);
		
		JLabel label_3_5_1_4 = new JLabel("14");
		pP14.add(label_3_5_1_4);
		
		JPanel pP15 = new JPanel();
		pP15.setBounds(25, 456, 40, 24);
		contentPane.add(pP15);
		
		JLabel label_3_5_1_5 = new JLabel("15");
		pP15.add(label_3_5_1_5);
		
		JPanel pP16 = new JPanel();
		pP16.setBounds(25, 480, 40, 24);
		contentPane.add(pP16);
		
		JLabel label_3_5_1_6 = new JLabel("16");
		pP16.add(label_3_5_1_6);
		
		JPanel pPC11 = new JPanel();
		pPC11.setBackground(new Color(0, 206, 209));
		pPC11.setBounds(64, 366, 25, 24);
		contentPane.add(pPC11);
		
		JPanel pPC12 = new JPanel();
		pPC12.setBackground(new Color(0, 206, 209));
		pPC12.setBounds(64, 387, 25, 24);
		contentPane.add(pPC12);
		
		JPanel pPC13 = new JPanel();
		pPC13.setBackground(new Color(0, 206, 209));
		pPC13.setBounds(64, 409, 25, 24);
		contentPane.add(pPC13);
		
		JPanel pPC14 = new JPanel();
		pPC14.setBackground(new Color(0, 206, 209));
		pPC14.setBounds(64, 433, 25, 24);
		contentPane.add(pPC14);
		
		JPanel pPC15 = new JPanel();
		pPC15.setBackground(new Color(0, 206, 209));
		pPC15.setBounds(64, 456, 25, 24);
		contentPane.add(pPC15);
		
		JPanel pPC16 = new JPanel();
		pPC16.setBackground(new Color(0, 206, 209));
		pPC16.setBounds(64, 480, 25, 24);
		contentPane.add(pPC16);
		
		JLabel lblP11 = new JLabel("Lewis Hamilton");
		lblP11.setHorizontalAlignment(SwingConstants.CENTER);
		lblP11.setBounds(89, 366, 100, 24);
		contentPane.add(lblP11);
		
		JLabel lblP12 = new JLabel("Lewis Hamilton");
		lblP12.setHorizontalAlignment(SwingConstants.CENTER);
		lblP12.setBounds(89, 387, 100, 24);
		contentPane.add(lblP12);
		
		JLabel lblP13 = new JLabel("Lewis Hamilton");
		lblP13.setHorizontalAlignment(SwingConstants.CENTER);
		lblP13.setBounds(89, 409, 100, 24);
		contentPane.add(lblP13);
		
		JLabel lblP14 = new JLabel("Lewis Hamilton");
		lblP14.setHorizontalAlignment(SwingConstants.CENTER);
		lblP14.setBounds(89, 433, 100, 24);
		contentPane.add(lblP14);
		
		JLabel lblP15 = new JLabel("Lewis Hamilton");
		lblP15.setHorizontalAlignment(SwingConstants.CENTER);
		lblP15.setBounds(89, 456, 100, 24);
		contentPane.add(lblP15);
		
		JLabel lblP16 = new JLabel("Lewis Hamilton");
		lblP16.setHorizontalAlignment(SwingConstants.CENTER);
		lblP16.setBounds(89, 480, 100, 24);
		contentPane.add(lblP16);
		
		JLabel PTS11 = new JLabel("95");
		PTS11.setHorizontalAlignment(SwingConstants.CENTER);
		PTS11.setBounds(229, 366, 46, 24);
		contentPane.add(PTS11);
		
		JLabel PTS12 = new JLabel("95");
		PTS12.setHorizontalAlignment(SwingConstants.CENTER);
		PTS12.setBounds(229, 387, 46, 24);
		contentPane.add(PTS12);
		
		JLabel PTS13 = new JLabel("95");
		PTS13.setHorizontalAlignment(SwingConstants.CENTER);
		PTS13.setBounds(229, 409, 46, 24);
		contentPane.add(PTS13);
		
		JLabel PTS14 = new JLabel("95");
		PTS14.setHorizontalAlignment(SwingConstants.CENTER);
		PTS14.setBounds(229, 433, 46, 24);
		contentPane.add(PTS14);
		
		JLabel PTS15 = new JLabel("95");
		PTS15.setHorizontalAlignment(SwingConstants.CENTER);
		PTS15.setBounds(229, 456, 46, 24);
		contentPane.add(PTS15);
		
		JLabel PTS16 = new JLabel("95");
		PTS16.setHorizontalAlignment(SwingConstants.CENTER);
		PTS16.setBounds(229, 480, 46, 24);
		contentPane.add(PTS16);
		
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
		
		JPanel p1 = new JPanel();
		p1.setBounds(441, 138, 40, 24);
		contentPane.add(p1);
		
		JLabel label_4 = new JLabel("1");
		p1.add(label_4);
		
		JPanel pC1 = new JPanel();
		pC1.setBackground(new Color(0, 206, 209));
		pC1.setBounds(478, 138, 25, 24);
		contentPane.add(pC1);
		
		JLabel lbl1 = new JLabel("AMG Mercedes");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(502, 138, 100, 24);
		contentPane.add(lbl1);
		
		JLabel PTSE1 = new JLabel("95");
		PTSE1.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE1.setBounds(645, 138, 46, 24);
		contentPane.add(PTSE1);
		
		JPanel p2 = new JPanel();
		p2.setBounds(441, 161, 40, 24);
		contentPane.add(p2);
		
		JLabel label_4_1 = new JLabel("2");
		p2.add(label_4_1);
		
		JPanel pC2 = new JPanel();
		pC2.setBackground(new Color(0, 206, 209));
		pC2.setBounds(478, 161, 25, 24);
		contentPane.add(pC2);
		
		JLabel lbl2 = new JLabel("AMG Mercedes");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setBounds(502, 161, 100, 24);
		contentPane.add(lbl2);
		
		JLabel PTSE2 = new JLabel("95");
		PTSE2.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE2.setBounds(645, 161, 46, 24);
		contentPane.add(PTSE2);
		
		JPanel p3 = new JPanel();
		p3.setBounds(441, 184, 40, 24);
		contentPane.add(p3);
		
		JLabel label_4_2 = new JLabel("3");
		p3.add(label_4_2);
		
		JPanel pC3 = new JPanel();
		pC3.setBackground(new Color(0, 206, 209));
		pC3.setBounds(478, 184, 25, 24);
		contentPane.add(pC3);
		
		JLabel lbl3 = new JLabel("AMG Mercedes");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setBounds(502, 184, 100, 24);
		contentPane.add(lbl3);
		
		JLabel PTSE3 = new JLabel("95");
		PTSE3.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE3.setBounds(645, 184, 46, 24);
		contentPane.add(PTSE3);
		
		JPanel p4 = new JPanel();
		p4.setBounds(441, 207, 40, 24);
		contentPane.add(p4);
		
		JLabel label_4_3 = new JLabel("4");
		p4.add(label_4_3);
		
		JPanel pC4 = new JPanel();
		pC4.setBackground(new Color(0, 206, 209));
		pC4.setBounds(478, 207, 25, 24);
		contentPane.add(pC4);
		
		JLabel lbl4 = new JLabel("AMG Mercedes");
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setBounds(502, 207, 100, 24);
		contentPane.add(lbl4);
		
		JLabel PTSE4 = new JLabel("95");
		PTSE4.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE4.setBounds(645, 207, 46, 24);
		contentPane.add(PTSE4);
		
		JPanel p5 = new JPanel();
		p5.setBounds(441, 229, 40, 24);
		contentPane.add(p5);
		
		JLabel label_4_4 = new JLabel("5");
		p5.add(label_4_4);
		
		JPanel pC5 = new JPanel();
		pC5.setBackground(new Color(0, 206, 209));
		pC5.setBounds(478, 229, 25, 24);
		contentPane.add(pC5);
		
		JLabel lbl5 = new JLabel("AMG Mercedes");
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.setBounds(502, 229, 100, 24);
		contentPane.add(lbl5);
		
		JLabel PTSE5 = new JLabel("95");
		PTSE5.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE5.setBounds(645, 229, 46, 24);
		contentPane.add(PTSE5);
		
		JPanel p6 = new JPanel();
		p6.setBounds(441, 253, 40, 24);
		contentPane.add(p6);
		
		JLabel label_4_4_1 = new JLabel("6");
		p6.add(label_4_4_1);
		
		JPanel pC6 = new JPanel();
		pC6.setBackground(new Color(0, 206, 209));
		pC6.setBounds(478, 253, 25, 24);
		contentPane.add(pC6);
		
		JLabel lbl6 = new JLabel("AMG Mercedes");
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.setBounds(502, 253, 100, 24);
		contentPane.add(lbl6);
		
		JLabel PTSE6 = new JLabel("95");
		PTSE6.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE6.setBounds(645, 253, 46, 24);
		contentPane.add(PTSE6);
		
		JPanel p7 = new JPanel();
		p7.setBounds(441, 277, 40, 24);
		contentPane.add(p7);
		
		JLabel label_4_4_2 = new JLabel("7");
		p7.add(label_4_4_2);
		
		JPanel pC7 = new JPanel();
		pC7.setBackground(new Color(0, 206, 209));
		pC7.setBounds(478, 277, 25, 24);
		contentPane.add(pC7);
		
		JLabel lbl7 = new JLabel("AMG Mercedes");
		lbl7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7.setBounds(502, 277, 100, 24);
		contentPane.add(lbl7);
		
		JLabel PTSE7 = new JLabel("95");
		PTSE7.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE7.setBounds(645, 277, 46, 24);
		contentPane.add(PTSE7);
		
		JPanel p8 = new JPanel();
		p8.setBounds(441, 301, 40, 24);
		contentPane.add(p8);
		
		JLabel label_4_4_3 = new JLabel("8");
		p8.add(label_4_4_3);
		
		JPanel p9 = new JPanel();
		p9.setBounds(441, 325, 40, 24);
		contentPane.add(p9);
		
		JLabel label_4_4_4 = new JLabel("9");
		p9.add(label_4_4_4);
		
		JPanel p10 = new JPanel();
		p10.setBounds(441, 348, 40, 24);
		contentPane.add(p10);
		
		JLabel label_4_4_5 = new JLabel("10");
		p10.add(label_4_4_5);
		
		JPanel pC8 = new JPanel();
		pC8.setBackground(new Color(0, 206, 209));
		pC8.setBounds(478, 301, 25, 24);
		contentPane.add(pC8);
		
		JPanel pC9 = new JPanel();
		pC9.setBackground(new Color(0, 206, 209));
		pC9.setBounds(478, 325, 25, 24);
		contentPane.add(pC9);
		
		JPanel pC10 = new JPanel();
		pC10.setBackground(new Color(0, 206, 209));
		pC10.setBounds(478, 348, 25, 24);
		contentPane.add(pC10);
		
		JLabel lbl8 = new JLabel("AMG Mercedes");
		lbl8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8.setBounds(502, 301, 100, 24);
		contentPane.add(lbl8);
		
		JLabel lbl9 = new JLabel("AMG Mercedes");
		lbl9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl9.setBounds(502, 325, 100, 24);
		contentPane.add(lbl9);
		
		JLabel lbl10 = new JLabel("AMG Mercedes");
		lbl10.setHorizontalAlignment(SwingConstants.CENTER);
		lbl10.setBounds(502, 348, 100, 24);
		contentPane.add(lbl10);
		
		JLabel PTSE8 = new JLabel("95");
		PTSE8.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE8.setBounds(645, 299, 46, 24);
		contentPane.add(PTSE8);
		
		JLabel PTSE9 = new JLabel("95");
		PTSE9.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE9.setBounds(645, 325, 46, 24);
		contentPane.add(PTSE9);
		
		JLabel PTSE10 = new JLabel("95");
		PTSE10.setHorizontalAlignment(SwingConstants.CENTER);
		PTSE10.setBounds(645, 348, 46, 24);
		contentPane.add(PTSE10);
		
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
		
		JLabel Siglas = new JLabel("Siglas");
		Siglas.setHorizontalAlignment(SwingConstants.CENTER);
		Siglas.setBounds(441, 463, 250, 24);
		contentPane.add(Siglas);
		
		JLabel Puesto = new JLabel("P = Puesto");
		Puesto.setHorizontalAlignment(SwingConstants.CENTER);
		Puesto.setBounds(441, 482, 250, 22);
		contentPane.add(Puesto);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("CE");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setBounds(64, 108, 25, 29);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel CE = new JLabel("CE= Color Escuderia");
		CE.setHorizontalAlignment(SwingConstants.CENTER);
		CE.setBounds(441, 505, 250, 22);
		contentPane.add(CE);
		
		JLabel NE = new JLabel("NE = Nombre Escuderia");
		NE.setHorizontalAlignment(SwingConstants.CENTER);
		NE.setBounds(441, 551, 250, 22);
		contentPane.add(NE);
		
		JLabel NP = new JLabel("NP = Nombre Piloto");
		NP.setHorizontalAlignment(SwingConstants.CENTER);
		NP.setBounds(441, 526, 250, 22);
		contentPane.add(NP);
		
		JLabel PTS = new JLabel("PTS = Puntos");
		PTS.setHorizontalAlignment(SwingConstants.CENTER);
		PTS.setBounds(441, 574, 250, 22);
		contentPane.add(PTS);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		textArea_2.setBounds(441, 463, 250, 133);
		contentPane.add(textArea_2);
		
		JPanel pP20 = new JPanel();
		pP20.setBounds(25, 572, 40, 24);
		contentPane.add(pP20);
		
		JLabel label_3_5_1_6_1 = new JLabel("20");
		pP20.add(label_3_5_1_6_1);
		
		JPanel pPC20 = new JPanel();
		pPC20.setBackground(new Color(0, 206, 209));
		pPC20.setBounds(64, 572, 25, 24);
		contentPane.add(pPC20);
		
		JLabel lblP20 = new JLabel("Lewis Hamilton");
		lblP20.setHorizontalAlignment(SwingConstants.CENTER);
		lblP20.setBounds(89, 572, 100, 24);
		contentPane.add(lblP20);
		
		JLabel PTS20 = new JLabel("95");
		PTS20.setHorizontalAlignment(SwingConstants.CENTER);
		PTS20.setBounds(229, 572, 46, 24);
		contentPane.add(PTS20);
		
		JPanel pP19 = new JPanel();
		pP19.setBounds(25, 549, 40, 24);
		contentPane.add(pP19);
		
		JLabel label_3_5_1_6_2 = new JLabel("19");
		pP19.add(label_3_5_1_6_2);
		
		JPanel pPC19 = new JPanel();
		pPC19.setBackground(new Color(0, 206, 209));
		pPC19.setBounds(64, 549, 25, 24);
		contentPane.add(pPC19);
		
		JLabel lblP19 = new JLabel("Lewis Hamilton");
		lblP19.setHorizontalAlignment(SwingConstants.CENTER);
		lblP19.setBounds(89, 549, 100, 24);
		contentPane.add(lblP19);
		
		JLabel PTS19 = new JLabel("95");
		PTS19.setHorizontalAlignment(SwingConstants.CENTER);
		PTS19.setBounds(229, 549, 46, 24);
		contentPane.add(PTS19);
		
		JPanel pP18 = new JPanel();
		pP18.setBounds(25, 526, 40, 24);
		contentPane.add(pP18);
		
		JLabel label_3_5_1_6_3 = new JLabel("18");
		pP18.add(label_3_5_1_6_3);
		
		JPanel pPC18 = new JPanel();
		pPC18.setBackground(new Color(0, 206, 209));
		pPC18.setBounds(64, 526, 25, 24);
		contentPane.add(pPC18);
		
		JLabel lblP18 = new JLabel("Lewis Hamilton");
		lblP18.setHorizontalAlignment(SwingConstants.CENTER);
		lblP18.setBounds(89, 526, 100, 24);
		contentPane.add(lblP18);
		
		JLabel PTS18 = new JLabel("95");
		PTS18.setHorizontalAlignment(SwingConstants.CENTER);
		PTS18.setBounds(229, 526, 46, 24);
		contentPane.add(PTS18);
		
		JPanel pP17 = new JPanel();
		pP17.setBounds(25, 503, 40, 24);
		contentPane.add(pP17);
		
		JLabel label_3_5_1_6_4 = new JLabel("17");
		pP17.add(label_3_5_1_6_4);
		
		JPanel pPC17 = new JPanel();
		pPC17.setBackground(new Color(0, 206, 209));
		pPC17.setBounds(64, 503, 25, 24);
		contentPane.add(pPC17);
		
		JLabel lblP17 = new JLabel("Lewis Hamilton");
		lblP17.setHorizontalAlignment(SwingConstants.CENTER);
		lblP17.setBounds(89, 503, 100, 24);
		contentPane.add(lblP17);
		
		JLabel PTS17 = new JLabel("95");
		PTS17.setHorizontalAlignment(SwingConstants.CENTER);
		PTS17.setBounds(229, 503, 46, 24);
		contentPane.add(PTS17);
		
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
