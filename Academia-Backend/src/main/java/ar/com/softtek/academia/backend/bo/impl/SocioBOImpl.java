package ar.com.softtek.academia.backend.bo.impl;

import java.util.List;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.bo.SocioBO;
import ar.com.softtek.academia.backend.dao.SocioDAO;


public class SocioBOImpl implements SocioBO {

	private SocioDAO socioDAO;
	

	public SocioDTO getSocioById(int id) throws BusinessException {
		try{
			SocioDTO socio = socioDAO.getByIdSocio(id);
			return	socio;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public void actualizarSocio(SocioDTO entidad) throws BusinessException {
		try{
			socioDAO.updateSocio(entidad);
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public SocioDTO crearSocio(SocioDTO entidad) throws BusinessException {
		try{
			SocioDTO socioDTO = socioDAO.saveSocio(entidad);
			return socioDTO;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
		
	}

	public boolean borrarSocio(SocioDTO entidad) throws BusinessException {
		try{
			Boolean result = socioDAO.deleteSocio(entidad);
			return result;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public boolean borrarSocio(int id) throws BusinessException {
		try{
			Boolean result = socioDAO.delete(id);
			return result;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public List<SocioDTO> getAllSocios() throws BusinessException {
		try{
			List<SocioDTO> socios = socioDAO.getAllSocios();
			return	socios;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}
	
	
	public void setSocioDAO(SocioDAO changeSocioDAO) {
		socioDAO = changeSocioDAO;	
	}

	public List<SocioDTO> getAllBySexo(String sexo) throws BusinessException{

		try{
			List<SocioDTO> sociosBySexo = socioDAO.getAllBySexo(sexo);
			return sociosBySexo;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	
	public int countSocios() throws BusinessException {
		try{
			int cantSocios = socioDAO.countSocios();
			return	cantSocios;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	
	/*
	public List<SocioDTO> getAllBySexo(String sexo) throws BusinessException{

		try{
			List<SocioDTO> socios = socioDAO.getAllSocios();
			List<SocioDTO> sociosBySexo = new ArrayList<SocioDTO>();
			for(SocioDTO socio :socios){
				if(socio.getSexo().equals(sexo)){
					sociosBySexo.add(socio);
				}
			}
			return	sociosBySexo;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}
	*/
	
}
