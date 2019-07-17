package ar.com.softtek.academia.backend.services.impl;

import java.util.List;

import javax.jws.WebService;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.dto.service.SocioServiceDTO;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.SocioService;
import ar.com.softtek.academia.backend.bo.SocioBO;

@WebService(endpointInterface = "ar.com.academia.services.SocioService", serviceName = "SocioService")
public class SocioServiceImpl implements SocioService {

	private SocioBO socioBO;
	
	public SocioBO getSocioBO() {
		return socioBO;
	}

	public void setSocioBO(SocioBO socioBO) {
		this.socioBO = socioBO;
	}

	public int add(SocioServiceDTO agregar) throws ServiceException {
		try{
			SocioDTO socioDTOAgregado;
			socioDTOAgregado = socioBO.crearSocio(agregar);
			return socioDTOAgregado.getId();
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public List<SocioDTO> getAll() throws ServiceException {
		try{
			List<SocioDTO> socios = socioBO.getAllSocios();
			return socios;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public SocioDTO getById(int idSocio) throws ServiceException {
		try{
			SocioDTO socio = socioBO.getSocioById(idSocio);
			return socio;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public List<SocioDTO> getByAllSexo(String sexo) throws ServiceException {
		try{
			List<SocioDTO> sociosBySexo = socioBO.getAllBySexo(sexo);
			return sociosBySexo;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public boolean removeById(int idSocio) throws ServiceException {

		try{
			Boolean result = socioBO.borrarSocio(idSocio);
			return result;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public int countSocios() throws ServiceException {
		try{
			int socios = socioBO.countSocios();
			return socios;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public void updateSocio(SocioDTO actualizar) throws ServiceException {
		try{
			socioBO.actualizarSocio(actualizar);
		} catch (BusinessException c){
			throw new ServiceException();
		}
		
	}

	@Override
	public List<SocioDTO> buscarSocios(String nombreB, String apellidoB, int dniB, int nroAfiB) throws ServiceException {
		try{
			List<SocioDTO> sociosBusqueda = socioBO.buscarSocios(nombreB, apellidoB, dniB, nroAfiB);
			return sociosBusqueda;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

}
