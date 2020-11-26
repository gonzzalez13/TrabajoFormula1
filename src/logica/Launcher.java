package logica;

import java.sql.SQLException;

import vista.Cabecera;
import vista.Escuderia;
import vista.Inicio;

public class Launcher {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Controlador c =new Controlador(new Inicio(),"Inicio");
		
		c.getInicio().inicio(c);
		c.getInicio().setVisible(true);
//		ConectionHelper connection = new ConectionHelper();
//		Connection c=null;
//		Piloto p=null;
//		Escuderia es=null;
//		try {
//			p=connection.consultaPiloto("Lewis Hamilton");
//			System.out.println(p.toString());
//			
//			es=connection.selectEscuderia("Mercedes AMG Petronas F1 TEAM");
//			System.out.println(es.toString());
//			
//		} catch (ClassNotFoundException |SQLException e) {
//			e.printStackTrace();
//		} finally {
//			connection.disconnect(c);
//		}
//	double pilotoHabulydad=	(Math.random()*80+1);
//	double diestroCurvoso=5;
//	double borracho =-5;
//	double piloto2=(Math.random()*50+1)+diestroCurvoso;
//	
//	ArrayList<Double> cc =new ArrayList<Double>();
//	cc.add(pilotoHabulydad);
//	cc.add(piloto2);
//	if (piloto2>pilotoHabulydad) {
//		System.out.println("piloto2 adelanta");
//		
//	}
//	Collections.sort(cc, Collections.reverseOrder());
//	
//	
//		System.out.println(cc);
//	
//	
	}
	

}
