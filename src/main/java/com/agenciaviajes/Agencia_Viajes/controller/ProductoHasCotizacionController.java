package com.agenciaviajes.Agencia_Viajes.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.agenciaviajes.Agencia_Viajes.model.ProductosHasCotizacion;
import com.agenciaviajes.Agencia_Viajes.service.ProductoHasCotizacionService;
import java.util.List;

@RestController
@RequestMapping(path= "/api/ProductosHasCotizacion/") //http://localhost:8080/api/ProductosHasCotizacion
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

//DELETE
//POST
//PUT
		
}//ProductoHasCotizacionController
