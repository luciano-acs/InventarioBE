package com.gestion.productos.Modelo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;
@Entity
public class Marca {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true, nullable = false, length = 45)
    private String nombre;
    @OneToMany(mappedBy = "marca")
    @JsonIgnore
    private List<Categoria> listaCategoria;

    public Marca(Integer id, String nombre, List<Categoria> listaCategoria) {
        this.id = id;
        this.nombre = nombre;
        this.listaCategoria = listaCategoria;
    }

    public Marca() {
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

    public List<Categoria> getListaCategoria() {
        return listaCategoria;
    }

    public void setListaCategoria(List<Categoria> listaCategoria) {
        this.listaCategoria = listaCategoria;
    }
}
