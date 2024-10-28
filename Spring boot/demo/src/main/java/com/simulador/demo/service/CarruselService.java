package com.simulador.demo.service;

import com.simulador.demo.model.Carrusel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarruselService {
    private List<Carrusel> carruseles = new ArrayList<>();

    public List<Carrusel> getAllCarruseles() {
        return carruseles;
    }

    public Carrusel getCarruselByNombre(String nombre) {
        return carruseles.stream().filter(c -> c.getNombre().equals(nombre)).findFirst().orElse(null);
    }

    public void addCarrusel(Carrusel carrusel) {
        carruseles.add(carrusel);
    }

    public void updateCarrusel(String nombre, Carrusel carrusel) {
        for (int i = 0; i < carruseles.size(); i++) {
            Carrusel c = carruseles.get(i);
            if (c.getNombre().equals(nombre)) {
                carruseles.set(i, carrusel);
                return;
            }
        }
    }

    public void deleteCarrusel(String nombre) {
        carruseles.removeIf(c -> c.getNombre().equals(nombre));
    }
}