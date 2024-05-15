
package com.mycompany.clasesdecadasemana;

/**
 *
 * @author JAN
 */
public class ClasesDeCadaSemana {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        
        lista.agregarAlInicio("Primer Nodo");
        lista.agregar(2);
        lista.agregarAlInicio("Nodo antes del primer Nodo");
        
        System.out.println("Tamaño de la lista: " + lista.largo());
        System.out.println(lista.buscar("Primer Nodo"));
    }
}
