package ar.com.academia.entities;

import java.io.Serializable;
import java.util.Date;

public class Turno implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private Date fechaYHoraDeLlegada;
	private Date fechaYHoraDeInicioDeAtencion;
	private int importeDelTurno;
	private String observaciones;
	private Socio socio;
	private Prestador prestador;
	private Reserva reserva;
	
	public int getId() {

		return id;
	}

	public Socio getSocio() {
		return socio;

	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}
	public Date getFechaYHoraDeLlegada() {
		return fechaYHoraDeLlegada;


	}
	public void setFechaYHoraDeLlegada(Date fechaYHoraDeLlegada) {
		this.fechaYHoraDeLlegada = fechaYHoraDeLlegada;
	}
	public Date getFechaYHoraDeInicioDeAtencion() {
		return fechaYHoraDeInicioDeAtencion;
	}
	public void setFechaYHoraDeInicioDeAtencion(Date fechaYHoraDeInicioDeAtencion) {
		this.fechaYHoraDeInicioDeAtencion = fechaYHoraDeInicioDeAtencion;
	}
	public int getImporteDelTurno() {
		return importeDelTurno;
	}
	public void setImporteDelTurno(int importeDelTurno) {
		this.importeDelTurno = importeDelTurno;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public void setId(int id) {
		this.id = id;
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

}