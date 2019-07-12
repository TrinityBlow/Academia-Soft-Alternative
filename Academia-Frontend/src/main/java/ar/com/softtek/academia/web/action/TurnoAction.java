package ar.com.softtek.academia.web.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.academia.dto.HorarioDTO;
import ar.com.academia.dto.PracticaDTO;
import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.dto.TurnoDTO;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.PracticaService;
import ar.com.academia.services.PrestadorService;
import ar.com.academia.services.TurnoService;

public class TurnoAction extends ActionSupport{

	private TurnoService turnoService;
	private PracticaService practicaService;
	private PrestadorService prestadorService;
	private TurnoDTO turnoDTO;
	private String idTurno;
	private List<TurnoDTO> listaTurnosDTO;
	
	private List<PrestadorDTO> listaPrestadoresDTO;
	private List<PracticaDTO> listaPracticasDTO;
	private List<HorarioDTO> listaHorariosDTO;
	
	private String fechaSelect;
	private PracticaDTO practicaSelect;
	private PrestadorDTO prestadorSelect;
	private HorarioDTO horarioSelect;
	
	
	public PracticaService getPracticaService() {
		return practicaService;
	}

	public void setPracticaService(PracticaService practicaService) {
		this.practicaService = practicaService;
	}

	public PrestadorService getPrestadorService() {
		return prestadorService;
	}

	public void setPrestadorService(PrestadorService prestadorService) {
		this.prestadorService = prestadorService;
	}

	public List<PrestadorDTO> getListaPrestadoresDTO() {
		return listaPrestadoresDTO;
	}

	public void setListaPrestadoresDTO(List<PrestadorDTO> listaPrestadoresDTO) {
		this.listaPrestadoresDTO = listaPrestadoresDTO;
	}

	public List<PracticaDTO> getListaPracticasDTO() {
		return listaPracticasDTO;
	}

	public void setListaPracticasDTO(List<PracticaDTO> listaPracticasDTO) {
		this.listaPracticasDTO = listaPracticasDTO;
	}

	public List<HorarioDTO> getListaHorariosDTO() {
		return listaHorariosDTO;
	}

	public void setListaHorariosDTO(List<HorarioDTO> listaHorariosDTO) {
		this.listaHorariosDTO = listaHorariosDTO;
	}

	public String getFechaSelect() {
		return fechaSelect;
	}

	public void setFechaSelect(String fechaSelect) {
		this.fechaSelect = fechaSelect;
	}

	public PracticaDTO getPracticaSelect() {
		return practicaSelect;
	}

	public void setPracticaSelect(PracticaDTO practicaSelect) {
		this.practicaSelect = practicaSelect;
	}

	public PrestadorDTO getPrestadorSelect() {
		return prestadorSelect;
	}

	public void setPrestadorSelect(PrestadorDTO prestadorSelect) {
		this.prestadorSelect = prestadorSelect;
	}

	public HorarioDTO getHorarioSelect() {
		return horarioSelect;
	}

	public void setHorarioSelect(HorarioDTO horarioSelect) {
		this.horarioSelect = horarioSelect;
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

	public void setListaSociosDTO(List<TurnoDTO> listaTurnosDTO) {
		this.listaTurnosDTO = listaTurnosDTO;
	}

	public TurnoDTO getTurnoDTO() {
		return turnoDTO;
	}

	public void setTurnoDTO(TurnoDTO turnoDTO) {
		this.turnoDTO = turnoDTO;
	}

	

	public String addTurno() {
		try{
			turnoService.addTurno(turnoDTO);
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

	public String updateTurno(){
		try{
			turnoDTO.setId(Integer.parseInt(idTurno));
			turnoService.updateTurno(turnoDTO);
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	public String listTurnos(){
		try{
			listaTurnosDTO = turnoService.getAllTurnos();
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	public String obtenerTurno(){
		try{
			turnoDTO = turnoService.getByIdTurno(Integer.parseInt(idTurno));
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String nuevoTurno(){
		try{
			listaPrestadoresDTO = prestadorService.getAllPrestadores();
			listaPracticasDTO = practicaService.getAllPracticas();
			listaHorariosDTO = new ArrayList<HorarioDTO>();
		} catch (ServiceException e){
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String getPrestadoresByPractica(){
		try{
			listaPrestadoresDTO = prestadorService.getAllPrestadores();
			listaHorariosDTO = listaPrestadoresDTO.get(0).getHorasDTO();
		} catch (ServiceException e){
			return ERROR;
		}
		return SUCCESS;
	}
}
