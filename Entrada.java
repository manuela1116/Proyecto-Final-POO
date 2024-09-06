
package parque_tematico;

public class Entrada {
    private String tipo;
    private float precio;

    public Entrada(String tipo, float precio) {
        this.tipo = tipo;
        this.precio = precio;
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
        return true; // Lógica de validación simplificada
    }

    public void aplicarDescuento(float porcentaje) {
        this.precio -= this.precio * (porcentaje / 100);
    }
}