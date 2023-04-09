package com.gestion.productos.Repositorio;

import com.gestion.productos.Modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario,Integer> {
}
