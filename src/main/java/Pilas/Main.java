
package Pilas;

import java.util.Arrays;

/**
 *
 * @author JAN
 */
public class Main {
    public static void main(String[] args) {
        
        Pila pila = new Pila();
        Fideos fideo1 = new Fideos("Fideo1", "01/01/2020");
        Fideos fideo2 = new Fideos("Fideo2", "01/02/2020");
        Fideos fideo3 = new Fideos("Fideo3", "01/03/2020");
        Fideos fideo4 = new Fideos("Fideo4", "01/04/2020");
        Fideos fideo5 = new Fideos("Fideo5", "01/05/2020");
        
        //Agregamos elementos a la Pila
        pila.push(fideo1);
        pila.push(fideo2);
        pila.push(fideo3);
        pila.push(fideo4);
        pila.push(fideo5);

        //Mostramos el tamaño de la Pila e Imprimimos sus elementos
        System.out.println("El tamaño de la Pila: " + pila.size());
        pila.imprimir();
        
        //Eliminamos un elemento de la Pila
        pila.pop();
        System.out.println("El tamaño de la Pila: " + pila.size());
        pila.imprimir();
        
        System.out.println("");
        
        //Imprimimos la Pila de manera inversa
        pila.reverse();
        pila.imprimir();
        
        //Verificamos el elemento buscado se encuentra en la Pila
        System.out.println("El fideo se encuentra?: " + pila.contains(fideo5));
        
        //Convertimos la Pila en un Arreglo
        Fideos[] arrayFideos = pila.toArray();
        System.out.println("Array resultante: " + Arrays.toString(arrayFideos));
        
        //Limpiamos la Pila
        pila.clear();
        System.out.println("El tamaño de la Pila: " + pila.size());
    }
}
