package ar.com.softtek.academia.backend.services.impl;

import java.util.List;

import javax.jws.WebService;

import ar.com.academia.dto.TurnoDTO;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.TurnoService;
import ar.com.softtek.academia.backend.bo.TurnoBO;

@WebService(endpointInterface = "ar.com.academia.services.TurnoService", serviceName = "TurnoService")
public class TurnoServiceImpl implements TurnoService {
	
	private TurnoBO turnoBO;
	
	public TurnoBO getTurnoBO() {
		return turnoBO;
	}

	public void setTurnoBO(TurnoBO turnoBO) {
		this.turnoBO = turnoBO;
	}

	public int addTurno(TurnoDTO agregar) throws ServiceException {
		try{
			TurnoDTO turnoDTOAgregado;
			turnoDTOAgregado = turnoBO.crearTurno(agregar);
			return turnoDTOAgregado.getId();
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public List<TurnoDTO> getAllTurnos() throws ServiceException {
		try{
			List<TurnoDTO> turno = turnoBO.getAllTurnos();
			return turno;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public TurnoDTO getByIdTurno(int idTurno) throws ServiceException {
		try{
			TurnoDTO turno = turnoBO.getTurnoById(idTurno);
			return turno;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public boolean removeByIdTurno(int idTurno) throws ServiceException {

		try{
			Boolean result = turnoBO.borrarTurno(idTurno);
			return result;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public int countTurnos() throws ServiceException {
		try{
			int turnos = turnoBO.countTurnos();
			return turnos;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public void updateTurno(TurnoDTO actualizar) throws ServiceException {
		try{
			turnoBO.actualizarTurno(actualizar);
		} catch (BusinessException c){
			throw new ServiceException();
		}
		
	}
}
