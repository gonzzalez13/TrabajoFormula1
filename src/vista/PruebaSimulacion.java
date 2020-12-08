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
	private JTextField txtVueltaRapida;
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
		
		txtVueltaRapida = new JTextField();
		txtVueltaRapida.setText("VUELTA RAPIDA");
		txtVueltaRapida.setHorizontalAlignment(SwingConstants.CENTER);
		txtVueltaRapida.setColumns(10);
		txtVueltaRapida.setBounds(298, 11, 90, 20);
		panel.add(txtVueltaRapida);
		
		Fila14 = new JTextField();
		Fila14.setColumns(10);
		Fila14.setBounds(298, 31, 90, 20);
		panel.add(Fila14);
		
		Fila24 = new JTextField();
		Fila24.setColumns(10);
		Fila24.setBounds(298, 51, 90, 20);
		panel.add(Fila24);
		
		Fila34 = new JTextField();
		Fila34.setColumns(10);
		Fila34.setBounds(298, 71, 90, 20);
		panel.add(Fila34);
		
		Fila44 = new JTextField();
		Fila44.setColumns(10);
		Fila44.setBounds(298, 91, 90, 20);
		panel.add(Fila44);
		
		Fila54 = new JTextField();
		Fila54.setColumns(10);
		Fila54.setBounds(298, 111, 90, 20);
		panel.add(Fila54);
		
		Fila64 = new JTextField();
		Fila64.setColumns(10);
		Fila64.setBounds(298, 131, 90, 20);
		panel.add(Fila64);
		
		Fila74 = new JTextField();
		Fila74.setColumns(10);
		Fila74.setBounds(298, 151, 90, 20);
		panel.add(Fila74);
		
		Fila84 = new JTextField();
		Fila84.setColumns(10);
		Fila84.setBounds(298, 171, 90, 20);
		panel.add(Fila84);
		
		Fila94 = new JTextField();
		Fila94.setColumns(10);
		Fila94.setBounds(298, 191, 90, 20);
		panel.add(Fila94);
		
		Fila104 = new JTextField();
		Fila104.setColumns(10);
		Fila104.setBounds(298, 211, 90, 20);
		panel.add(Fila104);
		
		Fila114 = new JTextField();
		Fila114.setColumns(10);
		Fila114.setBounds(298, 231, 90, 20);
		panel.add(Fila114);
		
		Fila124 = new JTextField();
		Fila124.setColumns(10);
		Fila124.setBounds(298, 251, 90, 20);
		panel.add(Fila124);
		
		Fila134 = new JTextField();
		Fila134.setColumns(10);
		Fila134.setBounds(298, 271, 90, 20);
		panel.add(Fila134);
		
		Fila144 = new JTextField();
		Fila144.setColumns(10);
		Fila144.setBounds(298, 291, 90, 20);
		panel.add(Fila144);
		
		Fila154 = new JTextField();
		Fila154.setColumns(10);
		Fila154.setBounds(298, 311, 90, 20);
		panel.add(Fila154);
		
		Fila164 = new JTextField();
		Fila164.setColumns(10);
		Fila164.setBounds(298, 331, 90, 20);
		panel.add(Fila164);
		
		Fila174 = new JTextField();
		Fila174.setColumns(10);
		Fila174.setBounds(298, 351, 90, 20);
		panel.add(Fila174);
		
		Fila184 = new JTextField();
		Fila184.setColumns(10);
		Fila184.setBounds(298, 371, 90, 20);
		panel.add(Fila184);
		
		Fila204 = new JTextField();
		Fila204.setColumns(10);
		Fila204.setBounds(298, 411, 90, 20);
		panel.add(Fila204);
		
		Fila194 = new JTextField();
		Fila194.setColumns(10);
		Fila194.setBounds(298, 391, 90, 20);
		panel.add(Fila194);
		
		JPanel PanelLabelCircuito = new JPanel();
		PanelLabelCircuito.setBounds(398, 11, 566, 290);
		panel.add(PanelLabelCircuito);
		
		JLabel LabelCircuito = new JLabel("");
		PanelLabelCircuito.add(LabelCircuito);
	}
}
