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
	private JTextField Fila12;
	private JTextField Fila22;
	private JTextField Fila32;
	private JTextField Fila42;
	private JTextField Fila52;
	private JTextField Fila62;
	private JTextField Fila72;
	private JTextField Fila82;
	private JTextField Fila92;
	private JTextField Fila102;
	private JTextField Fila122;
	private JTextField Fila112;
	private JTextField Fila132;
	private JTextField Fila142;
	private JTextField Fila152;
	private JTextField Fila162;
	private JTextField Fila172;
	private JTextField Fila182;
	private JTextField Fila192;
	private JTextField Fila202;
	private JTextField txtEscuderia;
	private JTextField Fila13;
	private JTextField Fila23;
	private JTextField Fila33;
	private JTextField Fila43;
	private JTextField Fila53;
	private JTextField Fila63;
	private JTextField Fila73;
	private JTextField Fila83;
	private JTextField Fila93;
	private JTextField Fila103;
	private JTextField Fila123;
	private JTextField Fila113;
	private JTextField Fila133;
	private JTextField Fila143;
	private JTextField Fila163;
	private JTextField Fila153;
	private JTextField Fila173;
	private JTextField Fila183;
	private JTextField Fila193;
	private JTextField Fila203;
	private JTextField txtTiempo;
	private JTextField Fila14;
	private JTextField Fila24;
	private JTextField Fila34;
	private JTextField Fila44;
	private JTextField Fila54;
	private JTextField Fila64;
	private JTextField Fila74;
	private JTextField Fila84;
	private JTextField Fila94;
	private JTextField Fila104;
	private JTextField Fila114;
	private JTextField Fila124;
	private JTextField Fila134;
	private JTextField Fila144;
	private JTextField Fila154;
	private JTextField Fila164;
	private JTextField Fila174;
	private JTextField Fila184;
	private JTextField Fila204;
	private JTextField Fila194;
	private JTextField txtVueltas;
	private JTextField Fila15;
	private JTextField Fila25;
	private JTextField Fila35;
	private JTextField Fila45;
	private JTextField Fila55;
	private JTextField Fila65;
	private JTextField Fila75;
	private JTextField Fila85;
	private JTextField Fila95;
	private JTextField Fila105;
	private JTextField Fila115;
	private JTextField Fila125;
	private JTextField Fila136;
	private JTextField Fila145;
	private JTextField Fila155;
	private JTextField Fila165;
	private JTextField Fila175;
	private JTextField Fila185;
	private JTextField Fila205;
	private JTextField Fila195;
	private JTextField txtSector;
	private JTextField Fila16;
	private JTextField Fila26;
	private JTextField Fila36;
	private JTextField Fila46;
	private JTextField Fila56;
	private JTextField Fila66;
	private JTextField Fila76;
	private JTextField Fila86;
	private JTextField Fila96;
	private JTextField Fila106;
	private JTextField Fila116;
	private JTextField Fila126;
	private JTextField Fila137;
	private JTextField Fila146;
	private JTextField Fila156;
	private JTextField Fila166;
	private JTextField Fila176;
	private JTextField Fila186;
	private JTextField Fila206;
	private JTextField Fila196;
	private JTextField txtVueltaRapida;
	private JTextField Fila17;
	private JTextField Fila27;
	private JTextField Fila37;
	private JTextField Fila47;
	private JTextField Fila57;
	private JTextField Fila67;
	private JTextField Fila77;
	private JTextField Fila87;
	private JTextField Fila97;
	private JTextField Fila107;
	private JTextField Fila117;
	private JTextField Fila127;
	private JTextField Fila138;
	private JTextField Fila147;
	private JTextField Fila157;
	private JTextField Fila167;
	private JTextField Fila177;
	private JTextField Fila187;
	private JTextField Fila207;
	private JTextField Fila197;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaSimulacion frame = new PruebaSimulacion();
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
		Fila1Pos.setText("POS.");
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
		
		Fila12 = new JTextField();
		Fila12.setColumns(10);
		Fila12.setBounds(50, 31, 124, 20);
		panel.add(Fila12);
		
		Fila22 = new JTextField();
		Fila22.setColumns(10);
		Fila22.setBounds(50, 51, 124, 20);
		panel.add(Fila22);
		
		Fila32 = new JTextField();
		Fila32.setColumns(10);
		Fila32.setBounds(50, 71, 124, 20);
		panel.add(Fila32);
		
		Fila42 = new JTextField();
		Fila42.setColumns(10);
		Fila42.setBounds(50, 91, 124, 20);
		panel.add(Fila42);
		
		Fila52 = new JTextField();
		Fila52.setColumns(10);
		Fila52.setBounds(50, 111, 124, 20);
		panel.add(Fila52);
		
		Fila62 = new JTextField();
		Fila62.setColumns(10);
		Fila62.setBounds(50, 131, 124, 20);
		panel.add(Fila62);
		
		Fila72 = new JTextField();
		Fila72.setColumns(10);
		Fila72.setBounds(50, 151, 124, 20);
		panel.add(Fila72);
		
		Fila82 = new JTextField();
		Fila82.setColumns(10);
		Fila82.setBounds(50, 171, 124, 20);
		panel.add(Fila82);
		
		Fila92 = new JTextField();
		Fila92.setColumns(10);
		Fila92.setBounds(50, 191, 124, 20);
		panel.add(Fila92);
		
		Fila102 = new JTextField();
		Fila102.setColumns(10);
		Fila102.setBounds(50, 211, 124, 20);
		panel.add(Fila102);
		
		Fila122 = new JTextField();
		Fila122.setColumns(10);
		Fila122.setBounds(50, 251, 124, 20);
		panel.add(Fila122);
		
		Fila112 = new JTextField();
		Fila112.setColumns(10);
		Fila112.setBounds(50, 231, 124, 20);
		panel.add(Fila112);
		
		Fila132 = new JTextField();
		Fila132.setColumns(10);
		Fila132.setBounds(50, 271, 124, 20);
		panel.add(Fila132);
		
		Fila142 = new JTextField();
		Fila142.setColumns(10);
		Fila142.setBounds(50, 291, 124, 20);
		panel.add(Fila142);
		
		Fila152 = new JTextField();
		Fila152.setColumns(10);
		Fila152.setBounds(50, 311, 124, 20);
		panel.add(Fila152);
		
		Fila162 = new JTextField();
		Fila162.setColumns(10);
		Fila162.setBounds(50, 331, 124, 20);
		panel.add(Fila162);
		
		Fila172 = new JTextField();
		Fila172.setColumns(10);
		Fila172.setBounds(50, 351, 124, 20);
		panel.add(Fila172);
		
		Fila182 = new JTextField();
		Fila182.setColumns(10);
		Fila182.setBounds(50, 371, 124, 20);
		panel.add(Fila182);
		
		Fila192 = new JTextField();
		Fila192.setColumns(10);
		Fila192.setBounds(50, 391, 124, 20);
		panel.add(Fila192);
		
		Fila202 = new JTextField();
		Fila202.setColumns(10);
		Fila202.setBounds(50, 411, 124, 20);
		panel.add(Fila202);
		
		txtEscuderia = new JTextField();
		txtEscuderia.setText("ESCUDERIA");
		txtEscuderia.setHorizontalAlignment(SwingConstants.CENTER);
		txtEscuderia.setColumns(10);
		txtEscuderia.setBounds(174, 11, 124, 20);
		panel.add(txtEscuderia);
		
		Fila13 = new JTextField();
		Fila13.setColumns(10);
		Fila13.setBounds(174, 31, 124, 20);
		panel.add(Fila13);
		
		Fila23 = new JTextField();
		Fila23.setColumns(10);
		Fila23.setBounds(174, 51, 124, 20);
		panel.add(Fila23);
		
		Fila33 = new JTextField();
		Fila33.setColumns(10);
		Fila33.setBounds(174, 71, 124, 20);
		panel.add(Fila33);
		
		Fila43 = new JTextField();
		Fila43.setColumns(10);
		Fila43.setBounds(174, 91, 124, 20);
		panel.add(Fila43);
		
		Fila53 = new JTextField();
		Fila53.setColumns(10);
		Fila53.setBounds(174, 111, 124, 20);
		panel.add(Fila53);
		
		Fila63 = new JTextField();
		Fila63.setColumns(10);
		Fila63.setBounds(174, 131, 124, 20);
		panel.add(Fila63);
		
		Fila73 = new JTextField();
		Fila73.setColumns(10);
		Fila73.setBounds(174, 151, 124, 20);
		panel.add(Fila73);
		
		Fila83 = new JTextField();
		Fila83.setColumns(10);
		Fila83.setBounds(174, 171, 124, 20);
		panel.add(Fila83);
		
		Fila93 = new JTextField();
		Fila93.setColumns(10);
		Fila93.setBounds(174, 191, 124, 20);
		panel.add(Fila93);
		
		Fila103 = new JTextField();
		Fila103.setColumns(10);
		Fila103.setBounds(174, 211, 124, 20);
		panel.add(Fila103);
		
		Fila123 = new JTextField();
		Fila123.setColumns(10);
		Fila123.setBounds(174, 251, 124, 20);
		panel.add(Fila123);
		
		Fila113 = new JTextField();
		Fila113.setColumns(10);
		Fila113.setBounds(174, 231, 124, 20);
		panel.add(Fila113);
		
		Fila133 = new JTextField();
		Fila133.setColumns(10);
		Fila133.setBounds(174, 271, 124, 20);
		panel.add(Fila133);
		
		Fila143 = new JTextField();
		Fila143.setColumns(10);
		Fila143.setBounds(174, 291, 124, 20);
		panel.add(Fila143);
		
		Fila163 = new JTextField();
		Fila163.setColumns(10);
		Fila163.setBounds(174, 331, 124, 20);
		panel.add(Fila163);
		
		Fila153 = new JTextField();
		Fila153.setColumns(10);
		Fila153.setBounds(174, 311, 124, 20);
		panel.add(Fila153);
		
		Fila173 = new JTextField();
		Fila173.setColumns(10);
		Fila173.setBounds(174, 351, 124, 20);
		panel.add(Fila173);
		
		Fila183 = new JTextField();
		Fila183.setColumns(10);
		Fila183.setBounds(174, 371, 124, 20);
		panel.add(Fila183);
		
		Fila193 = new JTextField();
		Fila193.setColumns(10);
		Fila193.setBounds(174, 391, 124, 20);
		panel.add(Fila193);
		
		Fila203 = new JTextField();
		Fila203.setColumns(10);
		Fila203.setBounds(174, 411, 124, 20);
		panel.add(Fila203);
		
		txtTiempo = new JTextField();
		txtTiempo.setText("TIEMPO");
		txtTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTiempo.setColumns(10);
		txtTiempo.setBounds(298, 11, 62, 20);
		panel.add(txtTiempo);
		
		Fila14 = new JTextField();
		Fila14.setColumns(10);
		Fila14.setBounds(298, 31, 62, 20);
		panel.add(Fila14);
		
		Fila24 = new JTextField();
		Fila24.setColumns(10);
		Fila24.setBounds(298, 51, 62, 20);
		panel.add(Fila24);
		
		Fila34 = new JTextField();
		Fila34.setColumns(10);
		Fila34.setBounds(298, 71, 62, 20);
		panel.add(Fila34);
		
		Fila44 = new JTextField();
		Fila44.setColumns(10);
		Fila44.setBounds(298, 91, 62, 20);
		panel.add(Fila44);
		
		Fila54 = new JTextField();
		Fila54.setColumns(10);
		Fila54.setBounds(298, 111, 62, 20);
		panel.add(Fila54);
		
		Fila64 = new JTextField();
		Fila64.setColumns(10);
		Fila64.setBounds(298, 131, 62, 20);
		panel.add(Fila64);
		
		Fila74 = new JTextField();
		Fila74.setColumns(10);
		Fila74.setBounds(298, 151, 62, 20);
		panel.add(Fila74);
		
		Fila84 = new JTextField();
		Fila84.setColumns(10);
		Fila84.setBounds(298, 171, 62, 20);
		panel.add(Fila84);
		
		Fila94 = new JTextField();
		Fila94.setColumns(10);
		Fila94.setBounds(298, 191, 62, 20);
		panel.add(Fila94);
		
		Fila104 = new JTextField();
		Fila104.setColumns(10);
		Fila104.setBounds(298, 211, 62, 20);
		panel.add(Fila104);
		
		Fila114 = new JTextField();
		Fila114.setColumns(10);
		Fila114.setBounds(298, 231, 62, 20);
		panel.add(Fila114);
		
		Fila124 = new JTextField();
		Fila124.setColumns(10);
		Fila124.setBounds(298, 251, 62, 20);
		panel.add(Fila124);
		
		Fila134 = new JTextField();
		Fila134.setColumns(10);
		Fila134.setBounds(298, 271, 62, 20);
		panel.add(Fila134);
		
		Fila144 = new JTextField();
		Fila144.setColumns(10);
		Fila144.setBounds(298, 291, 62, 20);
		panel.add(Fila144);
		
		Fila154 = new JTextField();
		Fila154.setColumns(10);
		Fila154.setBounds(298, 311, 62, 20);
		panel.add(Fila154);
		
		Fila164 = new JTextField();
		Fila164.setColumns(10);
		Fila164.setBounds(298, 331, 62, 20);
		panel.add(Fila164);
		
		Fila174 = new JTextField();
		Fila174.setColumns(10);
		Fila174.setBounds(298, 351, 62, 20);
		panel.add(Fila174);
		
		Fila184 = new JTextField();
		Fila184.setColumns(10);
		Fila184.setBounds(298, 371, 62, 20);
		panel.add(Fila184);
		
		Fila204 = new JTextField();
		Fila204.setColumns(10);
		Fila204.setBounds(298, 411, 62, 20);
		panel.add(Fila204);
		
		Fila194 = new JTextField();
		Fila194.setColumns(10);
		Fila194.setBounds(298, 391, 62, 20);
		panel.add(Fila194);
		
		txtVueltas = new JTextField();
		txtVueltas.setText("VUELTAS");
		txtVueltas.setHorizontalAlignment(SwingConstants.CENTER);
		txtVueltas.setColumns(10);
		txtVueltas.setBounds(360, 11, 98, 20);
		panel.add(txtVueltas);
		
		Fila15 = new JTextField();
		Fila15.setColumns(10);
		Fila15.setBounds(360, 31, 98, 20);
		panel.add(Fila15);
		
		Fila25 = new JTextField();
		Fila25.setColumns(10);
		Fila25.setBounds(360, 51, 98, 20);
		panel.add(Fila25);
		
		Fila35 = new JTextField();
		Fila35.setColumns(10);
		Fila35.setBounds(360, 71, 98, 20);
		panel.add(Fila35);
		
		Fila45 = new JTextField();
		Fila45.setColumns(10);
		Fila45.setBounds(360, 91, 98, 20);
		panel.add(Fila45);
		
		Fila55 = new JTextField();
		Fila55.setColumns(10);
		Fila55.setBounds(360, 111, 98, 20);
		panel.add(Fila55);
		
		Fila65 = new JTextField();
		Fila65.setColumns(10);
		Fila65.setBounds(360, 131, 98, 20);
		panel.add(Fila65);
		
		Fila75 = new JTextField();
		Fila75.setColumns(10);
		Fila75.setBounds(360, 151, 98, 20);
		panel.add(Fila75);
		
		Fila85 = new JTextField();
		Fila85.setColumns(10);
		Fila85.setBounds(360, 171, 98, 20);
		panel.add(Fila85);
		
		Fila95 = new JTextField();
		Fila95.setColumns(10);
		Fila95.setBounds(360, 191, 98, 20);
		panel.add(Fila95);
		
		Fila105 = new JTextField();
		Fila105.setColumns(10);
		Fila105.setBounds(360, 211, 98, 20);
		panel.add(Fila105);
		
		Fila115 = new JTextField();
		Fila115.setColumns(10);
		Fila115.setBounds(360, 231, 98, 20);
		panel.add(Fila115);
		
		Fila125 = new JTextField();
		Fila125.setColumns(10);
		Fila125.setBounds(360, 251, 98, 20);
		panel.add(Fila125);
		
		Fila136 = new JTextField();
		Fila136.setColumns(10);
		Fila136.setBounds(360, 271, 98, 20);
		panel.add(Fila136);
		
		Fila145 = new JTextField();
		Fila145.setColumns(10);
		Fila145.setBounds(360, 291, 98, 20);
		panel.add(Fila145);
		
		Fila155 = new JTextField();
		Fila155.setColumns(10);
		Fila155.setBounds(360, 311, 98, 20);
		panel.add(Fila155);
		
		Fila165 = new JTextField();
		Fila165.setColumns(10);
		Fila165.setBounds(360, 331, 98, 20);
		panel.add(Fila165);
		
		Fila175 = new JTextField();
		Fila175.setColumns(10);
		Fila175.setBounds(360, 351, 98, 20);
		panel.add(Fila175);
		
		Fila185 = new JTextField();
		Fila185.setColumns(10);
		Fila185.setBounds(360, 371, 98, 20);
		panel.add(Fila185);
		
		Fila205 = new JTextField();
		Fila205.setColumns(10);
		Fila205.setBounds(360, 411, 98, 20);
		panel.add(Fila205);
		
		Fila195 = new JTextField();
		Fila195.setColumns(10);
		Fila195.setBounds(360, 391, 98, 20);
		panel.add(Fila195);
		
		txtSector = new JTextField();
		txtSector.setText("SECTOR");
		txtSector.setHorizontalAlignment(SwingConstants.CENTER);
		txtSector.setColumns(10);
		txtSector.setBounds(458, 11, 96, 20);
		panel.add(txtSector);
		
		Fila16 = new JTextField();
		Fila16.setColumns(10);
		Fila16.setBounds(458, 31, 96, 20);
		panel.add(Fila16);
		
		Fila26 = new JTextField();
		Fila26.setColumns(10);
		Fila26.setBounds(458, 51, 96, 20);
		panel.add(Fila26);
		
		Fila36 = new JTextField();
		Fila36.setColumns(10);
		Fila36.setBounds(458, 71, 96, 20);
		panel.add(Fila36);
		
		Fila46 = new JTextField();
		Fila46.setColumns(10);
		Fila46.setBounds(458, 91, 96, 20);
		panel.add(Fila46);
		
		Fila56 = new JTextField();
		Fila56.setColumns(10);
		Fila56.setBounds(458, 111, 96, 20);
		panel.add(Fila56);
		
		Fila66 = new JTextField();
		Fila66.setColumns(10);
		Fila66.setBounds(458, 131, 96, 20);
		panel.add(Fila66);
		
		Fila76 = new JTextField();
		Fila76.setColumns(10);
		Fila76.setBounds(458, 151, 96, 20);
		panel.add(Fila76);
		
		Fila86 = new JTextField();
		Fila86.setColumns(10);
		Fila86.setBounds(458, 171, 96, 20);
		panel.add(Fila86);
		
		Fila96 = new JTextField();
		Fila96.setColumns(10);
		Fila96.setBounds(458, 191, 96, 20);
		panel.add(Fila96);
		
		Fila106 = new JTextField();
		Fila106.setColumns(10);
		Fila106.setBounds(458, 211, 96, 20);
		panel.add(Fila106);
		
		Fila116 = new JTextField();
		Fila116.setColumns(10);
		Fila116.setBounds(458, 231, 96, 20);
		panel.add(Fila116);
		
		Fila126 = new JTextField();
		Fila126.setColumns(10);
		Fila126.setBounds(458, 251, 96, 20);
		panel.add(Fila126);
		
		Fila137 = new JTextField();
		Fila137.setColumns(10);
		Fila137.setBounds(458, 271, 96, 20);
		panel.add(Fila137);
		
		Fila146 = new JTextField();
		Fila146.setColumns(10);
		Fila146.setBounds(458, 291, 96, 20);
		panel.add(Fila146);
		
		Fila156 = new JTextField();
		Fila156.setColumns(10);
		Fila156.setBounds(458, 311, 96, 20);
		panel.add(Fila156);
		
		Fila166 = new JTextField();
		Fila166.setColumns(10);
		Fila166.setBounds(458, 331, 96, 20);
		panel.add(Fila166);
		
		Fila176 = new JTextField();
		Fila176.setColumns(10);
		Fila176.setBounds(458, 351, 96, 20);
		panel.add(Fila176);
		
		Fila186 = new JTextField();
		Fila186.setColumns(10);
		Fila186.setBounds(458, 371, 96, 20);
		panel.add(Fila186);
		
		Fila206 = new JTextField();
		Fila206.setColumns(10);
		Fila206.setBounds(458, 411, 96, 20);
		panel.add(Fila206);
		
		Fila196 = new JTextField();
		Fila196.setColumns(10);
		Fila196.setBounds(458, 391, 96, 20);
		panel.add(Fila196);
		
		txtVueltaRapida = new JTextField();
		txtVueltaRapida.setText("VUELTA RAPIDA");
		txtVueltaRapida.setHorizontalAlignment(SwingConstants.CENTER);
		txtVueltaRapida.setColumns(10);
		txtVueltaRapida.setBounds(554, 11, 90, 20);
		panel.add(txtVueltaRapida);
		
		Fila17 = new JTextField();
		Fila17.setColumns(10);
		Fila17.setBounds(554, 31, 90, 20);
		panel.add(Fila17);
		
		Fila27 = new JTextField();
		Fila27.setColumns(10);
		Fila27.setBounds(554, 51, 90, 20);
		panel.add(Fila27);
		
		Fila37 = new JTextField();
		Fila37.setColumns(10);
		Fila37.setBounds(554, 71, 90, 20);
		panel.add(Fila37);
		
		Fila47 = new JTextField();
		Fila47.setColumns(10);
		Fila47.setBounds(554, 91, 90, 20);
		panel.add(Fila47);
		
		Fila57 = new JTextField();
		Fila57.setColumns(10);
		Fila57.setBounds(554, 111, 90, 20);
		panel.add(Fila57);
		
		Fila67 = new JTextField();
		Fila67.setColumns(10);
		Fila67.setBounds(554, 131, 90, 20);
		panel.add(Fila67);
		
		Fila77 = new JTextField();
		Fila77.setColumns(10);
		Fila77.setBounds(554, 151, 90, 20);
		panel.add(Fila77);
		
		Fila87 = new JTextField();
		Fila87.setColumns(10);
		Fila87.setBounds(554, 171, 90, 20);
		panel.add(Fila87);
		
		Fila97 = new JTextField();
		Fila97.setColumns(10);
		Fila97.setBounds(554, 191, 90, 20);
		panel.add(Fila97);
		
		Fila107 = new JTextField();
		Fila107.setColumns(10);
		Fila107.setBounds(554, 211, 90, 20);
		panel.add(Fila107);
		
		Fila117 = new JTextField();
		Fila117.setColumns(10);
		Fila117.setBounds(554, 231, 90, 20);
		panel.add(Fila117);
		
		Fila127 = new JTextField();
		Fila127.setColumns(10);
		Fila127.setBounds(554, 251, 90, 20);
		panel.add(Fila127);
		
		Fila138 = new JTextField();
		Fila138.setColumns(10);
		Fila138.setBounds(554, 271, 90, 20);
		panel.add(Fila138);
		
		Fila147 = new JTextField();
		Fila147.setColumns(10);
		Fila147.setBounds(554, 291, 90, 20);
		panel.add(Fila147);
		
		Fila157 = new JTextField();
		Fila157.setColumns(10);
		Fila157.setBounds(554, 311, 90, 20);
		panel.add(Fila157);
		
		Fila167 = new JTextField();
		Fila167.setColumns(10);
		Fila167.setBounds(554, 331, 90, 20);
		panel.add(Fila167);
		
		Fila177 = new JTextField();
		Fila177.setColumns(10);
		Fila177.setBounds(554, 351, 90, 20);
		panel.add(Fila177);
		
		Fila187 = new JTextField();
		Fila187.setColumns(10);
		Fila187.setBounds(554, 371, 90, 20);
		panel.add(Fila187);
		
		Fila207 = new JTextField();
		Fila207.setColumns(10);
		Fila207.setBounds(554, 411, 90, 20);
		panel.add(Fila207);
		
		Fila197 = new JTextField();
		Fila197.setColumns(10);
		Fila197.setBounds(554, 391, 90, 20);
		panel.add(Fila197);
	}
}
