package ar.com.softtek.academia.backend.services.impl;

import java.util.List;

import javax.jws.WebService;

import ar.com.academia.dto.ReservaDTO;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.academia.entities.exception.ServiceException;
import ar.com.academia.services.ReservaService;
import ar.com.softtek.academia.backend.bo.ReservaBO;

@WebService(endpointInterface = "ar.com.academia.services.ReservaService", serviceName = "ReservaService")
public class ReservaServiceImpl implements ReservaService {
	
	private ReservaBO reservaBO;
	
	public ReservaBO getReservaBO() {
		return reservaBO;
	}

	public void setReservaBO(ReservaBO reservaBO) {
		this.reservaBO = reservaBO;
	}


	public List<ReservaDTO> getAllReservas() throws ServiceException {
		try{
			List<ReservaDTO> reserva = reservaBO.getAllReservas();
			return reserva;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}

	public ReservaDTO getByIdReserva(int idReserva) throws ServiceException {
		try{
			ReservaDTO reserva = reservaBO.getReservaById(idReserva);
			return reserva;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}


	public int countReservas() throws ServiceException {
		try{
			int reservas = reservaBO.countReservas();
			return reservas;
		} catch (BusinessException c){
			throw new ServiceException();
		}
	}
}
