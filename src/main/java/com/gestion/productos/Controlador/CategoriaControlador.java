package com.gestion.productos.Controlador;

import com.gestion.productos.Modelo.Categoria;
import com.gestion.productos.Servicio.CategoriaServicio;
import com.gestion.productos.Servicio.CategoriaServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/categoria")
@CrossOrigin
public class CategoriaControlador {

    @Autowired
    private CategoriaServicio servicio;

    @GetMapping("/listar")
    public List<Categoria> listarCategorias(){return servicio.listarCategorias();}

    @PostMapping("/guardar")
    public void guardarCategoria(@RequestBody Categoria categoria){servicio.guardarCategoria(categoria);}

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> obtenerCategoria(@PathVariable Integer id){
        try{
            Categoria categoria = servicio.obtenerCategoria(id);
            return new ResponseEntity<Categoria>(categoria, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Categoria>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/modificar/{id}")
    public ResponseEntity<?> modificarCategoria(@RequestBody Categoria categoria, @PathVariable Integer id){
        try{
            Categoria categoriaE = servicio.obtenerCategoria(id);
            categoriaE.setNombre(categoria.getNombre());
            return new ResponseEntity<Categoria>(categoriaE, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Categoria>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarCategoria(@PathVariable Integer id){
        servicio.eliminarCategoria(id);
    }


}
