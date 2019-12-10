package com.arep.proyecto.proyecto.controllers;

import com.arep.proyecto.proyecto.model.Ingreso;
import com.arep.proyecto.proyecto.model.Material;
import com.arep.proyecto.proyecto.model.Retiro;
import com.arep.proyecto.proyecto.services.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Payload;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("inventario")
public class InventarioController {

    private InventarioService inventarioService;

    @Autowired
    public InventarioController(InventarioService inventarioService) {
        this.inventarioService = inventarioService;
    }

    @PostMapping("/retirar")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void retirar(@RequestParam String trabajadorId,@RequestParam String material, @RequestParam String cantidad) {
        inventarioService.retirar(trabajadorId,material,cantidad);
    }

    @PostMapping("/ingresar")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void ingresar(@RequestParam String trabajadorId,@RequestParam String material, @RequestParam String cantidad) {
        inventarioService.ingresar(trabajadorId,material,cantidad);
    }

    @GetMapping("/producido")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void producido(@RequestParam String tipo, @RequestParam String trabajadorId, @RequestParam String cantidad,@RequestParam  String retiroId) {
        inventarioService.producido(tipo, trabajadorId,  cantidad, retiroId);
    }

    @GetMapping("/materiales")
    public List<Material> getMateriales() {
        return inventarioService.getMateriales();
    }

    @GetMapping("/retiros")
    public List<Retiro> getRetiros() {
        return inventarioService.getRetiros();
    }

    @GetMapping("/ingresos")
    public List<Ingreso> getIngresos() {
        return inventarioService.getIngresos();
    }
}
