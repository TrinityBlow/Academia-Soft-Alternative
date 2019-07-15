package ar.com.softtek.academia.backend.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import ar.com.academia.dto.PlanDTO;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.PlanService;
import ar.com.softtek.academia.backend.bo.PlanBO;

@WebService(endpointInterface = "ar.com.academia.services.PlanService", serviceName = "PlanService")
public class PlanServiceImpl implements PlanService {
	
	private PlanBO planBO;
	
	public PlanBO getPlanBO() {
		return planBO;
	}

	public void setPlanBO(PlanBO planBO) {
		this.planBO = planBO;
	}


	public List<PlanDTO> getAllPlanes() throws ServiceException {
		try{
			List<PlanDTO> plan = planBO.getAllPlanes();
			return plan;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public PlanDTO getByIdPlan(int idPlan) throws ServiceException {
		try{
			PlanDTO plan = planBO.getPlanById(idPlan);
			return plan;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}


	public int countPlanes() throws ServiceException {
		try{
			int planes = planBO.countPlanes();
			return planes;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}
}
