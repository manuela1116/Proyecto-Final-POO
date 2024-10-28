package com.simulador.demo.model;

public class Material extends Recurso {
    private String tipoMaterial;

    public Material(String nombre, float costo, String tipoMaterial) {
        super(nombre, costo);
        this.tipoMaterial = tipoMaterial;
    }

    // Getters y Setters
    public String getTipoMaterial() {

        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {

        this.tipoMaterial = tipoMaterial;
    }

    // otros metodos
    @Override
    public void utilizar() {
        System.out.println("Material " + this.getNombre() + " de tipo " + tipoMaterial + " está siendo utilizado.");
    }
}