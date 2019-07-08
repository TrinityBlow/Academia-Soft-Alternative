package ar.com.softtek.academia.backend.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.entities.Prestador;
import ar.com.academia.entities.exception.PersistenceException;
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
			prestadorDTOAgregar = PrestadorMapper.prestadorToDTO(prestador);
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
			prestadorDTO = PrestadorMapper.prestadorToDTO(prestador);
			return prestadorDTO;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public PrestadorDTO savePrestador(PrestadorDTO entidad) throws PersistenceException {
		try{
			PrestadorDTO prestadorDTOAgregado;
			Prestador prestadorAgregar = PrestadorMapper.DTOToPrestador(entidad);
			this.save(prestadorAgregar);
			prestadorDTOAgregado = PrestadorMapper.prestadorToDTO(prestadorAgregar);
			return prestadorDTOAgregado;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public void updatePrestador(PrestadorDTO entidad) throws PersistenceException {
		try{
			Prestador prestadorModificar = PrestadorMapper.DTOToPrestador(entidad);
			this.update(prestadorModificar);
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
		
	}

	@Override
	public boolean deletePrestador(PrestadorDTO entidad) throws PersistenceException {
		try{
			Prestador prestadorBorrar = PrestadorMapper.DTOToPrestador(entidad);
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
