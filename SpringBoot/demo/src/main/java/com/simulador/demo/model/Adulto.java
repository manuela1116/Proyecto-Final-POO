package com.simulador.demo.model;

public class Adulto extends Visitante {

    public Adulto(String nombre, int edad, float dinero) {

        super(nombre, edad, dinero);
    }

    @Override
    public void ingresarParque() {
        System.out.println("El adulto ha ingresado al parque.");
    }

    @Override
    public void salirParque() {
        System.out.println("El adulto ha salido del parque.");
    }

    @Override
    public void comprarEntrada() {
        System.out.println("El adulto ha comprado una entrada.");
    }
}