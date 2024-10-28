package com.simulador.demo.service;

import com.simulador.demo.model.Entrada;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EntradaService {
    private List<Entrada> entradas = new ArrayList<>();

    public List<Entrada> getAllEntradas() {
        return entradas;
    }

    public Entrada getEntradaById(int id) {
        return entradas.stream().filter(entrada -> entrada.getId() == id).findFirst().orElse(null);
    }

    public Entrada addEntrada(Entrada entrada) {
        entrada.setId(entradas.size() + 1);
        entradas.add(entrada);
        return entrada;
    }

    public Entrada updateEntrada(int id, Entrada updatedEntrada) {
        Entrada entrada = getEntradaById(id);
        if (entrada != null) {
            entrada.setTipo(updatedEntrada.getTipo());
            entrada.setPrecio(updatedEntrada.getPrecio());
        }
        return entrada;
    }

    public void deleteEntrada(int id) {
        entradas.removeIf(entrada -> entrada.getId() == id);
    }
}