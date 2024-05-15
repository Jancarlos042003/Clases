
package ListasEnlazadas;

/**
 *
 * @author JAN
 */
public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        System.out.println("La lista esta vacia?: " + lista.estaVacia());
        
        lista.agregarAlInicio("Soy el primer Nodo");
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar("Soy el ultimo nodo");
        
        System.out.println("La lista esta vacia?: " + lista.estaVacia());
        System.out.println("El tamaño de la lista enlazada es: " + lista.largo());
        lista.eliminar(2);
        System.out.println("El nuevo valor en el indice 2 es: " + lista.obtener(2));
        System.out.println("Nuevo tamaño: " + lista.largo());
        
        lista.cortar(2);
        System.out.println("Nuevo tamaño de la lista: " + lista.largo());
    }
}
