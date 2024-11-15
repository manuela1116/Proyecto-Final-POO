package com.simulador.demo.service;

import com.simulador.demo.model.MontañaRusa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MontañaRusaService {
    private List<MontañaRusa> montañasRusas = new ArrayList<>();

    public List<MontañaRusa> getAllMontañasRusas() {
        return montañasRusas;
    }

    public MontañaRusa getMontañaRusaByNombre(String nombre) {
        return montañasRusas.stream().filter(mr -> mr.getNombre().equals(nombre)).findFirst().orElse(null);
    }

    public void addMontañaRusa(MontañaRusa montañaRusa) {
        montañasRusas.add(montañaRusa);
    }

    public void updateMontañaRusa(String nombre, MontañaRusa montañaRusa) {
        for (int i = 0; i < montañasRusas.size(); i++) {
            MontañaRusa mr = montañasRusas.get(i);
            if (mr.getNombre().equals(nombre)) {
                montañasRusas.set(i, montañaRusa);
                return;
            }
        }
    }

    public void deleteMontañaRusa(String nombre) {
        montañasRusas.removeIf(mr -> mr.getNombre().equals(nombre));
    }
}