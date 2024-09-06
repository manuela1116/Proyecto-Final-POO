
package parque_tematico;

public class Niño extends Visitante {
    
    public Niño(String nombre, int edad, float dinero) {
        super(nombre, edad, dinero);
    }

    @Override
    public void montarAtraccion(Atraccion atraccion) {
        System.out.println("Niño " + this.getNombre() + " montando en atracción: " + atraccion.getNombre());
    } 
}