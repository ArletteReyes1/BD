package com.agenciaviajes.Agencia_Viajes.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.agenciaviajes.Agencia_Viajes.model.ProductosHasCotizacion;
import com.agenciaviajes.Agencia_Viajes.model.Usuario;
import com.agenciaviajes.Agencia_Viajes.model.cotizacion;
import com.agenciaviajes.Agencia_Viajes.service.ProductoHasCotizacionService;
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
public ProductosHasCotizacion addProductosHasCotizacion(@RequestBody ProductosHasCotizacion ProductosHasCotizacion) { // el parametro sera Producto, lo voy a solicitar en el cuerpo de la solicitud. y necesito @RequestBody
 //usamos el contrsuctor vacio que le pusimos a Cotizacion
 return service.addProductosHasCotizacion(ProductosHasCotizacion);// Crear el metodo en ProductoService.
}//addCotizacion


//PUT
@PutMapping (path="{prodId}")
public ProductosHasCotizacion addProductosHasCotizacion(@PathVariable("prodId")Long id, 
  @RequestParam(required=false)  Long Id,
  @RequestParam (required=false) Long fkIdProductos,
  @RequestParam (required=false) Long fkIdCotizacion)
  { /// vamos a pedir todos los parámetros
 return service.addProductosHasCotizacion(id, fkIdProductos, fkIdCotizacion); 
 }//updateProductosHasCotizacion


}//ProductoHasCotizacionController
