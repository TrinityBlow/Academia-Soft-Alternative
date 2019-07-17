package ar.com.softtek.academia.backend.dao;

import java.util.List;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.entities.Socio;
import ar.com.academia.entities.exception.PersistenceException;

public interface SocioDAO extends GenericDAO<Socio> {


	public List<SocioDTO> getAllSocios() throws PersistenceException;
	public List<SocioDTO> getAllBySexo(String sexo) throws PersistenceException;
	public List<SocioDTO> buscarSocios(String nombreB,String apellidoB, int dniB,int nroAfiB) throws PersistenceException;
	
	public SocioDTO getByIdSocio(int id) throws PersistenceException;
	public SocioDTO saveSocio(SocioDTO entidad) throws PersistenceException;
	
	public void updateSocio(SocioDTO entidad) throws PersistenceException;
	
	public boolean deleteSocio(SocioDTO entidad) throws PersistenceException;	
	public boolean deleteSocio(int id) throws PersistenceException;

	public int countSocios() throws PersistenceException;
	
}
