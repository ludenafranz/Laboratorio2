package unl.laboratorio4;

public class GreenFeedPlayer {
    private NodoFeed primero;
    private NodoFeed ultimo;
    private NodoFeed reproduciendoActual;

    public void agregarAlFeed(Contenido c) {
        NodoFeed nuevo = new NodoFeed(c);
        if (primero == null) {
            primero = ultimo = reproduciendoActual = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
    }

    public Contenido siguienteVideo() {
        if (reproduciendoActual != null && reproduciendoActual.getSiguiente() != null) {
            reproduciendoActual = reproduciendoActual.getSiguiente();
            return reproduciendoActual.getData();
        }
        return null;
    }

    public Contenido videoAnterior() {
        if (reproduciendoActual != null && reproduciendoActual.getAnterior() != null) {
            reproduciendoActual = reproduciendoActual.getAnterior();
            return reproduciendoActual.getData();
        }
        return null;
    }

    public NodoFeed getPrimero() {
        return primero;
    }

    public void setPrimero(NodoFeed primero) {
        this.primero = primero;
    }

    public NodoFeed getReproduciendoActual() {
        return reproduciendoActual;
    }

    public void setReproduciendoActual(NodoFeed reproduciendoActual) {
        this.reproduciendoActual = reproduciendoActual;
    }

    public NodoFeed getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoFeed ultimo) {
        this.ultimo = ultimo;
    }
}
