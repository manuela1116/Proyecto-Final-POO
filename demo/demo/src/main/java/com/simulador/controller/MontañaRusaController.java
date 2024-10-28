package com.simulador.controller;

import com.simulador.demo.model.MontañaRusa;
import com.simulador.demo.service.MontañaRusaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/montañasrusas")
public class MontañaRusaController {

    @Autowired
    private MontañaRusaService montañaRusaService;

    @GetMapping
    public List<MontañaRusa> getAllMontañasRusas() {
        return montañaRusaService.getAllMontañasRusas();
    }

    @GetMapping("/{nombre}")
    public MontañaRusa getMontañaRusa(@PathVariable String nombre) {
        return montañaRusaService.getMontañaRusaByNombre(nombre);
    }

    @PostMapping
    public void addMontañaRusa(@RequestBody MontañaRusa montañaRusa) {
        montañaRusaService.addMontañaRusa(montañaRusa);
    }

    @PutMapping("/{nombre}")
    public void updateMontañaRusa(@PathVariable String nombre, @RequestBody MontañaRusa montañaRusa) {
        montañaRusaService.updateMontañaRusa(nombre, montañaRusa);
    }

    @DeleteMapping("/{nombre}")
    public void deleteMontañaRusa(@PathVariable String nombre) {
        montañaRusaService.deleteMontañaRusa(nombre);
    }
}