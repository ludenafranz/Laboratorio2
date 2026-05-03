package unl.laboratorio3;

public class PruebaSistema {
    public static void main(String[] args) {

        ListaOptimizacionEnergetica lista = new ListaOptimizacionEnergetica();

        System.out.println("=== 1. PRUEBA DE INSERCIÓN AL INICIO ===");

        lista.insertarAllnicio(new PuntoOptimizacion(10, 150.5, "Sensor Norte"));

        lista.insertarAllnicio(new PuntoOptimizacion(5, 200.0, "Sensor Principal"));
        lista.mostrarLista();

        System.out.println("\n=== 2. PRUEBA DE INSERCIÓN AL FINAL ===");

        lista.insertarAlFinal(new PuntoOptimizacion(20, 310.2, "Sensor Sur"));
        lista.mostrarLista();

        System.out.println("\n=== 3. PRUEBA DE BÚSQUEDA (TAREA 3) ===");
        int idABuscar = 10;
        System.out.println("Buscando sensor con ID: " + idABuscar + "...");


        PuntoOptimizacion encontrado = lista.buscarPorId(idABuscar);

        if (encontrado != null) {
            System.out.println("ÉXITO: Se encontró el punto: " + encontrado);
        } else {
            System.out.println("ERROR: El sensor no existe en la lista.");
        }

        System.out.println("\n=== 4. PRUEBA DE BÚSQUEDA FALLIDA ===");
        int idInexistente = 99;
        System.out.println("Buscando sensor inexistente (ID: " + idInexistente + ")...");

        PuntoOptimizacion noEncontrado = lista.buscarPorId(idInexistente);

        if (noEncontrado == null) {
            System.out.println("✅ CORRECTO: El sistema confirmó que el ID " + idInexistente + " no existe.");
        }
    }
}