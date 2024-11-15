package com.simulador.demo.model;

public class Entrada {
    private int id;
    private String tipo;
    private float precio;

    public Entrada(int id ,String tipo, float precio) {
        this.id = id;
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getters y Setters
    public String getTipo() {

        return tipo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public float getPrecio() {

        return precio;
    }

    public void setPrecio(float precio) {

        this.precio = precio;
    }

    // otros metodos
    public boolean validarEntrada() {

        return true;
    }

    public void aplicarDescuento(float porcentaje) {

        this.precio -= this.precio * (porcentaje / 100);
    }
}