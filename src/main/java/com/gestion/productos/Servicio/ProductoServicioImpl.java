package com.gestion.productos.Servicio;

import com.gestion.productos.Modelo.Producto;
import com.gestion.productos.Repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicioImpl implements ProductoServicio{

    @Autowired
    private ProductoRepositorio repositorio;

    @Override
    public List<Producto> listarProductos() {
        return repositorio.findAll();
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return repositorio.save(producto);
    }

    @Override
    public Producto obtenerProducto(Integer id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Producto actualizarProducto(Producto producto, Integer id) {
        return repositorio.findById(id).get();
    }

    @Override
    public void eliminarProducto(Integer id) {
        repositorio.deleteById(id);
    }
}
