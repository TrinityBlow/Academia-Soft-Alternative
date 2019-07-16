package ar.com.softtek.academia.backend.dao.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import ar.com.academia.dto.HorarioDTO;
import ar.com.academia.dto.PracticaDTO;
import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.entities.Horario;
import ar.com.academia.entities.Practica;
import ar.com.academia.entities.Prestador;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.dao.HorarioDAO;
import ar.com.softtek.academia.backend.dao.PracticaDAO;
import ar.com.softtek.academia.backend.dao.PrestadorDAO;
import ar.com.softtek.academia.backend.dao.impl.mapper.PrestadorMapper;

public class PrestadorDAOImpl extends GenericDAOImpl<Prestador> implements PrestadorDAO {


	
	@Override
	public Class<Prestador>getType(){
		return Prestador.class;
	}
	


	private List<PrestadorDTO> createListPrestadoresDTO(List<Prestador> prestadores){
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

	public List<PrestadorDTO> getAllPrestadores() throws PersistenceException{
		try{
			List<PrestadorDTO> prestadoresDTO;
			List<Prestador> prestadores = this.getAll();
			prestadoresDTO = createListPrestadoresDTO(prestadores);
			return prestadoresDTO;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public PrestadorDTO getByIdPrestador(int id) throws PersistenceException {
		try{
			PrestadorDTO prestadorDTO;
			Prestador prestador = this.getById(id);
			prestadorDTO = PrestadorMapper.mapPrestadorToDTO(prestador);
			return prestadorDTO;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public PrestadorDTO savePrestador(Prestador entidad) throws PersistenceException {
		try{
			PrestadorDTO prestadorDTOAgregado;
			this.save(entidad);
			prestadorDTOAgregado = PrestadorMapper.mapPrestadorToDTO(entidad);
			return prestadorDTOAgregado;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public void updatePrestador(PrestadorDTO entidad) throws PersistenceException {
		try{
			Prestador prestadorModificar = PrestadorMapper.mapDTOToPrestador(entidad);
			this.update(prestadorModificar);
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
		
	}

	@Override
	public boolean deletePrestador(PrestadorDTO entidad) throws PersistenceException {
		try{
			Prestador prestadorBorrar = PrestadorMapper.mapDTOToPrestador(entidad);
			boolean result = this.delete(prestadorBorrar);
			return result;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public boolean deletePrestador(int id) throws PersistenceException {
		try{
			boolean result = this.delete(id);
			return result;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public int countPrestadores() throws PersistenceException {
		try{
			int result = this.count();
			return result;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}
	
	
}
