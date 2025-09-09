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
@Table (name="ProductosHasCotizacion")
public class ProductosHasCotizacion {
@Id
@GeneratedValue (strategy= GenerationType.IDENTITY)
@Column(name="id", unique=true, nullable=false)
	 private Long Id;
@Column(name = "fkIdProductos", nullable = false)
private Long fkIdProductos;
@Column(name = "fkIdCotizacion", nullable = false)
private Long fkIdCotizacion;
	
//CONSTRUCTOR
	 public ProductosHasCotizacion( Long fkIdProductos, Long fkIdCotizacion) {
		super();
		this.fkIdProductos = fkIdProductos;
		this.fkIdCotizacion = fkIdCotizacion;
	}//constructor
	 
	public ProductosHasCotizacion() {
	}//constructor vacío
	

	
//GETTERS AND SETTERS
	
	public Long getId() {
		return Id;
	}//getId
	
	public Long getFkIdProductos() {
		return fkIdProductos;
	}//getFkIdProductos
	public void setFkIdProductos(Long fkIdProductos) {
		this.fkIdProductos = fkIdProductos;
	}//setFkIdProductos
	public Long getFkIdCotizacion() {
		return fkIdCotizacion;
	}//getFkIdCotizacion
	public void setFkIdCotizacion(Long fkIdCotizacion) {
		this.fkIdCotizacion = fkIdCotizacion;
	}

	@Override
	public String toString() {
		return "ProductosHasCotizacion [Id=" + Id + ", cotizacion=" + fkIdCotizacion + ", producto=" + fkIdProductos + "]";
	}
	
	//MÉTODO TO STRING
	
	

	
	
	
		
}//classProductosHasCotizacion
