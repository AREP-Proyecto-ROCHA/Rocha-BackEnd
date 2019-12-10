package com.arep.proyecto.proyecto.services;

import com.arep.proyecto.proyecto.model.*;
import com.arep.proyecto.proyecto.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class InventarioService {

    private TrabajadorRepository trabajadorRepository;

    private IngresoRepository ingresoRepository;

    private MaterialRepository materialRepository;

    private RetiroRepository retiroRepository;

    private ProducidoRepository producidoRepository;

    @Autowired
    public InventarioService(TrabajadorRepository trabajadorRepository, IngresoRepository ingresoRepository, MaterialRepository materialRepository, RetiroRepository retiroRepository, ProducidoRepository producidoRepository) {
        this.trabajadorRepository = trabajadorRepository;
        this.ingresoRepository = ingresoRepository;
        this.materialRepository = materialRepository;
        this.retiroRepository = retiroRepository;
        this.producidoRepository = producidoRepository;
    }

    public void retirar(String trabajadorId, String material, String cantidad){
        Material persistedMaterial = materialRepository.getOne(material);
        persistedMaterial.setCantidad(persistedMaterial.getCantidad().subtract(new BigDecimal(cantidad)));
        Trabajador trabajador = trabajadorRepository.getOne(trabajadorId);
        Retiro retiro = new Retiro( Double.toString(Math.random()+Math.random()),new Date(),new BigDecimal(cantidad),trabajador,persistedMaterial);
        retiroRepository.saveAndFlush(retiro);
    }

    public void ingresar(String trabajadorId, String material, String cantidad){
        Material persistedMaterial = materialRepository.getOne(material);
        persistedMaterial.setCantidad(persistedMaterial.getCantidad().add(new BigDecimal(cantidad)));
        Trabajador trabajador = trabajadorRepository.getOne(trabajadorId);
        Ingreso ingreso = new Ingreso( Double.toString(Math.random()+Math.random()),new Date(),new BigDecimal(cantidad),trabajador,persistedMaterial);
        ingresoRepository.saveAndFlush(ingreso);
    }

    public void producido(String tipo, String trabajadorId, String cantidad, String retiroId){
        Trabajador trabajador = trabajadorRepository.getOne(trabajadorId);
        Retiro retiro = retiroRepository.getOne(retiroId);
        Producido producido = new Producido(Double.toString(Math.random()+Math.random()),new Date(),tipo,
                trabajador,Integer.parseInt(cantidad),retiro);
        producidoRepository.saveAndFlush(producido);
    }

    public List<Material> getMateriales(){
        return materialRepository.findAll();
    }

    public List<Retiro> getRetiros() {

        return retiroRepository.findAll();
    }

    public List<Ingreso> getIngresos() {

        return ingresoRepository.findAll();
    }

    public List<Producido> getProducido() {
        return producidoRepository.findAll();
    }
}
