package ar.com.softtek.academia.backend.bo;

import java.util.List;

import ar.com.academia.dto.ReservaDTO;
import ar.com.academia.entities.exception.BusinessException;

public interface ReservaBO {
	
	public List<ReservaDTO> getAllReservas() throws BusinessException;
	
	public ReservaDTO getReservaById(int id) throws BusinessException;
	public ReservaDTO crearReserva(ReservaDTO entidadDTO) throws BusinessException;
	

	public boolean borrarReserva(int id) throws BusinessException ;
	
	public int countReservas() throws BusinessException;
	
}
