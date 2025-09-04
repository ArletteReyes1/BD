package com.agenciaviajes.agenciaviajes.model;

public class ChangePassword {
  private String password; // contraseña actual
  private String npassword; // nueva contraseña

  public ChangePassword() {
  }

  public ChangePassword(String password, String npassword) {
    this.password = password;
    this.npassword = npassword;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNpassword() {
    return npassword;
  }

  public void setNpassword(String npassword) {
    this.npassword = npassword;
  }
}
