package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Controlador;

import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Noticia2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtTituloNoticias;
	private JTextArea textCuerpoNoticia;

	/**
	 * Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Noticia2 frame = new Noticia2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	public Noticia2(Controlador controlador) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(Noticia2.class.getResource("/Imagenes/F1-logo-ventana.png")));
		setTitle("Noticias");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 668);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnCancelar.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));
		btnCancelar.setBackground(Color.BLACK);
		btnCancelar.setBounds(10, 588, 93, 30);
		contentPane.add(btnCancelar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));
		btnGuardar.addActionListener(controlador);
		btnGuardar.setBackground(Color.BLACK);
		btnGuardar.setBounds(342, 592, 93, 30);
		contentPane.add(btnGuardar);
		
		JLabel lblTitulo = new JLabel("Insertar Noticias");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Bauhaus 93", Font.PLAIN, 20));
		lblTitulo.setBounds(10, 11, 425, 39);
		contentPane.add(lblTitulo);
		
		JLabel lblTituloNoticia = new JLabel("Titulo  Noticia");
		lblTituloNoticia.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloNoticia.setForeground(Color.WHITE);
		lblTituloNoticia.setFont(new Font("Bauhaus 93", Font.PLAIN, 20));
		lblTituloNoticia.setBounds(10, 95, 425, 30);
		contentPane.add(lblTituloNoticia);
		
		txtTituloNoticias = new JTextField();
		txtTituloNoticias.setBounds(35, 136, 380, 30);
		contentPane.add(txtTituloNoticias);
		txtTituloNoticias.setColumns(10);
		
		JLabel lblCuerpoNoticia = new JLabel("Cuerpo  Noticia");
		lblCuerpoNoticia.setHorizontalAlignment(SwingConstants.CENTER);
		lblCuerpoNoticia.setForeground(Color.WHITE);
		lblCuerpoNoticia.setFont(new Font("Bauhaus 93", Font.PLAIN, 20));
		lblCuerpoNoticia.setBounds(10, 227, 425, 30);
		contentPane.add(lblCuerpoNoticia);
		
		textCuerpoNoticia = new JTextArea();
		textCuerpoNoticia.setBounds(35, 279, 380, 210);
		contentPane.add(textCuerpoNoticia);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("src"+File.separator+"Imagenes"+File.separator+"Fondos"+File.separator+"Fondo6.PNG"));
		lblFondo.setBounds(0, 0, 445, 629);
		contentPane.add(lblFondo);
	}

	public JTextField getTxtTituloNoticias() {
		return txtTituloNoticias;
	}

	public void setTxtTituloNoticias(JTextField txtTituloNoticias) {
		this.txtTituloNoticias = txtTituloNoticias;
	}

	public JTextArea getTextCuerpoNoticia() {
		return textCuerpoNoticia;
	}

	public void setTextCuerpoNoticia(JTextArea textCuerpoNoticia) {
		this.textCuerpoNoticia = textCuerpoNoticia;
	}
	
	
	
}
