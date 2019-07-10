package ar.com.academia.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import ar.com.academia.dto.TurnoDTO;
import ar.com.academia.entities.exception.ServiceException;

@WebService(name = "Turnos")
@XmlSeeAlso({TurnoDTO.class})
public interface TurnoService {
	
	@WebMethod(operationName = "AddTurno")
	@WebResult(name = "AddTurnoResult")
	public int addTurno(
		@WebParam(name = "turnoAgregar")
		TurnoDTO agregar
			) throws ServiceException;


	@WebMethod(operationName = "GetAllTurno")
	@WebResult(name = "GetAllTurnoResult")
	public List<TurnoDTO> getAllTurnos() throws ServiceException;

	@WebMethod(operationName = "GetByIdTurno")
	@WebResult(name = "GetByIdTurnoResult")
	public TurnoDTO getByIdTurno(
		@WebParam(name = "idTurno")
		int idTurno
			) throws ServiceException;

	@WebMethod(operationName = "RemoveByIdTurno")
	@WebResult(name = "RemoveByIdTurnoResult")
	public boolean removeByIdTurno(
		@WebParam(name = "idTurno")
		int idTurno
			) throws ServiceException;
	
	@WebMethod(operationName = "CountAllTurnos")
	@WebResult(name = "CountAllTurnosResult")
	public int countTurnos() throws ServiceException;
	

	@WebMethod(operationName = "UpdateTurno")
	@WebResult(name = "UpdateTurnoResult")
	public void updateTurno(
			@WebParam(name = "turnoActualizar")
			TurnoDTO actualizar
			) throws ServiceException;

}
