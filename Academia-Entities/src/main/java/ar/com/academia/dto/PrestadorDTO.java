package ar.com.academia.dto;

import java.util.Iterator;
import java.util.List;
public class PrestadorDTO {
	private int id;
	private String nombre;
	private int telefono;
	private String apellido;
	private String email;
	private List<HorarioDTO> horasDTO;
	private List<TurnoDTO> turnosDTO;
	private List<PracticaDTO> practicasDTO;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<HorarioDTO> getHorasDTO() {
		return horasDTO;
	}
	public void setHorasDTO(List<HorarioDTO> horasDTO) {
		this.horasDTO = horasDTO;
	}
	public List<TurnoDTO> getTurnosDTO() {
		return turnosDTO;
	}
	public void setTurnosDTO(List<TurnoDTO> turnosDTO) {
		this.turnosDTO = turnosDTO;
	}
	public List<PracticaDTO> getPracticasDTO() {
		return practicasDTO;
	}
	public void setPracticasDTO(List<PracticaDTO> practicasDTO) {
		this.practicasDTO = practicasDTO;
	}
	
	public String getCodigosPracticas(){
		String codigosString = "" ;
		Iterator<PracticaDTO> it = this.getPracticasDTO().iterator();
		PracticaDTO prac;
		while(it.hasNext()){
			prac = it.next();
			codigosString = codigosString.concat(prac.getCodigo()); 
			if(it.hasNext()){
				codigosString = codigosString.concat(" | ");
			} 
		}
		
		return codigosString;
	}
	
	public String getHoras(){
		String codigosString = "" ;
		String horaInicio = "" ;
		Iterator<HorarioDTO> it = this.getHorasDTO().iterator();
		HorarioDTO hora;
		while(it.hasNext()){
			hora = it.next();
			horaInicio=hora.getHoraInicio();
			codigosString = codigosString.concat(horaInicio.concat("/"+hora.getHoraFin())); 
			if(it.hasNext()){
				codigosString = codigosString.concat(" | ");
			} 
		}
		
		return codigosString;
	}
	
	
}
