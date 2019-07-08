package ar.com.softtek.academia.backend.bo.impl;

import java.util.List;

import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.bo.PrestadorBO;
import ar.com.softtek.academia.backend.dao.PrestadorDAO;


public class PrestadorBOImpl implements PrestadorBO {

	private PrestadorDAO prestadorDAO;
	

	public PrestadorDTO getPrestadorById(int id) throws BusinessException {
		try{
			PrestadorDTO prestador = prestadorDAO.getByIdPrestador(id);
			return	prestador;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public void actualizarPrestador(PrestadorDTO entidad) throws BusinessException {
		try{
			prestadorDAO.updatePrestador(entidad);
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public PrestadorDTO crearPrestador(PrestadorDTO entidad) throws BusinessException {
		try{
			PrestadorDTO prestadorDTO = prestadorDAO.savePrestador(entidad);
			return prestadorDTO;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
		
	}

	public boolean borrarPrestador(PrestadorDTO entidad) throws BusinessException {
		try{
			Boolean result = prestadorDAO.deletePrestador(entidad);
			return result;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public boolean borrarPrestador(int id) throws BusinessException {
		try{
			Boolean result = prestadorDAO.delete(id);
			return result;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public List<PrestadorDTO> getAllPretadores() throws BusinessException {
		try{
			List<PrestadorDTO> prestadores = prestadorDAO.getAllPrestadores();
			return	prestadores;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}
	
	
	public void setPrestadorDAO(PrestadorDAO changePrestadorDAO) {
		prestadorDAO = changePrestadorDAO;	
	}


	@Override
	public int countPrestadores() throws BusinessException {
		try{
			int cantPrestadores = prestadorDAO.countPrestadores();
			return	cantPrestadores;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	@Override
	public List<PrestadorDTO> getAllPrestadores() throws BusinessException {
		try{
			List<PrestadorDTO> prestadores = prestadorDAO.getAllPrestadores();
			return	prestadores;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	
	
}
