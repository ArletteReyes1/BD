package com.agenciaviajes.agenciaviajes.model;

import javax.persistence.CascadeType;
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
@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name = "fk_id_cotizacion", nullable = false)
private Long fkIdCotizacion;

//@ManyToOne(optional = false)
//@JoinColumn(name = "fk_id_producto", nullable = false)
private Long fkIdProducto;
	



//CONSTRUCTOR
	 public ProductosHasCotizacion(Long fkIdProducto, Long fkIdCotizacion) {
		super();
		this.fkIdProducto = fkIdProducto;
		this.fkIdCotizacion = fkIdProducto;
	}//constructor
	 
	public ProductosHasCotizacion() {
	}//constructor vacío
	
//GETTERS AND SETTERS
	
	public Long getId() {
		return Id;
	}//getId
	
	public Long getproducto() {
		return fkIdProducto;
	}//getFkIdProductos
	public void setProducto(Long fkIdProducto) {
		this.fkIdProducto = fkIdProducto;
	}//setFkIdProductos
	public Long getCotizacion() {
		return fkIdCotizacion;
	}//getFkIdCotizacion
	public void setCotizacion(Long fkIdCotizacion) {
		this.fkIdCotizacion = fkIdCotizacion;
	}

	@Override
	public String toString() {
		return "ProductosHasCotizacion [Id=" + Id + ", fkIdCotizacion=" + fkIdCotizacion + ", fkIdProducto="
				+ fkIdProducto + "]";
	}

	
	//MÉTODO TO STRING
		
}//classProductosHasCotizacion
