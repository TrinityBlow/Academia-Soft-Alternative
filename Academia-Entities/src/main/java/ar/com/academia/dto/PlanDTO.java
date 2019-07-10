package ar.com.academia.dto;

import java.util.List;


public class PlanDTO {

	private Integer id;
	private String descripcion;
	private List<SocioDTO> sociosDTO;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<SocioDTO> getSociosDTO() {
		return sociosDTO;
	}
	public void setSociosDTO(List<SocioDTO> sociosDTO) {
		this.sociosDTO = sociosDTO;
	}
	
	
}
