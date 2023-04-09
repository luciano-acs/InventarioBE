package com.gestion.productos.Servicio;

import com.gestion.productos.Modelo.Categoria;
import com.gestion.productos.Repositorio.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CategoriaServicioImpl implements CategoriaServicio{

    @Autowired
    private CategoriaRepositorio repositorio;

    @Override
    public List<Categoria> listarCategorias(){return repositorio.findAll();}

    @Override
    public Categoria guardarCategoria(Categoria categoria){return repositorio.save(categoria);}

    @Override
    public Categoria obtenerCategoria(Integer idCat){return repositorio.findById(idCat).get();}

    @Override
    public Categoria modificarCategoria(Categoria categoria, Integer id) {
        return repositorio.findById(id).get();
    }
    @Override
    public void eliminarCategoria(Integer idCat){repositorio.deleteById(idCat);}
}

