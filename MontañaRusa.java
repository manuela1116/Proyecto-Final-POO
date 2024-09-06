
package parque_tematico;

public class MontañaRusa extends Atraccion {
    private float alturaMaxima;
    private float velocidadMaxima;

    public MontañaRusa(String nombre, int capacidad, float duracion, float costoMantenimiento, float alturaMaxima, float velocidadMaxima) {
        super(nombre, capacidad, duracion, costoMantenimiento);
        this.alturaMaxima = alturaMaxima;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Getters y Setters
    public float getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(float alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    // otros metodos
    @Override
    public void iniciarAtraccion(String tiempo_actual, String condiciones_climaticas) {
        System.out.println("Iniciando Montaña Rusa a las " + tiempo_actual + " con velocidad máxima de: " + velocidadMaxima + " km/h");
    }

    @Override
    public float calcularIngresos(int visitantes_totales, float descuento) {
        return super.calcularIngresos(visitantes_totales, descuento) + (visitantes_totales * 5); // Ingresos adicionales
    }
} 
