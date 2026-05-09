package unl.investigacion;

public class ListaDobleEnlazada {
    private NodoDoble primero;
    private NodoDoble ultimo;
    private NodoDoble reproduciendoActual;

    public void agregar(Actividad c) {
        NodoDoble nuevo = new NodoDoble(c);
        if (primero == null) {
            primero = ultimo = reproduciendoActual = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
    }

    public Actividad siguienteVideo() {
        if (reproduciendoActual != null && reproduciendoActual.getSiguiente() != null) {
            reproduciendoActual = reproduciendoActual.getSiguiente();
            return reproduciendoActual.getData();
        }
        return null;
    }

    public Actividad videoAnterior() {
        if (reproduciendoActual != null && reproduciendoActual.getAnterior() != null) {
            reproduciendoActual = reproduciendoActual.getAnterior();
            return reproduciendoActual.getData();
        }
        return null;
    }

    public NodoDoble getPrimero() {
        return primero;
    }

    public void setPrimero(NodoDoble primero) {
        this.primero = primero;
    }

    public NodoDoble getReproduciendoActual() {
        return reproduciendoActual;
    }

    public void setReproduciendoActual(NodoDoble reproduciendoActual) {
        this.reproduciendoActual = reproduciendoActual;
    }

    public NodoDoble getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoDoble ultimo) {
        this.ultimo = ultimo;
    }
}
