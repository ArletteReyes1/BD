package com.agenciaviajes.agenciaviajes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.agenciaviajes.agenciaviajes.dto.ChangePassword;
import com.agenciaviajes.agenciaviajes.model.Usuario;
import com.agenciaviajes.agenciaviajes.repository.UsuarioRepository;

@Service
public class UsuarioService {
	private final UsuarioRepository repository;
	 @Autowired
	 private PasswordEncoder encoder;
	@Autowired
	public UsuarioService(UsuarioRepository repository) {
		this.repository = repository;
	}// constructor

	public List<Usuario> getAllUsuario() {
		return repository.findAll();
	}// get

	public Usuario getUsuarios(Long id) {
		return repository.findById(id).orElseThrow(
				() -> new IllegalArgumentException("El usuario con el id [" + id + "] no existe"));
	}

	public Usuario deleteUsuarios(Long id) {
		Usuario Usu = null;
		if (repository.existsById(id)) {
			Usu = repository.findById(id).get();
			repository.deleteById(id);
		}
		return Usu;
	}

	public Usuario addUsuario(Usuario usuario) {
		Optional<Usuario> Usu = repository.findByCorreo(usuario.getCorreo());
		if (Usu.isEmpty()) {
			return repository.save(usuario);
		} else {
			System.out.println("El usuario [" + usuario.getCorreo() + "] ya se encuentra registrado");
			return null;
		}
	}

	public Usuario updateUsuario(Long id, String tipo, String nombre, String correo, String telefono, String contrasena) {
		Usuario Usu = null;
		if (repository.existsById(id)) {
			Usu = repository.findById(id).get();
			if (tipo != null)
				Usu.setTipo(tipo);
			if (nombre != null)
				Usu.setNombre(nombre);
			if (correo != null)
				Usu.setCorreo(correo);
			if (telefono != null)
				Usu.setTelefono(telefono);
			if (contrasena != null)
				Usu.setContrasena(contrasena);
			repository.save(Usu); // guardar cambios en la base de datos
		}
		return Usu;
	}// updateUsuario

	public Usuario updateUsuario(Long id, ChangePassword changePassword) {
		Usuario user = null;
		if (repository.existsById(id)) {// encuentra al usuario si es que existe
			user = repository.findById(id).get();
			if (user.getContrasena().equals(changePassword.getContrasena())) {
				user.setContrasena(changePassword.getNcontrasena()); // agregará un nuevo password.
				return repository.save(user);// guardar ese cambio en el repositorio
			} else {
				user = null;
			} // equals
		} // if else
		return user;
	}// updateUsuario

	
	//---------------------------------------ValidarUsuario
	public boolean validateUser(Usuario usuario) {
		Optional <Usuario> user = repository.findByCorreo(usuario.getCorreo() ); //encontrar al usuario poor el emain
		if(user.isPresent() ) { //veo si esta presente
			Usuario tmpUser= user.get();// Saco al usuario de la bolsa
			if(encoder.matches(usuario.getContrasena(), tmpUser.getContrasena()) ){
				//las contraseñas coinciden?
				return true;
			}
		}//if isPResent
		return false;
	}//ValidateUser
}// class UsuarioService
