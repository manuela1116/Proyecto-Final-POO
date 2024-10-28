package com.simulador.demo.service;

import com.simulador.demo.model.Parque;
import com.simulador.demo.model.Atraccion;
import com.simulador.demo.model.Visitante;
import com.simulador.demo.model.Recurso;
import com.simulador.demo.model.Entrada;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParqueService {
    private List<Parque> parques = new ArrayList<>();

    public List<Parque> getAllParques() {
        return parques;
    }

    public Parque getParqueById(int id) {
        return parques.stream().filter(parque -> parque.getId() == id).findFirst().orElse(null);
    }

    public Parque addParque(Parque parque) {
        parques.add(parque);
        return parque;
    }

    public Parque updateParque(int id, Parque updatedParque) {
        Parque parque = getParqueById(id);
        if (parque != null) {
            parque.setNombre(updatedParque.getNombre());
            parque.setUbicacion(updatedParque.getUbicacion());
        }
        return parque;
    }

    public void deleteParque(int id) {
        parques.removeIf(parque -> parque.getId() == id);
    }

    public void addAtraccionToParque(int parqueId, Atraccion atraccion) {
        Parque parque = getParqueById(parqueId);
        if (parque != null) {
            parque.agregarAtraccion(atraccion);
        }
    }

    public void addVisitanteToParque(int parqueId, Visitante visitante) {
        Parque parque = getParqueById(parqueId);
        if (parque != null) {
            parque.registrarVisitante(visitante);
        }
    }

    public void addRecursoToParque(int parqueId, Recurso recurso) {
        Parque parque = getParqueById(parqueId);
        if (parque != null) {
            parque.agregarRecurso(recurso);
        }
    }

    public void addEntradaToParque(int parqueId, Entrada entrada) {
        Parque parque = getParqueById(parqueId);
        if (parque != null) {
            parque.venderEntrada(entrada);
        }
    }
}