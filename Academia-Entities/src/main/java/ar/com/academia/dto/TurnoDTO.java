package ar.com.academia.dto;

import java.util.Date;

public class TurnoDTO {

	private int id;
	private String especialidad;
	private Date fecha;
	private String prestacion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getPrestacion() {
		return prestacion;
	}

	public void setPrestacion(String prestacion) {
		this.prestacion = prestacion;
	}
}