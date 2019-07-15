package ar.com.softtek.academia.web.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.academia.dto.PracticaDTO;
import ar.com.academia.dto.SocioDTO;
import ar.com.academia.dto.TurnoDTO;
import ar.com.academia.dto.service.TurnoServiceDTO;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.PracticaService;
import ar.com.academia.services.TurnoService;
import ar.com.academia.services.SocioService;

public class TurnoAction extends ActionSupport{

	private TurnoService turnoService;
	private PracticaService practicaService;
	private SocioService socioService;
	
	private String turnoElegido;
	private String idTurno;
	
	
	private List<TurnoDTO> listaTurnosDTO;
	private List<PracticaDTO> listaPracticasDTO;
	private List<SocioDTO> listaSociosDTO;
	private List<String> listaTurnosNombre;
	
	public List<String> getListaTurnosNombre() {
		return listaTurnosNombre;
	}

	public void setListaTurnosNombre(List<String> listaTurnosNombre) {
		this.listaTurnosNombre = listaTurnosNombre;
	}

	private String fechaSelect;
	
	private TurnoServiceDTO turnoServiceDTO;
	
	
	
	
	public String getTurnoElegido() {
		return turnoElegido;
	}

	public void setTurnoElegido(String turnoElegido) {
		this.turnoElegido = turnoElegido;
	}

	public TurnoServiceDTO getTurnoServiceDTO() {
		return turnoServiceDTO;
	}

	public void setTurnoServiceDTO(TurnoServiceDTO turnoServiceDTO) {
		this.turnoServiceDTO = turnoServiceDTO;
	}

	public SocioService getSocioService() {
		return socioService;
	}

	public void setSocioService(SocioService socioService) {
		this.socioService = socioService;
	}

	public List<SocioDTO> getListaSociosDTO() {
		return listaSociosDTO;
	}

	public void setListaSociosDTO(List<SocioDTO> listaSociosDTO) {
		this.listaSociosDTO = listaSociosDTO;
	}

	public PracticaService getPracticaService() {
		return practicaService;
	}

	public void setPracticaService(PracticaService practicaService) {
		this.practicaService = practicaService;
	}

	public List<PracticaDTO> getListaPracticasDTO() {
		return listaPracticasDTO;
	}

	public void setListaPracticasDTO(List<PracticaDTO> listaPracticasDTO) {
		this.listaPracticasDTO = listaPracticasDTO;
	}


	public String getFechaSelect() {
		return fechaSelect;
	}

	public void setFechaSelect(String fechaSelect) {
		this.fechaSelect = fechaSelect;
	}

	public void setListaTurnosDTO(List<TurnoDTO> listaTurnosDTO) {
		this.listaTurnosDTO = listaTurnosDTO;
	}

	public TurnoService getTurnoService() {
		return turnoService;
	}

	public void setTurnoService(TurnoService turnoService) {
		this.turnoService = turnoService;
	}

	public String getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(String idTurno) {
		this.idTurno = idTurno;
	}
	
	public List<TurnoDTO> getListaTurnosDTO() {
		return listaTurnosDTO;
	}	

	public String addTurno() {
		try{
			turnoService.addTurno(turnoServiceDTO);
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	
	public String deleteTurno(){
		try{
			turnoService.removeByIdTurno(Integer.parseInt(idTurno));
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	public String listTurnos(){
		try{
			listaTurnosDTO = turnoService.getAllTurnos();
			listaTurnosNombre = new ArrayList<String>();
			for(TurnoDTO turno : listaTurnosDTO) {
				listaTurnosNombre.add(turno.getSocioDTO().getNombre());
			}
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	public String obtenerTurno(){
//		try{
//			
//			turnoElegido = turnoService.getByIdTurno(Integer.parseInt(idTurno));
//		} catch (ServiceException e){
//		
//			return ERROR;
//		}
		return SUCCESS;
	}
	
	public String nuevoTurno(){
		try{
			listaPracticasDTO = practicaService.getAllPracticas();
			listaSociosDTO = socioService.getAll();
			if(listaPracticasDTO == null) {
				listaPracticasDTO = new ArrayList<PracticaDTO>();
			}
			if(listaSociosDTO == null) {
				listaSociosDTO = new ArrayList<SocioDTO>();
			}
		} catch (ServiceException e){
			return ERROR;
		}
		return SUCCESS;
	}
	
	
	//metodo que se usa a travez del dispplay tag para evitar volver a llamar al backend
	public String displayTagRefresh() {
		return SUCCESS;
	}
	
	public String searchNombreSocio() {
		return SUCCESS;
	}
	
}
