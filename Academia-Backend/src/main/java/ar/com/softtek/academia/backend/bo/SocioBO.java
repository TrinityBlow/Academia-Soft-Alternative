package ar.com.softtek.academia.backend.bo;

import java.util.List;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.dto.service.SocioServiceDTO;
import ar.com.academia.entities.exception.BusinessException;
import ar.com.softtek.academia.backend.dao.SocioDAO;

public interface SocioBO {

	public List<SocioDTO> getAllSocios() throws BusinessException;
	public List<SocioDTO> buscarSocios(String nombreB, String apellidoB, String dniB, int nroAfiB) throws BusinessException;
	public SocioDTO getSocioById(int id) throws BusinessException;
	public void actualizarSocio(SocioDTO entidad) throws BusinessException;
	public SocioDTO crearSocio(SocioServiceDTO entidad) throws BusinessException;
	public boolean borrarSocio(SocioDTO entidad) throws BusinessException;
	public boolean borrarSocio(int id) throws BusinessException ;
	public void setSocioDAO(SocioDAO entidad);
	public List<SocioDTO> getAllBySexo(String sexo) throws BusinessException;
	public int countSocios() throws BusinessException;
	
}
