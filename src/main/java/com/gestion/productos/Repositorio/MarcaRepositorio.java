package com.gestion.productos.Repositorio;
import com.gestion.productos.Modelo.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepositorio extends JpaRepository<Marca,Integer> {
}
