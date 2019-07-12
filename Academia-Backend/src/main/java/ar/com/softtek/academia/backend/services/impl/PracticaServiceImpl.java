package ar.com.softtek.academia.backend.services.impl;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import ar.com.academia.dto.PracticaDTO;
import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.PracticaService;
import ar.com.softtek.academia.backend.bo.PracticaBO;

@WebService(endpointInterface = "ar.com.academia.services.PracticaService", serviceName = "PracticaService")
public class PracticaServiceImpl implements PracticaService {
	
	private PracticaBO practicaBO;
	
	public PracticaBO getPracticaBO() {
		return practicaBO;
	}

	public void setPracticaBO(PracticaBO practicaBO) {
		this.practicaBO = practicaBO;
	}


	public List<PracticaDTO> getAllPracticas() throws ServiceException {
		try{
			List<PracticaDTO> practica = practicaBO.getAllPracticas();
			return practica;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public PracticaDTO getByIdPractica(int idPractica) throws ServiceException {
		try{
			PracticaDTO practica = practicaBO.getPracticaById(idPractica);
			return practica;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}


	public int countPracticas() throws ServiceException {
		try{
			int practicas = practicaBO.countPracticas();
			return practicas;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	@Override
	public List<PrestadorDTO> getPrestadoresOfPractica(int id) throws ServiceException{
		try{
			List<PrestadorDTO> listAllPrestadoresByPractica = practicaBO.getAllPrestadoresByPractica(id);
			return listAllPrestadoresByPractica;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

}
