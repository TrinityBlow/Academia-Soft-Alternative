package ar.com.academia.dto;

import java.util.List;
import java.util.Set;

import ar.com.academia.entities.Prestador;
import ar.com.academia.entities.Reserva;

public class HorarioDTO {

	private int id;
    private String horaInicio;
    private String horaFin;
    
    private List<ReservaDTO> reservasDTO;
    private List<PrestadorDTO> prestadoresDTO;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public List<ReservaDTO> getReservasDTO() {
		return reservasDTO;
	}
	public void setReservasDTO(List<ReservaDTO> reservasDTO) {
		this.reservasDTO = reservasDTO;
	}
	public List<PrestadorDTO> getPrestadoresDTO() {
		return prestadoresDTO;
	}
	public void setPrestadoresDTO(List<PrestadorDTO> prestadoresDTO) {
		this.prestadoresDTO = prestadoresDTO;
	}
    public String toString(){
    	return horaInicio + " a " + horaFin;
    }
    
    public String getFormarHora(){
    	return toString();
    }
    
}
