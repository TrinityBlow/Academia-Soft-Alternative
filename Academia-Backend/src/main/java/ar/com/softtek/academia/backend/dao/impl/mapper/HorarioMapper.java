package ar.com.softtek.academia.backend.dao.impl.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ar.com.academia.dto.HorarioDTO;
import ar.com.academia.entities.Horario;

public class HorarioMapper {

	public static HorarioDTO horarioToDTO(Horario horarioToMap){
		HorarioDTO horarioDTO = new HorarioDTO();
		return horarioDTO;
	}
	
	public static Horario DTOToHorario(HorarioDTO horarioToMap){
		Horario horarioEntity = new Horario();
		return horarioEntity;
	}
	
	public static List<HorarioDTO> createHorariosListDTO(List<Horario> horarios){
		Horario horario;
		HorarioDTO horarioDTOAgregar;
		List<HorarioDTO> horariosDTO = new ArrayList<HorarioDTO>();
		Iterator<Horario> it = horarios.iterator();
		while(it.hasNext()){
			horario = it.next();
			horarioDTOAgregar = HorarioMapper.horarioToDTO(horario);
			horariosDTO.add(horarioDTOAgregar);
		}
		return horariosDTO;
	}
	
	public static List<Horario> createHorarioList(List<HorarioDTO> horariosDTO){
		HorarioDTO horarioDTO;
		Horario horarioAgregar;
		List<Horario> horarios = new ArrayList<Horario>();
		Iterator<HorarioDTO> it = horariosDTO.iterator();
		while(it.hasNext()){
			horarioDTO = it.next();
			horarioAgregar = HorarioMapper.DTOToHorario(horarioDTO);
			horarios.add(horarioAgregar);
		}
		return horarios;
	}
	
}
