package com.simulador.demo.service;

import com.simulador.demo.model.Niño;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NiñoService {
    private List<Niño> niños = new ArrayList<>();

    public List<Niño> getAllNiños() {
        return niños;
    }

    public Niño getNiñoByNombre(String nombre) {
        return niños.stream().filter(n -> n.getNombre().equals(nombre)).findFirst().orElse(null);
    }

    public void addNiño(Niño niño) {
        niños.add(niño);
    }

    public void updateNiño(String nombre, Niño niño) {
        for (int i = 0; i < niños.size(); i++) {
            Niño n = niños.get(i);
            if (n.getNombre().equals(nombre)) {
                niños.set(i, niño);
                return;
            }
        }
    }

    public void deleteNiño(String nombre) {
        niños.removeIf(n -> n.getNombre().equals(nombre));
    }
}