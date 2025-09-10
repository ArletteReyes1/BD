package com.agenciaviajes.agenciaviajes.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	@Column(name = "titulo", nullable = false, unique = true)
    private String titulo;
	@Column(name = "imagenUrl", nullable = false, unique = true)
    private String imagenUrl;
	@Column(name = "precio", nullable = false, unique = true)
    private Double precio;
	@Column(name = "lugares", nullable = false, unique = true)
    private String lugares;
	@Column(name = "dias", nullable = false, unique = true)
    private Integer dias;
	@Column(name = "noches", nullable = false, unique = true)
    private Integer noches;
	@Column(name = "incluye", nullable = false, unique = true)
    private String incluye;
	@Column(name = "noIncluye", nullable = false, unique = true)
    private String noIncluye;
	@OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductosHasCotizacion> cotizaciones = new ArrayList<>();

    
   
	public Productos(String titulo, String imagenUrl, Double precio, String lugares, Integer dias, Integer noches,
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
	
	}//constructor


	public Productos() {
	
	}//ProductosId constructor vacío

	 public List<ProductosHasCotizacion> getCotizaciones() {
	        return cotizaciones;
	    }
	    public void setCotizaciones(List<ProductosHasCotizacion> cotizaciones) {
	        this.cotizaciones = cotizaciones;
	    }

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


	public Double getPrecio() {
		return precio;
	}//getPrecio


	public void setPrecio(Double precio) {
		this.precio = precio;
	}//setPrecio


	public String getLugares() {
		return lugares;
	}//getLugares


	public void setLugares(String lugares) {
		this.lugares = lugares;
	}//setLugares


	public Integer getDias() {
		return dias;
	}//getDias


	public void setDias(Integer dias) {
		this.dias = dias;
	}//setDias


	public Integer getNoches() {
		return noches;
	}//getNoches


	public void setNoches(Integer noches) {
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
