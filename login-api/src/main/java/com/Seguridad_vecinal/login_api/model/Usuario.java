package com.Seguridad_vecinal.login_api.model;

public class Usuario {
    
    private String username;
    private String password;
    private String email;

    // Constructor vacío (Obligatorio para Spring)
    public Usuario() {
    }

    // Constructor con parámetros
    public Usuario(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Getters y Setters (Obligatorios para que Spring lea los datos)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
       return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}