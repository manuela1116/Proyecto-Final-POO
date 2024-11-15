package com.simulador.demo.model;

public class Niño extends Visitante {

    public Niño(String nombre, int edad, float dinero) {

        super(nombre, edad, dinero);
    }

    @Override
    public void ingresarParque() {
        System.out.println("El niño ha ingresado al parque.");
    }

    @Override
    public void salirParque() {
        System.out.println("El niño ha salido del parque.");
    }

    @Override
    public void comprarEntrada() {
        System.out.println("El niño ha comprado una entrada.");
    }
}