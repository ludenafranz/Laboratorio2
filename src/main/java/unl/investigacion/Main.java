package unl.investigacion;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nSIMULACIÓN DE 1,000,000 DE ELEMENTOS\n");
        int simulacion = 1000000;

        ListaDobleEnlazada actividades = new ListaDobleEnlazada();
        System.out.println("Creando lista con 1,000,000 de actividades...");
        long startTime = System.nanoTime();

        for (int i = 1; i <= simulacion; i++) {
            Actividad video = new Actividad(
                    "Actividad " + i,
                    240,
                    i % 5 == 0 ? "Alta" : "Baja"
            );
            actividades.agregar(video);
        }

        long endTime = System.nanoTime();

        System.out.println("Lista creada exitosamente");
        System.out.println("Tiempo: " + (endTime - startTime)/1000000 + " ms\n");

        System.out.println("ANÁLISIS: CICLOS DE INSTRUCCIÓN                             \n");

        System.out.println("Navegacion en diferentes escenarios...");

        System.out.println("\nESCENARIO 1: Navegación desde el inicio (O(n))\n");

        actividades.setReproduciendoActual(actividades.getPrimero());
        System.out.println( "Actividad inicial: "+actividades.getPrimero().toString()+"\n");

        long ciclosSinAnterior = 0;
        int retrocesos = 100000;

        startTime = System.nanoTime();
        for (int i = 0; i < simulacion - retrocesos; i++) {
            actividades.siguienteVideo();
            ciclosSinAnterior++;

        }
        endTime = System.nanoTime();

        long tiempoSinAnteriorReal = (endTime - startTime) / 1000000;

        System.out.println("        Operación: Buscar desde primero hasta posición n-1");
        System.out.println("        Complejidad: O(n) - recorrer toda la lista");
        System.out.println("        Ciclos totales: " + String.format("%,d", ciclosSinAnterior));
        System.out.println("        Tiempo estimado: " + String.format("%,d", tiempoSinAnteriorReal) + " ms\n");

        System.out.println("ESCENARIO 2: CON puntero 'anterior' (O(1))\n");

        System.out.println( "Actividad final: "+actividades.getUltimo().toString()+"\n");

        long ciclosConAnterior = 0;

        startTime = System.nanoTime();
        for (int i = 0; i < retrocesos; i++) {
            actividades.videoAnterior();
            ciclosConAnterior++;
        }
        endTime = System.nanoTime();
        long tiempoConAnterior = (endTime - startTime) / 1000000;

        System.out.println("        Complejidad: O(1) - acceso directo al nodo previo");
        System.out.println("        Ciclos totales: " + String.format("%,d", ciclosConAnterior));
        System.out.println("        Ciclos por operación: 1");
        System.out.println("        Tiempo real: " + tiempoConAnterior + " ms\n");



        System.out.println("\n       RESULTADO: CICLOS AHORRADOS                              \n");

        long ahorroCiclos = ciclosSinAnterior - ciclosConAnterior;
        double mejora = (double) ciclosSinAnterior / ciclosConAnterior;
        double porcentajeAhorro = ((double) ahorroCiclos / ciclosSinAnterior) * 100;

        System.out.println("        CICLOS AHORRADOS: " + String.format("%,d", ahorroCiclos));
        System.out.println("        PORCENTAJE DE AHORRO: " + String.format("%.4f%%", porcentajeAhorro));
        System.out.println("        MEJORA DE RENDIMIENTO: " + String.format("%,.1fx más rápido", mejora));
        System.out.println("        TIEMPO AHORRADO: " + String.format("%,d ms", tiempoSinAnteriorReal - tiempoConAnterior) + "\n");

    }
}