package ar.com.softtek.academia.backend.dao.impl.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import ar.com.academia.dto.ReservaDTO;
import ar.com.academia.entities.Horario;
import ar.com.academia.entities.Reserva;
import ar.com.academia.entities.Turno;


public class ReservaMapper {

	public static ReservaDTO mapReservaToDTO(Reserva reservaToMap){
		ReservaDTO reservaDTO = null;		
		if(reservaToMap != null) {
			reservaDTO = new ReservaDTO();	
			reservaDTO.setId(reservaToMap.getId());
			reservaDTO.setFecha(reservaToMap.getFecha());	
		}
		
		return reservaDTO;
	}
	
	public static Reserva mapDTOToReserva(ReservaDTO reservaToMap){
		Reserva reservaEntity = null;		
		if(reservaToMap != null) {
			reservaEntity = new Reserva();		
			reservaEntity.setId(reservaToMap.getId());
			reservaEntity.setFecha(reservaToMap.getFecha());
		
		Horario horario = HorarioMapper.mapDTOToHorario(reservaToMap.getHorarioDTO());
		reservaEntity.setHorario(horario);
		
		Turno turno = TurnoMapper.mapDTOToTurno(reservaToMap.getTurnoDTO());
		reservaEntity.setTurno(turno);
		}
		
		return reservaEntity;
	}
	
	public static List<ReservaDTO> mapListReservaToDTO(Collection<Reserva> reservas){
		Reserva reserva;
		ReservaDTO reservaDTOAgregar;
		List<ReservaDTO> reservasDTO = new ArrayList<ReservaDTO>();
		Iterator<Reserva> it = reservas.iterator();
		while(it.hasNext()){
			reserva = it.next();
			reservaDTOAgregar = ReservaMapper.mapReservaToDTO(reserva);
			reservasDTO.add(reservaDTOAgregar);
		}
		return reservasDTO;
	}
	
	public static List<Reserva> mapListDTOToReserva(Collection<ReservaDTO> reservasDTO){
		ReservaDTO reservaDTO;
		Reserva reservaAgregar;
		List<Reserva> reservas = new ArrayList<Reserva>();
		Iterator<ReservaDTO> it = reservasDTO.iterator();
		while(it.hasNext()){
			reservaDTO = it.next();
			reservaAgregar = ReservaMapper.mapDTOToReserva(reservaDTO);
			reservas.add(reservaAgregar);
		}
		return reservas;
	}
	
}
