package ar.com.softtek.academia.backend.dao.impl.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.dto.TurnoDTO;
import ar.com.academia.entities.Socio;
import ar.com.academia.entities.Turno;

public class SocioMapper {

	public static SocioDTO mapSocioToDTO(Socio socioToMap){
		SocioDTO socioDTO = null;
		if(socioToMap != null) {
			socioDTO = new SocioDTO();
			socioDTO.setId(socioToMap.getId());
			socioDTO.setNumeroSocio(socioToMap.getNumeroSocio());
			socioDTO.setNombre(socioToMap.getNombre());
			socioDTO.setApellido(socioToMap.getApellido());
			socioDTO.setSexo(socioToMap.getSexo());
			socioDTO.setEstadoCivil(socioToMap.getEstadoCivil());
			socioDTO.setNombreConyuge(socioToMap.getNombreConyuge());
			socioDTO.setCantidadHijos(socioToMap.getCantidadHijos());
			socioDTO.setDni(socioToMap.getDni());
			socioDTO.setTelefono(socioToMap.getTelefono());
			socioDTO.setDireccion(socioToMap.getDireccion());
			socioDTO.setEmail(socioToMap.getEmail());
			
			socioDTO.setPlanDTO(PlanMapper.mapPlanToDTO(socioToMap.getPlan()));
	
	//		List<TurnoDTO> turnosDTO = TurnoMapper.mapListTurnoToDTO(socioToMap.getTurnos());
	//		socioDTO.setTurnosDTO(turnosDTO);
		}
		
		return socioDTO;
	}
	
	public static Socio mapDTOToSocio(SocioDTO socioToMap){
		Socio socioEntity = null;
		if(socioToMap != null) {
			socioEntity = new Socio();
			socioEntity.setId(socioToMap.getId());
			socioEntity.setNumeroSocio(socioToMap.getNumeroSocio());
	    	socioEntity.setNombre(socioToMap.getNombre());
	    	socioEntity.setApellido(socioToMap.getNombre());
			socioEntity.setSexo(socioToMap.getSexo());
			socioEntity.setEstadoCivil(socioToMap.getEstadoCivil());
			socioEntity.setNombreConyuge(socioToMap.getNombreConyuge());
			socioEntity.setCantidadHijos(socioToMap.getCantidadHijos());
			socioEntity.setDni(socioToMap.getDni());
			socioEntity.setTelefono(socioToMap.getTelefono());
			socioEntity.setDireccion(socioToMap.getDireccion());
			socioEntity.setEmail(socioToMap.getEmail());
			socioEntity.setPassword(socioToMap.getPassword());
			
			
			socioEntity.setPlan(PlanMapper.mapDTOToPlan(socioToMap.getPlanDTO()));
	
	//		List<Turno> turnosDTO = TurnoMapper.mapListDTOToTurno(socioToMap.getTurnosDTO());
	//		socioEntity.setTurnos(turnosDTO);
		}
		
		return socioEntity;
	}
	
	public static List<SocioDTO> mapListSocioToDTO(Collection<Socio> socios){
		Socio socio;
		SocioDTO socioDTOAgregar;
		List<SocioDTO> sociosDTO = new ArrayList<SocioDTO>();
		Iterator<Socio> it = socios.iterator();
		while(it.hasNext()){
			socio = it.next();
			socioDTOAgregar = SocioMapper.mapSocioToDTO(socio);
			sociosDTO.add(socioDTOAgregar);
		}
		return sociosDTO;
	}
	
	public static List<Socio> mapListDTOToSocio(Collection<SocioDTO> sociosDTO){
		SocioDTO socioDTO;
		Socio socioAgregar;
		List<Socio> socios = new ArrayList<Socio>();
		Iterator<SocioDTO> it = sociosDTO.iterator();
		while(it.hasNext()){
			socioDTO = it.next();
			socioAgregar = SocioMapper.mapDTOToSocio(socioDTO);
			socios.add(socioAgregar);
		}
		return socios;
	}
	
}
