package ar.com.softtek.academia.backend.dao.impl;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


import ar.com.academia.dto.TurnoDTO;
import ar.com.academia.entities.Practica;
import ar.com.academia.entities.Turno;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.dao.TurnoDAO;
import ar.com.softtek.academia.backend.dao.impl.mapper.TurnoMapper;

public class TurnoDAOImpl extends GenericDAOImpl<Turno> implements TurnoDAO {

	@Override
	public Class<Turno>getType(){
		return Turno.class;
	}
	
	private List<TurnoDTO> createListTurnosDTO(List<Turno> turnos){
		Turno turno;
		TurnoDTO turnoDTOAgregar;
		List<TurnoDTO> turnoDTO = new ArrayList<TurnoDTO>();
		Iterator<Turno> it = turnos.iterator();
		while(it.hasNext()){
			turno = it.next();
			turnoDTOAgregar = TurnoMapper.mapTurnoToDTO(turno);
			turnoDTO.add(turnoDTOAgregar);
		}
		return turnoDTO;
	}

	public List<TurnoDTO> getAllTurnos() throws PersistenceException{
		try{
			List<TurnoDTO> turnosDTO;
			List<Turno> turnos = this.getAll();
			turnosDTO = createListTurnosDTO(turnos);
			return turnosDTO;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}
	
	@Override
	public TurnoDTO getByIdTurno(int id) throws PersistenceException {
		try{
			TurnoDTO turnoDTO;
			Turno turno = this.getById(id);
			turnoDTO = TurnoMapper.mapTurnoToDTO(turno);
			return turnoDTO;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public TurnoDTO saveTurno(Turno entidad) throws PersistenceException {
		try{
			TurnoDTO turnoDTOAgregado;
			this.save(entidad);
			turnoDTOAgregado = TurnoMapper.mapTurnoToDTO(entidad);
			return turnoDTOAgregado;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public void updateTurno(TurnoDTO entidad) throws PersistenceException {
		try{
			Turno turnoModificar = TurnoMapper.mapDTOToTurno(entidad);
			this.update(turnoModificar);
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
		
	}

	@Override
	public boolean deleteTurno(TurnoDTO entidad) throws PersistenceException {
		try{
			Turno turnoBorrar = TurnoMapper.mapDTOToTurno(entidad);
			boolean result = this.delete(turnoBorrar);
			return result;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public boolean deleteTurno(int id) throws PersistenceException {
		try{
			boolean result = this.delete(id);
			return result;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public int countTurnos() throws PersistenceException {
		try{
			int result = this.count();
			return result;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}
}
