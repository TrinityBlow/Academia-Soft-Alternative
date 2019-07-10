package ar.com.academia.dto;

import java.util.List;

public class PracticaDTO {

    private int id;
    private float codigo;
    private String descripcion;
    private List<TurnoDTO> turnosDTO;
    private List<PrestadorDTO> prestadoresDTO;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getCodigo() {
		return codigo;
	}
	public void setCodigo(float codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<TurnoDTO> getTurnosDTO() {
		return turnosDTO;
	}
	public void setTurnosDTO(List<TurnoDTO> turnosDTO) {
		this.turnosDTO = turnosDTO;
	}
	public List<PrestadorDTO> getPrestadoresDTO() {
		return prestadoresDTO;
	}
	public void setPrestadoresDTO(List<PrestadorDTO> prestadoresDTO) {
		this.prestadoresDTO = prestadoresDTO;
	}
    
    
    

}
