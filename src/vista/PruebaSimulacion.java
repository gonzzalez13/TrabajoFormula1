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
		Fila1Pos.setBackground(Color.WHITE);
		Fila1Pos.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila1Pos.setEditable(false);
		Fila1Pos.setHorizontalAlignment(SwingConstants.CENTER);
		Fila1Pos.setText("POS.");
		Fila1Pos.setBounds(75, 48, 40, 20);
		panel.add(Fila1Pos);
		Fila1Pos.setColumns(10);
		
		Fila11 = new JTextField();
		Fila11.setBackground(Color.WHITE);
		Fila11.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila11.setEditable(false);
		Fila11.setColumns(10);
		Fila11.setBounds(75, 68, 40, 20);
		panel.add(Fila11);
		
		Fila21 = new JTextField();
		Fila21.setBackground(Color.WHITE);
		Fila21.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila21.setEditable(false);
		Fila21.setColumns(10);
		Fila21.setBounds(75, 88, 40, 20);
		panel.add(Fila21);
		
		Fila31 = new JTextField();
		Fila31.setBackground(Color.WHITE);
		Fila31.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila31.setEditable(false);
		Fila31.setColumns(10);
		Fila31.setBounds(75, 108, 40, 20);
		panel.add(Fila31);
		
		Fila41 = new JTextField();
		Fila41.setBackground(Color.WHITE);
		Fila41.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila41.setEditable(false);
		Fila41.setColumns(10);
		Fila41.setBounds(75, 128, 40, 20);
		panel.add(Fila41);
		
		Fila51 = new JTextField();
		Fila51.setBackground(Color.WHITE);
		Fila51.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila51.setEditable(false);
		Fila51.setColumns(10);
		Fila51.setBounds(75, 148, 40, 20);
		panel.add(Fila51);
		
		Fila61 = new JTextField();
		Fila61.setBackground(Color.WHITE);
		Fila61.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila61.setEditable(false);
		Fila61.setColumns(10);
		Fila61.setBounds(75, 168, 40, 20);
		panel.add(Fila61);
		
		Fila71 = new JTextField();
		Fila71.setBackground(Color.WHITE);
		Fila71.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila71.setEditable(false);
		Fila71.setColumns(10);
		Fila71.setBounds(75, 188, 40, 20);
		panel.add(Fila71);
		
		Fila81 = new JTextField();
		Fila81.setBackground(Color.WHITE);
		Fila81.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila81.setEditable(false);
		Fila81.setColumns(10);
		Fila81.setBounds(75, 208, 40, 20);
		panel.add(Fila81);
		
		Fila91 = new JTextField();
		Fila91.setBackground(Color.WHITE);
		Fila91.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila91.setEditable(false);
		Fila91.setColumns(10);
		Fila91.setBounds(75, 228, 40, 20);
		panel.add(Fila91);
		
		Fila101 = new JTextField();
		Fila101.setBackground(Color.WHITE);
		Fila101.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila101.setEditable(false);
		Fila101.setColumns(10);
		Fila101.setBounds(75, 248, 40, 20);
		panel.add(Fila101);
		
		Fila111 = new JTextField();
		Fila111.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila111.setEditable(false);
		Fila111.setBackground(Color.WHITE);
		Fila111.setColumns(10);
		Fila111.setBounds(75, 268, 40, 20);
		panel.add(Fila111);
		
		Fila121 = new JTextField();
		Fila121.setEditable(false);
		Fila121.setBackground(Color.WHITE);
		Fila121.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila121.setColumns(10);
		Fila121.setBounds(75, 288, 40, 20);
		panel.add(Fila121);
		
		Fila131 = new JTextField();
		Fila131.setEditable(false);
		Fila131.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila131.setBackground(Color.WHITE);
		Fila131.setColumns(10);
		Fila131.setBounds(75, 308, 40, 20);
		panel.add(Fila131);
		
		Fila141 = new JTextField();
		Fila141.setBackground(Color.WHITE);
		Fila141.setEditable(false);
		Fila141.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila141.setColumns(10);
		Fila141.setBounds(75, 328, 40, 20);
		panel.add(Fila141);
		
		Fila151 = new JTextField();
		Fila151.setBackground(Color.WHITE);
		Fila151.setEditable(false);
		Fila151.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila151.setColumns(10);
		Fila151.setBounds(75, 348, 40, 20);
		panel.add(Fila151);
		
		Fila161 = new JTextField();
		Fila161.setBackground(Color.WHITE);
		Fila161.setEditable(false);
		Fila161.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila161.setColumns(10);
		Fila161.setBounds(75, 368, 40, 20);
		panel.add(Fila161);
		
		Fila171 = new JTextField();
		Fila171.setBackground(Color.WHITE);
		Fila171.setEditable(false);
		Fila171.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila171.setColumns(10);
		Fila171.setBounds(75, 388, 40, 20);
		panel.add(Fila171);
		
		Fila201 = new JTextField();
		Fila201.setBackground(Color.WHITE);
		Fila201.setEditable(false);
		Fila201.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila201.setColumns(10);
		Fila201.setBounds(75, 448, 40, 20);
		panel.add(Fila201);
		
		Fila191 = new JTextField();
		Fila191.setBackground(Color.WHITE);
		Fila191.setEditable(false);
		Fila191.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila191.setColumns(10);
		Fila191.setBounds(75, 428, 40, 20);
		panel.add(Fila191);
		
		Fila181 = new JTextField();
		Fila181.setBackground(Color.WHITE);
		Fila181.setEditable(false);
		Fila181.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila181.setColumns(10);
		Fila181.setBounds(75, 408, 40, 20);
		panel.add(Fila181);
		
		txtPiloto = new JTextField();
		txtPiloto.setBackground(Color.WHITE);
		txtPiloto.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		txtPiloto.setEditable(false);
		txtPiloto.setHorizontalAlignment(SwingConstants.CENTER);
		txtPiloto.setText("PILOTO");
		txtPiloto.setColumns(10);
		txtPiloto.setBounds(115, 48, 124, 20);
		panel.add(txtPiloto);
		
		Fila12 = new JTextField();
		Fila12.setBackground(Color.WHITE);
		Fila12.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila12.setEditable(false);
		Fila12.setColumns(10);
		Fila12.setBounds(115, 68, 124, 20);
		panel.add(Fila12);
		
		Fila22 = new JTextField();
		Fila22.setBackground(Color.WHITE);
		Fila22.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila22.setEditable(false);
		Fila22.setColumns(10);
		Fila22.setBounds(115, 88, 124, 20);
		panel.add(Fila22);
		
		Fila32 = new JTextField();
		Fila32.setBackground(Color.WHITE);
		Fila32.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila32.setEditable(false);
		Fila32.setColumns(10);
		Fila32.setBounds(115, 108, 124, 20);
		panel.add(Fila32);
		
		Fila42 = new JTextField();
		Fila42.setBackground(Color.WHITE);
		Fila42.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila42.setEditable(false);
		Fila42.setColumns(10);
		Fila42.setBounds(115, 128, 124, 20);
		panel.add(Fila42);
		
		Fila52 = new JTextField();
		Fila52.setBackground(Color.WHITE);
		Fila52.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila52.setEditable(false);
		Fila52.setColumns(10);
		Fila52.setBounds(115, 148, 124, 20);
		panel.add(Fila52);
		
		Fila62 = new JTextField();
		Fila62.setBackground(Color.WHITE);
		Fila62.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila62.setEditable(false);
		Fila62.setColumns(10);
		Fila62.setBounds(115, 168, 124, 20);
		panel.add(Fila62);
		
		Fila72 = new JTextField();
		Fila72.setBackground(Color.WHITE);
		Fila72.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila72.setEditable(false);
		Fila72.setColumns(10);
		Fila72.setBounds(115, 188, 124, 20);
		panel.add(Fila72);
		
		Fila82 = new JTextField();
		Fila82.setBackground(Color.WHITE);
		Fila82.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila82.setEditable(false);
		Fila82.setColumns(10);
		Fila82.setBounds(115, 208, 124, 20);
		panel.add(Fila82);
		
		Fila92 = new JTextField();
		Fila92.setBackground(Color.WHITE);
		Fila92.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila92.setEditable(false);
		Fila92.setColumns(10);
		Fila92.setBounds(115, 228, 124, 20);
		panel.add(Fila92);
		
		Fila102 = new JTextField();
		Fila102.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila102.setBackground(Color.WHITE);
		Fila102.setEditable(false);
		Fila102.setColumns(10);
		Fila102.setBounds(115, 248, 124, 20);
		panel.add(Fila102);
		
		Fila122 = new JTextField();
		Fila122.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila122.setBackground(Color.WHITE);
		Fila122.setEditable(false);
		Fila122.setColumns(10);
		Fila122.setBounds(115, 288, 124, 20);
		panel.add(Fila122);
		
		Fila112 = new JTextField();
		Fila112.setBackground(Color.WHITE);
		Fila112.setEditable(false);
		Fila112.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila112.setColumns(10);
		Fila112.setBounds(115, 268, 124, 20);
		panel.add(Fila112);
		
		Fila132 = new JTextField();
		Fila132.setBackground(Color.WHITE);
		Fila132.setEditable(false);
		Fila132.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila132.setColumns(10);
		Fila132.setBounds(115, 308, 124, 20);
		panel.add(Fila132);
		
		Fila142 = new JTextField();
		Fila142.setBackground(Color.WHITE);
		Fila142.setEditable(false);
		Fila142.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila142.setColumns(10);
		Fila142.setBounds(115, 328, 124, 20);
		panel.add(Fila142);
		
		Fila152 = new JTextField();
		Fila152.setBackground(Color.WHITE);
		Fila152.setEditable(false);
		Fila152.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila152.setColumns(10);
		Fila152.setBounds(115, 348, 124, 20);
		panel.add(Fila152);
		
		Fila162 = new JTextField();
		Fila162.setBackground(Color.WHITE);
		Fila162.setEditable(false);
		Fila162.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila162.setColumns(10);
		Fila162.setBounds(115, 368, 124, 20);
		panel.add(Fila162);
		
		Fila172 = new JTextField();
		Fila172.setBackground(Color.WHITE);
		Fila172.setEditable(false);
		Fila172.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila172.setColumns(10);
		Fila172.setBounds(115, 388, 124, 20);
		panel.add(Fila172);
		
		Fila182 = new JTextField();
		Fila182.setBackground(Color.WHITE);
		Fila182.setEditable(false);
		Fila182.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila182.setColumns(10);
		Fila182.setBounds(115, 408, 124, 20);
		panel.add(Fila182);
		
		Fila192 = new JTextField();
		Fila192.setBackground(Color.WHITE);
		Fila192.setEditable(false);
		Fila192.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila192.setColumns(10);
		Fila192.setBounds(115, 428, 124, 20);
		panel.add(Fila192);
		
		Fila202 = new JTextField();
		Fila202.setBackground(Color.WHITE);
		Fila202.setEditable(false);
		Fila202.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila202.setColumns(10);
		Fila202.setBounds(115, 448, 124, 20);
		panel.add(Fila202);
		
		txtEscuderia = new JTextField();
		txtEscuderia.setBackground(Color.WHITE);
		txtEscuderia.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		txtEscuderia.setEditable(false);
		txtEscuderia.setText("ESCUDERIA");
		txtEscuderia.setHorizontalAlignment(SwingConstants.CENTER);
		txtEscuderia.setColumns(10);
		txtEscuderia.setBounds(239, 48, 124, 20);
		panel.add(txtEscuderia);
		
		Fila13 = new JTextField();
		Fila13.setBackground(Color.WHITE);
		Fila13.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila13.setEditable(false);
		Fila13.setColumns(10);
		Fila13.setBounds(239, 68, 124, 20);
		panel.add(Fila13);
		
		Fila23 = new JTextField();
		Fila23.setBackground(Color.WHITE);
		Fila23.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila23.setEditable(false);
		Fila23.setColumns(10);
		Fila23.setBounds(239, 88, 124, 20);
		panel.add(Fila23);
		
		Fila33 = new JTextField();
		Fila33.setBackground(Color.WHITE);
		Fila33.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila33.setEditable(false);
		Fila33.setColumns(10);
		Fila33.setBounds(239, 108, 124, 20);
		panel.add(Fila33);
		
		Fila43 = new JTextField();
		Fila43.setBackground(Color.WHITE);
		Fila43.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila43.setEditable(false);
		Fila43.setColumns(10);
		Fila43.setBounds(239, 128, 124, 20);
		panel.add(Fila43);
		
		Fila53 = new JTextField();
		Fila53.setBackground(Color.WHITE);
		Fila53.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila53.setEditable(false);
		Fila53.setColumns(10);
		Fila53.setBounds(239, 148, 124, 20);
		panel.add(Fila53);
		
		Fila63 = new JTextField();
		Fila63.setBackground(Color.WHITE);
		Fila63.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila63.setEditable(false);
		Fila63.setColumns(10);
		Fila63.setBounds(239, 168, 124, 20);
		panel.add(Fila63);
		
		Fila73 = new JTextField();
		Fila73.setBackground(Color.WHITE);
		Fila73.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila73.setEditable(false);
		Fila73.setColumns(10);
		Fila73.setBounds(239, 188, 124, 20);
		panel.add(Fila73);
		
		Fila83 = new JTextField();
		Fila83.setBackground(Color.WHITE);
		Fila83.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila83.setEditable(false);
		Fila83.setColumns(10);
		Fila83.setBounds(239, 208, 124, 20);
		panel.add(Fila83);
		
		Fila93 = new JTextField();
		Fila93.setBackground(Color.WHITE);
		Fila93.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila93.setEditable(false);
		Fila93.setColumns(10);
		Fila93.setBounds(239, 228, 124, 20);
		panel.add(Fila93);
		
		Fila103 = new JTextField();
		Fila103.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila103.setBackground(Color.WHITE);
		Fila103.setEditable(false);
		Fila103.setColumns(10);
		Fila103.setBounds(239, 248, 124, 20);
		panel.add(Fila103);
		
		Fila123 = new JTextField();
		Fila123.setBackground(Color.WHITE);
		Fila123.setEditable(false);
		Fila123.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila123.setColumns(10);
		Fila123.setBounds(239, 288, 124, 20);
		panel.add(Fila123);
		
		Fila113 = new JTextField();
		Fila113.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila113.setEditable(false);
		Fila113.setBackground(Color.WHITE);
		Fila113.setColumns(10);
		Fila113.setBounds(239, 268, 124, 20);
		panel.add(Fila113);
		
		Fila133 = new JTextField();
		Fila133.setBackground(Color.WHITE);
		Fila133.setEditable(false);
		Fila133.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila133.setColumns(10);
		Fila133.setBounds(239, 308, 124, 20);
		panel.add(Fila133);
		
		Fila143 = new JTextField();
		Fila143.setBackground(Color.WHITE);
		Fila143.setEditable(false);
		Fila143.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila143.setColumns(10);
		Fila143.setBounds(239, 328, 124, 20);
		panel.add(Fila143);
		
		Fila163 = new JTextField();
		Fila163.setBackground(Color.WHITE);
		Fila163.setEditable(false);
		Fila163.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila163.setColumns(10);
		Fila163.setBounds(239, 368, 124, 20);
		panel.add(Fila163);
		
		Fila153 = new JTextField();
		Fila153.setBackground(Color.WHITE);
		Fila153.setEditable(false);
		Fila153.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila153.setColumns(10);
		Fila153.setBounds(239, 348, 124, 20);
		panel.add(Fila153);
		
		Fila173 = new JTextField();
		Fila173.setBackground(Color.WHITE);
		Fila173.setEditable(false);
		Fila173.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila173.setColumns(10);
		Fila173.setBounds(239, 388, 124, 20);
		panel.add(Fila173);
		
		Fila183 = new JTextField();
		Fila183.setBackground(Color.WHITE);
		Fila183.setEditable(false);
		Fila183.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila183.setColumns(10);
		Fila183.setBounds(239, 408, 124, 20);
		panel.add(Fila183);
		
		Fila193 = new JTextField();
		Fila193.setBackground(Color.WHITE);
		Fila193.setEditable(false);
		Fila193.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila193.setColumns(10);
		Fila193.setBounds(239, 428, 124, 20);
		panel.add(Fila193);
		
		Fila203 = new JTextField();
		Fila203.setBackground(Color.WHITE);
		Fila203.setEditable(false);
		Fila203.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila203.setColumns(10);
		Fila203.setBounds(239, 448, 124, 20);
		panel.add(Fila203);
		
		txtVueltaRapida = new JTextField();
		txtVueltaRapida.setBackground(Color.WHITE);
		txtVueltaRapida.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		txtVueltaRapida.setEditable(false);
		txtVueltaRapida.setText("VUELTA RAPIDA");
		txtVueltaRapida.setHorizontalAlignment(SwingConstants.CENTER);
		txtVueltaRapida.setColumns(10);
		txtVueltaRapida.setBounds(363, 48, 100, 20);
		panel.add(txtVueltaRapida);
		
		Fila14 = new JTextField();
		Fila14.setBackground(Color.WHITE);
		Fila14.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila14.setEditable(false);
		Fila14.setColumns(10);
		Fila14.setBounds(363, 68, 100, 20);
		panel.add(Fila14);
		
		Fila24 = new JTextField();
		Fila24.setBackground(Color.WHITE);
		Fila24.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila24.setEditable(false);
		Fila24.setColumns(10);
		Fila24.setBounds(363, 88, 100, 20);
		panel.add(Fila24);
		
		Fila34 = new JTextField();
		Fila34.setBackground(Color.WHITE);
		Fila34.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila34.setEditable(false);
		Fila34.setColumns(10);
		Fila34.setBounds(363, 108, 100, 20);
		panel.add(Fila34);
		
		Fila44 = new JTextField();
		Fila44.setBackground(Color.WHITE);
		Fila44.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila44.setEditable(false);
		Fila44.setColumns(10);
		Fila44.setBounds(363, 128, 100, 20);
		panel.add(Fila44);
		
		Fila54 = new JTextField();
		Fila54.setBackground(Color.WHITE);
		Fila54.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila54.setEditable(false);
		Fila54.setColumns(10);
		Fila54.setBounds(363, 148, 100, 20);
		panel.add(Fila54);
		
		Fila64 = new JTextField();
		Fila64.setBackground(Color.WHITE);
		Fila64.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila64.setEditable(false);
		Fila64.setColumns(10);
		Fila64.setBounds(363, 168, 100, 20);
		panel.add(Fila64);
		
		Fila74 = new JTextField();
		Fila74.setBackground(Color.WHITE);
		Fila74.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila74.setEditable(false);
		Fila74.setColumns(10);
		Fila74.setBounds(363, 188, 100, 20);
		panel.add(Fila74);
		
		Fila84 = new JTextField();
		Fila84.setBackground(Color.WHITE);
		Fila84.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila84.setEditable(false);
		Fila84.setColumns(10);
		Fila84.setBounds(363, 208, 100, 20);
		panel.add(Fila84);
		
		Fila94 = new JTextField();
		Fila94.setBackground(Color.WHITE);
		Fila94.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila94.setEditable(false);
		Fila94.setColumns(10);
		Fila94.setBounds(363, 228, 100, 20);
		panel.add(Fila94);
		
		Fila104 = new JTextField();
		Fila104.setBackground(Color.WHITE);
		Fila104.setEditable(false);
		Fila104.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila104.setColumns(10);
		Fila104.setBounds(363, 248, 100, 20);
		panel.add(Fila104);
		
		Fila114 = new JTextField();
		Fila114.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila114.setEditable(false);
		Fila114.setBackground(Color.WHITE);
		Fila114.setColumns(10);
		Fila114.setBounds(363, 268, 100, 20);
		panel.add(Fila114);
		
		Fila124 = new JTextField();
		Fila124.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila124.setEditable(false);
		Fila124.setBackground(Color.WHITE);
		Fila124.setColumns(10);
		Fila124.setBounds(363, 288, 100, 20);
		panel.add(Fila124);
		
		Fila134 = new JTextField();
		Fila134.setBackground(Color.WHITE);
		Fila134.setEditable(false);
		Fila134.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila134.setColumns(10);
		Fila134.setBounds(363, 308, 100, 20);
		panel.add(Fila134);
		
		Fila144 = new JTextField();
		Fila144.setBackground(Color.WHITE);
		Fila144.setEditable(false);
		Fila144.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila144.setColumns(10);
		Fila144.setBounds(363, 328, 100, 20);
		panel.add(Fila144);
		
		Fila154 = new JTextField();
		Fila154.setBackground(Color.WHITE);
		Fila154.setEditable(false);
		Fila154.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila154.setColumns(10);
		Fila154.setBounds(363, 348, 100, 20);
		panel.add(Fila154);
		
		Fila164 = new JTextField();
		Fila164.setBackground(Color.WHITE);
		Fila164.setEditable(false);
		Fila164.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila164.setColumns(10);
		Fila164.setBounds(363, 368, 100, 20);
		panel.add(Fila164);
		
		Fila174 = new JTextField();
		Fila174.setBackground(Color.WHITE);
		Fila174.setEditable(false);
		Fila174.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila174.setColumns(10);
		Fila174.setBounds(363, 388, 100, 20);
		panel.add(Fila174);
		
		Fila184 = new JTextField();
		Fila184.setBackground(Color.WHITE);
		Fila184.setEditable(false);
		Fila184.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila184.setColumns(10);
		Fila184.setBounds(363, 408, 100, 20);
		panel.add(Fila184);
		
		Fila204 = new JTextField();
		Fila204.setBackground(Color.WHITE);
		Fila204.setEditable(false);
		Fila204.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila204.setColumns(10);
		Fila204.setBounds(363, 448, 100, 20);
		panel.add(Fila204);
		
		Fila194 = new JTextField();
		Fila194.setBackground(Color.WHITE);
		Fila194.setEditable(false);
		Fila194.setFont(new Font("Bauhaus 93", Font.PLAIN, 11));
		Fila194.setColumns(10);
		Fila194.setBounds(363, 428, 100, 20);
		panel.add(Fila194);
		
		JPanel PanelLabelCircuito = new JPanel();
		PanelLabelCircuito.setBounds(495, 48, 443, 290);
		panel.add(PanelLabelCircuito);
		
		JLabel LabelCircuito = new JLabel("");
		PanelLabelCircuito.add(LabelCircuito);
		
		JLabel lblPanel = new JLabel("");
		lblPanel.setBounds(0, 0, 974, 539);
		lblPanel.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.PNG"));
		panel.add(lblPanel);
	}
}
