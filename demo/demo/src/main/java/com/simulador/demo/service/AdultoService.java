package com.simulador.demo.service;

import com.simulador.demo.model.Adulto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdultoService {
    private List<Adulto> adultos = new ArrayList<>();

    public List<Adulto> getAllAdultos() {
        return adultos;
    }

    public Adulto getAdultoByNombre(String nombre) {
        return adultos.stream().filter(a -> a.getNombre().equals(nombre)).findFirst().orElse(null);
    }

    public void addAdulto(Adulto adulto) {
        adultos.add(adulto);
    }

    public void updateAdulto(String nombre, Adulto adulto) {
        for (int i = 0; i < adultos.size(); i++) {
            Adulto a = adultos.get(i);
            if (a.getNombre().equals(nombre)) {
                adultos.set(i, adulto);
                return;
            }
        }
    }

    public void deleteAdulto(String nombre) {
        adultos.removeIf(a -> a.getNombre().equals(nombre));
    }
}