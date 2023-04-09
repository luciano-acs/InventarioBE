package com.gestion.productos.Controlador;

import com.gestion.productos.Servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio servicio;
}
