package unl.laboratorio5;


public class ColaEnergia {
    private Nodo frente;
    private Nodo ultimo;
    private int contador;

    // Insertar al final (Rear)
    public void encolar(Carga p) {
        Nodo nuevo = new Nodo(p);
        if (ultimo != null) {
            ultimo.setSiguiente(nuevo);
        }
        ultimo = nuevo;
        if (frente == null) {
            frente = nuevo;
        }
        contador++;
    }

    // Atender al inicio (Front)
    public Carga desencolar() {
        if (frente == null) return null;
        Carga p = frente.getData();
        frente = frente.getSiguiente();
        if (frente == null) ultimo = null;
        contador--;
        return p;
    }

    public boolean isEmpy(){
        if (contador == 0){
            return true;
        }
        return false;
    }

    public Nodo getFrente() {
        return frente;
    }

    public void setFrente(Nodo frente) {
        this.frente = frente;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }


}
