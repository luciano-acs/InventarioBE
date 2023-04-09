package com.gestion.productos.Servicio;

import com.gestion.productos.Modelo.Producto;

import java.util.List;

public interface ProductoServicio {

    public List<Producto> listarProductos();
    public Producto guardarProducto(Producto producto);
    public Producto obtenerProducto(Integer id);
    public Producto actualizarProducto(Producto producto, Integer id);
    public void eliminarProducto(Integer id);
}
