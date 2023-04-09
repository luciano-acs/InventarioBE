package com.gestion.productos.Controlador;

import com.gestion.productos.Modelo.Producto;
import com.gestion.productos.Servicio.ProductoServicio;
import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
@CrossOrigin
public class ProductoControlador {

    @Autowired
    private ProductoServicio servicio;

    @GetMapping("/listar")
    public List<Producto> listarProductos(){
        return servicio.listarProductos();
    }

    @PostMapping(path = "/guardar")
    public void guardarProducto(@RequestBody Producto producto){servicio.guardarProducto(producto);}

    @GetMapping("/{id}")
    public ResponseEntity<Producto> obtenerProducto(@PathVariable Integer id){
        try{
            Producto producto = servicio.obtenerProducto(id);
            return new ResponseEntity<Producto>(producto,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/modificar/{id}")
    public ResponseEntity<?> actualizarProducto(@RequestBody Producto producto, @PathVariable Integer id){
        try{
            Producto productoExistente = servicio.obtenerProducto(id);
            productoExistente.setNombre(producto.getNombre());
            productoExistente.setPrecio(producto.getPrecio());

            servicio.guardarProducto(productoExistente);
            return new ResponseEntity<Producto>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarProducto(@PathVariable Integer id){servicio.eliminarProducto(id);}
}
