package ar.com.academia.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.dto.SocioDTO;
import ar.com.academia.entities.exception.ServiceException;

@WebService(name = "Prestadores")
@XmlSeeAlso({PrestadorDTO.class})
public interface PrestadorService {
	
	@WebMethod(operationName="addPrestador")
	@WebResult(name="id")
	int add(@WebParam(name="prestador")PrestadorDTO prestador) throws ServiceException;
	
	@WebMethod(operationName="getAllPrestadores")
	@WebResult(name="prestadores")
	List <PrestadorDTO> getAllPrestadores() throws ServiceException;
	
	@WebMethod(operationName="getByIdPrestador")
	@WebResult(name="prestador")
	PrestadorDTO getById(@WebParam(name="id")int id) throws ServiceException;

    
	@WebMethod(operationName="removeByIdPrestador")
	@WebResult(name="id")
	boolean removeById(int id) throws ServiceException;
	

	@WebMethod(operationName = "CountAllPrestadores")
	@WebResult(name = "CountAllPrestadoresResult")
	public int countPrestadores() throws ServiceException;
	

	@WebMethod(operationName = "UpdatePrestador")
	@WebResult(name = "UpdatePrestadorResult")
	public void updatePrestador(
			@WebParam(name = "prestadorActualizar")
			PrestadorDTO actualizar
			) throws ServiceException;
}
