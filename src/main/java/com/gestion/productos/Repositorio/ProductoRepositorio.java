package com.gestion.productos.Repositorio;

import com.gestion.productos.Modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
}
