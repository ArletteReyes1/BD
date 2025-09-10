package com.agenciaviajes.agenciaviajes.dto;

public class ChangePassword {
	   private String contrasena;
       private String ncontrasena;
       
	public ChangePassword(String contrasena, String ncontrasena) {
		super();
		this.contrasena = contrasena;
		this.ncontrasena = ncontrasena;
	}
	
	public ChangePassword() {
		
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public String getNcontrasena() {
		return ncontrasena;
	}
	
	public void setNcontrasena(String ncontrasena) {
		this.ncontrasena = ncontrasena;
	}

	@Override
	public String toString() {
		return "ChangePassword [contrasena=" + contrasena + ", ncontrasena=" + ncontrasena + "]";
	}
       
		
}
