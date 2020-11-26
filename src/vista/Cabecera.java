package vista;

import java.awt.Color;
import java.awt.Font;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import logica.Controlador;

public class Cabecera extends JFrame{
	protected JButton btnInicio, btnEscuderias, btnPilotos, btnGranPre, btnClasi, btnLogin, btnLogo;
	protected JPanel menu,contentPane;
	private Inicio inicio ;
	private Escuderia escuderia;
	public Cabecera() {

	}
	
	public void menu(Controlador controlador){
		menu = new JPanel();
		menu.setLayout(null);
		menu.setBackground(Color.LIGHT_GRAY);
		menu.setBounds(0, 0, 859, 71);
		contentPane.add(menu);

		btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(controlador);
		btnInicio.setForeground(Color.RED);
		btnInicio.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnInicio.setBackground(Color.DARK_GRAY);
		btnInicio.setBounds(152, 11, 74, 48);
		menu.add(btnInicio);

		btnEscuderias = new JButton("Escuderias");
		btnEscuderias.addActionListener(controlador);
		btnEscuderias.setForeground(Color.RED);
		btnEscuderias.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnEscuderias.setBackground(Color.DARK_GRAY);
		btnEscuderias.setBounds(236, 11, 112, 48);
		menu.add(btnEscuderias);

		btnPilotos = new JButton("Pilotos");
		btnPilotos.addActionListener(controlador);
		btnPilotos.setForeground(Color.RED);
		btnPilotos.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnPilotos.setBackground(Color.DARK_GRAY);
		btnPilotos.setBounds(358, 11, 94, 48);
		menu.add(btnPilotos);

		btnGranPre = new JButton("Gran Premio");
		btnGranPre.setForeground(Color.RED);
		btnGranPre.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnGranPre.setBackground(Color.DARK_GRAY);
		btnGranPre.setBounds(462, 11, 130, 48);
		menu.add(btnGranPre);

		
		btnClasi = new JButton("Clasificaciones");
		btnClasi.setForeground(Color.RED);
		btnClasi.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnClasi.setBackground(Color.DARK_GRAY);
		btnClasi.setBounds(602, 11, 145, 48);
		menu.add(btnClasi);

		btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.RED);
		btnLogin.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setBounds(757, 11, 92, 48);
		menu.add(btnLogin);

		btnLogo = new JButton("");
		btnLogo.setIcon(new ImageIcon("src" + File.separator + "Imagenes" + File.separator + "F1-logo.png"));
		btnLogo.setForeground(Color.LIGHT_GRAY);
		btnLogo.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnLogo.setBorder(null);
		btnLogo.setBackground(Color.LIGHT_GRAY);
		btnLogo.setBounds(10, 11, 124, 48);
		menu.add(btnLogo);
		
	}

}
