package com.agenciaviajes.agenciaviajes.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agenciaviajes.agenciaviajes.model.Cotizacion;
import com.agenciaviajes.agenciaviajes.model.Productos;
import com.agenciaviajes.agenciaviajes.model.ProductosHasCotizacion;
import com.agenciaviajes.agenciaviajes.service.ProductoHasCotizacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping(path="/api/ProductosHasCotizacion/") //http://localhost:8080/api/ProductosHasCotizacion/
public class ProductoHasCotizacionController {
private final ProductoHasCotizacionService service;
@Autowired
public ProductoHasCotizacionController(ProductoHasCotizacionService service) {
	this.service=service;
}//constructor

//GET
@GetMapping
public List<ProductosHasCotizacion>getProductos(){
	return service.getProductosHasCotizacion();
}//getProductosHasCotizacion

//GET
@GetMapping (path="{prodId}")
public ProductosHasCotizacion getProductos(@PathVariable("prodId")Long Id) {
	return service.getProductosHasCotizacion(Id);
}//getProductosHasCotizacion

//DELETE
@DeleteMapping (path="{prodId}") //http://localhost:8080/api/ProductosHasCotizacion/1
public ProductosHasCotizacion deleteProductos(@PathVariable("prodId")Long id) {
 return service.deleteProductos(id); 
 }//DeleteProductosHasCotizacion

//POST
@PostMapping 
public ProductosHasCotizacion addProductosHasCotizacion(@RequestBody ProductosHasCotizacion ProductosHasCotizacion) { 
 return service.addProductosHasCotizacion(ProductosHasCotizacion);
}//addCotizacion


//PUT
@PutMapping (path="{prodId}")
public ProductosHasCotizacion updateProductosHasCotizacion(@PathVariable("prodId")Long id, 
  @RequestParam (required=false) Productos producto,
  @RequestParam (required=false) Cotizacion cotizacion)
  { // vamos a pedir todos los parámetros
 return service.updateProductosHasCotizacion(id, producto, cotizacion); 
 }//updateProductosHasCotizacion


}//ProductoHasCotizacionController
