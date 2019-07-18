package ar.com.academia.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.dto.service.SocioServiceDTO;
import ar.com.academia.entities.exception.ServiceException;

@WebService(name = "Socios")
@XmlSeeAlso({SocioServiceDTO.class, SocioDTO.class})
public interface SocioService {

	
	@WebMethod(operationName = "AddSocio")
	@WebResult(name = "AddSocioResult")
	public int add(
		@WebParam(name = "socioAgregar")
		SocioServiceDTO agregar
			) throws ServiceException;


	@WebMethod(operationName = "GetAllSocios")
	@WebResult(name = "GetAllSociosResult")
	public List<SocioDTO> getAll() throws ServiceException;

	@WebMethod(operationName = "GetByIdSocio")
	@WebResult(name = "GetByIdSocioResult")
	public SocioDTO getById(
		@WebParam(name = "idSocio")
		int idSocio
			) throws ServiceException;

	@WebMethod(operationName = "GetAllSocioBySexo")
	@WebResult(name = "GetAllSocioBySexoResult")
	public List<SocioDTO> getByAllSexo(
		@WebParam(name = "sexo")
		String sexo
			) throws ServiceException;
	

	@WebMethod(operationName = "RemoveSocioById")
	@WebResult(name = "RemoveSocioByIdResult")
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

	public List<SocioDTO> buscarSocios(
			@WebParam(name = "nombreSocio")
			String nombreB, 
			@WebParam(name = "apellidoSocio")
			String apellidoB, 
			@WebParam(name = "dniSocio")
			String dniB, 
			@WebParam(name = "numeroAfiliado")
			int nroAfiB
			) throws ServiceException;
}
