package com.simulador.demo.model;
import com.simulador.interfaces.VisitanteInteractivo;


public class Visitante implements VisitanteInteractivo {
    private static int idCounter = 0;
    private int id;
    private String nombre;
    private int edad;
    private float dinero;

    public Visitante(String nombre, int edad, float dinero) {
        this.id = idCounter++;
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public int getId() {
        return id;
    }

    // Getters y Setters
    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public int getEdad() {

        return edad;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public float getDinero() {

        return dinero;
    }

    public void setDinero(float dinero) {

        this.dinero = dinero;
    }

    // otros metodos
    @Override
    public void ingresarParque() {
        System.out.println(nombre + " ha ingresado al parque.");
    }

    @Override
    public void salirParque() {
        System.out.println(nombre + " ha salido del parque.");
    }

    @Override
    public void comprarEntrada() {
        System.out.println(nombre + " ha comprado una entrada.");
    }
}