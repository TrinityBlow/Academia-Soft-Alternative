package ar.com.softtek.academia.backend.dao;

import java.util.List;

import ar.com.academia.entities.exception.PersistenceException;

public interface GenericDAO<T> {
	
	List<T> getAll() throws PersistenceException;

	T getById(int id) throws PersistenceException;

	void save(T entidad) throws PersistenceException;
	
	void update(T entidad) throws PersistenceException;
	
	boolean delete(T entidad) throws PersistenceException;
	
	boolean delete(int id) throws PersistenceException;
	
	public int count() throws PersistenceException;

}

