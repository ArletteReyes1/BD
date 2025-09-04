package com.agenciaviajes.agenciaviajes.model;

public class Usuario {
	private Long id;
    private String tipo;
    private String nombre;
    private String correo;
    private String telefono;
    private String contrasena;
    
    private static Long total=0L;
	public Usuario(String tipo, String nombre, String correo, String telefono, String contrasena) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.contrasena = contrasena;
		Usuario.total++;
		this.id= Usuario.total;
	}

	public Usuario() {
		Usuario.total++;
		this.id= Usuario.total;
	}// constructor


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


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
				+ telefono + ", contrasena=" + contrasena + "]";
	}
	
	
    
    
}//classUsuario
