package com.gestion.productos.Controlador;

import com.gestion.productos.Servicio.RolServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RolControlador {

    @Autowired
    private RolServicio servicio;

}
