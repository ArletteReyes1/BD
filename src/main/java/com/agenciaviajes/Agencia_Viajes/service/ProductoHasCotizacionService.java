package com.agenciaviajes.Agencia_Viajes.service;
import java.util.ArrayList;
import java.util.List;

import com.agenciaviajes.Agencia_Viajes.model.Productos;
import com.agenciaviajes.Agencia_Viajes.model.ProductosHasCotizacion;
import com.agenciaviajes.Agencia_Viajes.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductoHasCotizacionService {
    private final ArrayList<ProductosHasCotizacion> lista = new ArrayList<ProductosHasCotizacion>();
@Autowired
    public ProductoHasCotizacionService() {
        lista.add(new ProductosHasCotizacion((long)1, (long)1));
        lista.add(new ProductosHasCotizacion((long)1,(long) 2));
        lista.add(new ProductosHasCotizacion((long)1,(long) 3));
        lista.add(new ProductosHasCotizacion((long)1,(long)4));
        lista.add(new ProductosHasCotizacion((long)1,(long) 5));    
    }

    // 
    public List<ProductosHasCotizacion> getProductosHasCotizacion() {
        return lista;
    }

	
	public ProductosHasCotizacion getProductosHasCotizacion(Long id) {
		ProductosHasCotizacion tmpProd = null; //producto temporal, de inicio null y si lo encuentra, lo establece. 
		  for(ProductosHasCotizacion prod: lista) {
		   if(prod.getId()==id) {
		    tmpProd=prod;
		    break;
		   }//if
		  }//foreach
		  return tmpProd;
	}

	public ProductosHasCotizacion deleteProductos(Long id) {
		ProductosHasCotizacion tmpProd = null; //producto temporal, de inicio null y si lo encuentra, lo establece. 
		  for(ProductosHasCotizacion prod: lista) {
		   if(prod.getId()==id) {
		    tmpProd=prod;
		    lista.remove(prod);
		    break;
		   }//if
		  }//foreach
		  return tmpProd;
	}

	public ProductosHasCotizacion addProductosHasCotizacion(ProductosHasCotizacion productosHasCotizacion) {
		lista.add(productosHasCotizacion);
		  return productosHasCotizacion;
	}

	public ProductosHasCotizacion addProductosHasCotizacion(Long id, Long fkIdProductos, Long fkIdCotizacion) {
		ProductosHasCotizacion tmpProd = null; 
		  for(ProductosHasCotizacion prod: lista) {
		   if(prod.getId()==id) {
		    tmpProd=prod;
		    if(fkIdProductos!=null) prod.setFkIdProductos(fkIdProductos);
		    if(fkIdCotizacion!=null) prod.setFkIdCotizacion(fkIdCotizacion);
		    tmpProd=prod;
		    break;
		   }//if
		  }//foreach
		  return tmpProd;
	}
}

