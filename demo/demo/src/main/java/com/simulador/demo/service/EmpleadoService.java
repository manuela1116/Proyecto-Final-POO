package com.simulador.demo.service;

import com.simulador.demo.model.Empleado;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService {
    private List<Empleado> empleados = new ArrayList<>();

    public List<Empleado> getAllEmpleados() {
        return empleados;
    }

    public Empleado getEmpleadoByNombre(String nombre) {
        return empleados.stream().filter(e -> e.getNombre().equals(nombre)).findFirst().orElse(null);
    }

    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void updateEmpleado(String nombre, Empleado empleado) {
        for (int i = 0; i < empleados.size(); i++) {
            Empleado e = empleados.get(i);
            if (e.getNombre().equals(nombre)) {
                empleados.set(i, empleado);
                return;
            }
        }
    }

    public void deleteEmpleado(String nombre) {
        empleados.removeIf(e -> e.getNombre().equals(nombre));
    }
}