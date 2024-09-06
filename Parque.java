
package parque_tematico;

import java.util.ArrayList;
import java.util.List;

public class Parque {
    private String nombre;
    private String ubicacion;
    private List<Atraccion> atracciones;
    private List<Recurso> recursos;
    private List<Visitante> visitantes;
    private List<Entrada> entradasVendidas;

    public Parque(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.atracciones = new ArrayList<>();
        this.recursos = new ArrayList<>();
        this.visitantes = new ArrayList<>();
        this.entradasVendidas = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Atraccion> getAtracciones() {
        return atracciones;
    }

    public void setAtracciones(List<Atraccion> atracciones) {
        this.atracciones = atracciones;
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }

    public List<Visitante> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(List<Visitante> visitantes) {
        this.visitantes = visitantes;
    }

    public List<Entrada> getEntradasVendidas() {
        return entradasVendidas;
    }

    public void setEntradasVendidas(List<Entrada> entradasVendidas) {
        this.entradasVendidas = entradasVendidas;
    }
    
    // Otros metodos 
    public void agregarAtracción(Atraccion atraccion) {
        this.atracciones.add(atraccion);
    }

    public void agregarRecurso(Recurso recurso) {
        this.recursos.add(recurso);
    }

    public void registrarVisitante(Visitante visitante) {
        this.visitantes.add(visitante);
    }

    public void venderEntrada(Entrada entrada) {
        this.entradasVendidas.add(entrada);
    }

    public void gestionarOperaciones() {
        System.out.println("Gestionando operaciones del parque " + this.nombre);
    }

}