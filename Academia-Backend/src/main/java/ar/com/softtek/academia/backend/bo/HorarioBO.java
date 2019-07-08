package ar.com.softtek.academia.backend.bo;

import java.util.List;

import ar.com.academia.dto.HorarioDTO;
import ar.com.academia.entities.exception.BusinessException;

public interface HorarioBO {
	
	public List<HorarioDTO> getAllHorarios() throws BusinessException;
	
	public HorarioDTO getHorarioById(int id) throws BusinessException;
	
	public int countHorarios() throws BusinessException;
	
}
