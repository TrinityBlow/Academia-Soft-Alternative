package ar.com.softtek.academia.backend.dao.impl.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import ar.com.academia.dto.HorarioDTO;
import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.dto.ReservaDTO;
import ar.com.academia.entities.Horario;
import ar.com.academia.entities.Prestador;
import ar.com.academia.entities.Reserva;

public class HorarioMapper {

	public static HorarioDTO mapHorarioToDTO(Horario horarioToMap){
		HorarioDTO horarioDTO = null;
		if(horarioToMap != null) {
			
			horarioDTO = new HorarioDTO();
			horarioDTO.setId(horarioToMap.getId());
			horarioDTO.setHoraFin(horarioToMap.getHoraFin());
			horarioDTO.setHoraInicio(horarioToMap.getHoraInicio());
			
//			List<ReservaDTO> reservasDTO = ReservaMapper.mapListReservaToDTO(horarioToMap.getReservas());
//			horarioDTO.setReservasDTO(reservasDTO);
//	
//			List<PrestadorDTO> prestadoresDTO = PrestadorMapper.mapListPrestadorToDTO(horarioToMap.getPrestadores());
//			horarioDTO.setPrestadoresDTO(prestadoresDTO);

		}
		return horarioDTO;
	}
	
	public static Horario mapDTOToHorario(HorarioDTO horarioToMap){
		Horario horarioEntity = new Horario();
		horarioEntity.setId(horarioToMap.getId());
		horarioEntity.setHoraFin(horarioToMap.getHoraFin());
		horarioEntity.setHoraInicio(horarioToMap.getHoraInicio());
		
//		List<Reserva> reservas = ReservaMapper.mapListDTOToReserva(horarioToMap.getReservasDTO());
//		horarioEntity.setReservas(reservas);
//		
//
//		List<Prestador> prestadoresList = PrestadorMapper.mapListDTOToPrestador(horarioToMap.getPrestadoresDTO());
//		Set<Prestador> prestadoresSet = new HashSet<>(prestadoresList);
//		horarioEntity.setPrestadores(prestadoresSet);
		
		
		return horarioEntity;
	}
	
	public static List<HorarioDTO> mapListHorariosToDTO(Collection<Horario> horarios){
		Horario horario;
		HorarioDTO horarioDTOAgregar;
		List<HorarioDTO> horariosDTO = new ArrayList<HorarioDTO>();
		Iterator<Horario> it = horarios.iterator();
		while(it.hasNext()){
			horario = it.next();
			horarioDTOAgregar = HorarioMapper.mapHorarioToDTO(horario);
			horariosDTO.add(horarioDTOAgregar);
		}
		return horariosDTO;
	}
	
	public static List<Horario> mapListDTOToHorario(Collection<HorarioDTO> horariosDTO){
		List<Horario> horarios = new ArrayList<Horario>();
		if(horariosDTO != null) {
			HorarioDTO horarioDTO;
			Horario horarioAgregar;
			Iterator<HorarioDTO> it = horariosDTO.iterator();
			while(it.hasNext()){
				horarioDTO = it.next();
				horarioAgregar = HorarioMapper.mapDTOToHorario(horarioDTO);
				horarios.add(horarioAgregar);
			}
		}
		return horarios;
	}
	
}
