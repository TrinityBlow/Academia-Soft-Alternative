package ar.com.softtek.academia.backend.dao;

import java.util.List;

import ar.com.academia.dto.ReservaDTO;
import ar.com.academia.entities.Reserva;
import ar.com.academia.entities.exception.PersistenceException;


public interface ReservaDAO extends GenericDAO<Reserva> {

	public List<ReservaDTO> getAllReservas() throws PersistenceException;
	
	public ReservaDTO getByIdReserva(int id) throws PersistenceException;

	public int countReservas() throws PersistenceException;
	
	
}
