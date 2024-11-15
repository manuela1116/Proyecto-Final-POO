package com.simulador.demo.model;

public class MontañaRusa extends Atraccion {
    private float alturaMaxima;
    private float velocidadMaxima;

    public MontañaRusa(String nombre, int capacidad, float duracion, float costoMantenimiento, float alturaMaxima, float velocidadMaxima) {
        super(nombre, capacidad, duracion, costoMantenimiento);
        this.alturaMaxima = alturaMaxima;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Getters y Setters
    public float getAlturaMaxima() {

        return alturaMaxima;
    }

    public void setAlturaMaxima(float alturaMaxima) {

        this.alturaMaxima = alturaMaxima;
    }

    public float getVelocidadMaxima() {

        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {

        this.velocidadMaxima = velocidadMaxima;
    }

    // otros metodos
    @Override
    public void iniciar() {
        System.out.println("Montaña Rusa iniciada con adrenalina alta.");
    }

    @Override
    public void detener() {
        System.out.println("Montaña Rusa detenida.");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Mantenimiento de Montaña Rusa en progreso.");
    }
}