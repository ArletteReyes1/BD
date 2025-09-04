package com.agenciaviajes.agenciaviajes.service;

import java.util.List;
import java.util.Optional;
//import com.agenciaviajes.Agencia_Viajes.dto.CambiarContrasena;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD:src/main/java/com/agenciaviajes/agenciaviajes/service/UsuarioService.java
import com.agenciaviajes.agenciaviajes.model.Usuario;
import com.agenciaviajes.agenciaviajes.model.cotizacion;
=======
import com.agenciaviajes.Agencia_Viajes.dto.CambiarContrasena;
import com.agenciaviajes.Agencia_Viajes.model.Usuario;
import com.agenciaviajes.Agencia_Viajes.repository.UsuarioRepository;
>>>>>>> regisJlp:src/main/java/com/agenciaviajes/Agencia_Viajes/service/UsuarioService.java

@Service
public class UsuarioService {
	private final UsuarioRepository repository;

@Autowired
public UsuarioService(UsuarioRepository repository){
	this.repository=repository;
}//UsuarioService

	public List<Usuario> getUsuarios(){
		return repository.findAll();
	}

	public Usuario getUsuarios(Long id) {
		return repository.findById(id).orElseThrow(
                ()-> new IllegalArgumentException("El usuario con el id[" + id +"] no existe")
                );
	}

	public Usuario deleteUsuarios(Long id) {
		Usuario tmpUser = null; //producto temporal, de inicio null y si lo encuentra, lo establece. 
		if(repository.existsById(id)) {
            tmpUser = repository.findById(id).get();
            repository.deleteById(id);
    }//if
    return tmpUser; //tmp es de producto temporal
	}

	public Usuario addUsuario(Usuario usuario) {
		Optional<Usuario> user = repository.findByEmail(usuario.getCorreo());
        if(user.isEmpty()) {
                repository.save(usuario);
        }else {
                usuario=null;
        }
        return usuario;
	}//addUsuario

	public Usuario updateUsuario(Long id, CambiarContrasena cambiarContrasena) {
		Usuario user= null;
        if(repository.existsById(id)) {//encuentra al usuario si es que existe
                user = repository.findById(id).get();
                if(user.getContrasena().equals(cambiarContrasena.getContrasena())) {
                        user.setContrasena(cambiarContrasena.getNcontrasena()); //agregará un nuevo password. 
                        return repository.save(user);//guardar ese cambio enel repositorio
                }else {
                        user= null;
                }//equals
        }//if else
        return null;
	}
	
	


}//class UsuarioService


