package com.agenciaviajes.agenciaviajes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.agenciaviajes.agenciaviajes.model.Cotizacion;
import com.agenciaviajes.agenciaviajes.model.Productos;
import com.agenciaviajes.agenciaviajes.model.ProductosHasCotizacion;
import com.agenciaviajes.agenciaviajes.repository.ProductosHasCotizacionRepository;


@Service
public class ProductoHasCotizacionService {
	private final ProductosHasCotizacionRepository repository;

@Autowired
    public ProductoHasCotizacionService(ProductosHasCotizacionRepository repository) {
	this.repository = repository;
}//constructor
    // 
    public List<ProductosHasCotizacion> getProductosHasCotizacion() {
    	 return repository.findAll();
    }

	
	public ProductosHasCotizacion getProductosHasCotizacion(Long id) {
		return repository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("El producto con el id [" + id + "] no existe")
				);
	}//getPRoduct

	public ProductosHasCotizacion deleteProductos(Long id) {
		ProductosHasCotizacion tmpProdCot = null; //producto temporal, de inicio null y si lo encuentra, lo establece. 
		if(repository.existsById(id)) {
			tmpProdCot = repository.findById(id).get(); //traer el producto
			repository.deleteById(id);
		}//id
		return tmpProdCot;
	}//deleteProduct

	public ProductosHasCotizacion addProductosHasCotizacion(ProductosHasCotizacion productosHasCotizacion) {
		Optional <ProductosHasCotizacion> prodCot = repository.findById(productosHasCotizacion.getId() );//regresa el Optional / la bolsa vacia
		if( prodCot.isEmpty()) {
			repository.save(productosHasCotizacion);
		}else {
			productosHasCotizacion=null;
		}//else
		return productosHasCotizacion;
	}//addProduct
		
	public ProductosHasCotizacion updateProductosHasCotizacion(Long id, Productos producto, Cotizacion cotizacion) {
		ProductosHasCotizacion tmpProdCot = null; 
		if(repository.existsById(id)) {
			ProductosHasCotizacion prodCot = repository.findById(id).get();
				if(producto!=null) prodCot.setProducto(producto);
				if(cotizacion!=null) prodCot.setCotizacion(cotizacion);
				repository.save(prodCot);
				tmpProdCot=prodCot;
			}//if
		return tmpProdCot;
	}
}

