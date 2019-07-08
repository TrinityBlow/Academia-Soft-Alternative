package ar.com.softtek.academia.backend.bo.impl;

import java.util.List;

import ar.com.academia.dto.HorarioDTO;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.bo.HorarioBO;
import ar.com.softtek.academia.backend.dao.HorarioDAO;

public class HorarioBOImpl implements HorarioBO{
	
	private HorarioDAO horarioDAO;
	

	public HorarioDTO getHorarioById(int id) throws BusinessException {
		try{
			HorarioDTO horario = horarioDAO.getByIdHorario(id);
			return	horario;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}


	public List<HorarioDTO> getAllHorarios() throws BusinessException {
		try{
			List<HorarioDTO> horarios = horarioDAO.getAllHorarios();
			return	horarios;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}
	
	public void setHorarioDAO(HorarioDAO changeHorarioDAO) {
		horarioDAO = changeHorarioDAO;	
	}
	
	public int countHorarios() throws BusinessException {
		try{
			int cantHorarios = horarioDAO.countHorarios();
			return	cantHorarios;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}
	
}
