package ar.com.academia.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import ar.com.academia.dto.ReservaDTO;
import ar.com.academia.entities.exception.ServiceException;

@WebService(name = "Reservas")
@XmlSeeAlso({ReservaDTO.class})
public interface ReservaService {
	

	@WebMethod(operationName = "GetAllReservas")
	@WebResult(name = "GetAllReservasResult")
	public List<ReservaDTO> getAllReservas() throws ServiceException;

	@WebMethod(operationName = "GetByIdReserva")
	@WebResult(name = "GetByIdReservaResult")
	public ReservaDTO getByIdReserva(
		@WebParam(name = "idReserva")
		int idReserva
			) throws ServiceException;

	@WebMethod(operationName = "CountAllReservas")
	@WebResult(name = "CountAllReservasResult")
	public int countReservas() throws ServiceException;
	

	@WebMethod(operationName = "RemoveByIdReserva")
	@WebResult(name = "RemoveByIdReservaResult")
	public boolean removeByIdReserva(
		@WebParam(name = "idReserva")
		int idReserva
			) throws ServiceException;
	

	@WebMethod(operationName = "AddReserva")
	@WebResult(name = "AddReservaResult")
	public int addReserva(
		@WebParam(name = "reservaAgregar")
		ReservaDTO agregar
			) throws ServiceException;
	

}
