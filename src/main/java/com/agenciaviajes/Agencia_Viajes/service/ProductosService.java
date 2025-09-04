package com.agenciaviajes.Agencia_Viajes.service;

import org.springframework.stereotype.Service;
import com.agenciaviajes.Agencia_Viajes.model.Productos;
import com.agenciaviajes.Agencia_Viajes.repository.ProductosRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ProductosService {

private final ProductosRepository repository;

//CONSTRUCTOR
public ProductosService(ProductosRepository repository) {
	this.repository=repository;
	}//constructor

//MÉTODO PARA OBTENER LA LISTA DE PRODUCTOS
	public List<Productos> getProductos() {
		return repository.findAll();
	}//getProductos

	
	public Productos getProductos(Long id) {
		return repository.findById(id).orElseThrow(
                ()-> new IllegalArgumentException("El usuario con el id[" + id +"] no existe")
                );
	}

	public Productos deleteProductos(Long id) {
		Productos tmpProd = null; //producto temporal, de inicio null y si lo encuentra, lo establece. 

		   if(repository.existsById(id)) {
		    tmpProd=repository.findById(id).get();
		    repository.deleteById(id);
		   }//if

		  return tmpProd;
	}
	

	public Productos addProductos(Productos productos2) {
		Optional<Productos> prod = repository.findByTitulo(productos2.getTitulo());
        if(prod.isEmpty()) {
                repository.save(productos2);
        }else {
                productos2=null;
        }
        return productos2;
	}

	public Productos updateProductos(Long id, String titulo, String imagenUrl, Double precio, String lugares,
			Integer dias, Integer noches, String incluye, String noIncluye) {
		Productos tmpProd= null;
		
		if(repository.existsById(id)) {
		Productos prod = repository.findById(id).get();
		if(titulo!=null) prod.setTitulo(titulo);
		if(imagenUrl!=null) prod.setImagenUrl(imagenUrl);
		if(precio!=null) prod.setPrecio(precio);
		if(lugares!=null) prod.setLugares(lugares);
		if(dias!=null) prod.setDias(dias);
		if(noches!=null) prod.setNoches(noches);
		if(incluye!=null) prod.setIncluye(incluye);
		if(noIncluye!=null) prod.setNoIncluye(noIncluye);
		repository.save(prod);
		tmpProd=prod;
		}//if
		return tmpProd;
		}//updateProduct


}//classProductosService
