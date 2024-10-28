package com.simulador.controller;

import com.simulador.demo.model.Atraccion;
import com.simulador.demo.model.Parque;
import com.simulador.demo.model.Visitante;
import com.simulador.demo.model.Recurso;
import com.simulador.demo.model.Entrada;
import com.simulador.demo.service.AtraccionService;
import com.simulador.demo.service.ParqueService;
import com.simulador.demo.service.VisitanteService;
import com.simulador.demo.service.RecursoService;
import com.simulador.demo.service.EntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parques")
public class ParqueController {

    @Autowired
    private ParqueService parqueService;

    @Autowired
    private AtraccionService atraccionService;

    @Autowired
    private VisitanteService visitanteService;

    @Autowired
    private RecursoService recursoService;

    @Autowired
    private EntradaService entradaService;

    @GetMapping
    public List<Parque> getAllParques() {
        return parqueService.getAllParques();
    }

    @GetMapping("/{id}")
    public Parque getParqueById(@PathVariable int id) {
        return parqueService.getParqueById(id);
    }

    @PostMapping
    public Parque addParque(@RequestBody Parque parque) {
        return parqueService.addParque(parque);
    }

    @PutMapping("/{id}")
    public Parque updateParque(@PathVariable int id, @RequestBody Parque updatedParque) {
        return parqueService.updateParque(id, updatedParque);
    }

    @DeleteMapping("/{id}")
    public void deleteParque(@PathVariable int id) {
        parqueService.deleteParque(id);
    }

    @PostMapping("/{parqueId}/atracciones/{atraccionId}")
    public ResponseEntity<Parque> addAtraccionToParque(@PathVariable int parqueId, @PathVariable int atraccionId) {
        Atraccion atraccion = atraccionService.getAtraccionById(atraccionId);
        if (atraccion != null) {
            parqueService.addAtraccionToParque(parqueId, atraccion);
            return ResponseEntity.ok(parqueService.getParqueById(parqueId));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/{parqueId}/visitantes/{visitanteId}")
    public ResponseEntity<Parque> addVisitanteToParque(@PathVariable int parqueId, @PathVariable int visitanteId) {
        Visitante visitante = visitanteService.getVisitanteById(visitanteId);
        if (visitante != null) {
            parqueService.addVisitanteToParque(parqueId, visitante);
            return ResponseEntity.ok(parqueService.getParqueById(parqueId));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/{parqueId}/recursos/{recursoId}")
    public ResponseEntity<Parque> addRecursoToParque(@PathVariable int parqueId, @PathVariable int recursoId) {
        Recurso recurso = recursoService.getRecursoById(recursoId);
        if (recurso != null) {
            parqueService.addRecursoToParque(parqueId, recurso);
            return ResponseEntity.ok(parqueService.getParqueById(parqueId));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/{parqueId}/entradas/{entradaId}")
    public ResponseEntity<Parque> addEntradaToParque(@PathVariable int parqueId, @PathVariable int entradaId) {
        Entrada entrada = entradaService.getEntradaById(entradaId);
        if (entrada != null) {
            parqueService.addEntradaToParque(parqueId, entrada);
            return ResponseEntity.ok(parqueService.getParqueById(parqueId));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}