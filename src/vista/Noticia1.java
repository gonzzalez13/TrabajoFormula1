package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class Noticia1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Noticia1() {
		setLayout(null);
		
		JTextArea txtrTitulo1 = new JTextArea();
		txtrTitulo1.setWrapStyleWord(true);
		txtrTitulo1.setLineWrap(true);
		txtrTitulo1.setFont(new Font("Bauhaus 93", Font.PLAIN, 30));
		txtrTitulo1.setOpaque(false);
		txtrTitulo1.setText("Bottas: \"Los que no saben de F1 podr\u00EDan pensar que he quedado como un completo idiota\"");
		txtrTitulo1.setBounds(24, 30, 892, 77);
		add(txtrTitulo1);
		
		JTextArea txtNoticia1 = new JTextArea();
		txtNoticia1.setText("Valtteri Bottas sab\u00EDa que iba a tener mucha presi\u00F3n en el Gran Premio de Sakhir. Desde el mismo momento que se hizo oficial que Lewis Hamilton hab\u00EDa positivo por coronavirus, el finland\u00E9s era consciente de que se jugaba mucho en el trazado alternativo del Circuito Internacional de Bahr\u00E9in. \"Si Russell me supera, obviamente voy a quedar mal\", admiti\u00F3. A la postre, ha quedado mal el finland\u00E9s... y Mercedes. El que ha salido reforzado es un George Russell, que ha demostrado madera de campe\u00F3n.El viernes de entrenamientos libres fue mejor el brit\u00E1nico y en la calificaci\u00F3n Russell termin\u00F3 a s\u00F3lo 26 mil\u00E9simas de Bottas. Durante la carrera, el joven de 22 a\u00F1os tambi\u00E9n se mostr\u00F3 superior. Un error del equipo en un 'pit-stop' y luego un pinchazo a nueve vueltas del final frenaron al '63'.Despu\u00E9s de la carrera, Bottas analizaba con sinceridad lo sucedido: \"Si no sabes de F1, podr\u00EDa haber quedado como un completo idiota, un tonto, as\u00ED que eso no es bueno. Pero la gente que sabe, es conocedora de c\u00F3mo fue mi labor y c\u00F3mo pudo haber sido el resultado final. Fue una carrera bastante mala para m\u00ED desde ese lado y ser\u00E1 muy f\u00E1cil para la gente decir que entra un chico nuevo y le gana al chico que ha estado en el equipo unos a\u00F1os, as\u00ED que no fue lo ideal\", reconoc\u00EDa el '77'. Lo bueno, dentro de lo malo, es que Valtteri qued\u00F3 octavo habiendo salido desde la pole y que Russell finaliz\u00F3 noveno.");
		txtNoticia1.setWrapStyleWord(true);
		txtNoticia1.setOpaque(false);
		txtNoticia1.setLineWrap(true);
		txtNoticia1.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtNoticia1.setBounds(24, 137, 534, 368);
		add(txtNoticia1);
		
		JLabel lblImagen1 = new JLabel("");
		lblImagen1.setIcon(new ImageIcon(Noticia1.class.getResource("/Imagenes/Noticias/Noticia1Grande.jpg")));
		lblImagen1.setBounds(586, 192, 337, 200);
		add(lblImagen1);

	}

}
