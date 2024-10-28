package com.simulador.controller;

import com.simulador.demo.model.Empleado;
import com.simulador.demo.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public List<Empleado> getAllEmpleados() {
        return empleadoService.getAllEmpleados();
    }

    @GetMapping("/{nombre}")
    public Empleado getEmpleado(@PathVariable String nombre) {
        return empleadoService.getEmpleadoByNombre(nombre);
    }

    @PostMapping
    public void addEmpleado(@RequestBody Empleado empleado) {
        empleadoService.addEmpleado(empleado);
    }

    @PutMapping("/{nombre}")
    public void updateEmpleado(@PathVariable String nombre, @RequestBody Empleado empleado) {
        empleadoService.updateEmpleado(nombre, empleado);
    }

    @DeleteMapping("/{nombre}")
    public void deleteEmpleado(@PathVariable String nombre) {
        empleadoService.deleteEmpleado(nombre);
    }
}