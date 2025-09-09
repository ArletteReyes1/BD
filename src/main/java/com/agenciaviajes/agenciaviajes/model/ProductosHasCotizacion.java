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
<<<<<<< HEAD
@ManyToOne(optional = false)
@JoinColumn(name = "fk_id_cotizacion", nullable = false)
private Cotizacion cotizacion;
@ManyToOne(optional = false)
@JoinColumn(name = "fk_id_producto", nullable = false)
private Productos producto;
	
//CONSTRUCTOR
	 public ProductosHasCotizacion(Productos producto, Cotizacion cotizacion) {
		super();
		this.producto = producto;
		this.cotizacion = cotizacion;
=======
@Column(name = "fkIdProductos", nullable = false)
private Long fkIdProductos;
@Column(name = "fkIdCotizacion", nullable = false)
private Long fkIdCotizacion;
	
//CONSTRUCTOR
	 public ProductosHasCotizacion( Long fkIdProductos, Long fkIdCotizacion) {
		super();
		this.fkIdProductos = fkIdProductos;
		this.fkIdCotizacion = fkIdCotizacion;
>>>>>>> APRcambios
	}//constructor
	 
	public ProductosHasCotizacion() {
	}//constructor vacío
	

	
//GETTERS AND SETTERS
	
	public Long getId() {
		return Id;
	}//getId
	
	public Productos getproducto() {
		return producto;
	}//getFkIdProductos
	public void setProducto(Productos producto) {
		this.producto = producto;
	}//setFkIdProductos
	public Cotizacion getCotizacion() {
		return cotizacion;
	}//getFkIdCotizacion
	public void setCotizacion(Cotizacion cotizacion) {
		this.cotizacion = cotizacion;
	}

	@Override
	public String toString() {
		return "ProductosHasCotizacion [Id=" + Id + ", cotizacion=" + cotizacion + ", producto=" + producto + "]";
	}
<<<<<<< HEAD
=======

	@Override
	public String toString() {
		return "ProductosHasCotizacion [Id=" + Id + ", cotizacion=" + fkIdCotizacion + ", producto=" + fkIdProductos + "]";
	}
>>>>>>> APRcambios
	
	//MÉTODO TO STRING
	
	

	
	
	
		
}//classProductosHasCotizacion
