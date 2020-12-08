package logica;

import java.sql.SQLException;

import vista.Inicio;

public class Launcher {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Controlador c =new Controlador(new Inicio(),"Inicio",new ConectionHelper());
		
		
		
		c.getInicio().inicio(c);
		c.getInicio().setVisible(true);
//	
	}
	

}
