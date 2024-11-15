package com.simulador.demo.model;

public class CasaDelTerror extends Atraccion {
    private int nivelDeMiedo;

    public CasaDelTerror(String nombre, int capacidad, float duracion, float costoMantenimiento, int nivelDeMiedo) {
        super(nombre, capacidad, duracion, costoMantenimiento);
        this.nivelDeMiedo = nivelDeMiedo;
    }

    // Getters y Setters
    public int getNivelDeMiedo() {

        return nivelDeMiedo;
    }

    public void setNivelDeMiedo(int nivelDeMiedo) {

        this.nivelDeMiedo = nivelDeMiedo;
    }

    // otros metodos
    @Override
    public void iniciar() {
        System.out.println("Casa del Terror iniciada con adrenalina alta.");
    }

    @Override
    public void detener() {
        System.out.println("Casa del Terror detenida.");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Mantenimiento de Casa del Terror en progreso.");
    }
}