package ar.com.softtek.academia.backend.bo.impl;

import java.util.List;

import ar.com.academia.dto.ReservaDTO;
import ar.com.academia.dto.TurnoDTO;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.bo.TurnoBO;
import ar.com.softtek.academia.backend.dao.TurnoDAO;

public class TurnoBOImpl implements TurnoBO{
	
	private TurnoDAO turnoDAO;
	

	public TurnoDTO getTurnoById(int id) throws BusinessException {
		try{
			TurnoDTO turno = turnoDAO.getByIdTurno(id);
			return	turno;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public void actualizarTurno(TurnoDTO entidad) throws BusinessException {
		try{
			turnoDAO.updateTurno(entidad);
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public TurnoDTO crearTurno(TurnoDTO entidad) throws BusinessException {
		try{
//			ReservaDTO reserva = entidad.getReservaDTO();
//			reserva.setTurnoDTO(entidad);
			TurnoDTO turnoDTO = turnoDAO.saveTurno(entidad);
			return turnoDTO;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
		
	}

	public boolean borrarTurno(TurnoDTO entidad) throws BusinessException {
		try{
			Boolean result = turnoDAO.deleteTurno(entidad);
			return result;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public boolean borrarTurno(int id) throws BusinessException {
		try{
			Boolean result = turnoDAO.delete(id);
			return result;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public List<TurnoDTO> getAllTurnos() throws BusinessException {
		try{
			List<TurnoDTO> turnos = turnoDAO.getAllTurnos();
			return	turnos;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}
	
	public void setTurnoDAO(TurnoDAO changeTurnoDAO) {
		turnoDAO = changeTurnoDAO;	
	}
	
	public int countTurnos() throws BusinessException {
		try{
			int cantTurnos = turnoDAO.countTurnos();
			return	cantTurnos;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}
	
}
