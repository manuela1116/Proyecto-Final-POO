
package parque_tematico;

public class Visitante {
    private String nombre;
    private int edad;
    private float dinero;

    public Visitante(String nombre, int edad, float dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
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
    public void comprarEntrada(Entrada entrada) {
        if (this.dinero >= entrada.getPrecio()) {
            this.dinero -= entrada.getPrecio();
            System.out.println(nombre + " ha comprado una entrada de tipo " + entrada.getTipo());
        } else {
            System.out.println(nombre + " no tiene suficiente dinero para comprar la entrada.");
        }
    }

    public void montarAtraccion(Atraccion atraccion) {
        System.out.println(nombre + " está montando en " + atraccion.getNombre());
    }

    public void gastarDinero(float monto) {
        this.dinero -= monto;
    }
}