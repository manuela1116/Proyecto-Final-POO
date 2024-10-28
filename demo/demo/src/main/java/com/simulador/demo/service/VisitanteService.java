package com.simulador.demo.service;

import com.simulador.demo.model.Visitante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VisitanteService {
    private List<Visitante> visitantes = new ArrayList<>();

    public List<Visitante> getAllVisitantes() {
        return visitantes;
    }

    public Visitante getVisitanteById(int id) {
        return visitantes.stream().filter(visitante -> visitante.getId() == id).findFirst().orElse(null);
    }

    public Visitante addVisitante(Visitante visitante) {
        visitantes.add(visitante);
        return visitante;
    }

    public Visitante updateVisitante(int id, Visitante updateVisitante) {
        Visitante visitante = getVisitanteById(id);
        if (visitante != null) {
            visitante.setNombre(updateVisitante.getNombre());
            visitante.setEdad(updateVisitante.getEdad());
            visitante.setDinero(updateVisitante.getDinero());
        }
        return visitante;
    }

    public void deleteVisitante(int id) {
        visitantes.removeIf(visitante -> visitante.getId() == id);
    }
}