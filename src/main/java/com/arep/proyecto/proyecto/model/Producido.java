package com.arep.proyecto.proyecto.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "ingreso", schema = "inv")
public class Producido {

    @Id
    private String id;

    @Column(name = "fecha", unique = true, nullable = false)
    private Date fecha;

    @Column(name = "tipo", unique = true, nullable = false)
    private String tipo;

    @JoinColumn(name = "encargado", unique = true, nullable = false)
    @OneToOne
    private Trabajador encargado;

    @Column(name = "cantidad", unique = true, nullable = false)
    private int cantidad;

    @JoinColumn(name = "retiro", unique = true, nullable = false)
    @OneToOne
    private Retiro retiro;

    public Producido() {
    }

    public Producido(String id, Date fecha, String tipo, Trabajador encargado, int cantidad, Retiro retiro) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.encargado = encargado;
        this.cantidad = cantidad;
        this.retiro = retiro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Trabajador getEncargado() {
        return encargado;
    }

    public void setEncargado(Trabajador encargado) {
        this.encargado = encargado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Retiro getRetiro() {
        return retiro;
    }

    public void setRetiro(Retiro retiro) {
        this.retiro = retiro;
    }
}

