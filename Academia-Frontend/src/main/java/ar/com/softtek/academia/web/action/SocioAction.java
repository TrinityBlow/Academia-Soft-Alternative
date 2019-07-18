package ar.com.softtek.academia.web.action;

import java.util.ArrayList;
import java.util.List;

import ar.com.academia.dto.PlanDTO;
import ar.com.academia.dto.SocioDTO;
import ar.com.academia.dto.TurnoDTO;
import ar.com.academia.dto.service.SocioServiceDTO;
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
	private PlanDTO planDTO;
	
	private SocioServiceDTO socioServiceDTO;
	
	private List<SocioDTO> listaSociosDTO;
	private List<PlanDTO> listaPlanesDTO;
	private List<String> listaNombres;
	private List<String> listaApellidos;
	private List<String> listaDNI;

	private String idSocio;
	private String nombreB;
	private String apellidoB;
	private String dniB;	

	public String getNombreB() {
		return nombreB;
	}

	public void setNombreB(String nombreB) {
		this.nombreB = nombreB;
	}

	public String getApellidoB() {
		return apellidoB;
	}

	public void setApellidoB(String apellidoB) {
		this.apellidoB = apellidoB;
	}

	public String getDniB() {
		return dniB;
	}

	public void setDniB(String dniB) {
		this.dniB = dniB;
	}

	public List<String> getListaNombres() {
		return listaNombres;
	}

	public void setListaNombres(List<String> listaNombres) {
		this.listaNombres = listaNombres;
	}

	public List<String> getListaApellidos() {
		return listaApellidos;
	}

	public void setListaApellidos(List<String> listaApellidos) {
		this.listaApellidos = listaApellidos;
	}


	public List<String> getListaDNI() {
		return listaDNI;
	}

	public void setListaDNI(List<String> listaDNI) {
		this.listaDNI = listaDNI;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

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

	public PlanDTO getPlanDTO() {
		return planDTO;
	}

	public void setPlanDTO(PlanDTO planDTO) {
		this.planDTO = planDTO;
	}

	
	public String nuevoSocio(){
		try{
			listaPlanesDTO = planService.getAllPlanes();
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

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
			int borrarId = Integer.parseInt(idSocio);
			socioService.removeById(borrarId);
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	public String updateSocio(){
		try{
     		PlanDTO plan = planService.getByIdPlan(planDTO.getId());
			socioDTO.setPlanDTO(plan);
			socioService.updateSocio(socioDTO);
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	public String listSocios(){
		try{
			listaSociosDTO = socioService.buscarSocios(nombreB, apellidoB, dniB, 0);
			if(listaSociosDTO == null){
				listaSociosDTO = new ArrayList<SocioDTO>();
			}
			this.setCompleter();
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	public String obtenerSocio(){
		try{
			listaPlanesDTO = planService.getAllPlanes();
			socioDTO = socioService.getById(Integer.parseInt(idSocio));
		} catch (ServiceException e){
		
			return ERROR;
		}
		return SUCCESS;
	}

	//metodo que se usa a travez del dispplay tag para evitar volver a llamar al backend
	public String displayTagRefresh() {
		return SUCCESS;
	}
	
	private void setCompleter(){
		listaNombres = new ArrayList<String>();
		listaApellidos = new ArrayList<String>();
		listaDNI = new ArrayList<String>();
		for(SocioDTO socioDTO :listaSociosDTO){
			listaNombres.add(socioDTO.getNombre());
			listaApellidos.add(socioDTO.getApellido());
			listaDNI.add(socioDTO.getDni());
		}
	}
	
	
	
}
