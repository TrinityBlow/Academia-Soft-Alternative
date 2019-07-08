package ar.com.softtek.academia.backend.services.impl;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.PrestadorService;
import ar.com.softtek.academia.backend.bo.PrestadorBO;

@WebService(endpointInterface = "ar.com.academia.services.PrestadorService", serviceName = "PrestadorService")
public class PrestadorServiceImpl implements PrestadorService {

	private PrestadorBO prestadorBO;
	
	public PrestadorBO getPrestadorBO() {
		return prestadorBO;
	}

	public void setPrestadorBO(PrestadorBO prestadorBO) {
		this.prestadorBO = prestadorBO;
	}

	public int add(PrestadorDTO agregar) throws ServiceException {
		try{
			PrestadorDTO prestadorDTOAgregado;
			prestadorDTOAgregado = prestadorBO.crearPrestador(agregar);
			return prestadorDTOAgregado.getId();
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public List<PrestadorDTO> getAllPrestadores() throws ServiceException {
		try{
			List<PrestadorDTO> prestadores = prestadorBO.getAllPrestadores();
			return prestadores;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public PrestadorDTO getById(int idPrestador) throws ServiceException {
		try{
			PrestadorDTO prestador = prestadorBO.getPrestadorById(idPrestador);
			return prestador;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public boolean removeById(int idPrestador) throws ServiceException {

		try{
			Boolean result = prestadorBO.borrarPrestador(idPrestador);
			return result;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public int countPrestadores() throws ServiceException {
		try{
			int prestadores = prestadorBO.countPrestadores();
			return prestadores;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public void updatePrestador(PrestadorDTO actualizar) throws ServiceException {
		try{
			prestadorBO.actualizarPrestador(actualizar);
		} catch (BusinessException c){
			throw new ServiceException();
		}
		
	}




}

