package ar.com.softtek.academia.backend.bo;

import java.util.List;

import ar.com.academia.dto.PlanDTO;
import ar.com.academia.entities.exception.BusinessException;


public interface PlanBO {
	
	public List<PlanDTO> getAllPlanes() throws BusinessException;
	
	public PlanDTO getPlanById(int id) throws BusinessException;
	
	public int countPlanes() throws BusinessException;
	
}
