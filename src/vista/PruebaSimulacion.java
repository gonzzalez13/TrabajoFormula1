package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

import javax.swing.SwingConstants;

public class PruebaSimulacion extends JFrame {

	private JPanel contentPane;
	private JTextField Fila1Pos;
	private JTextField Fila11;
	private JTextField Fila21;
	private JTextField Fila31;
	private JTextField Fila41;
	private JTextField Fila51;
	private JTextField Fila61;
	private JTextField Fila71;
	private JTextField Fila81;
	private JTextField Fila91;
	private JTextField Fila101;
	private JTextField Fila111;
	private JTextField Fila121;
	private JTextField Fila131;
	private JTextField Fila141;
	private JTextField Fila151;
	private JTextField Fila161;
	private JTextField Fila171;
	private JTextField Fila201;
	private JTextField Fila191;
	private JTextField Fila181;
	private JTextField txtPiloto;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField txtEscuderia;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField txtVueltas;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField txtSector;
	private JTextField textField_83;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_88;
	private JTextField textField_89;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_93;
	private JTextField textField_94;
	private JTextField textField_95;
	private JTextField textField_96;
	private JTextField textField_97;
	private JTextField textField_98;
	private JTextField textField_99;
	private JTextField textField_100;
	private JTextField textField_101;
	private JTextField textField_102;
	private JTextField txtVueltaRapida;
	private JTextField textField_82;
	private JTextField textField_103;
	private JTextField textField_104;
	private JTextField textField_105;
	private JTextField textField_106;
	private JTextField textField_107;
	private JTextField textField_108;
	private JTextField textField_109;
	private JTextField textField_110;
	private JTextField textField_111;
	private JTextField textField_112;
	private JTextField textField_113;
	private JTextField textField_114;
	private JTextField textField_115;
	private JTextField textField_116;
	private JTextField textField_117;
	private JTextField textField_118;
	private JTextField textField_119;
	private JTextField textField_120;
	private JTextField textField_121;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaInicio frame = new PruebaInicio();
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
	public PruebaSimulacion() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 990,650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel PanelMenu = new JPanel();
		PanelMenu.setLayout(null);
		PanelMenu.setBackground(new Color(178,29,28));
		PanelMenu.setBounds(0, 0, 974, 72);
		contentPane.add(PanelMenu);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"F1-logo.png"));
		lblLogo.setBounds(10, 11, 133, 48);
		PanelMenu.add(lblLogo);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.setForeground(new Color(255,255,255));
		btnInicio.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnInicio.setBackground(new Color(59,45,45));
		btnInicio.setBounds(144, 11, 74, 48);
		PanelMenu.add(btnInicio);
		
		JButton btnEscuderias = new JButton("Escuderias");
		btnEscuderias.setForeground(new Color(255,255,255));
		btnEscuderias.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnEscuderias.setBackground(new Color(59,45,45));
		btnEscuderias.setBounds(226, 11, 112, 48);
		PanelMenu.add(btnEscuderias);
		
		JButton btnPilotos = new JButton("Pilotos");
		btnPilotos.setForeground(new Color(255,255,255));
		btnPilotos.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnPilotos.setBackground(new Color(59,45,45));
		btnPilotos.setBounds(348, 11, 94, 48);
		PanelMenu.add(btnPilotos);
		
		JButton btnGranPre = new JButton("Gran Premio");
		btnGranPre.setForeground(new Color(255,255,255));
		btnGranPre.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGranPre.setBackground(new Color(59,45,45));
		btnGranPre.setBounds(452, 11, 130, 48);
		PanelMenu.add(btnGranPre);
		
		JButton btnClasi = new JButton("Clasificaciones");
		btnClasi.setForeground(new Color(255,255,255));
		btnClasi.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnClasi.setBackground(new Color(59,45,45));
		btnClasi.setBounds(592, 11, 145, 48);
		PanelMenu.add(btnClasi);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(255,255,255));
		btnLogin.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogin.setBackground(new Color(59,45,45));
		btnLogin.setBounds(872, 11, 92, 48);
		PanelMenu.add(btnLogin);
		
		JButton btnSimulacion = new JButton("Simulacion");
		btnSimulacion.setForeground(new Color(255,255,255));
		btnSimulacion.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnSimulacion.setBackground(new Color(59,45,45));
		btnSimulacion.setBounds(747, 11, 115, 48);
		PanelMenu.add(btnSimulacion);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 72, 974, 539);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Fila1Pos = new JTextField();
		Fila1Pos.setHorizontalAlignment(SwingConstants.CENTER);
		Fila1Pos.setText("POS");
		Fila1Pos.setBounds(10, 11, 40, 20);
		panel.add(Fila1Pos);
		Fila1Pos.setColumns(10);
		
		Fila11 = new JTextField();
		Fila11.setColumns(10);
		Fila11.setBounds(10, 31, 40, 20);
		panel.add(Fila11);
		
		Fila21 = new JTextField();
		Fila21.setColumns(10);
		Fila21.setBounds(10, 51, 40, 20);
		panel.add(Fila21);
		
		Fila31 = new JTextField();
		Fila31.setColumns(10);
		Fila31.setBounds(10, 71, 40, 20);
		panel.add(Fila31);
		
		Fila41 = new JTextField();
		Fila41.setColumns(10);
		Fila41.setBounds(10, 91, 40, 20);
		panel.add(Fila41);
		
		Fila51 = new JTextField();
		Fila51.setColumns(10);
		Fila51.setBounds(10, 111, 40, 20);
		panel.add(Fila51);
		
		Fila61 = new JTextField();
		Fila61.setColumns(10);
		Fila61.setBounds(10, 131, 40, 20);
		panel.add(Fila61);
		
		Fila71 = new JTextField();
		Fila71.setColumns(10);
		Fila71.setBounds(10, 151, 40, 20);
		panel.add(Fila71);
		
		Fila81 = new JTextField();
		Fila81.setColumns(10);
		Fila81.setBounds(10, 171, 40, 20);
		panel.add(Fila81);
		
		Fila91 = new JTextField();
		Fila91.setColumns(10);
		Fila91.setBounds(10, 191, 40, 20);
		panel.add(Fila91);
		
		Fila101 = new JTextField();
		Fila101.setColumns(10);
		Fila101.setBounds(10, 211, 40, 20);
		panel.add(Fila101);
		
		Fila111 = new JTextField();
		Fila111.setColumns(10);
		Fila111.setBounds(10, 231, 40, 20);
		panel.add(Fila111);
		
		Fila121 = new JTextField();
		Fila121.setColumns(10);
		Fila121.setBounds(10, 251, 40, 20);
		panel.add(Fila121);
		
		Fila131 = new JTextField();
		Fila131.setColumns(10);
		Fila131.setBounds(10, 271, 40, 20);
		panel.add(Fila131);
		
		Fila141 = new JTextField();
		Fila141.setColumns(10);
		Fila141.setBounds(10, 291, 40, 20);
		panel.add(Fila141);
		
		Fila151 = new JTextField();
		Fila151.setColumns(10);
		Fila151.setBounds(10, 311, 40, 20);
		panel.add(Fila151);
		
		Fila161 = new JTextField();
		Fila161.setColumns(10);
		Fila161.setBounds(10, 331, 40, 20);
		panel.add(Fila161);
		
		Fila171 = new JTextField();
		Fila171.setColumns(10);
		Fila171.setBounds(10, 351, 40, 20);
		panel.add(Fila171);
		
		Fila201 = new JTextField();
		Fila201.setColumns(10);
		Fila201.setBounds(10, 411, 40, 20);
		panel.add(Fila201);
		
		Fila191 = new JTextField();
		Fila191.setColumns(10);
		Fila191.setBounds(10, 391, 40, 20);
		panel.add(Fila191);
		
		Fila181 = new JTextField();
		Fila181.setColumns(10);
		Fila181.setBounds(10, 371, 40, 20);
		panel.add(Fila181);
		
		txtPiloto = new JTextField();
		txtPiloto.setHorizontalAlignment(SwingConstants.CENTER);
		txtPiloto.setText("PILOTO");
		txtPiloto.setColumns(10);
		txtPiloto.setBounds(50, 11, 124, 20);
		panel.add(txtPiloto);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(50, 31, 124, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(50, 51, 124, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(50, 71, 124, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(50, 91, 124, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(50, 111, 124, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(50, 131, 124, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(50, 151, 124, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(50, 171, 124, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(50, 191, 124, 20);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(50, 211, 124, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(50, 251, 124, 20);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(50, 231, 124, 20);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(50, 271, 124, 20);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(50, 291, 124, 20);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(50, 311, 124, 20);
		panel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(50, 331, 124, 20);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(50, 351, 124, 20);
		panel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(50, 371, 124, 20);
		panel.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(50, 391, 124, 20);
		panel.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(50, 411, 124, 20);
		panel.add(textField_20);
		
		txtEscuderia = new JTextField();
		txtEscuderia.setText("ESCUDERIA");
		txtEscuderia.setHorizontalAlignment(SwingConstants.CENTER);
		txtEscuderia.setColumns(10);
		txtEscuderia.setBounds(174, 11, 124, 20);
		panel.add(txtEscuderia);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(174, 31, 124, 20);
		panel.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(174, 51, 124, 20);
		panel.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(174, 71, 124, 20);
		panel.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(174, 91, 124, 20);
		panel.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(174, 111, 124, 20);
		panel.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(174, 131, 124, 20);
		panel.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(174, 151, 124, 20);
		panel.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(174, 171, 124, 20);
		panel.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(174, 191, 124, 20);
		panel.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(174, 211, 124, 20);
		panel.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(174, 251, 124, 20);
		panel.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(174, 231, 124, 20);
		panel.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(174, 271, 124, 20);
		panel.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(174, 291, 124, 20);
		panel.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(174, 331, 124, 20);
		panel.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(174, 311, 124, 20);
		panel.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(174, 351, 124, 20);
		panel.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(174, 371, 124, 20);
		panel.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(174, 391, 124, 20);
		panel.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(174, 411, 124, 20);
		panel.add(textField_40);
		
		textField = new JTextField();
		textField.setText("ESCUDERIA");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(298, 11, 62, 20);
		panel.add(textField);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(298, 31, 62, 20);
		panel.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(298, 51, 62, 20);
		panel.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(298, 71, 62, 20);
		panel.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(298, 91, 62, 20);
		panel.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(298, 111, 62, 20);
		panel.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(298, 131, 62, 20);
		panel.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(298, 151, 62, 20);
		panel.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(298, 171, 62, 20);
		panel.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(298, 191, 62, 20);
		panel.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(298, 211, 62, 20);
		panel.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(298, 231, 62, 20);
		panel.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(298, 251, 62, 20);
		panel.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(298, 271, 62, 20);
		panel.add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(298, 291, 62, 20);
		panel.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(298, 311, 62, 20);
		panel.add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(298, 331, 62, 20);
		panel.add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(298, 351, 62, 20);
		panel.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(298, 371, 62, 20);
		panel.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(298, 411, 62, 20);
		panel.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(298, 391, 62, 20);
		panel.add(textField_60);
		
		txtVueltas = new JTextField();
		txtVueltas.setText("VUELTAS");
		txtVueltas.setHorizontalAlignment(SwingConstants.CENTER);
		txtVueltas.setColumns(10);
		txtVueltas.setBounds(360, 11, 98, 20);
		panel.add(txtVueltas);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(360, 31, 98, 20);
		panel.add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBounds(360, 51, 98, 20);
		panel.add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBounds(360, 71, 98, 20);
		panel.add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBounds(360, 91, 98, 20);
		panel.add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setColumns(10);
		textField_66.setBounds(360, 111, 98, 20);
		panel.add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setColumns(10);
		textField_67.setBounds(360, 131, 98, 20);
		panel.add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setColumns(10);
		textField_68.setBounds(360, 151, 98, 20);
		panel.add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setColumns(10);
		textField_69.setBounds(360, 171, 98, 20);
		panel.add(textField_69);
		
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		textField_70.setBounds(360, 191, 98, 20);
		panel.add(textField_70);
		
		textField_71 = new JTextField();
		textField_71.setColumns(10);
		textField_71.setBounds(360, 211, 98, 20);
		panel.add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setColumns(10);
		textField_72.setBounds(360, 231, 98, 20);
		panel.add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setColumns(10);
		textField_73.setBounds(360, 251, 98, 20);
		panel.add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setColumns(10);
		textField_74.setBounds(360, 271, 98, 20);
		panel.add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setColumns(10);
		textField_75.setBounds(360, 291, 98, 20);
		panel.add(textField_75);
		
		textField_76 = new JTextField();
		textField_76.setColumns(10);
		textField_76.setBounds(360, 311, 98, 20);
		panel.add(textField_76);
		
		textField_77 = new JTextField();
		textField_77.setColumns(10);
		textField_77.setBounds(360, 331, 98, 20);
		panel.add(textField_77);
		
		textField_78 = new JTextField();
		textField_78.setColumns(10);
		textField_78.setBounds(360, 351, 98, 20);
		panel.add(textField_78);
		
		textField_79 = new JTextField();
		textField_79.setColumns(10);
		textField_79.setBounds(360, 371, 98, 20);
		panel.add(textField_79);
		
		textField_80 = new JTextField();
		textField_80.setColumns(10);
		textField_80.setBounds(360, 411, 98, 20);
		panel.add(textField_80);
		
		textField_81 = new JTextField();
		textField_81.setColumns(10);
		textField_81.setBounds(360, 391, 98, 20);
		panel.add(textField_81);
		
		txtSector = new JTextField();
		txtSector.setText("SECTOR");
		txtSector.setHorizontalAlignment(SwingConstants.CENTER);
		txtSector.setColumns(10);
		txtSector.setBounds(458, 11, 96, 20);
		panel.add(txtSector);
		
		textField_83 = new JTextField();
		textField_83.setColumns(10);
		textField_83.setBounds(458, 31, 96, 20);
		panel.add(textField_83);
		
		textField_84 = new JTextField();
		textField_84.setColumns(10);
		textField_84.setBounds(458, 51, 96, 20);
		panel.add(textField_84);
		
		textField_85 = new JTextField();
		textField_85.setColumns(10);
		textField_85.setBounds(458, 71, 96, 20);
		panel.add(textField_85);
		
		textField_86 = new JTextField();
		textField_86.setColumns(10);
		textField_86.setBounds(458, 91, 96, 20);
		panel.add(textField_86);
		
		textField_87 = new JTextField();
		textField_87.setColumns(10);
		textField_87.setBounds(458, 111, 96, 20);
		panel.add(textField_87);
		
		textField_88 = new JTextField();
		textField_88.setColumns(10);
		textField_88.setBounds(458, 131, 96, 20);
		panel.add(textField_88);
		
		textField_89 = new JTextField();
		textField_89.setColumns(10);
		textField_89.setBounds(458, 151, 96, 20);
		panel.add(textField_89);
		
		textField_90 = new JTextField();
		textField_90.setColumns(10);
		textField_90.setBounds(458, 171, 96, 20);
		panel.add(textField_90);
		
		textField_91 = new JTextField();
		textField_91.setColumns(10);
		textField_91.setBounds(458, 191, 96, 20);
		panel.add(textField_91);
		
		textField_92 = new JTextField();
		textField_92.setColumns(10);
		textField_92.setBounds(458, 211, 96, 20);
		panel.add(textField_92);
		
		textField_93 = new JTextField();
		textField_93.setColumns(10);
		textField_93.setBounds(458, 231, 96, 20);
		panel.add(textField_93);
		
		textField_94 = new JTextField();
		textField_94.setColumns(10);
		textField_94.setBounds(458, 251, 96, 20);
		panel.add(textField_94);
		
		textField_95 = new JTextField();
		textField_95.setColumns(10);
		textField_95.setBounds(458, 271, 96, 20);
		panel.add(textField_95);
		
		textField_96 = new JTextField();
		textField_96.setColumns(10);
		textField_96.setBounds(458, 291, 96, 20);
		panel.add(textField_96);
		
		textField_97 = new JTextField();
		textField_97.setColumns(10);
		textField_97.setBounds(458, 311, 96, 20);
		panel.add(textField_97);
		
		textField_98 = new JTextField();
		textField_98.setColumns(10);
		textField_98.setBounds(458, 331, 96, 20);
		panel.add(textField_98);
		
		textField_99 = new JTextField();
		textField_99.setColumns(10);
		textField_99.setBounds(458, 351, 96, 20);
		panel.add(textField_99);
		
		textField_100 = new JTextField();
		textField_100.setColumns(10);
		textField_100.setBounds(458, 371, 96, 20);
		panel.add(textField_100);
		
		textField_101 = new JTextField();
		textField_101.setColumns(10);
		textField_101.setBounds(458, 411, 96, 20);
		panel.add(textField_101);
		
		textField_102 = new JTextField();
		textField_102.setColumns(10);
		textField_102.setBounds(458, 391, 96, 20);
		panel.add(textField_102);
		
		txtVueltaRapida = new JTextField();
		txtVueltaRapida.setText("VUELTA RAPIDA");
		txtVueltaRapida.setHorizontalAlignment(SwingConstants.CENTER);
		txtVueltaRapida.setColumns(10);
		txtVueltaRapida.setBounds(554, 11, 90, 20);
		panel.add(txtVueltaRapida);
		
		textField_82 = new JTextField();
		textField_82.setColumns(10);
		textField_82.setBounds(554, 31, 90, 20);
		panel.add(textField_82);
		
		textField_103 = new JTextField();
		textField_103.setColumns(10);
		textField_103.setBounds(554, 51, 90, 20);
		panel.add(textField_103);
		
		textField_104 = new JTextField();
		textField_104.setColumns(10);
		textField_104.setBounds(554, 71, 90, 20);
		panel.add(textField_104);
		
		textField_105 = new JTextField();
		textField_105.setColumns(10);
		textField_105.setBounds(554, 91, 90, 20);
		panel.add(textField_105);
		
		textField_106 = new JTextField();
		textField_106.setColumns(10);
		textField_106.setBounds(554, 111, 90, 20);
		panel.add(textField_106);
		
		textField_107 = new JTextField();
		textField_107.setColumns(10);
		textField_107.setBounds(554, 131, 90, 20);
		panel.add(textField_107);
		
		textField_108 = new JTextField();
		textField_108.setColumns(10);
		textField_108.setBounds(554, 151, 90, 20);
		panel.add(textField_108);
		
		textField_109 = new JTextField();
		textField_109.setColumns(10);
		textField_109.setBounds(554, 171, 90, 20);
		panel.add(textField_109);
		
		textField_110 = new JTextField();
		textField_110.setColumns(10);
		textField_110.setBounds(554, 191, 90, 20);
		panel.add(textField_110);
		
		textField_111 = new JTextField();
		textField_111.setColumns(10);
		textField_111.setBounds(554, 211, 90, 20);
		panel.add(textField_111);
		
		textField_112 = new JTextField();
		textField_112.setColumns(10);
		textField_112.setBounds(554, 231, 90, 20);
		panel.add(textField_112);
		
		textField_113 = new JTextField();
		textField_113.setColumns(10);
		textField_113.setBounds(554, 251, 90, 20);
		panel.add(textField_113);
		
		textField_114 = new JTextField();
		textField_114.setColumns(10);
		textField_114.setBounds(554, 271, 90, 20);
		panel.add(textField_114);
		
		textField_115 = new JTextField();
		textField_115.setColumns(10);
		textField_115.setBounds(554, 291, 90, 20);
		panel.add(textField_115);
		
		textField_116 = new JTextField();
		textField_116.setColumns(10);
		textField_116.setBounds(554, 311, 90, 20);
		panel.add(textField_116);
		
		textField_117 = new JTextField();
		textField_117.setColumns(10);
		textField_117.setBounds(554, 331, 90, 20);
		panel.add(textField_117);
		
		textField_118 = new JTextField();
		textField_118.setColumns(10);
		textField_118.setBounds(554, 351, 90, 20);
		panel.add(textField_118);
		
		textField_119 = new JTextField();
		textField_119.setColumns(10);
		textField_119.setBounds(554, 371, 90, 20);
		panel.add(textField_119);
		
		textField_120 = new JTextField();
		textField_120.setColumns(10);
		textField_120.setBounds(554, 411, 90, 20);
		panel.add(textField_120);
		
		textField_121 = new JTextField();
		textField_121.setColumns(10);
		textField_121.setBounds(554, 391, 90, 20);
		panel.add(textField_121);
	}
}
