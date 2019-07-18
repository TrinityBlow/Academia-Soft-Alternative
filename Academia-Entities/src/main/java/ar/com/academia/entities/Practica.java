package ar.com.academia.entities;

import java.util.List;
import java.util.Set;

public class Practica {
     private int id;
     private String codigo;
     private String descripcion;
     private List<Turno> turnos;
     private Set<Prestador> prestadores;
     
	public Set<Prestador> getPrestadores() {
		return prestadores;
	}
	public void setPrestadores(Set<Prestador> prestadores) {
		this.prestadores = prestadores;
	}
	public List<Turno> getTurnos() {
		return turnos;
	}
	public void setTurnos(List<Turno> turnos) {
		this.turnos = turnos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
