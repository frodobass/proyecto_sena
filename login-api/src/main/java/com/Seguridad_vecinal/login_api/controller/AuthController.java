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
    // Aquí ya puedes usar los datos recibidos, por ejemplo:
    return "Usuario " + usuario.getUsername() + " recibido correctamente";
}
}