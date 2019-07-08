package ar.com.softtek.academia.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.dao.GenericDAO;

public class GenericDAOImpl<T> extends HibernateDaoSupport implements GenericDAO<T>{

	private Class<T>type=null;
	
	public Class<T> getType() {
		return type;
	}
	
	public void setType(Class<T> type) {
		this.type = type;
	}
	
	@Override
	public boolean delete(int id) throws PersistenceException {
		try{
			T elemento = this.getHibernateTemplate().get(this.getType(), id);
			this.getHibernateTemplate().delete(elemento);
			return true;
		}catch(DataAccessException e){
			throw new PersistenceException();
		}
	}
	
	@Override
	public int count() throws PersistenceException {
		try{
			Long result;
			Session session = this.getSessionFactory().openSession();
			
			session.beginTransaction();
	    	Criteria criteria = session.createCriteria(getType());
        	criteria.setProjection(Projections.rowCount());
	    	result = (Long) criteria.uniqueResult();
			session.close();
			
	        return result.intValue();
		}catch(DataAccessException e){
			throw new PersistenceException();
		}
	}
	
	@Override
	public void update(T entidad) throws PersistenceException {
		try{
			this.getHibernateTemplate().update(entidad);
		}catch(DataAccessException e){
			throw new PersistenceException();
		}
		
	}
	
	@Override
	public boolean delete(T entidad) throws PersistenceException {
		try{
			this.getHibernateTemplate().delete(entidad);
			return true;
		}catch(DataAccessException e){
			throw new PersistenceException();
		}
	}
	
	@Override
	public List<T> getAll() throws PersistenceException {
		try{
			List<T> result = this.getHibernateTemplate().loadAll(this.getType());
			return result;
		}catch(DataAccessException e){
			throw new PersistenceException();
		}
	}
	
	@Override
	public T getById(int id) throws PersistenceException {
		try{
			T result = this.getHibernateTemplate().get(this.getType(), id);
			return result;
		}catch(DataAccessException e){
			throw new PersistenceException();
		}
	}
	
	@Override
	public void save(T entidad) throws PersistenceException {
		try{
			this.getHibernateTemplate().save(entidad);
		}catch(DataAccessException e){
			throw new PersistenceException();
		}
		
	}
	
		
	/*
	@Override
	public int count() throws PersistenceException {
		try{
			
		    @SuppressWarnings({ "unchecked", "rawtypes" })
		    Long result = (Long) this.getHibernateTemplate().execute(new HibernateCallback() {
		        public Object doInHibernate(Session session) throws HibernateException, SQLException {
		        	Criteria criteria = session.createCriteria(getType());
		        	criteria.setProjection(Projections.rowCount());
		        	return criteria.uniqueResult();
		            }
		        });
	        return result.intValue();
		}catch(DataAccessException e){
			throw new PersistenceException();
		}
	}
	*/
}
