package com.simulador.controller;

import com.simulador.demo.model.Recurso;
import com.simulador.demo.service.RecursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recursos")
public class RecursoController {

    @Autowired
    private RecursoService recursoService;

    @GetMapping
    public List<Recurso> getAllRecursos(){
        return recursoService.getAllRecursos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recurso> getRecursoById(@PathVariable int id) {
        Recurso recurso = recursoService.getRecursoById(id);
        if (recurso != null) {
            return ResponseEntity.ok(recurso);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Recurso> addRecurso(@RequestBody Recurso recurso) {
        try {
            Recurso createdRecurso = recursoService.addRecurso(recurso);
            return ResponseEntity.ok(createdRecurso);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Recurso> updateRecurso(@PathVariable int id, @RequestBody Recurso updatedRecurso) {
        try {
            Recurso recurso = recursoService.updateRecurso(id, updatedRecurso);
            if (recurso != null) {
                return ResponseEntity.ok(recurso);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecurso(@PathVariable int id) {
        try {
            recursoService.deleteRecurso(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}