package ar.com.softtek.academia.backend.dao.impl;


import java.util.List;


import ar.com.academia.dto.PlanDTO;
import ar.com.academia.entities.Plan;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.dao.PlanDAO;
import ar.com.softtek.academia.backend.dao.impl.mapper.PlanMapper;

public class PlanDAOImpl extends GenericDAOImpl<Plan> implements PlanDAO {

	@Override
	public Class<Plan>getType(){
		return Plan.class;
	}

	@Override
	public List<PlanDTO> getAllPlanes() throws PersistenceException{
		try{
			List<PlanDTO> planesDTO;
			List<Plan> planes = this.getAll();
			planesDTO = PlanMapper.createPlanesListDTO(planes);
			return planesDTO;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public PlanDTO getByIdPlan(int id) throws PersistenceException {
		try{
			PlanDTO planDTO;
			Plan plan = this.getById(id);
			planDTO = PlanMapper.planToDTO(plan);
			return planDTO;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}


	@Override
	public int countPlanes() throws PersistenceException {
		try{
			int result = this.count();
			return result;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}
}
