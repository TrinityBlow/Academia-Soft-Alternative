package ar.com.academia.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Horario implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
    private String horaInicio;
    private String horaFin;
    
    private List<Reserva> reservas;
    private Set<Prestador> prestadores;
    
	public Set<Prestador> getPrestadores() {
		return prestadores;
	}
	public void setPrestadores(Set<Prestador> prestadores) {
		this.prestadores = prestadores;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Reserva> getReservas() {
		return reservas;
	}
	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
}
