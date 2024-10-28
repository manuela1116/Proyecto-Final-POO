package com.simulador.demo.service;

import com.simulador.demo.model.Material;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MaterialService {
    private List<Material> materiales = new ArrayList<>();

    public List<Material> getAllMateriales() {
        return materiales;
    }

    public Material getMaterialByNombre(String nombre) {
        return materiales.stream().filter(m -> m.getNombre().equals(nombre)).findFirst().orElse(null);
    }

    public void addMaterial(Material material) {
        materiales.add(material);
    }

    public void updateMaterial(String nombre, Material material) {
        for (int i = 0; i < materiales.size(); i++) {
            Material m = materiales.get(i);
            if (m.getNombre().equals(nombre)) {
                materiales.set(i, material);
                return;
            }
        }
    }

    public void deleteMaterial(String nombre) {
        materiales.removeIf(m -> m.getNombre().equals(nombre));
    }
}