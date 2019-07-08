package ar.com.softtek.academia.web.mock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ar.com.academia.entities.Socio;

public class MockList {

	static private MockList instancia;
	private List<Socio> socios;

	static public MockList getMockList() {

		if (instancia == null) {
			instancia = new MockList();
			instancia.init();
		}
		return instancia;
	}

	private void init() {
		socios = new ArrayList<Socio>();
	}
	private MockList() {
		
		super();
	}

	public void setSocios(List<Socio> socios) {
		this.socios = socios;
	}

	// metodos utilizados para la lista mock

	public List<Socio> getSocios() {
		return socios;
	}

	public void addSocio(Socio socio) {
		socios.add(socio);
	}

	public void deleteSocio(Socio socio) {
		for (Iterator<Socio> iterator = socios.iterator(); iterator.hasNext(); ) {
			Socio soc = iterator.next();
			if (soc.getNumeroSocio() == socio.getNumeroSocio()) {
				iterator.remove();
			}
		}
	}
	
	public Socio getSocio(Socio socio) {
		for (Socio soc : socios) {
			if (soc.getNumeroSocio() == socio.getNumeroSocio()) {
				return soc;
			}			
		}
		return null;
	}

	public void saveOrUpdateSocio(Socio socio) {
		for (int i = 0; i<socios.size();i++){ 
			Socio soc= socios.get(i);
			if (soc.getNumeroSocio() == socio.getNumeroSocio()) {
				socios.set(i, socio);
				return;
			}
		}
		socios.add(socio);
	}

}
