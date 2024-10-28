package com.simulador.demo.service;

import com.simulador.demo.model.CasaDelTerror;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CasaDelTerrorService {
    private List<CasaDelTerror> casasDelTerror = new ArrayList<>();

    public List<CasaDelTerror> getAllCasasDelTerror() {
        return casasDelTerror;
    }

    public CasaDelTerror getCasaDelTerrorByNombre(String nombre) {
        return casasDelTerror.stream().filter(cdt -> cdt.getNombre().equals(nombre)).findFirst().orElse(null);
    }

    public void addCasaDelTerror(CasaDelTerror casaDelTerror) {
        casasDelTerror.add(casaDelTerror);
    }

    public void updateCasaDelTerror(String nombre, CasaDelTerror casaDelTerror) {
        for (int i = 0; i < casasDelTerror.size(); i++) {
            CasaDelTerror cdt = casasDelTerror.get(i);
            if (cdt.getNombre().equals(nombre)) {
                casasDelTerror.set(i, casaDelTerror);
                return;
            }
        }
    }

    public void deleteCasaDelTerror(String nombre) {
        casasDelTerror.removeIf(cdt -> cdt.getNombre().equals(nombre));
    }
}