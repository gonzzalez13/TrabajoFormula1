package logica;
import java.util.ArrayList;
import java.util.Collections;

import modelo.Carrera;
import modelo.Piloto;

public class Simulacion {
Carrera carrera;
ArrayList<Piloto> coches;

public Simulacion(ArrayList <Piloto> coches,Carrera carrera) {
	this.carrera=carrera;
	this.coches=coches;
	
}

	public void main() {
		
		
		
	
		for (int i = 0; i < carrera.getVueltas(); i++) {
			
			for (int z = 0; z < coches.size(); ) {
		
				double uno=(Math.random()*coches.get(z).getMedia()+1);
				double dos=(Math.random()*coches.get(z+1).getMedia()+1);
				
				if (uno>dos) {
					System.out.println(coches.get(z).getNombre()+" se escapa de "+coches.get(z+1).getNombre());
					
					}else {
						System.out.println(coches.get(z+1).getNombre()+" adelanta a "+coches.get(z).getNombre());
						
						coches.get(z).setPosicion(coches.get(z).getPosicion()+1);
						coches.get(z+1).setPosicion(coches.get(z).getPosicion()-1);
					}
				
				z=z+2;
				}
				
			Collections.sort(coches);
			for (int j = 0; j < coches.size(); j++) {
				System.out.println(j+coches.get(j).getNombre());
			}
			
		}

	}

}
