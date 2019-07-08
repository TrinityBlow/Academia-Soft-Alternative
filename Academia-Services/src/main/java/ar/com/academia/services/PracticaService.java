package ar.com.academia.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import ar.com.academia.dto.PracticaDTO;
import ar.com.academia.entities.exception.ServiceException;

@WebService(name = "Practicas")
@XmlSeeAlso({PracticaDTO.class})
public interface PracticaService {
	

	@WebMethod(operationName = "GetAllPractica")
	@WebResult(name = "GetAllPracticaResult")
	public List<PracticaDTO> getAllPracticas() throws ServiceException;

	@WebMethod(operationName = "GetByIdPractica")
	@WebResult(name = "GetByIdPracticaResult")
	public PracticaDTO getByIdPractica(
		@WebParam(name = "idPractica")
		int idPractica
			) throws ServiceException;

	@WebMethod(operationName = "CountAllPracticas")
	@WebResult(name = "CountAllPracticasResult")
	public int countPracticas() throws ServiceException;
	

}
