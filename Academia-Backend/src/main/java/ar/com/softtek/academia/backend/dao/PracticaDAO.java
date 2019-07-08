package ar.com.softtek.academia.backend.dao;

import java.util.List;

import ar.com.academia.dto.PracticaDTO;
import ar.com.academia.entities.Practica;
import ar.com.academia.entities.exception.PersistenceException;


public interface PracticaDAO extends GenericDAO<Practica> {


	public List<PracticaDTO> getAllPracticas() throws PersistenceException;
	
	public PracticaDTO getByIdPractica(int id) throws PersistenceException;

	public int countPracticas() throws PersistenceException;
	
}
