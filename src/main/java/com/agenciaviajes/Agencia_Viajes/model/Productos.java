package com.agenciaviajes.Agencia_Viajes.model;

public class Productos {
	private static Long total= 0;
	private Long id;
    private String titulo;
    private String imagenUrl;
    private double precio;
    private String lugares;
    private int dias;
    private int noches;
    private String incluye;
    private String noIncluye;
    
    
	public Productos(String titulo, String imagenUrl, double precio, String lugares, int dias, int noches,
			String incluye, String noIncluye) {
		super();
		this.titulo = titulo;
		this.imagenUrl = imagenUrl;
		this.precio = precio;
		this.lugares = lugares;
		this.dias = dias;
		this.noches = noches;
		this.incluye = incluye;
		this.noIncluye = noIncluye;
		Productos.total++;
		this.id= Productos.total;
	}//constructor


	public Productos() {
		Productos.total++;
		this.id= Productos.total;
	}//ProductosId


	public Long getId() {
		return id;
	}//getId


	public void setId(Long id) {
		this.id = id;
	}//setId


	public String getTitulo() {
		return titulo;
	}//getTitulo


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}//setTitulo


	public String getImagenUrl() {
		return imagenUrl;
	}//getImagenUrl


	public void setImagenUrl(String imagenUrl) {
		this.imagenUrl = imagenUrl;
	}//setImagenUrl


	public double getPrecio() {
		return precio;
	}//getPrecio


	public void setPrecio(double precio) {
		this.precio = precio;
	}//setPrecio


	public String getLugares() {
		return lugares;
	}//getLugares


	public void setLugares(String lugares) {
		this.lugares = lugares;
	}//setLugares


	public int getDias() {
		return dias;
	}//getDias


	public void setDias(int dias) {
		this.dias = dias;
	}//setDias


	public int getNoches() {
		return noches;
	}//getNoches


	public void setNoches(int noches) {
		this.noches = noches;
	}//setNoches


	public String getIncluye() {
		return incluye;
	}//getIncluye


	public void setIncluye(String incluye) {
		this.incluye = incluye;
	}//setIncluye


	public String getNoIncluye() {
		return noIncluye;
	}//getNoIncluye


	public void setNoIncluye(String noIncluye) {
		this.noIncluye = noIncluye;
	}//setNoIncluye


	@Override
	public String toString() {
		return "Productos [id=" + id + ", titulo=" + titulo + ", imagenUrl=" + imagenUrl + ", precio=" + precio
				+ ", lugares=" + lugares + ", dias=" + dias + ", noches=" + noches + ", incluye=" + incluye
				+ ", noIncluye=" + noIncluye + "]";
	}//toString
	
	
    
    
}//classProducto
