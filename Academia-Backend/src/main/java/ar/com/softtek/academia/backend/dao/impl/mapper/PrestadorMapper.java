package ar.com.softtek.academia.backend.dao.impl.mapper;

import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.entities.Prestador;

public class PrestadorMapper {

	public static PrestadorDTO prestadorToDTO(Prestador prestadorToMap){
		PrestadorDTO prestadorDTO = new PrestadorDTO();
		prestadorDTO.setId(prestadorToMap.getId());
		prestadorDTO.setNombre(prestadorToMap.getNombre());
		prestadorDTO.setApellido(prestadorToMap.getApellido());
		prestadorDTO.setTelefono(prestadorToMap.getTelefono());
		prestadorDTO.setEmail(prestadorToMap.getEmail());
		return prestadorDTO;
	}
	
	public static Prestador DTOToPrestador(PrestadorDTO prestadorToMap){
		Prestador prestadorEntity = new Prestador();
		prestadorEntity.setId(prestadorToMap.getId());
		prestadorEntity.setNombre(prestadorToMap.getNombre());
		prestadorEntity.setApellido(prestadorToMap.getApellido());
		prestadorEntity.setTelefono(prestadorToMap.getTelefono());
		prestadorEntity.setEmail(prestadorToMap.getEmail());
		return prestadorEntity;
	}
	
}
