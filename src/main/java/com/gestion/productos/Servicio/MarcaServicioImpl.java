package com.gestion.productos.Servicio;

import com.gestion.productos.Modelo.Marca;
import com.gestion.productos.Repositorio.MarcaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServicioImpl implements MarcaServicio{

    @Autowired
    private MarcaRepositorio repositorio;
    @Override
    public List<Marca> listarMarcas() {
        return repositorio.findAll();
    }

    @Override
    public Marca guardarMarca(Marca marca) {
        return repositorio.save(marca);
    }

    @Override
    public Marca obtenerMarca(Integer id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Marca actualizarMarca(Marca marca, Integer id) {
        return repositorio.findById(id).get();
    }

    @Override
    public void eliminarMarca(Integer id) {
        repositorio.deleteById(id);
    }
}
