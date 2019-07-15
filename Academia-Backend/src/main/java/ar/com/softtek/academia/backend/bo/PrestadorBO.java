package ar.com.softtek.academia.backend.bo;

import java.util.List;

import ar.com.academia.dto.PrestadorDTO;
import ar.com.academia.dto.service.PrestadorServiceDTO;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.softtek.academia.backend.dao.PrestadorDAO;

public interface PrestadorBO {

	public List<PrestadorDTO> getAllPrestadores() throws BusinessException;
	public PrestadorDTO getPrestadorById(int id) throws BusinessException;
	public void actualizarPrestador(PrestadorDTO entidad) throws BusinessException;
	public PrestadorDTO crearPrestador(PrestadorServiceDTO agregar) throws BusinessException;
	public boolean borrarPrestador(PrestadorDTO entidad) throws BusinessException;
	public boolean borrarPrestador(int id) throws BusinessException ;
	public void setPrestadorDAO(PrestadorDAO entidad);
	public int countPrestadores() throws BusinessException;
	
}
