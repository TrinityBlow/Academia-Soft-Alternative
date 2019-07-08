package ar.com.academia.dto;

public class PrestadorDTO {
      private int id;
	  private String nombre;
	  private int telefono;
	  private String apellido;
	  private String email;
	  private String franjaHoraria;
		  
	public String getFranjaHoraria() {
	   return franjaHoraria;
	}
	public void setFranjaHoraria(String franjaHoraria) {
		this.franjaHoraria = franjaHoraria;
	}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getTelefono() {
			return telefono;
		}
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
}
