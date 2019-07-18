package ar.com.softtek.academia.backend.dao.impl.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import ar.com.academia.dto.PracticaDTO;
import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.dto.ReservaDTO;
import ar.com.academia.dto.SocioDTO;
import ar.com.academia.dto.TurnoDTO;
import ar.com.academia.entities.Practica;
import ar.com.academia.entities.Prestador;
import ar.com.academia.entities.Reserva;
import ar.com.academia.entities.Socio;
import ar.com.academia.entities.Turno;

public class TurnoMapper {
	
	public static TurnoDTO mapTurnoToDTO(Turno turnoToMap){
		TurnoDTO turnoDTO = null;
		if(turnoToMap != null) {
			turnoDTO = new TurnoDTO();
			turnoDTO.setId(turnoToMap.getId());
			turnoDTO.setImporteDelTurno(turnoToMap.getImporteDelTurno());
			turnoDTO.setObservaciones(turnoToMap.getObservaciones());

			PrestadorDTO prestadorDTO = PrestadorMapper.mapPrestadorToDTOSimple(turnoToMap.getPrestador());
			turnoDTO.setPrestadorDTO(prestadorDTO);
			
			ReservaDTO reservaDTO = ReservaMapper.mapReservaToDTO(turnoToMap.getReserva());
			turnoDTO.setReservaDTO(reservaDTO);
			
			SocioDTO socioDTO = SocioMapper.mapSocioToDTOSimple(turnoToMap.getSocio());
			turnoDTO.setSocioDTO(socioDTO);
			
			PracticaDTO practicaDTO = PracticaMapper.mapPracticaToDTO(turnoToMap.getPractica());
			turnoDTO.setPracticaDTO(practicaDTO);
			
		}		
		return turnoDTO;
	}
	
	
	public static Turno mapDTOToTurno(TurnoDTO turnoToMap){
		Turno turnoEntity = null;
		if(turnoToMap != null) {
			turnoEntity = new Turno();
			turnoEntity.setId(turnoToMap.getId());
			turnoEntity.setImporteDelTurno(turnoToMap.getImporteDelTurno());
			turnoEntity.setObservaciones(turnoToMap.getObservaciones());

			
			Prestador prestador = PrestadorMapper.mapDTOToPrestador(turnoToMap.getPrestadorDTO());
			turnoEntity.setPrestador(prestador);
			
			Reserva reserva = ReservaMapper.mapDTOToReserva(turnoToMap.getReservaDTO());
			turnoEntity.setReserva(reserva);
			reserva.setTurno(turnoEntity);
			
			Socio socio = SocioMapper.mapDTOToSocio(turnoToMap.getSocioDTO());
			turnoEntity.setSocio(socio);

			Practica practica = PracticaMapper.mapDTOToPractica(turnoToMap.getPracticaDTO());
			turnoEntity.setPractica(practica);
			
			
		}
		return turnoEntity;
	}
	

	
	public static List<TurnoDTO> mapListTurnoToDTO(List<Turno> turnos){
		List<TurnoDTO> turnosDTO = new ArrayList<TurnoDTO>();
		if(turnos != null){
			Turno turno;
			TurnoDTO turnoDTOAgregar;
			Iterator<Turno> it = turnos.iterator();
			while(it.hasNext()){
				turno = it.next();
				if(turno != null){
					turnoDTOAgregar = TurnoMapper.mapTurnoToDTO(turno);
					turnosDTO.add(turnoDTOAgregar);
				}
			}
		}
		return turnosDTO;
	}
	
	public static List<Turno> mapListDTOToTurno(Collection<TurnoDTO> turnosDTO){
		List<Turno> turnos = new ArrayList<Turno>();
		if(turnosDTO != null){
			TurnoDTO turnoDTO;
			Turno turnoAgregar;
			Iterator<TurnoDTO> it = turnosDTO.iterator();
			while(it.hasNext()){
				turnoDTO = it.next();
				turnoAgregar = TurnoMapper.mapDTOToTurno(turnoDTO);
				turnos.add(turnoAgregar);
			}	
		}
		return turnos;
	}
	
	public static TurnoDTO mapTurnoToDTOSimple(Turno turnoToMap){
		TurnoDTO turnoDTO = null;
		if(turnoToMap != null) {
			turnoDTO = new TurnoDTO();
			turnoDTO.setId(turnoToMap.getId());
			turnoDTO.setImporteDelTurno(turnoToMap.getImporteDelTurno());
			turnoDTO.setObservaciones(turnoToMap.getObservaciones());
		}		
		return turnoDTO;
	}
	
	public static List<TurnoDTO> mapListTurnoToDTOSimple(Collection<Turno> turnos){
		List<TurnoDTO> turnosDTO = new ArrayList<TurnoDTO>();
		if(turnos != null){
			Turno turno;
			TurnoDTO turnoDTOAgregar;
			Iterator<Turno> it = turnos.iterator();
			while(it.hasNext()){
				turno = it.next();
				turnoDTOAgregar = TurnoMapper.mapTurnoToDTOSimple(turno);
				turnosDTO.add(turnoDTOAgregar);
			}
		}
		return turnosDTO;
	}
	
}
