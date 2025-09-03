package com.agenciaviajes.Agencia_Viajes.model;
public class ProductosHasCotizacion {
//PARÁMETROS
	 private Long Id;
	 private Long fkIdProductos;
	 private Long fkIdCotizacion;
	
//CONSTRUCTOR
	 private static Long total=0L;
	 public ProductosHasCotizacion(Long fkIdProductos, Long fkIdCotizacion) {
		super();
		this.fkIdProductos = fkIdProductos;
		this.fkIdCotizacion = fkIdCotizacion;
		ProductosHasCotizacion.total++;
		this.Id= ProductosHasCotizacion.total;
	}//constructor
	public ProductosHasCotizacion() {
		super();
		ProductosHasCotizacion.total++;
		this.Id= ProductosHasCotizacion.total;
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
	
	//MÉTODO TO STRING
	@Override
	public String toString() {
		return "ProductosHasCotizacion [Id=" + Id + ", fkIdProductos=" + fkIdProductos + ", fkIdCotizacion="
				+ fkIdCotizacion + "]";
	}//setFkIdCotizacion
	

	
	
	
		
}//classProductosHasCotizacion
