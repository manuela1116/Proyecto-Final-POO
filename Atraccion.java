
package parque_tematico;

import java.util.List;

public class Atraccion {
    private String nombre;
    private int capacidad;
    private float duracion;
    private float costoMantenimiento;
    private List<Recurso> recursos;

    public Atraccion(String nombre, int capacidad, float duracion, float costoMantenimiento) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.duracion = duracion;
        this.costoMantenimiento = costoMantenimiento;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public float getCostoMantenimiento() {
        return costoMantenimiento;
    }

    public void setCostoMantenimiento(float costoMantenimiento) {
        this.costoMantenimiento = costoMantenimiento;
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }
    
    // Otros metodos
    public void iniciarAtraccion(String tiempo_actual, String condiciones_climaticas) {
        System.out.println("Iniciando atracción " + this.nombre + " a las " + tiempo_actual + " con clima: " + condiciones_climaticas);
    }

    public float calcularIngresos(int visitantes_totales, float descuento) {
        return visitantes_totales * (costoMantenimiento - descuento);
    }
}