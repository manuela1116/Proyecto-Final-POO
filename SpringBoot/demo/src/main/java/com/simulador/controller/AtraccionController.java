package com.simulador.controller;

import com.simulador.demo.model.Atraccion;
import com.simulador.demo.service.AtraccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atracciones")
public class AtraccionController {

    @Autowired
    private AtraccionService atraccionService;

    @GetMapping
    public List<Atraccion> getAllAtracciones() {
        return atraccionService.getAllAtracciones();
    }

    @GetMapping("/{id}")
    public Atraccion getAtraccionById(@PathVariable int id) {
        return atraccionService.getAtraccionById(id);
    }

    @PostMapping
    public ResponseEntity<Atraccion> addAtraccion(@RequestBody Atraccion atraccion) {
        Atraccion nuevaAtraccion = atraccionService.addAtraccion(atraccion);
        return ResponseEntity.ok(nuevaAtraccion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Atraccion> updateAtraccion(@PathVariable int id, @RequestBody Atraccion atraccion) {
        Atraccion atraccionActualizada = atraccionService.updateAtraccion(id, atraccion);
        return ResponseEntity.ok(atraccionActualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAtraccion(@PathVariable int id) {
        atraccionService.deleteAtraccion(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}/iniciar")
    public void iniciarAtraccion(@PathVariable int id) {
        atraccionService.iniciarAtraccion(id);
    }

    @PostMapping("/{id}/detener")
    public void detenerAtraccion(@PathVariable int id) {
        atraccionService.detenerAtraccion(id);
    }

    @PostMapping("/{id}/mantenimiento")
    public void realizarMantenimiento(@PathVariable int id) {
        atraccionService.realizarMantenimientoAtraccion(id);
    }
}