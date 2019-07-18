package ar.com.softtek.academia.backend.bo.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.com.academia.dto.HorarioDTO;
import ar.com.academia.dto.PracticaDTO;
import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.dto.service.PrestadorServiceDTO;
import ar.com.academia.entities.Horario;
import ar.com.academia.entities.Practica;
import ar.com.academia.entities.Prestador;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.academia.entities.exception.PersistenceException;
import ar.com.softtek.academia.backend.bo.HorarioBO;
import ar.com.softtek.academia.backend.bo.PracticaBO;
import ar.com.softtek.academia.backend.bo.PrestadorBO;
import ar.com.softtek.academia.backend.dao.HorarioDAO;
import ar.com.softtek.academia.backend.dao.PracticaDAO;
import ar.com.softtek.academia.backend.dao.PrestadorDAO;


public class PrestadorBOImpl implements PrestadorBO {

	private PrestadorDAO prestadorDAO;
	private HorarioDAO horarioDAO;
	private PracticaDAO practicaDAO;
	

	public HorarioDAO getHorarioDAO() {
		return horarioDAO;
	}

	public void setHorarioDAO(HorarioDAO horarioDAO) {
		this.horarioDAO = horarioDAO;
	}

	public PracticaDAO getPracticaDAO() {
		return practicaDAO;
	}

	public void setPracticaDAO(PracticaDAO practicaDAO) {
		this.practicaDAO = practicaDAO;
	}

	public PrestadorDAO getPrestadorDAO() {
		return prestadorDAO;
	}

	public PrestadorDTO getPrestadorById(int id) throws BusinessException {
		try{
			PrestadorDTO prestador = prestadorDAO.getByIdPrestador(id);
			return	prestador;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}
	

	public void actualizarPrestador(PrestadorDTO entidad) throws BusinessException {

		try{
			Prestador prestador = new Prestador();
			Set<Horario> horarios = new HashSet<Horario>();
			Horario horario;
			Practica practica;
			Set<Practica> practicas = new HashSet<Practica>();
			
			
			for(HorarioDTO horarioDTO  :entidad.getHorasDTO()){
				horario = horarioDAO.getById(horarioDTO.getId());
				horarios.add(horario);
			}
			
			for(PracticaDTO practicaDTO  :entidad.getPracticasDTO()){
				practica = practicaDAO.getById(practicaDTO.getId());
				practicas.add(practica);
			}
			
		    prestador = prestadorDAO.getById(entidad.getId());
			
			prestador.setApellido(entidad.getApellido());
			prestador.setEmail(entidad.getEmail());
			prestador.setId(entidad.getId());
			prestador.setNombre(entidad.getNombre());
			prestador.setTelefono(entidad.getTelefono());
			prestador.setHoras(horarios);
			prestador.setPracticas(practicas);
			prestadorDAO.update(prestador);
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public PrestadorDTO crearPrestador(PrestadorServiceDTO entidad) throws BusinessException {
		try{
			Prestador prestador = new Prestador();
			Set<Horario> horarios = new HashSet<Horario>();
			Horario horario;
			Practica practica;
			Set<Practica> practicas = new HashSet<Practica>();
			
			
			for(int horaId  :entidad.getHorarios()){
				horario = horarioDAO.getById(horaId);
				horarios.add(horario);
			}
			
			for(int practicaId  :entidad.getPracticas()){
				practica = practicaDAO.getById(practicaId);
				practicas.add(practica);
			}
			
			prestador.setApellido(entidad.getApellido());
			prestador.setNombre(entidad.getNombre());
			prestador.setEmail(entidad.getEmail());
			prestador.setId(entidad.getNumeroPrestador());
			prestador.setTelefono(entidad.getTelefono());
			prestador.setHoras(horarios);
			prestador.setPracticas(practicas);
			
			
			PrestadorDTO prestadorDTOAgregado = prestadorDAO.savePrestador(prestador);
			
			return prestadorDTOAgregado;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
		
	}

	public boolean borrarPrestador(PrestadorDTO entidad) throws BusinessException {
		try{
			Boolean result = prestadorDAO.deletePrestador(entidad);
			return result;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public boolean borrarPrestador(int id) throws BusinessException {
		try{
			Boolean result = prestadorDAO.delete(id);
			return result;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	public List<PrestadorDTO> getAllPretadores() throws BusinessException {
		try{
			List<PrestadorDTO> prestadores = prestadorDAO.getAllPrestadores();
			return	prestadores;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}
	
	
	public void setPrestadorDAO(PrestadorDAO changePrestadorDAO) {
		prestadorDAO = changePrestadorDAO;	
	}


	@Override
	public int countPrestadores() throws BusinessException {
		try{
			int cantPrestadores = prestadorDAO.countPrestadores();
			return	cantPrestadores;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	@Override
	public List<PrestadorDTO> getAllPrestadores() throws BusinessException {
		try{
			List<PrestadorDTO> prestadores = prestadorDAO.getAllPrestadores();
			return	prestadores;
		} catch (PersistenceException  e){
			throw new BusinessException();
		}
	}

	
	
}
