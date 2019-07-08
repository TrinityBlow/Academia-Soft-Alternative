package ar.com.softtek.academia.backend.dao.impl.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ar.com.academia.dto.ReservaDTO;
import ar.com.academia.entities.Reserva;


public class ReservaMapper {

	public static ReservaDTO reservaToDTO(Reserva reservaToMap){
		ReservaDTO reservaDTO = new ReservaDTO();
		return reservaDTO;
	}
	
	public static Reserva DTOToReserva(ReservaDTO reservaToMap){
		Reserva reservaEntity = new Reserva();
		return reservaEntity;
	}
	
	public static List<ReservaDTO> createReservasListDTO(List<Reserva> reservas){
		Reserva reserva;
		ReservaDTO reservaDTOAgregar;
		List<ReservaDTO> reservasDTO = new ArrayList<ReservaDTO>();
		Iterator<Reserva> it = reservas.iterator();
		while(it.hasNext()){
			reserva = it.next();
			reservaDTOAgregar = ReservaMapper.reservaToDTO(reserva);
			reservasDTO.add(reservaDTOAgregar);
		}
		return reservasDTO;
	}
	
	public static List<Reserva> createReservaList(List<ReservaDTO> reservasDTO){
		ReservaDTO reservaDTO;
		Reserva reservaAgregar;
		List<Reserva> reservas = new ArrayList<Reserva>();
		Iterator<ReservaDTO> it = reservasDTO.iterator();
		while(it.hasNext()){
			reservaDTO = it.next();
			reservaAgregar = ReservaMapper.DTOToReserva(reservaDTO);
			reservas.add(reservaAgregar);
		}
		return reservas;
	}
	
}
