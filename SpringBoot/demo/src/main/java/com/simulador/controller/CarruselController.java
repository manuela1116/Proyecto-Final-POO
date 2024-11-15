package com.simulador.controller;

import com.simulador.demo.model.Carrusel;
import com.simulador.demo.service.CarruselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carruseles")
public class CarruselController {

    @Autowired
    private CarruselService carruselService;

    @GetMapping
    public List<Carrusel> getAllCarruseles() {
        return carruselService.getAllCarruseles();
    }

    @GetMapping("/{nombre}")
    public Carrusel getCarrusel(@PathVariable String nombre) {
        return carruselService.getCarruselByNombre(nombre);
    }

    @PostMapping
    public void addCarrusel(@RequestBody Carrusel carrusel) {
        carruselService.addCarrusel(carrusel);
    }

    @PutMapping("/{nombre}")
    public void updateCarrusel(@PathVariable String nombre, @RequestBody Carrusel carrusel) {
        carruselService.updateCarrusel(nombre, carrusel);
    }

    @DeleteMapping("/{nombre}")
    public void deleteCarrusel(@PathVariable String nombre) {
        carruselService.deleteCarrusel(nombre);
    }
}