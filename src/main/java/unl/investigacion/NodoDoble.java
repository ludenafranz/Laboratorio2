package unl.investigacion;

public class NodoDoble {
    private Actividad data;
    private NodoDoble siguiente;
    private NodoDoble anterior;

    public NodoDoble(Actividad data) {
        this.data = data;
        this.siguiente = null;
        this.anterior = null;
    }

    public Actividad getData() {
        return data;
    }

    public void setData(Actividad data) {
        this.data = data;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "NodoDoble{ " + (data != null ? data.toString() : "vacío") + " }";
    }
}
