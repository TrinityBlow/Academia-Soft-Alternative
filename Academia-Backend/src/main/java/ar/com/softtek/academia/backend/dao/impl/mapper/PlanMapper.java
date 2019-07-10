package ar.com.softtek.academia.backend.dao.impl.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import ar.com.academia.dto.PlanDTO;
import ar.com.academia.dto.SocioDTO;
import ar.com.academia.entities.Plan;
import ar.com.academia.entities.Socio;



public class PlanMapper {

	public static PlanDTO mapPlanToDTO(Plan planToMap){
		PlanDTO planDTO = null;
		if(planToMap != null) {
			planDTO = new PlanDTO();
			planDTO.setId(planToMap.getId());
			planDTO.setDescripcion(planToMap.getDescripcion());
			
	//		List<SocioDTO> sociosDTO = SocioMapper.mapListSocioToDTO(planToMap.getSocios());
	//		planDTO.setSociosDTO(sociosDTO);
			

		}
		return planDTO;
	}
	
	public static Plan mapDTOToPlan(PlanDTO planToMap){
		Plan planEntity = null;
		if(planToMap != null) {
			planEntity = new Plan();
			planEntity.setId(planToMap.getId());
			planEntity.setDescripcion(planToMap.getDescripcion());
			
	//		List<Socio> socios = SocioMapper.mapListDTOToSocio(planToMap.getSociosDTO());
	//		planEntity.setSocios(socios);
		
		}
		return planEntity;
	}
	
	public static List<PlanDTO> mapListPlanToDTO(Collection<Plan> planes){
		Plan plan;
		PlanDTO planDTOAgregar;
		List<PlanDTO> planesDTO = new ArrayList<PlanDTO>();
		Iterator<Plan> it = planes.iterator();
		while(it.hasNext()){
			plan = it.next();
			planDTOAgregar = PlanMapper.mapPlanToDTO(plan);
			planesDTO.add(planDTOAgregar);
		}
		return planesDTO;
	}
	
	public static List<Plan> mapListDTOToPlan(Collection<PlanDTO> planesDTO){
		PlanDTO planDTO;
		Plan planAgregar;
		List<Plan> planes = new ArrayList<Plan>();
		Iterator<PlanDTO> it = planesDTO.iterator();
		while(it.hasNext()){
			planDTO = it.next();
			planAgregar = PlanMapper.mapDTOToPlan(planDTO);
			planes.add(planAgregar);
		}
		return planes;
	}
	
}
