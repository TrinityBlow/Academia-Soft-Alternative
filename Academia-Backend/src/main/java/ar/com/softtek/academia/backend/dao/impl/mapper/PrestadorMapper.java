package ar.com.softtek.academia.backend.dao.impl.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.entities.Horario;
import ar.com.academia.entities.Practica;
import ar.com.academia.entities.Prestador;

public class PrestadorMapper {

	public static PrestadorDTO mapPrestadorToDTO(Prestador prestadorToMap){
		PrestadorDTO prestadorDTO = null;
		if(prestadorToMap != null) {
			prestadorDTO = new PrestadorDTO();
			prestadorDTO.setId(prestadorToMap.getId());
			prestadorDTO.setNombre(prestadorToMap.getNombre());
			prestadorDTO.setApellido(prestadorToMap.getApellido());
			prestadorDTO.setTelefono(prestadorToMap.getTelefono());
			prestadorDTO.setEmail(prestadorToMap.getEmail());
		}
		
		return prestadorDTO;
	}
	
	public static Prestador mapDTOToPrestador(PrestadorDTO prestadorToMap){
		Prestador prestadorEntity = null;
		if(prestadorToMap != null) {
			prestadorEntity = new Prestador();
			prestadorEntity.setId(prestadorToMap.getId());
			prestadorEntity.setNombre(prestadorToMap.getNombre());
			prestadorEntity.setApellido(prestadorToMap.getApellido());
			prestadorEntity.setTelefono(prestadorToMap.getTelefono());
			prestadorEntity.setEmail(prestadorToMap.getEmail());
			
			List<Horario> horariosList = HorarioMapper.mapListDTOToHorario(prestadorToMap.getHorasDTO());
			Set<Horario> horariosSet = new HashSet<Horario>(horariosList);
			prestadorEntity.setHoras(horariosSet);

			List<Practica> practicasList = PracticaMapper.mapListDTOToPractica(prestadorToMap.getPracticasDTO());
			Set<Practica> practicasSet = new HashSet<Practica>(practicasList);
			prestadorEntity.setPracticas(practicasSet);
		
		}
		
		return prestadorEntity;
	}
	
	public static List<PrestadorDTO> mapListPrestadorToDTO(Collection<Prestador> prestadores){
		Prestador prestador;
		PrestadorDTO prestadorDTOAgregar;
		List<PrestadorDTO> prestadoresDTO = new ArrayList<PrestadorDTO>();
		Iterator<Prestador> it = prestadores.iterator();
		while(it.hasNext()){
			prestador = it.next();
			prestadorDTOAgregar = PrestadorMapper.mapPrestadorToDTO(prestador);
			prestadoresDTO.add(prestadorDTOAgregar);
		}
		return prestadoresDTO;
	}
	
	public static List<Prestador> mapListDTOToPrestador(Collection<PrestadorDTO> prestadoresDTO){
		PrestadorDTO prestadorDTO;
		Prestador prestadorAgregar;
		List<Prestador> prestadores = new ArrayList<Prestador>();
		Iterator<PrestadorDTO> it = prestadoresDTO.iterator();
		while(it.hasNext()){
			prestadorDTO = it.next();
			prestadorAgregar = PrestadorMapper.mapDTOToPrestador(prestadorDTO);
			prestadores.add(prestadorAgregar);
		}
		return prestadores;
	}
	
}
