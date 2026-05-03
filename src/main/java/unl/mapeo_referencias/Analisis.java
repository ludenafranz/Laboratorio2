package unl.mapeo_referencias;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Analisis {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> lista = new ArrayList<>();

        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);

        int capacidadPrevia = 0;
        int elementos = 10_000_000;

        System.out.printf("%-15s | %-15s | %-15s%n", "Tamaño Actual", "Capacidad Real", "Latencia (ns)");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < elementos; i++) {
            long inicio = System.nanoTime();
            lista.add(i);
            long fin = System.nanoTime();
            long latencia = fin - inicio;

            Object[] elementData = (Object[]) field.get(lista);
            int capacidadActual = elementData.length;

            if (capacidadActual > capacidadPrevia) {
                System.out.printf("%-15d | %-15d | %-15d%n", i + 1, capacidadActual, latencia);
                capacidadPrevia = capacidadActual;
            }
        }

        System.out.println("Proceso terminado. Revisa JVisualVM.");
        Thread.sleep(200000);
    }
}