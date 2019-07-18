package ar.com.softtek.academia.backend.bo.impl;

import java.util.List;

import ar.com.academia.dto.TurnoDTO;
import ar.com.academia.dto.service.TurnoServiceDTO;
import ar.com.academia.entities.Horario;
import ar.com.academia.entities.Practica;
import ar.com.academia.entities.Prestador;
import ar.com.academia.entities.Reserva;
import ar.com.academia.entities.Socio;
import ar.com.academia.entities.Turno;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.bo.ReservaBO;
import ar.com.softtek.academia.backend.bo.TurnoBO;
import ar.com.softtek.academia.backend.dao.HorarioDAO;
import ar.com.softtek.academia.backend.dao.PracticaDAO;
import ar.com.softtek.academia.backend.dao.PrestadorDAO;
import ar.com.softtek.academia.backend.dao.ReservaDAO;
import ar.com.softtek.academia.backend.dao.SocioDAO;
import ar.com.softtek.academia.backend.dao.TurnoDAO;

public class TurnoBOImpl implements TurnoBO{
	
	private TurnoDAO turnoDAO;
	private ReservaBO reservaBO;
	private ReservaDAO reservaDAO;
	private HorarioDAO horarioDAO;
	private PrestadorDAO prestadorDAO;
	private PracticaDAO practicaDAO;
	private SocioDAO socioDAO;
	

	

	public ReservaDAO getReservaDAO() {
		return reservaDAO;
	}

	public void setReservaDAO(ReservaDAO reservaDAO) {
		this.reservaDAO = reservaDAO;
	}

	public HorarioDAO getHorarioDAO() {
		return horarioDAO;
	}

	public void setHorarioDAO(HorarioDAO horarioDAO) {
		this.horarioDAO = horarioDAO;
	}

	public PrestadorDAO getPrestadorDAO() {
		return prestadorDAO;
	}

	public void setPrestadorDAO(PrestadorDAO prestadorDAO) {
		this.prestadorDAO = prestadorDAO;
	}

	public PracticaDAO getPracticaDAO() {
		return practicaDAO;
	}

	public void setPracticaDAO(PracticaDAO practicaDAO) {
		this.practicaDAO = practicaDAO;
	}

	public SocioDAO getSocioDAO() {
		return socioDAO;
	}

	public void setSocioDAO(SocioDAO socioDAO) {
		this.socioDAO = socioDAO;
	}

	public ReservaBO getReservaBO() {
		return reservaBO;
	}

	public void setReservaBO(ReservaBO reservaBO) {
		this.reservaBO = reservaBO;
	}

	public TurnoDAO getTurnoDAO() {
		return turnoDAO;
	}

	public TurnoDTO getTurnoById(int id) throws BusinessException {
		try{
			TurnoDTO turno = turnoDAO.getByIdTurno(id);
			return	turno;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public void actualizarTurno(TurnoDTO entidad) throws BusinessException {
		try{
			turnoDAO.updateTurno(entidad);
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public TurnoDTO crearTurno(TurnoServiceDTO entidad) throws BusinessException {
		try{
			Reserva reserva = new Reserva();
			Turno turnoAgregar = new Turno();
			
			Socio socio = socioDAO.getById(entidad.getSocioId());
			Practica practica = practicaDAO.getById(entidad.getPracticaId());
			Prestador prestador = prestadorDAO.getById(entidad.getPrestadorId());
			Horario horario = horarioDAO.getById(entidad.getHorarioId());
			
			reserva.setFecha(entidad.getFecha());
			reserva.setHorario(horario);
			
			turnoAgregar.setImporteDelTurno(entidad.getImporte());
			turnoAgregar.setObservaciones(entidad.getObservaciones());
			
			turnoAgregar.setSocio(socio);
			turnoAgregar.setPractica(practica);
			turnoAgregar.setPrestador(prestador);
			turnoAgregar.setReserva(reserva);
			reserva.setTurno(turnoAgregar);

			TurnoDTO turnoDTOAgregado = turnoDAO.saveTurno(turnoAgregar);
			return turnoDTOAgregado;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
		
	}

	public boolean borrarTurno(TurnoDTO entidad) throws BusinessException {
		try{
			Boolean result = turnoDAO.deleteTurno(entidad);
			return result;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public boolean borrarTurno(int id) throws BusinessException {
		try{
			reservaBO.borrarReserva(id);
			Boolean result = turnoDAO.delete(id);
			return result;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public List<TurnoDTO> getAllTurnos() throws BusinessException {
		try{
			List<TurnoDTO> turnos = turnoDAO.getAllTurnos();
			return	turnos;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}
	
	public void setTurnoDAO(TurnoDAO changeTurnoDAO) {
		turnoDAO = changeTurnoDAO;	
	}
	
	public int countTurnos() throws BusinessException {
		try{
			int cantTurnos = turnoDAO.countTurnos();
			return	cantTurnos;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}
	
}
