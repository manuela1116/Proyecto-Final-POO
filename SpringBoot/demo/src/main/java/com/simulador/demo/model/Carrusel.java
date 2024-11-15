package com.simulador.demo.model;

public class Carrusel extends Atraccion {
    private int numeroDeCaballos;

    public Carrusel(String nombre, int capacidad, float duracion, float costoMantenimiento, int numeroDeCaballos) {
        super(nombre, capacidad, duracion, costoMantenimiento);
        this.numeroDeCaballos = numeroDeCaballos;
    }

    // Getters y Setters
    public int getNumeroDeCaballos() {

        return numeroDeCaballos;
    }

    public void setNumeroDeCaballos(int numeroDeCaballos) {

        this.numeroDeCaballos = numeroDeCaballos;
    }

    // otros metodos
    @Override
    public void iniciar() {
        System.out.println("Carrusel iniciad0 con adrenalina alta.");
    }

    @Override
    public void detener() {
        System.out.println("Carrusel detenido.");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Mantenimiento de Carrusel en progreso.");
    }
}