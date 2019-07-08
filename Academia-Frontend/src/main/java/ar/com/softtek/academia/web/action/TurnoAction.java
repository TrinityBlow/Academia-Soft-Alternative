package ar.com.softtek.academia.web.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.academia.dto.TurnoDTO;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.TurnoService;

public class TurnoAction extends ActionSupport{

	private TurnoService turnoService;
	private TurnoDTO turnoDTO;
	private String idTurno;
	private List<TurnoDTO> listaTurnosDTO;
	
	
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
}
