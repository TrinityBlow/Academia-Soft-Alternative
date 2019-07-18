package ar.com.softtek.academia.web.action;

import java.util.ArrayList;
import java.util.List;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.dto.TurnoDTO;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.SocioService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Servlet implementation class SocioAction
 */

public class SocioTurnosAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SocioService socioService;
	
	private SocioDTO socioDTO;
	
	private List<TurnoDTO> listaDeTurnosSocio;

	private String idSocio;
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public SocioService getSocioService() {
		return socioService;
	}

	public void setSocioService(SocioService socioService) {
		this.socioService = socioService;
	}

	public String getIdSocio() {
		return idSocio;
	}

	public void setIdSocio(String idSocio) {
		this.idSocio = idSocio;
	}
	

	public SocioDTO getSocioDTO() {
		return socioDTO;
	}

	public void setSocioDTO(SocioDTO socioDTO) {
		this.socioDTO = socioDTO;
	}

	
	
	public List<TurnoDTO> getListaDeTurnosSocio() {
		return listaDeTurnosSocio;
	}

	public void setListaDeTurnosSocio(List<TurnoDTO> listaDeTurnosSocio) {
		this.listaDeTurnosSocio = listaDeTurnosSocio;
	}

	public String listarTurnosSocio(){
		try{
			socioDTO = socioService.getById(Integer.parseInt(idSocio));
			listaDeTurnosSocio = socioDTO.getTurnosDTO();
			if(listaDeTurnosSocio == null) {
				listaDeTurnosSocio = new ArrayList<TurnoDTO>();
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

	
}
