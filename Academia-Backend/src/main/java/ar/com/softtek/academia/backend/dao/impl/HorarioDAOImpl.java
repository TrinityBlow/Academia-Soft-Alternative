package ar.com.softtek.academia.backend.dao.impl;


import java.util.List;


import ar.com.academia.dto.HorarioDTO;
import ar.com.academia.entities.Horario;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.dao.HorarioDAO;
import ar.com.softtek.academia.backend.dao.impl.mapper.HorarioMapper;

public class HorarioDAOImpl extends GenericDAOImpl<Horario> implements HorarioDAO {

	@Override
	public Class<Horario>getType(){
		return Horario.class;
	}

	@Override
	public List<HorarioDTO> getAllHorarios() throws PersistenceException{
		try{
			List<HorarioDTO> horariosDTO;
			List<Horario> horarios = this.getAll();
			horariosDTO = 	HorarioMapper.createHorariosListDTO(horarios);
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
			horarioDTO = HorarioMapper.horarioToDTO(horario);
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
