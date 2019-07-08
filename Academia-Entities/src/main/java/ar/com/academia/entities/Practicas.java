package ar.com.academia.entities;

import java.util.List;

public class Practicas {
	private Integer id;
	private String practica;
	private List<Prestador> prestadores;

	public String getDescripcion() {
		return practica;
	}

	public void setDescripcion(String practica) {
		this.practica = practica;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPractica() {
		return practica;
	}

	public void setPractica(String practica) {
		this.practica = practica;
	}

	public List<Prestador> getPrestadores() {
		return prestadores;
	}

	public void setPrestadores(List<Prestador> prestadores) {
		this.prestadores = prestadores;
	}
}
