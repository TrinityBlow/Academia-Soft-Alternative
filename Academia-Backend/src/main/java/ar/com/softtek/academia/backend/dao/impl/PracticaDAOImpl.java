package ar.com.softtek.academia.backend.dao.impl;


import java.util.List;

import ar.com.academia.dto.PracticaDTO;
import ar.com.academia.entities.Practica;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.dao.PracticaDAO;
import ar.com.softtek.academia.backend.dao.impl.mapper.PracticaMapper;


public class PracticaDAOImpl extends GenericDAOImpl<Practica> implements PracticaDAO {

	@Override
	public Class<Practica>getType(){
		return Practica.class;
	}

	@Override
	public List<PracticaDTO> getAllPracticas() throws PersistenceException{
		try{
			List<PracticaDTO> practicasDTO;
			List<Practica> practicas = this.getAll();
			practicasDTO = PracticaMapper.createPracticasListDTO(practicas);
			return practicasDTO;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public PracticaDTO getByIdPractica(int id) throws PersistenceException {
		try{
			PracticaDTO practicaDTO;
			Practica practica = this.getById(id);
			practicaDTO = PracticaMapper.practicaToDTO(practica);
			return practicaDTO;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}


	@Override
	public int countPracticas() throws PersistenceException {
		try{
			int result = this.count();
			return result;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}
}
