package com.agenciaviajes.agenciaviajes.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	@Column (nullable=false)
	private Long fkIdUsuario;
	 @OneToMany(mappedBy = "cotizacion", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<ProductosHasCotizacion> productos = new ArrayList<>();

	
  //CONSTRUCTOR
	//@OneToMany(cascade=CascadeType.ALL)
	//@JoinColumn (name="cotizacionid", referencedColumnName= "id_cotizacion")
	//List<Usuario> usuarios = new ArrayList<Usuario>();
   
    public Cotizacion(String fecha, Long fkIdUsuario) {
		super();
		this.fecha = fecha;
		//this.fkIdUsuario = fkIdUsuario;
	}//constructor

  	public Cotizacion() {
  		
	}//constructor vacío
  	
  	
  	public List<ProductosHasCotizacion>getProductos(){
		return productos;
	}//getPRoductos
  	
  	 public void setProductos(List<ProductosHasCotizacion> productos) {
         this.productos = productos;
     }
  	//public List<Usuario> getUsuarios(){
	//	return usuarios;
	//}//getPRoductos


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

	public Long getFkIdUsuario() {
		 return fkIdUsuario;
	}//getFkIdUsuario

	public void setFkIdUsuario(Long fkIdUsuario) {
		this.fkIdUsuario = fkIdUsuario;
	}//setFkIdUsuario

	@Override
	public String toString() {
		return "Cotizacion [id_cotizacion=" + id_cotizacion + ", fecha=" + fecha + "]";
	}

	

	//TOSTRING
	
	
	
}//classCotizacion
