package ar.com.academia.dto.service;

import java.util.List;

public class PrestadorServiceDTO {
	private int numeroPrestador;
	private String nombre;
	private String apellido;
	private int telefono;
	private String email;
	private List<Integer> practicas;
	private List<Integer> horarios;
	
	public int getNumeroPrestador() {
		return numeroPrestador;
	}
	public void setNumeroPrestador(int numeroPrestador) {
		this.numeroPrestador = numeroPrestador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Integer> getPracticas() {
		return practicas;
	}
	public void setPracticas(List<Integer> practicas) {
		this.practicas = practicas;
	}
	public List<Integer> getHorarios() {
		return horarios;
	}
	public void setHorarios(List<Integer> horarios) {
		this.horarios = horarios;
	}
}
