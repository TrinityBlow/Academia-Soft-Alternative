package ar.com.softtek.academia.backend.dao.impl;

import java.util.ArrayList;
import java.util.List;

import ar.com.academia.entities.Socio;
import ar.com.softtek.academia.backend.dao.GenericDAO;

public class MockSocioDAO implements GenericDAO<Socio> {

	private List<Socio> lista;
	private int cantidadElementos;

	public MockSocioDAO() {
		super();
		this.crearSocios();
	}

	private void crearSocios() {
		lista = new ArrayList<Socio>();
		Socio socio;
		for (int i = 0; i < cantidadElementos; i++) {
			socio = new Socio();
			socio.setNombre("socio" + i);
			socio.setId(i);
			socio.setNumeroSocio(i);
			lista.add(socio);
		}
	}

	public List<Socio> getAll() {
		return lista;
	}

	public Socio getById(int id) {
		for (Socio socio : lista) {
			if (socio.getId() == id) {
				return socio;
			}
		}
		return null;
	}

	public void save(Socio socio) {
		lista.add(socio);
	}

	public void update(Socio socio) {
		for (Socio s : lista) {
			if (s.getId() == socio.getId()) {
				s = socio;
			}
		}
	}

	public boolean delete(Socio socio) {
		return delete(socio.getId());
	}

	public boolean delete(int id) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				lista.remove(i);
				return true;
			}
		}
		return false;
	}

	public int count() {
		return lista.size();
	}

	public int getCantidadElementos() {
		return cantidadElementos;
	}

	public void setCantidadElementos(int cantidadElementos) {
		this.cantidadElementos = cantidadElementos;
	}

	public void resetLista() {
		this.crearSocios();
	}
}
