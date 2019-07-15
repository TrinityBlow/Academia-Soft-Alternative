package ar.com.academia.dto.service;

public class TurnoServiceDTO {

	private float importe;
	private String observaciones;
	private String fecha;
	
	private int socioId;
	private int practicaId;
	private int prestadorId;
	private int horarioId;
	
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public int getSocioId() {
		return socioId;
	}
	public void setSocioId(int socioId) {
		this.socioId = socioId;
	}
	public int getPracticaId() {
		return practicaId;
	}
	public void setPracticaId(int practicaId) {
		this.practicaId = practicaId;
	}
	public int getPrestadorId() {
		return prestadorId;
	}
	public void setPrestadorId(int prestadorId) {
		this.prestadorId = prestadorId;
	}
	public int getHorarioId() {
		return horarioId;
	}
	public void setHorarioId(int horarioId) {
		this.horarioId = horarioId;
	}
	
	
	
	
	
}
