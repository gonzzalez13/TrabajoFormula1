package modelo;

public class Escuderia {
	private long idEscuderia;
	private String nombre, color, nacionalidad,palmares,sede,jEquipo,jTecnico,estrenadaF1,foto_escuderia,foto_piloto1,foto_piloto2;
	
	@Override
	public String toString() {
		return "Escuderia [idEscuderia=" + idEscuderia + ", nombre=" + nombre + ", color=" + color + ", nacionalidad="
				+ nacionalidad + ", palmares=" + palmares + ", sede=" + sede + ", jEquipo=" + jEquipo + ", jTecnico="
				+ jTecnico + ", estrenadaF1=" + estrenadaF1 + "]";
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public String getjEquipo() {
		return jEquipo;
	}
	public void setjEquipo(String jEquipo) {
		this.jEquipo = jEquipo;
	}
	public String getjTecnico() {
		return jTecnico;
	}
	public void setjTecnico(String jTecnico) {
		this.jTecnico = jTecnico;
	}
	public String getEstrenadaF1() {
		return estrenadaF1;
	}
	public void setEstrenadaF1(String estrenadaF1) {
		this.estrenadaF1 = estrenadaF1;
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



	public String getFoto_escuderia() {
	return foto_escuderia;
}
public void setFoto_escuderia(String foto_escuderia) {
	this.foto_escuderia = foto_escuderia;
}
public String getFoto_piloto1() {
	return foto_piloto1;
}
public void setFoto_piloto1(String foto_piloto1) {
	this.foto_piloto1 = foto_piloto1;
}
public String getFoto_piloto2() {
	return foto_piloto2;
}
public void setFoto_piloto2(String foto_piloto2) {
	this.foto_piloto2 = foto_piloto2;
}
	public Escuderia() {
	}

}
