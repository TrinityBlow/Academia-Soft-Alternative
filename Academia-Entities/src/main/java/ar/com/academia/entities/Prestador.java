package ar.com.academia.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Prestador implements Serializable {
      /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	  private String nombre;
	  private int telefono;
	  private String apellido;
	  private String email;

      private Set<Horario> horas;
      private List<Turno> turnos;
      private Set<Practica> practicas;

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

		public Set<Horario> getHoras() {
			return horas;
		}
		public void setHoras(Set<Horario> horas) {
			this.horas = horas;
		}

		public List<Turno> getTurnos() {
			return turnos;
		}
		public void setTurnos(List<Turno> turnos) {
			this.turnos = turnos;
		}
		public Set<Practica> getPracticas() {
			return practicas;
		}
		public void setPracticas(Set<Practica> practicas) {
			this.practicas = practicas;
		}
  }
