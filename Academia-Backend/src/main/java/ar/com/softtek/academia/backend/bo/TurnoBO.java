package ar.com.softtek.academia.backend.bo;

import java.util.List;

import ar.com.academia.dto.TurnoDTO;
import ar.com.academia.dto.service.TurnoServiceDTO;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.softtek.academia.backend.dao.TurnoDAO;

public interface TurnoBO {
	
	public List<TurnoDTO> getAllTurnos() throws BusinessException;
	public TurnoDTO getTurnoById(int id) throws BusinessException;
	public void actualizarTurno(TurnoDTO entidad) throws BusinessException;
	public TurnoDTO crearTurno(TurnoServiceDTO entidad) throws BusinessException;
	public boolean borrarTurno(TurnoDTO entidad) throws BusinessException;
	public boolean borrarTurno(int id) throws BusinessException ;
	public void setTurnoDAO(TurnoDAO entidad);
	public int countTurnos() throws BusinessException;
}
