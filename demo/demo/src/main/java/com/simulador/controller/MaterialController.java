package com.simulador.controller;

import com.simulador.demo.model.Material;
import com.simulador.demo.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materiales")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping
    public List<Material> getAllMateriales() {
        return materialService.getAllMateriales();
    }

    @GetMapping("/{nombre}")
    public Material getMaterial(@PathVariable String nombre) {
        return materialService.getMaterialByNombre(nombre);
    }

    @PostMapping
    public void addMaterial(@RequestBody Material material) {
        materialService.addMaterial(material);
    }

    @PutMapping("/{nombre}")
    public void updateMaterial(@PathVariable String nombre, @RequestBody Material material) {
        materialService.updateMaterial(nombre, material);
    }

    @DeleteMapping("/{nombre}")
    public void deleteMaterial(@PathVariable String nombre) {
        materialService.deleteMaterial(nombre);
    }
}