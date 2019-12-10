package com.arep.proyecto.proyecto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import java.math.BigDecimal;

@Entity
@Table(name = "material", schema = "inv")
public class Material {

    @Id
    private String nombre;

    @Column(name = "cantidad", unique = true, nullable = false)
    @DecimalMin("0.00")
    private BigDecimal cantidad;

    @Column(name = "unidad", unique = true, nullable = false)
    private String unidad;

    public Material() {
    }

    public Material(String nombre, BigDecimal cantidad, String unidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}
