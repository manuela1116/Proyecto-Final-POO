package com.simulador.demo.model;

public class Empleado extends Recurso {
    private String cargo;

    public Empleado(String nombre, float costo, String cargo) {
        super(nombre, costo);
        this.cargo = cargo;
    }

    // Getters y Setters
    public String getCargo() {

        return cargo;
    }

    public void setCargo(String cargo) {

        this.cargo = cargo;
    }

    // otros metodos
    @Override
    public void utilizar() {
        System.out.println("Empleado " + getNombre() + " con cargo " + cargo + " está trabajando.");
    }
}