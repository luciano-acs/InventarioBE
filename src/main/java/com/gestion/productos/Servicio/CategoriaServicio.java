package com.gestion.productos.Servicio;

import com.gestion.productos.Modelo.Categoria;

import java.util.List;

public interface CategoriaServicio {

    public List<Categoria> listarCategorias();
    public Categoria guardarCategoria(Categoria categoria);
    public Categoria obtenerCategoria(Integer id);
    public Categoria modificarCategoria(Categoria categoria, Integer id);
    public void eliminarCategoria(Integer id);

}
