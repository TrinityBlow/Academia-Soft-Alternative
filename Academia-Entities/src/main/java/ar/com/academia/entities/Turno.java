package ar.com.academia.entities;

import java.io.Serializable;

public class Turno implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private float importeDelTurno;
	private String observaciones;
	private Socio socio;
	private Prestador prestador;
	private Reserva reserva;
	private Practica practica;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getImporteDelTurno() {
		return importeDelTurno;
	}
	public void setImporteDelTurno(float importeDelTurno) {
		this.importeDelTurno = importeDelTurno;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public Prestador getPrestador() {
		return prestador;
	}
	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}
	public Reserva getReserva() {
		return reserva;
	}
	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Practica getPractica() {
		return practica;
	}
	public void setPractica(Practica practica) {
		this.practica = practica;
	}
	
	
	
}