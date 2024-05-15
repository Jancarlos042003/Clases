
package Pilas;

/**
 *
 * @author JAN
 */
public class NodoPila {
    private Fideos valor;
    private NodoPila siguiente;

    public NodoPila(Fideos valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public Fideos getValor() {
        return valor;
    }

    public void setValor(Fideos valor) {
        this.valor = valor;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }

    
}
