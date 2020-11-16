package modelo;

public class Escuderia {
	private long idEscuderia;
	private String nombre, color, nacionalidad,palmares;
	@Override
public String toString() {
	return "Escuderia [idEscuderia=" + idEscuderia + ", nombre=" + nombre + ", color=" + color + ", nacionalidad="
			+ nacionalidad + ", palmares=" + palmares + "]"+"\n";
}
	public long getIdEscuderia() {
	return idEscuderia;
}
public void setIdEscuderia(long idEscuderia) {
	this.idEscuderia = idEscuderia;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
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
	public Escuderia() {
	}

}
