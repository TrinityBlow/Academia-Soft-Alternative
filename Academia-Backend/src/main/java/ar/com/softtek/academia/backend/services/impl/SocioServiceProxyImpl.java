package ar.com.softtek.academia.backend.services.impl;

import java.util.List;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.SocioService;
import ar.com.academia.services.SocioServiceProxy;

public class SocioServiceProxyImpl implements SocioServiceProxy {



	private SocioService socioService;

	
	public SocioService getSocioService() {
		return socioService;
	}

	public void setSocioService(SocioService socioService) {
		this.socioService = socioService;
	}
	

	@Override
	public List<SocioDTO> getAll() throws ServiceException {
		try{
			List<SocioDTO> socios = socioService.getAll();
			return socios;
		} catch (ServiceException e){
			throw new ServiceException();
		}
	}

	@Override
	public SocioDTO getById(int id) throws ServiceException {
		try{
			SocioDTO socio = socioService.getById(id);
			return socio;
		} catch (ServiceException e){
			throw new ServiceException();
		}
	}

	@Override
	public int add(SocioDTO entidad) throws ServiceException {
		//int socioId = socioService.add(entidad);
		return 1;
	}

	@Override
	public boolean removeById(int id) throws ServiceException {
		try{
			Boolean result = socioService.removeById(id);
			return result;
		} catch (ServiceException e){
			throw new ServiceException();
		}
	}

	@Override
	public List<SocioDTO> getBySexo(String sexo) throws ServiceException {
		try{
			List<SocioDTO> sociosBySexo = socioService.getByAllSexo(sexo);
			return sociosBySexo;
		} catch (ServiceException e){
			throw new ServiceException();
		}
	}

}
