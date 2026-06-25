package com.Seguridad_vecinal.login_api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Seguridad_vecinal.login_api.model.Usuario;

@RestController
@RequestMapping("/api")
public class AuthController {

    @PostMapping("/registro")
    public String registrarUsuario(@RequestBody Usuario usuario) {
        return "Usuario registrado correctamente";
    }

    @PostMapping("/login")
    public String iniciarSesion(@RequestBody Usuario usuario) {
        if (usuario.getPassword() == null || usuario.getUsername() == null) {
            return "Error en la autenticación";
        }

        // Datos fijos de prueba para evitar pérdidas por reinicio de servidor
        String miUsernameValido = "adan";
        String miEmailValido = "adan@correo.com";
        String miPasswordValida = "12345";

        // 1. Validamos la contraseña
        if (usuario.getPassword().equals(miPasswordValida)) {
            
            // 2. Extraemos lo introducido en el campo username del JSON
            String identificadorIntroducido = usuario.getUsername();
            
            // 3. Comparamos contra el username fijo O el email fijo
            if (identificadorIntroducido.equals(miUsernameValido) || identificadorIntroducido.equals(miEmailValido)) {
                return "Autenticación satisfactoria";
            }
        }
        
        return "Error en la autenticación";
    }
}