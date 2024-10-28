package com.simulador.controller;

import com.simulador.demo.model.Niño;
import com.simulador.demo.service.NiñoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/niños")
public class NiñoController {

    @Autowired
    private NiñoService niñoService;

    @GetMapping
    public List<Niño> getAllNiños() {
        return niñoService.getAllNiños();
    }

    @GetMapping("/{nombre}")
    public Niño getNiño(@PathVariable String nombre) {
        return niñoService.getNiñoByNombre(nombre);
    }

    @PostMapping
    public void addNiño(@RequestBody Niño niño) {
        niñoService.addNiño(niño);
    }

    @PutMapping("/{nombre}")
    public void updateNiño(@PathVariable String nombre, @RequestBody Niño niño) {
        niñoService.updateNiño(nombre, niño);
    }

    @DeleteMapping("/{nombre}")
    public void deleteNiño(@PathVariable String nombre) {
        niñoService.deleteNiño(nombre);
    }
}