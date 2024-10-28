package com.simulador.controller;

import com.simulador.demo.model.Entrada;
import com.simulador.demo.service.EntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entradas")
public class EntradaController {

    @Autowired
    private EntradaService entradaService;

    @GetMapping
    public List<Entrada> getAllEntradas() {
        return entradaService.getAllEntradas();
    }

    @GetMapping("/{id}")
    public Entrada getEntrada(@PathVariable int id) {
        return entradaService.getEntradaById(id);
    }

    @PostMapping
    public void addEntrada(@RequestBody Entrada entrada) {
        entradaService.addEntrada(entrada);
    }

    @PutMapping("/{id}")
    public void updateEntrada(@PathVariable int id, @RequestBody Entrada entrada) {
        entradaService.updateEntrada(id, entrada);
    }

    @DeleteMapping("/{id}")
    public void deleteEntrada(@PathVariable int id) {
        entradaService.deleteEntrada(id);
    }
}