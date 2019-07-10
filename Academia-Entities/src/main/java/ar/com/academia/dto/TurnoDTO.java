package ar.com.academia.dto;

public class TurnoDTO {

	private int id;
	private float importeDelTurno;
	private String observaciones;
	private SocioDTO socioDTO;
	private PrestadorDTO prestadorDTO;
	private ReservaDTO reservaDTO;
	private PracticaDTO practicaDTO;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getImporteDelTurno() {
		return importeDelTurno;
	}
	public void setImporteDelTurno(float importeDelTurno) {
		this.importeDelTurno = importeDelTurno;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public SocioDTO getSocioDTO() {
		return socioDTO;
	}
	public void setSocioDTO(SocioDTO socioDTO) {
		this.socioDTO = socioDTO;
	}
	public PrestadorDTO getPrestadorDTO() {
		return prestadorDTO;
	}
	public void setPrestadorDTO(PrestadorDTO prestadorDTO) {
		this.prestadorDTO = prestadorDTO;
	}
	public ReservaDTO getReservaDTO() {
		return reservaDTO;
	}
	public void setReservaDTO(ReservaDTO reservaDTO) {
		this.reservaDTO = reservaDTO;
	}
	public PracticaDTO getPracticaDTO() {
		return practicaDTO;
	}
	public void setPracticaDTO(PracticaDTO practicaDTO) {
		this.practicaDTO = practicaDTO;
	}
		
	
}