package modelo;

public class Escuderia {
	private long idEscuderia;
	private String nombre, color, nacionalidad,palmares,sede,jEquipo,jTecnico,estrenadaF1;
	
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

	public Escuderia() {
	}

}
