package com.gestion.productos.Repositorio;

import com.gestion.productos.Modelo.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepositorio extends JpaRepository<Categoria,Integer> {
}
