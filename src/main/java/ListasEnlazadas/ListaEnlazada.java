
package ListasEnlazadas;

/**
 *
 * @author JAN
 */
public class ListaEnlazada{
    Nodo cabeza;
    int size;
    
    public ListaEnlazada(){
        this.cabeza = null;
        size = 0;
    }
    
    //Método para saber si la lista esta vacía o no
    public boolean estaVacia(){
        return (cabeza == null);// ? true : false
    }
    
    
    //Método para contar el tamaño de la lista
    public int largo(){
        return size;
    }
    
    //Método para agregar un elemento al inicio de la lista
    public void agregarAlInicio(Object obj){
        Nodo nuevoNodo = new Nodo(obj);
        
        Nodo temp = cabeza;
        nuevoNodo.siguiente = temp;
        cabeza = nuevoNodo;      
        
        size++;
    }
    
    //Método para agregar un elemento al final de la lista
    public void agregar(Object obj){
        Nodo nuevoNodo = new Nodo(obj);
        if(cabeza == null){
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza; // 'actual': variable temporal
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
        size++;
    }
    
    //Método para obtener el valor de un Nodo
    public Object obtener(int index){
        if (index<0) {
            System.out.println("Índice negativo no válido");
        }
        Nodo temp = cabeza;
        for (int i = 0; i < index; i++) {
            temp = temp.siguiente;
        }
        return temp.valor;
    }
    
    //Método para eliminar un Nodo
    public void eliminar(int index){
        if (index < 0 || cabeza == null) { //Significa que no se puede eliminar si el índice es negativo o la lista está vacía
            return;
        }
        
        //Si index es 0, significa que se eliminará el primer nodo
        if (index == 0) {
            cabeza = cabeza.siguiente;
            size--;
            return;
        }
        
        Nodo anterior = null;
        Nodo actual = cabeza;
        int contador = 0;
        
        //Bucle para encontrar el index
        while (actual != null && contador != index) {            
            anterior = actual;
            actual = actual.siguiente;
            contador++;
        }
        
        if (actual == null) { //Significa que el indice(index) no fue encontrado
            return;
        }
        
        // Elimina el nodo en el índice dado

        anterior.siguiente = actual.siguiente;
        size--;
    } 
    
    //Método para buscar el valor de un Nodo
    public boolean buscar(Object valorBuscado){
        Nodo temp = cabeza;
        while (temp.siguiente != null) {
            if (temp.valor == valorBuscado) {
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }
    
    //Método para cortar una lista enlazada
    public void cortar(int index){
        Nodo temp = cabeza;
        for (int i = 0; i < index - 1; i++) {
            temp = cabeza.siguiente;
        }
        temp.siguiente = null;
        size = index;
    }
}
    