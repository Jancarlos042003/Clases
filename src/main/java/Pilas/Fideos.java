
package Pilas;

/**
 *
 * @author JAN
 */
public class Fideos {
    private String nombre;
    private String fechaVencimiento;

    public Fideos(String nombre, String fechaVencimiento) {
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    
}
