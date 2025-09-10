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
@Table(name = "productos_has_cotizacion")
public class ProductosHasCotizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    // FK hacia productos
    @ManyToOne
    @JoinColumn(name = "fk_id_productos")
    private Productos producto;

    // FK hacia cotizacion
    @ManyToOne
    @JoinColumn(name = "fk_id_cotizacion")
    private Cotizacion cotizacion;

    public ProductosHasCotizacion(Long id, Productos producto, Cotizacion cotizacion) {
		super();
		this.id = id;
		this.producto = producto;
		this.cotizacion = cotizacion;
	}

    
    public ProductosHasCotizacion() {
    	
    }//constructor vacio
	// --- Getters & Setters ---
    public Long getId() {
        return id;
    }

    public Productos getProducto() {
        return producto;
    }
    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public Cotizacion getCotizacion() {
        return cotizacion;
    }
    public void setCotizacion(Cotizacion cotizacion) {
        this.cotizacion = cotizacion;
    }


	@Override
	public String toString() {
		return "ProductosHasCotizacion [id=" + id + ", producto=" + producto + ", cotizacion=" + cotizacion + "]";
	}
    
    
}