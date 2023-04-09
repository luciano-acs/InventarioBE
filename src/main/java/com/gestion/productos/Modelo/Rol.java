package com.gestion.productos.Modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Rol {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true, nullable = false, length = 25)
    private String nombre;
    @ManyToMany(mappedBy = "listaRol")
    private List<Usuario> listaUsuario;

    public Rol(Integer id, String nombre, List<Usuario> listaUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.listaUsuario = listaUsuario;
    }

    public Rol() {
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

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
}
