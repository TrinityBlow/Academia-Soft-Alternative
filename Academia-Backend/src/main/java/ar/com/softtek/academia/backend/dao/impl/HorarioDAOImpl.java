package ar.com.softtek.academia.backend.dao.impl;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


import ar.com.academia.dto.HorarioDTO;
import ar.com.academia.dto.PlanDTO;
import ar.com.academia.entities.Horario;
import ar.com.academia.entities.Plan;
import ar.com.academia.entities.Practica;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.dao.HorarioDAO;
import ar.com.softtek.academia.backend.dao.impl.mapper.HorarioMapper;
import ar.com.softtek.academia.backend.dao.impl.mapper.PlanMapper;

public class HorarioDAOImpl extends GenericDAOImpl<Horario> implements HorarioDAO {

	@Override
	public Class<Horario>getType(){
		return Horario.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HorarioDTO> getAllHorarios() throws PersistenceException{
		try{
			List<HorarioDTO> horariosDTO;
			List<Horario> horarios = this.getAll();
			horariosDTO = HorarioMapper.mapListHorariosToDTO(horarios);
			return horariosDTO;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public HorarioDTO getByIdHorario(int id) throws PersistenceException {
		try{
			HorarioDTO horarioDTO;
			Horario horario = this.getById(id);
			horarioDTO = HorarioMapper.mapHorarioToDTO(horario);
			return horarioDTO;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}


	@Override
	public int countHorarios() throws PersistenceException {
		try{
			int result = this.count();
			return result;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}
}
