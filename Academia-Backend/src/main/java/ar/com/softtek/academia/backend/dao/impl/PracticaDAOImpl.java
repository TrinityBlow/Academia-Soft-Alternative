package ar.com.softtek.academia.backend.dao.impl;


import java.util.List;
import java.util.Set;


import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import ar.com.academia.dto.PracticaDTO;
import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.entities.Practica;
import ar.com.academia.entities.Prestador;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.dao.PracticaDAO;
import ar.com.softtek.academia.backend.dao.impl.mapper.PracticaMapper;
import ar.com.softtek.academia.backend.dao.impl.mapper.PrestadorMapper;


public class PracticaDAOImpl extends GenericDAOImpl<Practica> implements PracticaDAO {

	@Override
	public Class<Practica>getType(){
		return Practica.class;
	}

	@Override
	public List<PracticaDTO> getAllPracticas() throws PersistenceException{
		try{
			List<PracticaDTO> practicasDTO;
			List<Practica> practicas = this.getAll();
			practicasDTO = PracticaMapper.mapListPracticaToDTO(practicas);
			return practicasDTO;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}

	@Override
	public PracticaDTO getByIdPractica(int id) throws PersistenceException {
		try{
			PracticaDTO practicaDTO;
			Practica practica = this.getById(id);
			practicaDTO = PracticaMapper.mapPracticaToDTO(practica);
			return practicaDTO;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}


	@Override
	public int countPracticas() throws PersistenceException {
		try{
			int result = this.count();
			return result;
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public List<PrestadorDTO> getPrestadores(int id) throws PersistenceException {
		List<PrestadorDTO> prestadoresDTO;
		Practica practica; 
		Set<Prestador> resultsPrestadores;
		Session session = this.getSessionFactory().openSession();
		
		session.beginTransaction();
		
    	Criteria criteria = session.createCriteria(getType());
    	criteria.add(Restrictions.eq("id", id));
    	practica = (Practica) criteria.uniqueResult();
    	Hibernate.initialize(practica.getPrestadores());
    	resultsPrestadores = practica.getPrestadores();

		session.close();
	    
		prestadoresDTO = PrestadorMapper.mapListPrestadorToDTO(resultsPrestadores);
		return prestadoresDTO; 
	}
	

//	@SuppressWarnings("unchecked")
//	@Override
//	public List<PrestadorDTO> getPrestadores(int id) throws PersistenceException {
//		Session session = this.getSessionFactory().openSession();
//		session.beginTransaction();
//		String hql = "FROM Prestador PR INNER JOIN PR.practicas P WHERE P.id = :id";
//		Query query = (Query) session.createQuery(hql);
//		query.setParameter("id", id); 
//		List<Prestador> prestadores = query.list();
//		session.close();
//		
//		List<PrestadorDTO> prestadoresDTO = PrestadorMapper.mapListPrestadorToDTO(prestadores);
//		return prestadoresDTO; 
//	}
	

//	String hql = "FROM PRESTADOR_PRACTICA PP inner join PRESTADOR P on (PP.ID_PRESTADOR = P.ID_PRESTADOR) WHERE PP.ID_PRACTICA = :id";
	
}
