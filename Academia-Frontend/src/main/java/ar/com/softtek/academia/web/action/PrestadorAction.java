package ar.com.softtek.academia.web.action;

import java.util.ArrayList;
import java.util.List;

import ar.com.academia.dto.HorarioDTO;
import ar.com.academia.dto.PracticaDTO;
import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.HorarioService;
import ar.com.academia.services.PracticaService;
import ar.com.academia.services.PrestadorService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Servlet implementation class SocioAction
 */
public class PrestadorAction extends ActionSupport {

	private PrestadorService prestadorService;
	private PracticaService practicaService;
	private HorarioService horarioService;

	private PrestadorDTO prestadorDTO;
	
	private String idPrestador;
	private List<PrestadorDTO> listaPrestadoresDTO;
	private List<PracticaDTO> listaPracticasDTO;
	private List<PracticaDTO> practicas;
	private List<PracticaDTO> practicasElegidos;
	private List<HorarioDTO> horarios;
	private List<HorarioDTO> horariosElegidos;
	
	private PrestadorDTO prestadorSelect;
	
	public PrestadorDTO getPrestadorSelect() {
		return prestadorSelect;
	}

	public void setPrestadorSelect(PrestadorDTO prestadorSelect) {
		this.prestadorSelect = prestadorSelect;
	}


	public PrestadorService getPrestadorService() {
		return prestadorService;
	}

	public void setPrestadorService(PrestadorService prestadorService) {
		this.prestadorService = prestadorService;
	}

	public String getIdPrestador() {
		return idPrestador;
	}

	public void setIdPrestador(String idPrestador) {
		this.idPrestador = idPrestador;
	}
	
	public List<PrestadorDTO> getListaPrestadoresDTO() {
		return listaPrestadoresDTO;
	}

	public void setListaPrestadoresDTO(List<PrestadorDTO> listaPrestadoresDTO) {
		this.listaPrestadoresDTO = listaPrestadoresDTO;
	}

	public PrestadorDTO getPrestadorDTO() {
		return prestadorDTO;
	}

	public void setPrestadorDTO(PrestadorDTO prestadorDTO) {
		this.prestadorDTO = prestadorDTO;
	}

	

	public String addPrestador() {
		try{
			prestadorService.add(prestadorDTO);
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}
	
	
	public List<PracticaDTO> getPracticas() {
		return practicas;
	}

	public void setPracticas(List<PracticaDTO> practicas) {
		this.practicas = practicas;
	}

	public String nuevoPrestador(){
		
	
		try {
			this.setPracticas(practicaService.getAllPracticas());
	
			this.setHorarios(horarioService.getAllHorarios());
			
		} catch (ServiceException e) {
			return ERROR;
		}

		return SUCCESS;
	}
	
	public String deletePrestador(){
		try{
			prestadorService.removeById(Integer.parseInt(idPrestador));
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	public String updatePrestador(){
		try{
			prestadorDTO.setId(Integer.parseInt(idPrestador));
			prestadorService.updatePrestador(prestadorDTO);
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	public String listPrestadores(){
		try{
			listaPrestadoresDTO = prestadorService.getAllPrestadores();
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	public String obtenerPrestador(){
		try{
			prestadorDTO = prestadorService.getById(Integer.parseInt(idPrestador));
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	public List<PracticaDTO> getListaPracticasDTO() {
		return listaPracticasDTO;
	}

	public void setListaPracticasDTO(List<PracticaDTO> listaPracticasDTO) {
		this.listaPracticasDTO = listaPracticasDTO;
	}


	public HorarioService getHorarioService() {
		return horarioService;
	}

	public void setHorarioService(HorarioService horarioService) {
		this.horarioService = horarioService;
	}

	public List<HorarioDTO> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<HorarioDTO> horarios) {
		this.horarios = horarios;
	}

	public List<HorarioDTO> getHorariosElegidos() {
		return horariosElegidos;
	}

	public void setHorariosElegidos(List<HorarioDTO> horariosElegidos) {
		this.horariosElegidos = horariosElegidos;
	}

	public PracticaService getPracticaService() {
		return practicaService;
	}

	public void setPracticaService(PracticaService practicaService) {
		this.practicaService = practicaService;
	}

	public List<PracticaDTO> getPracticasElegidos() {
		return practicasElegidos;
	}

	public void setPracticasElegidos(List<PracticaDTO> practicasElegidos) {
		this.practicasElegidos = practicasElegidos;
	}
	
}
