package com.simulador.demo.service;

import com.simulador.demo.model.Recurso;
import com.simulador.demo.model.Empleado;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecursoService {
    private List<Recurso> recursos = new ArrayList<>();

    public List<Recurso> getAllRecursos() {
        return recursos;
    }

    public Recurso getRecursoById(int id) {
        return recursos.stream().filter(recurso -> recurso.getId() == id).findFirst().orElse(null);
    }

    public Recurso addRecurso(Recurso recurso) {
        recurso.setId(recursos.size() + 1);
        recursos.add(recurso);
        return recurso;
    }

    public Recurso updateRecurso(int id, Recurso updatedRecurso) {
        Recurso recurso = getRecursoById(id);
        if (recurso != null) {
            recurso.setNombre(updatedRecurso.getNombre());
            recurso.setCosto(updatedRecurso.getCosto());

            if (recurso instanceof Empleado && updatedRecurso instanceof Empleado) {
                ((Empleado) recurso).setCargo(((Empleado) updatedRecurso).getCargo());
            }
        }
        return recurso;
    }

    public void deleteRecurso(int id) {
        recursos.removeIf(recurso -> recurso.getId() == id);
    }
}