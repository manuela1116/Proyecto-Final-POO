package com.simulador.demo.service;

import com.simulador.demo.model.Atraccion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AtraccionService {
    private List<Atraccion> atracciones = new ArrayList<>();

    public List<Atraccion> getAllAtracciones() {
        return atracciones;
    }

    public Atraccion getAtraccionById(int id) {
        return atracciones.stream().filter(atraccion -> atraccion.getId() == id).findFirst().orElse(null);
    }

    public Atraccion addAtraccion(Atraccion atraccion) {
        atracciones.add(atraccion);
        return atraccion;
    }

    public Atraccion updateAtraccion(int id, Atraccion updatedAtraccion) {
        Atraccion atraccion = getAtraccionById(id);
        if (atraccion != null) {
            atraccion.setNombre(updatedAtraccion.getNombre());
            atraccion.setCapacidad(updatedAtraccion.getCapacidad());
            atraccion.setDuracion(updatedAtraccion.getDuracion());
            atraccion.setCostoMantenimiento(updatedAtraccion.getCostoMantenimiento());
        }
        return atraccion;
    }

    public void deleteAtraccion(int id) {
        atracciones.removeIf(atraccion -> atraccion.getId() == id);
    }
}
