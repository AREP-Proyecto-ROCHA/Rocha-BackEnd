package com.arep.proyecto.proyecto.controllers;

import com.arep.proyecto.proyecto.services.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Payload;
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
    public void retirar(@RequestParam String trabajadorId,@RequestParam String material, @RequestParam String cantidad) {


    }

    @PostMapping("/ingresar")
    public void ingresar(@RequestParam String trabajadorId,@RequestParam String material, @RequestParam String cantidad) {


    }
}
