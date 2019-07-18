package ar.com.softtek.academia.backend.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.entities.Plan;
import ar.com.academia.entities.Socio;
import ar.com.academia.entities.Turno;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.dao.PlanDAO;
import ar.com.softtek.academia.backend.dao.SocioDAO;
import ar.com.softtek.academia.backend.dao.TurnoDAO;
import ar.com.softtek.academia.backend.dao.impl.mapper.SocioMapper;

//Hibernate.initialize(proxy);

public class SocioDAOImpl extends GenericDAOImpl<Socio> implements SocioDAO {

	final static Logger logger = Logger.getLogger(SocioDAOImpl.class);
	
	
	private PlanDAO planDAO;
	private TurnoDAO turnoDAO;
	
	public PlanDAO getPlanDAO() {
		return planDAO;
	}

	
	
	public TurnoDAO getTurnoDAO() {
		return turnoDAO;
	}



	public void setTurnoDAO(TurnoDAO turnoDAO) {
		this.turnoDAO = turnoDAO;
	}



	public void setPlanDAO(PlanDAO planDAO) {
		this.planDAO = planDAO;
	}

	@Override
	public Class<Socio> getType() {
		return Socio.class;
	}

	public List<SocioDTO> getAllSocios() throws PersistenceException {
		try {

			List<SocioDTO> sociosDTO;
			List<Socio> socios = this.getAll();
			sociosDTO = SocioMapper.mapListSocioToDTO(socios);

			return sociosDTO;
		} catch (PersistenceException e) {
			throw new PersistenceException();
		}
	}

	@Override
	public SocioDTO getByIdSocio(int id) throws PersistenceException {
		try {
			SocioDTO socioDTO;
			Socio socio = this.getById(id);
			socioDTO = SocioMapper.mapSocioToDTO(socio);
			return socioDTO;
		} catch (PersistenceException e) {
			throw new PersistenceException();
		}
	}

	@Override
	public SocioDTO saveSocio(Socio entidad) throws PersistenceException {
		try {
			SocioDTO socioDTOAgregado;
			this.save(entidad);
			socioDTOAgregado = SocioMapper.mapSocioToDTO(entidad);
			return socioDTOAgregado;
		} catch (PersistenceException e) {
			logger.error("Error de persistencia: " , e);
			throw new PersistenceException();
		}
	}

	@Override
	public void updateSocio(SocioDTO entidad) throws PersistenceException {
		try{
			Plan plan = planDAO.getById(entidad.getPlanDTO().getId());
			Socio socioModificar = this.getById(entidad.getId());
			
			socioModificar.setNombre(entidad.getNombre());
			socioModificar.setApellido(entidad.getApellido());
			socioModificar.setDireccion(entidad.getDireccion());
			socioModificar.setCantidadHijos(entidad.getCantidadHijos());
			socioModificar.setDni(entidad.getDni());
			socioModificar.setEstadoCivil(entidad.getEstadoCivil());
			socioModificar.setEmail(entidad.getEmail());
			socioModificar.setTelefono(entidad.getTelefono());
			socioModificar.setSexo(entidad.getSexo());
			socioModificar.setNombreConyuge(entidad.getNombreConyuge());
			
			socioModificar.setPlan(plan);
			
			
			this.update(socioModificar);
		} catch (PersistenceException e){
			throw new PersistenceException();
		} 
		
	}

	@Override
	public boolean deleteSocio(SocioDTO entidad) throws PersistenceException {
		try {
			Socio socioBorrar = SocioMapper.mapDTOToSocio(entidad);
			boolean result = this.delete(socioBorrar);
			return result;
		} catch (PersistenceException e) {
			throw new PersistenceException();
		}
	}

	@Override
	public boolean deleteSocio(int id) throws PersistenceException {
		try {
			Socio entidad = this.getById(id);
			List<Turno> turnos = entidad.getTurnos();
			for(Turno turno :turnos){
				turnoDAO.deleteTurno(turno.getId());
			}
			boolean result = this.delete(id);
			return result;
		} catch (PersistenceException e) {
			throw new PersistenceException();
		}
	}

	@Override
	public int countSocios() throws PersistenceException {
		try {
			int result = this.count();
			return result;
		} catch (PersistenceException e) {
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
		resultsSocios = (List<Socio>) criteria.list();
		
		
		session.close();

		resultsDTO = SocioMapper.mapListSocioToDTO(resultsSocios);

		return resultsDTO;
	}
	
	@Override
	public List<SocioDTO> buscarSocios(String nombreB, String apellidoB, String dniB, int nroAfiB) throws PersistenceException {

		List<SocioDTO> resultsDTO;
		List<Socio> resultsSocios;
		
		String nombreBString = "%" + dniB + "%";
		String apellidoBString = "%" + dniB + "%";
		String dniString = "%" + dniB + "%";

		Session session = this.getSessionFactory().openSession();
		session.beginTransaction();
			String hql =
						"FROM Socio as s" + 
						" WHERE s.nombre LIKE :nombreB" +
						" AND s.apellido LIKE :apellidoB" +
						" AND s.dni LIKE :dni";
			Query query = (Query) session.createQuery(hql);
			query.setParameter("nombreB", nombreBString);
			query.setParameter("apellidoB", apellidoBString);
			query.setParameter("dni", dniString);
			resultsSocios = (List<Socio>) query.list();
		session.close();
		
		resultsDTO = SocioMapper.mapListSocioToDTO(resultsSocios);
		
		return resultsDTO; 
	}
	
}
