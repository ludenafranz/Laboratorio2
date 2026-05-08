package unl.laboratorio4;

public class NodoFeed {
    private Contenido data;
    private NodoFeed siguiente;
    private NodoFeed anterior;
    public NodoFeed(Contenido data) {
        this.data = data;
        this.siguiente = null;
        this.anterior = null;
    }

    public Contenido getData() {
        return data;
    }

    public void setData(Contenido data) {
        this.data = data;
    }

    public NodoFeed getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoFeed siguiente) {
        this.siguiente = siguiente;
    }

    public NodoFeed getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoFeed anterior) {
        this.anterior = anterior;
    }
}
