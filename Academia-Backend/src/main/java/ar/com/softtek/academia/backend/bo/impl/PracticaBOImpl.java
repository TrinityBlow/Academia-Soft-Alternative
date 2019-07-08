package ar.com.softtek.academia.backend.bo.impl;

import java.util.List;

import ar.com.academia.dto.PracticaDTO;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.bo.PracticaBO;
import ar.com.softtek.academia.backend.dao.PracticaDAO;

public class PracticaBOImpl implements PracticaBO{
	
	private PracticaDAO practicaDAO;
	

	public PracticaDTO getPracticaById(int id) throws BusinessException {
		try{
			PracticaDTO practica = practicaDAO.getByIdPractica(id);
			return	practica;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}


	public List<PracticaDTO> getAllPracticas() throws BusinessException {
		try{
			List<PracticaDTO> practicas = practicaDAO.getAllPracticas();
			return	practicas;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}
	
	public void setPracticaDAO(PracticaDAO changePracticaDAO) {
		practicaDAO = changePracticaDAO;	
	}
	
	public int countPracticas() throws BusinessException {
		try{
			int cantPracticas = practicaDAO.countPracticas();
			return	cantPracticas;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}
	
}
