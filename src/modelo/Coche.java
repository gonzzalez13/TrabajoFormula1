package modelo;

public class Coche {
	private long idCoche,idEscuderia,idPiloto;
	private String nombre,motor;
	private double vPunta,iAerodinamico,cv,frenada;
	public Coche() {
	}
	@Override
	public String toString() {
		return "Coche [idCoche=" + idCoche + ", idEscuderia=" + idEscuderia + ", idPiloto=" + idPiloto + ", nombre="
				+ nombre + ", motor=" + motor + ", vPunta=" + vPunta + ", iAerodinamico=" + iAerodinamico + ", cv=" + cv
				+ ", frenada=" + frenada + "]"+"\n";
	}
	public long getIdCoche() {
		return idCoche;
	}
	public void setIdCoche(long idCoche) {
		this.idCoche = idCoche;
	}
	public long getIdEscuderia() {
		return idEscuderia;
	}
	public void setIdEscuderia(long idEscuderia) {
		this.idEscuderia = idEscuderia;
	}
	public long getIdPiloto() {
		return idPiloto;
	}
	public void setIdPiloto(long idPiloto) {
		this.idPiloto = idPiloto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public double getvPunta() {
		return vPunta;
	}
	public void setvPunta(double vPunta) {
		this.vPunta = vPunta;
	}
	public double getiAerodinamico() {
		return iAerodinamico;
	}
	public void setiAerodinamico(double iAerodinamico) {
		this.iAerodinamico = iAerodinamico;
	}
	public double getCv() {
		return cv;
	}
	public void setCv(double cv) {
		this.cv = cv;
	}
	public double getFrenada() {
		return frenada;
	}
	public void setFrenada(double frenada) {
		this.frenada = frenada;
	}

}
