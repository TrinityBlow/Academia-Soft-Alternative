package ar.com.softtek.academia.backend.dao.impl;


import java.util.List;

import ar.com.academia.dto.ReservaDTO;
import ar.com.academia.entities.Reserva;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.dao.ReservaDAO;
import ar.com.softtek.academia.backend.dao.impl.mapper.ReservaMapper;


public class ReservaDAOImpl extends GenericDAOImpl<Reserva> implements ReservaDAO {

	@Override
	public Class<Reserva>getType(){
		return Reserva.class;
	}

	@Override
	public List<ReservaDTO> getAllReservas() throws PersistenceException{
		try{
			List<ReservaDTO> reservasDTO;
			List<Reserva> reservas = this.getAll();
			reservasDTO = ReservaMapper.mapListReservaToDTO(reservas); 
			return reservasDTO;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public ReservaDTO getByIdReserva(int id) throws PersistenceException {
		try{
			ReservaDTO reservaDTO;
			Reserva reserva = this.getById(id);
			reservaDTO = ReservaMapper.mapReservaToDTO(reserva);
			return reservaDTO;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}


	@Override
	public int countReservas() throws PersistenceException {
		try{
			int result = this.count();
			return result;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public ReservaDTO saveReserva(ReservaDTO reservaDTO) throws PersistenceException {
		try{
			ReservaDTO reservaDTOAgregado;
			Reserva reservaAgregar = ReservaMapper.mapDTOToReserva(reservaDTO);
			this.save(reservaAgregar);
			reservaDTOAgregado = ReservaMapper.mapReservaToDTO(reservaAgregar);
			return reservaDTOAgregado;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public boolean deleteReserva(int id) throws PersistenceException {
		try{
			boolean result = this.delete(id);
			return result;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}
}
