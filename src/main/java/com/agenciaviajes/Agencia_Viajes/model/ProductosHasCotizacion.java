package com.agenciaviajes.Agencia_Viajes.model;
public class ProductosHasCotizacion {
//PARÁMETROS
	 private int fkIdProductos;
	 private int fkIdCotizacion;
	
//CONSTRUCTOR
	 public ProductosHasCotizacion(int fkIdProductos, int fkIdCotizacion) {
		super();
		this.fkIdProductos = fkIdProductos;
		this.fkIdCotizacion = fkIdCotizacion;
	}//constructor
	public ProductosHasCotizacion() {
		super();
	}//constructor vacío
	
//GETTERS AND SETTERS
	public int getFkIdProductos() {
		return fkIdProductos;
	}//getFkIdProductos
	public void setFkIdProductos(int fkIdProductos) {
		this.fkIdProductos = fkIdProductos;
	}//setFkIdProductos
	public int getFkIdCotizacion() {
		return fkIdCotizacion;
	}//getFkIdCotizacion
	public void setFkIdCotizacion(int fkIdCotizacion) {
		this.fkIdCotizacion = fkIdCotizacion;
	}//setFkIdCotizacion
	
//MÉTODO TO STRING
	@Override
	public String toString() {
		return "ProductosHasCotizacion [fkIdProductos=" + fkIdProductos + ", fkIdCotizacion=" + fkIdCotizacion
				+ ", getFkIdProductos()=" + getFkIdProductos() + ", getFkIdCotizacion()=" + getFkIdCotizacion() + "]";
	}//toString
		
}//classProductosHasCotizacion
