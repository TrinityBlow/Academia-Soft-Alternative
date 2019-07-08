package ar.com.softtek.academia.backend.dao.impl.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.entities.Socio;

public class SocioMapper {

	public static SocioDTO socioToDTO(Socio socioToMap){
		SocioDTO socioDTO = new SocioDTO();
		socioDTO.setId(socioToMap.getId());
		socioDTO.setNumeroSocio(socioToMap.getNumeroSocio());
//		socioDTO.setNombreYapellido(socioToMap.getNombreYapellido());
		socioDTO.setSexo(socioToMap.getSexo());
		socioDTO.setEstadoCivil(socioToMap.getEstadoCivil());
		socioDTO.setNombreConyuge(socioToMap.getNombreConyuge());
		socioDTO.setCantidadHijos(socioToMap.getCantidadHijos());
		socioDTO.setDni(socioToMap.getDni());
		socioDTO.setTelefono(socioToMap.getTelefono());
		socioDTO.setDireccion(socioToMap.getDireccion());
		return socioDTO;
	}
	
	public static Socio DTOToSocio(SocioDTO socioToMap){
		Socio socioEntity = new Socio();
		socioEntity.setId(socioToMap.getId());
		socioEntity.setNumeroSocio(socioToMap.getNumeroSocio());
    	socioEntity.setApellido(socioToMap.getNombre());
    	socioEntity.setNombre(socioToMap.getNombre());
		socioEntity.setSexo(socioToMap.getSexo());
		socioEntity.setEstadoCivil(socioToMap.getEstadoCivil());
		socioEntity.setNombreConyuge(socioToMap.getNombreConyuge());
		socioEntity.setCantidadHijos(socioToMap.getCantidadHijos());
		socioEntity.setDni(socioToMap.getDni());
		socioEntity.setTelefono(socioToMap.getTelefono());
		socioEntity.setDireccion(socioToMap.getDireccion());
		return socioEntity;
	}
	
	public static List<SocioDTO> createSociosListDTO(List<Socio> socios){
		Socio socio;
		SocioDTO socioDTOAgregar;
		List<SocioDTO> sociosDTO = new ArrayList<SocioDTO>();
		Iterator<Socio> it = socios.iterator();
		while(it.hasNext()){
			socio = it.next();
			socioDTOAgregar = SocioMapper.socioToDTO(socio);
			sociosDTO.add(socioDTOAgregar);
		}
		return sociosDTO;
	}
	
	public static List<Socio> createSociosList(List<SocioDTO> sociosDTO){
		SocioDTO socioDTO;
		Socio socioAgregar;
		List<Socio> socios = new ArrayList<Socio>();
		Iterator<SocioDTO> it = sociosDTO.iterator();
		while(it.hasNext()){
			socioDTO = it.next();
			socioAgregar = SocioMapper.DTOToSocio(socioDTO);
			socios.add(socioAgregar);
		}
		return socios;
	}
	
}
