package ar.com.academia.dto.service;

public class SocioServiceDTO {
	
	private int numeroSocio;
	private String nombre;
	private String apellido;
	private String sexo;
	private String estadoCivil;
	private String nombreConyuge;
	private int cantidadHijos;
	private String dni;
	private String telefono;
	private String direccion;
	private String email;
	private Integer planDTO;
	private String password;
	
	
	public int getNumeroSocio() {
		return numeroSocio;
	}
	public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio = numeroSocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getNombreConyuge() {
		return nombreConyuge;
	}
	public void setNombreConyuge(String nombreConyuge) {
		this.nombreConyuge = nombreConyuge;
	}
	public int getCantidadHijos() {
		return cantidadHijos;
	}
	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPlanDTO() {
		return planDTO;
	}
	public void setPlanDTO(Integer planDTO) {
		this.planDTO = planDTO;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
