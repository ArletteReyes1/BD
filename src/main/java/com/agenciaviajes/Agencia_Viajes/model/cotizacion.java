package com.agenciaviajes.Agencia_Viajes.model;

public class cotizacion {
//PARÁMETROS
	private Long idCotizacion;
    private String fecha;
    private Long fkIdUsuario;
	
  //CONSTRUCTOR
    public cotizacion(String fecha, Long fkIdUsuario) {
		super();
		this.fecha = fecha;
		this.fkIdUsuario = fkIdUsuario;
	}//constructor

	public cotizacion() {
		super();
	}//constructor vacío


	//GETTERS AND SETTERS
	public Long getIdCotizacion() {
		return idCotizacion;
	}//getIdCotizacion

	public void setIdCotizacion(Long idCotizacion) {
		this.idCotizacion = idCotizacion;
	}//setIdCotizacion

	public String getFecha() {
		return fecha;
	}//getFecha

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}//setFecha

	public Long getFkIdUsuario() {
		return fkIdUsuario;
	}//getFkIdUsuario

	public void setFkIdUsuario(Long fkIdUsuario) {
		this.fkIdUsuario = fkIdUsuario;
	}//setFkIdUsuario


	//TOSTRING
	@Override
	public String toString() {
		return "cotizacion [idCotizacion=" + idCotizacion + ", fecha=" + fecha + ", fkIdUsuario=" + fkIdUsuario
				+ ", getIdCotizacion()=" + getIdCotizacion() + ", getFecha()=" + getFecha() + ", getFkIdUsuario()="
				+ getFkIdUsuario() + "]";
	}//toString
	
	
    


	
	
	
	
}//classCotizacion
