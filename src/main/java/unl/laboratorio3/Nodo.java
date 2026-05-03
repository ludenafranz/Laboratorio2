package unl.laboratorio3;

public class Nodo {
    private PuntoOptimizacion dato;
    Nodo siguiente;

    public Nodo (PuntoOptimizacion p){
        this.dato = p;
        this.siguiente = null;
    }

    public PuntoOptimizacion getDato() {
        return dato;
    }

    public void setDato(PuntoOptimizacion dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

