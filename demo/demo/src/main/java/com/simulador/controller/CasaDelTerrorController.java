package com.simulador.controller;

import com.simulador.demo.model.CasaDelTerror;
import com.simulador.demo.service.CasaDelTerrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/casasdelterror")
public class CasaDelTerrorController {

    @Autowired
    private CasaDelTerrorService casaDelTerrorService;

    @GetMapping
    public List<CasaDelTerror> getAllCasasDelTerror() {
        return casaDelTerrorService.getAllCasasDelTerror();
    }

    @GetMapping("/{nombre}")
    public CasaDelTerror getCasaDelTerror(@PathVariable String nombre) {
        return casaDelTerrorService.getCasaDelTerrorByNombre(nombre);
    }

    @PostMapping
    public void addCasaDelTerror(@RequestBody CasaDelTerror casaDelTerror) {
        casaDelTerrorService.addCasaDelTerror(casaDelTerror);
    }

    @PutMapping("/{nombre}")
    public void updateCasaDelTerror(@PathVariable String nombre, @RequestBody CasaDelTerror casaDelTerror) {
        casaDelTerrorService.updateCasaDelTerror(nombre, casaDelTerror);
    }

    @DeleteMapping("/{nombre}")
    public void deleteCasaDelTerror(@PathVariable String nombre) {
        casaDelTerrorService.deleteCasaDelTerror(nombre);
    }
}