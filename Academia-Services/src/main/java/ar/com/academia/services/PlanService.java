package ar.com.academia.services;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import ar.com.academia.dto.PlanDTO;
import ar.com.academia.entities.exception.ServiceException;

@WebService(name = "Planes")
@XmlSeeAlso({PlanDTO.class})
public interface PlanService {
	

	@WebMethod(operationName = "GetAllPlanes")
	@WebResult(name = "GetAllPlanesResult")
	public List<PlanDTO> getAllPlanes() throws ServiceException;

	@WebMethod(operationName = "GetByIdPlan")
	@WebResult(name = "GetByIdPlanResult")
	public PlanDTO getByIdPlan(
		@WebParam(name = "idPlan")
		int idPlan
			) throws ServiceException;

	@WebMethod(operationName = "CountAllPlanes")
	@WebResult(name = "CountAllPlanesResult")
	public int countPlanes() throws ServiceException;
	

}
