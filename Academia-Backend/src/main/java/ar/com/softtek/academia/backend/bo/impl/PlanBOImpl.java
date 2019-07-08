package ar.com.softtek.academia.backend.bo.impl;

import java.util.List;

import ar.com.academia.dto.PlanDTO;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.bo.PlanBO;
import ar.com.softtek.academia.backend.dao.PlanDAO;

public class PlanBOImpl implements PlanBO{
	
	private PlanDAO planDAO;
	

	public PlanDTO getPlanById(int id) throws BusinessException {
		try{
			PlanDTO plan = planDAO.getByIdPlan(id);
			return	plan;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}


	public List<PlanDTO> getAllPlanes() throws BusinessException {
		try{
			List<PlanDTO> planes = planDAO.getAllPlanes();
			return	planes;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}
	
	public void setPlanDAO(PlanDAO changePlanDAO) {
		planDAO = changePlanDAO;	
	}
	
	public int countPlanes() throws BusinessException {
		try{
			int cantPlanes = planDAO.countPlanes();
			return	cantPlanes;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}
	
}
