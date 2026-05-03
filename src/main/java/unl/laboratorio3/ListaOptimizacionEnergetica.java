package unl.laboratorio3;

public class ListaOptimizacionEnergetica {
    private Nodo cabecera;

    public void insertarAlInicio(PuntoOptimizacion p) {
        Nodo nuevo = new Nodo(p);
        nuevo.siguiente = cabecera;
        cabecera = nuevo;
    }


    public void insertarAlFinal(PuntoOptimizacion p){

    }
    public void mostrarLista(){

    }

}