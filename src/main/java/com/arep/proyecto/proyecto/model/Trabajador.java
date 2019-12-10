package com.arep.proyecto.proyecto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "trabajador", schema = "inv")
public class Trabajador {

    @Id
    private String id;

    @Column(name = "nombre", unique = true, nullable = false)
    private String nombre;

    @Column(name = "cargo", unique = true, nullable = false)
    private String cargo;

    public Trabajador() {
    }

    public Trabajador(String id, String nombre, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
