package ar.com.softtek.academia.backend.dao.impl.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ar.com.academia.dto.PlanDTO;
import ar.com.academia.entities.Plan;



public class PlanMapper {

	public static PlanDTO planToDTO(Plan planToMap){
		PlanDTO planDTO = new PlanDTO();
		return planDTO;
	}
	
	public static Plan DTOToPlan(PlanDTO planToMap){
		Plan planEntity = new Plan();
		return planEntity;
	}
	
	public static List<PlanDTO> createPlanesListDTO(List<Plan> planes){
		Plan plan;
		PlanDTO planDTOAgregar;
		List<PlanDTO> planesDTO = new ArrayList<PlanDTO>();
		Iterator<Plan> it = planes.iterator();
		while(it.hasNext()){
			plan = it.next();
			planDTOAgregar = PlanMapper.planToDTO(plan);
			planesDTO.add(planDTOAgregar);
		}
		return planesDTO;
	}
	
	public static List<Plan> createPlanList(List<PlanDTO> planesDTO){
		PlanDTO planDTO;
		Plan planAgregar;
		List<Plan> planes = new ArrayList<Plan>();
		Iterator<PlanDTO> it = planesDTO.iterator();
		while(it.hasNext()){
			planDTO = it.next();
			planAgregar = PlanMapper.DTOToPlan(planDTO);
			planes.add(planAgregar);
		}
		return planes;
	}
	
}
