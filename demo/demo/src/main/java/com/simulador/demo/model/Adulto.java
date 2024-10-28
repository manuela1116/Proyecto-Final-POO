package com.simulador.demo.model;

public class Adulto extends Visitante {

    public Adulto(String nombre, int edad, float dinero) {

        super(nombre, edad, dinero);
    }

    @Override
    public void montarAtraccion(Atraccion atraccion) {
        System.out.println("Adulto " + this.getNombre() + " montando en atracción: " + atraccion.getNombre());
    }

}