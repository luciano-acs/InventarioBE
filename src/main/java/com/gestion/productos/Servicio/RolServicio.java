package com.gestion.productos.Servicio;

import com.gestion.productos.Repositorio.RolRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolServicio {

    @Autowired
    private RolRepositorio repositorio;
}
