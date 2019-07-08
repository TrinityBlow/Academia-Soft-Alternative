package ar.com.softtek.academia.backend.dao.impl;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.entities.Socio;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.dao.SocioDAO;
import ar.com.softtek.academia.backend.dao.impl.mapper.SocioMapper;

public class SocioDAOImpl extends GenericDAOImpl<Socio> implements SocioDAO {

	@Override
	public Class<Socio>getType(){
		return Socio.class;
	}
	
	public List<SocioDTO> getAllSocios() throws PersistenceException{
		try{
			List<SocioDTO> sociosDTO;
			List<Socio> socios = this.getAll();
			sociosDTO = SocioMapper.createSociosListDTO(socios);
			return sociosDTO;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public SocioDTO getByIdSocio(int id) throws PersistenceException {
		try{
			SocioDTO socioDTO;
			Socio socio = this.getById(id);
			socioDTO = SocioMapper.socioToDTO(socio);
			return socioDTO;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public SocioDTO saveSocio(SocioDTO entidad) throws PersistenceException {
		try{
			SocioDTO socioDTOAgregado;
			Socio socioAgregar = SocioMapper.DTOToSocio(entidad);
			this.save(socioAgregar);
			socioDTOAgregado = SocioMapper.socioToDTO(socioAgregar);
			return socioDTOAgregado;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public void updateSocio(SocioDTO entidad) throws PersistenceException {
		try{
			Socio socioModificar = SocioMapper.DTOToSocio(entidad);
			this.update(socioModificar);
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
		
	}

	@Override
	public boolean deleteSocio(SocioDTO entidad) throws PersistenceException {
		try{
			Socio socioBorrar = SocioMapper.DTOToSocio(entidad);
			boolean result = this.delete(socioBorrar);
			return result;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public boolean deleteSocio(int id) throws PersistenceException {
		try{
			boolean result = this.delete(id);
			return result;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public int countSocios() throws PersistenceException {
		try{
			int result = this.count();
			return result;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SocioDTO> getAllBySexo(String sexo) throws PersistenceException {
		List<SocioDTO> resultsDTO;
		List<Socio> resultsSocios;
		Session session = this.getSessionFactory().openSession();
		
		session.beginTransaction();
    	Criteria criteria = session.createCriteria(getType());
    	criteria.add(Restrictions.like("sexo", sexo));
    	resultsSocios = (List<Socio>)criteria.list();
		session.close();
	    
		resultsDTO = SocioMapper.createSociosListDTO(resultsSocios);
		
		return resultsDTO;
	}
	
	/*
	@Override
	public List<SocioDTO> getAllBySexo(String sexo) throws PersistenceException {
		List<SocioDTO> resultsDTO;
		final String sexoF = sexo;
	    @SuppressWarnings({ "unchecked", "rawtypes" })
	    List<Socio> results = (List<Socio>) this.getHibernateTemplate().execute(new HibernateCallback() {
	        public Object doInHibernate(Session session) throws HibernateException, SQLException {
	        	Criteria criteria = session.createCriteria(getType());
	        	criteria.add(Restrictions.like("nombre", sexoF));
	        	return criteria.list();
	            }
	        });
	    resultsDTO = this.createListSociosDTO(results);
	    
		return resultsDTO;
	}
*/
	
	
}
