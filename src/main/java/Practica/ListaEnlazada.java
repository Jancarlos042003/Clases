
package Practica;

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
    
    public void añadir(Object obj){
        Nodo nuevoNodo = new Nodo(obj);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {            
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
        size++;
    }
    
    public void añadirAlInicio(Object obj){
        Nodo nuevoNodo = new Nodo(obj);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            nuevoNodo.siguiente = temp;
            cabeza = nuevoNodo;
        }
        size++;
    }
    
    /*public void eliminar(int index){
        if (index < 0 || cabeza == null) {
            return;
        } 
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
            anterior = cabeza;
            contador++;
        }
        
        if (actual == null) {
            return;
        }   
        
        anterior.siguiente = actual.siguiente;
        size--;
    }
    
    public void cortar(int index){  
        if (index < 0 || index >= size) {
            return; 
        }
        if (index == 0) {
            eliminar(0);
            size = 0;
            return;
        }
        
        Nodo temp = cabeza;
        int contador = 0;
        while (temp != null && contador != index - 1) {            
            temp = temp.siguiente;
            contador++;
        }
        
        if (temp == null) {
            return;
        }
        
        temp.siguiente = null;
        size = index;
    }*/
    
    public Cliente buscar(String ruc){ 
        Nodo temp = cabeza;
        
        while (temp != null) {    
            Cliente clienteEncontrado = (Cliente) temp.valor;
            if (clienteEncontrado.ruc.compareTo(ruc) == 0){
                return clienteEncontrado;
            }
            temp = temp.siguiente;
        }
        
        return null;
    }
    
    public boolean eliminar(String ruc){
        Nodo temp = cabeza;
        
        while (temp != null) {            
            Cliente clienteEncontrado = (Cliente) temp.valor;
            if(clienteEncontrado.ruc.compareTo(ruc) == 0){
                temp.siguiente = temp.siguiente.siguiente;
                size--;
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }
    
    /*public Cliente obtener(int index){
        Nodo temp = cabeza;
        int contador = 0;
        
        while (temp != null && contador != index) {
            Cliente clienteObtenido = (Cliente) temp.valor;
            if () {
                
            }
        }
        return temp.valor;
    }*/
}