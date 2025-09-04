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
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD:src/main/java/com/agenciaviajes/agenciaviajes/controller/UsuarioController.java
import com.agenciaviajes.agenciaviajes.model.Productos;
import com.agenciaviajes.agenciaviajes.model.Usuario;
import com.agenciaviajes.agenciaviajes.model.cotizacion;
import com.agenciaviajes.agenciaviajes.service.UsuarioService;
=======
import com.agenciaviajes.Agencia_Viajes.dto.CambiarContrasena;
import com.agenciaviajes.Agencia_Viajes.model.Usuario;
import com.agenciaviajes.Agencia_Viajes.service.UsuarioService;
>>>>>>> regisJlp:src/main/java/com/agenciaviajes/Agencia_Viajes/controller/UsuarioController.java

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
		 public Usuario addUsuario(@RequestBody Usuario usuarios) { 
		  return service.addUsuario(usuarios);// Crear el metodo en ProductoService.
		 }//addUsuario
		
	//PUT
		@PutMapping (path="{userId}")
		 public Usuario addUsuario(@PathVariable ("userID") Long id,
				 @RequestBody CambiarContrasena cambiarContrasena) {
		  return service.updateUsuario(id, cambiarContrasena); 
		  }//updateUsuario
		
	
		
}//classUsuarioController
