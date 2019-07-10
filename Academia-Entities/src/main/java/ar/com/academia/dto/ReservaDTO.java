package ar.com.academia.dto;


public class ReservaDTO {

	 private int id;
	 private String fecha;
	 private TurnoDTO turnoDTO;
	 private HorarioDTO horarioDTO;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public TurnoDTO getTurnoDTO() {
		return turnoDTO;
	}
	public void setTurnoDTO(TurnoDTO turnoDTO) {
		this.turnoDTO = turnoDTO;
	}
	public HorarioDTO getHorarioDTO() {
		return horarioDTO;
	}
	public void setHorarioDTO(HorarioDTO horarioDTO) {
		this.horarioDTO = horarioDTO;
	}
	 
	 
}
