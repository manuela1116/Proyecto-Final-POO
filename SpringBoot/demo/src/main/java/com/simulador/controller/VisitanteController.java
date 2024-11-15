package com.simulador.controller;

import com.simulador.demo.model.Adulto;
import com.simulador.demo.model.Niño;
import com.simulador.demo.model.Visitante;
import com.simulador.demo.service.AtraccionService;
import com.simulador.demo.service.VisitanteService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/add/nino")
    public String addNiño(@RequestBody Niño niño) {
        visitanteService.addVisitante(niño);
        return "Niño agregado exitosamente.";
    }

    @PostMapping("/add/adulto")
    public String addAdulto(@RequestBody Adulto adulto) {
        visitanteService.addVisitante(adulto);
        return "Adulto agregado exitosamente.";
    }

    @PostMapping("/{id}/{accion}")
    public String realizarAccion(@PathVariable int id, @PathVariable String accion) {
        visitanteService.realizarAccion(id, accion);
        return "Acción realizada: " + accion;
    }
}