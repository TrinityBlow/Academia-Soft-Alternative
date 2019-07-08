package ar.com.softtek.academia.backend.bo.impl;

import java.util.List;

import ar.com.academia.dto.ReservaDTO;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.bo.ReservaBO;
import ar.com.softtek.academia.backend.dao.ReservaDAO;

public class ReservaBOImpl implements ReservaBO{
	
	private ReservaDAO reservaDAO;
	

	public ReservaDTO getReservaById(int id) throws BusinessException {
		try{
			ReservaDTO reserva = reservaDAO.getByIdReserva(id);
			return	reserva;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}


	public List<ReservaDTO> getAllReservas() throws BusinessException {
		try{
			List<ReservaDTO> reservas = reservaDAO.getAllReservas();
			return	reservas;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}
	
	public void setReservaDAO(ReservaDAO changeReservaDAO) {
		reservaDAO = changeReservaDAO;	
	}
	
	public int countReservas() throws BusinessException {
		try{
			int cantReservas = reservaDAO.countReservas();
			return	cantReservas;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}
	
}
