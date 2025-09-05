package com.agenciaviajes.agenciaviajes.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agenciaviajes.agenciaviajes.model.Productos;
import com.agenciaviajes.agenciaviajes.model.ProductosHasCotizacion;
import com.agenciaviajes.agenciaviajes.model.Usuario;
import com.agenciaviajes.agenciaviajes.model.cotizacion;
import com.agenciaviajes.agenciaviajes.service.ProductosService;

import java.util.List;

@RestController
@RequestMapping(path="/api/Productos/") //http://localhost:8080/api/Productos/
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
	
	@GetMapping (path="{prodId}")  //http://localhost:8080/api/Productos/1
		public Productos getProductos(@PathVariable("prodId")Long id){
		return service.getProductos(id);
	}//getProductos

	
	//DELETE
	@DeleteMapping (path="{prodId}") //http://localhost:8080/api/Productos/1
	public Productos deleteProductos(@PathVariable("prodId")Long id) {
	 return service.deleteProductos(id); 
	 }//DeleteProductos
	
	
	//POST
	@PostMapping 
	 public Productos addProductos(@RequestBody Productos productos) { // el parametro sera Producto, lo voy a solicitar en el cuerpo de la solicitud. y necesito @RequestBody
	  //usamos el contrsuctor vacio que le pusimos a Cotizacion
	  return service.addProductos(productos);// Crear el metodo en ProductoService.
	 }//addProductos
	
	//PUT
	@PutMapping (path="{prodId}")
	 public Productos updateProductos(@PathVariable("prodId")Long id, 
	   @RequestParam(required=false)  String titulo,
	   @RequestParam (required=false) String imagenUrl,
	   @RequestParam (required=false) Double precio,
	   @RequestParam (required=false) String lugares,
	   @RequestParam (required=false) Integer dias,
	   @RequestParam (required=false) Integer noches,
	   @RequestParam (required=false) String incluye,
	   @RequestParam (required=false) String noIncluye)
	   { /// vamos a pedir todos los parámetros
	  return service.updateProductos(id, titulo, imagenUrl, precio, lugares, dias, noches, incluye, noIncluye); 
	  }//updateproductos
	
}//classProductosController
