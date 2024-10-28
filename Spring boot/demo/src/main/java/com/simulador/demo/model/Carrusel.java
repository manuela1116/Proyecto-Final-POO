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
    public void iniciarAtraccion(String tiempo_actual, String condiciones_climaticas) {
        System.out.println("Iniciando Carrusel con " + numeroDeCaballos + " caballos");
    }

    @Override
    public float calcularIngresos(int visitantes_totales, float descuento) {
        return super.calcularIngresos(visitantes_totales, descuento) + (visitantes_totales * 2);
    }
}