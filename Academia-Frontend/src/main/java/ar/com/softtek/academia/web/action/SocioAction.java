package ar.com.softtek.academia.web.action;

import java.util.List;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.SocioService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Servlet implementation class SocioAction
 */
public class SocioAction extends ActionSupport {

	private SocioService socioService;
	private SocioDTO socioDTO;
	private String idSocio;
	private List<SocioDTO> listaSociosDTO;
	
	
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
	
	public List<SocioDTO> getListaSociosDTO() {
		return listaSociosDTO;
	}

	public void setListaSociosDTO(List<SocioDTO> listaSociosDTO) {
		this.listaSociosDTO = listaSociosDTO;
	}

	public SocioDTO getSocioDTO() {
		return socioDTO;
	}

	public void setSocioDTO(SocioDTO socioDTO) {
		this.socioDTO = socioDTO;
	}

	

	public String addSocio() {
		try{
			socioService.add(socioDTO);
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	
	public String deleteSocio(){
		try{
			socioService.removeById(Integer.parseInt(idSocio));
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	public String updateSocio(){
		try{
			socioDTO.setId(Integer.parseInt(idSocio));
			socioService.updateSocio(socioDTO);
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	public String listSocios(){
		try{
			listaSociosDTO = socioService.getAll();
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	public String obtenerSocio(){
		try{
			socioDTO = socioService.getById(Integer.parseInt(idSocio));
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}
	
}
