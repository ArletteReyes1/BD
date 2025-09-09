package com.agenciaviajes.agenciaviajes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	@Column(name = "tipo")
	private String tipo;
	@Column(name = "nombre", nullable = false)
	private String nombre;
	@Column(name = "correo", nullable = false, unique = true)
	private String correo;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "contrasena", nullable = false)
	private String contrasena;

	public Usuario(String tipo, String nombre, String correo, String telefono, String contrasena) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.contrasena = contrasena;
	}// constructor

	

	public Usuario() {
	} // constructor vacio

	public Long getId() {
		return id;
	}// traer/devolver id

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", tipo=" + tipo + ", nombre=" + nombre + ", correo=" + correo + ", telefono="
				+ telefono + "]";
	}
}
