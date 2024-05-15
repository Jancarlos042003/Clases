
package Pilas;

/**
 *
 * @author JAN
 */
public class Pila {
    private NodoPila cima;
    private int largo;

    public Pila() {
        this.cima = null;
        this.largo = 0;
    }

    
    //Obtener el tamaño de la Pila
    public int size(){
        return largo;
    }
    
    //Limpiar la Pila
    public void clear(){
        cima = null;
        largo = 0;
    }
    
    //Agregar un nuevo elemento a la Pila
    public void push(Fideos nuevoFideo){
        NodoPila nuevoNodo = new NodoPila(nuevoFideo);
        if (cima == null) {
            cima = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(cima);
            cima = nuevoNodo;
        }
        largo++;
    }
    
    //Eliminar un elemento de la Pila
    public void pop(){
        if (cima == null){ 
            System.out.println("La pila está vacía, no se puede eliminar ningún elemento.");
            return;
        }  
        
        cima = cima.getSiguiente();
        largo--;
    }
    
    //Imprimir los elementos de la pila
    public void imprimir(){
        NodoPila temp = cima;
        Fideos contenidoFideos;
        int contador = largo;
        
        while (contador != 0) {
            contenidoFideos = (Fideos) temp.getValor();
            System.out.println(contenidoFideos.getNombre()+" "+contenidoFideos.getFechaVencimiento());
            temp = temp.getSiguiente();
            contador--;
        }
    }
    
    //Verificar si un elemento se encuetra en la Pila
    public boolean contains(Fideos fideo){
        NodoPila temp = cima;
        while (temp != null) {
            if (temp.getValor().equals(fideo)) {
                return true;
            }
            temp = temp.getSiguiente();
        }
        return false;
    }
    
    public Fideos[] toArray(){
        NodoPila temp = cima;
        Fideos[] array = new Fideos[largo];
        
        for (int i = 0; i < largo; i++) {
            array[i] = (Fideos) temp.getValor();
            temp = temp.getSiguiente();
        }
        
        return array;
    }
    
    public void reverse(){
        NodoPila prev = null;
        NodoPila current = cima;
        NodoPila next = null;
        
        while(current != null){
            next = current.getSiguiente();
            current.setSiguiente(prev);//Esto es lo que invierte el orden de los enlaces
            prev = current;
            current = next;
        }
        cima = prev;
    }
}