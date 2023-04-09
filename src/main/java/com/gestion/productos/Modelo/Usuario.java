package com.gestion.productos.Modelo;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 45, unique = true, nullable = false)
    private String email;
    @Column(length = 10, nullable = false)
    private String password;

    @JoinTable(
            name = "usuario_rol",
            joinColumns = @JoinColumn(name = "idUsuario", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "idRol", nullable = false)
    )
    @ManyToMany
    private List<Rol> listaRol;

    public Usuario() {
    }

    public Usuario(Integer id, String email, String password, List<Rol> listaRol) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.listaRol = listaRol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Rol> getListaRol() {
        return listaRol;
    }

    public void setListaRol(List<Rol> listaRol) {
        this.listaRol = listaRol;
    }
}
