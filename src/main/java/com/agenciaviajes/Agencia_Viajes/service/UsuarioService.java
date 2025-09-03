package com.agenciaviajes.Agencia_Viajes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.agenciaviajes.Agencia_Viajes.model.Usuario;
import com.agenciaviajes.Agencia_Viajes.model.cotizacion;

@Service
public class UsuarioService {
	private final ArrayList<Usuario>lista = new ArrayList<Usuario>();

@Autowired
public UsuarioService(){
	lista.add(new Usuario("Administrador","Edgar", "edgar@gmail.com", "5534678767", "ABc123*$"));
	lista.add(new Usuario("Usuario","Nadia", "nadia@gmail.com", "5537885412", "ZYz908&!"));
	lista.add(new Usuario("Administrador","Susana", "susanaemosita@gmail.com", "5544221214", "!$MnJ888*."));
	lista.add(new Usuario("Usuario","Capri", "capritoreto@gmail.com", "5522441587", "77/*9hGF."));
	lista.add(new Usuario("Administrador","Maria", "maria23@gmail.com", "5533856669", "*8VCB5Jhg"));
}//UsuarioService

	public List<Usuario> getUsuarios(){
		return lista;
	}

	public Usuario getUsuarios(Long id) {
		Usuario tmpProd = null; //producto temporal, de inicio null y si lo encuentra, lo establece. 
		  for(Usuario user: lista) {
		   if(user.getId()==id) {
		    tmpProd=user;
		    break;
		   }//if
		  }//foreach
		  return tmpProd;
	}

	public Usuario deleteUsuarios(Long id) {
		Usuario tmpProd = null; //producto temporal, de inicio null y si lo encuentra, lo establece. 
		  for(Usuario user: lista) {
		   if(user.getId()==id) {
		    tmpProd=user;
		    lista.remove(user);
		    break;
		   }//if
		  }//foreach
		  return tmpProd;
	}

	public Usuario addUsuario(Usuario usuario) {
		lista.add(usuario);
		  return usuario;
	}//addUsuario

	public Usuario addUsuario(Long id, String tipo, String nombre, String correo, String telefono, String contrasena) {
		Usuario tmpProd = null; 
		  for(Usuario user: lista) {
		   if(user.getId()==id) {
		    tmpProd=user;
		    if(tipo!=null) user.setTipo(tipo);
		    if(nombre!=null) user.setNombre(nombre);
		    if(correo!=null) user.setCorreo(correo);
		    if(telefono!=null) user.setTelefono(telefono);
		    if(contrasena!=null) user.setContrasena(contrasena);
		    tmpProd=user;
		    break;
		   }//if
		  }//foreach
		  return tmpProd;
	}//updateUsuario

}//class UsuarioService


