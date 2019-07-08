package ar.com.academia.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.entities.exception.ServiceException;


@WebService(name = "SociosProxy")
@XmlSeeAlso({SocioDTO.class})
public interface SocioServiceProxy {

	
	@WebMethod(operationName = "Add")
	@WebResult(name = "AddResult")
	public int add(
		@WebParam(name = "socioAgregar")
		SocioDTO agregar
			) throws ServiceException;


	@WebMethod(operationName = "GetAll")
	@WebResult(name = "GetAllResult")
	public List<SocioDTO> getAll() throws ServiceException;

	@WebMethod(operationName = "GetById")
	@WebResult(name = "GetByIdResult")
	public SocioDTO getById(
		@WebParam(name = "idSocio")
		int idSocio
			) throws ServiceException;

	@WebMethod(operationName = "GetBySexo")
	@WebResult(name = "GetBySexoResult")
	public List<SocioDTO> getBySexo(
		@WebParam(name = "sexo")
		String sexo
			) throws ServiceException;
	

	@WebMethod(operationName = "RemoveById")
	@WebResult(name = "RemoveByIdResult")
	public boolean removeById(
		@WebParam(name = "idSocio")
		int idSocio
			) throws ServiceException;

}
