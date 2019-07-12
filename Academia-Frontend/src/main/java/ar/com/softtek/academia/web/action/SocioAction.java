package ar.com.softtek.academia.web.action;

import java.util.ArrayList;
import java.util.List;

import ar.com.academia.dto.PlanDTO;
import ar.com.academia.dto.SocioDTO;
import ar.com.academia.dto.service.SocioServiceDTO;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.PlanService;
import ar.com.academia.services.SocioService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Servlet implementation class SocioAction
 */
public class SocioAction extends ActionSupport {

	private SocioService socioService;
	private PlanService planService;
	private SocioDTO socioDTO;
	private SocioServiceDTO socioServiceDTO;
	private String idSocio;
	private List<SocioDTO> listaSociosDTO;
	private ArrayList<PlanDTO> listaPlanesDTO;
	private PlanDTO planDTO;
	private Integer planId;
	
	public SocioService getSocioService() {
		return socioService;
	}

	public void setSocioService(SocioService socioService) {
		this.socioService = socioService;
	}

	public PlanService getPlanService() {
		return planService;
	}

	public void setPlanService(PlanService planService) {
		this.planService = planService;
	}

	public SocioDTO getSocioDTO() {
		return socioDTO;
	}

	public void setSocioDTO(SocioDTO socioDTO) {
		this.socioDTO = socioDTO;
	}

	public SocioServiceDTO getSocioServiceDTO() {
		return socioServiceDTO;
	}

	public void setSocioServiceDTO(SocioServiceDTO socioServiceDTO) {
		this.socioServiceDTO = socioServiceDTO;
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

	public ArrayList<PlanDTO> getListaPlanesDTO() {
		return listaPlanesDTO;
	}

	public void setListaPlanesDTO(ArrayList<PlanDTO> listaPlanesDTO) {
		this.listaPlanesDTO = listaPlanesDTO;
	}

	public PlanDTO getPlanDTO() {
		return planDTO;
	}

	public void setPlanDTO(PlanDTO planDTO) {
		this.planDTO = planDTO;
	}

	public String nuevoSocio(){
		try{
			socioServiceDTO = new SocioServiceDTO();
			listaPlanesDTO = planService.getAllPlanes();
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	public String addSocio() {
		try{
//			socioServiceDTO.setPlanDTO(planDTO.getId());
			socioServiceDTO.setPlanDTO(1);
			socioService.add(socioServiceDTO);
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

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
}
