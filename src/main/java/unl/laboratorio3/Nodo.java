package unl.laboratorio3;

// Estructura base del Nodo
class Nodo {
    PuntoOptimizacion dato;
    Nodo siguiente;
    public Nodo(PuntoOptimizacion p) {
        this.dato = p;
        this.siguiente = null;
    }
}

