package ar.com.softtek.academia.backend.dao;

import java.util.List;

import ar.com.academia.dto.TurnoDTO;
import ar.com.academia.entities.Turno;
import ar.com.academia.entities.exception.PersistenceException;

public interface TurnoDAO extends GenericDAO<Turno> {
	
	
	public List<TurnoDTO> getAllTurnos() throws PersistenceException;
	
	public TurnoDTO getByIdTurno(int id) throws PersistenceException;
	public TurnoDTO saveTurno(TurnoDTO entidad) throws PersistenceException;
	
	public void updateTurno(TurnoDTO entidad) throws PersistenceException;
	
	public boolean deleteTurno(TurnoDTO entidad) throws PersistenceException;	
	public boolean deleteTurno(int id) throws PersistenceException;

	public int countTurnos() throws PersistenceException;
}
