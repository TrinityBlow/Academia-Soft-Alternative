package ar.com.softtek.academia.backend.bo;

import java.util.List;

import ar.com.academia.dto.PracticaDTO;
import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.entities.exception.BusinessException;

public interface PracticaBO {
	
	public List<PracticaDTO> getAllPracticas() throws BusinessException;

	public List<PrestadorDTO> getAllPrestadoresByPractica(int id) throws BusinessException;
	
	public PracticaDTO getPracticaById(int id) throws BusinessException;
	
	public int countPracticas() throws BusinessException;
	
}
