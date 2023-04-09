package com.gestion.productos.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Categoria{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 45, unique = true, nullable = false)
    private String nombre;
    @OneToMany(mappedBy = "categoria")
    @JsonIgnore
    private List<Producto> listaProducto;
    @ManyToOne
    @JoinColumn(name = "idMarca")
    private Marca marca;

    public Categoria() {
    }
    public Categoria(Integer id, String nombre, List<Producto> listaProducto, Marca marca) {
        this.id = id;
        this.nombre = nombre;
        this.listaProducto = listaProducto;
        this.marca = marca;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
