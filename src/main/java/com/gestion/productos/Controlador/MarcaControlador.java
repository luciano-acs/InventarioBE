package com.gestion.productos.Controlador;

import com.gestion.productos.Modelo.Marca;
import com.gestion.productos.Servicio.MarcaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marca")
@CrossOrigin
public class MarcaControlador {
    @Autowired
    private MarcaServicio servicio;

    @GetMapping("/listar")
    public List<Marca> listarMarcas(){return servicio.listarMarcas();}
    @PostMapping("/guardar")
    public Marca guardarMarca(@RequestBody Marca marca){return servicio.guardarMarca(marca);}
    @GetMapping("/{id}")
    public ResponseEntity<Marca> obtenerMarca(@PathVariable Integer id){
        try{
            Marca marca = servicio.obtenerMarca(id);
            return new ResponseEntity<Marca>(marca, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Marca>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/modificar/{id}")
    public ResponseEntity<?> modificarMarca(@RequestBody Marca marca, @PathVariable Integer id){
        try{
            Marca marcaE = servicio.obtenerMarca(id);
            marcaE.setNombre(marca.getNombre());
            marcaE.setListaCategoria(marca.getListaCategoria());

            servicio.guardarMarca(marcaE);
            return new ResponseEntity<Marca>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Marca>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarMarca(Integer id){servicio.eliminarMarca(id);}
}
