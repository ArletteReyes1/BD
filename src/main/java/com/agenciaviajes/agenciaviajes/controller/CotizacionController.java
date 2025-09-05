package com.agenciaviajes.agenciaviajes.controller;

import java.util.List;

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


import com.agenciaviajes.agenciaviajes.model.Cotizacion;
import com.agenciaviajes.agenciaviajes.model.Usuario;
import com.agenciaviajes.agenciaviajes.service.CotizacionService;

@RestController
@RequestMapping(path="/api/Cotizacion/") //http://localhost:8080/api/Cotizacion/
public class CotizacionController {
	private final CotizacionService service;
	@Autowired
	public CotizacionController(CotizacionService service) {
		this.service = service;
	}//constructor

	//GET
	@GetMapping
	public List<Cotizacion> geCotizacion(){
		return service.getCotizacion();
	}//getCotizacion
	
	@GetMapping (path="{cotId}")  //http://localhost:8080/api/Cotizacion/1
		public Cotizacion getCotizacion(@PathVariable("cotId")Long id){
		return service.getCotizacion(id);
	}//getCotizacion

	
	//DELETE
	@DeleteMapping (path="{cotId}")  //http://localhost:8080/api/Cotizacion/1
	public Cotizacion deleteCotizacion(@PathVariable("cotId")Long id){
	return service.deleteCotizacion(id);
	}//getCotizacion
	
	//POST
	@PostMapping 
	 public Cotizacion addCotizacion(@RequestBody Cotizacion cotizacion) { // el parametro sera Producto, lo voy a solicitar en el cuerpo de la solicitud. y necesito @RequestBody
	  //usamos el contrsuctor vacio que le pusimos a Cotizacion
	  return service.addCotizacion(cotizacion);// Crear el metodo en ProductoService.
	 }//addCotizacion
	
	//PUT
	@PutMapping (path="{cotId}")
	 public Cotizacion updateCotizacion(@PathVariable("cotId")Long id, 
	   @RequestParam(required=false)  String fecha,
	   @RequestParam (required=false) Usuario usuario)  { /// vamos a pedir todos los parámetros
	  return service.updateCotizacion(id, fecha, usuario); 
	  }//updateCotizacion
	
	
}//classCotizacionController
