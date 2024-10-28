package com.simulador.controller;

import com.simulador.demo.model.Visitante;
import com.simulador.demo.service.AtraccionService;
import com.simulador.demo.service.VisitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitantes")
public class VisitanteController {

    @Autowired
    private VisitanteService visitanteService;

    @Autowired
    private AtraccionService atraccionService;

    @GetMapping
    public List<Visitante> getAllVisitantes() {
        return visitanteService.getAllVisitantes();
    }

    @GetMapping("/{id}")
    public Visitante getVisitanteById(@PathVariable int id) {
        return visitanteService.getVisitanteById(id);
    }

    @PostMapping
    public Visitante addVisitante(@RequestBody Visitante visitante) {
        return visitanteService.addVisitante(visitante);
    }

    @PutMapping("/{id}")
    public Visitante updateVisitante(@PathVariable int id, @RequestBody Visitante updatedVisitante) {
        return visitanteService.updateVisitante(id, updatedVisitante);
    }

    @DeleteMapping("/{id}")
    public void deleteVisitante(@PathVariable int id) {
        visitanteService.deleteVisitante(id);
    }
}