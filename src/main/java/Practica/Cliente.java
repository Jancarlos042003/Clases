
package Practica;

/**
 *
 * @author JAN
 */
public class Cliente {
    String ruc;
    String nombre;
    String apellido;
    boolean esClienteFrecuente;

    public Cliente(String ruc, String nombre, String apellido, boolean esClienteFrecuente) {
        this.ruc = ruc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.esClienteFrecuente = esClienteFrecuente;
    }
}
