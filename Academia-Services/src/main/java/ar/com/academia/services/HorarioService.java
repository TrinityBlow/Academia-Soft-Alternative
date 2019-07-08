package ar.com.academia.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import ar.com.academia.dto.HorarioDTO;
import ar.com.academia.entities.exception.ServiceException;

@WebService(name = "Horarios")
@XmlSeeAlso({HorarioDTO.class})
public interface HorarioService {
	

	@WebMethod(operationName = "GetAllHorarios")
	@WebResult(name = "GetAllHorariosResult")
	public List<HorarioDTO> getAllHorarios() throws ServiceException;

	@WebMethod(operationName = "GetByIdHorario")
	@WebResult(name = "GetByIdHorarioResult")
	public HorarioDTO getByIdHorario(
		@WebParam(name = "idHorario")
		int idHorario
			) throws ServiceException;

	@WebMethod(operationName = "CountAllHorarios")
	@WebResult(name = "CountAllHorariosResult")
	public int countHorarios() throws ServiceException;
	

}
