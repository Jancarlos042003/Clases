
package Practica;

/**
 *
 * @author JAN
 */
public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        
        System.out.println("Está vacía?: " + lista.estaVacia());
        System.out.println("Tamaño: " + lista.largo());
        
        Cliente c1 = new Cliente("1", "Jan", "Tuñoque", true);
        Cliente c2 = new Cliente("2", "Brayan", "Tuñoque", false);
        Cliente c3 = new Cliente("3", "Manuel", "Tuñoque", false);
        Cliente c4 = new Cliente("4", "Olga", "Tuñoque", true);
        Cliente c5 = new Cliente("5", "Victor", "Tuñoque", false);
        
        lista.añadir(c1);
        lista.añadir(c2);
        lista.añadir(c3);
        lista.añadir(c4);
        lista.añadir(c5);
        
        System.out.println("Tamaño: " + lista.largo());
        
        System.out.println("Ruc buscado: " + lista.buscar("5").nombre);
        
        System.out.println("Elimanr el ruc 2:" + lista.eliminar("2"));
        System.out.println("Tamaño: " + lista.largo());
        
        System.out.println("Elimanr el ruc 4:" + lista.eliminar("4"));
        System.out.println("Tamaño: " + lista.largo());
    }   
}
