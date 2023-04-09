package com.gestion.productos.Servicio;

import com.gestion.productos.Repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {

    @Autowired UsuarioRepositorio repositorio;
}
