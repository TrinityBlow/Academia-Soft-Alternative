package ar.com.softtek.academia.backend.dao;

import java.util.List;

import ar.com.academia.dto.PlanDTO;
import ar.com.academia.entities.Plan;
import ar.com.academia.entities.exception.PersistenceException;

public interface PlanDAO extends GenericDAO<Plan> {

	public List<PlanDTO> getAllPlanes() throws PersistenceException;
	
	public PlanDTO getByIdPlan(int id) throws PersistenceException;

	public int countPlanes() throws PersistenceException;
	
}
