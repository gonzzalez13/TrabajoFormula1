package modelo;

public class Carrera {
	
	int vueltas;
	String tiempo;
	String circuito;

	public int getVueltas() {
		return vueltas;
	}

	public void setVueltas(int vueltas) {
		this.vueltas = vueltas;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	public Carrera(int vueltas,String tiempo,String circuito) {
		
		this.vueltas=vueltas;
		this.tiempo=tiempo;
		this.circuito=circuito;

	}
	
	

}
