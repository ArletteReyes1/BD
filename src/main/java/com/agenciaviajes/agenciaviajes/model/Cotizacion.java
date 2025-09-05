package com.agenciaviajes.agenciaviajes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cotizacion")
public class Cotizacion {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	@Column(name="id_cotizacion", unique=true, nullable=false)
	private Long id_cotizacion;
	@Column(nullable=false)
    private String fecha;
	@ManyToOne(optional=false)
	@JoinColumn(name="fkidusuario", nullable=false)
	private Usuario usuario;
	
  //CONSTRUCTOR
   
    public Cotizacion(String fecha, Usuario usuario) {
		super();
		this.fecha = fecha;
		this.usuario = usuario;
	}//constructor

  	public Cotizacion() {
	}//constructor vacío


	//GETTERS AND SETTERS
	public Long getIdCotizacion() {
		return id_cotizacion;
	}//getIdCotizacion

	public void setIdCotizacion(Long idCotizacion) {
		this.id_cotizacion = idCotizacion;
	}//setIdCotizacion

	public String getFecha() {
		return fecha;
	}//getFecha

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}//setFecha

	public Usuario getUsuario() {
		return usuario;
	}//getFkIdUsuario

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}//setFkIdUsuario

	@Override
	public String toString() {
		return "Cotizacion [id_cotizacion=" + id_cotizacion + ", fecha=" + fecha + ", usuario=" + usuario + "]";
	}

	

	//TOSTRING
	
	
	
}//classCotizacion
