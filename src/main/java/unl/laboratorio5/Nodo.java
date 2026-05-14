package unl.laboratorio5;

public class Nodo {
    private Carga data;
    private Nodo siguiente;

    public Nodo() {
    }

    public Nodo(Carga data) {
        this.data = data;
        this.siguiente = null;
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

}
