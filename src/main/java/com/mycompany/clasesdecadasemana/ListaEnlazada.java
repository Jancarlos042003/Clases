
package com.mycompany.clasesdecadasemana;

/**
 *
 * @author JAN
 */
public class ListaEnlazada {
    Nodo cabeza;
    int size;

    public ListaEnlazada() {
        this.cabeza = null;
        size = 0;
    }
    
    public boolean estaVacia(){
        return cabeza == null;
    }
    
    public int largo(){
        return size;
    }
    
    public void agregarAlInicio(Object obj){
        Nodo nuevoNodo = new Nodo(obj);
        
        Nodo temp = cabeza;
        nuevoNodo.siguiente = temp;
        cabeza = nuevoNodo;      
        
        size++;
    }
    
    public void agregar(Object obj){
        Nodo nuevoNodo = new Nodo(obj);
        
        //Se está agregando un nodo a una lista vacía
        if (cabeza == null) {
            cabeza = nuevoNodo;
        }
        Nodo temp = cabeza;
        while (temp.siguiente != null) {            
            temp = temp.siguiente;
        }
        temp.siguiente = nuevoNodo;
        size++;
    }
    
    public void eliminar(int index){
        //El índice es negativo o indica que la lista esta vacía
        if (index < 0 || cabeza == null) {
            return;
        }
        
        //Se va a eliminar el primer nodo
        if (index == 0) {
            cabeza = cabeza.siguiente;
            size--;
            return;
        }
        
        Nodo actual = cabeza;
        Nodo anterior = null;
        int contador = 0;
        
        while (actual != null && contador != index) {            
            actual = actual.siguiente;
            anterior = actual;
            contador++;
        }
        
        //Significa que el índice no fue encontrado
        if (actual == null) {
            return;
        }
        
        //Se produce la eliminacion del nodo indicado
        anterior.siguiente = actual.siguiente;
        size--;
    }
    
    public void cortar(int index){
        Nodo temp = cabeza;
        if (index <= 0 || index >= size) {
            return; // Índice fuera de rango o lista vacía
        }
        for (int i = 0; i < index - 1; i++) {
            temp = temp.siguiente;
        }
        temp.siguiente = null;
        size = index;
    }
    
    public Object obtener(int index){
        if (index < 0) {
            System.out.println("Ingresar un índice válido");
        }
        
        Nodo temp = cabeza;
        for (int i = 0; i < index; i++) {
            temp = temp.siguiente;   
        }

        return temp.valor;
    }
    
    public boolean buscar(Object valorBuscado){
        Nodo temp = cabeza;
        while (temp != null) {  
            if (temp.valor.equals(valorBuscado)) {
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }
}
