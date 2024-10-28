package com.simulador.controller;

import com.simulador.demo.model.Adulto;
import com.simulador.demo.model.Niño;
import com.simulador.demo.service.AdultoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adultos")
public class AdultoController {

    @Autowired
    private AdultoService adultoService;

    @GetMapping
    public List<Adulto> getAllAdultos() {
        return adultoService.getAllAdultos();
    }

    @GetMapping("/{nombre}")
    public Adulto getAdulto(@PathVariable String nombre) {
        return adultoService.getAdultoByNombre(nombre);
    }

    @PostMapping
    public void addAdulto(@RequestBody Adulto adulto) {
        adultoService.addAdulto(adulto);
    }

    @PutMapping("/{nombre}")
    public void updateAdulto(@PathVariable String nombre, @RequestBody Adulto adulto) {
        adultoService.updateAdulto(nombre, adulto);
    }

    @DeleteMapping("/{nombre}")
    public void deleteAdulto(@PathVariable String nombre) {
        adultoService.deleteAdulto(nombre);
    }
}