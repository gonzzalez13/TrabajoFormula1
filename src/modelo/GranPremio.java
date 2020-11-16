package modelo;

public class GranPremio {
	private long idGranPremio, idEscuderia,idCoche,idPiloto;
	private String nombre,circuito;
	private int vueltas;
	Clasificacion clasiGeneral;
	Clasificacion clasiSabado;
	public GranPremio() {
	}
	public long getIdGranPremio() {
		return idGranPremio;
	}
	public void setIdGranPremio(long idGranPremio) {
		this.idGranPremio = idGranPremio;
	}
	public long getIdEscuderia() {
		return idEscuderia;
	}
	public void setIdEscuderia(long idEscuderia) {
		this.idEscuderia = idEscuderia;
	}
	public long getIdCoche() {
		return idCoche;
	}
	public void setIdCoche(long idCoche) {
		this.idCoche = idCoche;
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
	public String getCircuito() {
		return circuito;
	}
	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}
	public int getVueltas() {
		return vueltas;
	}
	public void setVueltas(int vueltas) {
		this.vueltas = vueltas;
	}
	public Clasificacion getClasiGeneral() {
		return clasiGeneral;
	}
	public void setClasiGeneral(Clasificacion clasiGeneral) {
		this.clasiGeneral = clasiGeneral;
	}
	public Clasificacion getClasiSabado() {
		return clasiSabado;
	}
	public void setClasiSabado(Clasificacion clasiSabado) {
		this.clasiSabado = clasiSabado;
	}
	@Override
	public String toString() {
		return "GranPremio [idGranPremio=" + idGranPremio + ", idEscuderia=" + idEscuderia + ", idCoche=" + idCoche
				+ ", idPiloto=" + idPiloto + ", nombre=" + nombre + ", circuito=" + circuito + ", vueltas=" + vueltas
				+ ", clasiGeneral=" + clasiGeneral.toString() + ", clasiSabado=" + clasiSabado.toString() + "]"+"\n";
	}

}
