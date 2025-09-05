package com.agenciaviajes.agenciaviajes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenciaviajes.agenciaviajes.model.Productos;
import com.agenciaviajes.agenciaviajes.repository.ProductoRepository;


import java.util.List;
import java.util.Optional;

@Service
public class ProductosService {
	 private final ProductoRepository repository;
     @Autowired
     public  ProductosService(ProductoRepository repository) {
    	this.repository = repository;
     }//Constructor
	
//MÉTODO PARA OBTENER LA LISTA DE PRODUCTOS
	public List<Productos> getProductos() {
		return repository.findAll();
	}//getProductos

	
	public Productos getProductos(Long id) {
		return repository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("El producto con el id [" + id + "] no existe")
				);
	}//getProductos

	public Productos deleteProductos(Long id) {
		Productos tmpProd = null; //producto temporal, de inicio null y si lo encuentra, lo establece. 
		if(repository.existsById(id)) {
			tmpProd = repository.findById(id).get(); //traer el producto
			repository.deleteById(id);
		}//id
		return tmpProd;
	}

	public Productos addProductos(Productos productos2) {
		Optional <Productos> prod = repository.findByTitulo(productos2.getTitulo() );//regresa el Optional / la bolsa vacia
		if( prod.isEmpty()) {
			repository.save(productos2);
		}else {
			productos2=null;
		}//else
		return productos2;
	}

	public Productos updateProductos(Long id, String titulo, String imagenUrl, Double precio, String lugares, Integer dias,
			Integer noches, String incluye, String noIncluye) {
		Productos tmpProd = null; 
		if(repository.existsById(id)) {
			Productos prod = repository.findById(id).get();
		    if(titulo!=null) prod.setTitulo(titulo);
		    if(imagenUrl!=null) prod.setImagenUrl(imagenUrl);
		    if(precio!=null) prod.setPrecio(precio);
		    if(lugares!=null) prod.setLugares(lugares);
		    if(dias!= null) prod.setDias(dias);
		    if(noches!=null) prod.setNoches(noches);
		    if(incluye!=null) prod.setIncluye(incluye);
		    if(noIncluye!=null) prod.setNoIncluye(noIncluye);
		    tmpProd=prod;
		   }//if
		  return tmpProd;
	}//addProductos
	



}//classProductosService
