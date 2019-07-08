package ar.com.softtek.academia.backend.dao;

import java.util.List;

import ar.com.academia.dto.HorarioDTO;
import ar.com.academia.entities.Horario;
import ar.com.academia.entities.exception.PersistenceException;

public interface HorarioDAO extends GenericDAO<Horario> {

	public List<HorarioDTO> getAllHorarios() throws PersistenceException;
	
	public HorarioDTO getByIdHorario(int id) throws PersistenceException;

	public int countHorarios() throws PersistenceException;
	
	
}
