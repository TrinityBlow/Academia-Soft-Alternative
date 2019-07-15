package ar.com.softtek.academia.web.action.json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

import ar.com.academia.dto.HorarioDTO;
import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.PracticaService;
import ar.com.academia.services.PrestadorService;

public class PrestadorActionJSON extends ActionSupport {

	private PracticaService practicaService;
	private PrestadorService prestadorService;
	private List<PrestadorDTO> prestadoresDTO;
	private List<HorarioDTO> horariosDTO;
	private PrestadorDTO prestadorDTO;
	private String jsonString;
	private int data;
	
	public String writeJSON() throws ServiceException{
		prestadoresDTO = new ArrayList<PrestadorDTO>();
        Gson gson = new Gson();
		try{
	        
			prestadoresDTO = practicaService.getPrestadoresOfPractica(data);
			jsonString = gson.toJson(prestadoresDTO);
		} catch(ServiceException e){
		}
		return SUCCESS;
	}
	
	public String writeJSONHorario() throws ServiceException{
		horariosDTO = new ArrayList<HorarioDTO>();
        Gson gson = new Gson();
		try{
			prestadorDTO = prestadorService.getById(data);
			horariosDTO = prestadorDTO.getHorasDTO();
			jsonString = gson.toJson(horariosDTO);
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


	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}

	public PrestadorService getPrestadorService() {
		return prestadorService;
	}

	public void setPrestadorService(PrestadorService prestadorService) {
		this.prestadorService = prestadorService;
	}


}
