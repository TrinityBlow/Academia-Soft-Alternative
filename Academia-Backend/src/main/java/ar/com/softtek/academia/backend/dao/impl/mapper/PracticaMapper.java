package ar.com.softtek.academia.backend.dao.impl.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ar.com.academia.dto.PracticaDTO;
import ar.com.academia.entities.Practica;



public class PracticaMapper {

	public static PracticaDTO practicaToDTO(Practica practicaToMap){
		PracticaDTO practicaDTO = new PracticaDTO();
		return practicaDTO;
	}
	
	public static Practica DTOToPractica(PracticaDTO practicaToMap){
		Practica practicaEntity = new Practica();
		return practicaEntity;
	}
	
	public static List<PracticaDTO> createPracticasListDTO(List<Practica> practicas){
		Practica practica;
		PracticaDTO practicaDTOAgregar;
		List<PracticaDTO> practicasDTO = new ArrayList<PracticaDTO>();
		Iterator<Practica> it = practicas.iterator();
		while(it.hasNext()){
			practica = it.next();
			practicaDTOAgregar = PracticaMapper.practicaToDTO(practica);
			practicasDTO.add(practicaDTOAgregar);
		}
		return practicasDTO;
	}
	
	public static List<Practica> createPracticaList(List<PracticaDTO> practicasDTO){
		PracticaDTO practicaDTO;
		Practica practicaAgregar;
		List<Practica> practicas = new ArrayList<Practica>();
		Iterator<PracticaDTO> it = practicasDTO.iterator();
		while(it.hasNext()){
			practicaDTO = it.next();
			practicaAgregar = PracticaMapper.DTOToPractica(practicaDTO);
			practicas.add(practicaAgregar);
		}
		return practicas;
	}
	
}
