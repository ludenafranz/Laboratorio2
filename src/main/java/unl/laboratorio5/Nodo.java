package unl.laboratorio5;



public class Nodo {
    private Carga data;
    private Nodo siguiente;
    private Nodo anterior;
    public Nodo(Carga data) {
        this.data = data;
        this.siguiente = null;
        this.anterior = null;
    }

    public Carga getData() {
        return data;
    }

    public void setData(Carga data) {
        this.data = data;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
