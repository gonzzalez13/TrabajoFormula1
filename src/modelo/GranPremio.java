package modelo;

public class GranPremio {
	private long idGranPremio, idEscuderia,idCoche,idPiloto;
	private String nombre,circuito;
	private int vueltas,Años_primer_gp,Longitud,Distancia_gp,Curvas;
	Clasificacion clasiGeneral;
	Clasificacion clasiSabado;
	public int getAños_primer_gp() {
		return Años_primer_gp;
	}
	public void setAños_primer_gp(int años_primer_gp) {
		Años_primer_gp = años_primer_gp;
	}
	public int getLongitud() {
		return Longitud;
	}
	public void setLongitud(int longitud) {
		Longitud = longitud;
	}
	public int getDistancia_gp() {
		return Distancia_gp;
	}
	public void setDistancia_gp(int distancia_gp) {
		Distancia_gp = distancia_gp;
	}
	public int getCurvas() {
		return Curvas;
	}
	public void setCurvas(int curvas) {
		Curvas = curvas;
	}
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


}
