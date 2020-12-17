package modelo;

import java.sql.Date;

public class Piloto implements Comparable<Piloto>{
	private String Nombre, nacionalidad, palmares, estado, bibliografia,foto_perfil,foto_escuderia;
	private long idPiloto, idEscuderia;
	private int podios,posicion,media;
	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}

	private Date fechaNacimiento;

	@Override
	public String toString() {
		return "Piloto [Nombre=" + Nombre + ", nacionalidad=" + nacionalidad + ", palmares=" + palmares + ", estado="
				+ estado + ", bibliografia=" + bibliografia + ", idPiloto=" + idPiloto + ", idEscuderia=" + idEscuderia
				+ ", podios=" + podios + ", fechaNacimiento=" + fechaNacimiento + "]"+"\n";
	}

	public String getBibliografia() {
		return bibliografia;
	}

	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}

	public int getPodios() {
		return podios;
	}

	public void setPodios(int podios) {
		this.podios = podios;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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

	@Override
	public int compareTo(Piloto piloto) {
		return this.getPosicion()-piloto.getPosicion();
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public String getFoto_perfil() {
		return foto_perfil;
	}

	public void setFoto_perfil(String foto_perfil) {
		this.foto_perfil = foto_perfil;
	}

	public String getFoto_escuderia() {
		return foto_escuderia;
	}

	public void setFoto_escuderia(String foto_escuderia) {
		this.foto_escuderia = foto_escuderia;
	}

	
}
