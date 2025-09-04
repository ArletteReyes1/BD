package com.agenciaviajes.Agencia_Viajes.dto;

public class CambiarContrasena {
	private String contrasena;
	private String ncontrasena;
	
	
	public CambiarContrasena(String contrasena, String ncontrasena) {
		super();
		this.contrasena = contrasena;
		this.ncontrasena = ncontrasena;
	}//constructor


	public CambiarContrasena() {
		
	}//contructor vacio


	public String getContrasena() {
		return contrasena;
	}//getContrasena


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}//setContrasena


	public String getNcontrasena() {
		return ncontrasena;
	}//getNcontrasena


	public void setNcontrasena(String ncontrasena) {
		this.ncontrasena = ncontrasena;
	}//setNcontrasena


	@Override
	public String toString() {
		return "CambiarContrasena [contrasena=" + contrasena + ", ncontrasena=" + ncontrasena + "]";
	}//toString
	

	
}//classCambiarContrasena 
