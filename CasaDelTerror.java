
package parque_tematico;

public class CasaDelTerror extends Atraccion {
    private int nivelDeMiedo;

    public CasaDelTerror(String nombre, int capacidad, float duracion, float costoMantenimiento, int nivelDeMiedo) {
        super(nombre, capacidad, duracion, costoMantenimiento);
        this.nivelDeMiedo = nivelDeMiedo;
    }

    // Getters y Setters
    public int getNivelDeMiedo() {
        return nivelDeMiedo;
    }

    public void setNivelDeMiedo(int nivelDeMiedo) {
        this.nivelDeMiedo = nivelDeMiedo;
    }
    
    // otros metodos
    @Override
    public void iniciarAtraccion(String tiempo_actual, String condiciones_climaticas) {
        System.out.println("Iniciando Casa del Terror con nivel de miedo: " + nivelDeMiedo);
    }

    @Override
    public float calcularIngresos(int visitantes_totales, float descuento) {
        return super.calcularIngresos(visitantes_totales, descuento) + (visitantes_totales * nivelDeMiedo);
    }
}