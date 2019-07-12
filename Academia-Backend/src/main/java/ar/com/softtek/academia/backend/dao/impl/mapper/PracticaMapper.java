package ar.com.softtek.academia.backend.dao.impl.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import ar.com.academia.dto.PracticaDTO;
import ar.com.academia.entities.Practica;



public class PracticaMapper {

	public static PracticaDTO mapPracticaToDTO(Practica practicaToMap){
		PracticaDTO practicaDTO = null;
		if(practicaToMap != null) {
			practicaDTO = new PracticaDTO();
			practicaDTO.setId(practicaToMap.getId());
			practicaDTO.setCodigo(practicaToMap.getCodigo());
			practicaDTO.setDescripcion(practicaToMap.getDescripcion());
			
			
		}
		
		return practicaDTO;
	}
	
	public static Practica mapDTOToPractica(PracticaDTO practicaToMap){
		Practica practicaEntity = null;
		if(practicaToMap != null) {
			practicaEntity = new Practica();
			practicaEntity.setId(practicaToMap.getId());
			practicaEntity.setCodigo(practicaToMap.getCodigo());
			practicaEntity.setDescripcion(practicaToMap.getDescripcion());
		}
		
		return practicaEntity;
	}
	
	public static List<PracticaDTO> mapListPracticaToDTO(Collection<Practica> practicas){
		Practica practica;
		PracticaDTO practicaDTOAgregar;
		List<PracticaDTO> practicasDTO = new ArrayList<PracticaDTO>();
		Iterator<Practica> it = practicas.iterator();
		while(it.hasNext()){
			practica = it.next();
			practicaDTOAgregar = PracticaMapper.mapPracticaToDTO(practica);
			practicasDTO.add(practicaDTOAgregar);
		}
		return practicasDTO;
	}
	
	public static List<Practica> mapListDTOToPractica(Collection<PracticaDTO> practicasDTO){
		List<Practica> practicas = new ArrayList<Practica>();
		if(practicasDTO != null) {
			PracticaDTO practicaDTO;
			Practica practicaAgregar;
			Iterator<PracticaDTO> it = practicasDTO.iterator();
			while(it.hasNext()){
				practicaDTO = it.next();
				practicaAgregar = PracticaMapper.mapDTOToPractica(practicaDTO);
				practicas.add(practicaAgregar);
			}
		}
		return practicas;
	}
	
}
