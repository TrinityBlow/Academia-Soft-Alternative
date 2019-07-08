package ar.com.softtek.academia.backend.dao.impl.mapper;

import ar.com.academia.dto.TurnoDTO;
import ar.com.academia.entities.Turno;

public class TurnoMapper {
	
	public static TurnoDTO turnoToDTO(Turno turnoToMap){
		TurnoDTO turnoDTO = new TurnoDTO();
		turnoDTO.setId(turnoToMap.getId());
//		turnoDTO.setEspecialidad(turnoToMap.getEspecialidad());
//		turnoDTO.setFecha(turnoToMap.getFecha());
//		turnoDTO.setPrestacion(turnoToMap.getPrestacion());
		return turnoDTO;
	}
	
	public static Turno DTOToTurno(TurnoDTO turnoToMap){
		Turno turnoEntity = new Turno();
		turnoEntity.setId(turnoToMap.getId());
//		turnoEntity.setEspecialidad(turnoToMap.getEspecialidad());
//		turnoEntity.setFecha(turnoToMap.getFecha());
//		turnoEntity.setPrestacion(turnoToMap.getPrestacion());
		return turnoEntity;
	}
	
}
