package com.agenciaviajes.agenciaviajes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenciaviajes.agenciaviajes.model.Usuario;
import com.agenciaviajes.agenciaviajes.model.ChangePassword;
import com.agenciaviajes.agenciaviajes.repository.UsuarioRepository;

@Service
public class UsuarioService {
	private final UsuarioRepository repository;

	@Autowired
	public UsuarioService(UsuarioRepository repository) {
		this.repository = repository;
	}// constructor

	public List<Usuario> getUsuarios() {
		return repository.findAll();
	}// get

	public Usuario getUsuarios(Long id) {
		return repository.findById(id).orElseThrow(
				() -> new IllegalArgumentException("El usuario con el id [" + id + "] no existe"));
	}

	public Usuario deleteUsuarios(Long id) {
		Usuario tmpUsu = null;
		if (repository.existsById(id)) {
			tmpUsu = repository.findById(id).get();
			repository.deleteById(id);
		}
		return tmpUsu;
	}

	public Usuario addUsuario(Usuario usuario) {
		Optional<Usuario> usu = repository.findByCorreo(usuario.getCorreo());
		if (usu.isEmpty()) {
			repository.save(usuario);
		} else {
			usuario = null;
		}
		return usuario;
	}

	public Usuario addUsuario(Long id, String tipo, String nombre, String correo, String telefono, String contrasena) {
		Usuario tmpProd = null;
		if (repository.existsById(id)) {
			tmpProd = repository.findById(id).get();
			if (tipo != null)
				tmpProd.setTipo(tipo);
			if (nombre != null)
				tmpProd.setNombre(nombre);
			if (correo != null)
				tmpProd.setCorreo(correo);
			if (telefono != null)
				tmpProd.setTelefono(telefono);
			if (contrasena != null)
				tmpProd.setContrasena(contrasena);
			repository.save(tmpProd); // guardar cambios en la base de datos
		}
		return tmpProd;
	}// updateUsuario

	public Usuario updateUsuario(Long id, ChangePassword changePassword) {
		Usuario user = null;
		if (repository.existsById(id)) {// encuentra al usuario si es que existe
			user = repository.findById(id).get();
			if (user.getContrasena().equals(changePassword.getPassword())) {
				user.setContrasena(changePassword.getNpassword()); // agregará un nuevo password.
				return repository.save(user);// guardar ese cambio en el repositorio
			} else {
				user = null;
			} // equals
		} // if else
		return user;
	}// updateUsuario

}// class UsuarioService
