package unl.laboratorio3;

public class ListaOptimizacionEnergetica {
    private Nodo cabecera;
    public void insertarAllnicio(PuntoOptimizacion p){
        Nodo nuevo = new Nodo(p);
        nuevo.siguiente = cabecera;
        cabecera = nuevo;
    }
    public void insertarAlFinal(PuntoOptimizacion p){
        Nodo nuevo = new Nodo(p);
        if (cabecera == null){
            cabecera = nuevo;
        } else {
            Nodo temp = cabecera;
            while (temp.siguiente != null){
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }
    public void mostrarLista (){
        Nodo temp = cabecera;
        while (temp != null){
            System.out.println(temp.getDato());
            temp = temp.getSiguiente();
        }
    }

    public PuntoOptimizacion buscarPorId(int id) {
        Nodo temporal = cabecera;
        while (temporal != null) {
            if (temporal.getDato().getId() == id) {
                return temporal.getDato(); // Retorna el objeto encontrado
            }
            temporal = temporal.siguiente;
        }
        return null; // No se encontró
    }

}