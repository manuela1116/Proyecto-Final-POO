package com.simulador.demo.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Empleado.class, name = "empleado")
})

public abstract class Recurso {
    private int id;
    private String nombre;
    private float costo;

    public Recurso(String nombre, float costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getters y Setters
    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public float getCosto() {

        return costo;
    }

    public void setCosto(float costo) {

        this.costo = costo;
    }

    // otros metodos
    public abstract void utilizar();
}