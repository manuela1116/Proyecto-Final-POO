
package parque_tematico;

public abstract class Recurso {
    private String nombre;
    private float costo;

    public Recurso(String nombre, float costo) {
        this.nombre = nombre;
        this.costo = costo;
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