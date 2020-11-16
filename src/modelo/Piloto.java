package modelo;

public class Piloto {
	private String Nombre,nacionalidad,palmares,estado;
	private long idPiloto,idEscuderia;
	@Override
public String toString() {
	return "Piloto [Nombre=" + Nombre + ", nacionalidad=" + nacionalidad + ", palmares=" + palmares + ", estado="
			+ estado + ", idPiloto=" + idPiloto + ", idEscuderia=" + idEscuderia + "]"+"\n";
}
	public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getNacionalidad() {
	return nacionalidad;
}
public void setNacionalidad(String nacionalidad) {
	this.nacionalidad = nacionalidad;
}
public String getPalmares() {
	return palmares;
}
public void setPalmares(String palmares) {
	this.palmares = palmares;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public long getIdPiloto() {
	return idPiloto;
}
public void setIdPiloto(long idPiloto) {
	this.idPiloto = idPiloto;
}
public long getIdEscuderia() {
	return idEscuderia;
}
public void setIdEscuderia(long idEscuderia) {
	this.idEscuderia = idEscuderia;
}
	public Piloto() {

	}

}
