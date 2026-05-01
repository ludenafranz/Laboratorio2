package unl.mapeo_referencias;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Analisis {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> lista = new ArrayList<>();

        int capacidadActual = 0;
        int elementos = 100;

        System.out.printf("%-15s | %-20s | %-15s%n", "Elementos", "Nueva Capacidad", "Latencia (ns)");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < elementos; i++) {
            long inicio = System.nanoTime();
            lista.add(i);
            long fin = System.nanoTime();

            if (i == capacidadActual ) {

                int oldcapacidad = capacidadActual;

                if (capacidadActual == 0){
                    capacidadActual = 10;
                } else {
                    //formulas usada por java para aumentar la capacidad de un arreglo dinámico
                    capacidadActual = oldcapacidad + (oldcapacidad >> 1);
                }

                System.out.println("Capacidad anterior: " + oldcapacidad);

                System.out.printf("%-15d | %-20d | %-15d%n", i + 1, capacidadActual,(fin - inicio));
            } else {
                System.out.printf("%-15d | %-20d | %-15d%n", i + 1, capacidadActual, (fin - inicio));
            }
        }
    }
}
