package ar.com.softtek.academia.backend.services.impl;

import java.util.List;

import javax.jws.WebService;

import ar.com.academia.dto.HorarioDTO;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.HorarioService;
import ar.com.softtek.academia.backend.bo.HorarioBO;

@WebService(endpointInterface = "ar.com.academia.services.HorarioService", serviceName = "HorarioService")
public class HorarioServiceImpl implements HorarioService {
	
	private HorarioBO horarioBO;
	
	public HorarioBO getHorarioBO() {
		return horarioBO;
	}

	public void setHorarioBO(HorarioBO horarioBO) {
		this.horarioBO = horarioBO;
	}


	public List<HorarioDTO> getAllHorarios() throws ServiceException {
		try{
			List<HorarioDTO> horario = horarioBO.getAllHorarios();
			return horario;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public HorarioDTO getByIdHorario(int idHorario) throws ServiceException {
		try{
			HorarioDTO horario = horarioBO.getHorarioById(idHorario);
			return horario;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}


	public int countHorarios() throws ServiceException {
		try{
			int horarios = horarioBO.countHorarios();
			return horarios;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}
}
