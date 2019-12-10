package com.arep.proyecto.proyecto.model;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "retiro", schema = "inv")
public class Retiro {

    @Id
    private String id;

    @Column(name = "fecha_retiro", unique = true, nullable = false)
    private Date fechaRetiro;

    @Column(name = "cantidad", unique = true, nullable = false)
    @DecimalMin("0.00")
    private BigDecimal cantidad;

    @JoinColumn(name = "trabajador", unique = true, nullable = false)
    @OneToOne
    private Trabajador trabajador;

    @JoinColumn(name = "material", unique = true, nullable = false)
    @OneToOne
    private Material material;

    public Retiro() {
    }

    public Retiro(String id, Date fechaRetiro, BigDecimal cantidad, Trabajador trabajador, Material material) {
        this.id = id;
        this.fechaRetiro = fechaRetiro;
        this.cantidad = cantidad;
        this.trabajador = trabajador;
        this.material = material;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
