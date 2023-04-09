package com.gestion.productos.Servicio;

import com.gestion.productos.Modelo.Marca;
import com.gestion.productos.Repositorio.MarcaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MarcaServicio {

    public List<Marca> listarMarcas();
    public Marca guardarMarca(Marca marca);
    public Marca obtenerMarca(Integer id);
    public Marca actualizarMarca(Marca marca, Integer id);
    public void eliminarMarca(Integer id);
}
