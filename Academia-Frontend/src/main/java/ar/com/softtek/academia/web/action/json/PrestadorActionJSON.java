package ar.com.softtek.academia.web.action.json;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.academia.dto.PracticaDTO;
import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.PracticaService;

public class PrestadorActionJSON extends ActionSupport {

	private PracticaService practicaService;
	private List<PrestadorDTO> prestadoresDTO;
	private int data;
	
	public String writeJSON() throws ServiceException{
		prestadoresDTO = new ArrayList<PrestadorDTO>();
		try{
			prestadoresDTO = practicaService.getPrestadoresOfPractica(data);
		} catch(ServiceException e){
		}
		return SUCCESS;
	}

	public PracticaService getPracticaService() {
		return practicaService;
	}

	public void setPracticaService(PracticaService practicaService) {
		this.practicaService = practicaService;
	}


	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public List<PrestadorDTO> getPrestadoresDTO() {
		return prestadoresDTO;
	}

	public void setPrestadoresDTO(List<PrestadorDTO> prestadoresDTO) {
		this.prestadoresDTO = prestadoresDTO;
	}

}
