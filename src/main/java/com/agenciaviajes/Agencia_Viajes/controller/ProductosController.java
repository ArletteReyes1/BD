package com.agenciaviajes.Agencia_Viajes.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.agenciaviajes.Agencia_Viajes.model.Productos;
import com.agenciaviajes.Agencia_Viajes.service.ProductosService;
import java.util.List;

@RestController
@RequestMapping(path= "/api/Productos/") //http://localhost:8080/api/Productos
public class ProductosController {

	private final ProductosService service;

	@Autowired
	public ProductosController(ProductosService service) {
		this.service = service;
	}//constructor

	//GET
	@GetMapping
	public List<Productos> getProductos(){
		return service.getProductos();
	}//getProductos

	//DELETE
	//POST
	//PUT
	
}//classProductosController
