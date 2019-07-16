package ar.com.softtek.academia.web.action;

import java.util.ArrayList;
import java.util.List;

import ar.com.academia.dto.PlanDTO;
import ar.com.academia.dto.SocioDTO;
import ar.com.academia.dto.service.SocioServiceDTO;
import ar.com.academia.dto.struts.PlanStruts;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.PlanService;
import ar.com.academia.services.SocioService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Servlet implementation class SocioAction
 */
public class SocioAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SocioService socioService;
	private PlanService planService;
	private SocioDTO socioDTO;
	private SocioServiceDTO socioServiceDTO;
	private String idSocio;
	private List<SocioDTO> listaSociosDTO;
	private List<PlanDTO> listaPlanesDTO;
	private int planId;
	
	
	
	/*public Integer getPlanDTO() {
		return planDTO;
	}

	public void setPlanDTO(Integer planDTO) {
		this.planDTO = planDTO;
	}*/



	public SocioServiceDTO getSocioServiceDTO() {
		return socioServiceDTO;
	}

	public void setSocioServiceDTO(SocioServiceDTO socioServiceDTO) {
		this.socioServiceDTO = socioServiceDTO;
	}


	public PlanService getPlanService() {
		return planService;
	}

	public void setPlanService(PlanService planService) {
		this.planService = planService;
	}

	public List<PlanDTO> getListaPlanesDTO() {
		return listaPlanesDTO;
	}

	public void setListaPlanesDTO(List<PlanDTO> listaPlanesDTO) {
		this.listaPlanesDTO = listaPlanesDTO;
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

	
	public String nuevoSocio(){
		try{
			listaPlanesDTO = planService.getAllPlanes();
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	/*public String nuevoSocio(){
		try{
			listaPlanesDTO = planService.getAllPlanes();
			listaPlanesID = new ArrayList<Integer>();
			for(PlanDTO planDTO :listaPlanesDTO){
				listaPlanesID.add(planDTO.getId());
			}
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}*/

	public String addSocio() {
		try{
			socioService.add(this.getSocioServiceDTO());
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

//	public String updateSocio(){
//		try{
//			planDTO = planService.getByIdPlan(planId);
//			socioDTO.setPlanDTO(planDTO);
//			socioService.updateSocio(this.getSocioDTO());
//		} catch (ServiceException e){
//		
//			return ERROR;
//		}
//		return SUCCESS;
//	}

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

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}
}
