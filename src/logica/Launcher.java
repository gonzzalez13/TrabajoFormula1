package logica;

import java.sql.SQLException;

import vista.Inicio;

public class Launcher {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		
		Controlador c =new Controlador(new Inicio(),"Inicio",new ConectionHelper());
		
		boolean admin = false;
		
		c.getInicio().inicio(c,admin);
		c.getInicio().setVisible(true);

	}
	

}
