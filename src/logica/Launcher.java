package logica;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

public class Launcher {

	public static void main(String[] args) {
		ConectionHelper connection = new ConectionHelper();
		try {
			Connection c=connection.createConection();
			connection.createConnectionByProperties();
			connection.disconnect(c);
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		} 
	double pilotoAbilidad=	(Math.random()*100+1);
	double diestroCurvoso=5;
	double piloto2=(Math.random()*100+1)+diestroCurvoso;
	
	ArrayList<Double> c =new ArrayList<Double>();
	c.add(pilotoAbilidad);
	c.add(piloto2);
	
	Collections.sort(c, Collections.reverseOrder());
	
	
		System.out.println(c);
	
	
	}
	

}
