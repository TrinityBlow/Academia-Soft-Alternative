package ar.com.softtek.academia.backend.dao;

import java.util.List;

import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.entities.Prestador;
import ar.com.academia.entities.exception.PersistenceException;

public interface PrestadorDAO extends GenericDAO<Prestador> {
    
	public List<PrestadorDTO> getAllPrestadores() throws PersistenceException;
	
	public PrestadorDTO getByIdPrestador(int id) throws PersistenceException;
	public PrestadorDTO savePrestador(Prestador entidad) throws PersistenceException;
	
	public void updatePrestador(PrestadorDTO entidad) throws PersistenceException;
	
	public boolean deletePrestador(PrestadorDTO entidad) throws PersistenceException;	
	public boolean deletePrestador(int id) throws PersistenceException;

	public int countPrestadores() throws PersistenceException;
}
