package ar.com.softtek.academia.backend.bo.impl;

import java.util.List;

import ar.com.academia.dto.HorarioDTO;
import ar.com.academia.dto.PracticaDTO;
import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.dto.ReservaDTO;
import ar.com.academia.dto.SocioDTO;
import ar.com.academia.dto.TurnoDTO;
import ar.com.academia.dto.service.TurnoServiceDTO;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.bo.HorarioBO;
import ar.com.softtek.academia.backend.bo.PracticaBO;
import ar.com.softtek.academia.backend.bo.PrestadorBO;
import ar.com.softtek.academia.backend.bo.ReservaBO;
import ar.com.softtek.academia.backend.bo.SocioBO;
import ar.com.softtek.academia.backend.bo.TurnoBO;
import ar.com.softtek.academia.backend.dao.TurnoDAO;

public class TurnoBOImpl implements TurnoBO{
	
	private TurnoDAO turnoDAO;
	private ReservaBO reservaBO;
	private HorarioBO horarioBO;
	private PrestadorBO prestadorBO;
	private PracticaBO practicaBO;
	private SocioBO socioBO;
	

	
	public SocioBO getSocioBO() {
		return socioBO;
	}

	public void setSocioBO(SocioBO socioBO) {
		this.socioBO = socioBO;
	}

	public HorarioBO getHorarioBO() {
		return horarioBO;
	}

	public void setHorarioBO(HorarioBO horarioBO) {
		this.horarioBO = horarioBO;
	}

	public PrestadorBO getPrestadorBO() {
		return prestadorBO;
	}

	public void setPrestadorBO(PrestadorBO prestadorBO) {
		this.prestadorBO = prestadorBO;
	}

	public PracticaBO getPracticaBO() {
		return practicaBO;
	}

	public void setPracticaBO(PracticaBO practicaBO) {
		this.practicaBO = practicaBO;
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
			ReservaDTO reservaDTO = new ReservaDTO();
			TurnoDTO turnoDTOAgregar = new TurnoDTO();
			
			SocioDTO socioDTO = socioBO.getSocioById(entidad.getSocioId());
			PracticaDTO practicaDTO = practicaBO.getPracticaById(entidad.getPracticaId());
			PrestadorDTO prestadorDTO = prestadorBO.getPrestadorById(entidad.getPrestadorId());
			HorarioDTO horarioDTO = horarioBO.getHorarioById(entidad.getHorarioId());
			
			reservaDTO.setFecha(entidad.getFecha());
			reservaDTO.setHorarioDTO(horarioDTO);
			
			turnoDTOAgregar.setImporteDelTurno(entidad.getImporte());
			turnoDTOAgregar.setObservaciones(entidad.getObservaciones());
			turnoDTOAgregar.setSocioDTO(socioDTO);
			turnoDTOAgregar.setPracticaDTO(practicaDTO);
			turnoDTOAgregar.setPrestadorDTO(prestadorDTO);
			turnoDTOAgregar.setReservaDTO(reservaDTO);

			TurnoDTO turnoDTOAgregado = turnoDAO.saveTurno(turnoDTOAgregar);
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
