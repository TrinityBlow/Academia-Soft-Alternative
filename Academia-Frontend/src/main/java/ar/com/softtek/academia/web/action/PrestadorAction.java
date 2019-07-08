package ar.com.softtek.academia.web.action;

import java.util.List;

import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.PrestadorService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Servlet implementation class SocioAction
 */
public class PrestadorAction extends ActionSupport {

	private PrestadorService prestadorService;
	private PrestadorDTO prestadorDTO;
	private String idPrestador;
	private List<PrestadorDTO> listaPrestadoresDTO;
	
	
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
	
}
