package com.agenciaviajes.Agencia_Viajes.controller;

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

import com.agenciaviajes.Agencia_Viajes.model.Productos;
import com.agenciaviajes.Agencia_Viajes.model.Usuario;
import com.agenciaviajes.Agencia_Viajes.model.cotizacion;
import com.agenciaviajes.Agencia_Viajes.service.UsuarioService;

@RestController
@RequestMapping(path="/api/Usuarios/") //http://localhost:8080/api/Usuarios/
public class UsuarioController {

	private final UsuarioService service;

	@Autowired
	public UsuarioController(UsuarioService service) {
		this.service = service;
	}//constructor

	//GET
	@GetMapping
	public List<Usuario> getUsuarios(){
		return service.getUsuarios();
	}//getUsuarios
	
	@GetMapping (path="{userId}")  //http://localhost:8080/api/Usuarios/1
		public Usuario getUsuarios(@PathVariable("userId")Long id){
		return service.getUsuarios(id);
	}//getUsuarios

	//DELETE
		@DeleteMapping (path="{userId}") //http://localhost:8080/api/Usuarios/1
		public Usuario deleteUsuarios(@PathVariable("userId")Long id) {
		 return service.deleteUsuarios(id); 
		 }//DeleteUser
		
	//POST
		@PostMapping 
		 public Usuario addUsuario(@RequestBody Usuario usuario) { // el parametro sera Producto, lo voy a solicitar en el cuerpo de la solicitud. y necesito @RequestBody
		  //usamos el contrsuctor vacio que le pusimos a Cotizacion
		  return service.addUsuario(usuario);// Crear el metodo en ProductoService.
		 }//addUsuario
		
	//PUT
		@PutMapping (path="{userId}")
		 public Usuario addUsuario(@PathVariable("userId")Long id, 
		   @RequestParam(required=false)  String tipo,
		   @RequestParam (required=false) String nombre,
		   @RequestParam (required=false) String correo,
		   @RequestParam (required=false) String telefono,
		   @RequestParam (required=false) String contrasena)
		   { /// vamos a pedir todos los parámetros
		  return service.addUsuario(id, tipo, nombre, correo, telefono, contrasena); 
		  }//updateUsuario
	
		
}//classUsuarioController
