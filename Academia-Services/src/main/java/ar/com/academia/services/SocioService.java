package ar.com.academia.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.entities.exception.ServiceException;

@WebService(name = "Socios")
@XmlSeeAlso({SocioDTO.class})
public interface SocioService {

	
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

	@WebMethod(operationName = "GetAllBySexo")
	@WebResult(name = "GetAllBySexoResult")
	public List<SocioDTO> getByAllSexo(
		@WebParam(name = "sexo")
		String sexo
			) throws ServiceException;
	

	@WebMethod(operationName = "RemoveById")
	@WebResult(name = "RemoveByIdResult")
	public boolean removeById(
		@WebParam(name = "idSocio")
		int idSocio
			) throws ServiceException;
	
	@WebMethod(operationName = "CountAllSocios")
	@WebResult(name = "CountAllSociosResult")
	public int countSocios() throws ServiceException;
	

	@WebMethod(operationName = "UpdateSocio")
	@WebResult(name = "UpdateSocioResult")
	public void updateSocio(
			@WebParam(name = "socioActualizar")
			SocioDTO actualizar
			) throws ServiceException;

}
